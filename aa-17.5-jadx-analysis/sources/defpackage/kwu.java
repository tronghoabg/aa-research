package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserManager;

/* loaded from: classes.dex */
public abstract class kwu extends mdd {
    private static final yph a = yph.c("GH.WPExReceivr");

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if (((kwp) mki.a.i(kwp.class)).b()) {
            ((ype) a.l().ai((char) 3457)).y("Broadcast receiver %s detected in work profile, will disable.", getClass());
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, getClass()), 2, 1);
            return;
        }
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        if (c.a() && userManager.isPrivateProfile()) {
            if (!aczv.am()) {
                ((ype) a.l().ai((char) 3455)).u("Intent received for private profile, will ignore.");
                return;
            }
            ((ype) a.l().ai((char) 3456)).y("Broadcast receiver %s detected for private profile user, will disable.", getClass());
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, getClass()), 2, 1);
            return;
        }
        if (!userManager.isSystemUser()) {
            if (aczv.ak()) {
                ((ype) a.l().ai((char) 3454)).y("Broadcast receiver %s detected for non system user, will disable.", getClass());
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, getClass()), 2, 1);
                return;
            } else if (aczv.aC()) {
                ((ype) a.l().ai((char) 3453)).u("Intent received for non system user, will ignore.");
                return;
            }
        }
        c(context, intent);
    }

    public abstract void c(Context context, Intent intent);
}
