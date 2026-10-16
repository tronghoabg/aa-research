package com.google.android.apps.auto.components.softminversion;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.acxa;
import defpackage.dug;
import defpackage.ikj;
import defpackage.kfl;
import defpackage.lau;
import defpackage.mdd;
import defpackage.mmc;
import defpackage.rpz;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.vky;
import defpackage.woy;
import defpackage.xwx;
import defpackage.yfy;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes.dex */
public final class SoftMinversionManager {
    public static final yph a = yph.c("GH.SoftMinversionMgr");
    public final yfy b;
    public final Context c;
    public final rpz d;

    /* loaded from: classes2.dex */
    public static class NotificationActionBroadcastReceiver extends mdd {
        private final xwx a = new ikj(8);

        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("NotificationActionBroadcastReceiver");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            yph yphVar = SoftMinversionManager.a;
            ((ype) yphVar.l().ai(5096)).M("onReceive(%s, %s)", context, intent);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String stringExtra = intent.getStringExtra("app_to_update");
            woy.O(!TextUtils.isEmpty(stringExtra), "Intent contained an empty or null package name extra.");
            stringExtra.getClass();
            String action = intent.getAction();
            if ((action != null && action.startsWith("com.google.android.apps.auto.components.softminversion.ACTION_DISMISS")) || intent.getBooleanExtra("dismiss_action", false)) {
                lau.a().a(context, "soft_minversion_dismissed_prefs").edit().putBoolean(stringExtra, true).apply();
                new dug(context).a(stringExtra, R.id.update_notification_id);
                return;
            }
            long longExtra = intent.getLongExtra("installed_version_code", -1L);
            woy.O(longExtra >= 0, "Intent did not contain valid installed version code.");
            long longExtra2 = intent.getLongExtra("soft_minversion_code", -1L);
            woy.O(longExtra2 >= 0, "Intent did not contain valid soft minversion version code.");
            long longExtra3 = intent.getLongExtra("notification_created_ms", -1L);
            woy.O(longExtra3 >= 0, "Intent does not include the time the notification was created.");
            woy.O(longExtra3 <= jElapsedRealtime, "Intent claims notification was created in the future!");
            long j = jElapsedRealtime - longExtra3;
            ((ype) ((ype) yphVar.f()).ai(5097)).R("User clicked to update %s which did not meet soft minversion %d on notification generated %d ms ago.", stringExtra, Long.valueOf(longExtra2), Long.valueOf(j));
            mmc mmcVarE = e();
            Object objA = this.a.a(context);
            ComponentName componentName = new ComponentName(stringExtra, "");
            yxy yxyVar = yxy.GEARHEAD;
            yzz yzzVar = yzz.SOFT_MINVERSION;
            rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.yC);
            rrbVarH.p(componentName);
            rrbVarH.r(longExtra2);
            rrbVarH.u(j);
            rpz rpzVar = (rpz) objA;
            rpzVar.c(rrbVarH.l());
            rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.yB);
            rrbVarH2.p(componentName);
            rrbVarH2.r(longExtra);
            rrbVarH2.u(j);
            rpzVar.c(rrbVarH2.l());
            Intent intent2 = (acxa.U() && "com.google.android.apps.maps".equals(stringExtra)) ? new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=navigation")) : new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(stringExtra)));
            intent2.setFlags(268435456);
            context.startActivity(intent2);
            mmcVarE.i();
        }
    }

    public SoftMinversionManager(Context context) {
        rpz rpzVarA = rpz.a(context);
        this.c = context;
        this.d = rpzVarA;
        this.b = yfy.m("com.google.android.gms", Integer.valueOf(R.string.app_google_play_services), RemoteApiConstants.NOW_PACKAGE, Integer.valueOf(R.string.app_google_assistant), "com.google.android.apps.maps", Integer.valueOf(R.string.app_google_maps));
    }

    public final Bitmap a(String str) throws PackageManager.NameNotFoundException {
        try {
            Drawable applicationIcon = this.c.getPackageManager().getApplicationIcon(str);
            if (applicationIcon instanceof BitmapDrawable) {
                return ((BitmapDrawable) applicationIcon).getBitmap();
            }
            Context context = this.c;
            return kfl.b(applicationIcon, context.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width), context.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_height));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
