package com.google.android.apps.auto.components.telecom.impl;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class DoNotDisturbCallManagerImpl implements defpackage.oew {
    public static final defpackage.yqm a;
    private static final long d;
    public final android.content.Context b;
    public final android.app.NotificationManager c;
    private final java.util.HashMap e;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        d = 900000L;
        a = defpackage.yqm.c("GH.DNDCallManager");
    }

    public DoNotDisturbCallManagerImpl(android.content.Context context) {
        defpackage.ojm.a();
        this.e = new java.util.HashMap();
        this.b = context;
        this.c = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
    }

    public static defpackage.ygw l(android.app.NotificationManager notificationManager) {
        j$.util.stream.Stream streamFilter = j$.util.DesugarArrays.stream(notificationManager.getActiveNotifications()).filter(new mrx(11)).filter(new mrx(12)).filter(new mrx(13));
        int i = defpackage.ygw.d;
        return (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
    }

    public static void m(defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL_DND_MANAGER, zbdVar);
        rrvVarH.p(componentName);
        oimVarU.F(rrvVarH.l());
    }

    private static void n(defpackage.zbd zbdVar, android.content.ComponentName componentName, int i, android.app.NotificationManager.Policy policy) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL_DND_MANAGER, zbdVar);
        rrvVarH.p(componentName);
        if (rrvVarH.x == null) {
            rrvVarH.x = defpackage.yzb.a.n();
        }
        defpackage.abor aborVar = rrvVarH.x;
        int iM = a$.ExternalSyntheticApiModelOutline2.m(policy);
        aborVar.t();
        defpackage.yzb yzbVar = (defpackage.yzb) aborVar.b;
        defpackage.yzb yzbVar2 = defpackage.yzb.a;
        yzbVar.b |= 8;
        yzbVar.f = iM;
        aborVar.t();
        defpackage.yzb yzbVar3 = (defpackage.yzb) aborVar.b;
        yzbVar3.b |= 1;
        yzbVar3.c = i;
        int i2 = policy.priorityCategories;
        aborVar.t();
        defpackage.yzb yzbVar4 = (defpackage.yzb) aborVar.b;
        yzbVar4.b |= 4;
        yzbVar4.e = i2;
        int i3 = policy.priorityCallSenders;
        aborVar.t();
        defpackage.yzb yzbVar5 = (defpackage.yzb) aborVar.b;
        yzbVar5.b |= 2;
        yzbVar5.d = i3;
        defpackage.omf.u().F(rrvVarH.l());
    }

    private static final boolean o(android.app.NotificationManager.Policy policy) {
        return (policy.priorityCategories & 8) != 0 && policy.priorityCallSenders == 1;
    }

    private static final boolean p(int i) {
        return (i == 1 || i == 0) ? false : true;
    }

    private static final boolean q(android.app.NotificationManager.Policy policy) {
        return (policy.priorityCategories & 16) != 0;
    }

    private static final boolean r(android.app.NotificationManager.Policy policy) {
        return (policy.priorityCategories & 8) != 0 && policy.priorityCallSenders == 2;
    }

    @Override // defpackage.oew
    public final java.util.Collection a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (p(this.c.getCurrentInterruptionFilter())) {
            arrayList.add(defpackage.acbk.C);
        }
        return arrayList;
    }

    @Override // defpackage.oew
    public final void b(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        java.lang.String strU = defpackage.oeh.a().u(carCall);
        defpackage.oei oeiVarA = defpackage.oeh.a();
        android.content.Context context = this.b;
        hsc.c(context).b().u().b(ies.e(new ifr(256))).f(jvb.d().b(strU, oeiVarA.p(context, carCall))).q(new ofo(this, carCall, defpackage.xzg.b((defpackage.xzo) defpackage.ojm.a().b)));
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5721)).u("getting contact photo");
    }

    @Override // defpackage.lhn
    public final void d() {
        this.e.clear();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5740)).u("stopped");
    }

    @Override // defpackage.oew
    public final void e() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5723)).u("reset dnd suppression state");
        this.e.clear();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5738)).u("started");
        if (this.e.isEmpty()) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5739)).u("the service unexpectedly restarted");
    }

    @Override // defpackage.oew
    public final void f(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        int i = carCall.e;
        if (i == 2 || i == 7 || i == 10) {
            return;
        }
        this.e.remove(java.lang.Integer.valueOf(carCall.a));
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:126:0x0335  */
    /* JADX WARN: Code duplicated, block: B:128:0x033b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0341  */
    /* JADX WARN: Code duplicated, block: B:130:0x0347  */
    /* JADX WARN: Code duplicated, block: B:132:0x034d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0353  */
    /* JADX WARN: Code duplicated, block: B:135:0x0359  */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02e7, code lost:
    
        if (defpackage.oeh.a().P(r22.b.getContentResolver(), r3) != 3) goto L124;
     */
    @Override // defpackage.oew
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.google.android.apps.auto.components.telecom.call.CarCall r23) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl.g(com.google.android.apps.auto.components.telecom.call.CarCall):boolean");
    }

    public final android.app.PendingIntent h(int i, com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        android.content.Context context = this.b;
        android.content.Intent intentPutExtra = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl.NotificationBroadcastReceiver.class).setAction("gearhead_missed_calls_tap_action").addCategory(java.lang.String.valueOf(i)).putExtra("gearhead_missed_calls_tag_id", i).putExtra("gearhead_missed_calls_component_name", defpackage.mkc.R().b(carCall));
        android.content.ClipData clipData = wer.a;
        return wer.c(context, 0, intentPutExtra, 201326592);
    }

    public final android.app.PendingIntent i(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        android.content.Context context = this.b;
        android.content.Intent intentPutExtra = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl.NotificationBroadcastReceiver.class).setAction("gearhead_missed_calls_tap_summary_action").putExtra("gearhead_missed_calls_component_name", defpackage.mkc.R().b(carCall));
        android.content.ClipData clipData = wer.a;
        return wer.c(context, 0, intentPutExtra, 201326592);
    }

    public final defpackage.dta j(int i, java.lang.String str, android.net.Uri uri, int i2, com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        android.content.Context context = this.b;
        java.lang.String string = context.getString(i);
        android.content.Intent intentPutExtra = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl.NotificationBroadcastReceiver.class).setAction(str).addCategory(java.lang.String.valueOf(i2)).setData(uri).putExtra("gearhead_missed_calls_tag_id", i2).putExtra("gearhead_missed_calls_component_name", defpackage.mkc.R().b(carCall));
        android.content.ClipData clipData = wer.a;
        return new dsz(0, string, wer.c(context, 0, intentPutExtra, 201326592)).a();
    }

    public final defpackage.dte k() {
        defpackage.dte dteVar = new defpackage.dte(this.b, "gearhead_missed_calls");
        dteVar.o = "gearhead_missed_calls_group";
        dteVar.n(2131233141);
        dteVar.e(16, true);
        dteVar.e(8, true);
        dteVar.j = true;
        dteVar.p(j$.time.Instant.now().toEpochMilli());
        return dteVar;
    }
}
