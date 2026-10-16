package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
final class vuw implements vqj {
    private final Window$OnFrameMetricsAvailableListener a;
    private final ackk b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public vuw(ackk ackkVar, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
        this.a = window$OnFrameMetricsAvailableListener;
        this.b = ackkVar;
    }

    private final synchronized void k() {
        Activity activity = this.c;
        if (activity != null && this.e.add(activity.getWindow())) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.a());
            return;
        }
        ((ynz) ((ynz) vlj.a.e()).ai((char) 9830)).u("Activity is null or already being tracked");
    }

    private final synchronized void l(Activity activity) {
        if (activity != null) {
            if (this.e.remove(activity.getWindow())) {
                try {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
                    return;
                } catch (RuntimeException e) {
                    ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9832)).u("Failed to detach the frame metrics listener");
                    return;
                }
            }
        }
        ((ynz) ((ynz) vlj.a.e()).ai((char) 9831)).u("Activity is null or isn't being tracked");
    }

    @Override // defpackage.vqj
    public final void a(Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.vqj
    public final void b(Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.vqj
    public final void c(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public final synchronized void g() {
        this.d = true;
        k();
    }

    public final synchronized void j() {
        this.d = false;
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void f(int i) {
    }
}
