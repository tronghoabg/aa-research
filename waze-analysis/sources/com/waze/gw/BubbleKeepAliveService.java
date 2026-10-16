package com.waze.gw;

import android.R;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import androidx.work.WorkRequest;

/* loaded from: classes10.dex */
public final class BubbleKeepAliveService extends Service implements LocationListener {
    private static final String CHANNEL_ID = "wazemod_bubble_active";
    private static final long NATIVE_STALE_MS = 15000;
    private static final int NOTIFICATION_ID = 4675394;
    private static final String PREFS = "waze_hud_gw";
    private static final String TAG = "WazeGW-KeepAlive";
    private static final long WATCHDOG_INTERVAL_MS = 5000;
    private boolean fallbackLocationActive;
    private long lastFallbackLogMs;
    private LocationManager locationManager;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable locationWatchdog = new Runnable() { // from class: com.waze.gw.BubbleKeepAliveService.1
        @Override // java.lang.Runnable
        public void run() {
            try {
            } finally {
                try {
                } finally {
                }
            }
            if (!BubbleKeepAliveService.requested(BubbleKeepAliveService.this)) {
                Log.w(BubbleKeepAliveService.TAG, "Location watchdog request revoked; stopping service");
                BubbleKeepAliveService.this.stopFallbackLocation();
                BubbleKeepAliveService.this.stopSelf();
            } else {
                boolean zIsAppActivityForeground = BubbleKeepAliveService.this.isAppActivityForeground();
                if (!BubbleKeepAliveService.this.fallbackLocationActive && (!zIsAppActivityForeground || Gateway.wazeLocationAgeMs() >= 15000)) {
                    BubbleKeepAliveService.this.startFallbackLocation();
                }
            }
        }
    };

    static void sync(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) BubbleKeepAliveService.class);
        try {
            if (requested(applicationContext)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    applicationContext.startForegroundService(intent);
                } else {
                    applicationContext.startService(intent);
                }
            } else {
                applicationContext.stopService(intent);
            }
        } catch (Throwable th) {
            Log.w(TAG, "Unable to synchronize bubble keep-alive service", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean requested(Context context) {
        if (Gateway.isExplicitShutdownRequested()) {
            return false;
        }
        boolean zTrustedBuild = Gateway.trustedBuild(context);
        boolean z = context.getSharedPreferences(PREFS, 0).getBoolean("bubble", false);
        boolean z2 = Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context);
        if (!zTrustedBuild || !z || !z2) {
            Log.w(TAG, "requested()=false trusted=" + zTrustedBuild + " enabled=" + z + " overlay=" + z2);
        }
        return zTrustedBuild && z && z2;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        createChannel();
        this.locationManager = (LocationManager) getSystemService("location");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (!requested(this)) {
            stopForeground(true);
            stopSelf();
            return 2;
        }
        try {
            startForeground(NOTIFICATION_ID, notification());
            Log.i(TAG, "Bubble keep-alive active");
            this.handler.removeCallbacks(this.locationWatchdog);
            this.handler.postDelayed(this.locationWatchdog, 5000L);
            return 1;
        } catch (Throwable th) {
            Log.e(TAG, "Unable to enter foreground", th);
            stopSelf();
            return 2;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.handler.removeCallbacks(this.locationWatchdog);
        stopFallbackLocation();
        Log.i(TAG, "Bubble keep-alive stopped");
        super.onDestroy();
    }

    private boolean hasLocationPermission() {
        return Build.VERSION.SDK_INT < 23 || checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAppActivityForeground() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFallbackLocation() {
        boolean z;
        if (this.fallbackLocationActive || this.locationManager == null || !hasLocationPermission()) {
            return;
        }
        try {
            boolean z2 = true;
            if (this.locationManager.getProvider("gps") == null) {
                z = false;
            } else {
                this.locationManager.requestLocationUpdates("gps", 1000L, 0.0f, this, Looper.getMainLooper());
                z = true;
            }
            if (this.locationManager.getProvider("network") == null) {
                z2 = z;
            } else {
                this.locationManager.requestLocationUpdates("network", C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, 0.0f, this, Looper.getMainLooper());
            }
            this.fallbackLocationActive = z2;
            if (z2) {
                Log.w(TAG, "Waze GPS stale; fallback location listener started");
            }
        } catch (Throwable th) {
            try {
                this.locationManager.removeUpdates(this);
            } catch (Throwable th2) {
            }
            this.fallbackLocationActive = false;
            Log.w(TAG, "Unable to start fallback location", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopFallbackLocation() {
        if (!this.fallbackLocationActive || this.locationManager == null) {
            return;
        }
        try {
            this.locationManager.removeUpdates(this);
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location == null || !this.fallbackLocationActive) {
            return;
        }
        boolean zPublish = WazeLocationBridge.publish(location);
        Gateway.onKeepAliveLocation(location);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.lastFallbackLogMs >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            this.lastFallbackLogMs = jElapsedRealtime;
            Log.i(TAG, "Fallback GPS fix provider=" + location.getProvider() + " accuracy=" + (location.hasAccuracy() ? location.getAccuracy() : -1.0f) + " forwarded=" + zPublish);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        Log.i(TAG, "Waze task removed; requesting explicit shutdown");
        Gateway.onTaskRemoved();
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void createChannel() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) getSystemService("notification")) != null) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Bong bóng Waze Mod", 2);
            notificationChannel.setDescription("Giữ dữ liệu tốc độ và cảnh báo khi Waze chạy nền");
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private Notification notification() {
        PendingIntent activity;
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(805306368);
            activity = PendingIntent.getActivity(this, 18263, launchIntentForPackage, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        }
        int identifier = getResources().getIdentifier("notification", "drawable", getPackageName());
        if (identifier == 0) {
            identifier = getResources().getIdentifier("notification", "drawable", "com.waze");
        }
        if (identifier == 0) {
            identifier = R.drawable.ic_menu_mylocation;
        }
        Notification.Builder builder = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this, CHANNEL_ID) : new Notification.Builder(this);
        builder.setSmallIcon(identifier).setContentTitle("Dịch vụ định vị Waze Mod đang hoạt động").setContentText("Waze Mod đang hoạt động dưới nền.").setCategory(NotificationCompat.CATEGORY_SERVICE).setOngoing(true).setOnlyAlertOnce(true).setShowWhen(false);
        if (activity != null) {
            builder.setContentIntent(activity);
        }
        if (Build.VERSION.SDK_INT < 26) {
            builder.setPriority(-1);
        }
        return builder.build();
    }
}
