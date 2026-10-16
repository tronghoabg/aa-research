package l2;

import N1.C0765n;
import Y2.B;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3376a extends l {
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final long f39867l;

    /* renamed from: m, reason: collision with root package name */
    public B f39868m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f39869n;

    public AbstractC3376a(S1.h hVar, S1.k kVar, C0765n c0765n, int i5, Object obj, long j8, long j10, long j11, long j12, long j13) {
        super(hVar, kVar, c0765n, i5, obj, j8, j10, j13);
        this.k = j11;
        this.f39867l = j12;
    }

    public final int c(int i5) {
        int[] iArr = this.f39869n;
        Q1.k.h(iArr);
        return iArr[i5];
    }
}
