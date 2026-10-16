package defpackage;

import android.os.Build;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class rap implements ViewTreeObserver.OnTouchModeChangeListener {
    final /* synthetic */ raw a;

    public rap(raw rawVar) {
        this.a = rawVar;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        if (rrd.e("CAR.PROJECTION.PRES", 3)) {
            raw rawVar = this.a;
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchModeChanged(isInTouchMode:%b) [attachedToWindow:%b, hasInputFocus:%b, inTouchMode:%b]", rawVar.m, Boolean.valueOf(z), Boolean.valueOf(rawVar.n), Boolean.valueOf(rawVar.o), Boolean.valueOf(rawVar.p));
        }
        raw rawVar2 = this.a;
        if (rawVar2.n) {
            boolean z2 = rawVar2.p;
            if (z != z2) {
                rawVar2.j(rawVar2.o, z2);
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                rawVar2.m();
            }
            if (rawVar2.z) {
                rawVar2.l(rawVar2.f().getDecorView());
            }
        }
    }
}
