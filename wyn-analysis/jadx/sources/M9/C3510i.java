package m9;

import A.AbstractC0213f;

/* renamed from: m9.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3510i {

    /* renamed from: a, reason: collision with root package name */
    public final int f40483a;

    /* renamed from: b, reason: collision with root package name */
    public final X f40484b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40485c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40486d;

    public C3510i(X x5, int i5, int i10, int i11) {
        this.f40483a = i5;
        this.f40484b = x5;
        this.f40485c = i10;
        this.f40486d = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3510i)) {
            return false;
        }
        C3510i c3510i = (C3510i) obj;
        return AbstractC0213f.b(this.f40483a, c3510i.f40483a) && this.f40484b.equals(c3510i.f40484b) && this.f40485c == c3510i.f40485c && this.f40486d == c3510i.f40486d;
    }

    public final int hashCode() {
        return ((((this.f40484b.hashCode() + (AbstractC0213f.f(this.f40483a) * 31)) * 31) + this.f40485c) * 31) + this.f40486d;
    }
}
