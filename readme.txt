keytool -genkey -v -keystore fakeap-release-key.keystore -alias fakeap -keyalg RSA -keysize 2048 -validity 1000000

jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore fakeap-release-key.keystore app-fakeap.aab fakeap

zipalign -v 4 app-fakeap.aab app-fakeap-release.aab

key store alias: fakeap
keystore password: fakeap
keystore passphrase: fakeap
