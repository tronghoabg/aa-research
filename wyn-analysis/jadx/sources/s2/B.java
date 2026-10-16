package s2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final int f44827a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f44828b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44829c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44830d;

    public B(int i5, byte[] bArr, int i10, int i11) {
        this.f44827a = i5;
        this.f44828b = bArr;
        this.f44829c = i10;
        this.f44830d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b5 = (B) obj;
            if (this.f44827a == b5.f44827a && this.f44829c == b5.f44829c && this.f44830d == b5.f44830d && Arrays.equals(this.f44828b, b5.f44828b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f44828b) + (this.f44827a * 31)) * 31) + this.f44829c) * 31) + this.f44830d;
    }
}
