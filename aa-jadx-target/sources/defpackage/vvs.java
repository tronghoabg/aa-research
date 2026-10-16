package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vvs implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;

    public vvs(defpackage.aclw aclwVar, defpackage.aclw aclwVar2) {
        this.a = aclwVar;
        this.b = aclwVar2;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wep a() {
        return new wep(new tfx(this.a, 3), this.b);
    }
}
