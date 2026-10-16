package com.carstream.tech.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.support.v4.media.session.MediaSessionCompat;
import com.carstream.tech.R;
import com.carstream.tech.car.e;
import com.carstream.tech.phone.MainActivity;
import defpackage.id;
import defpackage.jc;
import defpackage.t7;
import defpackage.w6;
import defpackage.w7;
import defpackage.xc;
import defpackage.y6;
import defpackage.z6;
import java.util.Iterator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class PlaybackService extends Service {
    private static final String ACTION_NEXT = "cnmedia.NEXT";
    private static final String ACTION_PLAY_PAUSE = "cnmedia.PLAY_PAUSE";
    private static final String ACTION_PREV = "cnmedia.PREV";
    private static final String CHANNEL_ID = "playback";
    private static final long COLD_START_MS = 20000;
    private static final long COOLDOWN_MS = 25000;
    private static final long DEAD_MS = 15000;
    private static final int MAX_TRIES = 3;
    private static final int NOTIFICATION_ID = 1;
    private static final long RETRY_WINDOW_MS = 300000;
    private static final long WATCH_TICK_MS = 5000;
    private static PlaybackService instance;
    private long carVisibleSince;
    private PowerManager.WakeLock cpuLock;
    private long lastRelaunch;
    private Boolean lastWatchdogOn;
    private int relaunchFailed;
    private final jc vietmap = new jc();
    private final Handler watch = new Handler(Looper.getMainLooper());
    private final Runnable watchdog = new t7(this, 2);

    private Notification.Action action(int i, String str, String str2) {
        return new Notification.Action.Builder(Icon.createWithResource(this, i), str, PendingIntent.getService(this, str2.hashCode(), new Intent(this, (Class<?>) PlaybackService.class).setAction(str2), 201326592)).build();
    }

    private Notification buildNotification() {
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), 67108864);
        boolean z = z6.b;
        String strM = z6.m();
        if (strM == null || strM.isEmpty()) {
            strM = getString(R.string.app_name);
        }
        w6 w6VarL = z6.l();
        String str = w6VarL == null ? "" : w6VarL.n;
        if (str.isEmpty()) {
            str = "Đang phát trên màn hình xe";
        }
        Notification.Builder contentText = new Notification.Builder(this, CHANNEL_ID).setContentTitle(strM).setContentText(str);
        int i = android.R.drawable.ic_media_play;
        Notification.Builder builderAddAction = contentText.setSmallIcon(android.R.drawable.ic_media_play).setContentIntent(activity).setOngoing(true).setVisibility(1).addAction(action(android.R.drawable.ic_media_previous, "Trước", ACTION_PREV));
        if (z) {
            i = android.R.drawable.ic_media_pause;
        }
        Notification.Builder builderAddAction2 = builderAddAction.addAction(action(i, z ? "Dừng" : "Phát", ACTION_PLAY_PAUSE)).addAction(action(android.R.drawable.ic_media_next, "Tiếp", ACTION_NEXT));
        Notification.MediaStyle showActionsInCompactView = new Notification.MediaStyle().setShowActionsInCompactView(0, 1, 2);
        ControllerService controllerService = z6.a;
        MediaSession.Token token = null;
        if (controllerService != null) {
            MediaSessionCompat.Token sessionToken = controllerService.getSessionToken();
            Object token2 = sessionToken == null ? null : sessionToken.getToken();
            if (token2 instanceof MediaSession.Token) {
                token = (MediaSession.Token) token2;
            }
        }
        if (token != null) {
            showActionsInCompactView.setMediaSession(token);
        }
        builderAddAction2.setStyle(showActionsInCompactView);
        return builderAddAction2.build();
    }

    private void createChannel() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager == null || notificationManager.getNotificationChannel(CHANNEL_ID) != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Đang phát", 2);
        notificationChannel.setShowBadge(false);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private void handle(String str) {
        y6 y6VarN = z6.n();
        if (y6VarN == null) {
            return;
        }
        if (ACTION_NEXT.equals(str)) {
            ((e) y6VarN).l();
        } else if (ACTION_PREV.equals(str)) {
            ((e) y6VarN).w();
        } else if (ACTION_PLAY_PAUSE.equals(str)) {
            if (z6.b) {
                ((e) y6VarN).r();
            } else {
                ((e) y6VarN).t();
            }
        }
        refresh();
    }

    private void holdCpu() {
        try {
            PowerManager powerManager = (PowerManager) getSystemService(PowerManager.class);
            if (powerManager == null) {
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "CNMedia:phat");
            this.cpuLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.cpuLock.acquire();
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    private void keepController() {
        try {
            startService(new Intent(this, (Class<?>) ControllerService.class));
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    public static void refresh() {
        PlaybackService playbackService = instance;
        if (playbackService == null) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) playbackService.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.notify(1, playbackService.buildNotification());
            }
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    private void releaseCpu() {
        try {
            PowerManager.WakeLock wakeLock = this.cpuLock;
            if (wakeLock != null && wakeLock.isHeld()) {
                this.cpuLock.release();
            }
        } catch (Throwable unused) {
        }
        this.cpuLock = null;
    }

    public static void start(Context context) {
        context.startForegroundService(new Intent(context, (Class<?>) PlaybackService.class));
    }

    public static void stop(Context context) {
        context.stopService(new Intent(context, (Class<?>) PlaybackService.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void watchdogTick() {
        boolean z = getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("vietmapWatchdog"), false);
        Boolean bool = this.lastWatchdogOn;
        if (bool == null || bool.booleanValue() != z) {
            this.lastWatchdogOn = Boolean.valueOf(z);
        }
        if (!z) {
            this.relaunchFailed = 0;
            return;
        }
        if (!z6.a()) {
            this.carVisibleSince = 0L;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = z6.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((w6) it.next()).c) {
                if (this.carVisibleSince == 0) {
                    this.carVisibleSince = jCurrentTimeMillis;
                }
            }
        }
        if (this.carVisibleSince == 0) {
            return;
        }
        long j = w7.e;
        long j2 = this.carVisibleSince;
        boolean z2 = j < j2;
        if (z2) {
            if (jCurrentTimeMillis - j2 < COLD_START_MS) {
                return;
            }
        } else if (jCurrentTimeMillis - w7.e <= DEAD_MS) {
            this.relaunchFailed = 0;
            return;
        }
        if (this.relaunchFailed > 0 && jCurrentTimeMillis - this.lastRelaunch > RETRY_WINDOW_MS) {
            this.relaunchFailed = 0;
        }
        int i = this.relaunchFailed;
        if (i >= 3 || jCurrentTimeMillis - this.lastRelaunch <= COOLDOWN_MS) {
            return;
        }
        this.lastRelaunch = jCurrentTimeMillis;
        this.relaunchFailed = i + 1;
        try {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(w7.i(this, xc.g(this, "vietmapSource", "widget")));
            if (launchIntentForPackage == null) {
                this.relaunchFailed = 3;
                return;
            }
            launchIntentForPackage.addFlags(268435456);
            startActivity(launchIntentForPackage);
            if (!z2) {
                int i2 = w7.a;
            }
            String str = w7.k(this)[2];
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        createChannel();
        instance = this;
        startForeground(1, buildNotification());
        keepController();
        holdCpu();
        id.b(this);
        if (!w7.k) {
            this.vietmap.a(this);
        }
        this.watch.postDelayed(this.watchdog, WATCH_TICK_MS);
    }

    @Override // android.app.Service
    public void onDestroy() {
        instance = null;
        this.watch.removeCallbacks(this.watchdog);
        jc jcVar = this.vietmap;
        if (jcVar.a) {
            try {
                unregisterReceiver(jcVar);
            } catch (Exception unused) {
            }
            jcVar.a = false;
            jc.d.decrementAndGet();
        }
        releaseCpu();
        try {
            stopService(new Intent(this, (Class<?>) ControllerService.class));
        } catch (Throwable unused2) {
        }
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            startForeground(1, buildNotification());
        } catch (Throwable th) {
            String.valueOf(th);
        }
        String action = intent == null ? null : intent.getAction();
        if (action == null) {
            return 2;
        }
        handle(action);
        return 2;
    }
}
