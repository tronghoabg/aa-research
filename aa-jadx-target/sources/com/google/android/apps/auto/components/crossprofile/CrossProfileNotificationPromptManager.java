package com.google.android.apps.auto.components.crossprofile;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class CrossProfileNotificationPromptManager implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CPNotifPromptMgr");
    private final android.content.Context b;
    private final defpackage.mbd c;

    public CrossProfileNotificationPromptManager(android.content.Context context) {
        this.b = context;
        this.c = new defpackage.mbd(context, (int) defpackage.actw.c(), (int) defpackage.actw.d());
    }

    public static com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager a() {
        return (com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager) defpackage.mkp.a.i(com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager.class);
    }

    public static final void b(android.content.Context context, android.content.Intent intent) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 3444)).y("Handling intent. action=%s", intent.getAction());
        java.lang.String action = intent.getAction();
        action.getClass();
        int iHashCode = action.hashCode();
        if (iHashCode != -1834783951) {
            if (iHashCode == -1746781228 && action.equals("ACTION_DELETE")) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3453)).u("User ignored cross-profile notification prompt");
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.WORK_PROFILE_NOTIFICATION_PROMPT, defpackage.zbd.BI).l());
                return;
            }
        } else if (action.equals("ACTION_ACCEPT")) {
            defpackage.ysr.bk(intent.hasExtra("EXTRA_NOTIFICATION_POST_TIME"), "Extra missing: notification post time");
            defpackage.ysr.bk(intent.hasExtra("EXTRA_NEEDS_PERMISSION"), "Extra missing: needsPermission");
            defpackage.ysr.bk(intent.hasExtra("EXTRA_NEEDS_SETTING"), "Extra missing: needsSetting");
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_NEEDS_PERMISSION", false);
            boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_NEEDS_SETTING", false);
            long longExtra = intent.getLongExtra("EXTRA_NOTIFICATION_POST_TIME", -1L);
            defpackage.ojm.a();
            long epochMilli = j$.time.Instant.now().toEpochMilli() - longExtra;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3452)).R("User enabled cross-profile support via leave-behind notification prompt\nneedsPermission=%b\nneedsSetting=%b\nmsSincePost=%s", java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Long.valueOf(epochMilli));
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
            defpackage.zbe zbeVar = defpackage.zbe.WORK_PROFILE_NOTIFICATION_PROMPT;
            defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.BJ);
            rrvVarH.u(epochMilli);
            oimVarU.F(rrvVarH.l());
            if (booleanExtra2) {
                defpackage.mpr.f().a().a("key_work_profile_support", true);
                defpackage.omf.u().F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.BF).l());
            }
            if (booleanExtra) {
                android.content.pm.CrossProfileApps crossProfileApps = defpackage.kwu.b().c;
                crossProfileApps.getClass();
                android.content.Intent intentM = bgp$.ExternalSyntheticApiModelOutline0.m(crossProfileApps);
                intentM.setFlags(268435456);
                context.startActivity(intentM);
                defpackage.omf.u().F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.BH).l());
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Unknown action: %s", action));
    }

    private final android.content.Intent e(java.lang.Class cls, boolean z, boolean z2) {
        android.content.Intent intent = new android.content.Intent(this.b, (java.lang.Class<?>) cls);
        intent.setAction("ACTION_ACCEPT");
        intent.putExtra("EXTRA_NEEDS_PERMISSION", z);
        intent.putExtra("EXTRA_NEEDS_SETTING", z2);
        defpackage.ojm.a();
        intent.putExtra("EXTRA_NOTIFICATION_POST_TIME", j$.time.Instant.now().toEpochMilli());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhn
    public final void eQ() {
        boolean z;
        int iA;
        android.content.Context context;
        android.app.PendingIntent pendingIntentC;
        if (android.os.Build.VERSION.SDK_INT < 31) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3446)).u("Not attempting to post prompt (SDK version too low)");
            return;
        }
        if (!defpackage.kwu.b().d()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3445)).u("Not attempting to post prompt (no work profile detected)");
            return;
        }
        defpackage.mbd mbdVar = this.c;
        mbdVar.d(mbdVar.b() + 1);
        boolean zG = defpackage.kwu.b().g();
        defpackage.kwu kwuVarB = defpackage.kwu.b();
        boolean zG2 = kwuVarB.g();
        boolean zO = defpackage.mpr.f().a().o();
        defpackage.kwt kwtVarA = kwuVarB.a();
        defpackage.yqm yqmVar = defpackage.kwu.a;
        ((defpackage.yqj) yqmVar.l().ai(3439)).R("shouldRequestSetting\npermissionNeeded=%b\nsettingEnabled=%b\navailabilityStatus=%s", java.lang.Boolean.valueOf(zG2), java.lang.Boolean.valueOf(zO), kwtVarA);
        if (!zG2 || zO) {
            if (kwtVarA == defpackage.kwt.UNAVAILABLE_SETTING_DISABLED) {
                ((defpackage.yqj) yqmVar.l().ai((char) 3441)).u("Should request cross-profile setting (permission granted, setting needed)");
            } else {
                ((defpackage.yqj) yqmVar.l().ai((char) 3440)).u("Should *not* request cross-profile setting");
                z = false;
            }
            if (zG && !z) {
                ((defpackage.yqj) a.l().ai((char) 3451)).u("Not prompting");
                return;
            }
            if (android.os.Build.VERSION.SDK_INT < 30) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3450)).u("Trying to request permission with invalid SDK");
                return;
            }
            iA = mbdVar.a();
            if ((iA == 0 && mbdVar.b() < mbdVar.b) || iA >= mbdVar.a) {
                ((defpackage.yqj) a.l().ai((char) 3449)).u("Not requesting cross-profile permission (not permitted by prompt scheduling)");
            }
            ((defpackage.yqj) a.l().ai((char) 3448)).u("Requesting Cross-Profile permission");
            context = this.b;
            java.lang.String string = context.getString(2132085505);
            defpackage.maz.c();
            defpackage.dte dteVar = new defpackage.dte(context, "gearhead_alerts");
            dteVar.n(2131231572);
            dteVar.i(context.getString(2132085506));
            dteVar.h(string);
            dtd dtdVar = new dtd();
            dtdVar.d(string);
            dteVar.o(dtdVar);
            if (zG) {
                android.content.Intent intentE = e(com.google.android.apps.auto.components.crossprofile.CrossProfilePermissionFlowTrampolineActivity.class, true, z);
                android.content.ClipData clipData = wer.a;
                pendingIntentC = wer.b(context, 0, intentE, 335544320);
            } else {
                android.content.Intent intentE2 = e(com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager.NotificationActionHandler.class, false, z);
                android.content.ClipData clipData2 = wer.a;
                pendingIntentC = wer.c(context, 0, intentE2, 335544320);
            }
            dteVar.g = pendingIntentC;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager.NotificationActionHandler.class);
            intent.setAction("ACTION_DELETE");
            defpackage.ojm.a();
            intent.putExtra("EXTRA_NOTIFICATION_POST_TIME", j$.time.Instant.now().toEpochMilli());
            dteVar.j(wer.c(context, 0, intent, 335544320));
            dteVar.e(16, true);
            new defpackage.dun(context).b(null, 2131429905, dteVar.a());
            mbdVar.d.edit().putInt(mbdVar.c("PERMISSION_PROMPT_COUNT"), mbdVar.a() + 1).apply();
            mbdVar.d(0);
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.WORK_PROFILE_NOTIFICATION_PROMPT, defpackage.zbd.BE).l());
            return;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 3442)).u("Should request cross-profile setting (need both permission and setting)");
        z = true;
        if (zG) {
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3450)).u("Trying to request permission with invalid SDK");
            return;
        }
        iA = mbdVar.a();
        if (iA == 0) {
            ((defpackage.yqj) a.l().ai((char) 3448)).u("Requesting Cross-Profile permission");
            context = this.b;
            java.lang.String string2 = context.getString(2132085505);
            defpackage.maz.c();
            defpackage.dte dteVar2 = new defpackage.dte(context, "gearhead_alerts");
            dteVar2.n(2131231572);
            dteVar2.i(context.getString(2132085506));
            dteVar2.h(string2);
            dtd dtdVar2 = new dtd();
            dtdVar2.d(string2);
            dteVar2.o(dtdVar2);
            if (zG) {
                android.content.Intent intentE3 = e(com.google.android.apps.auto.components.crossprofile.CrossProfilePermissionFlowTrampolineActivity.class, true, z);
                android.content.ClipData clipData3 = wer.a;
                pendingIntentC = wer.b(context, 0, intentE3, 335544320);
            } else {
                android.content.Intent intentE4 = e(com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager.NotificationActionHandler.class, false, z);
                android.content.ClipData clipData4 = wer.a;
                pendingIntentC = wer.c(context, 0, intentE4, 335544320);
            }
            dteVar2.g = pendingIntentC;
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager.NotificationActionHandler.class);
            intent2.setAction("ACTION_DELETE");
            defpackage.ojm.a();
            intent2.putExtra("EXTRA_NOTIFICATION_POST_TIME", j$.time.Instant.now().toEpochMilli());
            dteVar2.j(wer.c(context, 0, intent2, 335544320));
            dteVar2.e(16, true);
            new defpackage.dun(context).b(null, 2131429905, dteVar2.a());
            mbdVar.d.edit().putInt(mbdVar.c("PERMISSION_PROMPT_COUNT"), mbdVar.a() + 1).apply();
            mbdVar.d(0);
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.WORK_PROFILE_NOTIFICATION_PROMPT, defpackage.zbd.BE).l());
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 3448)).u("Requesting Cross-Profile permission");
        context = this.b;
        java.lang.String string3 = context.getString(2132085505);
        defpackage.maz.c();
        defpackage.dte dteVar3 = new defpackage.dte(context, "gearhead_alerts");
        dteVar3.n(2131231572);
        dteVar3.i(context.getString(2132085506));
        dteVar3.h(string3);
        dtd dtdVar3 = new dtd();
        dtdVar3.d(string3);
        dteVar3.o(dtdVar3);
        if (zG) {
            android.content.Intent intentE5 = e(com.google.android.apps.auto.components.crossprofile.CrossProfilePermissionFlowTrampolineActivity.class, true, z);
            android.content.ClipData clipData5 = wer.a;
            pendingIntentC = wer.b(context, 0, intentE5, 335544320);
        } else {
            android.content.Intent intentE6 = e(com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager.NotificationActionHandler.class, false, z);
            android.content.ClipData clipData6 = wer.a;
            pendingIntentC = wer.c(context, 0, intentE6, 335544320);
        }
        dteVar3.g = pendingIntentC;
        android.content.Intent intent3 = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager.NotificationActionHandler.class);
        intent3.setAction("ACTION_DELETE");
        defpackage.ojm.a();
        intent3.putExtra("EXTRA_NOTIFICATION_POST_TIME", j$.time.Instant.now().toEpochMilli());
        dteVar3.j(wer.c(context, 0, intent3, 335544320));
        dteVar3.e(16, true);
        new defpackage.dun(context).b(null, 2131429905, dteVar3.a());
        mbdVar.d.edit().putInt(mbdVar.c("PERMISSION_PROMPT_COUNT"), mbdVar.a() + 1).apply();
        mbdVar.d(0);
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.WORK_PROFILE_NOTIFICATION_PROMPT, defpackage.zbd.BE).l());
        return;
        ((defpackage.yqj) a.l().ai((char) 3449)).u("Not requesting cross-profile permission (not permitted by prompt scheduling)");
    }

    @Override // defpackage.lhn
    public final void d() {
    }
}
