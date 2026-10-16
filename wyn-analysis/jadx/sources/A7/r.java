package A7;

import android.os.Bundle;
import java.util.Iterator;
import x.C4409b;
import x.C4412e;

/* loaded from: classes4.dex */
public final class r extends B {

    /* renamed from: b, reason: collision with root package name */
    public final C4412e f1033b;

    /* renamed from: c, reason: collision with root package name */
    public final C4412e f1034c;

    /* renamed from: d, reason: collision with root package name */
    public long f1035d;

    public r(C0273n0 c0273n0) {
        super(c0273n0);
        this.f1034c = new C4412e(0);
        this.f1033b = new C4412e(0);
    }

    public final void h0(long j8) {
        C0262j1 c0262j1K0 = f0().k0(false);
        C4412e c4412e = this.f1033b;
        Iterator it = ((C4409b) c4412e.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k0(str, j8 - ((Long) c4412e.get(str)).longValue(), c0262j1K0);
        }
        if (!c4412e.isEmpty()) {
            i0(j8 - this.f1035d, c0262j1K0);
        }
        l0(j8);
    }

    public final void i0(long j8, C0262j1 c0262j1) {
        if (c0262j1 == null) {
            zzj().f612n.c("Not logging ad exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            N nZzj = zzj();
            nZzj.f612n.d("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j8);
            U1.u0(c0262j1, bundle, true);
            e0().H0("am", "_xa", bundle);
        }
    }

    public final void j0(String str, long j8) {
        if (str == null || str.length() == 0) {
            zzj().f605f.c("Ad unit id must be a non-empty string");
        } else {
            zzl().m0(new RunnableC0236b(this, str, j8, 0));
        }
    }

    public final void k0(String str, long j8, C0262j1 c0262j1) {
        if (c0262j1 == null) {
            zzj().f612n.c("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            N nZzj = zzj();
            nZzj.f612n.d("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j8);
            U1.u0(c0262j1, bundle, true);
            e0().H0("am", "_xu", bundle);
        }
    }

    public final void l0(long j8) {
        C4412e c4412e = this.f1033b;
        Iterator it = ((C4409b) c4412e.keySet()).iterator();
        while (it.hasNext()) {
            c4412e.put((String) it.next(), Long.valueOf(j8));
        }
        if (c4412e.isEmpty()) {
            return;
        }
        this.f1035d = j8;
    }

    public final void m0(long j8, String str) {
        if (str == null || str.length() == 0) {
            zzj().f605f.c("Ad unit id must be a non-empty string");
        } else {
            zzl().m0(new RunnableC0236b(this, str, j8, 1));
        }
    }
}
