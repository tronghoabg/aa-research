package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class inq implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ inq(defpackage.ipg ipgVar, int i) {
        this.c = i;
        this.a = ipgVar;
        this.b = "Timeout connecting from CAMS";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [itn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v56, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        java.lang.String str;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.ioh) this.a).K((com.google.android.gms.car.display.CarRegionId) this.b);
                return;
            case 1:
                ((defpackage.inn) this.a).b.e.a((defpackage.yym) this.b);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.inn innVar = (defpackage.inn) this.a;
                if (innVar.I()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ioh.b.f()).ai((char) 629)).y("%s not in the right state to stop after pause, doing nothing", innVar.g());
                    return;
                } else {
                    innVar.y((defpackage.inn) this.b);
                    return;
                }
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (android.os.Build.VERSION.SDK_INT >= 36) {
                    defpackage.jhl jhlVar = ((defpackage.qyt) this.b).a.N;
                    if (jhlVar == null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.h()).ai((char) 896)).u("setSurfacePackage: window is null, likely torn down");
                        return;
                    } else {
                        if (!(jhlVar instanceof defpackage.jhr)) {
                            throw new java.lang.IllegalStateException("Window is not a ViewProjectionWindow: ".concat(jhlVar.toString()));
                        }
                        ((defpackage.jhr) jhlVar).ai((android.os.Bundle) this.a);
                        return;
                    }
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.inn innVar2 = (defpackage.inn) ((defpackage.ipg) this.a).v();
                if (innVar2 != null) {
                    innVar2.K((java.lang.String) this.b, null);
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.inn innVar3 = (defpackage.inn) ((defpackage.ipg) this.a).v();
                if (innVar3 != null) {
                    innVar3.m((java.lang.RuntimeException) this.b);
                    return;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.iqd) this.a).e(this.b);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.ivc) this.a).m.a((defpackage.saf) this.b);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ivc ivcVar = (defpackage.ivc) this.a;
                ivcVar.h.e(2);
                java.lang.Object objFF = ivcVar.i.fF();
                if (objFF != null) {
                    defpackage.iyl iylVar = (defpackage.iyl) this.b;
                    if (iylVar.e == 0) {
                        defpackage.jfo jfoVar = ivcVar.d;
                        defpackage.iyk[] iykVarArr = iylVar.h;
                        if (iykVarArr != null && iykVarArr.length != 0) {
                            defpackage.jfp jfpVar = (defpackage.jfp) jfoVar;
                            com.google.android.gms.car.CarFacet carFacet = jfpVar.g;
                            int iAs = carFacet != null ? defpackage.a.as(carFacet.a) : 1;
                            defpackage.abor aborVarN = defpackage.zay.a.n();
                            int i = iylVar.h[0].e;
                            aborVarN.t();
                            defpackage.zay zayVar = (defpackage.zay) aborVarN.b;
                            zayVar.b = 1 | zayVar.b;
                            zayVar.c = i;
                            int i2 = iylVar.h[0].f;
                            aborVarN.t();
                            defpackage.zay zayVar2 = (defpackage.zay) aborVarN.b;
                            zayVar2.b = 2 | zayVar2.b;
                            zayVar2.d = i2;
                            if (iAs == 0) {
                                throw null;
                            }
                            aborVarN.t();
                            defpackage.zay zayVar3 = (defpackage.zay) aborVarN.b;
                            zayVar3.b |= 4;
                            zayVar3.e = iAs - 1;
                            defpackage.zay zayVar4 = (defpackage.zay) aborVarN.q();
                            defpackage.abor aborVarN2 = defpackage.yyg.a.n();
                            aborVarN2.t();
                            defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
                            zayVar4.getClass();
                            yygVar.j = zayVar4;
                            yygVar.b |= 64;
                            defpackage.yyh yyhVar = defpackage.yyh.TOUCH_EVENT;
                            int i3 = defpackage.ygw.d;
                            jfpVar.m(aborVarN2, yyhVar, defpackage.ymx.a);
                        }
                    }
                    ((defpackage.ioh) objFF).H(ivcVar.j, iylVar);
                    return;
                }
                return;
            case 9:
                defpackage.wfp.c();
                defpackage.ivc ivcVar2 = (defpackage.ivc) this.b;
                defpackage.iwj iwjVar = ivcVar2.m;
                int i4 = iwjVar.d;
                java.util.Locale locale = java.util.Locale.US;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i4);
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) this.a;
                if (motionEvent.getActionMasked() != 8) {
                    str = java.lang.String.format(java.util.Locale.US, "UNRECOGNIZED(%d)", java.lang.Integer.valueOf(motionEvent.getActionMasked()));
                } else {
                    defpackage.dmh dmhVar = iwjVar.f;
                    str = motionEvent.getAxisValue(26) > 0.0f ? "FOCUS_FORWARD" : "FOCUS_BACKWARD";
                }
                java.lang.String str2 = java.lang.String.format(locale, "display=%d, action=%s", numValueOf, str);
                ((defpackage.yqj) defpackage.iwj.a.l().ai((char) 1445)).y("onScrollEvent(%s)", new defpackage.zkf(defpackage.zke.a, str2));
                iwjVar.b("ScrollEvent", str2);
                ivcVar2.h.e(1);
                java.lang.Object objFF2 = ivcVar2.i.fF();
                if (objFF2 != null) {
                    ((defpackage.ioh) objFF2).G(ivcVar2.j, motionEvent);
                    return;
                }
                return;
            case 10:
                defpackage.ivc ivcVar3 = (defpackage.ivc) this.b;
                ivcVar3.h.e(2);
                java.lang.Object objFF3 = ivcVar3.i.fF();
                if (objFF3 != null) {
                    ((defpackage.ioh) objFF3).I(ivcVar3.j, (android.view.MotionEvent) this.a);
                    return;
                }
                return;
            case 11:
                defpackage.ivc ivcVar4 = ((defpackage.ivw) this.a).b;
                com.google.android.gms.car.display.CarDisplayId carDisplayId = ivcVar4.j;
                defpackage.ivi iviVar = ivcVar4.o;
                iviVar.getClass();
                iviVar.o(this.b);
                return;
            case 12:
                defpackage.xpa xpaVar = ((xpd) this.b).c;
                if (xpaVar == null) {
                    xpaVar = defpackage.xpa.a;
                }
                ((defpackage.jbw) ((defpackage.izs) this.a).z.a).d(xpaVar, false);
                return;
            case 13:
                defpackage.ysr.bk(android.os.Build.VERSION.SDK_INT >= 36, "setSurfacePackage is only supported on Android API 36 and above.");
                defpackage.jhe jheVar = (defpackage.jhe) this.b;
                defpackage.jhl jhlVar2 = jheVar.h;
                if (jhlVar2 == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jhe.a.h()).ai((char) 2046)).u("setSurfacePackage: window is null");
                    return;
                }
                java.lang.Object obj = this.a;
                defpackage.ysr.bn(jhlVar2 instanceof defpackage.jhr, "Window is not a ViewProjectionWindow: %s", jhlVar2);
                ((defpackage.jhr) jheVar.h).ai((android.os.Bundle) obj);
                return;
            case 14:
                defpackage.jhe jheVar2 = (defpackage.jhe) this.a;
                android.view.KeyEvent keyEvent = (android.view.KeyEvent) jheVar2.e.a();
                defpackage.ill.d();
                if (keyEvent != null) {
                    com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData = (com.google.android.gms.car.KeyEventCompleteData) this.b;
                    if (keyEventCompleteData.a) {
                        jheVar2.d.aq(keyEvent);
                    } else {
                        android.graphics.Rect rectA = keyEventCompleteData.a();
                        defpackage.jhl jhlVar3 = jheVar2.h;
                        if (jhlVar3 != null && rectA != null) {
                            jhlVar3.aj(rectA);
                        }
                        jheVar2.d.ai(jheVar2.h, keyEvent);
                    }
                }
                jheVar2.y();
                return;
            case 15:
                ((defpackage.jhe) this.a).B((com.google.android.gms.car.CarWindowLayoutParams) this.b);
                return;
            case 16:
                ((defpackage.jhe) this.b).h.au((android.graphics.Rect) this.a);
                return;
            case 17:
                defpackage.jhe jheVar3 = (defpackage.jhe) this.a;
                android.content.Context contextU = jheVar3.u(jheVar3.c);
                if (contextU == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jhe.a.h()).ai((char) 2090)).u("Unable to create context to load animation, falling back to default");
                    jheVar3.x(jheVar3.v());
                    return;
                } else {
                    jheVar3.x(((defpackage.inh) jheVar3.d).Y.b(contextU, (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) this.b, jheVar3.t(), jheVar3.s()));
                    return;
                }
            case 18:
                defpackage.jhe jheVar4 = (defpackage.jhe) this.a;
                android.view.MotionEvent motionEvent2 = (android.view.MotionEvent) jheVar4.f.a();
                defpackage.ill.d();
                if (motionEvent2 != null) {
                    defpackage.jhl jhlVar4 = jheVar4.h;
                    if (jhlVar4 == null) {
                        throw new java.lang.IllegalStateException("Motion event received prior to createWindow");
                    }
                    jheVar4.d.G(jhlVar4, motionEvent2, (com.google.android.gms.car.TouchEventCompleteData) this.b);
                }
                jheVar4.y();
                return;
            case 19:
                defpackage.jhl jhlVar5 = ((defpackage.jhe) this.a).h;
                if (jhlVar5 != 0) {
                    jhlVar5.an(this.b);
                    return;
                }
                return;
            default:
                ((defpackage.jhe) this.a).z(true, (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) this.b, -1);
                return;
        }
    }

    public inq(defpackage.ivc ivcVar, android.view.MotionEvent motionEvent, int i) {
        this.c = i;
        this.a = motionEvent;
        this.b = ivcVar;
    }

    public inq(defpackage.ivc ivcVar, defpackage.iyl iylVar, int i) {
        this.c = i;
        this.b = iylVar;
        this.a = ivcVar;
    }

    public /* synthetic */ inq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ inq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
