package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cvl {
    public final defpackage.cvo a;
    public defpackage.ctu b;
    public final defpackage.affg c;
    public final defpackage.affg d;
    public final defpackage.affg e;

    public cvl(defpackage.cvo cvoVar) {
        this.a = cvoVar;
        this.c = new defpackage.cvi(this, 0);
        this.d = new defpackage.cvi(this, 2);
        this.e = new defpackage.cvi(this, 3);
    }

    public final defpackage.ctu a() {
        defpackage.ctu ctuVar = this.b;
        if (ctuVar != null) {
            return ctuVar;
        }
        throw new java.lang.IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public cvl() {
        this(defpackage.cuh.a);
    }
}
