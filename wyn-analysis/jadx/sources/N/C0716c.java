package N;

import A7.AbstractC0279p0;

/* renamed from: N.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716c {

    /* renamed from: a, reason: collision with root package name */
    public int f7752a;

    public C0716c(int i5) {
        this.f7752a = i5;
    }

    public final boolean a() {
        return this.f7752a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return AbstractC0279p0.j(this.f7752a, " }", sb2);
    }
}
