package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.calendar.CalendarNotificationActionService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class kgu {
    public static final yph a = yph.c("GH.CalendarNotifActions");
    private final AtomicInteger b = new AtomicInteger(0);

    public static Intent b() {
        return new Intent(mki.a.c, (Class<?>) CalendarNotificationActionService.class);
    }

    public static kgu c() {
        return (kgu) mki.a.i(kgu.class);
    }

    public final PendingIntent a(Intent intent) {
        Context context = mki.a.c;
        int andIncrement = this.b.getAndIncrement();
        ClipData clipData = wdu.a;
        PendingIntent pendingIntentD = wdu.d(context, andIncrement, intent, 67108864);
        pendingIntentD.getClass();
        return pendingIntentD;
    }
}
