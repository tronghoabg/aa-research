package androidx.media3.exoplayer.offline;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final Notification.Builder notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new Notification.Builder(context.getApplicationContext(), str);
    }

    private Notification buildEndStateNotification(Context context, int i2, PendingIntent pendingIntent, String str, int i3) {
        return buildNotification(context, i2, pendingIntent, str, i3, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i2, PendingIntent pendingIntent, String str, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i2);
        this.notificationBuilder.setContentTitle(i3 == 0 ? null : context.getResources().getString(i3));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new Notification.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i4, i5, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        if (Build.VERSION.SDK_INT >= 31) {
            this.notificationBuilder.setForegroundServiceBehavior(1);
        }
        return this.notificationBuilder.build();
    }

    public Notification buildDownloadCompletedNotification(Context context, int i2, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i2, pendingIntent, str, R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i2, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i2, pendingIntent, str, R.string.exo_download_failed);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Notification buildProgressNotification(android.content.Context r22, int r23, android.app.PendingIntent r24, java.lang.String r25, java.util.List<androidx.media3.exoplayer.offline.Download> r26, int r27) {
        /*
            r21 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = r0
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r1
        La:
            int r10 = r26.size()
            if (r3 >= r10) goto L4a
            r10 = r26
            java.lang.Object r11 = r10.get(r3)
            androidx.media3.exoplayer.offline.Download r11 = (androidx.media3.exoplayer.offline.Download) r11
            int r12 = r11.state
            if (r12 == 0) goto L46
            r13 = 2
            if (r12 == r13) goto L28
            r13 = 5
            if (r12 == r13) goto L26
            r13 = 7
            if (r12 == r13) goto L28
            goto L47
        L26:
            r6 = r1
            goto L47
        L28:
            float r4 = r11.getPercentDownloaded()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L34
            float r2 = r2 + r4
            r9 = r0
        L34:
            long r11 = r11.getBytesDownloaded()
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L40
            r4 = r1
            goto L41
        L40:
            r4 = r0
        L41:
            r7 = r7 | r4
            int r8 = r8 + 1
            r4 = r1
            goto L47
        L46:
            r5 = r1
        L47:
            int r3 = r3 + 1
            goto La
        L4a:
            if (r4 == 0) goto L52
            r3 = 2131890104(0x7f120fb8, float:1.941489E38)
        L4f:
            r15 = r3
        L50:
            r3 = r1
            goto L74
        L52:
            if (r5 == 0) goto L6c
            if (r27 == 0) goto L6c
            r3 = r27 & 2
            if (r3 == 0) goto L60
            r3 = 2131890109(0x7f120fbd, float:1.94149E38)
        L5d:
            r15 = r3
            r3 = r0
            goto L74
        L60:
            r3 = r27 & 1
            if (r3 == 0) goto L68
            r3 = 2131890108(0x7f120fbc, float:1.9414898E38)
            goto L5d
        L68:
            r3 = 2131890107(0x7f120fbb, float:1.9414896E38)
            goto L5d
        L6c:
            if (r6 == 0) goto L72
            r3 = 2131890110(0x7f120fbe, float:1.9414903E38)
            goto L4f
        L72:
            r15 = r0
            goto L50
        L74:
            if (r3 == 0) goto L8e
            r3 = 100
            if (r4 == 0) goto L87
            float r4 = (float) r8
            float r2 = r2 / r4
            if (r9 == 0) goto L81
            if (r7 == 0) goto L81
            r0 = r1
        L81:
            int r1 = (int) r2
            r18 = r0
            r17 = r1
            goto L8b
        L87:
            r17 = r0
            r18 = r1
        L8b:
            r16 = r3
            goto L94
        L8e:
            r16 = r0
            r17 = r16
            r18 = r17
        L94:
            r19 = 1
            r20 = 0
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            android.app.Notification r0 = r10.buildNotification(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.DownloadNotificationHelper.buildProgressNotification(android.content.Context, int, android.app.PendingIntent, java.lang.String, java.util.List, int):android.app.Notification");
    }
}
