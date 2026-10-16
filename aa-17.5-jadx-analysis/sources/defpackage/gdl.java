package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gdl implements hem {
    public final geu a;
    public long c;
    public Runnable e;
    public final eqm b = new eqm(null);
    public final Handler d = new Handler(Looper.getMainLooper());

    public gdl(geu geuVar) {
        this.a = geuVar;
    }

    public final float a() {
        Alert alertB = b();
        if (alertB == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, (System.currentTimeMillis() - this.c) / alertB.getDurationMillis()));
    }

    public final Alert b() {
        return (Alert) this.b.e();
    }

    public final void c() {
        this.d.removeCallbacksAndMessages(null);
        this.c = 0L;
        this.b.j(null);
    }

    public final void d(int i) {
        Alert alertB = b();
        if (alertB == null || alertB.getId() != i) {
            return;
        }
        e(alertB);
    }

    public final void e(Alert alert) {
        if (alert.equals(b())) {
            c();
            ta callbackDelegate = alert.getCallbackDelegate();
            if (callbackDelegate != null) {
                ((jwq) this.a).g.f(callbackDelegate);
            }
        }
    }
}
