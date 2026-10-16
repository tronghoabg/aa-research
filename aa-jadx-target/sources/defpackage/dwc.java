package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dwc {
    public static final /* synthetic */ int a = 0;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            bgp$.ExternalSyntheticApiModelOutline0.m(30);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            bgp$.ExternalSyntheticApiModelOutline0.m(31);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            bgp$.ExternalSyntheticApiModelOutline0.m(33);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            bgp$.ExternalSyntheticApiModelOutline0.m(1000000);
        }
    }

    public static final boolean a(java.lang.String str, java.lang.String str2) {
        if (defpackage.afga.f("REL", str2)) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.US;
        locale.getClass();
        java.lang.String upperCase = str2.toUpperCase(locale);
        upperCase.getClass();
        java.util.Locale locale2 = java.util.Locale.US;
        locale2.getClass();
        java.lang.String upperCase2 = str.toUpperCase(locale2);
        upperCase2.getClass();
        java.lang.Integer numB = b(upperCase);
        java.lang.Integer numB2 = b(upperCase2);
        if (numB != null && numB2 != null) {
            numB.intValue();
            numB2.intValue();
            return true;
        }
        if (numB == null && numB2 == null) {
            return upperCase.compareTo(upperCase2) >= 0;
        }
        return numB != null;
    }

    private static final java.lang.Integer b(java.lang.String str) {
        return defpackage.afga.f(str, "BAKLAVA") ? 0 : null;
    }
}
