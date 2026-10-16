package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jcs {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.BUF.POOL");
    private final int b;
    private final int c;
    private final boolean d;
    private final defpackage.yxx e;
    private final android.os.Handler f = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.Deque g;
    private final java.util.Set h;
    private int i;
    private int j;
    private final defpackage.jcx k;

    public jcs(int i, int i2, boolean z, defpackage.yxx yxxVar, defpackage.jcx jcxVar) {
        defpackage.ysr.aY(i > 0, "Buffer capacity should be greater than 0");
        defpackage.ysr.ba(i2 > 0, "Max pool capacity should be greater than 0 for buffer pool of buffer capacity %s", i);
        this.b = i;
        this.d = z;
        this.g = new java.util.ArrayDeque();
        this.c = i2;
        this.e = yxxVar;
        this.h = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(i2 / 2));
        this.k = jcxVar;
    }

    private final synchronized java.nio.ByteBuffer h() {
        boolean z = this.d;
        int i = this.b;
        if (z) {
            return java.nio.ByteBuffer.allocateDirect(i);
        }
        return java.nio.ByteBuffer.allocate(i);
    }

    private final synchronized void i() {
        this.i = java.lang.Math.max(this.i, this.h.size());
    }

    public final synchronized defpackage.yxy a() {
        defpackage.abor aborVarN;
        aborVarN = defpackage.yxy.a.n();
        aborVarN.t();
        defpackage.yxy yxyVar = (defpackage.yxy) aborVarN.b;
        yxyVar.b |= 1;
        yxyVar.c = this.b;
        int i = this.i;
        aborVarN.t();
        defpackage.yxy yxyVar2 = (defpackage.yxy) aborVarN.b;
        yxyVar2.b |= 2;
        yxyVar2.d = i;
        int i2 = this.j;
        aborVarN.t();
        defpackage.yxy yxyVar3 = (defpackage.yxy) aborVarN.b;
        yxyVar3.b |= 4;
        yxyVar3.e = i2;
        return (defpackage.yxy) aborVarN.q();
    }

    public final synchronized java.nio.ByteBuffer b() {
        java.nio.ByteBuffer byteBuffer;
        int i = this.b;
        defpackage.yxx yxxVar = this.e;
        java.util.Set set = this.h;
        int size = set.size();
        java.lang.String strName = yxxVar.name();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(set.size());
        int i2 = this.c;
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i2);
        if (size >= i2) {
            throw new java.lang.IllegalStateException(defpackage.ysr.aR("Pool for %s with buffers of %s capacity is empty. %s buffers in use. Max pool capacity is %s", strName, numValueOf, numValueOf2, numValueOf3));
        }
        java.util.Deque deque = this.g;
        if (deque.isEmpty()) {
            deque.push(h());
        }
        byteBuffer = (java.nio.ByteBuffer) deque.pop();
        set.add(byteBuffer);
        i();
        byteBuffer.clear();
        return byteBuffer;
    }

    public final synchronized void c() {
        int i = this.j + 1;
        this.j = i;
        defpackage.jcx jcxVar = this.k;
        if (jcxVar.a && i > jcxVar.b) {
            throw new java.lang.IllegalStateException(java.lang.String.format("%d buffers leaked from pool with capacity %d for consumer %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.b), this.e.name()));
        }
    }

    public final synchronized void d(java.io.PrintWriter printWriter) {
        printWriter.println(java.lang.String.format(java.util.Locale.ENGLISH, "Consumer: %d, Buffer Capacity: %d, Max Usage: %d, Num leaks: %d ", java.lang.Integer.valueOf(this.e.d), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.i), java.lang.Integer.valueOf(this.j)));
    }

    final synchronized void e() {
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1884)).B("Internal buffer with capacity %d from pool: %d leaked.", this.b, this.e.d);
        this.f.post(new defpackage.iqv(this, 18));
    }

    public final synchronized void f() {
        java.util.Set set = this.h;
        if (set.isEmpty()) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1885)).R("%d buffers of %d capacity in use in pool %d", java.lang.Integer.valueOf(set.size()), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.e.d));
    }

    final synchronized void g(java.nio.ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        int i = this.b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(byteBuffer.capacity());
        boolean z = true;
        boolean z2 = iCapacity == i;
        defpackage.yxx yxxVar = this.e;
        defpackage.ysr.bh(z2, "Illegal buffer returned to the %s pool. Pool buffer capacity is %s, returned buffer capacity is %s", yxxVar, numValueOf, numValueOf2);
        boolean zIsDirect = byteBuffer.isDirect();
        boolean z3 = this.d;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z3);
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(byteBuffer.isDirect());
        if (zIsDirect != z3) {
            z = false;
        }
        defpackage.ysr.bh(z, "Illegal buffer returned to the %s pool. Pool buffer isDirect= %s, returned buffer isDirect= %s", yxxVar, boolValueOf, boolValueOf2);
        if (this.h.remove(byteBuffer)) {
            this.g.push(byteBuffer);
        }
    }
}
