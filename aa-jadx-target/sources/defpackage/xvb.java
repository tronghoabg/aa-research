package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xvb extends defpackage.xut implements defpackage.xus {
    private final java.lang.Exception a;
    private final boolean b;

    public xvb(java.lang.String str, defpackage.xus xusVar, defpackage.xvk xvkVar, boolean z, defpackage.nrr nrrVar) {
        super("<missing root>:".concat(java.lang.String.valueOf(str)), xusVar, defpackage.xvk.d(xvkVar, defpackage.xvj.b), nrrVar);
        this.a = xusVar.b();
        this.b = z;
    }

    @Override // defpackage.xus
    public final java.lang.Exception b() {
        return this.a;
    }

    @Override // defpackage.xus
    public final defpackage.xvq g(java.lang.String str, defpackage.xvk xvkVar, boolean z, defpackage.nrr nrrVar) {
        if (z && !this.b) {
            java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.xuy.a;
        }
        boolean z2 = true;
        if ((!z || this.b) && !this.b) {
            z2 = false;
        }
        return new defpackage.xvb(str, this, xvkVar, z2, nrrVar);
    }

    @Override // defpackage.xvq
    public final defpackage.xvk i() {
        return defpackage.xvj.a;
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

    public xvb(java.util.UUID uuid, java.lang.String str, java.lang.String str2, defpackage.xvk xvkVar, java.lang.Exception exc, boolean z, defpackage.nrr nrrVar) {
        super("<missing root>:".concat(java.lang.String.valueOf(str2)), uuid, str, defpackage.xvk.d(xvkVar, defpackage.xvj.b), nrrVar);
        this.a = exc;
        this.b = z;
    }
}
