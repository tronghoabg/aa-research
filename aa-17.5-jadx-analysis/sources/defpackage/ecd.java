package defpackage;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class ecd extends ece {
    private final WindowInsetsAnimation a;

    public ecd(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.ece
    public final float g() {
        return this.a.getAlpha();
    }

    @Override // defpackage.ece
    public final float h() {
        return this.a.getInterpolatedFraction();
    }

    @Override // defpackage.ece
    public final int i() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.ece
    public final long j() {
        return this.a.getDurationMillis();
    }

    @Override // defpackage.ece
    public final void k(float f) {
        this.a.setFraction(f);
    }
}
