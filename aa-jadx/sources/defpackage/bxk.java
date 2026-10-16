package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bxk {
    public final defpackage.bvm a;
    public final boolean b;
    public final defpackage.byo c;
    public final defpackage.affc d;
    public final boolean e;
    public final java.lang.Object f;
    public boolean g = true;

    public bxk(defpackage.bvm bvmVar, java.lang.Object obj, boolean z, defpackage.byo byoVar, defpackage.affc affcVar, boolean z2) {
        this.a = bvmVar;
        this.b = z;
        this.c = byoVar;
        this.d = affcVar;
        this.e = z2;
        this.f = obj;
    }

    public final java.lang.Object a() {
        if (this.b) {
            return null;
        }
        java.lang.Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        defpackage.bvg.a("Unexpected form of a provided value");
        throw new defpackage.afap();
    }
}
