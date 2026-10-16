package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xva extends defpackage.xup implements defpackage.xus {
    public static final defpackage.xuq a = new defpackage.xur();
    private final java.lang.Exception b;

    public xva(java.util.UUID uuid, java.lang.String str, java.lang.Exception exc, defpackage.nrr nrrVar) {
        super("<missing root>", uuid, str, nrrVar);
        this.b = exc;
    }

    @Override // defpackage.xus
    public final java.lang.Exception b() {
        return this.b;
    }

    @Override // defpackage.xus
    public final defpackage.xvq g(java.lang.String str, defpackage.xvk xvkVar, boolean z, defpackage.nrr nrrVar) {
        if (z) {
            java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.xuy.a;
        }
        return new defpackage.xvb(str, this, xvkVar, z, nrrVar);
    }

    @Override // defpackage.xvq
    public final defpackage.xvk h() {
        return defpackage.xvj.a;
    }

    @Override // defpackage.xvq
    public final defpackage.xvk i() {
        throw null;
    }

    @Override // defpackage.xvq
    public final defpackage.xvq m(java.lang.String str, defpackage.xvk xvkVar, defpackage.nrr nrrVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.xuy.a;
        return g(str, xvkVar, true, nrrVar);
    }

    @Override // defpackage.xvq
    public final void j() {
    }

    @Override // defpackage.xvq
    public final void k() {
    }

    @Override // defpackage.xvq
    public final void l() {
    }
}
