package N1;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: d, reason: collision with root package name */
    public static final Y f8125d = new Y(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f8126a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8127b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8128c;

    static {
        Q1.x.E(0);
        Q1.x.E(1);
        Q1.x.E(3);
    }

    public Y(int i5, int i10, float f10) {
        this.f8126a = i5;
        this.f8127b = i10;
        this.f8128c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            Y y10 = (Y) obj;
            if (this.f8126a == y10.f8126a && this.f8127b == y10.f8127b && this.f8128c == y10.f8128c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8128c) + ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f8126a) * 31) + this.f8127b) * 31);
    }
}
