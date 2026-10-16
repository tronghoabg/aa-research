package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwl implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;
    private final defpackage.aclw d;
    private final defpackage.aclw e;
    private final defpackage.aclw f;
    private final /* synthetic */ int g;

    public vwl(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, defpackage.aclw aclwVar6, int i) {
        this.g = i;
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
        this.d = aclwVar4;
        this.e = aclwVar5;
        this.f = aclwVar6;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        int i = this.g;
        if (i == 0) {
            android.content.Context context = (android.content.Context) ((defpackage.aclu) this.b).b;
            defpackage.rkq rkqVar = (defpackage.rkq) this.f.a();
            defpackage.aclw aclwVar = this.e;
            defpackage.aclw aclwVar2 = this.d;
            return new defpackage.vwk(this.a, context, this.c, aclwVar2, aclwVar, rkqVar);
        }
        if (i != 1) {
            defpackage.aclw aclwVar3 = this.f;
            defpackage.aclw aclwVar4 = this.a;
            defpackage.aclw aclwVar5 = this.d;
            defpackage.aclw aclwVar6 = this.c;
            return new defpackage.ret(this.b, this.e, aclwVar6, aclwVar5, aclwVar4, aclwVar3);
        }
        defpackage.aclw aclwVar7 = this.a;
        java.lang.Object objA = this.c.a();
        defpackage.zhw zhwVar = (defpackage.zhw) aclwVar7.a();
        java.util.Random random = (java.util.Random) this.f.a();
        defpackage.aclw aclwVar8 = this.e;
        return new defpackage.ret((defpackage.vtm) objA, zhwVar, random, this.b, this.d, aclwVar8);
    }

    public vwl(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, defpackage.aclw aclwVar6, int i, byte[] bArr) {
        this.g = i;
        this.c = aclwVar;
        this.a = aclwVar2;
        this.f = aclwVar3;
        this.b = aclwVar4;
        this.d = aclwVar5;
        this.e = aclwVar6;
    }

    public vwl(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, defpackage.aclw aclwVar6, int i, char[] cArr) {
        this.g = i;
        this.b = aclwVar;
        this.e = aclwVar2;
        this.c = aclwVar3;
        this.d = aclwVar4;
        this.a = aclwVar5;
        this.f = aclwVar6;
    }
}
