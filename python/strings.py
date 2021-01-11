# -*- coding: utf-8 -*-
#substring
mesaj = "Merhaba dünya"
print(mesaj[2:5])
yeniMesaj = mesaj[12:13]
print(yeniMesaj)
#stringlerde metinin ilk harfi "0" dan başlar

#len = bir fonksiyondur. Metinin uzunluğunu verir. Örneğin 
print(len(mesaj))
yenimesaj2 = mesaj[len(mesaj)-1:len(mesaj)]
print(yenimesaj2)

#Lower Upper
print(mesaj.upper())
print(mesaj.lower())

#replace (büyük küçük harfleri değiştirmek için)
#mesaj=mesaj.replace("ü","u")
print(mesaj.replace("ü", "u"))
print(mesaj)

print(mesaj.replace("a", "e"))


#split ve strip

bilgi= "Şahincan Özbakır 26 Antalya".strip()
print(bilgi.split())
print("Adı=" +bilgi.split()[0])

#input
ad =input("Adınız ?")
sayı1 = input("Sayı 1 =?")
sayı2 = input("Sayı 2 =?")
print(int(sayı1) + int(sayı2))



