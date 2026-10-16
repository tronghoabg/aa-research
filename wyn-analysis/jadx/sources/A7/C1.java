package A7;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class C1 extends AbstractC0272n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1(Object obj, C0 c02, int i5) {
        super(c02);
        this.f427e = i5;
        this.f428f = obj;
    }

    @Override // A7.AbstractC0272n
    public final void c() throws Throwable {
        switch (this.f427e) {
            case 0:
                B1 b12 = (B1) this.f428f;
                ((C0303x1) b12.f426e).c0();
                C0303x1 c0303x1 = (C0303x1) b12.f426e;
                ((C0273n0) c0303x1.f421a).f985n.getClass();
                b12.c(SystemClock.elapsedRealtime(), false, false);
                C0273n0 c0273n0 = (C0273n0) c0303x1.f421a;
                r rVarH = c0273n0.h();
                c0273n0.f985n.getClass();
                rVarH.h0(SystemClock.elapsedRealtime());
                break;
            default:
                F1 f1 = (F1) this.f428f;
                f1.k0();
                f1.zzj().f612n.c("Starting upload from DelayedRunnable");
                f1.f509b.b0();
                break;
        }
    }
}
