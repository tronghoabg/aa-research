package X1;

import A7.C0292u;
import l2.AbstractC3377b;

/* loaded from: classes.dex */
public final class h extends AbstractC3377b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15987d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15988e;

    public h(j2.b bVar, int i5) {
        super(i5, bVar.k - 1);
        this.f15988e = bVar;
    }

    @Override // l2.m
    public final long f() {
        switch (this.f15987d) {
            case 0:
                a();
                return ((C0292u) this.f15988e).f(this.f39872c);
            default:
                a();
                return ((j2.b) this.f15988e).f38593o[(int) this.f39872c];
        }
    }

    @Override // l2.m
    public final long h() {
        switch (this.f15987d) {
            case 0:
                a();
                return ((C0292u) this.f15988e).e(this.f39872c);
            default:
                return ((j2.b) this.f15988e).b((int) this.f39872c) + f();
        }
    }

    public h(C0292u c0292u, long j8, long j10) {
        super(j8, j10);
        this.f15988e = c0292u;
    }
}
