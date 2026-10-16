package Yc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* loaded from: classes5.dex */
public final class i extends o {

    /* renamed from: d, reason: collision with root package name */
    public final Context f16772d;

    /* renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f16773e;

    /* renamed from: f, reason: collision with root package name */
    public final PowerManager.WakeLock f16774f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16775g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16776h;

    public i(Context context, ComponentName componentName) {
        super(componentName);
        this.f16772d = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f16773e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f16774f = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // Yc.o
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f16787a);
        if (this.f16772d.startService(intent2) != null) {
            synchronized (this) {
                try {
                    if (!this.f16775g) {
                        this.f16775g = true;
                        if (!this.f16776h) {
                            this.f16773e.acquire(60000L);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // Yc.o
    public final void c() {
        synchronized (this) {
            try {
                if (this.f16776h) {
                    if (this.f16775g) {
                        this.f16773e.acquire(60000L);
                    }
                    this.f16776h = false;
                    this.f16774f.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Yc.o
    public final void d() {
        synchronized (this) {
            try {
                if (!this.f16776h) {
                    this.f16776h = true;
                    this.f16774f.acquire(TTAdConstant.AD_MAX_EVENT_TIME);
                    this.f16773e.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Yc.o
    public final void e() {
        synchronized (this) {
            this.f16775g = false;
        }
    }
}
