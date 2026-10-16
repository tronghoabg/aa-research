package f6;

import E5.C0440a0;
import E5.C0442b0;
import E5.C0446d0;
import E5.C0450f0;
import E5.H0;
import E5.I0;
import E5.J0;
import android.net.Uri;
import g6.C2711b;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class Y extends J0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f35010g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f35011b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35012c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35013d;

    /* renamed from: e, reason: collision with root package name */
    public final C0446d0 f35014e;

    /* renamed from: f, reason: collision with root package name */
    public final E5.Z f35015f;

    static {
        E5.V v2 = new E5.V();
        C3407I c3407i = AbstractC3409K.f40056b;
        e0 e0Var = e0.f40101e;
        List list = Collections.EMPTY_LIST;
        e0 e0Var2 = e0.f40101e;
        C0442b0 c0442b0 = C0442b0.f3293c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0440a0(uri, null, list, e0Var2);
        }
        v2.a();
        C0450f0 c0450f0 = C0450f0.f3356G;
    }

    public Y(long j8, boolean z2, boolean z10, C0446d0 c0446d0) {
        E5.Z z11 = z10 ? c0446d0.f3306c : null;
        this.f35011b = j8;
        this.f35012c = j8;
        this.f35013d = z2;
        c0446d0.getClass();
        this.f35014e = c0446d0;
        this.f35015f = z11;
    }

    @Override // E5.J0
    public final int b(Object obj) {
        return f35010g.equals(obj) ? 0 : -1;
    }

    @Override // E5.J0
    public final H0 f(int i5, H0 h02, boolean z2) {
        AbstractC4256a.h(i5, 1);
        Object obj = z2 ? f35010g : null;
        h02.getClass();
        h02.h(null, obj, 0, this.f35011b, 0L, C2711b.f35767f, false);
        return h02;
    }

    @Override // E5.J0
    public final int h() {
        return 1;
    }

    @Override // E5.J0
    public final Object l(int i5) {
        AbstractC4256a.h(i5, 1);
        return f35010g;
    }

    @Override // E5.J0
    public final I0 m(int i5, I0 i02, long j8) {
        AbstractC4256a.h(i5, 1);
        i02.b(I0.f3107q, this.f35014e, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f35013d, false, this.f35015f, 0L, this.f35012c, 0, 0, 0L);
        return i02;
    }

    @Override // E5.J0
    public final int o() {
        return 1;
    }
}
