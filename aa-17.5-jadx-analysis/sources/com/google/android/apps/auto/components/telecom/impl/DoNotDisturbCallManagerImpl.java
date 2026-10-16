package com.google.android.apps.auto.components.telecom.impl;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.projection.gearhead.R;
import defpackage.abnp;
import defpackage.acai;
import defpackage.dss;
import defpackage.dst;
import defpackage.dsx;
import defpackage.ebf;
import defpackage.hrt;
import defpackage.hsq;
import defpackage.iek;
import defpackage.ifj;
import defpackage.jxn;
import defpackage.mcd;
import defpackage.mdd;
import defpackage.mrw;
import defpackage.nsc;
import defpackage.odn;
import defpackage.odo;
import defpackage.oec;
import defpackage.oeu;
import defpackage.ohs;
import defpackage.oit;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.vky;
import defpackage.wdu;
import defpackage.xya;
import defpackage.xyi;
import defpackage.ycm;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxw;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class DoNotDisturbCallManagerImpl implements oec {
    public static final yph a;
    private static final long d;
    public final Context b;
    public final NotificationManager c;
    private final HashMap e;

    /* loaded from: classes2.dex */
    public static class NotificationBroadcastReceiver extends mdd {
        private static final void c(Context context, int i) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            Stream streamFilter = Collection.EL.stream(DoNotDisturbCallManagerImpl.l(notificationManager)).filter(new nsc(i, 3));
            int i2 = yfq.d;
            if (((yfq) streamFilter.collect(ycm.a)).isEmpty()) {
                notificationManager.cancel("gearhead_missed_calls_summary", 1);
            }
            notificationManager.cancel(String.valueOf(i), 1);
        }

        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("NotificationBroadcastReceiver");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            ComponentName componentName = (ComponentName) intent.getExtras().getParcelable("gearhead_missed_calls_component_name");
            if ("gearhead_missed_calls_tap_summary_action".equals(intent.getAction())) {
                DoNotDisturbCallManagerImpl.m(yzy.Di, componentName);
                context.startActivity(new Intent("android.intent.action.VIEW").setType("vnd.android.cursor.dir/calls").setFlags(268435456));
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                yfq yfqVarL = DoNotDisturbCallManagerImpl.l(notificationManager);
                int size = yfqVarL.size();
                for (int i = 0; i < size; i++) {
                    StatusBarNotification statusBarNotification = (StatusBarNotification) yfqVarL.get(i);
                    notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                }
                notificationManager.cancel("gearhead_missed_calls_summary", 1);
                ((ype) ((ype) DoNotDisturbCallManagerImpl.a.f()).ai((char) 5693)).u("missed calls summary notification tapped");
                return;
            }
            if ("gearhead_missed_calls_tap_action".equals(intent.getAction())) {
                DoNotDisturbCallManagerImpl.m(yzy.Dh, componentName);
                context.startActivity(new Intent("android.intent.action.VIEW").setType("vnd.android.cursor.dir/calls").setFlags(268435456));
                c(context, intent.getExtras().getInt("gearhead_missed_calls_tag_id"));
                ((ype) ((ype) DoNotDisturbCallManagerImpl.a.f()).ai((char) 5692)).u("missed call notification tapped");
                return;
            }
            if ("gearhead_missed_calls_callback_action".equals(intent.getAction())) {
                DoNotDisturbCallManagerImpl.m(yzy.Dj, componentName);
                context.startActivity(new Intent("android.intent.action.CALL").setData(intent.getData()).setFlags(268435456));
                c(context, intent.getExtras().getInt("gearhead_missed_calls_tag_id"));
                ((ype) ((ype) DoNotDisturbCallManagerImpl.a.f()).ai((char) 5691)).u("missed call call back action hit");
                return;
            }
            if ("gearhead_missed_calls_message_action".equals(intent.getAction())) {
                DoNotDisturbCallManagerImpl.m(yzy.Dk, componentName);
                context.startActivity(new Intent("android.intent.action.SENDTO").setData(intent.getData()).setFlags(268435456));
                c(context, intent.getExtras().getInt("gearhead_missed_calls_tag_id"));
                ((ype) ((ype) DoNotDisturbCallManagerImpl.a.f()).ai((char) 5690)).u("missed call message action hit");
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        d = 900000L;
        a = yph.c("GH.DNDCallManager");
    }

    public DoNotDisturbCallManagerImpl(Context context) {
        oit.a();
        this.e = new HashMap();
        this.b = context;
        this.c = (NotificationManager) context.getSystemService(NotificationManager.class);
    }

    public static yfq l(NotificationManager notificationManager) {
        Stream streamFilter = DesugarArrays.stream(notificationManager.getActiveNotifications()).filter(new mrw(10)).filter(new mrw(11)).filter(new mrw(12));
        int i = yfq.d;
        return (yfq) streamFilter.collect(ycm.a);
    }

    public static void m(yzy yzyVar, ComponentName componentName) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL_DND_MANAGER, yzyVar);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
    }

    private static void n(yzy yzyVar, ComponentName componentName, int i, NotificationManager.Policy policy) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL_DND_MANAGER, yzyVar);
        rrbVarH.p(componentName);
        if (rrbVarH.x == null) {
            rrbVarH.x = yxw.a.n();
        }
        abnp abnpVar = rrbVarH.x;
        int i2 = policy.suppressedVisualEffects;
        abnpVar.t();
        yxw yxwVar = (yxw) abnpVar.b;
        yxw yxwVar2 = yxw.a;
        yxwVar.b |= 8;
        yxwVar.f = i2;
        abnpVar.t();
        yxw yxwVar3 = (yxw) abnpVar.b;
        yxwVar3.b |= 1;
        yxwVar3.c = i;
        int i3 = policy.priorityCategories;
        abnpVar.t();
        yxw yxwVar4 = (yxw) abnpVar.b;
        yxwVar4.b |= 4;
        yxwVar4.e = i3;
        int i4 = policy.priorityCallSenders;
        abnpVar.t();
        yxw yxwVar5 = (yxw) abnpVar.b;
        yxwVar5.b |= 2;
        yxwVar5.d = i4;
        ebf.j().F(rrbVarH.l());
    }

    private static final boolean o(NotificationManager.Policy policy) {
        return (policy.priorityCategories & 8) != 0 && policy.priorityCallSenders == 1;
    }

    private static final boolean p(int i) {
        return (i == 1 || i == 0) ? false : true;
    }

    private static final boolean q(NotificationManager.Policy policy) {
        return (policy.priorityCategories & 16) != 0;
    }

    private static final boolean r(NotificationManager.Policy policy) {
        return (policy.priorityCategories & 8) != 0 && policy.priorityCallSenders == 2;
    }

    @Override // defpackage.oec
    public final java.util.Collection a() {
        ArrayList arrayList = new ArrayList();
        if (p(this.c.getCurrentInterruptionFilter())) {
            arrayList.add(acai.C);
        }
        return arrayList;
    }

    @Override // defpackage.oec
    public final void b(CarCall carCall) {
        String strU = odn.a().u(carCall);
        odo odoVarA = odn.a();
        Context context = this.b;
        ((hsq) hrt.c(context).b().u()).n(iek.e(new ifj(256))).f(jxn.c().b(strU, odoVarA.p(context, carCall))).q(new oeu(this, carCall, xya.b((xyi) oit.a().b)));
        ((ype) ((ype) a.f()).ai((char) 5695)).u("getting contact photo");
    }

    @Override // defpackage.lhg
    public final void c() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 5712)).u("started");
        if (this.e.isEmpty()) {
            return;
        }
        ((ype) ((ype) yphVar.h()).ai((char) 5713)).u("the service unexpectedly restarted");
    }

    @Override // defpackage.lhg
    public final void d() {
        this.e.clear();
        ((ype) ((ype) a.f()).ai((char) 5714)).u("stopped");
    }

    @Override // defpackage.oec
    public final void e() {
        ((ype) ((ype) a.f()).ai((char) 5697)).u("reset dnd suppression state");
        this.e.clear();
    }

    @Override // defpackage.oec
    public final void f(CarCall carCall) {
        int i = carCall.e;
        if (i == 2 || i == 7 || i == 10) {
            return;
        }
        this.e.remove(Integer.valueOf(carCall.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e9, code lost:
    
        if (defpackage.odn.a().P(r22.b.getContentResolver(), r3) != 3) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0262 A[PHI: r14
  0x0262: PHI (r14v4 boolean) = (r14v3 boolean), (r14v7 boolean) binds: [B:99:0x0261, B:95:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0241 A[EDGE_INSN: B:74:0x0210->B:98:0x0241 BREAK  A[LOOP:0: B:70:0x01fc->B:76:0x0214], PHI: r14
  0x0241: PHI (r14v6 boolean) = (r14v5 boolean), (r14v7 boolean), (r14v7 boolean) binds: [B:97:0x0240, B:95:0x023d, B:74:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.oec
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.google.android.apps.auto.components.telecom.call.CarCall r23) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl.g(com.google.android.apps.auto.components.telecom.call.CarCall):boolean");
    }

    public final PendingIntent h(int i, CarCall carCall) {
        Context context = this.b;
        Intent intentPutExtra = new Intent(context, (Class<?>) NotificationBroadcastReceiver.class).setAction("gearhead_missed_calls_tap_action").addCategory(String.valueOf(i)).putExtra("gearhead_missed_calls_tag_id", i).putExtra("gearhead_missed_calls_component_name", mcd.A().b(carCall));
        ClipData clipData = wdu.a;
        return wdu.c(context, 0, intentPutExtra, 201326592);
    }

    public final PendingIntent i(CarCall carCall) {
        Context context = this.b;
        Intent intentPutExtra = new Intent(context, (Class<?>) NotificationBroadcastReceiver.class).setAction("gearhead_missed_calls_tap_summary_action").putExtra("gearhead_missed_calls_component_name", mcd.A().b(carCall));
        ClipData clipData = wdu.a;
        return wdu.c(context, 0, intentPutExtra, 201326592);
    }

    public final dst j(int i, String str, Uri uri, int i2, CarCall carCall) {
        Context context = this.b;
        String string = context.getString(i);
        Intent intentPutExtra = new Intent(context, (Class<?>) NotificationBroadcastReceiver.class).setAction(str).addCategory(String.valueOf(i2)).setData(uri).putExtra("gearhead_missed_calls_tag_id", i2).putExtra("gearhead_missed_calls_component_name", mcd.A().b(carCall));
        ClipData clipData = wdu.a;
        return new dss(0, string, wdu.c(context, 0, intentPutExtra, 201326592)).a();
    }

    public final dsx k() {
        dsx dsxVar = new dsx(this.b, "gearhead_missed_calls");
        dsxVar.o = "gearhead_missed_calls_group";
        dsxVar.n(R.drawable.quantum_gm_ic_phone_missed_vd_24);
        dsxVar.e(16, true);
        dsxVar.e(8, true);
        dsxVar.j = true;
        dsxVar.p(Instant.now().toEpochMilli());
        return dsxVar;
    }
}
