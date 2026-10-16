package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tga implements defpackage.aclw {
    private final defpackage.aclw a;
    private final /* synthetic */ int b;

    public tga(defpackage.aclw aclwVar, int i) {
        this.b = i;
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        int i = this.b;
        return b();
    }

    public final defpackage.xyn b() {
        if (this.b == 0) {
            return new defpackage.xys(this.a);
        }
        java.lang.Object objA = this.a.a();
        objA.getClass();
        return new defpackage.xys(objA);
    }
}
