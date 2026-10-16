package E5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class U extends A0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3253b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3254c;

    public U() {
        this.f3253b = false;
        this.f3254c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return this.f3254c == u10.f3254c && this.f3253b == u10.f3253b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3253b), Boolean.valueOf(this.f3254c)});
    }

    public U(boolean z2) {
        this.f3253b = true;
        this.f3254c = z2;
    }
}
