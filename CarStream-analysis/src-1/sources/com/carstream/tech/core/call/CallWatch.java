package com.carstream.tech.core.call;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import defpackage.f;
import defpackage.l1;
import defpackage.o5;
import defpackage.t1;
import defpackage.u1;
import defpackage.xc;
import defpackage.y;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CallWatch extends NotificationListenerService {
    private static final String K_ANSWER = "android.answerIntent";
    private static final String K_DECLINE = "android.declineIntent";
    private static final String K_HANGUP = "android.hangUpIntent";
    private static volatile String nutCu = "";
    public static volatile boolean running;
    private final Handler cho = new Handler(Looper.getMainLooper());

    public static boolean batTrongCaiDat(Context context) {
        return xc.e(context, "callBar", false);
    }

    private static String chu(Bundle bundle, String str) {
        try {
            CharSequence charSequence = bundle.getCharSequence(str);
            return charSequence == null ? "" : charSequence.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean coQuyen(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            if (string != null && !string.isEmpty()) {
                String strFlattenToString = new ComponentName(context, (Class<?>) CallWatch.class).flattenToString();
                String strFlattenToShortString = new ComponentName(context, (Class<?>) CallWatch.class).flattenToShortString();
                if (string.contains(strFlattenToString)) {
                    return true;
                }
                return string.contains(strFlattenToShortString);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void moTrangCapQuyen(Context context) {
        try {
            Intent intentTrangCapQuyen = trangCapQuyen();
            if (!(context instanceof Activity)) {
                intentTrangCapQuyen.addFlags(268435456);
            }
            context.startActivity(intentTrangCapQuyen);
        } catch (Throwable unused) {
            Toast.makeText(context, "Máy không mở được trang cấp quyền. Vào Cài đặt → Thông báo → Quyền truy cập thông báo và bật CarStream.", 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean nhanNuoi(String str, String str2) {
        Notification notification;
        try {
            StatusBarNotification[] activeNotifications = getActiveNotifications();
            if (activeNotifications != null) {
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (statusBarNotification != null && !statusBarNotification.getKey().equals(str)) {
                        if (statusBarNotification.getPackageName().equals(str2) && (notification = statusBarNotification.getNotification()) != null && NotificationCompat.CATEGORY_CALL.equals(notification.category)) {
                            xuLy(statusBarNotification);
                            o5 o5Var = u1.e;
                            if (o5Var != null && o5Var.a.equals(statusBarNotification.getKey())) {
                                return true;
                            }
                            String key = statusBarNotification.getKey();
                            String packageName = statusBarNotification.getPackageName();
                            String strTenApp = tenApp(this, statusBarNotification.getPackageName());
                            Bundle bundle = notification.extras;
                            u1.a.post(new t1(1, new o5(key, packageName, strTenApp, bundle == null ? "" : chu(bundle, NotificationCompat.EXTRA_TITLE), false, null, null, null)));
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static PendingIntent pi(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj instanceof PendingIntent) {
                return (PendingIntent) obj;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String tenApp(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static Intent trangCapQuyen() {
        return new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
    }

    private void xuLy(StatusBarNotification statusBarNotification) {
        Bundle bundle;
        CharSequence charSequence;
        if (statusBarNotification != null && batTrongCaiDat(this)) {
            if (u1.d == null) {
                u1.d = getApplicationContext();
            }
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && NotificationCompat.CATEGORY_CALL.equals(notification.category) && (bundle = notification.extras) != null) {
                PendingIntent pendingIntentPi = pi(bundle, K_ANSWER);
                PendingIntent pendingIntentPi2 = pi(bundle, K_DECLINE);
                PendingIntent pendingIntentPi3 = pi(bundle, K_HANGUP);
                int i = 0;
                PendingIntent pendingIntent = null;
                if (pendingIntentPi == null && pendingIntentPi2 == null && notification.actions != null) {
                    StringBuilder sb = new StringBuilder();
                    for (Notification.Action action : notification.actions) {
                        if (action != null && (charSequence = action.title) != null && action.actionIntent != null) {
                            String lowerCase = charSequence.toString().toLowerCase();
                            if (sb.length() > 0) {
                                sb.append(" | ");
                            }
                            sb.append('\"');
                            sb.append(lowerCase);
                            sb.append('\"');
                            boolean z = lowerCase.contains("tin nhắn") || lowerCase.contains("tin nhan") || lowerCase.contains("nhắn tin") || lowerCase.contains("nhan tin") || lowerCase.contains("message");
                            if (pendingIntentPi == null && !z && (lowerCase.contains("trả lời") || lowerCase.contains("tra loi") || lowerCase.contains("answer") || lowerCase.contains("nghe"))) {
                                pendingIntentPi = action.actionIntent;
                            } else if (pendingIntentPi2 == null && (lowerCase.contains("từ chối") || lowerCase.contains("tu choi") || lowerCase.contains("decline") || lowerCase.contains("reject"))) {
                                pendingIntentPi2 = action.actionIntent;
                            } else if (pendingIntent == null && (lowerCase.contains("kết thúc") || lowerCase.contains("ket thuc") || lowerCase.contains("tắt máy") || lowerCase.contains("tat may") || lowerCase.contains("cúp") || lowerCase.contains("cup may") || lowerCase.contains("end call") || lowerCase.contains("hang up"))) {
                                pendingIntent = action.actionIntent;
                            }
                        }
                    }
                    String string = sb.toString();
                    if (!string.equals(nutCu)) {
                        nutCu = string;
                        statusBarNotification.getPackageName();
                    }
                }
                PendingIntent pendingIntent2 = pendingIntentPi;
                PendingIntent pendingIntent3 = pendingIntentPi2;
                String strChu = chu(bundle, NotificationCompat.EXTRA_TITLE);
                boolean zContains = chu(bundle, NotificationCompat.EXTRA_TEXT).toLowerCase().contains("video");
                PendingIntent pendingIntent4 = (pendingIntentPi3 != null || pendingIntent == null) ? pendingIntentPi3 : pendingIntent;
                o5 o5Var = new o5(statusBarNotification.getKey(), statusBarNotification.getPackageName(), tenApp(this, statusBarNotification.getPackageName()), strChu, zContains, pendingIntent2, pendingIntent3, pendingIntent4);
                if (pendingIntent2 != null || pendingIntent4 == null) {
                    if (pendingIntent2 != null || pendingIntent3 != null) {
                        u1.a.post(new t1(0, o5Var));
                        return;
                    }
                    String packageName = statusBarNotification.getPackageName();
                    if (packageName == null || !packageName.equals(u1.g) || SystemClock.elapsedRealtime() - u1.h >= 30000) {
                        return;
                    }
                    u1.a.post(new t1(1, o5Var));
                    return;
                }
                boolean z2 = u1.c != 3;
                u1.a.post(new t1(1, o5Var));
                if (z2) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int iC = xc.c(this);
                        ArrayList arrayListD = xc.d(this);
                        int size = arrayListD.size();
                        while (i < size) {
                            Object obj = arrayListD.get(i);
                            i++;
                            l1 l1Var = (l1) obj;
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            String str = l1Var.c;
                            int i2 = l1Var.a;
                            sb2.append(str);
                            sb2.append('#');
                            sb2.append(i2);
                            if (i2 == iC) {
                                sb2.append("(dang chon)");
                            }
                        }
                        sb2.length();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        running = true;
        try {
            StatusBarNotification[] activeNotifications = getActiveNotifications();
            if (activeNotifications != null) {
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    xuLy(statusBarNotification);
                }
            }
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        running = false;
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        try {
            xuLy(statusBarNotification);
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            return;
        }
        try {
            o5 o5Var = u1.e;
            if (o5Var == null || !o5Var.a.equals(statusBarNotification.getKey()) || u1.c != 3) {
                u1.a.post(new f(statusBarNotification.getKey(), 9));
            } else {
                if (nhanNuoi(statusBarNotification.getKey(), o5Var.b)) {
                    return;
                }
                this.cho.postDelayed(new y(this, statusBarNotification.getKey(), o5Var.b, 3), 2500L);
            }
        } catch (Throwable unused) {
        }
    }
}
