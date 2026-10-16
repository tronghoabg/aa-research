package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uym implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;

    public uym(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3) {
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.uyl a() {
        ((defpackage.uzm) this.b).b();
        return new defpackage.uyl(this.a, ((defpackage.uzm) this.c).b());
    }
}
