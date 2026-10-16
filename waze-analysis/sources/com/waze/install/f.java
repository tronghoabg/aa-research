package com.waze.install;

import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class f extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24773a = new f();

    f() {
        super(1, com.waze.system.c.class, "needNotificationPermission", "needNotificationPermission(Landroid/content/Context;)Z", 0);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 33) {
            if (context == null) {
                com.waze.shared_infra.i.h.c("SystemNotificationManager: Check notification permission without valid context.");
            } else if (ActivityCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                com.waze.shared_infra.i.h.j("SystemNotificationManager: Notification permission is missing");
                if (!ConfigValues.CONFIG_VALUE_PERMISSIONS_NOTIFICATIONS_REQUEST.b().booleanValue()) {
                    com.waze.shared_infra.i.h.j("SystemNotificationManager: notificationRequestAllowed: PERMISSIONS_NOTIFICATIONS_REQUEST false");
                } else if (ConfigValues.CONFIG_VALUE_PERMISSIONS_NOTIFICATIONS_REQUESTED_AMOUNT.b().longValue() >= ConfigValues.CONFIG_VALUE_PERMISSIONS_NOTIFICATIONS_MAX_REQUEST_AMOUNT.b().longValue()) {
                    com.waze.shared_infra.i.h.j("SystemNotificationManager: notificationRequestAllowed: Max requests " + ConfigValues.CONFIG_VALUE_PERMISSIONS_NOTIFICATIONS_MAX_REQUEST_AMOUNT.b() + " reached (" + ConfigValues.CONFIG_VALUE_PERMISSIONS_NOTIFICATIONS_REQUESTED_AMOUNT.b() + ")");
                } else {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
