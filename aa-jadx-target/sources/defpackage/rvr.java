package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rvr {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.SECURITY");
    private static defpackage.rvr b;
    private java.lang.Boolean c;

    public static synchronized defpackage.rvr a() {
        defpackage.rvr rvrVar;
        rvrVar = b;
        if (rvrVar == null) {
            rvrVar = new defpackage.rvr();
            b = rvrVar;
        }
        return rvrVar;
    }

    static final boolean d(java.util.Set set) {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8378).u("Installed security providers:");
        for (java.security.Provider provider : java.security.Security.getProviders()) {
            yqkVar.l().ai(8381).y("%s", provider);
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equalsIgnoreCase("AES/CBC/PKCS5Padding")) {
                try {
                    java.security.cert.CertificateFactory.getInstance("X.509");
                    return true;
                } catch (java.security.cert.CertificateException unused) {
                    a.l().ai(8379).u("Installed providers do not support constructing certificate objects");
                    return false;
                }
            }
        }
        yqkVar.l().ai(8380).y("%s not available on device", "AES/CBC/PKCS5Padding");
        return false;
    }

    public final synchronized java.lang.Boolean b() {
        return this.c;
    }

    public final synchronized boolean c(android.content.Context context) {
        if (this.c == null) {
            defpackage.rly.a(defpackage.rtg.a);
            a.l().ai(8375).u("Installing 0 or more security provider updates on device");
            try {
                defpackage.swb.a(context);
            } catch (defpackage.slg e) {
                a.g().p(e).ai(8377).u("GMS not available!");
            } catch (defpackage.slh e2) {
                a.l().p(e2).ai(8376).u("Unable to update security provider as GMS is out of date");
            }
            this.c = java.lang.Boolean.valueOf(d(java.security.Security.getAlgorithms("Cipher")));
            defpackage.rly.a(defpackage.rtg.a);
        }
        return this.c.booleanValue();
    }
}
