package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kkr implements defpackage.eqt {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kkr(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [bwx, java.lang.Object] */
    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        int i = 4;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                kki kkiVar = (kkl) obj;
                kkiVar.getClass();
                ((defpackage.yqj) defpackage.kkw.h.f()).y("Received overlay property state: %s", kkiVar);
                boolean z = kkiVar instanceof kki;
                java.lang.Object obj2 = this.a;
                if (z) {
                    ((defpackage.eqp) obj2).m(kkiVar.a);
                } else {
                    ((defpackage.eqp) obj2).m(0);
                }
                break;
            case 1:
                this.a.b(obj);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ksh kshVar = (defpackage.ksh) obj;
                defpackage.yqm yqmVar = defpackage.mgm.a;
                android.view.View view = (android.view.View) this.a;
                defpackage.mgr.a().b(view.getContext(), kshVar);
                defpackage.lem.a.a();
                android.view.View viewFindViewById = view.findViewById(2131429208);
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(view.getContext().getResources().getDimension(2131166054));
                gradientDrawable.setColor(defpackage.kry.q.b(view.getContext(), kshVar));
                viewFindViewById.setBackground(gradientDrawable);
                view.setBackgroundColor(defpackage.kry.o.b(view.getContext(), kshVar));
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                if (iIntValue >= defpackage.acyc.e()) {
                    java.lang.Object obj3 = this.a;
                    ((defpackage.yqj) defpackage.msg.c.f()).w("Thermal status %d triggers compat mode", iIntValue);
                    ((defpackage.msg) obj3).b(true);
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                    if (!com.google.android.gms.car.display.CarRegionId.a.equals(entry.getKey())) {
                        ((defpackage.ngb) this.a).b((defpackage.mqj) entry.getValue(), (com.google.android.gms.car.display.CarRegionId) entry.getKey());
                    }
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.ngb) this.a).b((defpackage.mqj) obj, com.google.android.gms.car.display.CarRegionId.a);
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                defpackage.nrm nrmVar = (defpackage.nrm) this.a;
                if (nrmVar.i() instanceof defpackage.nrk) {
                    if (defpackage.acqh.m()) {
                        defpackage.mpr.e().g(iIntValue2 == 2);
                        break;
                    } else if (iIntValue2 == 1) {
                        defpackage.nrc.a.a().a(false);
                        break;
                    } else if (iIntValue2 == 2) {
                        nrmVar.j();
                        break;
                    }
                }
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.eqp eqpVar = (defpackage.eqp) this.a;
                defpackage.nub nubVar = new defpackage.nub((defpackage.ygw) eqpVar.e());
                int i2 = defpackage.ygw.d;
                eqpVar.m((defpackage.ygw) j$.util.Collection.-EL.stream((defpackage.ygw) obj).filter(new defpackage.iux(5)).filter(new defpackage.iux(6)).map(new defpackage.kpc((defpackage.ygw) nubVar.i(defpackage.ymx.a), i)).collect(defpackage.yds.a));
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.eqp) this.a).m(obj);
                break;
            case 9:
                defpackage.ksh kshVar2 = (defpackage.ksh) obj;
                defpackage.xgu xguVar = (defpackage.xgu) this.a;
                defpackage.ysr.bk(xguVar.c != null, "CarWindowManager not initialized, cannot set background colors");
                ((defpackage.yqj) ((defpackage.yqj) defpackage.xgu.a.f()).ai((char) 10288)).y("Setting background color for palette %s", kshVar2);
                defpackage.lel lelVar = defpackage.lem.a;
                int iC = lelVar.a().b() ? defpackage.kry.o.c(kshVar2) : defpackage.krz.a.a(kshVar2.a.b());
                try {
                    xguVar.c.a.m(iC, lelVar.a().b() ? defpackage.kry.o.e(kshVar2) : iC);
                } catch (android.os.RemoteException e) {
                    boolean z2 = defpackage.rrx.a;
                    defpackage.rrx.d(4, "CAR.WM", e, "setBackgroundColors RemoteException", new java.lang.Object[0]);
                    return;
                }
                break;
            default:
                defpackage.ksh kshVar3 = (defpackage.ksh) obj;
                if (defpackage.lem.a.a().b()) {
                    defpackage.xgu xguVar2 = (defpackage.xgu) this.a;
                    defpackage.ysr.bk(xguVar2.c != null, "CarWindowManager not initialized, cannot set border color");
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.xgu.a.f()).ai((char) 10289)).y("Setting border color for palette %s", kshVar3);
                    try {
                        xguVar2.c.a.n(0, defpackage.kry.n.e(kshVar3));
                    } catch (android.os.RemoteException e2) {
                        boolean z3 = defpackage.rrx.a;
                        defpackage.rrx.d(4, "CAR.WM", e2, "setBorderColors RemoteException", new java.lang.Object[0]);
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
