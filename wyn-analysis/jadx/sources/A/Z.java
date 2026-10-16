package A;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class Z implements InterfaceC0227u {

    /* renamed from: a, reason: collision with root package name */
    public final int f98a;

    /* renamed from: b, reason: collision with root package name */
    public final r f99b;

    public Z(int i5, r rVar) {
        this.f98a = i5;
        this.f99b = rVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return z2.f98a == this.f98a && AbstractC3340k.a(z2.f99b, this.f99b);
    }

    public final int hashCode() {
        return (this.f99b.hashCode() + (this.f98a * 31)) * 31;
    }

    @Override // A.InterfaceC0216i
    public final c0 q(S3.e converter) {
        AbstractC3340k.e(converter, "converter");
        return new C0230x(this.f98a, this.f99b, 1);
    }

    public Z(int i5, r rVar, int i10) {
        this.f98a = i5;
        this.f99b = rVar;
    }
}
