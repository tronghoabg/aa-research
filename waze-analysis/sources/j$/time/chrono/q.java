package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q implements l {
    public static final q AH;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q[] f49877a;

    static {
        q qVar = new q("AH", 0);
        AH = qVar;
        f49877a = new q[]{qVar};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f49877a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long D(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.m(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean c(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.p(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int f(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.k(this, mVar);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.a.ERA ? j$.time.temporal.p.f(1L, 1L) : j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return temporal.a(1L, j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object x(j$.desugar.sun.nio.fs.n nVar) {
        return j$.com.android.tools.r8.a.t(this, nVar);
    }
}
