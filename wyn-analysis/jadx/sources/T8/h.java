package T8;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f11795c = new h(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f11796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11797b;

    public h(int i5, int i10) {
        this.f11796a = i5;
        this.f11797b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f11796a);
        sb2.append(", length = ");
        return AbstractC0279p0.j(this.f11797b, "]", sb2);
    }
}
