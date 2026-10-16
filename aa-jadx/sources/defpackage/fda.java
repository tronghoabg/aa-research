package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fda extends android.view.animation.Animation {
    final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout a;

    public fda(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.j;
        int iAbs = swipeRefreshLayout.g - java.lang.Math.abs(swipeRefreshLayout.f);
        int i = swipeRefreshLayout.e;
        swipeRefreshLayout.j((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.d.getTop());
        swipeRefreshLayout.h.c(1.0f - f);
    }
}
