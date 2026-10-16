package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fdr {
    public static final defpackage.fdr a;
    private static final defpackage.fdr e;
    public final defpackage.fdq b;
    public final defpackage.affc c;
    public defpackage.fdl d;

    static {
        defpackage.fdr fdrVar = new defpackage.fdr(defpackage.fdj.a, new defpackage.cyw(20));
        e = fdrVar;
        a = fdrVar;
    }

    public fdr(defpackage.fdq fdqVar, defpackage.affc affcVar) {
        defpackage.fdl fdlVar;
        this.b = fdqVar;
        this.c = affcVar;
        if (fdqVar.g) {
            fdlVar = defpackage.fdj.b;
        } else {
            android.os.Process.myPid();
            hh$.ExternalSyntheticApiModelOutline0.m();
            synchronized (fdqVar.f) {
                if (!fdqVar.g) {
                    defpackage.fdj.b = new defpackage.fdl(fdqVar);
                    fdqVar.g = true;
                }
            }
            fdlVar = defpackage.fdj.b;
        }
        this.d = fdlVar;
    }

    public final void a(java.lang.String str) {
        ((java.lang.Boolean) this.c.invoke(str)).booleanValue();
    }
}
