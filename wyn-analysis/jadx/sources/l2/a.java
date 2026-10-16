package L2;

import s2.i;

/* loaded from: classes.dex */
public final class a extends i implements f {

    /* renamed from: h, reason: collision with root package name */
    public final long f6825h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6826i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6827j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6828l;

    public a(long j8, long j10, int i5, int i10, boolean z2) {
        super(j8, j10, i5, i10, z2);
        long j11 = j8;
        this.f6825h = j10;
        this.f6826i = i5;
        this.f6827j = i10;
        this.k = z2;
        this.f6828l = j11 == -1 ? -1L : j11;
    }

    @Override // L2.f
    public final long b(long j8) {
        return (Math.max(0L, j8 - this.f44889b) * 8000000) / this.f44892e;
    }

    @Override // L2.f
    public final long d() {
        return this.f6828l;
    }

    @Override // L2.f
    public final int l() {
        return this.f6826i;
    }
}
