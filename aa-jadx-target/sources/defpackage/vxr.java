package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxr implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;

    public vxr(defpackage.aclw aclwVar, defpackage.aclw aclwVar2) {
        this.a = aclwVar;
        this.b = aclwVar2;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.vxx a() {
        defpackage.vxx vxpVar = ((defpackage.xyn) this.a.a()).f() ? (defpackage.vxx) this.b.a() : new vxp();
        vxpVar.getClass();
        return vxpVar;
    }
}
