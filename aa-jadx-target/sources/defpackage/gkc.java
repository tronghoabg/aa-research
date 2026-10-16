package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gkc {
    public final java.lang.Object a;

    public gkc(jto jtoVar) {
        java.lang.String str = fmw.a;
        java.util.List listAe = defpackage.afga.ae(new fmy((fnj) jtoVar.a), new fmz((fne) jtoVar.d), new fnb((fnj) jtoVar.b));
        java.lang.Object systemService = ((android.content.Context) jtoVar.c).getSystemService("connectivity");
        systemService.getClass();
        listAe.add(new fmr((android.net.ConnectivityManager) systemService));
        this.a = listAe;
    }

    public static final fte d(fti ftiVar, java.lang.Throwable th) {
        ftiVar.getClass();
        if (th instanceof ftl) {
            ftc ftcVar = fue.a;
        } else {
            ftc ftcVar2 = fue.a;
        }
        return new fte(ftiVar, th);
    }

    public static final boolean e(fti ftiVar, android.graphics.Bitmap.Config config) {
        config.getClass();
        return !defpackage.a.bd(config) || ftiVar.k;
    }

    public static final boolean f(fsq fsqVar) {
        java.lang.Object obj = fsqVar.b.get("coil#is_sampled");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void a(int i) {
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList(((java.util.WeakHashMap) this.a).values());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.List) arrayList.get(i3));
            int size2 = arrayList2.size();
            int i4 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i4 < size2) {
                    acku ackuVar = (acku) arrayList2.get(i4);
                    if (ackuVar.a == i) {
                        ackuVar.b.run();
                    }
                    i4++;
                }
            }
            i3 = i2;
        }
    }

    public final void b(java.lang.Object obj, int i, java.lang.Runnable runnable) {
        java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) this.a;
        java.util.List arrayList = (java.util.List) weakHashMap.get(obj);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            weakHashMap.put(obj, arrayList);
        }
        arrayList.add(new acku(i, runnable));
    }

    public final void c(java.lang.Object obj, int i) {
        java.util.List list = (java.util.List) ((java.util.WeakHashMap) this.a).get(obj);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((acku) it.next()).a == i) {
                    it.remove();
                }
            }
        }
    }

    public final ajor g() {
        return ((nch) this.a).f(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    public final aizj h(fok fokVar) {
        fokVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.a) {
            if (((fna) obj).b(fokVar)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fna) it.next()).a(fokVar.j));
        }
        return aizq.a(new fmu((aizj[]) defpackage.afga.aZ(arrayList2).toArray(new aizj[0]), 0));
    }

    public final void i(java.lang.Runnable runnable) {
        ((android.os.Handler) this.a).removeCallbacks(runnable);
    }

    public final void j(long j, java.lang.Runnable runnable) {
        ((android.os.Handler) this.a).postDelayed(runnable, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aclm, java.lang.Object] */
    public final synchronized void k(java.lang.Runnable runnable) {
        ((uwd) this.a.a()).h(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aclm, java.lang.Object] */
    public final void l() {
        ((uwd) this.a.a()).k();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aclm, java.lang.Object] */
    public final void m(java.lang.Runnable runnable) {
        ((uwd) this.a.a()).l(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aclm, java.lang.Object] */
    public final synchronized void n(java.lang.Runnable runnable) {
        ((uwd) this.a.a()).n(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aclm, java.lang.Object] */
    public final synchronized void o(java.lang.Runnable runnable) {
        ((uwd) this.a.a()).p(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aclm, java.lang.Object] */
    public final synchronized void p() {
        ((uwd) this.a.a()).o();
    }

    public final defpackage.zhw q() {
        defpackage.zhw zhwVar = (defpackage.zhw) ((java.util.concurrent.atomic.AtomicReference) this.a).getAndSet(null);
        zhwVar.getClass();
        return zhwVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tqb] */
    public final tpv r(abho abhoVar) {
        return new tpv(this.a.u(abhoVar), abhoVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tqb] */
    public final tpv s(abho abhoVar, java.lang.String str) {
        java.lang.String strU = this.a.u(abhoVar);
        return new tpv(!str.isEmpty() ? defpackage.a.bI(str, strU, ".") : strU, strU, abhoVar, false);
    }

    public final j$.time.Duration t() {
        return ((defpackage.xzg) this.a).c();
    }

    public final java.lang.Object u() {
        return ((defpackage.gka) this.a).e();
    }

    public final void v(java.lang.Object obj) {
        ((defpackage.gka) this.a).f(obj);
    }

    public final /* synthetic */ void w(int i) {
        y(i, new int[0]);
    }

    public final /* synthetic */ void x(int i, int i2) {
        y(i, i2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final void y(int i, int... iArr) {
        this.a.add(new defpackage.afau(java.lang.Integer.valueOf(i), iArr));
    }

    public gkc(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public gkc(java.lang.Object obj, char[] cArr) {
        this.a = obj;
    }

    public gkc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new defpackage.sxc();
    }

    public gkc(char[] cArr, byte[] bArr) {
        this.a = new defpackage.gkc(null, null, null);
    }

    public gkc(fbw fbwVar) {
        fbwVar.getClass();
        this.a = fbwVar;
    }

    public gkc(fto ftoVar) {
        this.a = defpackage.afga.Y(ftoVar.b);
    }

    public gkc(defpackage.xzo xzoVar) {
        this.a = defpackage.xzg.b(xzoVar);
    }

    public gkc(byte[] bArr) {
        this.a = new java.util.ArrayList();
    }

    public gkc(short[] sArr) {
        this.a = new java.util.ArrayList();
    }

    public gkc(fuj fujVar) {
        fujVar.getClass();
        this.a = fujVar;
    }

    public gkc(tqb tqbVar) {
        tqbVar.getClass();
        this.a = tqbVar;
    }

    public gkc(char[] cArr) {
        this.a = hh$.ExternalSyntheticApiModelOutline0.m(android.os.Looper.getMainLooper());
    }

    public gkc() {
        this.a = new java.util.WeakHashMap();
    }

    public gkc(pmk pmkVar, java.util.concurrent.Executor executor) {
        this.a = pmkVar;
        pmkVar.a().e(new ttg(1), executor);
    }

    public gkc(fof fofVar) {
        fofVar.getClass();
        this.a = fofVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, vav] */
    public gkc(defpackage.kez kezVar, java.util.concurrent.Executor executor) {
        this.a = kezVar;
        kezVar.b.e(new ttg(0), executor);
    }

    public gkc(java.lang.Object obj) {
        this.a = new defpackage.gka(obj, (defpackage.afer) new tja(7), (defpackage.afer) new tja(8));
    }

    public gkc(defpackage.zhw zhwVar) {
        this.a = new java.util.concurrent.atomic.AtomicReference(zhwVar);
    }

    public gkc(tzm tzmVar) {
        tzk tzkVar = new tzk();
        this.a = tzkVar;
        tzmVar.d(tzkVar);
        tzkVar.b(new txg(this, tzmVar, 6, (byte[]) null));
    }
}
