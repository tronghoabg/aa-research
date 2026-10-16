package J5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f5683a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5684b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5685c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5686d;

    public v(int i5, byte[] bArr, int i10, int i11) {
        this.f5683a = i5;
        this.f5684b = bArr;
        this.f5685c = i10;
        this.f5686d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f5683a == vVar.f5683a && this.f5685c == vVar.f5685c && this.f5686d == vVar.f5686d && Arrays.equals(this.f5684b, vVar.f5684b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f5684b) + (this.f5683a * 31)) * 31) + this.f5685c) * 31) + this.f5686d;
    }
}
