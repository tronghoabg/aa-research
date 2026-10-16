package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eck extends defpackage.ecl {
    private final android.view.WindowInsetsAnimation a;

    public eck(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.ecl
    public final float g() {
        return this.a.getAlpha();
    }

    @Override // defpackage.ecl
    public final float h() {
        return this.a.getInterpolatedFraction();
    }

    @Override // defpackage.ecl
    public final int i() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.ecl
    public final long j() {
        return this.a.getDurationMillis();
    }

    @Override // defpackage.ecl
    public final void k(float f) {
        this.a.setFraction(f);
    }
}
