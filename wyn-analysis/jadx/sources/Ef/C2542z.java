package ef;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2542z implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final short f34691a;

    public /* synthetic */ C2542z(short s10) {
        this.f34691a = s10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC3340k.g(this.f34691a & 65535, ((C2542z) obj).f34691a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2542z) {
            return this.f34691a == ((C2542z) obj).f34691a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34691a;
    }

    public final String toString() {
        return String.valueOf(65535 & this.f34691a);
    }
}
