package X;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public k f15699a;

    /* renamed from: b, reason: collision with root package name */
    public int f15700b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15701c;

    /* renamed from: d, reason: collision with root package name */
    public int f15702d;

    public g(int i5, k kVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f15699a = kVar;
        this.f15700b = i5;
        if (i5 != 0) {
            k kVarE = e();
            Dd.c cVar = m.f15717a;
            int[] iArr = kVarE.f15714d;
            if (iArr != null) {
                i5 = iArr[0];
            } else {
                long j8 = kVarE.f15712b;
                int i10 = kVarE.f15713c;
                if (j8 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
                } else {
                    long j10 = kVarE.f15711a;
                    if (j10 != 0) {
                        i10 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                    }
                }
                i5 = iNumberOfTrailingZeros + i10;
            }
            synchronized (m.f15718b) {
                iA = m.f15721e.a(i5);
            }
        } else {
            iA = -1;
        }
        this.f15702d = iA;
    }

    public static void p(g gVar) {
        m.f15717a.Q(gVar);
    }

    public final void a() {
        synchronized (m.f15718b) {
            b();
            o();
        }
    }

    public void b() {
        m.f15719c = m.f15719c.c(d());
    }

    public abstract void c();

    public int d() {
        return this.f15700b;
    }

    public k e() {
        return this.f15699a;
    }

    public abstract tf.l f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract tf.l i();

    public final g j() {
        Dd.c cVar = m.f15717a;
        g gVar = (g) cVar.E();
        cVar.Q(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(y yVar);

    public void o() {
        int i5 = this.f15702d;
        if (i5 >= 0) {
            m.v(i5);
            this.f15702d = -1;
        }
    }

    public void q(int i5) {
        this.f15700b = i5;
    }

    public void r(k kVar) {
        this.f15699a = kVar;
    }

    public void s(int i5) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g t(tf.l lVar);
}
