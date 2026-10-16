package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rcx {
    private final java.util.Map b = new java.util.HashMap();
    private final java.util.Map c = new java.util.HashMap();
    public boolean a = true;
    private boolean d = false;

    public final com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography a() {
        if (!this.a) {
            defpackage.ysr.bk(!this.d, "Can't cast insets after animations for batched insets");
        }
        return new com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography(this.b, this.c, this.a, this.d);
    }

    public final void b(com.google.android.gms.car.display.CarRegionId carRegionId, int i) {
        this.b.put(carRegionId, java.lang.Integer.valueOf(i));
    }

    public final void c(com.google.android.gms.car.display.CarRegionId carRegionId, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        this.c.put(carRegionId, projectionWindowAnimationParams);
    }

    public final void d() {
        this.d = true;
    }

    public final void e(java.util.Map map) {
        java.util.Map map2 = this.b;
        map2.clear();
        map2.putAll(map);
    }

    public final void f(java.util.Map map) {
        java.util.Map map2 = this.c;
        map2.clear();
        map2.putAll(map);
    }
}
