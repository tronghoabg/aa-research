package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vsm implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;

    public vsm(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3) {
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.ojm a() {
        return new defpackage.ojm(((defpackage.vsn) this.a).a(), this.b, this.c);
    }
}
