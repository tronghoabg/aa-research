package h4;

import A.AbstractC0213f;
import i4.InterfaceC2850g;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: h4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2776c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2850g f36067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36069c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f36070d;

    public C2776c(InterfaceC2850g interfaceC2850g, int i5, int i10, Boolean bool) {
        this.f36067a = interfaceC2850g;
        this.f36068b = i5;
        this.f36069c = i10;
        this.f36070d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2776c)) {
            return false;
        }
        C2776c c2776c = (C2776c) obj;
        c2776c.getClass();
        return AbstractC3340k.a(this.f36067a, c2776c.f36067a) && this.f36068b == c2776c.f36068b && this.f36069c == c2776c.f36069c && AbstractC3340k.a(this.f36070d, c2776c.f36070d);
    }

    public final int hashCode() {
        InterfaceC2850g interfaceC2850g = this.f36067a;
        int iHashCode = (interfaceC2850g != null ? interfaceC2850g.hashCode() : 0) * 31;
        int i5 = this.f36068b;
        int iF = (iHashCode + (i5 != 0 ? AbstractC0213f.f(i5) : 0)) * 887503681;
        int i10 = this.f36069c;
        int iF2 = (iF + (i10 != 0 ? AbstractC0213f.f(i10) : 0)) * 961;
        Boolean bool = this.f36070d;
        return (iF2 + (bool != null ? bool.hashCode() : 0)) * 923521;
    }
}
