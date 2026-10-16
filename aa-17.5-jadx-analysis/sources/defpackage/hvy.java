package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class hvy implements Runnable, Comparable, hvv, igd {
    public static final hul a = new hul("glide_thread_priority_override", null, hul.a);
    private Object A;
    private huv B;
    private volatile boolean C;
    private boolean D;
    private int E;
    private int F;
    public hsf c;
    public hui d;
    public hsh e;
    public hwp f;
    public int g;
    public int h;
    public hwf i;
    public hum j;
    public int k;
    public Supplier l;
    public hui m;
    public volatile hvw n;
    public volatile boolean o;
    public int p;
    public final hwh q;
    public hwn r;
    public htm u;
    private final dzk w;
    private long x;
    private Thread y;
    private hui z;
    public final hvx b = new hvx();
    private final List v = new ArrayList();
    private final sro G = new sro();
    public final sb s = new sb((byte[]) null);
    public final utx t = new utx();

    public hvy(hwh hwhVar, dzk dzkVar) {
        this.q = hwhVar;
        this.w = dzkVar;
    }

    private final hvw g() {
        int i = this.E;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new hwy(this.b, this);
        }
        if (i2 == 2) {
            hvx hvxVar = this.b;
            return new hvt(hvxVar.d(), hvxVar, this);
        }
        if (i2 == 3) {
            return new hxb(this.b, this);
        }
        if (i2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(hdv.d(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d8 A[LOOP:1: B:43:0x00f9->B:131:0x02d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ef A[Catch: all -> 0x0325, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0325, blocks: (B:136:0x02ef, B:146:0x031f, B:147:0x0324), top: B:230:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030f A[Catch: all -> 0x02e9, TRY_ENTER, TryCatch #8 {all -> 0x02e9, blocks: (B:44:0x00fb, B:45:0x0102, B:49:0x011d, B:51:0x012c, B:53:0x0140, B:56:0x0148, B:58:0x0154, B:60:0x015a, B:62:0x0162, B:68:0x0173, B:70:0x017d, B:72:0x0186, B:74:0x0192, B:76:0x0198, B:78:0x019f, B:88:0x01e3, B:90:0x01e9, B:91:0x01ec, B:93:0x0200, B:95:0x0212, B:99:0x0223, B:101:0x0232, B:106:0x024b, B:109:0x0257, B:111:0x025b, B:113:0x0286, B:112:0x027d, B:114:0x0293, B:115:0x02a0, B:116:0x02a1, B:104:0x0247, B:96:0x0217, B:97:0x0220, B:128:0x02d2, B:63:0x0165, B:65:0x0169, B:85:0x01c5, B:122:0x02b3, B:123:0x02c2, B:142:0x030f, B:143:0x031b), top: B:239:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02eb A[EDGE_INSN: B:258:0x02eb->B:134:0x02eb BREAK  A[LOOP:1: B:43:0x00f9->B:131:0x02d8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5 A[Catch: hwt -> 0x02c3, all -> 0x02e9, TryCatch #8 {all -> 0x02e9, blocks: (B:44:0x00fb, B:45:0x0102, B:49:0x011d, B:51:0x012c, B:53:0x0140, B:56:0x0148, B:58:0x0154, B:60:0x015a, B:62:0x0162, B:68:0x0173, B:70:0x017d, B:72:0x0186, B:74:0x0192, B:76:0x0198, B:78:0x019f, B:88:0x01e3, B:90:0x01e9, B:91:0x01ec, B:93:0x0200, B:95:0x0212, B:99:0x0223, B:101:0x0232, B:106:0x024b, B:109:0x0257, B:111:0x025b, B:113:0x0286, B:112:0x027d, B:114:0x0293, B:115:0x02a0, B:116:0x02a1, B:104:0x0247, B:96:0x0217, B:97:0x0220, B:128:0x02d2, B:63:0x0165, B:65:0x0169, B:85:0x01c5, B:122:0x02b3, B:123:0x02c2, B:142:0x030f, B:143:0x031b), top: B:239:0x00fb }] */
    /* JADX WARN: Type inference failed for: r0v72, types: [hui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [hui, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvy.h():void");
    }

    private final void i(String str, long j, String str2) {
        double dA = ift.a(j);
        String strValueOf = String.valueOf(this.f);
        String strConcat = str2 != null ? ", ".concat(str2) : "";
        Log.v("DecodeJob", str + " in " + dA + ", load key: " + strValueOf + strConcat + ", thread: " + Thread.currentThread().getName());
    }

    private final void j() throws SecurityException, IllegalArgumentException {
        if (this.u.a(hrz.class)) {
            k();
        }
        m();
        hwt hwtVar = new hwt("Failed to load resource", new ArrayList(this.v));
        hwn hwnVar = this.r;
        synchronized (hwnVar) {
            hwnVar.h = hwtVar;
        }
        synchronized (hwnVar) {
            hwnVar.m.a();
            if (hwnVar.k) {
                hwnVar.e();
            } else {
                hwm hwmVar = hwnVar.a;
                if (hwmVar.d()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (hwnVar.i) {
                    throw new IllegalStateException("Already failed once");
                }
                hwnVar.i = true;
                hui huiVar = hwnVar.d;
                hwm hwmVarB = hwmVar.b();
                hwnVar.d(hwmVarB.a() + 1);
                hwnVar.c.c(hwnVar, huiVar, null);
                Iterator<hwl> it = hwmVarB.iterator();
                while (it.hasNext()) {
                    hwl next = it.next();
                    next.b.execute(new hwk(hwnVar, next.a, 1));
                }
                hwnVar.c();
            }
        }
        if (this.t.c()) {
            a();
        }
    }

    private final void k() throws SecurityException, IllegalArgumentException {
        if (!this.u.a(hrz.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.l;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.l = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    private final void l() throws SecurityException, IllegalArgumentException {
        this.y = Thread.currentThread();
        int i = ift.a;
        this.x = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.o && this.n != null && !(zB = this.n.b())) {
            this.E = b(this.E);
            this.n = g();
            if (this.E == 4) {
                e(2);
                return;
            }
        }
        if ((this.E == 6 || this.o) && !zB) {
            j();
        }
    }

    private final void m() {
        this.G.a();
        if (this.C) {
            List list = this.v;
            throw new IllegalStateException("Already notified", list.isEmpty() ? null : (Throwable) list.get(list.size() - 1));
        }
        this.C = true;
    }

    public final void a() {
        this.t.a();
        sb sbVar = this.s;
        sbVar.c = null;
        sbVar.a = null;
        sbVar.b = null;
        hvx hvxVar = this.b;
        hvxVar.c = null;
        hvxVar.d = null;
        hvxVar.m = null;
        hvxVar.g = null;
        hvxVar.j = null;
        hvxVar.h = null;
        hvxVar.n = null;
        hvxVar.i = null;
        hvxVar.o = null;
        hvxVar.a.clear();
        hvxVar.k = false;
        hvxVar.b.clear();
        hvxVar.l = false;
        this.C = false;
        this.c = null;
        this.d = null;
        this.j = null;
        this.e = null;
        this.f = null;
        this.r = null;
        this.E = 0;
        this.n = null;
        this.y = null;
        this.m = null;
        this.A = null;
        this.F = 0;
        this.B = null;
        this.x = 0L;
        this.o = false;
        this.v.clear();
        this.w.b(this);
    }

    public final int b(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.i.b()) {
                return 2;
            }
            return b(2);
        }
        if (i2 == 1) {
            if (this.i.a()) {
                return 3;
            }
            return b(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(hdv.d(i)));
    }

    @Override // defpackage.hvv
    public final void c(hui huiVar, Exception exc, huv huvVar, int i) throws SecurityException, IllegalArgumentException {
        huvVar.c();
        hwt hwtVar = new hwt("Fetching data failed", Collections.singletonList(exc));
        hwtVar.c(huiVar, i, huvVar.a());
        this.v.add(hwtVar);
        if (Thread.currentThread() != this.y) {
            e(2);
        } else {
            l();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hvy hvyVar = (hvy) obj;
        int iCompareTo = this.e.compareTo(hvyVar.e);
        return iCompareTo == 0 ? this.k - hvyVar.k : iCompareTo;
    }

    @Override // defpackage.hvv
    public final void d(hui huiVar, Object obj, huv huvVar, int i, hui huiVar2) throws Throwable {
        this.m = huiVar;
        this.A = obj;
        this.B = huvVar;
        this.F = i;
        this.z = huiVar2;
        this.D = huiVar != this.b.d().get(0);
        if (Thread.currentThread() == this.y) {
            h();
        } else {
            e(3);
        }
    }

    public final void e(int i) {
        this.p = i;
        this.r.a().execute(this);
    }

    @Override // defpackage.igd
    public final sro f() {
        return this.G;
    }

    @Override // java.lang.Runnable
    public final void run() {
        huv huvVar = this.B;
        try {
            try {
                if (this.o) {
                    j();
                } else {
                    int i = this.p;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        this.E = b(1);
                        this.n = g();
                        l();
                    } else if (i2 == 1) {
                        l();
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                        }
                        h();
                    }
                }
            } finally {
                if (huvVar != null) {
                    huvVar.c();
                }
            }
        } catch (hvs e) {
            throw e;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.o + ", stage: " + hdv.d(this.E), th);
            }
            if (this.E != 5) {
                this.v.add(th);
                j();
            }
            if (!this.o) {
                throw th;
            }
            throw th;
        }
    }
}
