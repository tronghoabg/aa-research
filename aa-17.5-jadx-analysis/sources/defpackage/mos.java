package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import j$.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mos implements lhg {
    public static final yph a = yph.c("GH.DisplayStateMonitor");
    public DisplayManager b;
    public Display c;
    public int d;
    private xya e;
    private final Map f = new HashMap();
    private final DisplayManager.DisplayListener g = new mor(this);

    public final void a(int i) {
        Long lValueOf = Long.valueOf(this.e.a(TimeUnit.MILLISECONDS));
        Map.EL.merge(this.f, Integer.valueOf(this.d), lValueOf, new moq(0));
        this.e.d();
        this.e.e();
        this.d = i;
    }

    @Override // defpackage.lhg
    public final void c() {
        DisplayManager displayManager = (DisplayManager) mki.a.c.getSystemService("display");
        this.b = displayManager;
        if (displayManager == null) {
            ((ype) ((ype) a.h()).ai((char) 5130)).u("DisplayManager not found");
            return;
        }
        Display display = displayManager.getDisplay(0);
        this.c = display;
        if (display == null) {
            ((ype) ((ype) a.h()).ai((char) 5129)).u("Default display not found");
            return;
        }
        this.d = display.getState();
        this.e = xya.b((xyi) oit.a().b);
        this.b.registerDisplayListener(this.g, new Handler(Looper.getMainLooper()));
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.b != null) {
            a(this.c.getState());
            Map.EL.forEach(this.f, new mac(2));
            this.b.unregisterDisplayListener(this.g);
        }
    }
}
