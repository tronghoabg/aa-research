package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class chs implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ chs(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v60, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v84, types: [afer, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean zDispatchTouchEvent;
        boolean z = false;
        int i = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.cla claVar = (defpackage.cla) obj;
                float fA = claVar.a();
                cht chtVar = (cht) this.a;
                claVar.B(chtVar.a * fA);
                claVar.C(chtVar.b);
                claVar.s(chtVar.c);
                claVar.p(-72057594037927936L);
                claVar.D(-72057594037927936L);
                return defpackage.afbk.a;
            case 1:
                defpackage.cxn cxnVar = (defpackage.cxn) obj;
                this.a.invoke(cxnVar);
                cxnVar.q();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.cge cgeVar = (defpackage.cge) this.a;
                defpackage.cge cgeVarO = cgeVar.q;
                defpackage.bzc bzcVar = null;
                while (cgeVarO != null) {
                    if (cgeVarO instanceof defpackage.cjc) {
                        if (defpackage.mw.u((defpackage.cjc) cgeVarO)) {
                            return defpackage.afbk.a;
                        }
                    } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                        int i2 = 0;
                        for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                            if ((cgeVar2.r & 1024) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    cgeVarO = cgeVar2;
                                } else {
                                    if (bzcVar == null) {
                                        bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                    }
                                    if (cgeVarO != null) {
                                        bzcVar.n(cgeVarO);
                                    }
                                    bzcVar.n(cgeVar2);
                                    cgeVarO = null;
                                }
                            }
                        }
                        if (i2 != 1) {
                        }
                    }
                    cgeVarO = defpackage.cjv.o(bzcVar);
                }
                if (!cgeVar.q.A) {
                    defpackage.csc.c("visitChildren called on an unattached node");
                }
                defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                defpackage.cge cgeVar3 = cgeVar.q;
                defpackage.cge cgeVar4 = cgeVar3.u;
                if (cgeVar4 == null) {
                    defpackage.cjv.x(bzcVar2, cgeVar3);
                } else {
                    bzcVar2.n(cgeVar4);
                }
                while (true) {
                    int i3 = bzcVar2.b;
                    if (i3 != 0) {
                        defpackage.cge cgeVarO2 = (defpackage.cge) bzcVar2.c(i3 - 1);
                        if ((cgeVarO2.s & 1024) == 0) {
                            defpackage.cjv.x(bzcVar2, cgeVarO2);
                        } else {
                            while (cgeVarO2 != null) {
                                if ((cgeVarO2.r & 1024) != 0) {
                                    defpackage.bzc bzcVar3 = null;
                                    while (cgeVarO2 != null) {
                                        if (cgeVarO2 instanceof defpackage.cjc) {
                                            if (defpackage.mw.u((defpackage.cjc) cgeVarO2)) {
                                            }
                                        } else if ((cgeVarO2.r & 1024) != 0 && (cgeVarO2 instanceof defpackage.cwo)) {
                                            int i4 = 0;
                                            for (defpackage.cge cgeVar5 = ((defpackage.cwo) cgeVarO2).C; cgeVar5 != null; cgeVar5 = cgeVar5.u) {
                                                if ((cgeVar5.r & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cgeVarO2 = cgeVar5;
                                                    } else {
                                                        if (bzcVar3 == null) {
                                                            bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                                        }
                                                        if (cgeVarO2 != null) {
                                                            bzcVar3.n(cgeVarO2);
                                                        }
                                                        bzcVar3.n(cgeVar5);
                                                        cgeVarO2 = null;
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        cgeVarO2 = defpackage.cjv.o(bzcVar3);
                                    }
                                }
                                cgeVarO2 = cgeVarO2.u;
                            }
                        }
                        break;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj2 = this.a;
                defpackage.chw chwVar = (defpackage.chw) obj;
                defpackage.cge cgeVar6 = (defpackage.cge) obj2;
                defpackage.cge cgeVarO3 = cgeVar6.q;
                defpackage.bzc bzcVar4 = null;
                while (cgeVarO3 != null) {
                    if (cgeVarO3 instanceof defpackage.cjc) {
                        if (defpackage.mw.t((defpackage.cjc) cgeVarO3)) {
                            return defpackage.afbk.a;
                        }
                    } else if ((cgeVarO3.r & 1024) != 0 && (cgeVarO3 instanceof defpackage.cwo)) {
                        int i5 = 0;
                        for (defpackage.cge cgeVar7 = ((defpackage.cwo) cgeVarO3).C; cgeVar7 != null; cgeVar7 = cgeVar7.u) {
                            if ((cgeVar7.r & 1024) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    cgeVarO3 = cgeVar7;
                                } else {
                                    if (bzcVar4 == null) {
                                        bzcVar4 = new defpackage.bzc(new defpackage.cge[16]);
                                    }
                                    if (cgeVarO3 != null) {
                                        bzcVar4.n(cgeVarO3);
                                    }
                                    bzcVar4.n(cgeVar7);
                                    cgeVarO3 = null;
                                }
                            }
                        }
                        if (i5 != 1) {
                        }
                    }
                    cgeVarO3 = defpackage.cjv.o(bzcVar4);
                }
                if (!cgeVar6.q.A) {
                    defpackage.csc.c("visitChildren called on an unattached node");
                }
                defpackage.bzc bzcVar5 = new defpackage.bzc(new defpackage.cge[16]);
                defpackage.cge cgeVar8 = cgeVar6.q;
                defpackage.cge cgeVar9 = cgeVar8.u;
                if (cgeVar9 == null) {
                    defpackage.cjv.x(bzcVar5, cgeVar8);
                } else {
                    bzcVar5.n(cgeVar9);
                }
                while (true) {
                    int i6 = bzcVar5.b;
                    if (i6 != 0) {
                        defpackage.cge cgeVarO4 = (defpackage.cge) bzcVar5.c(i6 - 1);
                        if ((cgeVarO4.s & 1024) == 0) {
                            defpackage.cjv.x(bzcVar5, cgeVarO4);
                        } else {
                            while (cgeVarO4 != null) {
                                if ((cgeVarO4.r & 1024) != 0) {
                                    defpackage.bzc bzcVar6 = null;
                                    while (cgeVarO4 != null) {
                                        if (cgeVarO4 instanceof defpackage.cjc) {
                                            if (defpackage.mw.t((defpackage.cjc) cgeVarO4)) {
                                            }
                                        } else if ((cgeVarO4.r & 1024) != 0 && (cgeVarO4 instanceof defpackage.cwo)) {
                                            int i7 = 0;
                                            for (defpackage.cge cgeVar10 = ((defpackage.cwo) cgeVarO4).C; cgeVar10 != null; cgeVar10 = cgeVar10.u) {
                                                if ((cgeVar10.r & 1024) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        cgeVarO4 = cgeVar10;
                                                    } else {
                                                        if (bzcVar6 == null) {
                                                            bzcVar6 = new defpackage.bzc(new defpackage.cge[16]);
                                                        }
                                                        if (cgeVarO4 != null) {
                                                            bzcVar6.n(cgeVarO4);
                                                        }
                                                        bzcVar6.n(cgeVar10);
                                                        cgeVarO4 = null;
                                                    }
                                                }
                                            }
                                            if (i7 != 1) {
                                            }
                                        }
                                        cgeVarO4 = defpackage.cjv.o(bzcVar6);
                                    }
                                }
                                cgeVarO4 = cgeVarO4.u;
                            }
                        }
                        break;
                    } else {
                        ciz cizVar = (ciz) obj2;
                        if (!defpackage.afga.f(cizVar.a, defpackage.cit.a)) {
                            if (defpackage.afga.f(cizVar.a, defpackage.cit.b)) {
                                chwVar.a();
                            } else {
                                cizVar.a.a(7);
                            }
                        }
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.dnb(this.a, 1);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.czh czhVar = (defpackage.czh) obj;
                defpackage.afer aferVar = defpackage.cqj.a;
                if (czhVar.M().A) {
                    ((defpackage.afgv) this.a).a = czhVar;
                } else {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                cqo cqoVar = (cqo) obj;
                defpackage.afgv afgvVar = (defpackage.afgv) this.a;
                java.lang.Object obj3 = afgvVar.a;
                if (obj3 == null && cqoVar.c) {
                    afgvVar.a = cqoVar;
                } else if (obj3 != null) {
                    boolean z2 = cqoVar.b;
                }
                return java.lang.Boolean.TRUE;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!((cqo) obj).c) {
                    return defpackage.czg.a;
                }
                ((defpackage.afgq) this.a).a = false;
                return defpackage.czg.c;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.crj) this.a).d().invoke((android.view.MotionEvent) obj);
                return defpackage.afbk.a;
            case 9:
                ((defpackage.crj) this.a).d().invoke((android.view.MotionEvent) obj);
                return defpackage.afbk.a;
            case 10:
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                java.lang.Object obj4 = this.a;
                switch (actionMasked) {
                    case defpackage.abnt.b /* 0 */:
                    case 1:
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        zDispatchTouchEvent = ((defpackage.dmm) obj4).dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = ((defpackage.dmm) obj4).dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return java.lang.Boolean.valueOf(zDispatchTouchEvent);
            case 11:
                defpackage.cus cusVar = (defpackage.cus) this.a;
                cusVar.g(cusVar.b, (defpackage.deq) obj);
                return defpackage.afbk.a;
            case 12:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                ?? r11 = this.a;
                int size = r11.size();
                for (int i8 = 0; i8 < size; i8++) {
                    cuwVar.y((defpackage.cux) r11.get(i8), 0, 0, defpackage.cuy.a);
                }
                return defpackage.afbk.a;
            case 13:
                defpackage.cwf cwfVar = (defpackage.cwf) obj;
                if (cwfVar.h() != Integer.MAX_VALUE) {
                    if (cwfVar.i().b) {
                        cwfVar.m();
                    }
                    java.util.Iterator it = cwfVar.i().h.entrySet().iterator();
                    while (true) {
                        java.lang.Object obj5 = this.a;
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            ((defpackage.cwe) obj5).d((defpackage.csf) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue(), cwfVar.k());
                        } else {
                            defpackage.cyl cylVar = cwfVar.k().x;
                            cylVar.getClass();
                            while (true) {
                                defpackage.cwe cweVar = (defpackage.cwe) obj5;
                                if (!defpackage.afga.f(cylVar, cweVar.a.k())) {
                                    for (defpackage.csf csfVar : cweVar.c(cylVar).keySet()) {
                                        cweVar.d(csfVar, cweVar.a(cylVar, csfVar), cylVar);
                                    }
                                    cylVar = cylVar.x;
                                    cylVar.getClass();
                                }
                            }
                        }
                    }
                }
                return defpackage.afbk.a;
            case 14:
                java.lang.Class cls = defpackage.czz.a;
                ((defpackage.afgv) this.a).a = (defpackage.cjc) obj;
                return java.lang.Boolean.TRUE;
            case 15:
                java.lang.Object obj6 = this.a;
                return new defpackage.dal((android.view.View) obj6, ((defpackage.czz) obj6).I(), (aiuw) obj);
            case 16:
                return java.lang.Boolean.valueOf(((defpackage.cjc) obj).k(((defpackage.chz) this.a).a));
            case 17:
                return java.lang.Boolean.valueOf(((defpackage.zo) this.a).b(((defpackage.dec) obj).c));
            case 18:
                defpackage.djp djpVar = (defpackage.djp) obj;
                djpVar.b();
                rie rieVar = (rie) this.a;
                defpackage.bzc bzcVar7 = (defpackage.bzc) rieVar.b;
                java.lang.Object[] objArr = bzcVar7.a;
                int i9 = bzcVar7.b;
                while (true) {
                    if (i >= i9) {
                        i = -1;
                    } else if (!defpackage.afga.f((czk) objArr[i], djpVar)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    bzcVar7.c(i);
                }
                if (bzcVar7.b == 0) {
                    rieVar.c.invoke();
                }
                return defpackage.afbk.a;
            case 19:
                if (((java.lang.Throwable) obj) != null) {
                    ((android.os.CancellationSignal) this.a).cancel();
                }
                return defpackage.afbk.a;
            default:
                defpackage.dbb.j((defpackage.dek) obj, ((defpackage.ddw) this.a).a);
                return defpackage.afbk.a;
        }
    }
}
