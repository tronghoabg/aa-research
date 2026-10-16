package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rcw {
    public final android.view.Display a;
    private final android.hardware.display.VirtualDisplay b;
    private android.view.Surface c;
    private final defpackage.rcv d;

    public rcw(android.hardware.display.DisplayManager displayManager, java.lang.String str, int i, int i2, int i3, int i4, android.view.Surface surface, int i5, defpackage.rcv rcvVar) {
        this.c = surface;
        this.d = rcvVar;
        try {
            if (i5 != -1) {
                android.view.Display display = displayManager.getDisplay(i5);
                display.getClass();
                this.a = display;
                if (defpackage.omv.c("CAR.PROJECTION", 3)) {
                    defpackage.rrx.d(3, "CAR.PROJECTION", null, "Using remote virtual display %s -- %s", java.lang.Integer.valueOf(i5), display);
                }
                this.b = null;
                return;
            }
            android.hardware.display.VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(str, i, i2, i3, surface, i4 | 10);
            if (virtualDisplayCreateVirtualDisplay == null) {
                throw new java.lang.RuntimeException("Failed to create virtual display");
            }
            if (defpackage.omv.c("CAR.PROJECTION", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION", null, "Using local virtual display %s", virtualDisplayCreateVirtualDisplay);
            }
            this.b = virtualDisplayCreateVirtualDisplay;
            this.a = virtualDisplayCreateVirtualDisplay.getDisplay();
        } catch (java.lang.SecurityException e) {
            throw new java.lang.RuntimeException("Failed to create virtual display", e);
        }
    }

    public final synchronized android.view.Surface a() {
        return this.c;
    }

    public final synchronized void b() {
        android.hardware.display.VirtualDisplay virtualDisplay = this.b;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        android.view.Surface surface = this.c;
        if (surface != null) {
            surface.release();
            this.d.a(this.c);
            this.c = null;
        }
    }

    public final synchronized void c(android.view.Surface surface) {
        android.hardware.display.VirtualDisplay virtualDisplay;
        if (surface != this.c && (virtualDisplay = this.b) != null) {
            if (defpackage.omv.c("CAR.PROJECTION", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION", null, "surface changed %s", surface);
            }
            virtualDisplay.setSurface(surface);
            android.view.Surface surface2 = this.c;
            if (surface2 != null) {
                surface2.release();
                this.d.a(this.c);
            }
            this.c = surface;
        }
    }
}
