package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nbz extends android.graphics.drawable.Animatable2.AnimationCallback {
    final /* synthetic */ com.google.android.apps.auto.components.system.dashboard.media.switcher.PageIndicator a;

    public nbz(com.google.android.apps.auto.components.system.dashboard.media.switcher.PageIndicator pageIndicator) {
        this.a = pageIndicator;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        drawable.getClass();
        super.onAnimationEnd(drawable);
        if (drawable instanceof android.graphics.drawable.AnimatedVectorDrawable) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).unregisterAnimationCallback(this);
        }
        com.google.android.apps.auto.components.system.dashboard.media.switcher.PageIndicator pageIndicator = this.a;
        pageIndicator.f = false;
        java.util.ArrayList arrayList = pageIndicator.b;
        if (arrayList.size() != 0) {
            java.lang.Object objRemove = arrayList.remove(0);
            objRemove.getClass();
            pageIndicator.c(((java.lang.Number) objRemove).intValue());
        }
    }
}
