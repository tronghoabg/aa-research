package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vbh {
    private static defpackage.xyn a = defpackage.xxe.a;

    public static int a(android.content.Context context) {
        java.lang.Integer numValueOf = (java.lang.Integer) a.e();
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(((android.app.ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion);
            a = defpackage.xyn.h(numValueOf);
        }
        return numValueOf.intValue();
    }
}
