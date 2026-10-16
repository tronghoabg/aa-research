package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pvs implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;
    private final defpackage.aclw d;

    public pvs(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4) {
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
        this.d = aclwVar4;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.pvr a() {
        j$.util.Optional optional = (j$.util.Optional) ((defpackage.aclu) this.b).b;
        return new defpackage.pvr(this.a, optional, defpackage.acls.b(this.d));
    }
}
