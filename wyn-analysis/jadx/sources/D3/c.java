package D3;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final A3.b f2297a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2298b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2299c;

    public c(A3.b bVar, b bVar2, b bVar3) {
        this.f2297a = bVar;
        this.f2298b = bVar2;
        this.f2299c = bVar3;
        int i5 = bVar.f281c;
        int i10 = bVar.f279a;
        int i11 = i5 - i10;
        int i12 = bVar.f280b;
        if (i11 == 0 && bVar.f282d - i12 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i10 != 0 && i12 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC3340k.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return AbstractC3340k.a(this.f2297a, cVar.f2297a) && AbstractC3340k.a(this.f2298b, cVar.f2298b) && AbstractC3340k.a(this.f2299c, cVar.f2299c);
    }

    public final int hashCode() {
        return this.f2299c.hashCode() + ((this.f2298b.hashCode() + (this.f2297a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f2297a + ", type=" + this.f2298b + ", state=" + this.f2299c + " }";
    }
}
