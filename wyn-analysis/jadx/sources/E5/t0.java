package E5;

import u6.C4260e;

/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final C4260e f3543a;

    public t0(C4260e c4260e) {
        this.f3543a = c4260e;
    }

    public final boolean a(int... iArr) {
        C4260e c4260e = this.f3543a;
        for (int i5 : iArr) {
            if (c4260e.f46677a.get(i5)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            return this.f3543a.equals(((t0) obj).f3543a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3543a.hashCode();
    }
}
