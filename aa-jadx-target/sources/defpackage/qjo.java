package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qjo implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qjo(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        defpackage.ygw ygwVar;
        boolean zIsEmpty;
        int i = 3;
        int i2 = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.qjr qjrVar = ((defpackage.qjp) this.a).a;
                qjrVar.c.b(4);
                qjrVar.f = null;
                return;
            case 1:
                defpackage.qjp qjpVar = (defpackage.qjp) this.a;
                defpackage.qjr qjrVar2 = qjpVar.a;
                if (!qjrVar2.c()) {
                    ((defpackage.yqj) defpackage.qjr.a.l().ai((char) 7409)).u("Not connected, so not caching notifications");
                    return;
                }
                try {
                    com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList parceledNotificationListF = qjrVar2.f.f((java.lang.String[]) null);
                    if (parceledNotificationListF == null) {
                        int i3 = defpackage.ygw.d;
                        ygwVar = defpackage.ymx.a;
                    } else {
                        java.util.List list = ((com.google.android.apps.auto.components.notifications.listener.AbstractParceledList) parceledNotificationListF).a;
                        int size = list.size();
                        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).filter(new omr(17));
                        int i4 = defpackage.ygw.d;
                        ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
                        if (size != ygwVar.size()) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.qjr.a.h()).ai(7421)).u("Null items found when unparceling active notifications list");
                        }
                    }
                    defpackage.qjr qjrVar3 = qjpVar.a;
                    java.util.List list2 = qjrVar3.d;
                    list2.clear();
                    list2.addAll(ygwVar);
                    qjrVar3.j.v();
                    return;
                } catch (android.os.RemoteException e) {
                    throw new java.lang.IllegalStateException("Could not call the service", e);
                }
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj = this.a;
                defpackage.qjr qjrVar4 = (defpackage.qjr) ((defpackage.qjq) obj).a;
                qjrVar4.c.b(2);
                qjrVar4.b.post(new defpackage.qjo(obj, i));
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.qjr qjrVar5 = (defpackage.qjr) ((defpackage.qjq) this.a).a;
                if (!qjrVar5.c()) {
                    ((defpackage.yqj) defpackage.qjr.a.l().ai((char) 7413)).u("Not connected, so not caching notifications");
                    return;
                }
                defpackage.ygw ygwVarC = defpackage.mce.b().c(null);
                java.util.List list3 = qjrVar5.d;
                list3.clear();
                list3.addAll(ygwVarC);
                qjrVar5.j.v();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.qjr qjrVar6 = (defpackage.qjr) ((defpackage.qjq) this.a).a;
                qjrVar6.c.b(4);
                qjrVar6.d.clear();
                qjrVar6.e = null;
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((qkf) this.a).a.performEditorAction(3);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.qkr qkrVar = (defpackage.qkr) this.a;
                qkrVar.f = false;
                java.lang.Runnable runnable = qkrVar.g;
                android.os.Handler handler = qkrVar.e;
                handler.removeCallbacks(runnable);
                handler.removeCallbacks(qkrVar.h);
                java.util.Iterator it = qkrVar.c.iterator();
                while (it.hasNext()) {
                    ((mnv) it.next()).b();
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.wfp.c();
                defpackage.qkr qkrVar2 = (defpackage.qkr) this.a;
                java.util.List list4 = qkrVar2.b;
                defpackage.qkq qkqVar = qkrVar2.d;
                qkqVar.b(list4);
                while (i2 < list4.size() - 1) {
                    mog mogVar = (mog) list4.get(i2);
                    i2++;
                    if (qkqVar.compare(mogVar, (mog) list4.get(i2)) > 0) {
                        qkqVar.c(list4);
                        java.util.Iterator it2 = qkrVar2.c.iterator();
                        while (it2.hasNext()) {
                            ((mnv) it2.next()).a();
                        }
                        qkrVar2.e.postDelayed(this, 60000L);
                        return;
                    }
                }
                qkrVar2.e.postDelayed(this, 60000L);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj2 = this.a;
                if (obj2 != null) {
                    ((android.content.BroadcastReceiver.PendingResult) obj2).finish();
                    return;
                }
                return;
            case 9:
                ((qmy) this.a).a.B();
                return;
            case 10:
                ((qmy) this.a).a.D((defpackage.xei) null);
                return;
            case 11:
                ((qnm) this.a).z();
                return;
            case 12:
                android.os.Looper looperMyLooper = android.os.Looper.myLooper();
                android.os.Looper mainLooper = android.os.Looper.getMainLooper();
                java.lang.Object obj3 = this.a;
                if (looperMyLooper == mainLooper) {
                    ((qnr) obj3).b.b().c(this);
                    return;
                }
                qnr qnrVar = (qnr) obj3;
                boolean zE = qnrVar.e();
                qnrVar.d = 0L;
                if (zE) {
                    qnrVar.a();
                    return;
                }
                return;
            case 13:
                java.lang.Object obj4 = this.a;
                qqp qqpVar = (qqp) obj4;
                long andSet = qqpVar.h.getAndSet(0L);
                long andSet2 = qqpVar.j.getAndSet(0L);
                if (andSet == 0) {
                    synchronized (obj4) {
                        java.util.concurrent.Future future = ((qqp) obj4).A;
                        if (future != null) {
                            future.cancel(false);
                            ((qqp) obj4).A = null;
                        }
                        break;
                    }
                    java.util.List list5 = qqpVar.B;
                    if (list5.isEmpty()) {
                        return;
                    }
                    qqpVar.k(defpackage.ygw.o(list5));
                    list5.clear();
                    return;
                }
                java.util.List list6 = qqpVar.B;
                list6.add(andSet + ":" + (andSet2 / andSet) + "us");
                if (list6.size() >= 10) {
                    qqpVar.k(defpackage.ygw.o(list6));
                    list6.clear();
                    return;
                }
                return;
            case 14:
                java.lang.Object obj5 = this.a;
                int andSet3 = (((qqp) obj5).f.getAndSet(0) * 8) / 1000;
                synchronized (obj5) {
                    java.util.List list7 = ((qqp) obj5).z;
                    list7.add(java.lang.String.valueOf(andSet3));
                    if (list7.size() >= 10) {
                        ((qqp) obj5).l(defpackage.ygw.o(list7));
                        list7.clear();
                    }
                    break;
                }
                return;
            case 15:
                qrp qrpVar = (qrp) this.a;
                if (qrpVar.g != defpackage.xik.AUDIO_FOCUS_STATE_GAIN) {
                    qrp.a.h().ai(7666).u("HU failed to recover LOSS_TR after phone call");
                    qrpVar.i = false;
                    qrpVar.f.b(defpackage.zbd.zp);
                    return;
                }
                return;
            case 16:
                java.lang.Object obj6 = this.a;
                qrp qrpVar2 = (qrp) obj6;
                if (qrpVar2.i) {
                    qrp.a.f().ai(7659).u("Request HU to recover LOSS_TR state");
                    qrpVar2.i(1);
                    qro qroVar = qrpVar2.k;
                    qroVar.getClass();
                    qroVar.postDelayed(new defpackage.qjo(obj6, 15), 1000L);
                    qrpVar2.f.b(defpackage.zbd.zo);
                    return;
                }
                return;
            case 17:
                defpackage.yqk yqkVar = qrp.a;
                yqkVar.d().ai(7634).u("Running focusReleaseRunnable");
                qrp qrpVar3 = (qrp) this.a;
                rgk rgkVar = qrpVar3.d;
                rgkVar.getClass();
                if (rgkVar.c()) {
                    yqkVar.d().ai(7637).u("Some app is playing audio, so not waiting for MEDIA stream to stop.");
                    return;
                }
                qqt qqtVar = qrpVar3.b;
                qqtVar.k(3, 5000L);
                if (rgkVar.c()) {
                    yqkVar.d().ai(7636).u("Some app is playing audio, so not waiting for TTS stream to stop.");
                    return;
                }
                qqtVar.k(5, 5000L);
                if (rgkVar.c()) {
                    yqkVar.d().ai(7635).u("Some app is playing audio, so not requesting to release focus to car.");
                    return;
                }
                qro qroVar2 = qrpVar3.k;
                qroVar2.getClass();
                qroVar2.d();
                return;
            case 18:
                java.lang.Object obj7 = this.a;
                defpackage.qrz qrzVar = (defpackage.qrz) obj7;
                qrzVar.a();
                qrzVar.b.f.remove(obj7);
                return;
            case 19:
                defpackage.qsj qsjVar = (defpackage.qsj) this.a;
                java.lang.Runnable runnable2 = qsjVar.b;
                if (runnable2 != null) {
                    runnable2.run();
                    qsjVar.b = null;
                    return;
                }
                return;
            default:
                java.util.Map map = ((defpackage.qtj) this.a).c;
                synchronized (map) {
                    zIsEmpty = map.isEmpty();
                    break;
                }
                if (zIsEmpty) {
                    java.lang.Object obj8 = this.a;
                    defpackage.qtj.a.l().ai(7871).u("CSB onClientsDisconnected");
                    defpackage.qtj qtjVar = (defpackage.qtj) obj8;
                    qtjVar.r();
                    if (qtjVar.u()) {
                        return;
                    }
                    qtjVar.d.h();
                    return;
                }
                return;
        }
    }

    public qjo(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
