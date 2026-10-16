package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jin implements defpackage.jip {
    private final defpackage.jkr a;

    public jin(defpackage.jkr jkrVar) {
        this.a = jkrVar;
    }

    @Override // defpackage.jip
    public final defpackage.jik a(android.content.Context context, int i) {
        context.getClass();
        return new defpackage.jik(android.view.animation.AnimationUtils.loadAnimation(context, i), null, 0);
    }

    @Override // defpackage.jip
    public final defpackage.jik b(android.content.Context context, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams, int i, int i2) {
        context.getClass();
        projectionWindowAnimationParams.getClass();
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, projectionWindowAnimationParams.a);
        animationLoadAnimation.initialize(i, i2, i, i2);
        return new defpackage.jik(animationLoadAnimation, projectionWindowAnimationParams.c, projectionWindowAnimationParams.d);
    }

    @Override // defpackage.jip
    public final void c(com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        projectionWindowAnimationChoreography.getClass();
    }

    @Override // defpackage.jip
    public final void f(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("ScvhWindowAnimationController");
    }

    @Override // defpackage.jip
    public final void g(defpackage.jhi jhiVar) {
        jhiVar.getClass();
    }

    @Override // defpackage.jip
    public final void i(defpackage.jhl jhlVar, defpackage.jik jikVar, boolean z) {
        jikVar.getClass();
        x(jhlVar, jikVar, z);
    }

    @Override // defpackage.jip
    public final void j(defpackage.jhl jhlVar, defpackage.jik jikVar) {
        jikVar.getClass();
        o(jhlVar, jikVar);
    }

    @Override // defpackage.jip
    public final void k(defpackage.jhl jhlVar, defpackage.jik jikVar, boolean z) {
        x(jhlVar, jikVar, z);
    }

    @Override // defpackage.jip
    public final void l(defpackage.jhl jhlVar, defpackage.jik jikVar) {
        o(jhlVar, jikVar);
    }

    @Override // defpackage.jip
    public final void m(android.content.Context context, int i) {
        context.getClass();
    }

    @Override // defpackage.jip
    public final void o(defpackage.jhl jhlVar, defpackage.jik jikVar) {
        jhlVar.aq();
        this.a.T();
    }

    @Override // defpackage.jip
    public final boolean q(defpackage.jhl jhlVar) {
        jhlVar.getClass();
        return false;
    }

    @Override // defpackage.jip
    public final boolean r(defpackage.jhl jhlVar) {
        jhlVar.getClass();
        return false;
    }

    @Override // defpackage.jip
    public final boolean s(defpackage.jhl jhlVar) {
        jhlVar.getClass();
        return false;
    }

    @Override // defpackage.jip
    public final boolean t(defpackage.jhl jhlVar) {
        return false;
    }

    @Override // defpackage.jip
    public final boolean u() {
        return false;
    }

    @Override // defpackage.jip
    public final boolean v(defpackage.jhl jhlVar) {
        return true;
    }

    @Override // defpackage.jip
    public final boolean w(defpackage.jhl jhlVar) {
        jhlVar.getClass();
        return true;
    }

    @Override // defpackage.jip
    public final boolean x(defpackage.jhl jhlVar, defpackage.jik jikVar, boolean z) {
        if (z) {
            ((defpackage.inh) this.a).u(jhlVar);
        }
        jhlVar.M();
        return false;
    }

    @Override // defpackage.jip
    public final void h() {
    }

    @Override // defpackage.jip
    public final void p() {
    }

    @Override // defpackage.jip
    public final void d(defpackage.jhl jhlVar) {
    }

    @Override // defpackage.jip
    public final void e(defpackage.jhl jhlVar) {
    }

    @Override // defpackage.jip
    public final void n(int i, int i2) {
    }
}
