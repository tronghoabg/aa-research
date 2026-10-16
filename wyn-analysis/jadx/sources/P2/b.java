package P2;

import J9.C0664x;
import Q1.x;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.C3436r;
import l8.c0;
import l8.e0;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final C3436r f9059c = new C3436r(new C0664x(19), c0.f40090b);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3409K f9060a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9061b;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(l8.e0 r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.b.<init>(l8.e0):void");
    }

    @Override // P2.d, h6.InterfaceC2787f
    public final int a(long j8) {
        int iA = x.a(this.f9061b, j8, false);
        if (iA < this.f9060a.size()) {
            return iA;
        }
        return -1;
    }

    @Override // P2.d, h6.InterfaceC2787f
    public final List g(long j8) {
        int iE = x.e(this.f9061b, j8, false);
        if (iE != -1) {
            return (AbstractC3409K) this.f9060a.get(iE);
        }
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    @Override // P2.d, h6.InterfaceC2787f
    public final long k(int i5) {
        Q1.k.c(i5 < this.f9060a.size());
        return this.f9061b[i5];
    }

    @Override // P2.d, h6.InterfaceC2787f
    public final int p() {
        return this.f9060a.size();
    }
}
