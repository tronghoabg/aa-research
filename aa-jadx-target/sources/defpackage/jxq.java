package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jxq implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jxq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [glb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [glb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, wb] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v34, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v59, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [bwx, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        boolean z = true;
        z = true;
        boolean z2 = true;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                cjaVar.getClass();
                if (defpackage.acpd.F() && !cjaVar.a()) {
                    java.lang.Object obj2 = this.a;
                    if (!((java.lang.Boolean) ((jxm) obj2).a).booleanValue()) {
                        java.lang.Object obj3 = this.b;
                        if (((jxw) obj3).c.intValue() == 0) {
                            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new jlb(obj2, obj3, 14, (byte[]) null), 500L);
                        }
                    }
                }
                return defpackage.afbk.a;
            case 1:
                java.lang.Integer num = (java.lang.Integer) obj;
                int iIntValue = num.intValue();
                ajba ajbaVar = ((juy) this.b).c;
                java.lang.Object objB = ajbaVar.b();
                switch (iIntValue) {
                    case defpackage.abnt.b /* 0 */:
                        str = "0";
                        break;
                    case 1:
                        str = "1";
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "2";
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "3";
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        str = "4";
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        str = "5";
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "6";
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "7";
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        str = "8";
                        break;
                    case 9:
                        str = "9";
                        break;
                    case 10:
                        str = "*";
                        break;
                    case 11:
                        str = "#";
                        break;
                    default:
                        str = "";
                        break;
                }
                java.lang.Object obj4 = this.a;
                java.util.Objects.toString(objB);
                ajbaVar.d(java.lang.String.valueOf(objB).concat(str));
                gdl gdlVar = (gdl) obj4;
                gdlVar.g.invoke(ajbaVar.b());
                defpackage.affc affcVar = gdlVar.e;
                if (affcVar != null) {
                    affcVar.invoke(num);
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                uh uhVar = ((gdp) this.a).f;
                if (uhVar != null) {
                    ((jxv) this.b).a.t().k(uhVar, java.lang.String.valueOf(iIntValue2));
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                ?? r0 = this.b;
                this.a.b(java.lang.Boolean.valueOf(!zBooleanValue && r0.c()));
                if (zBooleanValue) {
                    r0.b();
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cja cjaVar2 = (defpackage.cja) obj;
                cjaVar2.getClass();
                boolean zA = cjaVar2.a();
                ?? r1 = this.b;
                this.a.b(java.lang.Boolean.valueOf(!zA && r1.c()));
                if (zA) {
                    r1.b();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.bxi) obj).getClass();
                com.google.android.apps.auto.components.apphost.signin.MaterialCarRestrictedEditText materialCarRestrictedEditTextB = juw.b((defpackage.bwx) this.b);
                android.view.ViewTreeObserver viewTreeObserver = materialCarRestrictedEditTextB != null ? materialCarRestrictedEditTextB.getViewTreeObserver() : 0;
                ?? r11 = this.a;
                if (viewTreeObserver != 0) {
                    viewTreeObserver.addOnWindowFocusChangeListener(r11);
                }
                return new defpackage.jzq(viewTreeObserver, r11, 0);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.android.car.libraries.apphost.internal.model.TabInternal tabInternal = (com.android.car.libraries.apphost.internal.model.TabInternal) obj;
                tabInternal.getClass();
                ((hll) this.b).i.t().s((wb) this.a, tabInternal.getContentId());
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bvm bvmVar = defpackage.kmj.a;
                ((defpackage.bxi) obj).getClass();
                java.lang.Object obj5 = this.a;
                ?? r12 = this.b;
                r12.add(obj5);
                return new defpackage.jzq(r12, obj5, 2);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                this.b.b(java.lang.Boolean.valueOf(zBooleanValue2));
                defpackage.jzb.l((android.content.Context) this.a, "Icon toggleButton changed: " + zBooleanValue2);
                return defpackage.afbk.a;
            case 9:
                boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                this.b.b(java.lang.Boolean.valueOf(zBooleanValue3));
                defpackage.jzb.l((android.content.Context) this.a, "Filled icon toggleButton changed: " + zBooleanValue3);
                return defpackage.afbk.a;
            case 10:
                boolean zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                this.b.b(java.lang.Boolean.valueOf(zBooleanValue4));
                defpackage.jzb.l((android.content.Context) this.a, "Filled toggleButton with icon changed: " + zBooleanValue4);
                return defpackage.afbk.a;
            case 11:
                boolean zBooleanValue5 = ((java.lang.Boolean) obj).booleanValue();
                this.b.b(java.lang.Boolean.valueOf(zBooleanValue5));
                defpackage.jzb.l((android.content.Context) this.a, "Filled toggleButton changed: " + zBooleanValue5);
                return defpackage.afbk.a;
            case 12:
                defpackage.cja cjaVar3 = (defpackage.cja) obj;
                cjaVar3.getClass();
                if (cjaVar3.a()) {
                    ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new ggc((defpackage.bcf) this.a, (defpackage.afdk) null, 17, (short[]) null), 3);
                }
                return defpackage.afbk.a;
            case 13:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                componentName.getClass();
                if (defpackage.afga.f(componentName, defpackage.mkt.G) || defpackage.afga.f(componentName, ((defpackage.ljw) this.a).d)) {
                    z2 = false;
                } else {
                    ?? r13 = this.b;
                    if (!r13.isEmpty()) {
                        java.util.Iterator it = r13.iterator();
                        while (it.hasNext()) {
                            if (defpackage.afga.f(((android.content.ComponentName) it.next()).getPackageName(), componentName.getPackageName())) {
                                z2 = false;
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z2);
            case 14:
                lny lnyVar = (lny) obj;
                lnyVar.getClass();
                ((lli) this.a).k();
                java.lang.Object obj6 = this.b;
                defpackage.eqp eqpVarC = obj6 == null ? lnyVar.c() : lnyVar.b((java.lang.String) obj6);
                eqpVarC.getClass();
                return eqpVarC;
            case 15:
                ur urVar = (ur) obj;
                urVar.getClass();
                tb tbVar = new tb();
                java.lang.Object obj7 = this.a;
                tbVar.e(((lkr) obj7).e);
                tbVar.d(new khi(obj7, 3));
                urVar.b(tbVar.a());
                java.lang.Object obj8 = this.b;
                obj8.getClass();
                urVar.a = ((java.lang.Boolean) obj8).booleanValue();
                return defpackage.afbk.a;
            case 16:
                ywd ywdVar = (ywf) obj;
                ywdVar.getClass();
                boolean z3 = ywdVar instanceof ywd;
                java.lang.Object obj9 = this.b;
                if (z3) {
                    return ((lkx) obj9).a.b((lkm) ((ywf) ywdVar).a);
                }
                if (ywdVar instanceof ywe) {
                    return ((lkx) obj9).b.d((rb) this.a, (aack) ((ywf) ((ywe) ywdVar)).a);
                }
                throw new defpackage.afas();
            case 17:
                ((tie) obj).getClass();
                java.lang.Object obj10 = this.a;
                android.content.Context context = (android.content.Context) obj10;
                return new lky(context, (mot) this.b, defpackage.lnt.u(44, context), new defpackage.lgy(obj10, 6));
            case 18:
                android.support.v4.media.session.MediaSessionCompat.Token token = (android.support.v4.media.session.MediaSessionCompat.Token) obj;
                if (token != null) {
                    ((defpackage.htw) this.b).a.invoke(this.a, token);
                }
                return defpackage.afbk.a;
            case 19:
                lob lobVar = (lob) obj;
                lobVar.getClass();
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.b;
                return defpackage.tcu.B(((llu) obj12).p, new defpackage.ipk(obj12, (java.lang.Object) lobVar, obj11, 11, (char[]) null));
            default:
                los losVar = (los) obj;
                if (!(losVar instanceof lok)) {
                    java.lang.Object obj13 = this.b;
                    if (!((lph) obj13).b) {
                        return defpackage.ebo.g(defpackage.ebo.e(defpackage.kja.a()), new defpackage.lpc(this.a, obj13, z ? 1 : 0));
                    }
                }
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.eqs(losVar);
        }
    }

    public /* synthetic */ jxq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
