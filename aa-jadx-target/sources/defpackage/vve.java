package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vve implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;
    private final defpackage.aclw d;
    private final defpackage.aclw e;
    private final defpackage.aclw f;
    private final defpackage.aclw g;
    private final defpackage.aclw h;
    private final defpackage.aclw i;
    private final defpackage.aclw j;
    private final defpackage.aclw k;
    private final defpackage.aclw l;

    public vve(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, defpackage.aclw aclwVar6, defpackage.aclw aclwVar7, defpackage.aclw aclwVar8, defpackage.aclw aclwVar9, defpackage.aclw aclwVar10, defpackage.aclw aclwVar11, defpackage.aclw aclwVar12) {
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
        this.d = aclwVar4;
        this.e = aclwVar5;
        this.f = aclwVar6;
        this.g = aclwVar7;
        this.h = aclwVar8;
        this.i = aclwVar9;
        this.j = aclwVar10;
        this.k = aclwVar11;
        this.l = aclwVar12;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        java.lang.Object obj = ((defpackage.aclu) this.b).b;
        defpackage.wde wdeVarA = ((defpackage.vsv) this.a).a();
        android.content.Context context = (android.content.Context) obj;
        defpackage.vsl vslVar = (defpackage.vsl) this.c.a();
        defpackage.aclm aclmVarB = defpackage.acls.b(this.d);
        java.lang.Object objA = this.e.a();
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) this.h.a();
        java.lang.Object obj2 = ((defpackage.aclu) this.l).b;
        return new vvd(wdeVarA, context, vslVar, aclmVarB, (vuz) objA, this.f, this.g, executor, ((defpackage.vvs) this.i).a(), this.j, ((defpackage.vvk) this.k).a(), (defpackage.xyn) obj2);
    }
}
