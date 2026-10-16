package defpackage;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class mfe {
    private static final yph a = yph.c("GH.PhoneActivityLaunchr");

    public static mfe a() {
        return (mfe) mki.a.i(mfe.class);
    }

    public static final void b(Context context, Intent intent, String str, String str2, String str3, mfd mfdVar, yzz yzzVar, int i) {
        int i2;
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 4832)).y("Attempting to launch phone activity with UiContext=%s", yzzVar);
        ((ype) ((ype) yphVar.f()).ai((char) 4828)).u("Attempting to launch phone activity");
        if (lbh.c().e() != lir.a) {
            context.startActivity(intent, luk.c());
            if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked()) {
                ((ype) ((ype) yphVar.f()).ai((char) 4831)).u("Launched successfully, but phone is locked");
                i2 = 2;
            } else {
                ((ype) ((ype) yphVar.f()).ai((char) 4830)).u("Launched successfully");
                i2 = 3;
            }
        } else {
            ((ype) ((ype) yphVar.f()).ai((char) 4829)).u("Abort phone activity launch (user is driving)");
            i2 = 1;
        }
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                d(i, context, mkn.s, str);
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzy.pV).l());
                return;
            } else {
                d(i, context, mkn.s, str2);
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzy.pV).l());
                return;
            }
        }
        if (str3 != null) {
            d(i, context, mkn.s, str3);
        }
        if (mfdVar != null) {
            ((ype) ((ype) yphVar.f()).ai((char) 4833)).w("Posting driving notification with id=%d", 953608361);
            CharSequence charSequenceLoadLabel = context.getApplicationInfo().loadLabel(context.getPackageManager());
            ClipData clipData = wdu.a;
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
            mas.c();
            dsx dsxVar = new dsx(context, "gearhead_alerts");
            dsxVar.n(2131231121);
            dsxVar.i(charSequenceLoadLabel);
            String str4 = mfdVar.a;
            dsxVar.h(str4);
            dsw dswVar = new dsw();
            dswVar.d(str4);
            dsxVar.o(dswVar);
            dsxVar.e(16, true);
            dsxVar.l();
            dsxVar.g = activity;
            new dug(context).b(null, 953608361, dsxVar.a());
        }
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzy.pW).l());
    }

    public static final void c(Context context, Intent intent, String str, yzz yzzVar) {
        b(context, intent, context.getString(R.string.gearhead_launcher_app_launched, str), context.getString(R.string.gearhead_launcher_app_launched_unlock_to_access_app, str), context.getString(R.string.gearhead_launcher_app_cannot_launch_moving, str), null, yzzVar, 1);
    }

    private static final void d(int i, Context context, ComponentName componentName, CharSequence charSequence) {
        if (i - 1 != 0) {
            obs.a().e(context, componentName, charSequence, 1, null);
        } else {
            obs.a().g(context, componentName, charSequence, 1);
        }
    }
}
