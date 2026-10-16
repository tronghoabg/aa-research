package E5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class F0 extends A0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3031b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3032c;

    public F0() {
        this.f3031b = false;
        this.f3032c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return this.f3032c == f02.f3032c && this.f3031b == f02.f3031b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3031b), Boolean.valueOf(this.f3032c)});
    }

    public F0(boolean z2) {
        this.f3031b = true;
        this.f3032c = z2;
    }
}
