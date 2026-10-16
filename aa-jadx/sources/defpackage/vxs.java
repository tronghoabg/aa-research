package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vxs implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;

    public vxs(defpackage.aclw aclwVar, defpackage.aclw aclwVar2) {
        this.a = aclwVar;
        this.b = aclwVar2;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.vxo a() {
        defpackage.vxo vxqVar = ((defpackage.xyn) this.a.a()).f() ? (defpackage.vxo) this.b.a() : new defpackage.vxq();
        vxqVar.getClass();
        return vxqVar;
    }
}
