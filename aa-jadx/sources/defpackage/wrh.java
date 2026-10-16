package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wrh implements android.animation.TimeInterpolator {
    private final android.animation.TimeInterpolator a;
    private final /* synthetic */ int b;

    public wrh(android.animation.TimeInterpolator timeInterpolator, int i, byte[] bArr) {
        this.b = i;
        timeInterpolator.getClass();
        this.a = timeInterpolator;
    }

    public static android.animation.TimeInterpolator a(boolean z, android.animation.TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new defpackage.wrh(timeInterpolator, 0);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.b;
        android.animation.TimeInterpolator timeInterpolator = this.a;
        return i != 0 ? timeInterpolator.getInterpolation(f) : 1.0f - timeInterpolator.getInterpolation(f);
    }

    public wrh(android.animation.TimeInterpolator timeInterpolator, int i) {
        this.b = i;
        this.a = timeInterpolator;
    }
}
