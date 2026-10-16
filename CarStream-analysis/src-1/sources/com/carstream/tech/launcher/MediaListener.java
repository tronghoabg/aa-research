package com.carstream.tech.launcher;

import android.app.Notification;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import defpackage.a7;
import defpackage.l7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class MediaListener extends NotificationListenerService {
    private String goiCu;
    private long lucCu;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onNotificationPosted$0(l7 l7Var, Drawable drawable, String str, String str2) {
        try {
            l7Var.a(NotiArt.png(drawable, str, str2));
        } catch (Throwable unused) {
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        Notification notification;
        Drawable applicationIcon;
        if (statusBarNotification != null) {
            try {
                if (statusBarNotification.getPackageName() != null && !statusBarNotification.getPackageName().equals(getPackageName()) && (notification = statusBarNotification.getNotification()) != null) {
                    int i = notification.flags;
                    if ((i & 2) == 0 && (i & 512) == 0 && notification.priority >= 0 && !NotificationCompat.CATEGORY_TRANSPORT.equals(notification.category) && !notification.extras.containsKey(NotificationCompat.EXTRA_MEDIA_SESSION)) {
                        String string = notification.extras.getString(NotificationCompat.EXTRA_TEMPLATE);
                        if (string == null || !string.contains("MediaStyle")) {
                            CharSequence charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE);
                            CharSequence charSequence2 = notification.extras.getCharSequence(NotificationCompat.EXTRA_TEXT);
                            if (charSequence == null && charSequence2 == null) {
                                return;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (!statusBarNotification.getPackageName().equals(this.goiCu) || jCurrentTimeMillis - this.lucCu >= 4000) {
                                this.goiCu = statusBarNotification.getPackageName();
                                this.lucCu = jCurrentTimeMillis;
                                l7 l7VarMirror = Cau.mirror();
                                if (l7VarMirror == null || !l7VarMirror.d()) {
                                    return;
                                }
                                try {
                                    applicationIcon = getPackageManager().getApplicationIcon(statusBarNotification.getPackageName());
                                } catch (PackageManager.NameNotFoundException unused) {
                                    applicationIcon = null;
                                }
                                new Thread(new a7(l7VarMirror, applicationIcon, charSequence == null ? "" : charSequence.toString(), charSequence2 != null ? charSequence2.toString() : "", 0), "noti-art").start();
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
