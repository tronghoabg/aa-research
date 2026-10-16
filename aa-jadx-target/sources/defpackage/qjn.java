package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qjn implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public qjn(aeap aeapVar, snk snkVar, int i) {
        this.d = i;
        this.c = snkVar;
        this.a = "ConnectionlessLifecycleHelper";
        this.b = aeapVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v112, types: [com.google.android.libraries.maps.model.TileProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, upp] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object, upp] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [afdk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [dzn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, tur] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, upp] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, udx] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, udx] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, tra] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, tra] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, udx] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, udc] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, trp] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, upp] */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        com.google.android.libraries.maps.model.Tile tile;
        boolean z = false;
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.b;
                android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) obj;
                java.lang.String packageName = statusBarNotification.getPackageName();
                defpackage.qjr qjrVar = ((defpackage.qjp) this.a).a;
                qjrVar.c.a(packageName);
                qjrVar.e(statusBarNotification);
                qjrVar.d.add(obj);
                android.service.notification.NotificationListenerService.RankingMap rankingMap = (android.service.notification.NotificationListenerService.RankingMap) this.c;
                qjrVar.e = rankingMap;
                qjrVar.j.w(statusBarNotification, rankingMap);
                return;
            case 1:
                defpackage.qjr qjrVar2 = ((defpackage.qjp) this.a).a;
                android.service.notification.StatusBarNotification statusBarNotification2 = (android.service.notification.StatusBarNotification) this.b;
                qjrVar2.e(statusBarNotification2);
                android.service.notification.NotificationListenerService.RankingMap rankingMap2 = (android.service.notification.NotificationListenerService.RankingMap) this.c;
                qjrVar2.e = rankingMap2;
                qjrVar2.j.x(statusBarNotification2, rankingMap2);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj2 = ((defpackage.qjq) this.a).a;
                android.service.notification.StatusBarNotification statusBarNotification3 = (android.service.notification.StatusBarNotification) this.b;
                defpackage.qjr qjrVar3 = (defpackage.qjr) obj2;
                qjrVar3.e(statusBarNotification3);
                android.service.notification.NotificationListenerService.RankingMap rankingMap3 = (android.service.notification.NotificationListenerService.RankingMap) this.c;
                qjrVar3.e = rankingMap3;
                qjrVar3.j.x(statusBarNotification3, rankingMap3);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj3 = this.b;
                android.service.notification.StatusBarNotification statusBarNotification4 = (android.service.notification.StatusBarNotification) obj3;
                java.lang.String packageName2 = statusBarNotification4.getPackageName();
                defpackage.qjr qjrVar4 = (defpackage.qjr) ((defpackage.qjq) this.a).a;
                qjrVar4.c.a(packageName2);
                qjrVar4.e(statusBarNotification4);
                qjrVar4.d.add(obj3);
                android.service.notification.NotificationListenerService.RankingMap rankingMap4 = (android.service.notification.NotificationListenerService.RankingMap) this.c;
                qjrVar4.e = rankingMap4;
                qjrVar4.j.w(statusBarNotification4, rankingMap4);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((qmy) this.c).a.y((java.lang.String) this.a);
                this.b.run();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = this.a;
                ((defpackage.yqj) defpackage.ntf.a.l().ai((char) 5418)).M("%s insets changed to %s", obj5, obj4);
                defpackage.wfp.c();
                defpackage.shg shgVar = (defpackage.shg) this.b;
                defpackage.ntb ntbVar = ((defpackage.ntf) shgVar.b).b;
                if (j$.util.Objects.equals(ntbVar.o, obj5)) {
                    defpackage.yha yhaVar = new defpackage.yha(4);
                    java.util.Map map = ntbVar.g;
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        yhaVar.f((defpackage.nta) entry.getKey(), new android.graphics.Rect(((defpackage.nsz) entry.getValue()).e));
                    }
                    java.lang.Object obj6 = shgVar.a;
                    defpackage.yhe yheVarD = yhaVar.d(true);
                    ntbVar.z((android.graphics.Rect) obj4);
                    defpackage.ysr.bk(yheVarD.keySet().equals(map.keySet()), "Number of windows changed during an inset-only change");
                    defpackage.kgu.d(new mjf(ntbVar, yheVarD, (defpackage.qsh) obj6, 5), "GH.DisplayLayout", defpackage.zbe.DISPLAY_LAYOUT, defpackage.zbd.rM, "Car not connected during display change", new java.lang.Object[0]);
                    return;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                this.c.getClass();
                java.lang.Object obj7 = this.b;
                obj7.getClass();
                ((rjn) this.a).a.a.w(new defpackage.afaw(defpackage.afga.cy(new kkh((com.google.android.gms.car.control.CarPropertySetError) obj7))));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.saf) this.b).k(this.a, this.c);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                aeap aeapVar = (aeap) this.b;
                if (aeapVar.b > 0) {
                    java.lang.Object obj8 = this.c;
                    java.lang.Object obj9 = aeapVar.c;
                    ((snk) obj8).d(obj9 != null ? ((android.os.Bundle) obj9).getBundle((java.lang.String) this.a) : null);
                }
                if (aeapVar.b >= 2) {
                    ((snk) this.c).i();
                }
                if (aeapVar.b >= 3) {
                    ((smz) this.c).k();
                }
                if (aeapVar.b >= 4) {
                    ((snk) this.c).j();
                    return;
                }
                return;
            case 9:
                ((too) this.c).q((java.lang.String) this.a, (ugf) this.b);
                return;
            case 10:
                ((too) this.c).c().c((udx) this.b, (udx) this.a);
                return;
            case 11:
                this.b.G((udx) this.c, (rfz) this.a);
                return;
            case 12:
                qar qarVar = new qar(zdl.F);
                qav qavVarC = qav.c(abxv.a);
                vbn.d();
                urf urfVar = ((txj) this.a).k;
                qbs qbsVar = urfVar.b;
                if (urfVar.a != null || zdl.b.equals(qarVar.a)) {
                    defpackage.ysr.bn(qavVarC.b(), "Invalid UE3 params: %s", qavVarC);
                    abxr abxrVar = qavVarC.f;
                    if (abxrVar != null) {
                        defpackage.ysr.bn(true, "logUiInteraction is called with Request Type: %s. Use logRequest instead.", abxrVar);
                    } else {
                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) qbs.a.g()).q(defpackage.yqi.FULL)).ai(7011)).u("Attempted to log interaction without VE type.");
                    }
                    qbp qbpVarF = qbsVar.f(qbsVar.n, (qbe) null);
                    java.util.List list = qbsVar.h;
                    synchronized (list) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((qax) it.next()).a();
                        }
                        break;
                    }
                    qbsVar.f.execute(new defpackage.ye(qbsVar, qarVar, qavVarC, qbpVarF, 17));
                }
                this.b.b((tpm) this.c);
                return;
            case 13:
                this.b.a((trp) this.a, (tpm) this.c);
                return;
            case 14:
                java.lang.Object obj10 = this.c;
                ((twi) obj10).m();
                ((tyb) this.b).m.g((abdv) this.a, (txe) obj10);
                return;
            case 15:
                java.lang.Object obj11 = this.b;
                ufh ufhVar = (ufh) obj11;
                java.util.Map map2 = ufhVar.m;
                java.lang.Object obj12 = this.c;
                if (map2.containsKey(obj12)) {
                    ((defpackage.ype) ((defpackage.ype) ufh.a.g()).ai(9302)).x("[Labeler thread] The same labeling hint id %d is added twice.", ((tsr) obj12).a);
                } else {
                    java.lang.Object obj13 = this.a;
                    com.google.android.libraries.geo.mapcore.internal.label.jni.SharedLabelerJni sharedLabelerJni = ufhVar.i;
                    sharedLabelerJni.getClass();
                    map2.put(obj12, java.lang.Long.valueOf(sharedLabelerJni.nativeAddLabelingHint(sharedLabelerJni.b, ((defpackage.abng) obj13).h())));
                    ((defpackage.ype) ((defpackage.ype) ufh.a.e()).ai(9301)).x("[Labeler thread] executed addLabelingHint[%d] from pending work queue", ((tsr) obj12).a);
                }
                synchronized (obj11) {
                    ((ufh) obj11).u--;
                    break;
                }
                return;
            case 16:
                ?? r0 = this.c;
                java.lang.Object obj14 = this.a;
                java.lang.Object obj15 = this.b;
                synchronized (obj15) {
                    if (!((ugo) obj15).x) {
                        abho abhoVar = ((ugo) obj15).b;
                        xwb xwbVarD = xwc.d("TileOverlay.startEarlyTileFetching() ", abhoVar);
                        try {
                            utu utuVar = new utu((utu) obj14);
                            java.util.List list2 = ((ugo) obj15).C;
                            long jA = r0.a(utuVar, list2);
                            if (((ugo) obj15).t != jA && !list2.isEmpty()) {
                                z = true;
                            }
                            if (abhoVar == abho.b) {
                                ((ugo) obj15).D.p(jA);
                            }
                            if (z && (!((ugo) obj15).A || ((ugo) obj15).e.u(utuVar.l(), list2, (java.util.Set) null, utuVar.n().c, 0, false, true, defpackage.rox.x()))) {
                                ((ugo) obj15).t = jA;
                                ((ugo) obj15).r = true;
                            }
                            xwbVarD.close();
                            break;
                        } catch (java.lang.Throwable th) {
                            try {
                                xwbVarD.close();
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                }
                return;
            case 17:
                vbn.d();
                java.lang.Object obj16 = this.c;
                java.lang.Object obj17 = this.b;
                if (((rif) obj17).c.add(obj16)) {
                    java.lang.Object obj18 = ((rif) obj17).a;
                    int i = ((ulk) obj16).b;
                    int i2 = ((ulk) obj16).c;
                    int i3 = ((ulk) obj16).a;
                    try {
                        tile = ((defpackage.advt) obj18).b.getTile(i, i2, i3);
                    } catch (java.lang.RuntimeException e) {
                        zsr.c(java.lang.String.format(java.util.Locale.US, "Failed to get tile (%d, %d, %d) from TileProvider", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)), e);
                        tile = null;
                    }
                    byte[] bArr = tile != null ? tile.equalsNoTile() ? new byte[0] : tile.data : null;
                    ((rif) obj17).c.remove(obj16);
                    java.lang.Object obj19 = this.a;
                    if (bArr != null) {
                        java.lang.Object obj20 = ((wij) obj19).c;
                        ((unu) obj20).j(((unu) obj20).g, new defpackage.sbn((wij) obj19, (ulk) ((wij) obj19).a, (upp) ((wij) obj19).b, bArr, 6));
                        return;
                    } else {
                        java.lang.Object obj21 = ((wij) obj19).c;
                        ((unu) obj21).j(((unu) obj21).g, new defpackage.qjn(obj19, (ulk) ((wij) obj19).a, (upp) ((wij) obj19).b, 19));
                        return;
                    }
                }
                return;
            case 18:
                ?? r1 = this.a;
                java.lang.Object obj22 = this.c;
                java.lang.Object obj23 = this.b;
                defpackage.qjn qjnVar = new defpackage.qjn(obj23, (ulk) obj22, (upp) r1, 20);
                unu unuVar = (unu) obj23;
                unuVar.j(unuVar.g, qjnVar);
                return;
            case 19:
                defpackage.ype ypeVar = (defpackage.ype) ((defpackage.ype) unu.a.f()).ai(9458);
                java.lang.String strName = unu.b.name();
                java.lang.Object obj24 = this.c;
                ypeVar.M("Error encountered in fetching tile: %s TileStore type: %s", obj24, strName);
                java.lang.Object obj25 = ((wij) this.b).c;
                unu unuVar2 = (unu) obj25;
                upe upeVar = unuVar2.e;
                upeVar.a((ulk) obj24);
                upd updVar = (upd) upeVar.b.get(obj24);
                long j = updVar == null ? 0L : updVar.c;
                if (j <= 0) {
                    return;
                }
                unuVar2.h.schedule(new defpackage.qjn(obj25, obj24, this.a, 18, (short[]) null), j + 50, java.util.concurrent.TimeUnit.MILLISECONDS);
                return;
            default:
                ((unu) this.b).e((ulk) this.c, (upp) this.a, upo.i, (ulj) null);
                return;
        }
    }

    public /* synthetic */ qjn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ qjn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ qjn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ qjn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public qjn(java.lang.Object obj, ulk ulkVar, upp uppVar, int i) {
        this.d = i;
        this.c = ulkVar;
        this.a = uppVar;
        this.b = obj;
    }

    public qjn(qmy qmyVar, java.lang.String str, java.lang.Runnable runnable, int i) {
        this.d = i;
        this.a = str;
        this.b = runnable;
        this.c = qmyVar;
    }

    public /* synthetic */ qjn(rjn rjnVar, com.google.android.gms.car.control.CarProperty carProperty, com.google.android.gms.car.control.CarPropertySetError carPropertySetError, int i) {
        this.d = i;
        this.a = rjnVar;
        this.c = carProperty;
        this.b = carPropertySetError;
    }

    public /* synthetic */ qjn(too tooVar, java.lang.String str, ugf ugfVar, int i) {
        this.d = i;
        this.c = tooVar;
        this.a = str;
        this.b = ugfVar;
    }
}
