package v6;

import E5.InterfaceC0453h;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes3.dex */
public final class o implements InterfaceC0453h {

    /* renamed from: e, reason: collision with root package name */
    public static final o f46898e = new o(0, 1.0f, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f46899a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46900b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46901c;

    /* renamed from: d, reason: collision with root package name */
    public final float f46902d;

    public o(int i5, float f10, int i10, int i11) {
        this.f46899a = i5;
        this.f46900b = i10;
        this.f46901c = i11;
        this.f46902d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f46899a == oVar.f46899a && this.f46900b == oVar.f46900b && this.f46901c == oVar.f46901c && this.f46902d == oVar.f46902d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f46902d) + ((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f46899a) * 31) + this.f46900b) * 31) + this.f46901c) * 31);
    }
}
