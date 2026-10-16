package defpackage;

import android.companion.virtual.ActivityPolicyExemption;
import android.companion.virtual.VirtualDeviceManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.display.VirtualDisplay;
import android.hardware.display.VirtualDisplayConfig;
import android.hardware.input.VirtualDpad;
import android.hardware.input.VirtualDpadConfig;
import android.hardware.input.VirtualTouchscreen;
import android.hardware.input.VirtualTouchscreenConfig;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.Display;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iph {
    public final VirtualDisplay a;
    public VirtualDpad b;
    public final jmi c;
    private final boolean d;
    private final String e;
    private final boolean f;
    private final Surface g;
    private final aezr h;
    private VirtualTouchscreen i;

    static {
        yph.c("GH.CarVirtualDisplay");
    }

    public iph(int i, int i2, int i3, int i4, jmi jmiVar, boolean z, String str, boolean z2, Surface surface) {
        VirtualTouchscreen virtualTouchscreen;
        int i5;
        VirtualDisplay virtualDisplayCreateVirtualDisplay;
        VirtualTouchscreen virtualTouchscreenCreateVirtualDpad;
        str.getClass();
        this.c = jmiVar;
        this.d = z;
        this.e = str;
        this.f = z2;
        this.g = surface;
        int i6 = Build.VERSION.SDK_INT >= 34 ? i4 | 1024 : i4;
        int i7 = Build.VERSION.SDK_INT >= 35 ? i6 | 8 : i6;
        skn sknVar = jmiVar.e;
        synchronized (sknVar.a) {
            Object obj = sknVar.b;
            if (Build.VERSION.SDK_INT >= 34) {
                VirtualDisplayConfig.Builder flags = new VirtualDisplayConfig.Builder(str, i, i2, i3).setFlags(i7);
                flags.getClass();
                if (surface != null) {
                    flags.setSurface(surface);
                }
                if (Build.VERSION.SDK_INT >= 36) {
                    flags.setIgnoreActivitySizeRestrictions(true);
                }
                VirtualDisplayConfig virtualDisplayConfigBuild = flags.build();
                virtualDisplayConfigBuild.getClass();
                virtualDisplayCreateVirtualDisplay = ((VirtualDeviceManager.VirtualDevice) obj).createVirtualDisplay(virtualDisplayConfigBuild, zfq.a, (VirtualDisplay.Callback) null);
                i5 = 1;
                virtualTouchscreen = null;
            } else {
                virtualTouchscreen = null;
                i5 = 1;
                virtualDisplayCreateVirtualDisplay = ((VirtualDeviceManager.VirtualDevice) obj).createVirtualDisplay(i, i2, i3, surface, i7, zfq.a, (VirtualDisplay.Callback) null);
            }
        }
        if (virtualDisplayCreateVirtualDisplay == null) {
            throw new IllegalStateException("Received null display from VirtualDevice!");
        }
        Context context = jmiVar.b;
        int i8 = Build.VERSION.SDK_INT;
        int i9 = Settings.Secure.getInt(context.getContentResolver(), "doze_always_on", 0);
        if (i8 == 33 && i9 == i5) {
            jmiVar.d.l().u("Acquiring wake lock on phone display for AOD workaround");
            Object systemService = context.getSystemService("power");
            systemService.getClass();
            ((PowerManager) systemService).newWakeLock(268435482, "VirtualDevice::createVirtualDisplay").acquire(aisq.e(jmiVar.c));
        }
        this.a = virtualDisplayCreateVirtualDisplay;
        this.h = new aezy(new deh(this, 11));
        this.i = (Build.VERSION.SDK_INT < 34 || !z) ? virtualTouchscreen : m(i, i2);
        if (Build.VERSION.SDK_INT < 34 || !z2) {
            virtualTouchscreenCreateVirtualDpad = virtualTouchscreen;
        } else {
            skn sknVar2 = jmiVar.e;
            synchronized (sknVar2.a) {
                Object obj2 = sknVar2.b;
                virtualDisplayCreateVirtualDisplay.getDisplay().getDisplayId();
                virtualTouchscreenCreateVirtualDpad = ((VirtualDeviceManager.VirtualDevice) obj2).createVirtualDpad(new VirtualDpadConfig.Builder().setVendorId(6880).setProductId(0).setInputDeviceName("AA-DPAD:" + virtualDisplayCreateVirtualDisplay.getDisplay().getDisplayId()).setAssociatedDisplayId(virtualDisplayCreateVirtualDisplay.getDisplay().getDisplayId()).build());
            }
            if (virtualTouchscreenCreateVirtualDpad == null) {
                throw new IllegalStateException("Received null VirtualDpad from VirtualDevice!");
            }
        }
        this.b = virtualTouchscreenCreateVirtualDpad;
    }

    private final VirtualTouchscreen m(int i, int i2) {
        VirtualTouchscreen virtualTouchscreenCreateVirtualTouchscreen;
        VirtualDisplay virtualDisplay = this.a;
        skn sknVar = this.c.e;
        synchronized (sknVar.a) {
            Object obj = sknVar.b;
            virtualDisplay.getDisplay().getDisplayId();
            virtualTouchscreenCreateVirtualTouchscreen = ((VirtualDeviceManager.VirtualDevice) obj).createVirtualTouchscreen(new VirtualTouchscreenConfig.Builder(i, i2).setVendorId(6880).setProductId(0).setInputDeviceName("AA-TOUCHSCREEN:" + virtualDisplay.getDisplay().getDisplayId()).setAssociatedDisplayId(virtualDisplay.getDisplay().getDisplayId()).build());
        }
        if (virtualTouchscreenCreateVirtualTouchscreen != null) {
            return virtualTouchscreenCreateVirtualTouchscreen;
        }
        throw new IllegalStateException("Received null VirtualTouchscreen from VirtualDevice!");
    }

    public final int a() {
        return ((Number) this.h.a()).intValue();
    }

    public final VirtualTouchscreen b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.i;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final Display c() {
        Display display = this.a.getDisplay();
        display.getClass();
        return display;
    }

    public final void d(VirtualDeviceManager.ActivityListener activityListener, Executor executor) {
        activityListener.getClass();
        jmi jmiVar = this.c;
        jmiVar.d.l().y("Adding listener %s", activityListener);
        skn sknVar = jmiVar.e;
        synchronized (sknVar.a) {
            ((VirtualDeviceManager.VirtualDevice) sknVar.b).addActivityListener(executor, activityListener);
        }
    }

    public final void e(ComponentName componentName) {
        int i = Build.VERSION.SDK_INT;
        jmi jmiVar = this.c;
        if (i < 36) {
            skn sknVar = jmiVar.e;
            synchronized (sknVar.a) {
                ((VirtualDeviceManager.VirtualDevice) sknVar.b).addActivityPolicyExemption(componentName);
            }
            return;
        }
        ActivityPolicyExemption activityPolicyExemptionBuild = new ActivityPolicyExemption.Builder().setComponentName(componentName).setDisplayId(a()).build();
        activityPolicyExemptionBuild.getClass();
        skn sknVar2 = jmiVar.e;
        synchronized (sknVar2.a) {
            ((VirtualDeviceManager.VirtualDevice) sknVar2.b).addActivityPolicyExemption(activityPolicyExemptionBuild);
        }
    }

    public final void f(IntentFilter intentFilter, Executor executor, VirtualDeviceManager.IntentInterceptorCallback intentInterceptorCallback) {
        intentFilter.getClass();
        jmi jmiVar = this.c;
        jmiVar.d.l().y("Registering intent interceptor %s", intentInterceptorCallback);
        skn sknVar = jmiVar.e;
        synchronized (sknVar.a) {
            ((VirtualDeviceManager.VirtualDevice) sknVar.b).registerIntentInterceptor(intentFilter, executor, intentInterceptorCallback);
        }
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 34) {
            VirtualTouchscreen virtualTouchscreen = this.i;
            if (virtualTouchscreen != null) {
                virtualTouchscreen.close();
            }
            this.i = null;
            VirtualDpad virtualDpad = this.b;
            if (virtualDpad != null) {
                virtualDpad.close();
            }
            this.b = null;
        }
        this.a.release();
        this.c.close();
    }

    public final void h(VirtualDeviceManager.ActivityListener activityListener) {
        activityListener.getClass();
        jmi jmiVar = this.c;
        jmiVar.d.l().y("Removing listener %s", activityListener);
        skn sknVar = jmiVar.e;
        synchronized (sknVar.a) {
            ((VirtualDeviceManager.VirtualDevice) sknVar.b).removeActivityListener(activityListener);
        }
    }

    public final void i(int i, int i2, int i3) {
        VirtualDisplay virtualDisplay = this.a;
        virtualDisplay.getDisplay().getDisplayId();
        virtualDisplay.resize(i, i2, i3);
        if (Build.VERSION.SDK_INT < 34 || !this.d) {
            if (this.i != null) {
                throw new IllegalStateException("Check failed.");
            }
        } else {
            VirtualTouchscreen virtualTouchscreen = this.i;
            if (virtualTouchscreen != null) {
                virtualTouchscreen.close();
            }
            this.i = m(i, i2);
        }
    }

    public final void j(Surface surface) {
        this.a.setSurface(surface);
    }

    public final void k(VirtualDeviceManager.IntentInterceptorCallback intentInterceptorCallback) {
        intentInterceptorCallback.getClass();
        jmi jmiVar = this.c;
        jmiVar.d.l().y("Unregistering intent interceptor %s", intentInterceptorCallback);
        skn sknVar = jmiVar.e;
        synchronized (sknVar.a) {
            ((VirtualDeviceManager.VirtualDevice) sknVar.b).unregisterIntentInterceptor(intentInterceptorCallback);
        }
    }

    public final void l(int i) {
        int iA = a();
        skn sknVar = this.c.e;
        synchronized (sknVar.a) {
            ((VirtualDeviceManager.VirtualDevice) sknVar.b).setDevicePolicy(3, i, iA);
        }
    }

    public final String toString() {
        return "CarVirtualDisplay VirtualDevice: " + this.c + " VirtualDisplay: " + this.a + " HasTouchscreen: " + this.d + ", usesDpad: " + this.f;
    }
}
