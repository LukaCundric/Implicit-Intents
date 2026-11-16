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
4. V drugo vnosno polje vnesi lokacijo, na primer `School Centre Nova Gorica`.
5. Klikni gumb **OPEN LOCATION** za prikaz lokacije v aplikaciji za zemljevide.
6. V tretje vnosno polje vnesi poljubno besedilo, ki ga želiš deliti, npr. `Sharing text`.
7. Klikni gumb **SHARE THIS TEXT**.
8. Izberi aplikacijo, prek katere želiš deliti besedilo.

## Izgled aplikacije

Spodaj so prikazani posnetki zaslona aplikacije in njenih posameznih funkcionalnosti.


<table>
  <tr>
    <td align="center" width="50%">
      <img width="220" alt="Implicit_Intents1" src="https://github.com/user-attachments/assets/7b398533-9478-4f69-9eb7-5308eb089917" />
      <br><b>OPEN WEBSITE</b>
    </td>
    <td align="center" width="50%">
      <img width="220" alt="Implicit_Intents2" src="https://github.com/user-attachments/assets/af8c87bd-4b63-4d66-953c-17fb321f7d55" />
      <br><b>https://google.com</b>
    </td>
  </tr>

  <tr>
    <td align="center" width="50%">
      <img width="220" alt="Implicit_Intents3" src="https://github.com/user-attachments/assets/546dc1be-5fb3-4a5c-9710-55e76db325e6" />
      <br><b>OPEN LOCATION</b>
    </td>
    <td align="center" width="50%">
      <img width="220" alt="Implicit_Intents4" src="https://github.com/user-attachments/assets/97192389-b6d2-41ee-a360-723313a85c92" />
      <br><b>School Centre Nova Gorica</b>
    </td>
  </tr>

  <tr>
    <td align="center" width="50%">
      <img width="220" alt="Implicit_Intents5" src="https://github.com/user-attachments/assets/285614f0-b019-4970-a746-fcb0547527c0" />
      <br><b>SHARE THIS TEXT</b>
    </td>
    <td align="center" width="50%">
      <img width="220" alt="Implicit_Intents6" src="https://github.com/user-attachments/assets/cafc7272-36a4-4a5a-a738-7d9de424d8ce" />
      <br><b>Sharing Text</b>
    </td>
  </tr>
</table>


## Cilj naloge

Cilj naloge je bil izdelati Android aplikacijo, ki uporablja implicitne namene za izvajanje različnih dejanj zunaj same aplikacije. Pri tem sem uporabil `Intent.ACTION_VIEW` za odpiranje spletnih strani in lokacij na zemljevidu ter `ShareCompat.IntentBuilder` za deljenje besedila z drugimi aplikacijami. Spoznal sem tudi uporabo URI-jev, metode `resolveActivity()` in preverjanje razpoložljivosti aplikacij za izvedbo posameznih dejanj.

## Kaj sem se naučil?

- Uporabljati implicitne namene (Implicit Intents) v Android aplikacijah.
- Uporabljati razred Intent za povezovanje aplikacije z drugimi aplikacijami.
- Odpirati spletne strani s pomočjo `Intent.ACTION_VIEW`.
- Odpirati lokacije na zemljevidu z uporabo URI-ja `geo:0,0?q=`.
- Uporabljati metodi `Uri.parse()` in `Uri.encode()`.
- Preverjati razpoložljivost aplikacij z metodo `resolveActivity()`.
- Deliti besedilo z uporabo razreda `ShareCompat.IntentBuilder`.
- Uporabljati `findViewById()` za povezovanje elementov uporabniškega vmesnika z Java kodo.
- Ustvarjati uporabniške vmesnike s pomočjo XML in gradnikov `EditText` ter `Button`.

## Avtor

Luka Cundrič
