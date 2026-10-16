package q0;

import A.AbstractC0213f;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3854d {

    /* renamed from: a, reason: collision with root package name */
    public final float f43961a;

    /* renamed from: b, reason: collision with root package name */
    public final float f43962b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43963c;

    public C3854d(float f10, float f11, long j8) {
        this.f43961a = f10;
        this.f43962b = f11;
        this.f43963c = j8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3854d)) {
            return false;
        }
        C3854d c3854d = (C3854d) obj;
        return c3854d.f43961a == this.f43961a && c3854d.f43962b == this.f43962b && c3854d.f43963c == this.f43963c;
    }

    public final int hashCode() {
        int iC = AbstractC0213f.c(this.f43962b, Float.floatToIntBits(this.f43961a) * 31, 31);
        long j8 = this.f43963c;
        return iC + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb2.append(this.f43961a);
        sb2.append(",horizontalScrollPixels=");
        sb2.append(this.f43962b);
        sb2.append(",uptimeMillis=");
        return AbstractC0213f.e(sb2, this.f43963c, ')');
    }
}
