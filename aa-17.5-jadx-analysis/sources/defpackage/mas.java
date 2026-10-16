package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class mas {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.NotifChannelManager");
    private static mas c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final Context e;
    private final Executor f;

    private mas(Context context, Executor executor) {
        this.e = context;
        this.f = executor;
    }

    public static NotificationChannel a(Context context) {
        c();
        NotificationChannel notificationChannel = new NotificationChannel("gearhead_connection_status", context.getString(R.string.connection_status_channel_name), true != aczv.aP() ? 2 : 4);
        notificationChannel.setSound(null, null);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        return notificationChannel;
    }

    public static synchronized void b(Context context, Executor executor) {
        if (c == null) {
            c = new mas(context, executor);
        }
    }

    @ResultIgnorabilityUnspecified
    public static synchronized void c() {
        mas masVar = c;
        if (masVar == null || !masVar.d.compareAndSet(false, true)) {
            return;
        }
        try {
            mas masVar2 = c;
            Context context = masVar2.e;
            if (context == null) {
                throw new IllegalStateException("Context is null, cannot setup notification channels.");
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                ((ype) ((ype) b.h()).ai((char) 4662)).u("NotificationManager not found, cannot setup channels.");
                return;
            }
            try {
                notificationManager.createNotificationChannels(yfq.t(a(context), new NotificationChannel("gearhead_alerts", context.getString(R.string.notification_alerts_channel_name), 4), new NotificationChannel("gearhead_surveys_and_feedback", context.getString(R.string.notification_feedback_channel_name), 3), new NotificationChannel("gearhead_tips_and_tricks", context.getString(R.string.notification_tips_channel_name), 3)));
            } catch (IllegalArgumentException e) {
                ((ype) ((ype) ((ype) b.h()).p(e)).ai((char) 4663)).u("Couldn't create notification channels");
            }
            masVar2.f.execute(new kzu(yfq.s("gearhead_default", "gearhead_importance_high", "gearhead_wireless"), notificationManager, 19));
        } catch (IllegalStateException e2) {
            c.d.set(false);
            ((ype) ((ype) ((ype) b.h()).p(e2)).ai((char) 4664)).u("Couldn't setup notification channels.");
        }
    }
}
