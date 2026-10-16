package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nvp implements defpackage.nuy {
    final /* synthetic */ defpackage.nvq a;

    public nvp(defpackage.nvq nvqVar) {
        this.a = nvqVar;
    }

    @Override // defpackage.nuy
    public final void a(nuv nuvVar) {
        this.a.d.b(nuvVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:108:0x0262  */
    /* JADX WARN: Code duplicated, block: B:110:0x0268  */
    /* JADX WARN: Code duplicated, block: B:111:0x0274  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0191  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3 A[ADDED_TO_REGION] */
    @Override // defpackage.nuy
    public final void b(nuv nuvVar) throws wfo {
        nvh nvhVar;
        nvf nvfVar;
        defpackage.nwy nwyVar;
        java.util.List list;
        nva nvaVar;
        defpackage.zbd zbdVar;
        defpackage.zbd zbdVar2;
        defpackage.nve nveVar;
        defpackage.nvq nvqVar = this.a;
        if (!(nvqVar.b() && ((nveVar = nuvVar.c.x) == defpackage.nve.e || (nveVar == defpackage.nve.f && nuvVar.e))) && ((nvfVar = (nvhVar = nuvVar.c).a) == nvf.d || nvfVar == nvf.e)) {
            if (defpackage.acyc.ah()) {
                defpackage.oio oioVarA = defpackage.oio.a();
                int iOrdinal = nuvVar.b().ordinal();
                if (iOrdinal == 0) {
                    zbdVar = defpackage.zbd.og;
                } else if (iOrdinal == 1) {
                    zbdVar = defpackage.zbd.oh;
                } else if (iOrdinal == 2) {
                    zbdVar = defpackage.zbd.op;
                } else {
                    if (iOrdinal != 3) {
                        throw new defpackage.afas();
                    }
                    zbdVar = defpackage.zbd.oi;
                }
                android.content.ComponentName componentNameC = defpackage.nvo.c(nuvVar);
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SYSTEM_UI_NOTIFICATION, zbdVar);
                rrvVarH.p(componentNameC);
                oioVarA.b((defpackage.rrw) rrvVarH.l());
                android.content.ComponentName componentNameC2 = defpackage.nvo.c(nuvVar);
                android.content.Context context = defpackage.mkp.a.c;
                context.getClass();
                java.lang.Object systemService = context.getSystemService((java.lang.Class<java.lang.Object>) android.app.NotificationManager.class);
                systemService.getClass();
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
                int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                if (currentInterruptionFilter == 0) {
                    zbdVar2 = defpackage.zbd.ox;
                } else if (currentInterruptionFilter == 1) {
                    zbdVar2 = defpackage.zbd.ot;
                } else if (currentInterruptionFilter == 2) {
                    zbdVar2 = defpackage.zbd.ou;
                } else if (currentInterruptionFilter != 3) {
                    zbdVar2 = currentInterruptionFilter != 4 ? defpackage.zbd.ox : defpackage.zbd.ow;
                } else {
                    zbdVar2 = defpackage.zbd.ov;
                }
                defpackage.nvo.b(zbdVar2, componentNameC2);
                android.app.NotificationManager.Policy notificationPolicy = notificationManager.getNotificationPolicy();
                if (notificationPolicy != null) {
                    defpackage.nvo.b(defpackage.lyd.p(a$.ExternalSyntheticApiModelOutline2.m(notificationPolicy), 256) ? defpackage.zbd.oz : defpackage.zbd.oy, componentNameC2);
                    defpackage.nvo.b(defpackage.lyd.p(a$.ExternalSyntheticApiModelOutline2.m(notificationPolicy), 16) ? defpackage.zbd.oB : defpackage.zbd.oA, componentNameC2);
                }
                boolean z = nvhVar.z;
                nuu nuuVarB = nuvVar.b();
                int iOrdinal2 = nuuVarB.ordinal();
                if (iOrdinal2 == 0) {
                    defpackage.nvq.b.l().y("HUN allowed by DND settings (legacy=%b)", java.lang.Boolean.valueOf(z));
                } else if (iOrdinal2 != 2) {
                    defpackage.nvq.b.l().N("HUN suppressed (%s, legacy=%b), aborting.", nuuVarB, z);
                } else {
                    defpackage.nvq.b.l().N("HUN audio suppressed (%s, legacy=%b)", nuuVarB, z);
                }
                nwyVar = nvqVar.d;
                if (nwyVar.i(nuvVar)) {
                    nwyVar.f(nuvVar);
                } else if ((nuvVar.f || !nvhVar.k) && (!nvqVar.b() || !defpackage.acqe.s() || !nvhVar.b() || nvhVar.x != defpackage.nve.i)) {
                    list = (java.util.List) nvqVar.e.e();
                    if (list == null) {
                        list = defpackage.afce.a;
                    }
                    if (defpackage.lyd.q(list, 1) || nvhVar.x == defpackage.nve.d) {
                        nuv nuvVar2 = (nuv) nvqVar.f.e();
                        if (defpackage.mrv.a().b() || nuvVar2 == null || nvhVar.x != nuvVar2.c.x) {
                            ajnd ajndVar = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null && ajndVar != null) {
                                defpackage.yqj yqjVar = (defpackage.yqj) noe.a.l().ai(5289);
                                java.lang.Object obj = ajndVar.a;
                                noe noeVar = (noe) obj;
                                yqjVar.P("onNewHun inHunMode=%b %s", noeVar.k, nuvVar);
                                nuvVar.e();
                                noeVar.k = true;
                                java.lang.Runnable runnable = noeVar.l;
                                android.os.Handler handler = noeVar.h;
                                handler.removeCallbacks(runnable);
                                noeVar.l = new defpackage.mbx(obj, nuvVar, 12, null);
                                noeVar.b(nuvVar);
                                defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL_WIDGET, defpackage.zbd.lb);
                                defpackage.eqp eqpVar = (defpackage.eqp) obj;
                                if (eqpVar.e() != null) {
                                    defpackage.nod nodVar = (defpackage.nod) eqpVar.e();
                                    nodVar.getClass();
                                    rrvVarH2.p(nodVar.r);
                                }
                                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nvaVar.a;
                                boolean z2 = (ghIcon == null || ghIcon.b == 8) ? false : true;
                                defpackage.abor aborVarE = rrvVarH2.E();
                                int iA = nvhVar.x.a();
                                aborVarE.t();
                                defpackage.zaf zafVar = (defpackage.zaf) aborVarE.b;
                                defpackage.zaf zafVar2 = defpackage.zaf.a;
                                zafVar.d = iA - 1;
                                zafVar.b |= 2;
                                aborVarE.t();
                                defpackage.zaf zafVar3 = (defpackage.zaf) aborVarE.b;
                                zafVar3.b |= 32;
                                zafVar3.h = z2;
                                defpackage.omf.u().F(rrvVarH2.l());
                                handler.postDelayed(noeVar.l, (int) defpackage.acyc.l());
                                defpackage.nvq.b.l().y("routed media HUN to %s", ajndVar);
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        }
                    } else {
                        defpackage.nvq.b.l().y("not checking for HUN due to suppress all; item=%s", nuvVar);
                    }
                }
            } else {
                nwyVar = nvqVar.d;
                if (nwyVar.i(nuvVar)) {
                    nwyVar.f(nuvVar);
                } else if (nuvVar.f) {
                    list = (java.util.List) nvqVar.e.e();
                    if (list == null) {
                        list = defpackage.afce.a;
                    }
                    if (defpackage.lyd.q(list, 1)) {
                        nuv nuvVar3 = (nuv) nvqVar.f.e();
                        if (defpackage.mrv.a().b()) {
                            ajnd ajndVar2 = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null) {
                                if (nvhVar.x == defpackage.nve.b) {
                                    defpackage.nvq.b.l().u("dropping media HUN");
                                } else {
                                    nwyVar.f(nuvVar);
                                }
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        } else {
                            ajnd ajndVar3 = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null) {
                                if (nvhVar.x == defpackage.nve.b) {
                                    defpackage.nvq.b.l().u("dropping media HUN");
                                } else {
                                    nwyVar.f(nuvVar);
                                }
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        }
                    } else {
                        nuv nuvVar4 = (nuv) nvqVar.f.e();
                        if (defpackage.mrv.a().b()) {
                            ajnd ajndVar4 = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null) {
                                if (nvhVar.x == defpackage.nve.b) {
                                    defpackage.nvq.b.l().u("dropping media HUN");
                                } else {
                                    nwyVar.f(nuvVar);
                                }
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        } else {
                            ajnd ajndVar5 = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null) {
                                if (nvhVar.x == defpackage.nve.b) {
                                    defpackage.nvq.b.l().u("dropping media HUN");
                                } else {
                                    nwyVar.f(nuvVar);
                                }
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        }
                    }
                } else {
                    list = (java.util.List) nvqVar.e.e();
                    if (list == null) {
                        list = defpackage.afce.a;
                    }
                    if (defpackage.lyd.q(list, 1)) {
                        nuv nuvVar5 = (nuv) nvqVar.f.e();
                        if (defpackage.mrv.a().b()) {
                            ajnd ajndVar6 = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null) {
                                if (nvhVar.x == defpackage.nve.b) {
                                    defpackage.nvq.b.l().u("dropping media HUN");
                                } else {
                                    nwyVar.f(nuvVar);
                                }
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        } else {
                            ajnd ajndVar7 = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null) {
                                if (nvhVar.x == defpackage.nve.b) {
                                    defpackage.nvq.b.l().u("dropping media HUN");
                                } else {
                                    nwyVar.f(nuvVar);
                                }
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        }
                    } else {
                        nuv nuvVar6 = (nuv) nvqVar.f.e();
                        if (defpackage.mrv.a().b()) {
                            ajnd ajndVar8 = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null) {
                                if (nvhVar.x == defpackage.nve.b) {
                                    defpackage.nvq.b.l().u("dropping media HUN");
                                } else {
                                    nwyVar.f(nuvVar);
                                }
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        } else {
                            ajnd ajndVar9 = nvqVar.g;
                            nvaVar = nvhVar.v;
                            if (nvaVar == null) {
                                if (nvhVar.x == defpackage.nve.b) {
                                    defpackage.nvq.b.l().u("dropping media HUN");
                                } else {
                                    nwyVar.f(nuvVar);
                                }
                            } else if (nvhVar.x == defpackage.nve.b) {
                                defpackage.nvq.b.l().u("dropping media HUN");
                            } else {
                                nwyVar.f(nuvVar);
                            }
                        }
                    }
                }
            }
        } else if (defpackage.ogv.a.c()) {
            defpackage.nwy nwyVar2 = nvqVar.d;
            if (nwyVar2.i(nuvVar)) {
                if (nuvVar.c.x == defpackage.nve.e) {
                    nwyVar2.b(nuvVar);
                    defpackage.zbd zbdVar3 = defpackage.zbd.oq;
                    int i = defpackage.nvo.b;
                    defpackage.nvo.b(zbdVar3, defpackage.nvo.c(nuvVar));
                } else {
                    defpackage.zbd zbdVar4 = defpackage.zbd.or;
                    int i2 = defpackage.nvo.b;
                    defpackage.nvo.b(zbdVar4, defpackage.nvo.c(nuvVar));
                }
            }
        }
        int i3 = defpackage.nvo.b;
        if (nuvVar.e) {
            return;
        }
        nvh nvhVar2 = nuvVar.c;
        if (nvhVar2.x != defpackage.nve.d || nvhVar2.a.f < nvf.d.f) {
            return;
        }
        android.content.Context context2 = defpackage.mkp.a.c;
        context2.getClass();
        java.lang.Object systemService2 = context2.getSystemService((java.lang.Class<java.lang.Object>) android.app.NotificationManager.class);
        systemService2.getClass();
        int currentInterruptionFilter2 = ((android.app.NotificationManager) systemService2).getCurrentInterruptionFilter();
        if (currentInterruptionFilter2 == 2 || currentInterruptionFilter2 == 3 || currentInterruptionFilter2 == 4) {
            defpackage.nvq.b.l().w("Call might have been suppressed by DND settings (filter=%d)", currentInterruptionFilter2);
            defpackage.nvo.b(defpackage.zbd.oj, defpackage.nvo.c(nuvVar));
        }
    }

    @Override // defpackage.nuy
    public final void c(defpackage.ygw ygwVar) {
        ygwVar.getClass();
    }
}
