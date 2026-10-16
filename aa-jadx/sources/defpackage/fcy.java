package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fcy extends android.view.animation.Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout c;

    public fcy(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        int i = this.b;
        int i2 = this.a;
        this.c.h.setAlpha((int) (i2 + ((i - i2) * f)));
    }
}
