package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cye {
    public defpackage.cge a;
    public int b;
    public boolean c;
    final /* synthetic */ defpackage.cyg d;
    public defpackage.aan e;
    public defpackage.aan f;

    public cye(defpackage.cyg cygVar, defpackage.cge cgeVar, int i, defpackage.aan aanVar, defpackage.aan aanVar2, boolean z) {
        this.d = cygVar;
        this.a = cgeVar;
        this.b = i;
        this.e = aanVar;
        this.f = aanVar2;
        this.c = z;
    }

    public final boolean a(int i, int i2) {
        return defpackage.dai.B((defpackage.cgd) this.e.c(this.b + i), (defpackage.cgd) this.f.c(this.b + i2)) != 0;
    }
}
