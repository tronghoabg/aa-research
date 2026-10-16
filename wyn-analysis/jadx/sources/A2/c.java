package A2;

import h6.InterfaceC2787f;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import u6.AbstractC4256a;

/* loaded from: classes.dex */
public final class c implements InterfaceC2787f {

    /* renamed from: a, reason: collision with root package name */
    public final long f268a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f269b;

    public /* synthetic */ c(long j8, e0 e0Var) {
        this.f268a = j8;
        this.f269b = e0Var;
    }

    @Override // h6.InterfaceC2787f
    public int a(long j8) {
        return this.f268a > j8 ? 0 : -1;
    }

    @Override // h6.InterfaceC2787f
    public List g(long j8) {
        if (j8 >= this.f268a) {
            return this.f269b;
        }
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    @Override // h6.InterfaceC2787f
    public long k(int i5) {
        AbstractC4256a.e(i5 == 0);
        return this.f268a;
    }

    @Override // h6.InterfaceC2787f
    public int p() {
        return 1;
    }
}
