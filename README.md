# Naloga 3 – HelloConstraint

## Namen naloge

Namen naloge je nadgraditi aplikacijo HelloConstraint v Android Studiu z uporabo Jave in XML. Pri nalogi dodamo nov gumb Zero, uredimo omejitve v postavitvi ConstraintLayout, posodobimo dogodke klika in prilagodimo postavitve za različne orientacije ter velikosti zaslonov.

## Opis naloge

V obstoječo aplikacijo dodamo tretji gumb z imenom **Zero**, ki je postavljen med gumboma Toast in Count. Gumb ima na začetku sivo ozadje in ob kliku ponastavi števec na vrednost 0.

Vsi trije gumbi so postavljeni levo od elementa `show_count` in so navpično enakomerno razporejeni. Postavitev je prilagojena tudi ležeči orientaciji zaslona (`land`) in večjim zaslonom (`xlarge`).

## Funkcionalnosti

- Dodan je nov gumb Zero.
- Gumb Zero ima na začetku sivo ozadje.
- Ob kliku na gumb Zero se števec ponastavi na 0.
- Ob ponastavitvi se ozadje gumba Zero vrne na sivo.
- Gumb Count poveča vrednost števca.
- Barva gumba Count se spreminja glede na to, ali je nova vrednost soda ali liha.
- Ob kliku na Count se spremeni tudi barva ozadja gumba Zero.
- Gumbi so pravilno razporejeni z uporabo omejitev ConstraintLayout.
- Podprti sta tudi postavitvi za ležečo orientacijo in večje zaslone.

## Uporabljene tehnologije

- Java
- XML
- Android Studio
- ConstraintLayout
- Obdelava dogodkov klika (`android:onClick`)
- Prilagajanje postavitev različnim velikostim in orientacijam zaslona
