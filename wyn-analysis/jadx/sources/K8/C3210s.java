package k8;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: k8.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3210s implements InterfaceC3207p, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f39321a;

    public C3210s(Object obj) {
        this.f39321a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3210s) {
            return Fe.b.v(this.f39321a, ((C3210s) obj).f39321a);
        }
        return false;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        return this.f39321a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39321a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f39321a + ")";
    }
}
