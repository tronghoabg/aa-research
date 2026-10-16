package defpackage;

import com.google.android.projection.gearhead.R;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;

/* loaded from: classes2.dex */
public final class mqv {
    public static final yph a = yph.c("GH.OemExit");
    public static final ygr b = ygr.r("bmw", "bmwi", "bmwm", "bmw_m");
    public static final yfy c;
    private static final ygr d;

    static {
        ygp ygpVar = new ygp();
        ygpVar.c("AVAN");
        ygpVar.c("AVATR");
        ygpVar.c("BMW M");
        ygpVar.c("BMW");
        ygpVar.c("BMWI");
        ygpVar.c("BMWM");
        ygpVar.c("BYD");
        ygpVar.c("carrozzeria");
        ygpVar.c("CEER");
        ygpVar.c("CHERY");
        ygpVar.c("CHETA");
        ygpVar.c("COUGAR");
        ygpVar.c("CUPRA");
        ygpVar.c("CVTE");
        ygpVar.c("DAF");
        ygpVar.c("DAIHATSU");
        ygpVar.c("DENZA");
        ygpVar.c("dr");
        ygpVar.c("DS");
        ygpVar.c("EBRO");
        ygpVar.c("EXLANTIX");
        ygpVar.c("FOXTRON");
        ygpVar.c("FUSO");
        ygpVar.c("FX11");
        ygpVar.c("GAC");
        ygpVar.c("GR");
        ygpVar.c("GWM TANK");
        ygpVar.c("GWM");
        ygpVar.c("IDV");
        ygpVar.c("ISUZU");
        ygpVar.c("IVECO");
        ygpVar.c("JBL");
        ygpVar.c("JETOUR");
        ygpVar.c("JMEV");
        ygpVar.c("KENWOOD");
        ygpVar.c("KGM");
        ygpVar.c("LDV");
        ygpVar.c("LEAPMOTOR");
        ygpVar.c("LEPAR");
        ygpVar.c("LEPAS");
        ygpVar.c("LINKTOUR");
        ygpVar.c("LUCID");
        ygpVar.c("MACK");
        ygpVar.c("MACROM");
        ygpVar.c("MAN");
        ygpVar.c("MBUX");
        ygpVar.c("MG");
        ygpVar.c("MINI");
        ygpVar.c("NEVO");
        ygpVar.c("OMODA");
        ygpVar.c("ORA");
        ygpVar.c("POER");
        ygpVar.c("PTW AS");
        ygpVar.c("RAM");
        ygpVar.c("RELY");
        ygpVar.c("RIZON");
        ygpVar.c("RKM");
        ygpVar.c("ROEWE");
        ygpVar.c("RR");
        ygpVar.c("RSM");
        ygpVar.c("SEAT");
        ygpVar.c("SKODA");
        ygpVar.c("smart");
        ygpVar.c("SPORTEQUIPE");
        ygpVar.c("SSL");
        ygpVar.c("SUBARU");
        ygpVar.c("SYMC");
        ygpVar.c("SYNC");
        ygpVar.c("TANK");
        ygpVar.c("TENET");
        ygpVar.c("TVS");
        ygpVar.c("UNI");
        ygpVar.c("VIDA");
        ygpVar.c("VW");
        ygpVar.c("WEY");
        ygpVar.c("XZENT");
        ygpVar.c("ZEEKR");
        ygpVar.c("ZENEC");
        ygpVar.c("ŠKODA");
        d = ygpVar.g();
        yfu yfuVar = new yfu(4);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_oem_stellantis);
        yfuVar.e("abarth", numValueOf);
        yfuVar.e("acr_braendli_&_voegeli_ag", Integer.valueOf(R.drawable.ic_oem_acr));
        yfuVar.e("adayo", Integer.valueOf(R.drawable.ic_oem_foryou));
        yfuVar.e("aidefu001", Integer.valueOf(R.drawable.ic_oem_nakamichi));
        yfuVar.e("alfa_romeo", numValueOf);
        yfuVar.e("alps_alpine_co.,_ltd.", Integer.valueOf(R.drawable.ic_oem_alpine));
        yfuVar.e("au", Integer.valueOf(R.drawable.ic_oem_audi));
        yfuVar.e("autobianchi", numValueOf);
        yfuVar.e("bentley_motors_limited", Integer.valueOf(R.drawable.ic_oem_bentley));
        yfuVar.e("boss_audio_systems", Integer.valueOf(R.drawable.ic_oem_boss_audio));
        Integer numValueOf2 = Integer.valueOf(R.drawable.ic_oem_chery_3dot0);
        yfuVar.e("caoa_chery", numValueOf2);
        Integer numValueOf3 = Integer.valueOf(R.drawable.ic_oem_generic_chery);
        yfuVar.e("chery2.0", numValueOf3);
        yfuVar.e("chery3.0", numValueOf2);
        yfuVar.e("chery_automobile_co.,ltd", Integer.valueOf(R.drawable.ic_oem_chery_automobile_co));
        yfuVar.e("chery_jetour", Integer.valueOf(R.drawable.ic_oem_jetour));
        yfuVar.e("china_faw_group_co.,ltd.", Integer.valueOf(R.drawable.ic_oem_hongqi));
        yfuVar.e("chirey2.0", numValueOf2);
        yfuVar.e("chongqing_changan_automobile_co.,ltd.", Integer.valueOf(R.drawable.ic_oem_chongqing_changan_automobile));
        yfuVar.e("citroen", numValueOf);
        yfuVar.e("cu", Integer.valueOf(R.drawable.ic_oem_cupra));
        Integer numValueOf4 = Integer.valueOf(R.drawable.ic_oem_byd);
        yfuVar.e("danza", numValueOf4);
        yfuVar.e("denza", numValueOf4);
        Integer numValueOf5 = Integer.valueOf(R.drawable.ic_oem_chery_back);
        yfuVar.e("dr2.0", numValueOf5);
        yfuVar.e("ds", numValueOf);
        yfuVar.e("e.go", Integer.valueOf(R.drawable.ic_oem_e_go));
        yfuVar.e("ebro", numValueOf5);
        yfuVar.e("ecoda", numValueOf3);
        yfuVar.e("emta", numValueOf5);
        yfuVar.e("exlantix", Integer.valueOf(R.drawable.ic_oem_exeed_sa));
        yfuVar.e("fiat", numValueOf);
        yfuVar.e("fiat_professional", numValueOf);
        yfuVar.e("ford_otomotiv_sanayi_a.Ş", Integer.valueOf(R.drawable.ic_oem_ford_trucks));
        yfuVar.e("fownix", numValueOf3);
        yfuVar.e("fownix2.0", numValueOf2);
        yfuVar.e("freelander", numValueOf5);
        yfuVar.e("gac_motor_co.,_ltd.", Integer.valueOf(R.drawable.ic_oem_gac));
        yfuVar.e("guangzhou_liuhuan_information_technology_co.,_ltd.", Integer.valueOf(R.drawable.ic_oem_cviauto));
        yfuVar.e("guangzhou_xiaopeng_motors_technology_co._ltd.", Integer.valueOf(R.drawable.ic_oem_guangzhou_xiaopeng_motors_technology_co_ltd));
        Integer numValueOf6 = Integer.valueOf(R.drawable.ic_oem_gwm);
        yfuVar.e("gwm_tank", numValueOf6);
        Integer numValueOf7 = Integer.valueOf(R.drawable.ic_oem_harley_davidson);
        yfuVar.e("harley-davidson", numValueOf7);
        yfuVar.e("harley_davidson,_inc.", numValueOf7);
        yfuVar.e("haval", numValueOf6);
        yfuVar.e("hyundai_(connect_c_platform)", Integer.valueOf(R.drawable.ic_oem_hyundai_c));
        yfuVar.e("icaur", Integer.valueOf(R.drawable.ic_oem_chery));
        yfuVar.e("isuzu_trucks", Integer.valueOf(R.drawable.ic_oem_ud_trucks));
        yfuVar.e("j90aeu", Integer.valueOf(R.drawable.ic_oem_mazda));
        yfuVar.e("jaecoo", numValueOf5);
        yfuVar.e("jaecoo2.0", numValueOf5);
        yfuVar.e("jaecoo3.0", numValueOf3);
        yfuVar.e("jeep", numValueOf);
        yfuVar.e("kaiyi_fx12", Integer.valueOf(R.drawable.ic_oem_kaiyi));
        yfuVar.e("kia_(connect_c_platform)", Integer.valueOf(R.drawable.ic_oem_kia_connect_c_platform));
        yfuVar.e("kia_motor", Integer.valueOf(R.drawable.ic_oem_kia));
        yfuVar.e("lepar2.0", numValueOf5);
        yfuVar.e("lepas2.0", numValueOf5);
        yfuVar.e("lotus_cars_limited", Integer.valueOf(R.drawable.ic_oem_lotus));
        yfuVar.e("lynk&co", Integer.valueOf(R.drawable.ic_oem_lynk_and_co));
        yfuVar.e("mahindra_&_mahindra", Integer.valueOf(R.drawable.ic_oem_mahindra));
        yfuVar.e("maruti_suzuki_india", Integer.valueOf(R.drawable.ic_oem_suzuki_2));
        Integer numValueOf8 = Integer.valueOf(R.drawable.ic_oem_maxmade_auto_electronics_co_ltd);
        yfuVar.e("maxmade_auto_electronics_co.,_ltd.", numValueOf8);
        Integer numValueOf9 = Integer.valueOf(R.drawable.ic_oem_smart);
        yfuVar.e("mercedes_benz_ag_brand:smart", numValueOf9);
        yfuVar.e("mitsubishi", Integer.valueOf(R.drawable.ic_oem_jbl_mitsubishi));
        yfuVar.e("mmauto", numValueOf8);
        yfuVar.e("mn", Integer.valueOf(R.drawable.ic_oem_man));
        yfuVar.e("mtc+", Integer.valueOf(R.drawable.ic_oem_maserati));
        yfuVar.e("nakamichi_2.0", Integer.valueOf(R.drawable.ic_oem_nakamichi_2_dot_0));
        yfuVar.e("nissan_motor_corporation", Integer.valueOf(R.drawable.ic_oem_nissan));
        yfuVar.e("noting", Integer.valueOf(R.drawable.ic_oem_daf));
        yfuVar.e("omoda2.0", numValueOf5);
        yfuVar.e("omoda3.0", numValueOf3);
        yfuVar.e("onives", numValueOf3);
        yfuVar.e("opel", numValueOf);
        yfuVar.e("ora", numValueOf6);
        yfuVar.e("peugeot", numValueOf);
        yfuVar.e("po", Integer.valueOf(R.drawable.ic_oem_porsche));
        yfuVar.e("poer", numValueOf6);
        yfuVar.e("pt.toyota", Integer.valueOf(R.drawable.ic_oem_pt_toyota));
        yfuVar.e("ram", numValueOf);
        yfuVar.e("rely", numValueOf2);
        yfuVar.e("rkm", Integer.valueOf(R.drawable.ic_oem_renault));
        Integer numValueOf10 = Integer.valueOf(R.drawable.ic_oem_saic_gm);
        yfuVar.e("saic_gm_wuling_automobile_co.,_ltd", numValueOf10);
        yfuVar.e("saic_gm_wuling_automobile_co.,ltd", numValueOf10);
        yfuVar.e("saic_maxus_automotive_co.,_ltd", Integer.valueOf(R.drawable.ic_oem_saic_maxus_auto));
        Integer numValueOf11 = Integer.valueOf(R.drawable.ic_oem_saicmotor_passenger_vehicle);
        yfuVar.e("saic_motor_overseas_intelligent_mobility_technology_co.,_ltd.", numValueOf11);
        yfuVar.e("saicmotor_passenger_vehicle_co._ltd.", numValueOf11);
        yfuVar.e("se", Integer.valueOf(R.drawable.ic_oem_seat));
        Integer numValueOf12 = Integer.valueOf(R.drawable.ic_oem_skoda);
        yfuVar.e("sk", numValueOf12);
        yfuVar.e("skoda_auto_a.s.", numValueOf12);
        yfuVar.e("soueast", numValueOf2);
        yfuVar.e("ssl", Integer.valueOf(R.drawable.ic_oem_sound_storm_labs));
        yfuVar.e("stla_fiat", numValueOf);
        yfuVar.e("stla_peugeot", numValueOf);
        yfuVar.e("stla_ram", numValueOf);
        Integer numValueOf13 = Integer.valueOf(R.drawable.ic_oem_ford);
        yfuVar.e("sync", numValueOf13);
        yfuVar.e("tank", numValueOf6);
        yfuVar.e("test_make", numValueOf9);
        yfuVar.e("tm", numValueOf13);
        yfuVar.e("toyota_gtmc", Integer.valueOf(R.drawable.ic_oem_toyota));
        yfuVar.e("vauxhall", numValueOf);
        yfuVar.e("vinfast_trading_and_production_llc", Integer.valueOf(R.drawable.ic_oem_vinfast));
        Integer numValueOf14 = Integer.valueOf(R.drawable.ic_oem_volkswagen);
        yfuVar.e("vn", numValueOf14);
        yfuVar.e("volkswagen_ag", numValueOf14);
        yfuVar.e("volkswagen_caminhões_e_Ônibus", Integer.valueOf(R.drawable.ic_oem_vw_bus_br));
        yfuVar.e("volvo_trucks_north_america", Integer.valueOf(R.drawable.ic_oem_volvo_trucks));
        yfuVar.e("vw", numValueOf14);
        yfuVar.e("wey", numValueOf6);
        yfuVar.e("yangwang", numValueOf4);
        yfuVar.e("zhejiang_geely_farizon_new_energy_commercial_vehicle_group_co.,_ltd.", Integer.valueOf(R.drawable.ic_oem_zhejiang_geely_farizon_new_energy_commercial_vehicle_group_co));
        yfuVar.e("Škoda", numValueOf12);
        yfuVar.e("르노삼성", Integer.valueOf(R.drawable.ic_oem_rsm));
        c = yfuVar.d(true);
    }

    public static int a(int i) {
        return i == 3 ? R.drawable.ic_applauncher_exit_icon_motorcycle : R.drawable.ic_applauncher_exit_icon;
    }

    public static String b(String str) {
        if (!acxa.M().b.contains(str) && (d.contains(str) || acxa.Q().b.contains(str))) {
            ((ype) a.l().ai((char) 5208)).y("%s excluded for pretty print", str);
            return str;
        }
        if (woy.ar(str).equals(str) || woy.as(str).equals(str)) {
            return (String) DesugarArrays.stream(str.split("\\s+")).map(new miw(17)).collect(Collectors.joining(" "));
        }
        ((ype) a.l().ai((char) 5207)).y("%s doesn't need to be pretty printed", str);
        return str;
    }

    public static boolean c(int i) {
        return i == R.drawable.ic_applauncher_exit_icon || i == R.drawable.ic_applauncher_exit_icon_motorcycle;
    }

    public static boolean d(String str) {
        if (xyb.a(str)) {
            ((ype) a.l().ai((char) 5206)).y("%s discarded as OEM label: empty or null", str);
            return false;
        }
        if (!acxa.O().b.contains(str)) {
            return true;
        }
        ((ype) a.l().ai((char) 5205)).y("%s is in denylist for label", str);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.EXIT_APP, yzy.lu).l());
        return false;
    }
}
