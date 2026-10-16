package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwz extends defpackage.rxb {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.CarServiceBroker");
    private final android.content.Context c;
    private final defpackage.qvl d;
    private final defpackage.sak e;
    private final defpackage.slj f;

    public rwz(android.content.Context context, defpackage.qvl qvlVar, defpackage.sak sakVar, defpackage.slj sljVar) {
        this.c = context;
        this.d = qvlVar;
        this.e = sakVar;
        this.f = sljVar;
    }

    @Override // defpackage.rxc
    public final defpackage.qvl a(android.os.Bundle bundle) {
        if (android.os.Binder.getCallingUid() == android.os.Process.myUid() && android.os.Binder.getCallingPid() == android.os.Process.myPid()) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 8473)).u("Allowing self process.");
            return this.d;
        }
        java.lang.String[] packagesForUid = this.c.getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
        if (packagesForUid == null || (packagesForUid.length) <= 0) {
            throw new java.lang.IllegalStateException("Could not find calling package");
        }
        for (java.lang.String str : packagesForUid) {
            if (this.f.b(str)) {
                str.getClass();
                if (defpackage.sal.d.contains(str) || (defpackage.afga.f(str, "com.google.android.googlequicksearchbox") && android.os.Build.VERSION.SDK_INT <= 30)) {
                    defpackage.sal.c.l().y("Package validated: %s", new defpackage.zkf(defpackage.zke.a, str));
                    return this.d;
                }
                defpackage.sal.c.h().y("Package NOT validated: %s", new defpackage.zkf(defpackage.zke.a, str));
            }
        }
        throw new java.lang.IllegalStateException("Calling package not allowed");
    }
}
