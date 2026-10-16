package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fhm extends android.graphics.drawable.Animatable2.AnimationCallback {
    final /* synthetic */ defpackage.fhn a;

    public fhm(defpackage.fhn fhnVar) {
        this.a = fhnVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        this.a.b(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(android.graphics.drawable.Drawable drawable) {
        this.a.c(drawable);
    }
}
