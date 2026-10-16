package fa;

import R8.j;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2619a {

    /* renamed from: a, reason: collision with root package name */
    public final Nf.d f35263a;

    /* renamed from: b, reason: collision with root package name */
    public j f35264b = null;

    public C2619a(Nf.d dVar) {
        this.f35263a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2619a)) {
            return false;
        }
        C2619a c2619a = (C2619a) obj;
        return this.f35263a.equals(c2619a.f35263a) && AbstractC3340k.a(this.f35264b, c2619a.f35264b);
    }

    public final int hashCode() {
        int iHashCode = this.f35263a.hashCode() * 31;
        j jVar = this.f35264b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f35263a + ", subscriber=" + this.f35264b + ')';
    }
}
