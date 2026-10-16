package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vpp implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;
    private final defpackage.aclw d;

    public vpp(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4) {
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
        this.d = aclwVar4;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.vpq a() {
        return new defpackage.vpq((android.content.Context) ((defpackage.aclu) this.a).b, (defpackage.tmy) this.b.a(), this.c, this.d);
    }
}
