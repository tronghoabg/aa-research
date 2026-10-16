package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jmj {
    public final java.lang.String a;
    public int b;
    public defpackage.jly c;
    public jmo d;
    public final defpackage.jmr e;
    final /* synthetic */ defpackage.jml f;
    private final defpackage.afar g;
    private final defpackage.tfh h;

    public jmj(defpackage.jml jmlVar, java.lang.String str, int i) {
        this.f = jmlVar;
        this.a = str;
        defpackage.afay afayVar = new defpackage.afay(new defpackage.bxn(this, jmlVar, 12));
        this.g = afayVar;
        this.b = i;
        this.h = (defpackage.tfh) afayVar.a();
        this.e = new defpackage.jmr(new defpackage.bxn(this, jmlVar, 8), defpackage.jmi.a);
    }

    public final defpackage.jmk a() {
        return (defpackage.jmk) this.h.b();
    }

    public final void b(defpackage.jly jlyVar) {
        if (a() == defpackage.jmk.b) {
            if (this.c != null) {
                throw new java.lang.IllegalStateException("Cannot overwrite nonnull appearedCallback.");
            }
            this.c = jlyVar;
            c(defpackage.jmk.c);
            return;
        }
        throw new java.lang.IllegalStateException("Cannot call sendDeviceAppeared unless in state ABSENT, but state is " + a() + ".");
    }

    public final void c(defpackage.jmk jmkVar) {
        this.h.c(jmkVar);
    }
}
