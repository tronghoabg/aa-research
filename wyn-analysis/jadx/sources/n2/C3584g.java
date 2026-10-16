package n2;

import N1.C0765n;
import R8.v;
import l8.AbstractC3399A;

/* renamed from: n2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3584g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40836a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40837b;

    public C3584g(C0765n c0765n, int i5) {
        this.f40836a = (c0765n.f8224e & 1) != 0;
        this.f40837b = v.c(i5, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3584g c3584g = (C3584g) obj;
        return AbstractC3399A.f40038a.c(this.f40837b, c3584g.f40837b).c(this.f40836a, c3584g.f40836a).e();
    }
}
