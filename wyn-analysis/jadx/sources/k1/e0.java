package k1;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class e0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f38816e;

    public e0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f38816e = windowInsetsAnimation;
    }

    @Override // k1.f0
    public final long a() {
        return this.f38816e.getDurationMillis();
    }

    @Override // k1.f0
    public final float b() {
        return this.f38816e.getInterpolatedFraction();
    }

    @Override // k1.f0
    public final int c() {
        return this.f38816e.getTypeMask();
    }

    @Override // k1.f0
    public final void d(float f10) {
        this.f38816e.setFraction(f10);
    }
}
