package m9;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f40482a;

    public g0(double[] dArr) {
        this.f40482a = (double[]) dArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f40482a, ((g0) obj).f40482a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40482a);
    }
}
