package com.google.android.apps.auto.components.crossprofile;

import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import defpackage.acsu;
import defpackage.ebf;
import defpackage.kwo;
import defpackage.lhg;
import defpackage.maw;
import defpackage.mdd;
import defpackage.mki;
import defpackage.mpl;
import defpackage.ohs;
import defpackage.oit;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.vky;
import defpackage.woy;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import j$.time.Instant;

/* loaded from: classes.dex */
public final class CrossProfileNotificationPromptManager implements lhg {
    public static final yph a = yph.c("GH.CPNotifPromptMgr");
    private final Context b;
    private final maw c;

    /* loaded from: classes2.dex */
    public static class NotificationActionHandler extends mdd {
        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("CrossProfileNotificationPromptManager.NotificationActionHandler");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            ((ype) ((ype) CrossProfileNotificationPromptManager.a.f()).ai((char) 3440)).y("NotificationActionHandler handling intent. action=%s", intent.getAction());
            woy.aa(!intent.getBooleanExtra("EXTRA_NEEDS_PERMISSION", false), "BroadcastReceiver should never attempt to launch the permission flow activity.");
            CrossProfileNotificationPromptManager.a();
            CrossProfileNotificationPromptManager.b(context, intent);
        }
    }

    public CrossProfileNotificationPromptManager(Context context) {
        this.b = context;
        this.c = new maw(context, (int) acsu.c(), (int) acsu.d());
    }

    public static CrossProfileNotificationPromptManager a() {
        return (CrossProfileNotificationPromptManager) mki.a.i(CrossProfileNotificationPromptManager.class);
    }

    public static final void b(Context context, Intent intent) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3441)).y("Handling intent. action=%s", intent.getAction());
        String action = intent.getAction();
        action.getClass();
        int iHashCode = action.hashCode();
        if (iHashCode != -1834783951) {
            if (iHashCode == -1746781228 && action.equals("ACTION_DELETE")) {
                ((ype) ((ype) yphVar.f()).ai((char) 3450)).u("User ignored cross-profile notification prompt");
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.WORK_PROFILE_NOTIFICATION_PROMPT, yzy.BE).l());
                return;
            }
        } else if (action.equals("ACTION_ACCEPT")) {
            woy.aa(intent.hasExtra("EXTRA_NOTIFICATION_POST_TIME"), "Extra missing: notification post time");
            woy.aa(intent.hasExtra("EXTRA_NEEDS_PERMISSION"), "Extra missing: needsPermission");
            woy.aa(intent.hasExtra("EXTRA_NEEDS_SETTING"), "Extra missing: needsSetting");
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_NEEDS_PERMISSION", false);
            boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_NEEDS_SETTING", false);
            long longExtra = intent.getLongExtra("EXTRA_NOTIFICATION_POST_TIME", -1L);
            oit.a();
            long epochMilli = Instant.now().toEpochMilli() - longExtra;
            ((ype) ((ype) yphVar.f()).ai(3449)).R("User enabled cross-profile support via leave-behind notification prompt\nneedsPermission=%b\nneedsSetting=%b\nmsSincePost=%s", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Long.valueOf(epochMilli));
            ohs ohsVarJ = ebf.j();
            yxy yxyVar = yxy.GEARHEAD;
            yzz yzzVar = yzz.WORK_PROFILE_NOTIFICATION_PROMPT;
            rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.BF);
            rrbVarH.u(epochMilli);
            ohsVarJ.F(rrbVarH.l());
            if (booleanExtra2) {
                mpl.f().a().a("key_work_profile_support", true);
                ebf.j().F(rrc.h(yxyVar, yzzVar, yzy.BA).l());
            }
            if (booleanExtra) {
                CrossProfileApps crossProfileApps = kwo.b().c;
                crossProfileApps.getClass();
                Intent intentCreateRequestInteractAcrossProfilesIntent = crossProfileApps.createRequestInteractAcrossProfilesIntent();
                intentCreateRequestInteractAcrossProfilesIntent.setFlags(268435456);
                context.startActivity(intentCreateRequestInteractAcrossProfilesIntent);
                ebf.j().F(rrc.h(yxyVar, yzzVar, yzy.BD).l());
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Unknown action: %s", action));
    }

    private final Intent e(Class cls, boolean z, boolean z2) {
        Intent intent = new Intent(this.b, (Class<?>) cls);
        intent.setAction("ACTION_ACCEPT");
        intent.putExtra("EXTRA_NEEDS_PERMISSION", z);
        intent.putExtra("EXTRA_NEEDS_SETTING", z2);
        oit.a();
        intent.putExtra("EXTRA_NOTIFICATION_POST_TIME", Instant.now().toEpochMilli());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager.c():void");
    }

    @Override // defpackage.lhg
    public final void d() {
    }
}
