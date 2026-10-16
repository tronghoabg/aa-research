package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fcw extends android.view.animation.Animation {
    final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout a;

    public fcw(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        this.a.c(f);
    }
}
