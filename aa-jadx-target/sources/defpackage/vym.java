package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vym implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;

    public vym(defpackage.aclw aclwVar, defpackage.aclw aclwVar2) {
        this.a = aclwVar;
        this.b = aclwVar2;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vyl a() {
        return new vyl((android.content.Context) ((defpackage.aclu) this.a).b, this.b);
    }
}
