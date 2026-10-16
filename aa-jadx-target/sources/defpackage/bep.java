package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bep {
    public final defpackage.dfb a;
    public final defpackage.dgd b;
    public final boolean c;
    public final int d = 1;
    public final defpackage.dlo e;
    public final java.util.List f;
    public final defpackage.wde g;
    private defpackage.dfj h;
    private defpackage.dlz i;

    public bep(defpackage.dfb dfbVar, defpackage.dgd dgdVar, boolean z, defpackage.dlo dloVar, defpackage.wde wdeVar, java.util.List list) {
        this.a = dfbVar;
        this.b = dgdVar;
        this.c = z;
        this.e = dloVar;
        this.g = wdeVar;
        this.f = list;
    }

    public final int a() {
        return java.lang.Math.round((float) java.lang.Math.ceil(b().a()));
    }

    public final defpackage.dfj b() {
        defpackage.dfj dfjVar = this.h;
        if (dfjVar != null) {
            return dfjVar;
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }

    public final void c(defpackage.dlz dlzVar) {
        defpackage.dfj dfjVar = this.h;
        if (dfjVar == null || dlzVar != this.i || dfjVar.c()) {
            this.i = dlzVar;
            dfjVar = new defpackage.dfj(this.a, defpackage.dax.f(this.b, dlzVar), this.f, this.e, this.g);
        }
        this.h = dfjVar;
    }
}
