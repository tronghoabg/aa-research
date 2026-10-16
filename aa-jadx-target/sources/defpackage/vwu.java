package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwu implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;
    private final defpackage.aclw d;
    private final defpackage.aclw e;
    private final defpackage.aclw f;
    private final defpackage.aclw g;
    private final defpackage.aclw h;
    private final defpackage.aclw i;
    private final /* synthetic */ int j;

    public vwu(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, defpackage.aclw aclwVar6, defpackage.aclw aclwVar7, defpackage.aclw aclwVar8, defpackage.aclw aclwVar9, int i) {
        this.j = i;
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
        this.d = aclwVar4;
        this.e = aclwVar5;
        this.f = aclwVar6;
        this.g = aclwVar7;
        this.h = aclwVar8;
        this.i = aclwVar9;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        int i = this.j;
        defpackage.aclw aclwVar = this.b;
        if (i == 0) {
            java.lang.Object obj = ((defpackage.aclu) aclwVar).b;
            defpackage.wde wdeVarA = ((defpackage.vsv) this.a).a();
            android.content.Context context = (android.content.Context) obj;
            defpackage.vra vraVar = (defpackage.vra) this.c.a();
            defpackage.zhw zhwVar = (defpackage.zhw) this.d.a();
            defpackage.aclw aclwVar2 = this.h;
            defpackage.aclw aclwVar3 = this.f;
            return new defpackage.vwt(wdeVarA, context, vraVar, zhwVar, defpackage.acls.b(this.e), defpackage.acls.b(aclwVar3), this.g, (java.util.concurrent.Executor) aclwVar2.a(), (defpackage.rkq) this.i.a());
        }
        android.content.Context context2 = (android.content.Context) ((defpackage.aclu) aclwVar).b;
        defpackage.xyn xynVar = (defpackage.xyn) this.h.a();
        defpackage.aclw aclwVar4 = this.a;
        defpackage.aclw aclwVar5 = this.d;
        return new defpackage.vsx(context2, xynVar, ((defpackage.vsz) this.g).a(), this.f, ((defpackage.vsm) aclwVar5).a(), (defpackage.xyn) aclwVar4.a(), (defpackage.xyn) ((defpackage.aclu) this.e).b, (defpackage.xyn) ((defpackage.aclu) this.c).b, this.i);
    }

    public vwu(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, defpackage.aclw aclwVar6, defpackage.aclw aclwVar7, defpackage.aclw aclwVar8, defpackage.aclw aclwVar9, int i, byte[] bArr) {
        this.j = i;
        this.b = aclwVar;
        this.h = aclwVar2;
        this.g = aclwVar3;
        this.f = aclwVar4;
        this.d = aclwVar5;
        this.a = aclwVar6;
        this.e = aclwVar7;
        this.c = aclwVar8;
        this.i = aclwVar9;
    }
}
