package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import com.carstream.tech.mirror.adb.AdbGhepNoi$Nhan;
import io.github.muntashirakon.adb.android.AdbMdns;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class u {
    public static volatile int a = -1;
    public static volatile String b;
    public static volatile AdbMdns c;
    public static volatile String d;

    public static void a(Context context, String str) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager == null) {
                return;
            }
            if (notificationManager.getNotificationChannel("cs_adb_ghepnoi") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("cs_adb_ghepnoi", "Ghép nối", 4);
                notificationChannel.setDescription("Nhập mã ghép nối để chạy trên màn hình xe");
                notificationManager.createNotificationChannel(notificationChannel);
            }
            notificationManager.notify(4712, new Notification.Builder(context, "cs_adb_ghepnoi").setSmallIcon(R.drawable.stat_sys_download_done).setContentTitle("Ghép nối CarStream").setContentText(str).setStyle(new Notification.BigTextStyle().bigText(str)).setOngoing(true).addAction(new Notification.Action.Builder(R.drawable.ic_menu_send, "Nhập mã", PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) AdbGhepNoi$Nhan.class).setAction("com.carstream.tech.ADB_MA_GHEP_NOI").setPackage(context.getPackageName()), 167772160)).addRemoteInput(new RemoteInput.Builder("ma").setLabel("Mã 6 số").build()).build()).build());
        } catch (Throwable th) {
            String.valueOf(th);
            d = "Không hiện được thông báo nhập mã — hãy bật thông báo cho CarStream rồi thử lại.";
            u5.d("GHEP NOI: !! KHONG DAT DUOC THONG BAO — " + th.getClass().getSimpleName() + " (o nhap ma khong bao gio hien)");
        }
    }
}
