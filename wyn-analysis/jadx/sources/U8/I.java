package U8;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class I extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12403a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12404b;

    public I(String str, byte[] bArr) {
        this.f12403a = str;
        this.f12404b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.f12403a.equals(((I) t0Var).f12403a)) {
                if (Arrays.equals(this.f12404b, (t0Var instanceof I ? (I) t0Var : (I) t0Var).f12404b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12403a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12404b);
    }

    public final String toString() {
        return "File{filename=" + this.f12403a + ", contents=" + Arrays.toString(this.f12404b) + "}";
    }
}
