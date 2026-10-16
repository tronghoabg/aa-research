package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes2.dex */
final class rnv implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ rnw a;
    private final boolean b;
    private final View c;
    private final rbx d;

    public rnv(rnw rnwVar, boolean z, View view, rbx rbxVar) {
        this.a = rnwVar;
        this.b = z;
        this.c = view;
        this.d = rbxVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
            rnw rnwVar = this.a;
            rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s onGlobalLayout() [hasInputFocus:%b, inTouchMode:%b]", rnwVar.t, Boolean.valueOf(this.b), Boolean.valueOf(rnwVar.x));
        }
        rnw rnwVar2 = this.a;
        rnwVar2.k.o(new InputFocusChangedEvent(this.b, rnwVar2.x, -1, null));
        rbx rbxVar = this.d;
        if (rbxVar != null) {
            rbxVar.b(this.c);
        }
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
