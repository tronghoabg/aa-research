package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class u1 {
    public static volatile Context d;
    public static volatile o5 e;
    public static volatile int f;
    public static volatile String g;
    public static volatile long h;
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public static volatile int c = 1;
    public static final o1 i = new o1(1);

    public static boolean a(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            return false;
        }
        try {
            Bundle bundle = null;
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                    activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                    bundle = activityOptionsMakeBasic.toBundle();
                } catch (Throwable unused) {
                }
            }
            Bundle bundle2 = bundle;
            if (bundle2 != null) {
                pendingIntent.send(null, 0, null, null, null, null, bundle2);
                return true;
            }
            pendingIntent.send();
            return true;
        } catch (Throwable th) {
            String.valueOf(th);
            return false;
        }
    }

    public static void b() {
        Iterator it = b.iterator();
        while (it.hasNext()) {
            try {
                ((m1) it.next()).a.f();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(int i2) {
        Uri uriS;
        AudioManager audioManager;
        c = i2;
        f = 0;
        if (d != null) {
            if (i2 == 2) {
                Context context = d;
                synchronized (w1.class) {
                    if (w1.a == null && xc.e(context, "callRing", true) && (uriS = w1.s(context)) != null && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                        int i3 = audioManager.isStreamMute(2) ? 4 : 6;
                        w1.w(i3);
                        try {
                            MediaPlayer mediaPlayer = new MediaPlayer();
                            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(i3).setContentType(4).build());
                            mediaPlayer.setDataSource(context.getApplicationContext(), uriS);
                            mediaPlayer.setLooping(true);
                            mediaPlayer.prepare();
                            mediaPlayer.start();
                            w1.a = mediaPlayer;
                            new Handler(Looper.getMainLooper()).postDelayed(new v1(i3), 900L);
                        } catch (Throwable th) {
                            String.valueOf(th);
                            w1.j();
                        }
                    }
                }
            } else {
                synchronized (w1.class) {
                    w1.j();
                }
            }
        }
        if (i2 == 1) {
            e = null;
            a.removeCallbacks(i);
        } else {
            Handler handler = a;
            o1 o1Var = i;
            handler.removeCallbacks(o1Var);
            handler.postDelayed(o1Var, 1000L);
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewManager, android.view.WindowManager] */
    public static void d(PendingIntent pendingIntent, String str) {
        boolean zIsActivity;
        PowerManager.WakeLock wakeLock;
        ?? r2;
        TextView textView;
        Object obj;
        Context context = d;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                zIsActivity = pendingIntent.isActivity();
            } catch (Throwable unused) {
            }
        } else {
            zIsActivity = true;
        }
        if (context == null || !zIsActivity || !Settings.canDrawOverlays(context)) {
            a(pendingIntent);
            return;
        }
        try {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(268435466, "carstream:cuocgoi");
            wakeLockNewWakeLock.acquire(4000L);
            wakeLock = wakeLockNewWakeLock;
        } catch (Throwable unused2) {
            wakeLock = null;
        }
        try {
            r2 = (WindowManager) context.getSystemService("window");
            try {
                TextView textView2 = new TextView(context);
                textView2.setText("Đang nối cuộc gọi…");
                textView2.setTextColor(d8.k());
                textView2.setTextSize(14.0f);
                int i2 = (int) (context.getResources().getDisplayMetrics().density * 14.0f);
                int i3 = i2 * 2;
                textView2.setPadding(i3, i2, i3, i2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(d8.c(700));
                gradientDrawable.setCornerRadius(999.0f);
                textView2.setBackground(gradientDrawable);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 24, -3);
                layoutParams.gravity = 49;
                layoutParams.y = i2 * 6;
                r2.addView(textView2, layoutParams);
                textView = textView2;
                obj = r2;
            } catch (Throwable th) {
                th = th;
                String.valueOf(th);
                textView = null;
                obj = r2;
                Object obj2 = obj;
                Handler handler = a;
                handler.postDelayed(new f(pendingIntent, str), 400L);
                handler.postDelayed(new y(textView, obj2, wakeLock, 2, false), 2500L);
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = 0;
        }
        Object obj22 = obj;
        Handler handler2 = a;
        handler2.postDelayed(new f(pendingIntent, str), 400L);
        handler2.postDelayed(new y(textView, obj22, wakeLock, 2, false), 2500L);
    }
}
