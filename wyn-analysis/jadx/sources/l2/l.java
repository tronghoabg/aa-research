package l2;

import N1.C0765n;

/* loaded from: classes.dex */
public abstract class l extends AbstractC3380e {

    /* renamed from: j, reason: collision with root package name */
    public final long f39936j;

    public l(S1.h hVar, S1.k kVar, C0765n c0765n, int i5, Object obj, long j8, long j10, long j11) {
        super(hVar, kVar, 1, c0765n, i5, obj, j8, j10);
        c0765n.getClass();
        this.f39936j = j11;
    }

    public long a() {
        long j8 = this.f39936j;
        if (j8 != -1) {
            return j8 + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
