package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ede {
    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = android.view.WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = android.view.WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = android.view.WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = android.view.WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = android.view.WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = android.view.WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = android.view.WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    iStatusBars = android.view.WindowInsets.Type.systemOverlays();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static defpackage.ewy b(android.window.BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new defpackage.ewy(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, android.os.Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
