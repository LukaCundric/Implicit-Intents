
# Implicit Intents

## Opis

Implicit Intents je preprosta Android aplikacija, izdelana v Android Studiu s programskim jezikom Java. Projekt je nastal v okviru naloge pri predmetu Razvoj mobilnih aplikacij. Namen projekta je spoznati uporabo implicitnih namenov (Implicit Intents) v Android aplikacijah ter njihovo uporabo za povezovanje aplikacije z drugimi aplikacijami na napravi.

Aplikacija omogoča odpiranje spletnih strani, iskanje lokacij na zemljevidu in deljenje besedila z drugimi aplikacijami. Pri tem uporablja razred Intent, s katerim Androidu sporoči, katero dejanje želi uporabnik izvesti, operacijski sistem pa poišče ustrezno aplikacijo za izvedbo tega dejanja.

## Funkcionalnosti

- **Open Website** – omogoča odpiranje spletne strani v spletnem brskalniku. Uporabnik vnese spletni naslov, aplikacija pa ga odpre s pomočjo implicitnega namena `Intent.ACTION_VIEW`.
- **Open Location** – omogoča iskanje lokacije na zemljevidu. Uporabnik vnese kraj ali naslov, aplikacija pa ga odpre v aplikaciji za zemljevide s pomočjo URI-ja `geo:0,0?q=`.
- **Share This Text** – omogoča deljenje vnesenega besedila z drugimi aplikacijami, kot so Gmail, Messages ali druge aplikacije za komunikacijo.
- **Preverjanje razpoložljivosti aplikacij** – pred zagonom druge aplikacije se z metodo `resolveActivity()` preveri, ali obstaja aplikacija, ki lahko izvede zahtevano dejanje.
- **Uporabniški vmesnik** – vsebuje tri vnosna polja in tri gumbe za izvajanje posameznih funkcionalnosti.

## Uporabljene tehnologije

- Java
- XML
- Android Studio
- Implicit Intents
- Intent
- Intent.ACTION_VIEW
- Uri
- Uri.parse()
- Uri.encode()
- resolveActivity()
- ShareCompat.IntentBuilder
- LinearLayout
- ConstraintLayout
- EditText
- Button

## Navodila za uporabo

1. Zaženi aplikacijo.
2. V prvo vnosno polje vnesi spletni naslov, na primer `https://www.youtube.com`.
3. Klikni gumb **OPEN WEBSITE** za odpiranje spletne strani v brskalniku.
4. V drugo vnosno polje vnesi lokacijo, na primer `Nova Gorica, Slovenija`.
5. Klikni gumb **OPEN LOCATION** za prikaz lokacije v aplikaciji za zemljevide.
6. V tretje vnosno polje vnesi poljubno besedilo, ki ga želiš deliti.
7. Klikni gumb **SHARE THIS TEXT**.
8. Izberi aplikacijo, prek katere želiš deliti besedilo.

## Izgled aplikacije

Spodaj so prikazani posnetki zaslona aplikacije in njenih posameznih funkcionalnosti.

## Cilj naloge

Cilj naloge je bil izdelati Android aplikacijo, ki uporablja implicitne namene za izvajanje različnih dejanj zunaj same aplikacije. Pri tem sem uporabil `Intent.ACTION_VIEW` za odpiranje spletnih strani in lokacij na zemljevidu ter `ShareCompat.IntentBuilder` za deljenje besedila z drugimi aplikacijami. Spoznal sem tudi uporabo URI-jev, metode `resolveActivity()` in preverjanje razpoložljivosti aplikacij za izvedbo posameznih dejanj.

