package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qfr implements defpackage.afak {
    private final /* synthetic */ int a;

    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                int i = defpackage.qfs.g;
                return new defpackage.mni();
            case 1:
                int i2 = defpackage.qfs.g;
                return new defpackage.oio();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i3 = defpackage.qfs.g;
                return new defpackage.osc();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i4 = defpackage.qfs.g;
                return new defpackage.mdp();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.vuk.d().a();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.vxj.d().a();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.vwn vwnVarD = defpackage.vwo.d();
                vwnVarD.d = 2;
                return vwnVarD.a();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.vxu vxuVarD = defpackage.vxv.d();
                vxuVarD.d = 2;
                return vxuVarD.a();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.vtj vtjVarD = defpackage.vtk.d();
                vtjVarD.d = 2;
                return vtjVarD.a();
            case 9:
                defpackage.vvt vvtVarD = defpackage.vvu.d();
                vvtVarD.e = 2;
                return vvtVarD.a();
            case 10:
                int i5 = com.google.android.projection.gearhead.GhApplication.b;
                return new defpackage.lzw(new defpackage.lwz(), new defpackage.mal());
            case 11:
                return new defpackage.xgf();
            case 12:
                return new xfz();
            default:
                int i6 = com.google.android.projection.gearhead.GhApplication.b;
                return new defpackage.xgg();
        }
    }
}
