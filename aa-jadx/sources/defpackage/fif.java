package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fif implements android.view.animation.Interpolator {
    private final /* synthetic */ int a;

    public fif(int i) {
        this.a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.a;
        if (i != 0 && i != 1) {
            return 1.0f;
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
