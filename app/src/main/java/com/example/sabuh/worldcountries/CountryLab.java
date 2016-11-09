package com.example.sabuh.worldcountries;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

import project.sabuhi.com.countries.R;

/**
 * Created by Sabuh on 10/31/2016.
 */

public class CountryLab {

    private ArrayList<Countries> mOlkeler;

    private static CountryLab sCountryLab;
    private Context mAppContext;
    private CountryLab(Context appContext) {
        mAppContext = appContext;
        mOlkeler = new ArrayList<Countries>();


//        Countries abs = new Countries(R.drawable.united_states_of_america_256);
//        abs.setNameOlke("Amerika");
//        mOlkeler.add(abs);

//        for (int i = 0; i < 100; i++) {
//            Countries c = new Countries(0);
//            c.setNameOlke("Crime #" + i);
//
//            mOlkeler.add(c);
//        }



//
        Countries abs = new Countries(R.drawable.united_states_of_america_256);
        Countries ams = new Countries(R.drawable.american_samoa_256);
        Countries anqi = new Countries(R.drawable.anguilla_256);
        Countries alb = new Countries(R.drawable.albania256);
        Countries alm = new Countries(R.drawable.germany_256);
        Countries and = new Countries(R.drawable.andorra_256);
        Countries anq = new Countries(R.drawable.angola_256);
        Countries antbar = new Countries(R.drawable.antigua_and_barbuda_256);
        Countries arg = new Countries(R.drawable.argentina_256);
        Countries avsa = new Countries(R.drawable.australia_256);
        Countries avs= new Countries(R.drawable.austria_256);
        Countries aze = new Countries(R.drawable.azerbaijan_256);
        Countries bah = new Countries(R.drawable.bahamas_256);
        Countries ban = new Countries(R.drawable.bangladesh_256);
        Countries bar = new Countries(R.drawable.barbados_256);
        Countries bel = new Countries(R.drawable.belarus_256);
        Countries belc = new Countries(R.drawable.belgium_256);
        Countries beli= new Countries(R.drawable.belize_256);
        Countries ben = new Countries(R.drawable.benin_256);
        Countries ber = new Countries(R.drawable.bermuda_256);
        Countries bee = new Countries(R.drawable.united_arab_emirates_256);
        Countries beh = new Countries(R.drawable.bahrain_256);
        Countries bol = new Countries(R.drawable.bolivia_256);
        Countries bolq = new Countries(R.drawable.bulgaria_256);
        Countries bos = new Countries(R.drawable.bosnia_and_herzegovina_256);
        Countries bot = new Countries(R.drawable.botswana_256);
        Countries bra = new Countries(R.drawable.brazil_256);
        Countries bru = new Countries(R.drawable.brunei_256);
        Countries bur = new Countries(R.drawable.burkina_faso256);
        Countries buru = new Countries(R.drawable.burundi_256);
        Countries butan = new Countries(R.drawable.bhutan_256);
        Countries car= new Countries(R.drawable.south_africa_256);
        Countries cer = new Countries(R.drawable.jersey_256);
        Countries ceb = new Countries(R.drawable.gibraltar_256);
        Countries cenS = new Countries(R.drawable.south_sudan_256);
        Countries cib = new Countries(R.drawable.djibouti_256);
        Countries cad = new Countries(R.drawable.chad_256);
        Countries cex = new Countries(R.drawable.czech_republic_256);
        Countries cili = new Countries(R.drawable.chile_256);
        Countries cin = new Countries(R.drawable.china_256);
        Countries dan = new Countries(R.drawable.denmark_256);
        Countries dom = new Countries(R.drawable.dominica_256);
        Countries domR = new Countries(R.drawable.dominican_republic_256);
        Countries efi = new Countries(R.drawable.ethiopia_256);
        Countries efir = new Countries(R.drawable.eritrea_256);
        Countries ekv = new Countries(R.drawable.ecuador_256);
        Countries ekva = new Countries(R.drawable.equatorial_guinea_256);
        Countries erm = new Countries(R.drawable.armenia_256);
        Countries est = new Countries(R.drawable.estonia_256);
        Countries efq = new Countries(R.drawable.afghanistan_256);
        Countries elc = new Countries(R.drawable.algeria256);
        Countries far = new Countries(R.drawable.faroe_islands_256);
        Countries fel = new Countries(R.drawable.palestinian_territory_256);
        Countries fil = new Countries(R.drawable.cote_d_ivoire_256);
        Countries fin = new Countries(R.drawable.finland_256);
        Countries fra = new Countries(R.drawable.france_256);
        Countries ger = new Countries(R.drawable.guernsey_256);
        Countries gur = new Countries(R.drawable.georgia_256);
        Countries hai = new Countries(R.drawable.haiti_256);
        Countries hin = new Countries(R.drawable.india_256);
        Countries hol = new Countries(R.drawable.netherlands_256);
        Countries hond = new Countries(R.drawable.honduras_256);
        Countries honk = new Countries(R.drawable.hong_kong_256);
        Countries xor = new Countries(R.drawable.croatia_256);
        Countries ind = new Countries(R.drawable.indonesia_256);
        Countries iraq = new Countries(R.drawable.iraq_256);
        Countries ira = new Countries(R.drawable.iran_256);
        Countries irl = new Countries(R.drawable.ireland_256);
        Countries isl = new Countries(R.drawable.iceland_256);
        Countries isp = new Countries(R.drawable.spain_256);
        Countries isv = new Countries(R.drawable.sweden_256);
        Countries ita = new Countries(R.drawable.italy_256);
        Countries kamb = new Countries(R.drawable.cambodia_256);
        Countries kam = new Countries(R.drawable.cameroon_256);
        Countries kan = new Countries(R.drawable.canada_256);
        Countries kay = new Countries(R.drawable.cayman_islands_256);
        Countries ken = new Countries(R.drawable.kenya_256);
        Countries kir = new Countries(R.drawable.kiribati_256);
        Countries kip = new Countries(R.drawable.cyprus_256);
        Countries kok = new Countries(R.drawable.cocos_islands_256);
        Countries kol = new Countries(R.drawable.colombia_256);
        Countries kom = new Countries(R.drawable.comoros_256);
        Countries konD = new Countries(R.drawable.democratic_republic_of_the_con);
        Countries konR = new Countries(R.drawable.republic_of_the_congo_256);
        Countries korX = new Countries(R.drawable.korea_north_256);
        Countries korR = new Countries(R.drawable.korea_south_256);
        Countries kub = new Countries(R.drawable.cuba_256);
        Countries kuk = new Countries(R.drawable.cook_islands_256);
        Countries kuv = new Countries(R.drawable.kuwait_256);
        Countries qab = new Countries(R.drawable.gabon_256);
        Countries qam = new Countries(R.drawable.gambia_256);
        Countries qar = new Countries(R.drawable.montenegro_256);
        Countries qaz = new Countries(R.drawable.kazakhstan_256);
        Countries qet = new Countries(R.drawable.qatar_256);
        Countries qrena = new Countries(R.drawable.grenada_256);
        Countries qren = new Countries(R.drawable.greenland_256);
        Countries qir = new Countries(R.drawable.kyrgyzstan_256);
        Countries qva = new Countries(R.drawable.guatemala_256);
        Countries qvi = new Countries(R.drawable.guinea_256);
        Countries qviB = new Countries(R.drawable.guinea_bissau_256);
        Countries lao = new Countries(R.drawable.laos_256);
        Countries lat = new Countries(R.drawable.latvia_256);
        Countries les = new Countries(R.drawable.lesotho_256);
        Countries lix = new Countries(R.drawable.liechtenstein_256);
        Countries lit = new Countries(R.drawable.lithuania_256);
        Countries liv = new Countries(R.drawable.libya_256);
        Countries luk = new Countries(R.drawable.luxembourg_256);
        Countries mac = new Countries(R.drawable.hungary_256);
        Countries mad = new Countries(R.drawable.madagascar_256);
        Countries maka = new Countries(R.drawable.macao_256);
        Countries make = new Countries(R.drawable.macedonia_256);
        Countries malav = new Countries(R.drawable.malawi_256);
        Countries malay = new Countries(R.drawable.malaysia_256);
        Countries mald = new Countries(R.drawable.maldives_256);
        Countries mali = new Countries(R.drawable.mali_256);
        Countries malt = new Countries(R.drawable.malta_256);
        Countries mar = new Countries(R.drawable.central_african_republic_256);
        Countries mavrik = new Countries(R.drawable.mauritius_256);
        Countries mavrit = new Countries(R.drawable.mauritania_256);
        Countries may = new Countries(R.drawable.mayotte_256);
        Countries mek = new Countries(R.drawable.mexico_256);
        Countries men = new Countries(R.drawable.isle_of_man_256);
        Countries mer = new Countries(R.drawable.morocco_256);
        Countries mik = new Countries(R.drawable.micronesia_256);
        Countries mis = new Countries(R.drawable.egypt_256);
        Countries mol = new Countries(R.drawable.moldova_256);
        Countries mona = new Countries(R.drawable.monaco_256);
        Countries monq = new Countries(R.drawable.mongolia_256);
        Countries mont = new Countries(R.drawable.montenegro_256);
        Countries moz = new Countries(R.drawable.mozambique_256);
        Countries mya = new Countries(R.drawable.myanmar_256);
        Countries nau = new Countries(R.drawable.nauru_256);
        Countries nam = new Countries(R.drawable.namibia_256);
        Countries nep = new Countries(R.drawable.nepal__256);
        Countries nid = new Countries(R.drawable.netherlands_256);
        Countries nig = new Countries(R.drawable.niger_256);
        Countries nige = new Countries(R.drawable.nigeria_256);
        Countries nik = new Countries(R.drawable.nicaragua_256);
        Countries niu = new Countries(R.drawable.niue_256);
        Countries nor = new Countries(R.drawable.norfolk_island_256);
        Countries norv = new Countries(R.drawable.norway_256);
        Countries oma = new Countries(R.drawable.oman_256);
        Countries ozb = new Countries(R.drawable.uzbekistan_256);
        Countries pak = new Countries(R.drawable.pakistan_256);
        Countries pal = new Countries(R.drawable.palau_256);
        Countries pan = new Countries(R.drawable.panama_256);
        Countries pap = new Countries(R.drawable.papua_new_guinea_256);
        Countries par = new Countries(R.drawable.paraguay_256);
        Countries per = new Countries(R.drawable.peru_256);
        Countries pit = new Countries(R.drawable.pitcairn_islands_256);
        Countries pol = new Countries(R.drawable.poland_256);
        Countries por = new Countries(R.drawable.portugal_256);
        Countries puer = new Countries(R.drawable.puerto_rico_256);
        Countries rua = new Countries(R.drawable.rwanda_256);
        Countries rum = new Countries(R.drawable.romania_256);
        Countries rus = new Countries(R.drawable.russia_256);
        Countries sal = new Countries(R.drawable.el_salvador_256);
        Countries sam = new Countries(R.drawable.samoa_256);
        Countries san = new Countries(R.drawable.san_marino_256);
        Countries sant = new Countries(R.drawable.sao_tome_and_principe_256);
        Countries senb = new Countries(R.drawable.saint_barthelemy_256);
        Countries sene = new Countries(R.drawable.senegal_256);
        Countries senme = new Countries(R.drawable.saint_martin_256);
        Countries senp = new Countries(R.drawable.saint_pierre_and_miquelon_256);
        Countries sentk = new Countries(R.drawable.saint_kitts_and_nevis_256);
        Countries sentl = new Countries(R.drawable.saint_lucia_256);
        Countries sentv = new Countries(R.drawable.saint_vincent_and_the_grenadines_256);
        Countries ser = new Countries(R.drawable.serbia_256);
        Countries sey = new Countries(R.drawable.seychelles_256);
        Countries seu = new Countries(R.drawable.saudi_arabia_256);
        Countries sin = new Countries(R.drawable.singapore_256);
        Countries slova = new Countries(R.drawable.slovakia_256);
        Countries slove = new Countries(R.drawable.slovenia_256);
        Countries sol = new Countries(R.drawable.solomon_islands_256);
        Countries som = new Countries(R.drawable.somalia_256);
        Countries sud = new Countries(R.drawable.sudan_256);
        Countries surin = new Countries(R.drawable.suriname_256);
        Countries suriy = new Countries(R.drawable.syria_256);
        Countries sva = new Countries(R.drawable.swaziland_256);
        Countries sye = new Countries(R.drawable.sierra_leone_256);
        Countries serqt = new Countries(R.drawable.east_timor_256);
        Countries simma = new Countries(R.drawable.northern_mariana_islands_256);
        Countries sri = new Countries(R.drawable.sri_lanka_256);
        Countries tac = new Countries(R.drawable.tajikistan_256);
        Countries tai = new Countries(R.drawable.thailand_256);
        Countries tan = new Countries(R.drawable.tanzania_256);
        Countries tay = new Countries(R.drawable.republic_of_china_256);
        Countries toke = new Countries(R.drawable.tokelau_256);
        Countries toq = new Countries(R.drawable.togo_256);
        Countries ton = new Countries(R.drawable.tonga_256);
        Countries tork = new Countries(R.drawable.turks_and_caicos_islands_256);
        Countries tri = new Countries(R.drawable.trinidad_and_tobago_256);
        Countries tuv = new Countries(R.drawable.tuvalu_256);
        Countries turki = new Countries(R.drawable.turkey_256);
        Countries turkm = new Countries(R.drawable.turkmenistan_256);
        Countries ukr = new Countries(R.drawable.ukraine_256);
        Countries uqa = new Countries(R.drawable.uganda_256);
        Countries uol = new Countries(R.drawable.wallis_and_futuna_256);
        Countries uru = new Countries(R.drawable.uruguay_256);
        Countries van = new Countries(R.drawable.vanuatu_256);
        Countries vat = new Countries(R.drawable.vatican_city_256);
        Countries ven = new Countries(R.drawable.venezuela_256);
        Countries vye = new Countries(R.drawable.vietnam_256);
        Countries yap = new Countries(R.drawable.japan_256);
        Countries yenik = new Countries(R.drawable.new_caledonia_256);
        Countries yeniz= new Countries(R.drawable.new_zealand_256);
        Countries yem= new Countries(R.drawable.yemen_256);
        Countries yun= new Countries(R.drawable.greece_256);
        Countries zam= new Countries(R.drawable.zambia_256);
        Countries zim= new Countries(R.drawable.zimbabwe_256);
////
////
//////
//
//
//
//
//

        abs.setNameOlke("Amerika Birləşmiş Ştatları" );
        abs.setPaytaxt("Vaşinqton DC");
        abs.setImageId(R.drawable.united_states_of_america_640);
        abs.setEhali("311,591,917");
        abs.setErazi("9631420 (Ərazi Reytinqi: 3)");
        abs.setDil("İngilis, İspan");
        abs.setValyuta("Dollar");
        abs.setTelKod(" ");
        abs.setUDM("14,600 milyard");
        abs.setQite("Şimali Amerika");
//
//
        ams.setNameOlke("Amerika Samoası");
        ams.setPaytaxt("Paqo Paqo");
        ams.setImageId(R.drawable.american_samoa_640);
        ams.setEhali("69,543");
        ams.setErazi("199 (Ərazi Reytinqi: 212)");
        ams.setDil("Samoan, İngilis ,Tonqan");
        ams.setValyuta("Dollar");
        ams.setTelKod(" ");
        ams.setUDM("0.334 milyard");
        ams.setQite("Şimali Amerika");
//
        anqi.setNameOlke("Anqilya");
        anqi.setPaytaxt("Valley");
        anqi.setImageId(R.drawable.anguilla_640);
        anqi.setEhali("15,094");
        anqi.setErazi("102 (Ərazi Reytinqi: 216)");
        anqi.setDil("İngilis");
        anqi.setValyuta("Dollar");
        anqi.setTelKod(" ");
        anqi.setUDM("0.286 milyard  ");
        anqi.setQite("Şimali Amerika ");

//
        alb.setNameOlke("Albaniya" );
        alb.setPaytaxt("Tirana");
        alb.setImageId(R.drawable.albania_640);
        alb.setEhali("3,215,988");
        alb.setErazi("28748 (Ərazi Reytinqi: 143)");
        alb.setDil("Alban, Yunan");
        alb.setValyuta("Lek");
        alb.setTelKod("+335");
        alb.setUDM("13.12 milyard");
        alb.setQite("Avropa");
//
        alm.setNameOlke("Almaniya " );
        alm.setPaytaxt("Berlin");
        alm.setImageId(R.drawable.germany_640);
        alm.setEhali("81,726,000");
        alm.setErazi("357021 (Ərazi Reytinqi: 62)");
        alm.setDil("Alman");
        alm.setValyuta("Avro");
        alm.setTelKod("+49");
        alm.setUDM("3,402 milyard");
        alm.setQite("Avropa");
//
        and.setNameOlke("Andorra " );
        and.setPaytaxt("Andorra la Vella");
        and.setImageId(R.drawable.andorra_640);
        and.setEhali("86,165");
        and.setErazi("468 (Ərazi Reytinqi: 194)");
        and.setDil("Katalan, Fransız");
        and.setValyuta("Avro");
        and.setTelKod("");
        and.setUDM("3.712 milyard");
        and.setQite("Avropa");

        anq.setNameOlke("Anqola");
        anq.setPaytaxt("Luanda");
        anq.setImageId(R.drawable.angola_640);
        anq.setEhali("19,618,432");
        anq.setErazi("12467000 (Ərazi Reytinqi: 23)");
        anq.setDil("Portuqal");
        anq.setValyuta("Avro");
        anq.setTelKod("");
        anq.setUDM("35 milyard");
        anq.setQite("Afrika");
//
        antbar.setNameOlke("Antiqua və Barbuda" );
        antbar.setPaytaxt("Sent Cons");
        antbar.setImageId(R.drawable.antigua_and_barbuda_640);
        antbar.setEhali("89,612");
        antbar.setErazi("442 (Ərazi Reytinqi: 197)");
        antbar.setDil("İngilis");
        antbar.setValyuta("Dollar");
        antbar.setTelKod("");
        antbar.setUDM("1.217 milyard");
        antbar.setQite("Şimali Amerika");

        arg.setNameOlke("Argentina" );
        arg.setPaytaxt("Buenos Ayres");
        arg.setImageId(R.drawable.argentina_640);
        arg.setEhali("40,764,561");
        arg.setErazi("2766890 (Ərazi Reytinqi: 8)");
        arg.setDil("İspan");
        arg.setValyuta("Peso");
        arg.setTelKod("");
        arg.setUDM("317 milyard");
        arg.setQite("Cənubi Amerika");

        avsa.setNameOlke("Avstraliya" );
        avsa.setPaytaxt("Kanberra");
        avsa.setImageId(R.drawable.australia_640);
        avsa.setEhali("23,067,206");
        avsa.setErazi("7686850 (Ərazi Reytinqi: 6)");
        avsa.setDil("İngilis");
        avsa.setValyuta("Dollar");
        avsa.setTelKod("");
        avsa.setUDM("1,146 milyard");
        avsa.setQite("Avstraliya");

        avs.setNameOlke("Avstriya" );
        avs.setPaytaxt("Vyana");
        avs.setImageId(R.drawable.austria_640);
        avs.setEhali("8,419,000");
        avs.setErazi("83870 (Ərazi Reytinqi: 116)");
        avs.setDil("Alman");
        avs.setValyuta("Avro");
        avs.setTelKod("");
        avs.setUDM("385.1 milyard");
        avs.setQite("Avropa");
//
        aze.setNameOlke("Azərbaycan" );
        aze.setPaytaxt("Bakı");
        aze.setImageId(R.drawable.azerbaijan_640);
        aze.setEhali("9,168,000");
        aze.setErazi("86600 (Ərazi Reytinqi: 115)");
        aze.setDil("Azerbaycanca");
        aze.setValyuta("Manat");
        aze.setTelKod("");
        aze.setUDM("46.13 milyard");
        aze.setQite("Avropa/Asia");

        bah.setNameOlke("Baham adaları");
        bah.setPaytaxt("Nassau");
        bah.setImageId(R.drawable.bahamas_640);
        bah.setEhali("347,176");
        bah.setErazi("13940 (Ərazi Reytinqi: 160)");
        bah.setDil("İngilis");
        bah.setValyuta("Dollar");
        bah.setTelKod("");
        bah.setUDM("7.463 milyard");
        bah.setQite("Şimali Amerika");



        ban.setNameOlke("Banqladeş");
        ban.setPaytaxt("Daka");
        ban.setImageId(R.drawable.bangladesh_640);
        ban.setEhali("150,493,658");
        ban.setErazi("144000 (Ərazi Reytinqi: 95)");
        ban.setDil("Banqla(Benqali)");
        ban.setValyuta("Taka");
        ban.setTelKod("");
        ban.setUDM("79.55 milyard");
        ban.setQite("Asiya");

        bar.setNameOlke("Barbados");
        bar.setPaytaxt("Brictaun");
        bar.setImageId(R.drawable.barbados_640);
        bar.setEhali("273,925");
        bar.setErazi("431 (Ərazi Reytinqi: 198)");
        bar.setDil("İngilis");
        bar.setValyuta("Dollar");
        bar.setTelKod("");
        bar.setUDM("3.681 milyard");
        bar.setQite("Şimali Amerika");

        bel.setNameOlke("Belarusiya");
        bel.setPaytaxt("Minsk");
        bel.setImageId(R.drawable.belarus_640);
        bel.setEhali("9,473,000");
        bel.setErazi("207600 (Ərazi Reytinqi: 86)");
        bel.setDil("Belarus, Rus");
        bel.setValyuta("Belarusiya Rublu");
        bel.setTelKod("");
        bel.setUDM("49.55 milyard");
        bel.setQite("Avropa");


        belc.setNameOlke("Belçika");
        belc.setPaytaxt("Brüssel(Avropa Birliyi Paytaxtı)");
        belc.setImageId(R.drawable.belgium_640);
        belc.setEhali("11,008,000");
        belc.setErazi("30528 (Ərazi Reytinqi: 140)");
        belc.setDil("Alman, Fransiz");
        belc.setValyuta("Avro");
        belc.setTelKod("");
        belc.setUDM("468.6 milyard");
        belc.setQite("Avropa");

////
        beli.setNameOlke("Beliz");
        beli.setPaytaxt("Belmapon");
        beli.setImageId(R.drawable.belize_640);
        beli.setEhali("356,600");
        beli.setErazi("22966 (Ərazi Reytinqi: 151)");
        beli.setDil("İspan, Kriol, İngilis");
        beli.setValyuta("Dollar");
        beli.setTelKod("");
        beli.setUDM("1.359 milyard");
        beli.setQite("Şimali Amerika");

        ben.setNameOlke("Benin");
        ben.setPaytaxt("Porto-Novo");
        ben.setImageId(R.drawable.benin_640);
        ben.setEhali("9,099,922");
        ben.setErazi("112620 (Ərazi Reytinqi: 102)");
        ben.setDil("Fransız, Fon və Yoruba");
        ben.setValyuta("Frank");
        ben.setTelKod("");
        ben.setUDM("6.68 milyard");
        ben.setQite("Afrika");


        ber.setNameOlke("Bermud adaları");
        ber.setPaytaxt("Hamilton");
        ber.setImageId(R.drawable.bermuda_640);
        ber.setEhali("64,700");
        ber.setErazi("53 (Ərazi Reytinqi: 219)");
        ber.setDil("İngilis");
        ber.setValyuta("Dollar");
        ber.setTelKod("");
        ber.setUDM("6.432 milyard");
        ber.setQite("Şimali Amerika");

        bee.setNameOlke("BƏƏ");
        bee.setPaytaxt("Əbu-Dabi");
        bee.setImageId(R.drawable.united_arab_emirates_640);
        bee.setEhali("7,890,924");
        bee.setErazi("82880 (Ərazi Reytinqi: 117)");
        bee.setDil("Ərəb");
        bee.setValyuta("Dirhəm");
        bee.setTelKod("");
        bee.setUDM("286.9 milyard");
        bee.setQite("Asiya");

        beh.setNameOlke("Bəhreyn");
        beh.setPaytaxt("Manama");
        beh.setImageId(R.drawable.bahrain_640);
        beh.setEhali("1,323,535");
        beh.setErazi("665 (Ərazi Reytinqi: 190)");
        beh.setDil("Ərəb, Fars");
        beh.setValyuta("Dinar");
        beh.setTelKod("");
        beh.setUDM("21.9 milyard");
        beh.setQite("Asiya");

        bol.setNameOlke("Boliviya");
        bol.setPaytaxt("Sukre, La Pas");
        bol.setImageId(R.drawable.bolivia_640);
        bol.setEhali("10,088,108");
        bol.setErazi("1098580 (Ərazi Reytinqi: 28)");
        bol.setDil("İspan, Keçua, Aymara");
        bol.setValyuta("Boliviyano");
        bol.setTelKod("");
        bol.setUDM("17.07 milyard");
        bol.setQite("Cənubi Amerika");

        bolq.setNameOlke("Bolqarıstan");
        bolq.setPaytaxt("Sofiya");
        bolq.setImageId(R.drawable.bulgaria_640);
        bolq.setEhali("7,476,000");
        bolq.setErazi("110910 (Ərazi Reytinqi: 105)");
        bolq.setDil("Bolqar, Türk");
        bolq.setValyuta("Lev");
        bolq.setTelKod("");
        bolq.setUDM("48.03 milyard");
        bolq.setQite("Avropa");

        bos.setNameOlke("Bosniya və Herseqovina");
        bos.setPaytaxt("Sarayevo");
        bos.setImageId(R.drawable.bosnia_and_herzegovina_640);
        bos.setEhali("3,752,228");
        bos.setErazi("51129 (Ərazi Reytinqi: 128)");
        bos.setDil("Bosniyan, Xorvat, Serb");
        bos.setValyuta("Mark");
        bos.setTelKod("");
        bos.setUDM("18.39 milyard");
        bos.setQite("Avropa");

        bot.setNameOlke("Botsvana");
        bot.setPaytaxt("Qaborone");
        bot.setImageId(R.drawable.botswana_640);
        bot.setEhali("2,030,738");
        bot.setErazi("600370 (Ərazi Reytinqi: 45)");
        bot.setDil("Setsvana, Kalana,İngilis");
        bot.setValyuta("Pula");
        bot.setTelKod("");
        bot.setUDM("0.549 milyard");
        bot.setQite("Afrika");

        bra.setNameOlke("Braziliya");
        bra.setPaytaxt("Rio De Janeriyo");
        bra.setImageId(R.drawable.brazil_640);
        bra.setEhali("196,655,014");
        bra.setErazi("8511965 (Ərazi Reytinqi: 5)");
        bra.setDil("Portuqal");
        bra.setValyuta("Real");
        bra.setTelKod("");
        bra.setUDM("1,749 milyard");
        bra.setQite("Cənubi Amerika");

        bru.setNameOlke("Bruney");
        bru.setPaytaxt("Bandar Səri Bəgavan");
        bru.setImageId(R.drawable.brunei_640);
        bru.setEhali("405,938");
        bru.setErazi("5770 (Ərazi Reytinqi: 170)");
        bru.setDil("Malay");
        bru.setValyuta("Dollar");
        bru.setTelKod("");
        bru.setUDM("14.53 milyard");
        bru.setQite("Asiya");

        bur.setNameOlke("Burkina Faso");
        bur.setPaytaxt("Udaqaduqu");
        bur.setImageId(R.drawable.burkina_faso_640);
        bur.setEhali("16,967,845");
        bur.setErazi("274200 (Ərazi Reytinqi: 73)");
        bur.setDil("Fransız, Yerli Afrikan dili");
        bur.setValyuta("Frank");
        bur.setTelKod("");
        bur.setUDM("7.948 milyard");
        bur.setQite("Afrika");

        buru.setNameOlke("Burundi");
        buru.setPaytaxt("Bujumbura");
        buru.setImageId(R.drawable.burundi_640);
        buru.setEhali("8,575,172");
        buru.setErazi("27830 (Ərazi Reytinqi: 146)");
        buru.setDil("Kirundi, Fransız");
        buru.setValyuta("Frank");
        buru.setTelKod("");
        buru.setUDM("1.163 milyard");
        buru.setQite("Afrika");



        butan.setNameOlke("Butan");
        butan.setPaytaxt("Thimphu");
        butan.setImageId(R.drawable.bhutan_640);
        butan.setEhali("738,267");
        butan.setErazi("47000 (Ərazi Reytinqi: 132)");
        butan.setDil("Dzonqa");
        butan.setValyuta("İnqultrum");
        butan.setTelKod("");
        butan.setUDM("1.327 milyard");
        butan.setQite("Asiya");


        car.setNameOlke("Cənubi Afrika Respublikası");
        car.setPaytaxt("Keyptaun");
        car.setImageId(R.drawable.south_africa_640);
        car.setEhali("50,586,757");
        car.setErazi("1219912 (Ərazi Reytinqi: 25)");
        car.setDil("İsizulu, İsixosa, İngilis");
        car.setValyuta("Rend");
        car.setTelKod("");
        car.setUDM("338.7 milyard");
        car.setQite("Afrika");


        cer.setNameOlke("Cersi");
        cer.setPaytaxt("Sent Heller");
        cer.setImageId(R.drawable.jersey_640);
        cer.setEhali("100,080");
        cer.setErazi("118.2 (Ərazi Reytinqi: 227)");
        cer.setDil("İngilis");
        cer.setValyuta("Sterlinq(Pound)");
        cer.setTelKod("");
        cer.setUDM("5.5 milyard");
        cer.setQite("Avropa");

        ceb.setNameOlke("Cəbəllitarıq");
        ceb.setPaytaxt("Cəbəli-Tariq");
        ceb.setImageId(R.drawable.gibraltar_640);
        ceb.setEhali("29,244");
        ceb.setErazi("6 (Ərazi Reytinqi: )");
        ceb.setDil("İngilis");
        ceb.setValyuta("Sterlinq(Pound)");
        ceb.setTelKod("");
        ceb.setUDM("1.106 milyard");
        ceb.setQite("Avropa");

        cenS.setNameOlke("Cənubi Sudan");
        cenS.setPaytaxt("Cuba");
        cenS.setImageId(R.drawable.south_sudan_640);
        cenS.setEhali("10,625,176");
        cenS.setErazi("239285 (Ərazi Reytinqi: 80)");
        cenS.setDil("İngilis");
        cenS.setValyuta("Cənubi Sudan Poundu");
        cenS.setTelKod("");
        cenS.setUDM("21.123 milyard");
        cenS.setQite("Afrika");

        cib.setNameOlke("Cibuti");
        cib.setPaytaxt("Cibuti");
        cib.setImageId(R.drawable.djibouti_640);
        cib.setEhali("905,564");
        cib.setErazi("23000 (Ərazi Reytinqi: 150)");
        cib.setDil("Fransız, Ərəb");
        cib.setValyuta("Frank");
        cib.setTelKod("");
        cib.setUDM("0.981 milyard");
        cib.setQite("Afrika");


        cad.setNameOlke("Çad");
        cad.setPaytaxt("Ncamena");
        cad.setImageId(R.drawable.chad_640);
        cad.setEhali("11,525,496");
        cad.setErazi("1284000 (Ərazi Reytinqi: 21)");
        cad.setDil("Fransız, Ərəb");
        cad.setValyuta("Frank");
        cad.setTelKod("");
        cad.setUDM("8.4 milyard");
        cad.setQite("Afrika");
//
        cex.setNameOlke("Çexiya");
        cex.setPaytaxt("Praqa");
        cex.setImageId(R.drawable.czech_republic_640);
        cex.setEhali("10,546,000");
        cex.setErazi("78866 (Ərazi Reytinqi: 118)");
        cex.setDil("Çex");
        cex.setValyuta("Koruna");
        cex.setTelKod("");
        cex.setUDM("196.8 milyard");
        cex.setQite("Avropa");

        cili.setNameOlke("Çili");
        cili.setPaytaxt("Santyaqo");
        cili.setImageId(R.drawable.chile_640);
        cili.setEhali("17,269,525");
        cili.setErazi("756950 (Ərazi Reytinqi: 38)");
        cili.setDil("İspan");
        cili.setValyuta("Peso");
        cili.setTelKod("");
        cili.setUDM("164.8 milyard");
        cili.setQite("Cənubi Amerika");

        cin.setNameOlke("Çin Xalq Respublikası");
        cin.setPaytaxt("Pekin");
        cin.setImageId(R.drawable.china_640);
        cin.setEhali("1,344,130,000");
        cin.setErazi("9596960 (Ərazi Reytinqi: 4)");
        cin.setDil("Çin");
        cin.setValyuta("Yuan");
        cin.setTelKod("");
        cin.setUDM("5,308 milyard");
        cin.setQite("Asiya");

        dan.setNameOlke("Danimarka");
        dan.setPaytaxt("Kopenhagen");
        dan.setImageId(R.drawable.denmark_640);
        dan.setEhali("5,574,00");
        dan.setErazi("43094 (Ərazi Reytinqi: 134)");
        dan.setDil("Deniş");
        dan.setValyuta("Kron");
        dan.setTelKod("");
        dan.setUDM("318.1 milyard");
        dan.setQite("Avropa");


        dom.setNameOlke("Dominika");
        dom.setPaytaxt("Rozo");
        dom.setImageId(R.drawable.dominica_640);
        dom.setEhali("67,675");
        dom.setErazi("754 (Ərazi Reytinqi: 186)");
        dom.setDil("İngilis");
        dom.setValyuta("Dollar");
        dom.setTelKod("");
        dom.setUDM("0.364 milyard");
        dom.setQite("Şimali Amerika");

        domR.setNameOlke("Dominikan Respublikası");
        domR.setPaytaxt("Santo Dominqo");
        domR.setImageId(R.drawable.dominican_republic_640);
        domR.setEhali("10,056,181");
        domR.setErazi("48730 (Ərazi Reytinqi: 131)");
        domR.setDil("İspan");
        domR.setValyuta("Peso");
        domR.setTelKod("");
        domR.setUDM("45.54 milyard");
        domR.setQite("Şimali Amerika");

        efi.setNameOlke("Efiopiya");
        efi.setPaytaxt("Əddis-Əbəbə");
        efi.setImageId(R.drawable.ethiopia_640);
        efi.setEhali("84,734,262");
        efi.setErazi("1127127 (Ərazi Reytinqi: 27)");
        efi.setDil("Amariqna, Oromiqna");
        efi.setValyuta("Birr");
        efi.setTelKod("");
        efi.setUDM("25.58 milyard");
        efi.setQite("Afrika");

        efir.setNameOlke("Eritreya");
        efir.setPaytaxt("Asmera");
        efir.setImageId(R.drawable.eritrea_640);
        efir.setEhali("5,415,280");
        efir.setErazi("121320 (Ərazi Reytinqi: 99)");
        efir.setDil("Afar, Ərəb");
        efir.setValyuta("Nakfa");
        efir.setTelKod("");
        efir.setUDM("1.476 milyard");
        efir.setQite("Afrika");

        ekv.setNameOlke("Ekvador");
        ekv.setPaytaxt("Kito");
        ekv.setImageId(R.drawable.ecuador_640);
        ekv.setEhali("14,66,055");
        ekv.setErazi("283560 (Ərazi Reytinqi: 72)");
        ekv.setDil("İspan");
        ekv.setValyuta("Dollar");
        ekv.setTelKod("");
        ekv.setUDM("54.69 milyard");
        ekv.setQite("Cənubi Amerika");

        ekva.setNameOlke("Ekvatorial Qvineya");
        ekva.setPaytaxt("Malabao");
        ekva.setImageId(R.drawable.equatorial_guinea_640);
        ekva.setEhali("720,213");
        ekva.setErazi("28051 (Ərazi Reytinqi: 145)");
        ekva.setDil("İspan");
        ekva.setValyuta("Frank");
        ekva.setTelKod("");
        ekva.setUDM("17.88 milyard");
        ekva.setQite("Afrika");

        erm.setNameOlke("Ermənistan");
        erm.setPaytaxt("İrəvan");
        erm.setImageId(R.drawable.armenia_640);
        erm.setEhali("3,100,236");
        erm.setErazi("29800 (Ərazi Reytinqi: 142)");
        erm.setDil("Erməni");
        erm.setValyuta("Ermənistan Dramı");
        erm.setTelKod("");
        erm.setUDM("11.92 milyard");
        erm.setQite("Asiya/Avropa");

        est.setNameOlke("Estoniya");
        est.setPaytaxt("Tallin");
        est.setImageId(R.drawable.estonia_640);
        est.setEhali("1,340,000");
        est.setErazi("45226 (Ərazi Reytinqi: 133)");
        est.setDil("Estoniyan");
        est.setValyuta("Kron");
        est.setTelKod("");
        est.setUDM("19.24 milyard");
        est.setQite("Avropa");

        efq.setNameOlke("Əfqanıstan");
        efq.setPaytaxt("Kabul");
        efq.setImageId(R.drawable.afghanistan_640);
        efq.setEhali("35,320,445");
        efq.setErazi("647500 (Ərazi Reytinqi: 41)");
        efq.setDil("Əfqan, Fars, Paşto");
        efq.setValyuta("Əfqani");
        efq.setTelKod("");
        efq.setUDM("12.68 milyard");
        efq.setQite("Asiya");

        elc.setNameOlke("Əlcazair");
        elc.setPaytaxt("Əlcazair");
        elc.setImageId(R.drawable.algeria_640);
        elc.setEhali("35,980,193");
        elc.setErazi("2381740 (Ərazi Reytinqi: 11)");
        elc.setDil("Ərəb");
        elc.setValyuta("Dinar");
        elc.setTelKod("");
        elc.setUDM("166.5 milyard");
        elc.setQite("Afrika");

        far.setNameOlke("Farer adaları");
        far.setPaytaxt("Torshavn");
        far.setImageId(R.drawable.faroe_islands_640);
        far.setEhali("48,863");
        far.setErazi("1399 (Ərazi Reytinqi: 181)");
        far.setDil("Fransız, Deniş ");
        far.setValyuta("Kron");
        far.setTelKod("");
        far.setUDM("2.45 milyard");
        far.setQite("Avropa");

//        fel.setNameOlke("Fələstin");
//        fel.setPaytaxt("Ramallah");
//        fel.setImageId(R.drawable.palestinian_territory_640);
//        fel.setEhali("");
//        fel.setErazi("1399 (Ərazi Reytinqi: 181)");
//        fel.setDil("Fransız, Deniş ");
//        fel.setValyuta("Kron");
//        fel.setTelKod("");
//        fel.setUDM("2.45 milyard");
//        fel.setQite("Avropa");

        fil.setNameOlke("Fildişi Sahili");
        fil.setPaytaxt("Yamosukro");
        fil.setImageId(R.drawable.cote_d_ivoire_640);
        fil.setEhali("20,152,894");
        fil.setErazi("322460 (Ərazi Reytinqi: 68)");
        fil.setDil("Fransız");
        fil.setValyuta("Frank");
        fil.setTelKod("");
        fil.setUDM("23.41 milyard");
        fil.setQite("Afrika");



        fin.setNameOlke("Finlandiya");
        fin.setPaytaxt("Helsinki");
        fin.setImageId(R.drawable.finland_640);
        fin.setEhali("5,387,000");
        fin.setErazi("338145 (Ərazi Reytinqi: 64)");
        fin.setDil("Fin ");
        fin.setValyuta("Avro");
        fin.setTelKod("");
        fin.setUDM("233.8 milyard");
        fin.setQite("Avropa");



        fra.setNameOlke("Fransa");
        fra.setPaytaxt("Paris");
        fra.setImageId(R.drawable.france_640);
        fra.setEhali("65,436,552");
        fra.setErazi("547030 (Ərazi Reytinqi: 48)");
        fra.setDil("Fransız ");
        fra.setValyuta("Avro");
        fra.setTelKod("");
        fra.setUDM("2,669 milyard");
        fra.setQite("Avropa");

        ger.setNameOlke("Gernsi");
        ger.setPaytaxt("Sent Piter Port");
        ger.setImageId(R.drawable.guernsey_640);
        ger.setEhali("62,711");
        ger.setErazi("78 (Ərazi Reytinqi: )");
        ger.setDil("İngilis");
        ger.setValyuta("Gernsi poundu");
        ger.setTelKod("");
        ger.setUDM("0.446 milyard");
        ger.setQite("Avropa");

        gur.setNameOlke("Gürcüstan");
        gur.setPaytaxt("Tiblisi");
        gur.setImageId(R.drawable.georgia_640);
        gur.setEhali("4,486,00");
        gur.setErazi("69700 (Ərazi Reytinqi: 122)");
        gur.setDil("Gürcü");
        gur.setValyuta("Lari");
        gur.setTelKod("");
        gur.setUDM("10.75 milyard");
        gur.setQite("Avropa/Asiya");

        hai.setNameOlke("Haiti");
        hai.setPaytaxt("Port-o-Prins");
        hai.setImageId(R.drawable.haiti_640);
        hai.setEhali("10,123,787");
        hai.setErazi("27750 (Ərazi Reytinqi: 147)");
        hai.setDil("Fransız, Kriol");
        hai.setValyuta("Qord");
        hai.setTelKod("");
        hai.setUDM("7.077 milyard");
        hai.setQite("Şimali Amerika");

        hin.setNameOlke("Hindistan");
        hin.setPaytaxt("Dehli");
        hin.setImageId(R.drawable.india_640);
        hin.setEhali("1,241,491,960");
        hin.setErazi("3287590 (Ərazi Reytinqi: 7)");
        hin.setDil("Hind, Benqali, Teluqu");
        hin.setValyuta("Rupi");
        hin.setTelKod("");
        hin.setUDM("1,290 milyard");
        hin.setQite("Asiya");

        hol.setNameOlke("Hollandiya");
        hol.setPaytaxt("Amsterdam");
        hol.setImageId(R.drawable.netherlands_640);
        hol.setEhali("16,696,000");
        hol.setErazi("41526 (Ərazi Reytinqi: 135)");
        hol.setDil("Holland, Frizian");
        hol.setValyuta("Avro");
        hol.setTelKod("");
        hol.setUDM("804.7 milyard");
        hol.setQite("Avropa");


        hond.setNameOlke("Honduras");
        hond.setPaytaxt("Tequsiqalpa");
        hond.setImageId(R.drawable.honduras_640);
        hond.setEhali("7,754,687");
        hond.setErazi("112090 (Ərazi Reytinqi: 103)");
        hond.setDil("İspan");
        hond.setValyuta("Lempira");
        hond.setTelKod("");
        hond.setUDM("13.34 milyard");
        hond.setQite("Şimali Amerika");

        honk.setNameOlke("Honkonq");
        honk.setPaytaxt("Honkonq");
        honk.setImageId(R.drawable.hong_kong_640);
        honk.setEhali("7,234,000");
        honk.setErazi("2755 (Ərazi Reytinqi: 167)");
        honk.setDil("Çin, İngilis");
        honk.setValyuta("Honkonq Dolları");
        honk.setTelKod("");
        honk.setUDM("412.3 milyard");
        honk.setQite("Asiya");

        xor.setNameOlke("Xorvatiya");
        xor.setPaytaxt("Zaqreb");
        xor.setImageId(R.drawable.croatia_640);
        xor.setEhali("4,407,000");
        xor.setErazi("56542 (Ərazi Reytinqi: 127)");
        xor.setDil("Xorvatiyan");
        xor.setValyuta("Kuna");
        xor.setTelKod("");
        xor.setUDM("64.12 milyard");
        xor.setQite("Avropa");

        ind.setNameOlke("İndoneziya");
        ind.setPaytaxt("Cakarta");
        ind.setImageId(R.drawable.indonesia_640);
        ind.setEhali("242,325,638");
        ind.setErazi("1919440 (Ərazi Reytinqi: 16)");
        ind.setDil("İndoneziyan");
        ind.setValyuta("Rupaya");
        ind.setTelKod("");
        ind.setUDM("593.3 milyard");
        ind.setQite("Asiya");

        iraq.setNameOlke("İraq");
        iraq.setPaytaxt("Bağdad");
        iraq.setImageId(R.drawable.iraq_640);
        iraq.setEhali("32,961,959");
        iraq.setErazi("437072 (Ərazi Reytinqi: 58)");
        iraq.setDil("Ərəb, Kürd, Türkmən");
        iraq.setValyuta("Dinar");
        iraq.setTelKod("");
        iraq.setUDM("23.71 milyard");
        iraq.setQite("Asiya");

        ira.setNameOlke("İran");
        ira.setPaytaxt("Tehran");
        ira.setImageId(R.drawable.iran_640);
        ira.setEhali("74,798,599");
        ira.setErazi("1648000 (Ərazi Reytinqi: 18)");
        ira.setDil("Fars");
        ira.setValyuta("Rial");
        ira.setTelKod("");
        ira.setUDM("346.6 milyard");
        ira.setQite("Asiya");


        irl.setNameOlke("İrlandiya");
        irl.setPaytaxt("Dublin");
        irl.setImageId(R.drawable.ireland_640);
        irl.setEhali("4,478,000");
        irl.setErazi("70280 (Ərazi Reytinqi: 121)");
        irl.setDil("İngilis");
        irl.setValyuta("Avro");
        irl.setTelKod("");
        irl.setUDM("218.4 milyard");
        irl.setQite("Avropa");

        isl.setNameOlke("Islandiya");
        isl.setPaytaxt("Reykcavik");
        isl.setImageId(R.drawable.iceland_640);
        isl.setEhali("319,000");
        isl.setErazi("103000 (Ərazi Reytinqi: 108)");
        isl.setDil("İsland, İngilis");
        isl.setValyuta("Kron");
        isl.setTelKod("");
        isl.setUDM("12.09 milyard");
        isl.setQite("Avropa");

        isp.setNameOlke("İspaniya");
        isp.setPaytaxt("Madrid");
        isp.setImageId(R.drawable.spain_640);
        isp.setEhali("47,190,493");
        isp.setErazi("504782 (Ərazi Reytinqi: 51)");
        isp.setDil("İspan, Katalon");
        isp.setValyuta("Avro");
        isp.setTelKod("");
        isp.setUDM("1.470 milyard");
        isp.setQite("Avropa");

        isv.setNameOlke("İsveç");
        isv.setPaytaxt("Stokholm");
        isv.setImageId(R.drawable.sweden_640);
        isv.setEhali("9,453,000");
        isv.setErazi("449964 (Ərazi Reytinqi: 55)");
        isv.setDil("İsveç");
        isv.setValyuta("Kron");
        isv.setTelKod("");
        isv.setUDM("437.5 milyard");
        isv.setQite("Avropa");

        ita.setNameOlke("İtaliya");
        ita.setPaytaxt("Roma");
        ita.setImageId(R.drawable.italy_640);
        ita.setEhali("60,626,442");
        ita.setErazi("301230 (Ərazi Reytinqi: 70)");
        ita.setDil("Italiyan");
        ita.setValyuta("Avro");
        ita.setTelKod("");
        ita.setUDM("2,107 milyard");
        ita.setQite("Avropa");

        kamb.setNameOlke("Kamboca");
        kamb.setPaytaxt("Pnompen");
        kamb.setImageId(R.drawable.cambodia_640);
        kamb.setEhali("14,305,183");
        kamb.setErazi("181040 (Ərazi Reytinqi: 90)");
        kamb.setDil("Xmer");
        kamb.setValyuta("Riel");
        kamb.setTelKod("");
        kamb.setUDM("11.19 milyard");
        kamb.setQite("Asiya");

        kam.setNameOlke("Kamerun");
        kam.setPaytaxt("Yaunde");
        kam.setImageId(R.drawable.cameroon_640);
        kam.setEhali("20,030,362");
        kam.setErazi("475440 (Ərazi Reytinqi: 53)");
        kam.setDil("24 böyük afrikan dili, İngilis");
        kam.setValyuta("Frank");
        kam.setTelKod("");
        kam.setUDM("23.4 milyard");
        kam.setQite("Afrika");

        kan.setNameOlke("Kanada");
        kan.setPaytaxt("Ottava");
        kan.setImageId(R.drawable.canada_640);
        kan.setEhali("34,482,779");
        kan.setErazi("9984670 (Ərazi Reytinqi: 2)");
        kan.setDil("İngilis, Fransız");
        kan.setValyuta("Dollar");
        kan.setTelKod("");
        kan.setUDM("1,565 milyard");
        kan.setQite("Şimali Amerika");


        kay.setNameOlke("Kayman adaları");
        kay.setPaytaxt("Corctaun");
        kay.setImageId(R.drawable.cayman_islands_640);
        kay.setEhali("56,729");
        kay.setErazi("262 (Ərazi Reytinqi: 207)");
        kay.setDil("İngilis");
        kay.setValyuta("Dollar");
        kay.setTelKod("");
        kay.setUDM("2.822 milyard");
        kay.setQite("Şimali Amerika");

        ken.setNameOlke("Keniya");
        ken.setPaytaxt("Nayrobi");
        ken.setImageId(R.drawable.kenya_640);
        ken.setEhali("41,609,728");
        ken.setErazi("58260 (Ərazi Reytinqi: 47)");
        ken.setDil("İngilis, Kisuahili");
        ken.setValyuta("Şillinq");
        ken.setTelKod("");
        ken.setUDM("30.35 milyard");
        ken.setQite("Afrika");

        kip.setNameOlke("Kipr");
        kip.setPaytaxt("Nikosiya");
        kip.setImageId(R.drawable.cyprus_640);
        kip.setEhali("1,116,564");
        kip.setErazi("9250 (Ərazi Reytinqi: 169)");
        kip.setDil("Yunan, Türk");
        kip.setValyuta("Avro");
        kip.setTelKod("");
        kip.setUDM("23.4 milyard");
        kip.setQite("Avropa");

        kir.setNameOlke("Kiribati");
        kir.setPaytaxt("Cənubi Tarava");
        kir.setImageId(R.drawable.kiribati_640);
        kir.setEhali("101,093");
        kir.setErazi("811 (Ərazi Reytinqi: 185)");
        kir.setDil("İ-Kiribati, İngilis");
        kir.setValyuta("Dollar");
        kir.setTelKod("");
        kir.setUDM("0.137 milyard");
        kir.setQite("Avstraliya");


        kok.setNameOlke("Kokos adaları");
        kok.setPaytaxt("Uest Aylend");
        kok.setImageId(R.drawable.cocos_islands_640);
        kok.setEhali("596");
        kok.setErazi("14 (Ərazi Reytinqi: 234)");
        kok.setDil("Malay, İngilis");
        kok.setValyuta("Avstraliya Dolları");
        kok.setTelKod("");
        kok.setUDM("-- milyard");
        kok.setQite("Avstraliya");

        kol.setNameOlke("Kolumbiya");
        kol.setPaytaxt("Boqota");
        kol.setImageId(R.drawable.colombia_640);
        kol.setEhali("46,927,125");
        kol.setErazi("1138910 (Ərazi Reytinqi: 26)");
        kol.setDil("İspan");
        kol.setValyuta("Peso");
        kol.setTelKod("");
        kol.setUDM("232.6 milyard");
        kol.setQite("Cənubi Amerika");

        kom.setNameOlke("Komor adaları");
        kom.setPaytaxt("Moroni");
        kom.setImageId(R.drawable.comoros_640);
        kom.setEhali("753,943");
        kom.setErazi("2170 (Ərazi Reytinqi: 177)");
        kom.setDil("Ərəb, Fransız");
        kom.setValyuta("Frank");
        kom.setTelKod("");
        kom.setUDM("0.53 milyard");
        kom.setQite("Afrika");

        konD.setNameOlke("Konqo Demokratik Respublikası");
        konD.setPaytaxt("Kinşasa");
        konD.setImageId(R.drawable.democratic_republic_of_the_congo_640);
        konD.setEhali("67,757,577");
        konD.setErazi("2345410 (Ərazi Reytinqi: 12)");
        konD.setDil("Fransız, Linqala");
        konD.setValyuta("Frank");
        konD.setTelKod("");
        konD.setUDM("11.67 milyard");
        konD.setQite("Afrika");

        konR.setNameOlke("Konqo Respublikasi");
        konR.setPaytaxt("Brazzavil");
        konR.setImageId(R.drawable.republic_of_the_congo_640);
        konR.setEhali("4,139,748");
        konR.setErazi("342000 (Ərazi Reytinqi: 63)");
        konR.setDil("Fransız, Kikonqo");
        konR.setValyuta("Frank");
        konR.setTelKod("");
        konR.setUDM("10.72 milyard");
        konR.setQite("Afrika");

        korX.setNameOlke("Korea Xalq Demokratik Respublikası");
        korX.setPaytaxt("Pxenyan");
        korX.setImageId(R.drawable.korea_north_640);
        korX.setEhali("24,451,285");
        korX.setErazi("120540 (Ərazi Reytinqi: 100)");
        korX.setDil("Koreyan");
        korX.setValyuta("Von");
        korX.setTelKod("");
        korX.setUDM("13.34 milyard");
        korX.setQite("Asiya");

        korR.setNameOlke("Korea Respublikası");
        korR.setPaytaxt("Seul");
        korR.setImageId(R.drawable.korea_north_640);
        korR.setEhali("49,779,000");
        korR.setErazi("98480 (Ərazi Reytinqi: 109)");
        korR.setDil("Koreyan");
        korR.setValyuta("Von");
        korR.setTelKod("");
        korR.setUDM("904.4 milyard");
        korR.setQite("Asiya");

        kub.setNameOlke("Kuba");
        kub.setPaytaxt("Havana");
        kub.setImageId(R.drawable.cuba_640);
        kub.setEhali("11,253,665");
        kub.setErazi("110860 (Ərazi Reytinqi: 106)");
        kub.setDil("İspan");
        kub.setValyuta("Peso");
        kub.setTelKod("");
        kub.setUDM("62.7 milyard");
        kub.setQite("Şimali Amerika");


        kuk.setNameOlke("Kuk adaları");
        kuk.setPaytaxt("Avarua");
        kuk.setImageId(R.drawable.cook_islands_640);
        kuk.setEhali("10,900");
        kuk.setErazi("236 (Ərazi Reytinqi: 211)");
        kuk.setDil("İngilis");
        kuk.setValyuta("Dollar");
        kuk.setTelKod("");
        kuk.setUDM("0.211 milyard");
        kuk.setQite("Avstraliya");

        kuv.setNameOlke("Küveyt");
        kuv.setPaytaxt("Küveyt");
        kuv.setImageId(R.drawable.kuwait_640);
        kuv.setEhali("2,818,042");
        kuv.setErazi("17820 (Ərazi Reytinqi: 157)");
        kuv.setDil("Ərəb");
        kuv.setValyuta("Dinar");
        kuv.setTelKod("");
        kuv.setUDM("158.1 milyard");
        kuv.setQite("Asiya");

        qab.setNameOlke("Qabon");
        qab.setPaytaxt("Librevil");
        qab.setImageId(R.drawable.gabon_640);
        qab.setEhali("1,534,262");
        qab.setErazi("267667 (Ərazi Reytinqi: 75)");
        qab.setDil("Fransız");
        qab.setValyuta("Frank");
        qab.setTelKod("");
        qab.setUDM("14.53 milyard");
        qab.setQite("Afrika");

        qam.setNameOlke("Qambiya");
        qam.setPaytaxt("Banjul");
        qam.setImageId(R.drawable.gambia_640);
        qam.setEhali("1,776,103");
        qam.setErazi("11300 (Ərazi Reytinqi: 166)");
        qam.setDil("İngilis, Mandinka");
        qam.setValyuta("Dalasi");
        qam.setTelKod("");
        qam.setUDM("0.811 milyard");
        qam.setQite("Afrika");

        qar.setNameOlke("Qaradağ(Çernoqoriya)");
        qar.setPaytaxt("Podqorisa");
        qar.setImageId(R.drawable.montenegro_640);
        qar.setEhali("632,261");
        qar.setErazi("14026 (Ərazi Reytinqi: 159)");
        qar.setDil("Serb, Monteneqrin");
        qar.setValyuta("Avro");
        qar.setTelKod("");
        qar.setUDM("4.82 milyard");
        qar.setQite("Avropa");

        qaz.setNameOlke("Qazaxıstan");
        qaz.setPaytaxt("Astana");
        qaz.setImageId(R.drawable.kazakhstan_640);
        qaz.setEhali("16,558,459");
        qaz.setErazi("2717300 (Ərazi Reytinqi: 9)");
        qaz.setDil("Qazax, Rus");
        qaz.setValyuta("Təngə");
        qaz.setTelKod("");
        qaz.setUDM("105.2 milyard");
        qaz.setQite("Asiya");

        qet.setNameOlke("Qətər");
        qet.setPaytaxt("Doha");
        qet.setImageId(R.drawable.qatar_640);
        qet.setEhali("1,870,041");
        qet.setErazi("11437 (Ərazi Reytinqi: 165)");
        qet.setDil("Ərəb");
        qet.setValyuta("Rial");
        qet.setTelKod("");
        qet.setUDM("114 milyard");
        qet.setQite("Asiya");


        qir.setNameOlke("Qırğızıstan");
        qir.setPaytaxt("Bişkek");
        qir.setImageId(R.drawable.kyrgyzstan_640);
        qir.setEhali("5,507,000");
        qir.setErazi("198500 (Ərazi Reytinqi: 87)");
        qir.setDil("Qırğız");
        qir.setValyuta("Som");
        qir.setTelKod("");
        qir.setUDM("5.059 milyard");
        qir.setQite("Asiya");

        qrena.setNameOlke("Qrenada");
        qrena.setPaytaxt("Sent Corces");
        qrena.setImageId(R.drawable.grenada_640);
        qrena.setEhali("104,890");
        qrena.setErazi("344 (Ərazi Reytinqi: 203)");
        qrena.setDil("İngilis");
        qrena.setValyuta("Dollar");
        qrena.setTelKod("");
        qrena.setUDM("0.644 milyard");
        qrena.setQite("Şimali Amerika");

        qren.setNameOlke("Qrenlandiya");
        qren.setPaytaxt("Nuuk");
        qren.setImageId(R.drawable.greenland_640);
        qren.setEhali("56,744");
        qren.setErazi("2166086 (Ərazi Reytinqi: 13)");
        qren.setDil("Qrenlandik, İngilis");
        qren.setValyuta("Kron");
        qren.setTelKod("");
        qren.setUDM("2.122 milyard");
        qren.setQite("Şimali Amerika");

        qva.setNameOlke("Qvatemala");
        qva.setPaytaxt("Qvatemala");
        qva.setImageId(R.drawable.guatemala_640);
        qva.setEhali("14,757,316");
        qva.setErazi("108890 (Ərazi Reytinqi: 107)");
        qva.setDil("İspan, Amerindiyan");
        qva.setValyuta("Qetzal");
        qva.setTelKod("");
        qva.setUDM("38.98 milyard");
        qva.setQite("Şimali Amerika");

        qvi.setNameOlke("Qvineya");
        qvi.setPaytaxt("Konakri");
        qvi.setImageId(R.drawable.guinea_640);
        qvi.setEhali("10,221,808");
        qvi.setErazi("24857 (Ərazi Reytinqi: 77)");
        qvi.setDil("Fransız");
        qvi.setValyuta("Frank");
        qvi.setTelKod("");
        qvi.setUDM("4.97 milyard");
        qvi.setQite("Afrika");

        qviB.setNameOlke("Qvineya-Bisau");
        qviB.setPaytaxt("Bisau");
        qviB.setImageId(R.drawable.guinea_bissau_640);
        qviB.setEhali("1,547,061");
        qviB.setErazi("36120 (Ərazi Reytinqi: 137)");
        qviB.setDil("Portuqal");
        qviB.setValyuta("Frank");
        qviB.setTelKod("");
        qviB.setUDM("0.43 milyard");
        qviB.setQite("Afrika");

        lao.setNameOlke("Laos");
        lao.setPaytaxt("Vyentyan");
        lao.setImageId(R.drawable.vietnam_640);
        lao.setEhali("6,288,037");
        lao.setErazi("236800 (Ərazi Reytinqi: 82)");
        lao.setDil("Lao, Fransız, İngilis");
        lao.setValyuta("Kip");
        lao.setTelKod("");
        lao.setUDM("5.326 milyard");
        lao.setQite("Asiya");

        lat.setNameOlke("Latviya");
        lat.setPaytaxt("Riqa");
        lat.setImageId(R.drawable.latvia_640);
        lat.setEhali("2,220,000");
        lat.setErazi("64589 (Ərazi Reytinqi: 125)");
        lat.setDil("Latviyan, Rus");
        lat.setValyuta("Lat");
        lat.setTelKod("");
        lat.setUDM("25.26 milyard");
        lat.setQite("Avropa");

        les.setNameOlke("Lesoto");
        les.setPaytaxt("Masero");
        les.setImageId(R.drawable.lesotho_640);
        les.setEhali("2,193,843");
        les.setErazi("30335 (Ərazi Reytinqi: 141)");
        les.setDil("Sesoto, İngilis");
        les.setValyuta("Loti");
        les.setTelKod("");
        les.setUDM("1.622 milyard");
        les.setQite("Afrika");

        lix.setNameOlke("Lixtenşteyn");
        lix.setPaytaxt("Vaduts");
        lix.setImageId(R.drawable.liechtenstein_640);
        lix.setEhali("36,304");
        lix.setErazi("160 (Ərazi Reytinqi: 214)");
        lix.setDil("Alman");
        lix.setValyuta("Frank");
        lix.setTelKod("");
        lix.setUDM("5.028 milyard");
        lix.setQite("Avropa");

        lit.setNameOlke("Litva");
        lit.setPaytaxt("Vilnüs");
        lit.setImageId(R.drawable.lithuania_640);
        lit.setEhali("3,203,000");
        lit.setErazi("65200 (Ərazi Reytinqi: 124)");
        lit.setDil("Litvaniyan, İngilis");
        lit.setValyuta("Litas");
        lit.setTelKod("");
        lit.setUDM("37.66 milyard");
        lit.setQite("Avropa");

        liv.setNameOlke("Liviya");
        liv.setPaytaxt("Tripoli");
        liv.setImageId(R.drawable.libya_640);
        liv.setEhali("6,422,772");
        liv.setErazi("1759540 (Ərazi Reytinqi: 17)");
        liv.setDil("Ərəb, İtaliyan, İngilis");
        liv.setValyuta("Dinar");
        liv.setTelKod("");
        liv.setUDM("90.82 milyard");
        liv.setQite("Afrika");


        luk.setNameOlke("Lüksemburq");
        luk.setPaytaxt("Lüksemburq");
        luk.setImageId(R.drawable.luxembourg_640);
        luk.setEhali("517,000");
        luk.setErazi("2586 (Ərazi Reytinqi: 175)");
        luk.setDil("Lüksemburqca, Alman");
        luk.setValyuta("Avro");
        luk.setTelKod("");
        luk.setUDM("52.72 milyard");
        luk.setQite("Avropa");


        mac.setNameOlke("Macarıstan");
        mac.setPaytaxt("Budapeşt");
        mac.setImageId(R.drawable.hungary_640);
        mac.setEhali("9,971,000");
        mac.setErazi("93030 (Ərazi Reytinqi: 110)");
        mac.setDil("Macar");
        mac.setValyuta("Forint");
        mac.setTelKod("");
        mac.setUDM("135.2 milyard");
        mac.setQite("Avropa");

        mad.setNameOlke("Madaqaskar");
        mad.setPaytaxt("Antananarivu");
        mad.setImageId(R.drawable.madagascar_640);
        mad.setEhali("21,315,135");
        mad.setErazi("587040 (Ərazi Reytinqi: 46)");
        mad.setDil("İngilis, Fransız, Malaqazi");
        mad.setValyuta("Ariyari");
        mad.setTelKod("");
        mad.setUDM("9.463 milyard");
        mad.setQite("Afrika");

        maka.setNameOlke("Makao");
        maka.setPaytaxt("Makao");
        maka.setImageId(R.drawable.macao_640);
        maka.setEhali("652,500");
        maka.setErazi("30.5 (Ərazi Reytinqi: 235)");
        maka.setDil("Portuqal, Kantonis");
        maka.setValyuta("Ariyari");
        maka.setTelKod("");
        maka.setUDM("80.765 milyard");
        maka.setQite("Asiya");

        make.setNameOlke("Makedoniya");
        make.setPaytaxt("Skopye");
        make.setImageId(R.drawable.macedonia_640);
        make.setEhali("2,063,893");
        make.setErazi("25333 (Ərazi Reytinqi: 149)");
        make.setDil("Makedoniyan, Alban");
        make.setValyuta("Denar");
        make.setTelKod("");
        make.setUDM("9.521 milyard");
        make.setQite("Avropa");

        malav.setNameOlke("Malavi");
        malav.setPaytaxt("Lilonqve");
        malav.setImageId(R.drawable.malawi_640);
        malav.setEhali("15,380,888");
        malav.setErazi("118480 (Ərazi Reytinqi: 101)");
        malav.setDil("Çiçeua, Çinyanya, Çinyao");
        malav.setValyuta("Kuaça");
        malav.setTelKod("");
        malav.setUDM("4.269 milyard");
        malav.setQite("Afrika");

        malay.setNameOlke("Malayziya");
        malay.setPaytaxt("Kuala Lumpur");
        malay.setImageId(R.drawable.malaysia_640);
        malay.setEhali("28,859,154");
        malay.setErazi("329750 (Ərazi Reytinqi: 65)");
        malay.setDil("Bahasa Malayziya, İngilis, Çin");
        malay.setValyuta("Rinqqit");
        malay.setTelKod("");
        malay.setUDM("191.8 milyard");
        malay.setQite("Asiya");

        mald.setNameOlke("Maldiv adaları");
        mald.setPaytaxt("Male");
        mald.setImageId(R.drawable.maldives_640);
        mald.setEhali("320,081");
        mald.setErazi("300 (Ərazi Reytinqi: 205)");
        mald.setDil("Maldiv Divehi ");
        mald.setValyuta("Rufiya");
        mald.setTelKod("");
        mald.setUDM("1.26 milyard");
        mald.setQite("Asiya");


        mali.setNameOlke("Mali");
        mali.setPaytaxt("Bamako");
        mali.setImageId(R.drawable.mali_640);
        mali.setEhali("15,839,538");
        mali.setErazi("1240000 (Ərazi Reytinqi: 24)");
        mali.setDil("Fransız, Bambara ");
        mali.setValyuta("Frank");
        mali.setTelKod("");
        mali.setUDM("8.74 milyard");
        mali.setQite("Afrika");


        malt.setNameOlke("Malta");
        malt.setPaytaxt("La Vallette");
        malt.setImageId(R.drawable.malta_640);
        malt.setEhali("419,000");
        malt.setErazi("316 (Ərazi Reytinqi: 204)");
        malt.setDil("Maltaca, İngilis ");
        malt.setValyuta("Lira");
        malt.setTelKod("");
        malt.setUDM("8.253 milyard");
        malt.setQite("Avropa");

        mavrik.setNameOlke("Mavriki");
        mavrik.setPaytaxt("Port Luiz");
        mavrik.setImageId(R.drawable.mauritius_640);
        mavrik.setEhali("1,261,208");
        mavrik.setErazi("2040 (Ərazi Reytinqi: 179)");
        mavrik.setDil("İngilis ");
        mavrik.setTelKod("");
        mavrik.setValyuta("Mavriki Rupisi");
        mavrik.setUDM("23.322 milyard");
        mavrik.setQite("Afrika");

        mavrit.setNameOlke("Mavritaniya");
        mavrit.setPaytaxt("Naukşot");
        mavrit.setImageId(R.drawable.mauritania_640);
        mavrit.setEhali("3,541,540");
        mavrit.setErazi("1030700 (Ərazi Reytinqi: 29)");
        mavrit.setDil("Ərəb");
        mavrit.setTelKod("");
        mavrit.setValyuta("Ouquiya");
        mavrit.setUDM("3.271 milyard");
        mavrit.setQite("Afrika");


        may.setNameOlke("Mayotta");
        may.setPaytaxt("Mamuduzu");
        may.setImageId(R.drawable.mayotte_640);
        may.setEhali("204,000");
        may.setErazi("374 (Ərazi Reytinqi: 202)");
        may.setDil("Mahoriyan, Fransız");
        may.setValyuta("Avro");
        may.setTelKod("");
        may.setUDM("0.467 milyard");
        may.setQite("Afrika");


        mek.setNameOlke("Meksika");
        mek.setPaytaxt("Mexiko");
        mek.setImageId(R.drawable.mexico_640);
        mek.setEhali("112,336,538");
        mek.setErazi("1972550 (Ərazi Reytinqi: 14)");
        mek.setDil("İspan");
        mek.setTelKod("");
        mek.setValyuta("Peso");
        mek.setUDM("1,021 milyard");
        mek.setQite("Şimali Amerika");

        men.setNameOlke("Men adası");
        men.setPaytaxt("Duqlas");
        men.setImageId(R.drawable.isle_of_man_640);
        men.setEhali("84,336");
        men.setTelKod("");
        men.setErazi("572 (Ərazi Reytinqi: 194)");
        men.setDil("İngilis");
        men.setValyuta("Pound");
        men.setUDM("4.1 milyard");
        men.setQite("Avropa");

        mer.setNameOlke("Mərakeş");
        mer.setPaytaxt("Rabat");
        mer.setImageId(R.drawable.morocco_640);
        mer.setEhali("32,272,974");
        mer.setErazi("446550 (Ərazi Reytinqi: 57)");
        mer.setDil("Ərəb");
        mer.setTelKod("");
        mer.setValyuta("Dirhəm");
        mer.setUDM("90.31 milyard");
        mer.setQite("Afrika");

        mar.setNameOlke("Mərkəzi Afrika Respublikası");
        mar.setPaytaxt("Bangi");
        mar.setImageId(R.drawable.central_african_republic_640);
        mar.setEhali("4,486,837");
        mar.setErazi("622984 (Ərazi Reytinqi: 43)");
        mar.setDil("Fransız");
        mar.setTelKod("");
        mar.setValyuta("Frank");
        mar.setUDM("1.988 milyard");
        mar.setQite("Afrika");


        mik.setNameOlke("Mikroneziya");
        mik.setPaytaxt("Palikir");
        mik.setImageId(R.drawable.micronesia_640);
        mik.setEhali("111,542");
        mik.setErazi("702 (Ərazi Reytinqi: 188)");
        mik.setDil("İngilis");
        mik.setValyuta("Dollar");
        mik.setUDM("0.238 milyard");
        mik.setQite("Avstraliya");

        mis.setNameOlke("Misir");
        mis.setPaytaxt("Qahirə");
        mis.setImageId(R.drawable.egypt_640);
        mis.setEhali("82,536,770");
        mis.setErazi("1001450 (Ərazi Reytinqi: 30)");
        mis.setDil("Ərəb");
        mis.setValyuta("Pound");
        mis.setUDM("187 milyard");
        mis.setQite("Afrika");

        mol.setNameOlke("Moldova");
        mol.setPaytaxt("Kişinyov");
        mol.setImageId(R.drawable.moldova_640);
        mol.setEhali("3,559,000");
        mol.setErazi("33843 (Ərazi Reytinqi: 139)");
        mol.setDil("Moldovan");
        mol.setValyuta("Leu");
        mol.setUDM("6.047 milyard");
        mol.setQite("Avropa");

        mona.setNameOlke("Monako");
        mona.setPaytaxt("Monako");
        mona.setImageId(R.drawable.monaco_640);
        mona.setEhali("35,427");
        mona.setErazi("1 (Ərazi Reytinqi: 224)");
        mona.setDil("Fransız");
        mona.setValyuta("Avro");
        mona.setUDM("6.919 milyard");
        mona.setQite("Avropa");

        monq.setNameOlke("Monqolustan");
        monq.setPaytaxt("Ulan-Bator");
        monq.setImageId(R.drawable.mongolia_640);
        monq.setEhali("2,800,114");
        monq.setErazi("1564116 (Ərazi Reytinqi: 19)");
        monq.setDil("Xalxa Monqol, Türk");
        monq.setValyuta("Toqroq");
        monq.setUDM("5.259 milyard");
        monq.setQite("Asiya");

        mont.setNameOlke("Montserrat");
        mont.setPaytaxt("Plimut");
        mont.setImageId(R.drawable.montserrat_640);
        mont.setEhali("5,900");
        mont.setErazi("102 (Ərazi Reytinqi: 216)");
        mont.setDil("İngilis");
        mont.setValyuta("Dollar");
        mont.setUDM("0.049 milyard");
        mont.setQite("Şimali Amerika");

//
        moz.setNameOlke("Mozambik");
        moz.setPaytaxt("Maputo");
        moz.setImageId(R.drawable.mozambique_640);
        moz.setEhali("23,929,708");
        moz.setErazi("801590 (Ərazi Reytinqi: 36)");
        moz.setDil("İmaxua, Xiçanqaana, Portuqal");
        moz.setValyuta("Metikal");
        moz.setUDM("9.84 milyard");
        moz.setQite("Afrika");

        mya.setNameOlke("Myanma");
        mya.setPaytaxt("Naypyida");
        mya.setImageId(R.drawable.myanmar_640);

        nam.setNameOlke("Namibiya");
        nam.setPaytaxt("Vindhuk");
        nam.setImageId(R.drawable.namibia_640);

        nau.setNameOlke("Nauru");
        nau.setPaytaxt("Yaren");
        nau.setImageId(R.drawable.nauru_640);

        nep.setNameOlke("Nepal");
        nep.setPaytaxt("Kartmandu");
        nep.setImageId(R.drawable.nepal_640);

        nig.setNameOlke("Niger");
        nig.setPaytaxt("Niamey");
        nig.setImageId(R.drawable.niger_640);

//
//
//
//

//
//
//
//
//
        mOlkeler.add(abs);
        mOlkeler.add(ams);
        mOlkeler.add(anqi);
        mOlkeler.add(alb);
        mOlkeler.add(alm);
        mOlkeler.add(and);
        mOlkeler.add(anq);
        mOlkeler.add(antbar);
        mOlkeler.add(arg);
        mOlkeler.add(avsa);
        mOlkeler.add(avs);
        mOlkeler.add(aze);
        mOlkeler.add(bah);
        mOlkeler.add(ban);
        mOlkeler.add(bel);
        mOlkeler.add(belc);
        mOlkeler.add(beli);
             mOlkeler.add(ber);
        mOlkeler.add(bee);
        mOlkeler.add(ben);
        mOlkeler.add(beh);
        mOlkeler.add(bol);
        mOlkeler.add(bolq);
        mOlkeler.add(bot);
        mOlkeler.add(bra);
//
        mOlkeler.add(bur);
        mOlkeler.add(buru);
        mOlkeler.add(butan);
        mOlkeler.add(car);
        mOlkeler.add(cer);
        mOlkeler.add(ceb);
        mOlkeler.add(cenS);
        mOlkeler.add(cib);
        mOlkeler.add(cad);
        mOlkeler.add(cex);
        mOlkeler.add(cili);
        mOlkeler.add(cin);
        mOlkeler.add(dan);
        mOlkeler.add(dom);
        mOlkeler.add(domR);
        mOlkeler.add(efi);
        mOlkeler.add(efir);
        mOlkeler.add(ekv);
        mOlkeler.add(ekva);
        mOlkeler.add(erm);
        mOlkeler.add(est);
        mOlkeler.add(efq);
        mOlkeler.add(elc);
        mOlkeler.add(far);
//        mOlkeler.add(fel);
        mOlkeler.add(fil);
        mOlkeler.add(fin);
          mOlkeler.add(fra);
        mOlkeler.add(hai);
        mOlkeler.add(hin);
        mOlkeler.add(hond);
        mOlkeler.add(honk);
        mOlkeler.add(xor);
        mOlkeler.add(ind);
        mOlkeler.add(iraq);
        mOlkeler.add(ira);
        mOlkeler.add(irl);
        mOlkeler.add(isp);
        mOlkeler.add(isv);
        mOlkeler.add(ita);
        mOlkeler.add(kamb);
        mOlkeler.add(kam);
        mOlkeler.add(kan);
        mOlkeler.add(kay);
        mOlkeler.add(ken);
        mOlkeler.add(kip);
        mOlkeler.add(kir);
        mOlkeler.add(kok);
        mOlkeler.add(kol);
        mOlkeler.add(kom);
        mOlkeler.add(konD);
        mOlkeler.add(konR);
        mOlkeler.add(korX);
        mOlkeler.add(korR);
        mOlkeler.add(kub);
        mOlkeler.add(kuk);
        mOlkeler.add(kuv);
        mOlkeler.add(qab);
        mOlkeler.add(qam);
        mOlkeler.add(qar);
        mOlkeler.add(qaz);
        mOlkeler.add(qet);
        mOlkeler.add(qir);
        mOlkeler.add(qrena);
        mOlkeler.add(qren);
        mOlkeler.add(qva);
        mOlkeler.add(qvi);
        mOlkeler.add(qviB);
        mOlkeler.add(lao);
        mOlkeler.add(lat);
        mOlkeler.add(les);
        mOlkeler.add(lix);
        mOlkeler.add(lit);
        mOlkeler.add(liv);
        mOlkeler.add(luk);
        mOlkeler.add(mac);
        mOlkeler.add(mad);
        mOlkeler.add(maka);
        mOlkeler.add(make);
        mOlkeler.add(malav);
        mOlkeler.add(malay);
        mOlkeler.add(mald);
        mOlkeler.add(mali);
        mOlkeler.add(malt);
        mOlkeler.add(mar);
        mOlkeler.add(mavrik);
        mOlkeler.add(mavrit);
        mOlkeler.add(may);
        mOlkeler.add(mek);
        mOlkeler.add(men);
        mOlkeler.add(mer);
        mOlkeler.add(mik);
        mOlkeler.add(mis);
        mOlkeler.add(mol);
        mOlkeler.add(mona);
        mOlkeler.add(monq);
        mOlkeler.add(mont);
        mOlkeler.add(moz);
        mOlkeler.add(mya);
//
//        mOlkeler.add(nam);
//        mOlkeler.add(nau);
//        mOlkeler.add(nep);
//        mOlkeler.add(nid);
//        mOlkeler.add(nig);
//        mOlkeler.add(nige);
//        mOlkeler.add(nik);
//        mOlkeler.add(niu);
//        mOlkeler.add(nor);
//        mOlkeler.add(norv);
////
//





    }
    public static CountryLab get(Context c) {
        if (sCountryLab == null) {
            sCountryLab = new CountryLab(c.getApplicationContext());
        }

        return sCountryLab;
    }
    public ArrayList<Countries> getOlkeler(){
        return mOlkeler;
    }

    public Countries getOlke(UUID id){
        for(Countries o :  mOlkeler){
            if(o.getId().equals(id))
                return o;
        }
        return null;
    }
}
