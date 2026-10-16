package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vrr implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;
    private final defpackage.aclw d;
    private final defpackage.aclw e;
    private final /* synthetic */ int f;

    public vrr(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, int i) {
        this.f = i;
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
        this.d = aclwVar4;
        this.e = aclwVar5;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        int i = this.f;
        if (i == 0) {
            defpackage.aclw aclwVar = this.c;
            defpackage.aclw aclwVar2 = this.b;
            java.lang.String strA = ((defpackage.vsz) this.a).a();
            wep wepVarA = ((defpackage.vsj) aclwVar2).a();
            defpackage.tmy tmyVar = (defpackage.tmy) aclwVar.a();
            return new vvj(strA, wepVarA, tmyVar, this.d);
        }
        if (i == 1) {
            java.util.concurrent.Executor executor = (java.util.concurrent.Executor) this.d.a();
            defpackage.aclw aclwVar3 = this.e;
            return new defpackage.vpu(executor, ((defpackage.aclx) this.b).a(), ((defpackage.vpr) this.c).a(), (defpackage.tmy) aclwVar3.a(), this.a);
        }
        if (i == 2) {
            java.lang.Object obj = ((defpackage.aclu) this.b).b;
            defpackage.aclw aclwVar4 = this.d;
            return new vux(((defpackage.vsv) this.a).a(), defpackage.acls.b(aclwVar4), (defpackage.xyn) obj, (java.util.concurrent.Executor) this.c.a(), (defpackage.vsl) this.e.a());
        }
        if (i == 3) {
            defpackage.aclw aclwVar5 = this.c;
            defpackage.wde wdeVarA = ((defpackage.vsv) this.b).a();
            return new vxd(wdeVarA, (java.util.concurrent.Executor) this.d.a(), defpackage.acls.b(this.e), this.a);
        }
        defpackage.aclw aclwVar6 = this.d;
        defpackage.wde wdeVarA2 = ((defpackage.vsv) this.c).a();
        defpackage.zhw zhwVar = (defpackage.zhw) aclwVar6.a();
        defpackage.aclw aclwVar7 = this.a;
        return new vyi(wdeVarA2, zhwVar, defpackage.acls.b(aclwVar7), this.b, this.e);
    }

    public vrr(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, int i, byte[] bArr) {
        this.f = i;
        this.d = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
        this.e = aclwVar4;
        this.a = aclwVar5;
    }

    public vrr(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, int i, char[] cArr) {
        this.f = i;
        this.a = aclwVar;
        this.d = aclwVar2;
        this.b = aclwVar3;
        this.c = aclwVar4;
        this.e = aclwVar5;
    }

    public vrr(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, int i, int[] iArr) {
        this.f = i;
        this.c = aclwVar;
        this.d = aclwVar2;
        this.a = aclwVar3;
        this.b = aclwVar4;
        this.e = aclwVar5;
    }

    public vrr(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, defpackage.aclw aclwVar5, int i, short[] sArr) {
        this.f = i;
        this.b = aclwVar;
        this.c = aclwVar2;
        this.d = aclwVar3;
        this.e = aclwVar4;
        this.a = aclwVar5;
    }
}
