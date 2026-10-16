package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lgy implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgy(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, lkj] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, lkj] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, lkj] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object, lkj] */
    /* JADX WARN: Type inference failed for: r3v57, types: [afer, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws defpackage.qst {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.pyk((lhb) this.a);
            case 1:
                return new lgz();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.mkp.a.g();
                ((defpackage.lam) defpackage.oml.x(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a).a).F(new defpackage.rdn(((lhb) this.a).b(), 9));
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.mkp.a.g();
                defpackage.oml.E(defpackage.kit.b().e(), (com.google.android.gms.car.display.CarRegionId) ((defpackage.pyk) this.a).a);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return (rc) ((re) this.a).a().a(rc.class);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                lkr lkrVar = (lkr) this.a;
                lkrVar.b.invoke();
                lkrVar.a();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((qs) this.a).c();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a.invoke();
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                rc rcVarG = ((rb) this.a).g();
                rcVarG.getClass();
                rcVarG.e("BROWSE");
                return defpackage.afbk.a;
            case 9:
                ((rb) this.a).g().c();
                return defpackage.afbk.a;
            case 10:
                ((rb) this.a).g().c();
                return defpackage.afbk.a;
            case 11:
                ((rb) this.a).g().c();
                return defpackage.afbk.a;
            case 12:
                this.a.g();
                return defpackage.afbk.a;
            case 13:
                this.a.h();
                return defpackage.afbk.a;
            case 14:
                this.a.g();
                return defpackage.afbk.a;
            case 15:
                this.a.h();
                return defpackage.afbk.a;
            case 16:
                ((defpackage.ltt) this.a).c();
                return defpackage.afbk.a;
            case 17:
                int i = defpackage.lzm.a;
                defpackage.mkp.a.g();
                return java.lang.Boolean.valueOf(defpackage.oml.z((defpackage.qsh) this.a, defpackage.rbf.O));
            case 18:
                this.a.invoke();
                return defpackage.afbk.a;
            case 19:
                ((rb) this.a).g().c();
                return defpackage.afbk.a;
            default:
                android.os.Bundle arguments = ((android.support.v4.app.Fragment) this.a).getArguments();
                boolean z = false;
                if (arguments != null && arguments.getBoolean("IS_HORIZONTAL")) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
