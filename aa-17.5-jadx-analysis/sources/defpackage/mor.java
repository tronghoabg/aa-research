package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
final class mor implements DisplayManager.DisplayListener {
    final /* synthetic */ mos a;

    public mor(mos mosVar) {
        this.a = mosVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        Display display = this.a.b.getDisplay(i);
        if (display != null) {
            display.getName();
            display.getFlags();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        int state;
        mos mosVar = this.a;
        Display display = mosVar.b.getDisplay(i);
        if (display != null) {
            display.getName();
            display.getFlags();
            if (i != mosVar.c.getDisplayId() || (state = mosVar.c.getState()) == mosVar.d) {
                return;
            }
            mosVar.a(state);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        yph yphVar = mos.a;
    }
}
