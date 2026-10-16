package defpackage;

import android.animation.TimeInterpolator;

/* loaded from: classes3.dex */
public final class wqk implements TimeInterpolator {
    private final TimeInterpolator a;
    private final /* synthetic */ int b;

    public wqk(TimeInterpolator timeInterpolator, int i, byte[] bArr) {
        this.b = i;
        timeInterpolator.getClass();
        this.a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new wqk(timeInterpolator, 0);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.b;
        TimeInterpolator timeInterpolator = this.a;
        return i != 0 ? timeInterpolator.getInterpolation(f) : 1.0f - timeInterpolator.getInterpolation(f);
    }

    public wqk(TimeInterpolator timeInterpolator, int i) {
        this.b = i;
        this.a = timeInterpolator;
    }
}
