package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwj implements defpackage.xzi {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public lwj(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, xzi] */
    @Override // defpackage.xzi
    public final /* synthetic */ java.lang.Object fF() {
        uul uujVar;
        ubg ubgVar;
        defpackage.dta dtaVar = null;
        boolean zF = false;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.lwk lwkVar = (defpackage.lwk) this.a;
                java.util.List listG = lwkVar.g();
                listG.size();
                java.util.Iterator it = listG.iterator();
                while (true) {
                    java.lang.String str = lwkVar.b;
                    if (!it.hasNext()) {
                        if (!zF) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lwk.a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4384)).y("No semantic mark-as-read action found for %s", str);
                        }
                        return dtaVar;
                    }
                    defpackage.dta dtaVar2 = (defpackage.dta) it.next();
                    java.lang.CharSequence charSequence = dtaVar2.j;
                    if (dtaVar2.e == 2) {
                        if (dtaVar2.d) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lwk.a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4386)).M("%s for %s is a semantic mark-as-read action, but getShowsUserInterface() is true", charSequence, str);
                        } else if (dtaVar != null) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lwk.a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4385)).R("Ignoring secondary mark-as-read action for %s with title %s (keeping %s)", str, charSequence, dtaVar.j);
                            lwkVar.h(defpackage.zbd.lX);
                        } else {
                            dtaVar = dtaVar2;
                        }
                        zF = true;
                    }
                }
                break;
            case 1:
                defpackage.lwk lwkVar2 = (defpackage.lwk) this.a;
                java.util.List listG2 = lwkVar2.g();
                listG2.size();
                java.util.Iterator it2 = listG2.iterator();
                while (true) {
                    java.lang.String str2 = lwkVar2.b;
                    if (!it2.hasNext()) {
                        if (!zF) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lwk.a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4389)).y("No semantic reply action found for %s", str2);
                        }
                        return dtaVar;
                    }
                    defpackage.dta dtaVar3 = (defpackage.dta) it2.next();
                    java.lang.CharSequence charSequence2 = dtaVar3.j;
                    if (dtaVar3.e == 1) {
                        if (dtaVar3.d) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lwk.a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4392)).M("%s for %s is a semantic reply action, but getShowsUserInterface() is true", charSequence2, str2);
                        } else {
                            dut[] dutVarArr = dtaVar3.b;
                            if (dutVarArr == null || dutVarArr.length != 1) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lwk.a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4390)).M("%s for %s is a semantic reply action, but does not have exactly one remote input", charSequence2, str2);
                            } else if (dtaVar != null) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lwk.a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4391)).R("Ignoring secondary reply action for %s with title %s (keeping %s)", str2, charSequence2, dtaVar.j);
                                lwkVar2.h(defpackage.zbd.lY);
                            } else {
                                dtaVar = dtaVar3;
                            }
                        }
                        zF = true;
                    }
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((pod) this.a).a(false);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((pod) this.a).a(true);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new uxj("area_fill", new uvv((android.graphics.Bitmap) this.a.fF(), false), 3, 1);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                vbn.d();
                java.lang.Object obj = this.a;
                unk unkVar = (unk) ((tyy) obj).i.a();
                defpackage.xei xeiVar = new defpackage.xei(unkVar);
                android.content.Context context = ((tyy) obj).d;
                tot totVar = ((tyy) obj).j;
                defpackage.xzi xziVar = totVar.a;
                java.lang.Boolean.TRUE.booleanValue();
                boolean z = totVar.c;
                defpackage.vlu vluVar = totVar.d;
                vbn.d();
                boolean z2 = z || (context.getApplicationInfo().flags & 536870912) != 0;
                if (uxz.a || !z2) {
                    uujVar = new uuj(context, xeiVar, vluVar);
                    uujVar.setZOrderOnTop(false);
                } else {
                    uujVar = new uul(context, xeiVar, vluVar);
                }
                uujVar.i(true);
                uujVar.h(unkVar);
                uujVar.a().setFocusable(true);
                uujVar.a().setImportantForAccessibility(1);
                utu utuVarH = ((tyy) obj).h();
                defpackage.xzi xziVar2 = ((tyy) obj).t;
                int i = ((tyy) obj).j.e;
                ubg ubgVar2 = ((tyy) obj).v;
                zF = ubgVar2 != null ? ubgVar2.f() : false;
                j$.time.Duration duration = j$.time.Duration.ZERO;
                vjx vjxVar = unkVar.z;
                defpackage.xei xeiVar2 = unkVar.B;
                int iIntValue = ((java.lang.Integer) unkVar.p.fF()).intValue();
                int i2 = unkVar.n;
                defpackage.erh erhVar = unkVar.A;
                tti ttiVar = new tti(xeiVar2, utuVarH, xziVar2, iIntValue, i2, android.view.Choreographer.getInstance());
                unkVar.s = new tvj(ttiVar, erhVar, unkVar.d, i, unkVar.y, zF);
                j$.util.Optional optionalA = unkVar.u;
                if (true == optionalA.isPresent()) {
                    optionalA = ((uns) optionalA.get()).a();
                    optionalA.getClass();
                }
                tvj tvjVar = unkVar.s;
                tvjVar.getClass();
                pvb pvbVar = new pvb(tvjVar, 6);
                if (true == optionalA.isPresent()) {
                    ((tvj) pvbVar.a).d((tvg) optionalA.get());
                }
                unkVar.g = uujVar;
                unkVar.w = ttiVar;
                ttiVar.f();
                return uujVar;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                vbn.d();
                java.lang.Object obj2 = this.a;
                android.content.res.Resources resources = ((tyy) obj2).l;
                android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                tok tokVar = (tok) ((tyy) obj2).g.a();
                uwd uwdVar = (uwd) ((tyy) obj2).h.a();
                if (resources.getDisplayMetrics().widthPixels > 0 && resources.getDisplayMetrics().heightPixels > 0) {
                    tuj tujVar = (tuj) tokVar.h.a();
                    int i3 = displayMetrics.widthPixels;
                    int i4 = displayMetrics.heightPixels;
                    float f = displayMetrics.density;
                    uwdVar.getClass();
                    utu utuVar = new utu(tujVar, i3, i4, f, new tyl(uwdVar, 5), ((tyy) obj2).q);
                    utuVar.c = true;
                    return utuVar;
                }
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(resources.getDisplayMetrics().widthPixels);
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(resources.getDisplayMetrics().heightPixels);
                android.content.Context baseContext = ((tyy) obj2).d;
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(baseContext.getResources().getDisplayMetrics().widthPixels);
                java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(baseContext.getResources().getDisplayMetrics().heightPixels);
                android.content.Context context2 = ((tyy) obj2).c;
                java.lang.String strConcat = java.lang.String.format("Resources.size=%sx%s; ActivityContext.Resources.size=%sx%s; ApplicationContext.Resources.size=%sx%s", numValueOf, numValueOf2, numValueOf3, numValueOf4, java.lang.Integer.valueOf(context2.getResources().getDisplayMetrics().widthPixels), java.lang.Integer.valueOf(context2.getResources().getDisplayMetrics().heightPixels));
                while (baseContext instanceof android.content.ContextWrapper) {
                    baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
                    strConcat = java.lang.String.valueOf(strConcat).concat(java.lang.String.valueOf(java.lang.String.format("; ActivityContext.base.Resources.size=%s.%s", java.lang.Integer.valueOf(baseContext.getResources().getDisplayMetrics().widthPixels), java.lang.Integer.valueOf(baseContext.getResources().getDisplayMetrics().heightPixels))));
                }
                throw new java.lang.IllegalStateException(strConcat);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                vbn.d();
                java.lang.Object obj3 = this.a;
                return new tzm(((tyy) obj3).y, ((tyy) obj3).k, zxp.f().a, uuy.a().a(true), ((tyy) obj3).z, ((tyy) obj3).m);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                tyy tyyVar = (tyy) this.a;
                return (tyyVar.n == null || (ubgVar = tyyVar.v) == null || !ubgVar.h()) ? new tyv(tyyVar, 0) : new tyv(tyyVar, 1);
            default:
                tyy tyyVar2 = (tyy) this.a;
                uwd uwdVar2 = (uwd) tyyVar2.h.a();
                boolean zE = tyyVar2.w.e();
                defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.typ(5));
                defpackage.xzi xziVarAQ2 = defpackage.ysr.aQ(new defpackage.typ(6));
                defpackage.xzi xziVarAQ3 = defpackage.ysr.aQ(new defpackage.typ(7));
                defpackage.xzi xziVarAQ4 = defpackage.ysr.aQ(new defpackage.typ(8));
                defpackage.xzi xziVarAQ5 = defpackage.ysr.aQ(new defpackage.typ(9));
                defpackage.xzi xziVarAQ6 = defpackage.ysr.aQ(new defpackage.typ(10));
                return new uho(uwdVar2, new uhn(tyyVar2.z, tyyVar2.y, tyyVar2.l, tyyVar2.s, tyyVar2.o, tyyVar2.p, tyyVar2.u, zE, xziVarAQ, xziVarAQ2, xziVarAQ3, xziVarAQ4, xziVarAQ5, xziVarAQ6), tyyVar2.i(), tyyVar2.k);
        }
    }
}
