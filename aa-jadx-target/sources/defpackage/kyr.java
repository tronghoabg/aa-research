package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kyr implements defpackage.kjd {
    private final /* synthetic */ int a;

    public /* synthetic */ kyr(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [afak, java.lang.Object] */
    @Override // defpackage.kjd
    public final java.lang.Object a() throws defpackage.qst {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.kzb.a;
                defpackage.mkp.a.g();
                defpackage.rei reiVarD = ((defpackage.qtv) defpackage.kit.b().e()).d();
                java.lang.Integer num = (java.lang.Integer) reiVarD.f.b(new defpackage.rdg(reiVarD, 18));
                num.intValue();
                return num;
            case 1:
                int i = defpackage.jqu.b;
                defpackage.mkp.a.f();
                return java.lang.Boolean.valueOf(defpackage.ooa.c(defpackage.kit.b().e()) == 2);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar2 = defpackage.mru.a;
                return defpackage.a.P();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar3 = defpackage.mru.a;
                return defpackage.a.P();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar4 = defpackage.mru.a;
                defpackage.mkp.a.f();
                com.google.android.gms.car.CarInfo carInfoD = defpackage.ooa.d(defpackage.kit.b().e());
                carInfoD.getClass();
                return carInfoD;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar5 = defpackage.ngr.a;
                defpackage.mkp.a.g();
                defpackage.ret retVar = defpackage.oml.v(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a).h;
                java.util.List list = (java.util.List) ((defpackage.rps) retVar.f.a()).b(new defpackage.res(retVar, 0));
                return java.lang.Boolean.valueOf(list == null || list.isEmpty());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar6 = nww.a;
                defpackage.mkp.a.f();
                com.google.android.gms.car.CarInfo carInfoD2 = defpackage.ooa.d(defpackage.kit.b().e());
                carInfoD2.getClass();
                ((defpackage.yqj) nww.a.l().ai(5504)).w("carInfo driver position: %d", carInfoD2.h);
                return java.lang.Boolean.valueOf(carInfoD2.h == 1);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.mkp.a.g();
                return defpackage.oml.p(defpackage.kit.b().e()).a();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar7 = defpackage.wyv.m;
                return defpackage.a.P();
            case 9:
                defpackage.yqm yqmVar8 = defpackage.wyv.m;
                defpackage.mkp.a.f();
                return java.lang.Boolean.valueOf(defpackage.ooa.c(defpackage.kit.b().e()) == 2);
            case 10:
                int i2 = defpackage.xfe.c;
                defpackage.mkp.a.f();
                return defpackage.ooa.d(defpackage.kit.b().e());
            default:
                int i3 = defpackage.xfe.c;
                return defpackage.laz.a().c(defpackage.kit.b().e());
        }
    }
}
