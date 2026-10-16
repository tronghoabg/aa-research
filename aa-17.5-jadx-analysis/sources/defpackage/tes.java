package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Vibrator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class tes {
    public static final yob a = yob.c("com/google/android/libraries/auto/lockscreen/ShowOnLockScreenHelper");
    private static final long[] c = {0, 600, 100, 600};
    private boolean d;
    private final Activity f;
    private final Handler e = new Handler();
    private final Runnable g = new shd(this, 8);
    public final List b = new ArrayList();

    public tes(Activity activity) {
        this.f = activity;
    }

    private final void c() {
        this.d = false;
        this.e.removeCallbacksAndMessages(null);
        this.b.clear();
    }

    public final void a() {
        ((ynz) ((ynz) a.e()).ai((char) 8990)).u("cancel");
        this.f.getWindow().clearFlags(2621568);
        c();
    }

    public final void b() {
        Activity activity = this.f;
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService("keyguard");
        keyguardManager.getClass();
        if (!keyguardManager.isKeyguardLocked()) {
            ((ynz) ((ynz) a.f()).ai((char) 8995)).u("Not displaying over lock screen (phone is not locked)");
            return;
        }
        yob yobVar = a;
        ((ynz) ((ynz) yobVar.e()).ai((char) 8994)).u("show");
        activity.getWindow().addFlags(2621568);
        if (this.d) {
            c();
        }
        this.e.postDelayed(this.g, 30000L);
        this.d = true;
        if (dln.p(activity, "android.permission.VIBRATE") != 0) {
            ((ynz) ((ynz) yobVar.h()).ai((char) 8992)).u("Can't vibrate phone (perimssion misisng)");
            return;
        }
        Vibrator vibrator = (Vibrator) activity.getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        vibrator.vibrate(c, -1, new AudioAttributes.Builder().setUsage(10).build());
    }
}
