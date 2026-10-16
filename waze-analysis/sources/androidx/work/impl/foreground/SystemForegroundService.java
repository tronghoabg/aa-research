package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    private static final String TAG = Logger.tagWithPrefix("SystemFgService");
    private static SystemForegroundService sForegroundService = null;
    SystemForegroundDispatcher mDispatcher;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static void startForeground(Service service, int i2, Notification notification, int i3) {
            service.startForeground(i2, notification, i3);
        }
    }

    /* compiled from: WazeSource */
    class Api31Impl {
        private Api31Impl() {
        }

        static void startForeground(Service service, int i2, Notification notification, int i3) {
            try {
                service.startForeground(i2, notification, i3);
            } catch (ForegroundServiceStartNotAllowedException e2) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e2);
            } catch (SecurityException e3) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e3);
            }
        }
    }

    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    private void initializeDispatcher() {
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void cancelNotification(int i2) {
        this.mNotificationManager.cancel(i2);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void notify(int i2, Notification notification) {
        this.mNotificationManager.notify(i2, notification);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.mIsShutdown) {
            Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent, i3);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i2) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.mDispatcher.onTimeout(i2, 2048);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void startForeground(int i2, int i3, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.startForeground(this, i2, notification, i3);
        } else {
            Api29Impl.startForeground(this, i2, notification, i3);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void stop(int i2) {
        this.mIsShutdown = true;
        Logger.get().debug(TAG, "Shutting down.");
        stopForeground(true);
        sForegroundService = null;
        stopSelf(i2);
    }

    public void onTimeout(int i2, int i3) {
        this.mDispatcher.onTimeout(i2, i3);
    }
}
