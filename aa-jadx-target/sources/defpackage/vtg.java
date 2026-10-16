package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vtg implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;

    public vtg(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3) {
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vtf a() {
        defpackage.acls.b(this.b);
        return new vtf((android.content.Context) ((defpackage.aclu) this.c).b);
    }
}
