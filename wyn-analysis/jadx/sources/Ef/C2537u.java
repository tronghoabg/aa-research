package ef;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2537u implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f34686a;

    public /* synthetic */ C2537u(int i5) {
        this.f34686a = i5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC3340k.g(this.f34686a ^ Integer.MIN_VALUE, ((C2537u) obj).f34686a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2537u) {
            return this.f34686a == ((C2537u) obj).f34686a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34686a;
    }

    public final String toString() {
        return String.valueOf(this.f34686a & 4294967295L);
    }
}
