package We;

/* loaded from: classes5.dex */
public final class i extends He.m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f15495b = new l("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* renamed from: a, reason: collision with root package name */
    public final l f15496a = f15495b;

    @Override // He.m
    public final He.l a() {
        return new j(this.f15496a);
    }
}
