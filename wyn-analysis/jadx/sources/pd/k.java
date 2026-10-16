package pd;

import ad.C1355I;
import ad.L;
import c7.C1576l;
import cg.C1618g;
import md.C3534b;
import md.C3535c;
import md.b0;
import od.AbstractC3671b;
import od.W1;
import od.a2;

/* loaded from: classes5.dex */
public final class k extends AbstractC3671b {

    /* renamed from: r, reason: collision with root package name */
    public static final C1618g f43532r = new C1618g();

    /* renamed from: j, reason: collision with root package name */
    public final F6.r f43533j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final W1 f43534l;

    /* renamed from: m, reason: collision with root package name */
    public final String f43535m;

    /* renamed from: n, reason: collision with root package name */
    public final j f43536n;

    /* renamed from: o, reason: collision with root package name */
    public final L f43537o;

    /* renamed from: p, reason: collision with root package name */
    public final C3534b f43538p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f43539q;

    public k(F6.r rVar, b0 b0Var, d dVar, m mVar, C1576l c1576l, Object obj, int i5, int i10, String str, String str2, W1 w12, a2 a2Var, C3535c c3535c) {
        super(new C1355I(11), w12, a2Var, b0Var, c3535c, false);
        this.f43537o = new L(this, 21);
        this.f43539q = false;
        this.f43534l = w12;
        this.f43533j = rVar;
        this.f43535m = str;
        this.k = str2;
        this.f43538p = mVar.f43575u;
        Object obj2 = rVar.f4012c;
        this.f43536n = new j(this, i5, w12, obj, dVar, c1576l, mVar, i10);
    }

    public static void v(k kVar, int i5) {
        kVar.getClass();
        j jVar = kVar.f43536n;
        synchronized (jVar.f41871b) {
            jVar.f41874e += i5;
        }
    }
}
