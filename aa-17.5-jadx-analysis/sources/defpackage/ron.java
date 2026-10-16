package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class ron {
    public row a;
    public row b;
    public row c;
    public row d;
    public int e;
    private boolean f;

    private final boolean e(int i) {
        return (this.e & i) != 0;
    }

    @ResultIgnorabilityUnspecified
    private static void f(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public final void a(View view) {
        if (!(view instanceof FrameLayout)) {
            throw new IllegalArgumentException("addTrampolines must be invoked on a ViewGroup");
        }
        if (this.a != null || this.b != null || this.c != null || this.d != null) {
            throw new IllegalStateException("Call to addTrampolines when trampolines already exist");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        row rowVar = new row(frameLayout.getContext());
        rowVar.setLayoutParams(new FrameLayout.LayoutParams(1, -1, 3));
        frameLayout.addView(rowVar);
        row rowVar2 = new row(frameLayout.getContext());
        rowVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, 1, 48));
        frameLayout.addView(rowVar2);
        row rowVar3 = new row(frameLayout.getContext());
        rowVar3.setLayoutParams(new FrameLayout.LayoutParams(1, -1, 5));
        frameLayout.addView(rowVar3);
        row rowVar4 = new row(frameLayout.getContext());
        rowVar4.setLayoutParams(new FrameLayout.LayoutParams(-1, 1, 80));
        frameLayout.addView(rowVar4);
        this.a = rowVar;
        this.b = rowVar2;
        this.c = rowVar3;
        this.d = rowVar4;
        d();
    }

    public final void b() {
        row rowVar = this.a;
        if (rowVar != null) {
            f(rowVar);
            this.a = null;
        }
        row rowVar2 = this.b;
        if (rowVar2 != null) {
            f(rowVar2);
            this.b = null;
        }
        row rowVar3 = this.c;
        if (rowVar3 != null) {
            f(rowVar3);
            this.c = null;
        }
        row rowVar4 = this.d;
        if (rowVar4 != null) {
            f(rowVar4);
            this.d = null;
        }
    }

    public final void c(boolean z) {
        this.f = z;
        if (this.a != null && this.b != null && this.c != null && this.d != null) {
            d();
        } else if (omc.c("CAR.PROJECTION", 3)) {
            rrd.a("CAR.PROJECTION", null, "Call to setTrampolinesActive prior to addTrampolines");
        }
    }

    public final void d() {
        this.a.setFocusable(this.f && e(1));
        this.b.setFocusable(this.f && e(2));
        this.c.setFocusable(this.f && e(4));
        this.d.setFocusable(this.f && e(8));
    }
}
