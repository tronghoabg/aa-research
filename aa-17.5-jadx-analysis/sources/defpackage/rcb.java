package defpackage;

import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class rcb {
    public final Display a;
    private final VirtualDisplay b;
    private Surface c;
    private final rca d;

    public rcb(DisplayManager displayManager, String str, int i, int i2, int i3, int i4, Surface surface, int i5, rca rcaVar) {
        this.c = surface;
        this.d = rcaVar;
        try {
            if (i5 != -1) {
                Display display = displayManager.getDisplay(i5);
                display.getClass();
                this.a = display;
                if (omc.c("CAR.PROJECTION", 3)) {
                    rrd.d(3, "CAR.PROJECTION", null, "Using remote virtual display %s -- %s", Integer.valueOf(i5), display);
                }
                this.b = null;
                return;
            }
            VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(str, i, i2, i3, surface, i4 | 10);
            if (virtualDisplayCreateVirtualDisplay == null) {
                throw new RuntimeException("Failed to create virtual display");
            }
            if (omc.c("CAR.PROJECTION", 3)) {
                rrd.d(3, "CAR.PROJECTION", null, "Using local virtual display %s", virtualDisplayCreateVirtualDisplay);
            }
            this.b = virtualDisplayCreateVirtualDisplay;
            this.a = virtualDisplayCreateVirtualDisplay.getDisplay();
        } catch (SecurityException e) {
            throw new RuntimeException("Failed to create virtual display", e);
        }
    }

    public final synchronized Surface a() {
        return this.c;
    }

    public final synchronized void b() {
        VirtualDisplay virtualDisplay = this.b;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
            this.d.a(this.c);
            this.c = null;
        }
    }

    public final synchronized void c(Surface surface) {
        VirtualDisplay virtualDisplay;
        if (surface != this.c && (virtualDisplay = this.b) != null) {
            if (omc.c("CAR.PROJECTION", 3)) {
                rrd.d(3, "CAR.PROJECTION", null, "surface changed %s", surface);
            }
            virtualDisplay.setSurface(surface);
            Surface surface2 = this.c;
            if (surface2 != null) {
                surface2.release();
                this.d.a(this.c);
            }
            this.c = surface;
        }
    }
}
