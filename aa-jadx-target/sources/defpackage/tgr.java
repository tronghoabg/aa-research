package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tgr implements defpackage.aclt {
    private final defpackage.aclw a;
    private final /* synthetic */ int b;

    public tgr(defpackage.aclw aclwVar, int i) {
        this.b = i;
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.wbw(((java.lang.Boolean) ((defpackage.aclu) this.a).b).booleanValue());
            case 1:
                float fFloatValue = ((java.lang.Float) ((defpackage.aclu) this.a).b).floatValue();
                defpackage.vxu vxuVarD = defpackage.vxv.d();
                vxuVarD.b(fFloatValue);
                vxuVarD.d = 3;
                return vxuVarD.a();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.vuk vukVar = (defpackage.vuk) ((defpackage.vrp) ((defpackage.afak) ((defpackage.xyn) this.a.a()).d(new defpackage.qfr(4))).a());
                vukVar.getClass();
                return vukVar;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                vtd vtdVarBP = defpackage.sqs.bP((defpackage.xyn) ((defpackage.aclu) this.a).b, new defpackage.oyy(17));
                vtdVarBP.getClass();
                return vtdVarBP;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.vtk vtkVar = (defpackage.vtk) ((defpackage.vrp) ((defpackage.afak) ((defpackage.xyn) this.a.a()).d(new defpackage.qfr(8))).a());
                vtkVar.getClass();
                return vtkVar;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                vus vusVarBP = defpackage.sqs.bP((defpackage.xyn) ((defpackage.aclu) this.a).b, new defpackage.oyy(13));
                vusVarBP.getClass();
                return vusVarBP;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.xyn xynVar = (defpackage.xyn) ((defpackage.aclu) this.a).b;
                return xynVar.f() ? defpackage.xyn.g((defpackage.vsk) ((defpackage.afak) xynVar.b()).a()) : defpackage.xxe.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                vvi vviVarBP = defpackage.sqs.bP((defpackage.xyn) ((defpackage.aclu) this.a).b, new defpackage.oyy(14));
                vviVarBP.getClass();
                return vviVarBP;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.vxj vxjVar = (defpackage.vxj) ((defpackage.vrp) ((defpackage.afak) ((defpackage.xyn) this.a.a()).d(new defpackage.qfr(5))).a());
                vxjVar.getClass();
                return vxjVar;
            case 9:
                defpackage.xyn xynVar2 = (defpackage.xyn) ((defpackage.aclu) this.a).b;
                defpackage.vmg vmgVar = new defpackage.vmg(null);
                defpackage.ysr.bl(vmgVar.b > 0, "Thread pool size must be less than or equal to %s", 2);
                return (defpackage.vmg) xynVar2.d(vmgVar);
            case 10:
                defpackage.vxv vxvVar = (defpackage.vxv) ((defpackage.vrp) ((defpackage.afak) ((defpackage.xyn) this.a.a()).d(new defpackage.qfr(7))).a());
                vxvVar.getClass();
                return vxvVar;
            case 11:
                vyg vygVarBP = defpackage.sqs.bP((defpackage.xyn) ((defpackage.aclu) this.a).b, new defpackage.oyy(16));
                vygVarBP.getClass();
                return vygVarBP;
            case 12:
                return new defpackage.vss((android.content.Context) ((defpackage.aclu) this.a).b);
            case 13:
                return new java.util.Random(((defpackage.tmy) this.a.a()).a());
            case 14:
                defpackage.vlw vlwVar = (defpackage.vlw) this.a.a();
                defpackage.vlw.b(vlwVar);
                vlwVar.getClass();
                return vlwVar;
            case 15:
                return (defpackage.tmy) ((defpackage.xyn) ((defpackage.aclu) this.a).b).d(new defpackage.tnc());
            case 16:
                return new vma((defpackage.tmy) this.a.a());
            case 17:
                return new defpackage.vpx(defpackage.acls.b(this.a));
            case 18:
                java.lang.Boolean bool = (java.lang.Boolean) ((defpackage.xyn) ((defpackage.aclu) this.a).b).d(java.lang.Boolean.FALSE);
                bool.booleanValue();
                return bool;
            case 19:
                return new defpackage.vrh((defpackage.vss) this.a.a());
            default:
                return new defpackage.vri((defpackage.vrh) this.a.a());
        }
    }
}
