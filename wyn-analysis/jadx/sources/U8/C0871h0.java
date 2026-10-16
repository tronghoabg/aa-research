package U8;

/* renamed from: U8.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0871h0 extends I0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12582b;

    public C0871h0(String str, String str2) {
        this.f12581a = str;
        this.f12582b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I0) {
            I0 i02 = (I0) obj;
            if (this.f12581a.equals(((C0871h0) i02).f12581a) && this.f12582b.equals(((C0871h0) i02).f12582b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12581a.hashCode() ^ 1000003) * 1000003) ^ this.f12582b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f12581a);
        sb2.append(", variantId=");
        return wg.b.c(sb2, this.f12582b, "}");
    }
}
