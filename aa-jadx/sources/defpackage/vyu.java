package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vyu implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;

    public vyu(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3) {
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.vyt a() {
        return new defpackage.vyt((android.content.Context) ((defpackage.aclu) this.a).b, (defpackage.tmy) this.b.a(), this.c);
    }
}
