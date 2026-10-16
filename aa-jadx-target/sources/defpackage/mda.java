package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mda implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mda(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [afer, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = "Release";
        java.lang.Object[] objArr = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.mdb mdbVar = defpackage.mdc.a;
                componentName.getClass();
                java.lang.Object obj2 = this.a;
                try {
                    defpackage.mkp.a.g();
                    java.lang.String strY = defpackage.oml.y((defpackage.qsh) obj2, "car_app_mode", "Release");
                    strY.getClass();
                    str = strY;
                } catch (defpackage.qst e) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.mdc.b.g()).p(e)).u("Error getting 1p manager.");
                }
                return java.lang.Boolean.valueOf(defpackage.afga.f("Developer", str) || !defpackage.afga.f(componentName, defpackage.mkt.a));
            case 1:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                cjaVar.getClass();
                if (cjaVar.b()) {
                    this.a.invoke();
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.getClass();
                ((defpackage.mdd) this.a).a = bool.booleanValue();
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ur urVar = (ur) obj;
                urVar.getClass();
                qs qsVar = ((rb) this.a).a;
                qsVar.getClass();
                urVar.d(tim.e(qsVar, 2131231825));
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((tie) obj).getClass();
                return new odn(this.a, (byte[]) null);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.to toVar = (defpackage.to) obj;
                toVar.getClass();
                java.lang.Object obj3 = this.a;
                defpackage.kry kryVar = defpackage.kry.s;
                defpackage.ksp kspVar = defpackage.ksp.a;
                defpackage.ksb ksbVar = (defpackage.ksb) obj3;
                toVar.a(androidx.car.app.model.CarColor.createCustom(kryVar.d(ksbVar, kspVar), kryVar.f(ksbVar, kspVar)));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ksh kshVar = (defpackage.ksh) obj;
                com.google.android.apps.auto.components.ui.widget.Button button = (com.google.android.apps.auto.components.ui.widget.Button) this.a;
                android.content.Context context = button.getContext();
                defpackage.kry kryVar2 = defpackage.kry.a;
                context.getClass();
                kshVar.getClass();
                int iB = kryVar2.b(context, kshVar);
                int iB2 = defpackage.kry.v.b(context, kshVar);
                android.widget.TextView textView = (android.widget.TextView) button.findViewById(2131427660);
                if (textView != null) {
                    textView.setTextColor(iB);
                }
                button.setBackgroundColor(iB2);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar = miq.a;
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream((defpackage.ygw) obj).map(new defpackage.lpk(this.a, 8));
                int i = defpackage.ygw.d;
                return (defpackage.ygw) map.collect(defpackage.yds.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return obj != null ? obj : this.a;
            case 9:
                ((mms) this.a).k("visualPreview");
                return defpackage.afbk.a;
            case 10:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.mnt mntVar = defpackage.mnt.a;
                str2.getClass();
                ((java.io.PrintWriter) this.a).println(str2);
                return defpackage.afbk.a;
            case 11:
                java.util.List list = (java.util.List) obj;
                defpackage.ygw ygwVarZ = defpackage.ygw.z(new defpackage.mql(defpackage.nsn.e(), (mrd) new mqy(defpackage.mkp.a.c), (int) (objArr == true ? 1 : 0)), list);
                mqm mqmVar = (mqm) this.a;
                if (!mqmVar.c) {
                    defpackage.ygw ygwVar = (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVarZ).map(new mjb(14)).collect(defpackage.yds.a);
                    if (defpackage.nsn.e().j()) {
                        defpackage.omf.u().j(ygwVar);
                    } else {
                        defpackage.omf.u().c(ygwVar);
                    }
                    int i2 = defpackage.lhi.a;
                    long jCount = j$.util.Collection.-EL.stream(list).filter(new defpackage.lyk(13)).count();
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.APP_LAUNCHER, defpackage.zbd.kS);
                    rrvVarH.w((int) jCount);
                    defpackage.omf.u().F(rrvVarH.l());
                    mqmVar.c = true;
                }
                return ygwVarZ;
            case 12:
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                androidx.car.app.model.CarIcon carIcon = bitmap != null ? new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.k(bitmap))) : null;
                java.lang.Object obj4 = this.a;
                ((mqp) obj4).h = carIcon;
                ((rb) obj4).j();
                return defpackage.afbk.a;
            case 13:
                java.lang.Object obj5 = this.a;
                ((mqp) obj5).f = (java.util.List) obj;
                ((rb) obj5).j();
                return defpackage.afbk.a;
            case 14:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                bool2.getClass();
                boolean zBooleanValue = bool2.booleanValue();
                java.lang.Object obj6 = this.a;
                ((mqp) obj6).g = zBooleanValue;
                ((rb) obj6).j();
                return defpackage.afbk.a;
            case 15:
                java.lang.Object obj7 = this.a;
                ((mqs) obj7).g = (java.util.List) obj;
                ((rb) obj7).j();
                return defpackage.afbk.a;
            case 16:
                java.lang.Object obj8 = this.a;
                ((mqs) obj8).f = (java.util.List) obj;
                ((rb) obj8).j();
                return defpackage.afbk.a;
            case 17:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                bool3.getClass();
                boolean zBooleanValue2 = bool3.booleanValue();
                java.lang.Object obj9 = this.a;
                ((mqs) obj9).i = zBooleanValue2;
                ((rb) obj9).j();
                return defpackage.afbk.a;
            case 18:
                java.lang.Object obj10 = this.a;
                ((mqs) obj10).h = (java.util.List) obj;
                ((rb) obj10).j();
                return defpackage.afbk.a;
            case 19:
                defpackage.mqa.d();
                return ((odn) this.a).c((android.content.ComponentName) obj, defpackage.mqa.e());
            default:
                android.content.Intent intent = new android.content.Intent();
                intent.setComponent(defpackage.mkt.t);
                return ((odn) this.a).c((android.content.ComponentName) obj, intent);
        }
    }
}
