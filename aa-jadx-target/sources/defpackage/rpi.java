package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rpi {
    public rpr a;
    public rpr b;
    public rpr c;
    public rpr d;
    public int e;
    private boolean f;

    private final boolean e(int i) {
        return (this.e & i) != 0;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private static void f(android.view.View view) {
        if (view.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
        }
    }

    public final void a(android.view.View view) {
        if (!(view instanceof android.widget.FrameLayout)) {
            throw new java.lang.IllegalArgumentException("addTrampolines must be invoked on a ViewGroup");
        }
        if (this.a != null || this.b != null || this.c != null || this.d != null) {
            throw new java.lang.IllegalStateException("Call to addTrampolines when trampolines already exist");
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        rpr rprVar = new rpr(frameLayout.getContext());
        rprVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(1, -1, 3));
        frameLayout.addView(rprVar);
        rpr rprVar2 = new rpr(frameLayout.getContext());
        rprVar2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, 1, 48));
        frameLayout.addView(rprVar2);
        rpr rprVar3 = new rpr(frameLayout.getContext());
        rprVar3.setLayoutParams(new android.widget.FrameLayout.LayoutParams(1, -1, 5));
        frameLayout.addView(rprVar3);
        rpr rprVar4 = new rpr(frameLayout.getContext());
        rprVar4.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, 1, 80));
        frameLayout.addView(rprVar4);
        this.a = rprVar;
        this.b = rprVar2;
        this.c = rprVar3;
        this.d = rprVar4;
        d();
    }

    public final void b() {
        rpr rprVar = this.a;
        if (rprVar != null) {
            f(rprVar);
            this.a = null;
        }
        rpr rprVar2 = this.b;
        if (rprVar2 != null) {
            f(rprVar2);
            this.b = null;
        }
        rpr rprVar3 = this.c;
        if (rprVar3 != null) {
            f(rprVar3);
            this.c = null;
        }
        rpr rprVar4 = this.d;
        if (rprVar4 != null) {
            f(rprVar4);
            this.d = null;
        }
    }

    public final void c(boolean z) {
        this.f = z;
        if (this.a != null && this.b != null && this.c != null && this.d != null) {
            d();
        } else if (defpackage.omv.c("CAR.PROJECTION", 3)) {
            defpackage.rrx.a("CAR.PROJECTION", null, "Call to setTrampolinesActive prior to addTrampolines");
        }
    }

    public final void d() {
        this.a.setFocusable(this.f && e(1));
        this.b.setFocusable(this.f && e(2));
        this.c.setFocusable(this.f && e(4));
        this.d.setFocusable(this.f && e(8));
    }
}
