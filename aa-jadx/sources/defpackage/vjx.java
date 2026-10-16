package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class vjx {
    public vjx(android.content.Context context) {
        context.getContentResolver();
    }

    public static android.os.Bundle a(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(defpackage.vjx.class.getClassLoader());
        android.os.Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(defpackage.vjx.class.getClassLoader());
        return bundle2;
    }

    public static android.os.Bundle b(android.os.Bundle bundle) {
        bundle.setClassLoader(defpackage.vjx.class.getClassLoader());
        android.os.Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        bundle2.setClassLoader(defpackage.vjx.class.getClassLoader());
        return bundle2;
    }

    public static android.os.Parcelable c(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundleA = a(bundle);
        if (bundleA == null) {
            return null;
        }
        return bundleA.getParcelable(str);
    }

    public static void d(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        android.os.Bundle bundleA = a(bundle);
        if (bundleA != null) {
            android.os.Bundle bundleB = b(bundle2);
            android.os.Parcelable parcelable = bundleA.getParcelable("MapOptions");
            if (parcelable != null) {
                bundleB.putParcelable("MapOptions", parcelable);
            }
            android.os.Parcelable parcelable2 = bundleA.getParcelable("StreetViewPanoramaOptions");
            if (parcelable2 != null) {
                bundleB.putParcelable("StreetViewPanoramaOptions", parcelable2);
            }
            android.os.Parcelable parcelable3 = bundleA.getParcelable("camera");
            if (parcelable3 != null) {
                bundleB.putParcelable("camera", parcelable3);
            }
            if (bundleA.containsKey("indoor_state")) {
                bundleB.putBundle("indoor_state", bundleA.getBundle("indoor_state"));
            }
            if (bundleA.containsKey("lat_lng_bounds")) {
                bundleB.putParcelable("lat_lng_bounds", bundleA.getParcelable("lat_lng_bounds"));
            }
            if (bundleA.containsKey("paddings")) {
                bundleB.putIntegerArrayList("paddings", bundleA.getIntegerArrayList("paddings"));
            }
            if (bundleA.containsKey("compass_enabled")) {
                bundleB.putBoolean("compass_enabled", bundleA.getBoolean("compass_enabled"));
            }
            if (bundleA.containsKey("min_zoom_preference")) {
                bundleB.putFloat("min_zoom_preference", bundleA.getFloat("min_zoom_preference"));
            }
            if (bundleA.containsKey("max_zoom_preference")) {
                bundleB.putFloat("max_zoom_preference", bundleA.getFloat("max_zoom_preference"));
            }
            bundle2.putBundle("map_state", bundleB);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void e(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable parcelable) {
        android.os.Bundle bundleB = b(bundle);
        bundleB.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundleB);
    }

    public static byte h(java.lang.Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static java.lang.Boolean i(byte b) {
        if (b == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return java.lang.Boolean.TRUE;
    }

    public static int j(double d) {
        return (int) java.lang.Math.round(d * 1.0E7d);
    }

    public static boolean k(defpackage.zqm zqmVar) {
        defpackage.zqi zqiVar = defpackage.vdt.a(zqmVar).a.d;
        if (zqiVar == null) {
            zqiVar = defpackage.zqi.a;
        }
        int iAp = defpackage.a.ap(zqiVar.c);
        return iAp != 0 && iAp == 3;
    }

    public static defpackage.zqk l(defpackage.zqj zqjVar) {
        if (zqjVar.b.B()) {
            return defpackage.zqk.a;
        }
        try {
            return (defpackage.zqk) defpackage.abox.y(defpackage.zqk.a, zqjVar.b, defpackage.abol.a);
        } catch (defpackage.abpp unused) {
            return defpackage.zqk.a;
        }
    }

    public static defpackage.swx m(defpackage.zhs zhsVar) {
        defpackage.gkc gkcVar = new defpackage.gkc((char[]) null, (byte[]) null);
        defpackage.lhe lheVar = new defpackage.lhe((defpackage.gkc) gkcVar.a);
        defpackage.ysr.cy(zhsVar, new defpackage.vbs(lheVar, zhsVar, gkcVar), defpackage.zgt.INSTANCE);
        return (defpackage.swx) lheVar.a;
    }

    public static defpackage.vav n(java.lang.Object obj) {
        return new defpackage.vax(obj).a;
    }

    public static defpackage.adjz o(defpackage.ygw ygwVar) {
        return new defpackage.zjp(new defpackage.uyq(ygwVar, 2), defpackage.abpy.class, defpackage.abpy.class);
    }

    public static java.util.Locale p(android.content.Context context) {
        java.util.Locale localeE = defpackage.ebl.t(context.getApplicationContext().getResources().getConfiguration()).e(0);
        if (localeE != null) {
            return localeE;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        locale.getClass();
        return locale;
    }

    public vjx(byte[] bArr) {
    }

    private vjx() {
    }

    public void f(defpackage.vkp vkpVar) {
    }

    public void g(double d) {
    }
}
