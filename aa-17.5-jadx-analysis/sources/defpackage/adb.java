package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class adb {
    private final aezr A;
    private final aezr B;
    public final long a;
    public long b;
    public float c;
    public float d;
    public long e;
    public long f;
    public float g;
    public float h;
    public long i;
    public long j;
    public long k;
    public float l;
    public float m;
    public long n;
    public long o;
    public aee p;
    public aef q;
    public sm s;
    public sm t;
    public ca u;
    public ca v;
    private final aezr x;
    private final aezr y;
    private final aezr z;
    private final bwq w = new ParcelableSnapshotMutableState(acw.a, bxp.c);
    public final cyp r = new cyp();

    public adb() {
        long j = aist.a;
        this.a = System.nanoTime() - aist.a;
        this.b = 0L;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = roc.aA(0.5f, 0.5f);
        this.f = 0L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 0L;
        this.j = 0L;
        this.k = roc.aA(0.5f, 0.5f);
        this.l = 1.0f;
        this.m = 1.0f;
        this.n = 0L;
        this.o = roc.aA(0.5f, 0.5f);
        this.x = woy.dH(3, new acf(2));
        this.y = woy.dH(3, new acf(3));
        this.z = woy.dH(3, new acf(4));
        this.A = woy.dH(3, new acf(5));
        this.B = woy.dH(3, new acf(6));
    }

    public final acw a() {
        return (acw) this.w.a();
    }

    public final adu b() {
        return (adu) this.x.a();
    }

    public final adu c() {
        return (adu) this.y.a();
    }

    public final adu d() {
        return (adu) this.B.a();
    }

    public final adu e() {
        return (adu) this.A.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
    
        if (defpackage.ahni.a(r1, r2) != r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4 A[PHI: r6 r8 r10
  0x00e4: PHI (r6v4 long) = (r6v2 long), (r6v5 long) binds: [B:37:0x00e2, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r8v3 long) = (r8v1 long), (r8v4 long) binds: [B:37:0x00e2, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r10v4 long) = (r10v2 long), (r10v6 long) binds: [B:37:0x00e2, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe A[PHI: r6 r8
  0x00fe: PHI (r6v6 long) = (r6v4 long), (r6v7 long) binds: [B:39:0x00fc, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r8v5 long) = (r8v3 long), (r8v7 long) binds: [B:39:0x00fc, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[PHI: r6
  0x0112: PHI (r6v8 long) = (r6v6 long), (r6v10 long) binds: [B:41:0x0110, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.afck r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adb.f(afck):java.lang.Object");
    }

    public final void g(acw acwVar) {
        this.w.b(acwVar);
    }

    public final boolean h() {
        return a() == acw.e;
    }

    public final boolean i() {
        return a() == acw.b || a() == acw.c || a() == acw.d;
    }

    public final void j(ca caVar) {
        if (caVar != null) {
            this.u = caVar;
        }
        this.v = caVar;
    }
}
