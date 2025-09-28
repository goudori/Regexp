# 課題
## 正規表現を使って、指定された抜き出しを実装する。
---


## 📌目次
- [はじめに](#はじめに)
- [開発環境](#開発環境)
- [実行方法](#実行方法)
- [プログラムの内容](#プログラムの内容)
- [実行結果](#実行結果)
- [学んだ事](#学んだ事)
- [終わりに](#終わりに)
---



## 📖はじめに
### このプロジェクトは、Java を用いて「正規表現」を行うプログラムです。
---



## 🛠開発環境
- 使用OS:Windows11
- 使用言語:![Java](https://img.shields.io/badge/Java-v21-007396?logo=openjdk&logoColor=white)
- JDK: Windows版のOracle JDK 21.0.8 (LTS)　⚠️LTSサポート有効期間:2026年9月まで
- 使用IDE:IntelliJ IDEA Commnunity Edition(無料版)

---



## 🚀実行方法
・Windowsの場合
「Shift + F10」のキーボードを同時に押して実行して下さい。



・Macの場合
「Control + R 」のキーボードを同時に押して実行して下さい。


---


## 💻プログラムの内容

1.文字列型のリストのrandamListにランダムな文字列の値を30個ほど入れました。

















<img width="945" height="110" alt="スクリーンショット 2025-09-24 215930" src="https://github.com/user-attachments/assets/a76d1c4e-5bb7-4760-9126-e5670881aee1" />



















2.randamListに入っている文字列の値の数が、30個あるかどうかターミナルで、確認します。



















<img width="673" height="57" alt="スクリーンショット 2025-09-24 220035" src="https://github.com/user-attachments/assets/5461b128-2066-4e1e-b96a-ecbeb7bc7590" />










3.最初に、「同じ数字だけを抜き出す正規表現」を書きます。









<img width="659" height="72" alt="スクリーンショット 2025-09-24 220235" src="https://github.com/user-attachments/assets/4d0f7f27-a7c9-4813-8154-da73b954414a" />










4. 「違う数字だけを抜き出す正規表現」を書きます。











<img width="737" height="67" alt="スクリーンショット 2025-09-24 220358" src="https://github.com/user-attachments/assets/f3986204-f3f2-419e-9d7c-d61e55079950" />









5.「文字列だけを抜き出す正規表現」」を書きます。










<img width="591" height="60" alt="スクリーンショット 2025-09-28 080113" src="https://github.com/user-attachments/assets/ea662ab6-3b38-4550-b5dc-7d7c04c4f827" />









 
6.「大文字の英数字だけを抜き出す正規表現」」を書きます。


















<img width="642" height="62" alt="スクリーンショット 2025-09-28 082005" src="https://github.com/user-attachments/assets/44f3530f-34f4-44ad-b86d-786e083ab482" />







































7.「漢字、カタカナ、ひらがなの日本語にマッチする正規表現」を書きます。








<img width="970" height="67" alt="スクリーンショット 2025-09-28 082523" src="https://github.com/user-attachments/assets/c78e9b9a-732c-4e40-9e1d-50090feee8a1" />








8. 「英数字以外文字列だけ抜き出す正規表現」を書きます。










<img width="744" height="81" alt="スクリーンショット 2025-09-28 082745" src="https://github.com/user-attachments/assets/f90e7124-3a7d-49bd-aec3-309343c01174" />











9. 同じ文字列の数値の正規表現だけ一致した値だけ繰り返し見つけるように書きます。













<img width="777" height="310" alt="スクリーンショット 2025-09-28 083148" src="https://github.com/user-attachments/assets/58fdd288-c524-408d-b7fe-8d06caf71231" />








10.





















---
## ✅実行結果
### 

9.














---
## ✍学んだ事
・正規表現に「+」が付いてないと1文字目しか取得できない事が、分かりました。





(例)








<img width="212" height="81" alt="スクリーンショット 2025-09-22 075344" src="https://github.com/user-attachments/assets/3f81fa2c-b073-45ed-8585-8e5f586a8a95" />











・ターミナルで何回も表示される時は、for文の中にfor文が入っているからという事が、分かりました。







・findを使うので、無限ループに陥る事はない事が、分かりました。


---
## 🔚終わりに
これは、Javaの正規表現を使って、基本文法を学習する事を目的としています。
