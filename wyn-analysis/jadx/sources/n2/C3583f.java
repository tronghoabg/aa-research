package n2;

import N1.C0765n;
import N1.O;
import R8.v;

/* renamed from: n2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3583f extends m implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f40834e;

    /* renamed from: f, reason: collision with root package name */
    public final int f40835f;

    public C3583f(int i5, O o7, int i10, C3586i c3586i, int i11) {
        int i12;
        super(i5, o7, i10);
        this.f40834e = v.c(i11, c3586i.f40853w) ? 1 : 0;
        C0765n c0765n = this.f40870d;
        int i13 = c0765n.f8239u;
        int i14 = -1;
        if (i13 != -1 && (i12 = c0765n.f8240v) != -1) {
            i14 = i13 * i12;
        }
        this.f40835f = i14;
    }

    @Override // n2.m
    public final int a() {
        return this.f40834e;
    }

    @Override // n2.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f40835f, ((C3583f) obj).f40835f);
    }
}
