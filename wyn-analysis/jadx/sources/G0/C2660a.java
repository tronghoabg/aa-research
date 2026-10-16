package g0;

import L0.i;
import e0.InterfaceC2463o;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2660a {

    /* renamed from: a, reason: collision with root package name */
    public L0.b f35479a;

    /* renamed from: b, reason: collision with root package name */
    public i f35480b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2463o f35481c;

    /* renamed from: d, reason: collision with root package name */
    public long f35482d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2660a)) {
            return false;
        }
        C2660a c2660a = (C2660a) obj;
        return AbstractC3340k.a(this.f35479a, c2660a.f35479a) && this.f35480b == c2660a.f35480b && AbstractC3340k.a(this.f35481c, c2660a.f35481c) && d0.f.a(this.f35482d, c2660a.f35482d);
    }

    public final int hashCode() {
        int iHashCode = (this.f35481c.hashCode() + ((this.f35480b.hashCode() + (this.f35479a.hashCode() * 31)) * 31)) * 31;
        long j8 = this.f35482d;
        int i5 = d0.f.f33951d;
        return ((int) (j8 ^ (j8 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f35479a + ", layoutDirection=" + this.f35480b + ", canvas=" + this.f35481c + ", size=" + ((Object) d0.f.e(this.f35482d)) + ')';
    }
}
