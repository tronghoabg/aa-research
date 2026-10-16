package A7;

/* renamed from: A7.z1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0309z1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0303x1 f1237c;

    public /* synthetic */ RunnableC0309z1(C0303x1 c0303x1, long j8, int i5) {
        this.f1235a = i5;
        this.f1236b = j8;
        this.f1237c = c0303x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1235a) {
            case 0:
                C0303x1 c0303x1 = this.f1237c;
                c0303x1.c0();
                c0303x1.k0();
                N nZzj = c0303x1.zzj();
                long j8 = this.f1236b;
                nZzj.f612n.d("Activity paused, time", Long.valueOf(j8));
                S3.s sVar = c0303x1.f1116g;
                C0303x1 c0303x12 = (C0303x1) sVar.f11010c;
                ((C0273n0) c0303x12.f421a).f985n.getClass();
                A1 a12 = new A1(sVar, System.currentTimeMillis(), j8);
                sVar.f11009b = a12;
                c0303x12.f1112c.postDelayed(a12, 2000L);
                if (((C0273n0) c0303x1.f421a).f979g.q0()) {
                    ((C1) c0303x1.f1115f.f425d).a();
                    break;
                }
                break;
            default:
                C0303x1 c0303x13 = this.f1237c;
                c0303x13.c0();
                c0303x13.k0();
                N nZzj2 = c0303x13.zzj();
                long j10 = this.f1236b;
                nZzj2.f612n.d("Activity resumed, time", Long.valueOf(j10));
                C0273n0 c0273n0 = (C0273n0) c0303x13.f421a;
                boolean zO0 = c0273n0.f979g.o0(null, AbstractC0304y.f1144O0);
                C0245e c0245e = c0273n0.f979g;
                B1 b12 = c0303x13.f1115f;
                if (zO0) {
                    if (c0245e.q0() || c0303x13.f1113d) {
                        ((C0303x1) b12.f426e).c0();
                        ((C1) b12.f425d).a();
                        b12.f423b = j10;
                        b12.f424c = j10;
                    }
                } else if (c0245e.q0() || c0303x13.a0().f779t.d()) {
                    ((C0303x1) b12.f426e).c0();
                    ((C1) b12.f425d).a();
                    b12.f423b = j10;
                    b12.f424c = j10;
                }
                S3.s sVar2 = c0303x13.f1116g;
                C0303x1 c0303x14 = (C0303x1) sVar2.f11010c;
                c0303x14.c0();
                A1 a13 = (A1) sVar2.f11009b;
                if (a13 != null) {
                    c0303x14.f1112c.removeCallbacks(a13);
                }
                c0303x14.a0().f779t.c(false);
                c0303x14.c0();
                c0303x14.f1113d = false;
                if (((C0273n0) c0303x14.f421a).f979g.o0(null, AbstractC0304y.f1138L0) && c0303x14.e0().f659m) {
                    c0303x14.zzj().f612n.c("Retrying trigger URI registration in foreground");
                    c0303x14.e0().D0();
                }
                Y9.c cVar = c0303x13.f1114e;
                ((C0303x1) cVar.f16739b).c0();
                C0303x1 c0303x15 = (C0303x1) cVar.f16739b;
                if (((C0273n0) c0303x15.f421a).e()) {
                    ((C0273n0) c0303x15.f421a).f985n.getClass();
                    cVar.s(System.currentTimeMillis());
                    break;
                }
                break;
        }
    }
}
