package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kgo implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kgo(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v39, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v56, types: [afer, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = 20;
        int i2 = 0;
        int i3 = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                int i4 = kgp.f;
                ((defpackage.eqp) this.a).m((java.lang.String) obj);
                return defpackage.afbk.a;
            case 1:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                kcy kcyVar = (kcy) this.a;
                kcyVar.a = zBooleanValue;
                kcyVar.s();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i5 = kgp.f;
                ((defpackage.eqp) this.a).m((java.util.List) obj);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i6 = kgp.f;
                ((defpackage.eqp) this.a).m((java.util.List) obj);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((rb) this.a).j();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i7 = defpackage.khn.a;
                defpackage.kfn.a();
                defpackage.khp khpVar = new defpackage.khp(1);
                return new defpackage.kfk(2131427667, (android.content.ContentResolver) this.a, (defpackage.kfm) obj, khpVar);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ygw ygwVar = defpackage.khq.a;
                defpackage.kfn.a();
                defpackage.khp khpVar2 = new defpackage.khp(0);
                return new defpackage.kfk(2131427671, (android.content.ContentResolver) this.a, (defpackage.kfm) obj, khpVar2);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.dzp dzpVar = (defpackage.dzp) obj;
                java.lang.Long l = (java.lang.Long) dzpVar.a;
                java.lang.Long l2 = (java.lang.Long) dzpVar.b;
                defpackage.qdn qdnVar = defpackage.kwu.b().d;
                qdnVar.d();
                qdnVar.f().c();
                return defpackage.ebo.f(new khz((defpackage.kic) this.a, l, l2), new defpackage.jxf(i));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.qdn qdnVar2 = defpackage.kwu.b().d;
                qdnVar2.d();
                qdnVar2.f().c();
                return defpackage.ebo.f(new kia((defpackage.kic) this.a, (j$.time.LocalDate) obj), new defpackage.jxf(i));
            case 9:
                defpackage.qdn qdnVar3 = defpackage.kwu.b().d;
                qdnVar3.d();
                qdnVar3.f().c();
                return defpackage.ebo.f(new defpackage.kib((defpackage.kic) this.a, (java.lang.Long) obj), new defpackage.kko(i3));
            case 10:
                com.google.android.gms.car.control.CarControlGroup carControlGroup = (com.google.android.gms.car.control.CarControlGroup) obj;
                carControlGroup.getClass();
                return ((defpackage.kjx) this.a).e(carControlGroup).a;
            case 11:
                kki kkiVar = (kkl) obj;
                kkiVar.getClass();
                if (kkiVar instanceof kki) {
                    return new kki(this.a.invoke(kkiVar.a));
                }
                kkj kkjVar = kkj.a;
                if (defpackage.afga.f(kkiVar, kkjVar)) {
                    return kkjVar;
                }
                kkk kkkVar = kkk.a;
                if (defpackage.afga.f(kkiVar, kkkVar)) {
                    return kkkVar;
                }
                throw new defpackage.afas();
            case 12:
                android.content.Context context = (android.content.Context) obj;
                context.getClass();
                android.view.View view = (android.view.View) this.a.invoke(context);
                view.setTag(kmt.a);
                return view;
            case 13:
                java.lang.Object obj2 = this.a;
                ((kmq) obj2).post(new defpackage.kmp(obj2, i2));
                return defpackage.afbk.a;
            case 14:
                defpackage.kqe kqeVar = (defpackage.kqe) obj;
                kqeVar.getClass();
                return java.lang.Boolean.valueOf(defpackage.afga.f(kqeVar.b, ((defpackage.kqe) this.a).b));
            case 15:
                defpackage.kqe kqeVar2 = (defpackage.kqe) obj;
                kqeVar2.getClass();
                return java.lang.Boolean.valueOf(defpackage.afga.f(kqeVar2.b, this.a));
            case 16:
                if (((java.lang.Float) obj).floatValue() == 1.0f) {
                    this.a.invoke();
                }
                return defpackage.afbk.a;
            case 17:
                mcx mcxVar = (mcx) obj;
                mcxVar.getClass();
                mcxVar.a(new defpackage.ccz(1377155504, true, new jtz(this.a, 19)));
                return defpackage.afbk.a;
            case 18:
                mcx mcxVar2 = (mcx) obj;
                mcxVar2.getClass();
                mcxVar2.a(new defpackage.ccz(-279952753, true, new jtz(this.a, 18)));
                return defpackage.afbk.a;
            case 19:
                mcx mcxVar3 = (mcx) obj;
                mcxVar3.getClass();
                mcxVar3.b(new defpackage.ccz(-991886629, true, new jtz(this.a, 17)));
                return defpackage.afbk.a;
            default:
                mcx mcxVar4 = (mcx) obj;
                mcxVar4.getClass();
                mcxVar4.b(new defpackage.ccz(1645972410, true, new jtz(this.a, 16)));
                return defpackage.afbk.a;
        }
    }
}
