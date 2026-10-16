package A7;

/* renamed from: A7.n1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0274n1 extends AbstractC0272n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0271m1 f999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0274n1(C0271m1 c0271m1, C0273n0 c0273n0, int i5) {
        super(c0273n0);
        this.f998e = i5;
        this.f999f = c0271m1;
    }

    @Override // A7.AbstractC0272n
    public final void c() {
        switch (this.f998e) {
            case 0:
                C0271m1 c0271m1 = this.f999f;
                c0271m1.c0();
                if (c0271m1.r0()) {
                    c0271m1.zzj().f612n.c("Inactivity, disconnecting from the service");
                    c0271m1.q0();
                    break;
                }
                break;
            default:
                this.f999f.zzj().f608i.c("Tasks have been queued for a long time");
                break;
        }
    }
}
