package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nux implements defpackage.lhn, defpackage.nuy {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NotifSmartReplyMgr");
    private final java.util.Map b = new j$.util.concurrent.ConcurrentHashMap();
    private final java.util.Map c = new j$.util.concurrent.ConcurrentHashMap();
    private java.util.concurrent.ExecutorService d;

    public static void e(defpackage.zbd zbdVar, java.lang.String str, long j) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MESSAGING, zbdVar);
        rrvVarH.p(new android.content.ComponentName(str, ""));
        rrvVarH.u(j);
        defpackage.omf.u().F(rrvVarH.l());
    }

    private final void f(java.lang.String str, android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        android.service.notification.NotificationListenerService.Ranking ranking = new android.service.notification.NotificationListenerService.Ranking();
        if (!rankingMap.getRanking(statusBarNotification.getKey(), ranking)) {
            this.b.remove(str);
            return;
        }
        java.util.List<java.lang.CharSequence> listM = ep$.ExternalSyntheticApiModelOutline0.m(ranking);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.CharSequence charSequence : listM) {
            if (!android.text.TextUtils.isEmpty(charSequence)) {
                arrayList.add(charSequence.toString());
            }
        }
        if (arrayList.isEmpty()) {
            this.b.remove(str);
            return;
        }
        defpackage.ojm.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        java.util.Map map = this.b;
        nuw nuwVar = (nuw) map.get(str);
        if (nuwVar == null) {
            long jMax = java.lang.Math.max(0L, epochMilli - statusBarNotification.getPostTime());
            arrayList.size();
            map.put(str, new nuw(epochMilli, arrayList));
            e(defpackage.zbd.Nl, statusBarNotification.getPackageName(), jMax);
            h(arrayList, statusBarNotification.getPackageName());
            return;
        }
        if (nuwVar.b.equals(arrayList)) {
            return;
        }
        long j = epochMilli - nuwVar.a;
        arrayList.size();
        map.put(str, new nuw(epochMilli, arrayList));
        e(defpackage.zbd.Nm, statusBarNotification.getPackageName(), j);
        h(arrayList, statusBarNotification.getPackageName());
    }

    private static final android.service.notification.StatusBarNotification g(java.lang.String str) {
        mbu mbuVarA;
        if (str == null || !defpackage.mbw.b().a.containsKey(str) || (mbuVarA = defpackage.mbw.b().a(str)) == null) {
            return null;
        }
        return mbuVarA.b().a;
    }

    private final void h(java.util.List list, java.lang.String str) {
        if (defpackage.acul.z()) {
            this.d.execute(new defpackage.mbx(list, str, 17));
        }
    }

    @Override // defpackage.nuy
    public final void a(nuv nuvVar) {
        java.util.Map map = this.b;
        java.lang.String str = nuvVar.d;
        map.remove(str);
        this.c.remove(str);
    }

    @Override // defpackage.nuy
    public final void b(nuv nuvVar) {
        java.lang.String str = nuvVar.d;
        android.service.notification.StatusBarNotification statusBarNotificationG = g(nuvVar.c.g);
        if (statusBarNotificationG == null) {
            this.b.remove(str);
            this.c.remove(str);
            return;
        }
        android.app.Notification.Action[] actionArr = statusBarNotificationG.getNotification().actions;
        if (actionArr == null) {
            this.c.remove(str);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.app.Notification.Action action : actionArr) {
                android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null) {
                    for (android.app.RemoteInput remoteInput : remoteInputs) {
                        java.lang.CharSequence[] choices = remoteInput.getChoices();
                        if (choices != null) {
                            for (java.lang.CharSequence charSequence : choices) {
                                if (!android.text.TextUtils.isEmpty(charSequence)) {
                                    arrayList.add(charSequence.toString());
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.c.remove(str);
            } else {
                defpackage.ojm.a();
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                java.util.Map map = this.c;
                nuw nuwVar = (nuw) map.get(str);
                if (nuwVar == null) {
                    long jMax = java.lang.Math.max(0L, epochMilli - statusBarNotificationG.getPostTime());
                    arrayList.size();
                    map.put(str, new nuw(epochMilli, arrayList));
                    e(defpackage.zbd.Nn, statusBarNotificationG.getPackageName(), jMax);
                    h(arrayList, statusBarNotificationG.getPackageName());
                } else if (!nuwVar.b.equals(arrayList)) {
                    arrayList.size();
                    map.put(str, new nuw(epochMilli, arrayList));
                }
            }
        }
        android.service.notification.NotificationListenerService.RankingMap rankingMap = defpackage.nuz.b().a;
        if (rankingMap == null) {
            return;
        }
        f(str, statusBarNotificationG, rankingMap);
    }

    @Override // defpackage.nuy
    public final void c(defpackage.ygw ygwVar) {
        ygwVar.size();
        android.service.notification.NotificationListenerService.RankingMap rankingMap = defpackage.nuz.b().a;
        if (rankingMap == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int size = ygwVar.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(((nuv) ygwVar.get(i)).d);
        }
        java.util.Map map = this.b;
        map.keySet().retainAll(hashSet);
        java.util.Map map2 = this.c;
        map2.keySet().retainAll(hashSet);
        int size2 = ygwVar.size();
        for (int i2 = 0; i2 < size2; i2++) {
            nuv nuvVar = (nuv) ygwVar.get(i2);
            java.lang.String str = nuvVar.d;
            android.service.notification.StatusBarNotification statusBarNotificationG = g(nuvVar.c.g);
            if (statusBarNotificationG == null) {
                map.remove(str);
                map2.remove(str);
            } else {
                f(str, statusBarNotificationG, rankingMap);
            }
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) a.l().ai((char) 5484)).u("Stopping NotificationSmartReplyManager");
        defpackage.nuz.b().k(this);
        java.util.concurrent.ExecutorService executorService = this.d;
        if (executorService != null) {
            executorService.shutdownNow();
            this.d = null;
        }
        this.b.clear();
        this.c.clear();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (android.os.Build.VERSION.SDK_INT >= 29 && defpackage.acul.v()) {
            ((defpackage.yqj) a.l().ai((char) 5483)).u("Starting NotificationSmartReplyManager");
            this.d = java.util.concurrent.Executors.newSingleThreadExecutor();
            defpackage.nuz.b().f(this);
        }
    }
}
