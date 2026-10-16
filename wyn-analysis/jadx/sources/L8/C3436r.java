package l8;

import java.io.Serializable;
import java.util.Arrays;
import k8.InterfaceC3199h;

/* renamed from: l8.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3436r extends d0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3199h f40156a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f40157b;

    public C3436r(InterfaceC3199h interfaceC3199h, d0 d0Var) {
        this.f40156a = interfaceC3199h;
        this.f40157b = d0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC3199h interfaceC3199h = this.f40156a;
        return this.f40157b.compare(interfaceC3199h.apply(obj), interfaceC3199h.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3436r) {
            C3436r c3436r = (C3436r) obj;
            if (this.f40156a.equals(c3436r.f40156a) && this.f40157b.equals(c3436r.f40157b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40156a, this.f40157b});
    }

    public final String toString() {
        return this.f40157b + ".onResultOf(" + this.f40156a + ")";
    }
}
