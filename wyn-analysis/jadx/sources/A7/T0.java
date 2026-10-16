package A7;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public final /* synthetic */ class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f697a = 0;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f698b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f699c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f700d;

    public /* synthetic */ T0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f697a) {
            case 0:
                P0 p02 = (P0) this.f699c;
                if (!TextUtils.isEmpty(((C0273n0) p02.f421a).j().l0())) {
                    p02.zzj().k.c("Using developer consent only; google app id found");
                    break;
                } else {
                    p02.r0((Bundle) this.f700d, 0, this.f698b);
                    break;
                }
            default:
                C0259i1 c0259i1 = (C0259i1) this.f700d;
                c0259i1.n0((C0262j1) this.f699c, false, this.f698b);
                c0259i1.f903e = null;
                C0271m1 c0271m1H = AbstractC0279p0.h((C0273n0) c0259i1.f421a);
                c0271m1H.m0(new RunnableC0278p(10, c0271m1H, (Object) null));
                break;
        }
    }

    public T0(C0259i1 c0259i1, C0262j1 c0262j1, long j8) {
        this.f699c = c0262j1;
        this.f698b = j8;
        this.f700d = c0259i1;
    }
}
