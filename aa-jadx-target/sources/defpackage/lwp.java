package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwp implements defpackage.lhn {
    public boolean a = false;
    public final java.util.Set b = new java.util.HashSet();

    public static defpackage.lwp a() {
        return (defpackage.lwp) defpackage.mkp.a.b(defpackage.lwp.class, new defpackage.lqb(13));
    }

    public final void b(lwo lwoVar) {
        defpackage.wfp.c();
        this.b.add(lwoVar);
    }

    @Override // defpackage.lhn
    public final void d() {
        this.b.clear();
    }

    public final void e(lwo lwoVar) {
        defpackage.wfp.c();
        this.b.remove(lwoVar);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        ((defpackage.kzh) defpackage.ebo.n().k()).f(11, new defpackage.kze(this, 3), java.lang.Boolean.class);
    }
}
