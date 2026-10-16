package ef;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2524h implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final C2524h f34662e = new C2524h(2, 3, 21);

    /* renamed from: a, reason: collision with root package name */
    public final int f34663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34664b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34665c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34666d;

    public C2524h(int i5, int i10, int i11) {
        this.f34663a = i5;
        this.f34664b = i10;
        this.f34665c = i11;
        if (i5 >= 0 && i5 < 256 && i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256) {
            this.f34666d = (i5 << 16) + (i10 << 8) + i11;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i5 + '.' + i10 + '.' + i11).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2524h other = (C2524h) obj;
        AbstractC3340k.e(other, "other");
        return this.f34666d - other.f34666d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C2524h c2524h = obj instanceof C2524h ? (C2524h) obj : null;
        return c2524h != null && this.f34666d == c2524h.f34666d;
    }

    public final int hashCode() {
        return this.f34666d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34663a);
        sb2.append('.');
        sb2.append(this.f34664b);
        sb2.append('.');
        sb2.append(this.f34665c);
        return sb2.toString();
    }
}
