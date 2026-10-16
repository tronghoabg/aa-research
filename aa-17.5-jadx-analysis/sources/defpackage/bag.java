package defpackage;

/* loaded from: classes.dex */
public final class bag implements azs {
    public boolean a;
    public long b;
    public long c;
    public boolean d;
    final /* synthetic */ sji e;
    private final int f;
    private final afec g;
    private dle h;
    private cvb i;
    private cva j;
    private boolean k;
    private boolean l;
    private Object m;
    private boolean n;
    private baf o;
    private boolean p;
    private long q;
    private final epk r;

    public bag(sji sjiVar, int i, epk epkVar, afec afecVar) {
        this.e = sjiVar;
        this.f = i;
        this.r = epkVar;
        this.g = afecVar;
        long j = aist.a;
        this.q = System.nanoTime() - aist.a;
    }

    private final void f() {
        cva cvaVar = this.j;
        if (cvaVar != null) {
            cvaVar.b();
        }
        this.j = null;
        cvb cvbVar = this.i;
        if (cvbVar != null) {
            cvbVar.b();
        }
        this.i = null;
        this.o = null;
    }

    private final boolean g() {
        if (this.l) {
            return true;
        }
        cva cvaVar = this.j;
        return cvaVar != null && cvaVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01e0  */
    /* JADX WARN: Type inference failed for: r5v2, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [azh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean h(defpackage.ayc r19) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bag.h(ayc):boolean");
    }

    @Override // defpackage.azs
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        f();
    }

    @Override // defpackage.azs
    public final void b() {
        this.p = true;
    }

    public final void c() {
        long jA;
        long j = aist.a;
        long jNanoTime = System.nanoTime() - aist.a;
        long j2 = this.q;
        long j3 = (j2 - 1) | 1;
        long j4 = Long.MAX_VALUE;
        aiss aissVar = aiss.a;
        if (j3 != Long.MAX_VALUE) {
            jA = (((-1) + jNanoTime) | 1) == Long.MAX_VALUE ? aiif.a(jNanoTime) : aiif.b(jNanoTime, j2, aissVar);
        } else if (jNanoTime == j2) {
            long j5 = aisq.a;
            jA = 0;
        } else {
            jA = aisq.j(aiif.a(j2));
        }
        long j6 = aisq.a;
        long j7 = jA >> 1;
        if ((((int) jA) & 1) == 0) {
            j4 = j7;
        } else if (j7 <= 9223372036854L) {
            j4 = j7 < -9223372036854L ? Long.MIN_VALUE : j7 * 1000000;
        }
        this.c = j4;
        long j8 = this.b - j4;
        this.b = j8;
        this.q = jNanoTime;
        vs.i("compose:lazy:prefetch:available_time_nanos", j8);
    }

    public final boolean d(long j, long j2) {
        if (true == this.p) {
            j2 = 0;
        }
        return j > j2;
    }

    public final boolean e(ayc aycVar) {
        if (!this.e.b) {
            return false;
        }
        boolean zH = this.p ? h(aycVar) : h(aycVar);
        vs.i("compose:lazy:prefetch:execute:item", -1L);
        return zH;
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f + ", constraints = " + this.h + ", isComposed = " + g() + ", isMeasured = " + this.k + ", isCanceled = " + this.a + " }";
    }

    public bag(sji sjiVar, int i, long j, epk epkVar, afec afecVar) {
        this(sjiVar, i, epkVar, afecVar);
        this.h = new dle(j);
    }
}
