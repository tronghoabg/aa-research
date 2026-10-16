package E5;

import android.util.SparseBooleanArray;
import u6.AbstractC4256a;
import u6.C4260e;

/* loaded from: classes3.dex */
public final class s0 implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public final C4260e f3540a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC4256a.i(!false);
        new C4260e(sparseBooleanArray);
    }

    public s0(C4260e c4260e) {
        this.f3540a = c4260e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return this.f3540a.equals(((s0) obj).f3540a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3540a.hashCode();
    }
}
