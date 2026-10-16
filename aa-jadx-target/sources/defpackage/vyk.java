package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vyk implements defpackage.aclt {
    private final defpackage.aclw a;

    public vyk(defpackage.aclw aclwVar) {
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.xyn a() {
        defpackage.xyn xynVar = (defpackage.xyn) ((defpackage.aclu) this.a).b;
        if (!xynVar.f()) {
            return defpackage.xxe.a;
        }
        xynVar.getClass();
        return new defpackage.xys(new defpackage.upb(xynVar, 16));
    }
}
