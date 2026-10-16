package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qbr implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qbr(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qfw */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, quq] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, xrf] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, xrf] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Object, mbq] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.os.IBinder, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws qfw {
        qec qeaVar;
        int i = 1;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Throwable th = (java.lang.Throwable) this.a;
                defpackage.xzm.c(th);
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) qbs.a.g()).p(th)).ai(7009)).u((java.lang.String) this.b);
                return;
            case 1:
                ((pzs) this.b).h.execute((java.lang.Runnable) this.a);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj = this.a;
                defpackage.qdv qdvVar = (defpackage.qdv) this.b;
                qdvVar.i(obj);
                qdvVar.e();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.qdv qdvVar2 = ((defpackage.qds) this.a).a;
                if (qdvVar2.j.isEmpty()) {
                    android.util.Log.i("CrossProfileSender", "Connected but no holders. Disconnecting.");
                    qdvVar2.l();
                    return;
                }
                ?? r7 = this.b;
                java.util.concurrent.atomic.AtomicReference atomicReference = qdvVar2.g;
                if (r7 == 0) {
                    qeaVar = null;
                } else {
                    qec qecVarQueryLocalInterface = r7.queryLocalInterface("com.google.android.enterprise.connectedapps.ICrossProfileService");
                    qeaVar = qecVarQueryLocalInterface instanceof qec ? qecVarQueryLocalInterface : new qea((android.os.IBinder) r7);
                }
                atomicReference.set(qeaVar);
                qdvVar2.k();
                qdvVar2.d();
                qdvVar2.g();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                throw new qfw((java.lang.String) this.a, (java.lang.RuntimeException) this.b);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                com.google.android.gearhead.appdecor.CarUiEntry.-$$Nest$monAppDecorServiceReady(((qgj) this.b).a, (quq) this.a);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    owo owoVar = ((qhc) this.b).f;
                    owoVar.fr(5, owoVar.fp());
                    break;
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) qhc.a.g()).p(e)).ai((char) 7159)).u("Error notifying onBackClicked event");
                }
                qhc qhcVar = (qhc) this.b;
                qhcVar.c();
                qhcVar.d.k(gsv.g, defpackage.zbe.DRAWER);
                java.util.Stack stack = qhcVar.e;
                stack.pop();
                qhcVar.c.d.l(0);
                if (stack.isEmpty()) {
                    qhcVar.t();
                } else {
                    qhcVar.b.d(((com.google.android.apps.auto.sdk.MenuItem) stack.peek()).c);
                }
                ((qhr) this.a).d();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj2 = this.b;
                qhh qhhVar = (qhh) obj2;
                qhhVar.h.c(new java.util.ArrayList());
                ?? r8 = this.a;
                try {
                    owr owrVar = ((qhh) obj2).m;
                    android.os.Parcel parcelFp = owrVar.fp();
                    parcelFp.writeString((java.lang.String) r8);
                    android.os.Parcel parcelFq = owrVar.fq(4, parcelFp);
                    boolean zJ = defpackage.ijx.j(parcelFq);
                    parcelFq.recycle();
                    if (zJ) {
                        qhhVar.g();
                        return;
                    }
                } catch (android.os.RemoteException e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) qhh.a.g()).p(e2)).ai((char) 7189)).u("Error notifying onSearchSubmitted");
                }
                qhhVar.d.b();
                com.google.android.gearhead.appdecor.StatusBarView statusBarView = qhhVar.e;
                statusBarView.e();
                qhhVar.i();
                qhhVar.j = true;
                qhhVar.l = (java.lang.String) r8;
                statusBarView.d((java.lang.CharSequence) r8);
                qht qhtVar = qhhVar.g;
                com.google.android.apps.auto.sdk.ui.PagedListView pagedListView = qhtVar.a;
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) pagedListView.getLayoutParams();
                layoutParams.topMargin = qhtVar.getResources().getDimensionPixelSize(2131166243);
                pagedListView.setLayoutParams(layoutParams);
                if (qhhVar.h.a() == 0) {
                    qhhVar.k = true;
                    qht qhtVar2 = qhhVar.g;
                    qhtVar2.a.setVisibility(8);
                    qhtVar2.b.setVisibility(0);
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ?? r0 = this.b;
                java.lang.Object obj3 = this.a;
                try {
                    owr owrVar2 = ((qhh) obj3).m;
                    android.os.Parcel parcelFp2 = owrVar2.fp();
                    defpackage.ijx.g(parcelFp2, r0);
                    owrVar2.fr(5, parcelFp2);
                    break;
                } catch (android.os.RemoteException e3) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) qhh.a.g()).p(e3)).ai((char) 7188)).u("Error notifying onSearchItemSelected");
                }
                ((qhh) obj3).g();
                return;
            case 9:
                ((android.support.v7.widget.RecyclerView) this.b).au().f();
                java.lang.Object obj4 = this.a;
                ((qhe) obj4).a = false;
                ((defpackage.lw) obj4).g();
                return;
            case 10:
                java.lang.Object obj5 = this.b;
                qhl qhlVar = (qhl) this.a;
                qhlVar.s((com.google.android.apps.auto.sdk.MenuItem) obj5);
                com.google.android.gearhead.appdecor.CarUiEntry.-$$Nest$fgetdrawerController((com.google.android.gearhead.appdecor.CarUiEntry) qhlVar.f.b).e();
                return;
            case 11:
                ((android.support.v7.widget.RecyclerView) this.b).au().f();
                java.lang.Object obj6 = this.a;
                ((qhl) obj6).e = false;
                ((defpackage.lw) obj6).g();
                return;
            case 12:
                ((defpackage.yqj) com.google.android.gearhead.demand.DemandClientService.a.l().ai((char) 7292)).u("openDemandSpace");
                com.google.android.gearhead.demand.DemandClientService demandClientService = (com.google.android.gearhead.demand.DemandClientService) this.a;
                if (demandClientService.b.m()) {
                    java.lang.Object obj7 = this.b;
                    if (obj7 != null) {
                        android.os.Bundle bundle = (android.os.Bundle) obj7;
                        if (bundle.getBoolean("gmm_transcription_request", false)) {
                            demandClientService.b.l(com.google.android.gearhead.demand.DemandClientService.b(bundle));
                            return;
                        }
                    }
                    demandClientService.b.k(com.google.android.gearhead.demand.DemandClientService.b((android.os.Bundle) obj7));
                    return;
                }
                return;
            case 13:
                ((defpackage.yqj) com.google.android.gearhead.demand.DemandClientService.a.l().ai((char) 7295)).u("unregisterCallbacks");
                ?? r1 = this.a;
                defpackage.qio qioVar = (defpackage.qio) ((com.google.android.gearhead.demand.DemandClientService) this.b).d.get(r1.asBinder());
                if (qioVar != null) {
                    qioVar.a();
                    return;
                }
                return;
            case 14:
                ((com.google.android.gearhead.demand.DemandClientService) this.b).a(this.a);
                return;
            case 15:
                java.lang.Object obj8 = this.a;
                defpackage.qjr qjrVar = ((defpackage.qjp) obj8).a;
                qjrVar.f = this.b;
                qjrVar.c.b(2);
                qjrVar.b.post(new defpackage.qjo(obj8, i));
                return;
            case 16:
                defpackage.qjr qjrVar2 = ((defpackage.qjp) this.a).a;
                android.service.notification.NotificationListenerService.RankingMap rankingMap = (android.service.notification.NotificationListenerService.RankingMap) this.b;
                qjrVar2.e = rankingMap;
                ajnd.y(rankingMap);
                return;
            case 17:
                java.lang.Object obj9 = ((defpackage.qjq) this.a).a;
                android.service.notification.NotificationListenerService.RankingMap rankingMap2 = (android.service.notification.NotificationListenerService.RankingMap) this.b;
                ((defpackage.qjr) obj9).e = rankingMap2;
                ajnd.y(rankingMap2);
                return;
            case 18:
                int i2 = qkz.a;
                defpackage.lwn.a().c((java.lang.String) this.b, (java.lang.String) this.a);
                return;
            case 19:
                mog mogVar = ((qlf) this.b).g;
                if (mogVar != null) {
                    ((defpackage.qli) ((defpackage.xei) this.a).a).e(mogVar);
                    return;
                }
                return;
            default:
                qlx qlxVar = (qlx) this.b;
                qlxVar.a.a(qlxVar);
                java.util.Iterator it = ((qmf) this.a).c.iterator();
                while (it.hasNext()) {
                    ((qmg) it.next()).a();
                }
                defpackage.sqs.au("deliver should be called from worker thread");
                defpackage.sqs.ar(qlxVar.b, "Measurement must be submitted");
                java.util.List<qmh> list = qlxVar.h;
                if (list.isEmpty()) {
                    return;
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                for (qmh qmhVar : list) {
                    android.net.Uri uriB = qmhVar.b();
                    if (!hashSet.contains(uriB)) {
                        hashSet.add(uriB);
                        qmhVar.e(qlxVar);
                    }
                }
                return;
        }
    }

    public /* synthetic */ qbr(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public qbr(java.lang.Object obj, java.lang.Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public qbr(qhc qhcVar, qhr qhrVar, int i) {
        this.c = i;
        this.a = qhrVar;
        this.b = qhcVar;
    }
}
