package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wdb implements java.util.function.BiFunction {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wdb(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return this.b != 0 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, jfa] */
    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        if (this.b == 0) {
            byte[] bArr = (byte[]) obj2;
            java.lang.Object obj3 = this.a;
            return java.util.Arrays.equals(bArr, (byte[]) obj3) ? bArr : obj3;
        }
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.Boolean boolValueOf = (java.lang.Boolean) obj2;
        defpackage.yqm yqmVar = defpackage.jpc.a;
        if (!boolValueOf.booleanValue()) {
            defpackage.absx absxVarL = defpackage.acnl.a.fF().l();
            if (!absxVarL.b.isEmpty()) {
                com.google.android.gms.car.CarInfo carInfoT = this.a.t();
                carInfoT.getClass();
                defpackage.yqm yqmVar2 = defpackage.kjl.a;
                j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(16), absxVarL);
                int i = defpackage.ygw.d;
                boolValueOf = java.lang.Boolean.valueOf(defpackage.kjl.h(carInfoT, (defpackage.ygw) streamD.collect(defpackage.yds.a)));
            }
        }
        defpackage.iqy iqyVarB = defpackage.ipz.B();
        defpackage.acsd acsdVar = defpackage.acsd.a;
        iqyVarB.b(acsdVar.fF().j());
        iqyVarB.d(acsdVar.fF().o());
        if (boolValueOf.booleanValue()) {
            if (num.intValue() == 3) {
                iqyVarB.c(defpackage.acsd.d());
                iqyVarB.e(defpackage.acsd.f());
            } else {
                iqyVarB.c(defpackage.acsd.e());
                iqyVarB.e(defpackage.acsd.g());
            }
        } else if (num.intValue() == 3) {
            iqyVarB.c(acsdVar.fF().k());
            iqyVarB.e(acsdVar.fF().r());
        } else {
            iqyVarB.c(acsdVar.fF().l());
            iqyVarB.e(acsdVar.fF().s());
        }
        return iqyVarB.a();
    }
}
