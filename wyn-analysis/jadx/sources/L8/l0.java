package l8;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class l0 extends d0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f40135a;

    public l0(d0 d0Var) {
        this.f40135a = d0Var;
    }

    @Override // l8.d0
    public final d0 a() {
        return this.f40135a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f40135a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            return this.f40135a.equals(((l0) obj).f40135a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f40135a.hashCode();
    }

    public final String toString() {
        return this.f40135a + ".reverse()";
    }
}
