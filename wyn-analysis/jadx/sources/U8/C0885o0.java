package U8;

import android.os.Build;

/* renamed from: U8.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0885o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12654a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12655b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12656c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12657d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12659f;

    public C0885o0(int i5, int i10, long j8, long j10, boolean z2, int i11) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f12654a = i5;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f12655b = i10;
        this.f12656c = j8;
        this.f12657d = j10;
        this.f12658e = z2;
        this.f12659f = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0885o0)) {
            return false;
        }
        C0885o0 c0885o0 = (C0885o0) obj;
        if (this.f12654a != c0885o0.f12654a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f12655b != c0885o0.f12655b || this.f12656c != c0885o0.f12656c || this.f12657d != c0885o0.f12657d || this.f12658e != c0885o0.f12658e || this.f12659f != c0885o0.f12659f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f12654a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f12655b) * 1000003;
        long j8 = this.f12656c;
        int i5 = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j10 = this.f12657d;
        return Build.PRODUCT.hashCode() ^ ((((((((i5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f12658e ? 1231 : 1237)) * 1000003) ^ this.f12659f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f12654a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f12655b);
        sb2.append(", totalRam=");
        sb2.append(this.f12656c);
        sb2.append(", diskSpace=");
        sb2.append(this.f12657d);
        sb2.append(", isEmulator=");
        sb2.append(this.f12658e);
        sb2.append(", state=");
        sb2.append(this.f12659f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return wg.b.c(sb2, Build.PRODUCT, "}");
    }
}
