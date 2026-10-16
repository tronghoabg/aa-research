package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwx implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;

    public vwx(defpackage.aclw aclwVar, defpackage.aclw aclwVar2) {
        this.a = aclwVar;
        this.b = aclwVar2;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.vwr a() {
        defpackage.vwr vwwVar = ((defpackage.xyn) this.a.a()).f() ? (defpackage.vwr) this.b.a() : new vww();
        vwwVar.getClass();
        return vwwVar;
    }
}
