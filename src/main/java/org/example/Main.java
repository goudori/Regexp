package org.example;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 課題 :正規表現を沢山使う。 1.Listにランダムな文字列を30個ほど入れてください。
 * 2.その文字列のリストに対して、「数字だけを抜き出す正規表現」と「文字だけを抜き出す正規表現」を試してください。 3.実際にあっているか、確認して下さい。
 * 4.それが出来たら、文字列を抜き出す時に、英数字の大文字だけを抜き出してください。 5.それが出来たら、漢字、カタカナ、ひらがなの日本語にマッチする正規表現を書いて、抜き出してください。
 * 6.それが出来たら、英数字以外の文字列を抜き出す正規表現にチャレンジしてみてください。
 */
public class Main {


  public static void main(String[] args) {
    List<String> randamList = List.of("tamanegi", "123", "和太鼓", "けんごろう", "醸造重徳",
        "JOHON", "KAI", "759", "NORFO", "7", "ふみたろう", "999", "Natarou", "JJJ123", "Ben",
        "こん", "D", "natoutarou", "新之助", "恵雨", "8255555", "1", "SUDOU", "Gotou", "ryuuzi",
        "りゅう", "KOUJIHEI", "カゴシマタロウ", "リョウコ", "ソウリダイジン");

    // 文字列の値の数を確認する。
    System.out.println("文字列の値の数は、" + randamList.size() + "個");

    // 同じ文字列の数値だけを抜き出す正規表現の書き方
    Pattern patternSameNumber = Pattern.compile("(\\d)\\1+");

    // 違う文字列の数値だけを抜き出す正規表現の書き方
    Pattern patternDifferentNumber = Pattern.compile("(\\d)(?!\1).");

    // 文字列だけを抜き出す正規表現の書き方
    Pattern patternString = Pattern.compile("[^\\d]+");

    // 大文字の英数字だけを抜き出す正規表現の書き方
    Pattern patternBigString = Pattern.compile("[A-Z0-9]+");

    // 漢字、カタカナ、ひらがなの日本語にマッチする正規表現の書き方
    Pattern patternJapanese = Pattern.compile("[\u3040-\u309F\u30A0-\u30FF\u4E00-\u9FAF]+");

    // 英数字以外文字列だけ抜き出す正規表現の書き方
    Pattern patternNonAlphanumeric = Pattern.compile("[^a-zA-Z0-9]+");

    // 同じ文字列の数値の正規表現だけ一致した値だけ繰り返し見つける。
    for (String patternSameValue : randamList) {

      Matcher patternSameMatcher = patternSameNumber.matcher(patternSameValue);

      while (patternSameMatcher.find()) {
        System.out.println(patternSameMatcher.group());
      }


    }

    // 違う文字列の数値の正規表現だけ一致した値だけ繰り返し見つけて表示する。
    for (String patternDifferentValue : randamList) {
      Matcher patternDifferentMatcher = patternDifferentNumber.matcher(patternDifferentValue);
      while (patternDifferentMatcher.find()) {
        System.out.println(patternDifferentMatcher.group());
      }
    }
    // 文字列だけを抜き出す正規表現だけ一致した値だけ繰り返し見つけて表示する。
    for (String patternStrings : randamList) {
      Matcher patternStringsMatcher = patternString.matcher(patternStrings);
      while (patternStringsMatcher.find()) {
        System.out.println("文字列だけの値は、" + patternStringsMatcher.group());
      }
    }

    // 英数字の大文字の文字列だけに一致した値を繰り返し見つけて表示する。
    for (String patternBigsStrings : randamList) {
      Matcher patternBigsMatch = patternBigString.matcher(patternBigsStrings);
      while (patternBigsMatch.find()) {
        System.out.println("英数字の大文字の文字列の値は、" + patternBigsMatch.group());
      }
    }

    //  漢字、カタカナ、ひらがなの日本語にマッチする正規表現の値を繰り返し見つけて表示する。
    for (String patternThreeJapanese : randamList) {
      Matcher patternJapaneseMatch = patternJapanese.matcher(patternThreeJapanese);
      while (patternJapaneseMatch.find()) {
        System.out.println("漢字、カタカナ、ひらがなの日本語の値は、" + patternJapaneseMatch.group());
      }
    }

    // 英数字以外の文字列だけマッチする正規表現の値を繰り返し見つけて表示する。
    for (String patternNonString : randamList) {
      Matcher patternNonStringsMatch = patternNonAlphanumeric.matcher(patternNonString);
      while (patternNonStringsMatch.find()) {
        System.out.println("英数字以外の文字列は、" + patternNonStringsMatch.group());
      }
    }

  }
}

