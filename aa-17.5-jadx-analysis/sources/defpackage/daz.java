package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final /* synthetic */ class daz implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ daz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v79, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v59, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [cym, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        String strConcat;
        Object objPrevious;
        int i = 14;
        switch (this.b) {
            case 0:
                return ((czq) this.a).aa();
            case 1:
                return Boolean.valueOf(((czq) this.a).Y());
            case 2:
                return this.a.I();
            case 3:
                czq czqVar = (czq) this.a;
                sm smVar = czqVar.aa;
                if (smVar != null) {
                    return smVar;
                }
                sm smVar2 = new sm(czqVar.I());
                czqVar.aa = smVar2;
                return smVar2;
            case 4:
                czq czqVar2 = (czq) this.a;
                dan danVar = czqVar2.T;
                if (danVar != null) {
                    return danVar;
                }
                dan danVar2 = new dan();
                czqVar2.T = danVar2;
                return danVar2;
            case 5:
                return ((czq) this.a).K;
            case 6:
                if (dbi.b.compareAndSet(false, true)) {
                    this.a.j(afak.a);
                }
                return afak.a;
            case 7:
                cmd cmdVar = (cmd) obj;
                cju cjuVarB = cmdVar.r().b();
                afeg afegVar = ((dbj) this.a).a;
                if (afegVar != null) {
                    afegVar.invoke(cjuVarB, cmdVar.r().a);
                }
                return afak.a;
            case 8:
                dik dikVar = (dik) obj;
                die dieVar = dikVar.b;
                int i2 = dikVar.c;
                int i3 = dikVar.d;
                Object obj2 = dikVar.e;
                return ((wci) this.a).e(new dik(null, dieVar, i2, i3)).a();
            case 9:
                diz dizVar = (diz) obj;
                if (dizVar instanceof diu) {
                    diu diuVar = (diu) dizVar;
                    strConcat = "CommitTextCommand(text.length=" + diuVar.b().length() + ", newCursorPosition=" + diuVar.a + ")";
                } else if (dizVar instanceof djt) {
                    djt djtVar = (djt) dizVar;
                    strConcat = "SetComposingTextCommand(text.length=" + djtVar.b().length() + ", newCursorPosition=" + djtVar.a + ")";
                } else if (dizVar instanceof djs) {
                    strConcat = ((djs) dizVar).toString();
                } else if (dizVar instanceof dix) {
                    strConcat = ((dix) dizVar).toString();
                } else if (dizVar instanceof diy) {
                    strConcat = ((diy) dizVar).toString();
                } else if (dizVar instanceof dju) {
                    strConcat = ((dju) dizVar).toString();
                } else if (dizVar instanceof djb) {
                    strConcat = "FinishComposingTextCommand()";
                } else if (dizVar instanceof dit) {
                    strConcat = "BackspaceCommand()";
                } else {
                    if (dizVar instanceof djg) {
                        throw null;
                    }
                    if (dizVar instanceof diw) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String simpleName = affw.a.getOrCreateKotlinClass(dizVar.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(simpleName);
                    }
                }
                return (this.a == dizVar ? " > " : "   ").concat(strConcat);
            case 10:
                Throwable th = (Throwable) obj;
                Object obj3 = this.a;
                if (th != null) {
                    ((egd) obj3).g.i(new ego(th));
                }
                egd egdVar = (egd) obj3;
                if (egdVar.d.b()) {
                    egl eglVarK = egdVar.k();
                    eglVarK.c.set(true);
                    eglVarK.b.invoke();
                }
                return afak.a;
            case 11:
                ((eqj) this.a).m(obj);
                return afak.a;
            case 12:
                qrn qrnVar = (qrn) obj;
                Object obj4 = this.a;
                if (qrnVar == null) {
                    ((kkq) obj4).a();
                    ((eqj) obj4).j(0);
                } else {
                    ((kkq) obj4).a();
                    try {
                        kjq kjqVarA = kjq.a.a();
                        kjz kjzVar = (kjz) woy.bP(jul.e(kjqVarA.i(), 34908673));
                        if (kjzVar == null) {
                            ((ype) kkq.h.f()).u("Overlay property not supported by car");
                            ((eqj) obj4).j(0);
                        } else {
                            ((ype) kkq.h.f()).u("Found overlay property, starting observation");
                            eqj eqjVarB = kjqVarA.b(kjzVar);
                            ((kkq) obj4).j = eqjVarB;
                            ((eql) obj4).r(eqjVarB, ((kkq) obj4).k);
                        }
                    } catch (IllegalStateException e) {
                        ((ype) ((ype) kkq.h.h()).p(e)).u("Failed to setup overlay property observation: manager not initialized");
                        ((eqj) obj4).j(0);
                    } catch (qrz e2) {
                        ((ype) ((ype) kkq.h.h()).p(e2)).u("Failed to setup overlay property observation: car not connected");
                        ((eqj) obj4).j(0);
                    } catch (qsa e3) {
                        ((ype) ((ype) kkq.h.h()).p(e3)).u("Failed to setup overlay property observation: car not supported");
                        ((eqj) obj4).j(0);
                    }
                }
                return afak.a;
            case 13:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                Object obj5 = this.a;
                cieVar.f(new daz(obj5, i));
                cieVar.g(new daz(obj5, 15));
                return afak.a;
            case 14:
                ((cho) obj).getClass();
                kmf kmfVar = (kmf) this.a;
                yph yphVar = kmfVar.a;
                yphVar.l().y("focusProperties onEnter, currentFocus=%s", true != kmfVar.hasFocus() ? "false" : "true");
                if (lbh.d().gN() && !kmfVar.hasFocus()) {
                    yphVar.l().u("Requesting default focus");
                    ?? r6 = kmfVar.d.a;
                    ListIterator listIterator = r6.listIterator(r6.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            if (((Boolean) ((ogz) objPrevious).a.invoke()).booleanValue()) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    ogz ogzVar = (ogz) objPrevious;
                    Object obj6 = ogzVar != null ? ogzVar.b : null;
                    if (obj6 != null) {
                        ((cil) obj6).a(7);
                    }
                }
                return afak.a;
            case 15:
                cho choVar = (cho) obj;
                choVar.getClass();
                kmf kmfVar2 = (kmf) this.a;
                kmfVar2.a.l().u("focusProperties onExit, cancelFocusChange and clearFocus");
                choVar.a();
                kmfVar2.l().k(false, true, 8);
                return afak.a;
            case 16:
                cis cisVar = (cis) obj;
                yph yphVar2 = kvc.a;
                cisVar.getClass();
                this.a.b(Boolean.valueOf(cisVar.b()));
                return afak.a;
            case 17:
                qrn qrnVar2 = (qrn) obj;
                qrnVar2.getClass();
                return Boolean.valueOf(((ldz) this.a).d(qrnVar2));
            case 18:
                return new lgy((mpz) this.a);
            case 19:
                yph yphVar3 = lpq.a;
                return tby.w((eqj) this.a, new llf((qrn) obj, i));
            default:
                ((lrw) this.a).c.m((loz) obj);
                return afak.a;
        }
    }
}
