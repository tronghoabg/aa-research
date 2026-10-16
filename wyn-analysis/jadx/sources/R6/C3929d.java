package r6;

import E5.T;
import l8.AbstractC3399A;

/* renamed from: r6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3929d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f44398a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f44399b;

    public C3929d(T t10, int i5) {
        this.f44398a = (t10.f3231d & 1) != 0;
        this.f44399b = l.e(i5, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3929d c3929d = (C3929d) obj;
        return AbstractC3399A.f40038a.c(this.f44399b, c3929d.f44399b).c(this.f44398a, c3929d.f44398a).e();
    }
}
