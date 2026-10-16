package D0;

import L0.i;
import android.util.SparseArray;
import c8.C1581e;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3343n;
import r0.s;
import t0.C4070r;
import tf.l;
import y1.C4531l;
import z1.C4608a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2257a;

    /* renamed from: b, reason: collision with root package name */
    public int f2258b;

    /* renamed from: c, reason: collision with root package name */
    public int f2259c;

    /* renamed from: d, reason: collision with root package name */
    public int f2260d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2261e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2262f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2263g;

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i5, int i10, Map map, C4070r c4070r, l lVar) {
        this.f2257a = 1;
        this.f2260d = i5;
        this.f2262f = c4070r;
        this.f2263g = (AbstractC3343n) lVar;
        this.f2258b = i5;
        this.f2259c = i10;
        this.f2261e = map;
    }

    public int a(int i5) {
        SparseArray sparseArray = ((C4531l) this.f2262f).f47949a;
        C4531l c4531l = sparseArray == null ? null : (C4531l) sparseArray.get(i5);
        int i10 = 1;
        int i11 = 2;
        if (this.f2258b == 2) {
            if (c4531l != null) {
                this.f2262f = c4531l;
                this.f2260d++;
            } else if (i5 == 65038) {
                f();
            } else if (i5 != 65039) {
                C4531l c4531l2 = (C4531l) this.f2262f;
                if (c4531l2.f47950b != null) {
                    i11 = 3;
                    if (this.f2260d != 1) {
                        this.f2263g = c4531l2;
                        f();
                    } else if (g()) {
                        this.f2263g = (C4531l) this.f2262f;
                        f();
                    } else {
                        f();
                    }
                } else {
                    f();
                }
            }
            i10 = i11;
        } else if (c4531l == null) {
            f();
        } else {
            this.f2258b = 2;
            this.f2262f = c4531l;
            this.f2260d = 1;
            i10 = i11;
        }
        this.f2259c = i5;
        return i10;
    }

    public Object b(Object obj) {
        synchronized (((C1581e) this.f2261e)) {
            Object obj2 = ((HashMap) this.f2262f).get(obj);
            if (obj2 == null) {
                this.f2260d++;
                return null;
            }
            ((LinkedHashSet) this.f2263g).remove(obj);
            ((LinkedHashSet) this.f2263g).add(obj);
            this.f2259c++;
            return obj2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.n, tf.l] */
    public void c() {
        s sVar = s.f44304a;
        i iVar = ((C4070r) this.f2262f).f45488a.f45525p;
        int i5 = s.f44306c;
        i iVar2 = s.f44305b;
        s.f44306c = this.f2260d;
        s.f44305b = iVar;
        ((AbstractC3343n) this.f2263g).invoke(sVar);
        s.f44306c = i5;
        s.f44305b = iVar2;
    }

    public Object d(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw null;
        }
        synchronized (((C1581e) this.f2261e)) {
            try {
                this.f2258b = h() + 1;
                objPut = ((HashMap) this.f2262f).put(obj, obj2);
                if (objPut != null) {
                    this.f2258b = h() - 1;
                }
                if (((LinkedHashSet) this.f2263g).contains(obj)) {
                    ((LinkedHashSet) this.f2263g).remove(obj);
                }
                ((LinkedHashSet) this.f2263g).add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
        return objPut;
    }

    public Object e(Object obj) {
        Object objRemove;
        synchronized (((C1581e) this.f2261e)) {
            objRemove = ((HashMap) this.f2262f).remove(obj);
            ((LinkedHashSet) this.f2263g).remove(obj);
            if (objRemove != null) {
                this.f2258b = h() - 1;
            }
        }
        return objRemove;
    }

    public void f() {
        this.f2258b = 1;
        this.f2262f = (C4531l) this.f2261e;
        this.f2260d = 0;
    }

    public boolean g() {
        C4608a c4608aB = ((C4531l) this.f2262f).f47950b.b();
        int iA = c4608aB.a(6);
        return !(iA == 0 || ((ByteBuffer) c4608aB.f35893d).get(iA + c4608aB.f35890a) == 0) || this.f2259c == 65039;
    }

    public int h() {
        int i5;
        synchronized (((C1581e) this.f2261e)) {
            i5 = this.f2258b;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            r4 = this;
        L0:
            java.lang.Object r0 = r4.f2261e
            c8.e r0 = (c8.C1581e) r0
            monitor-enter(r0)
            int r1 = r4.h()     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L8e
            java.lang.Object r1 = r4.f2262f     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            int r1 = r4.h()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L8e
            goto L1f
        L1c:
            r1 = move-exception
            goto L96
        L1f:
            java.lang.Object r1 = r4.f2262f     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r4.f2263g     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 != r2) goto L8e
            int r1 = r4.h()     // Catch: java.lang.Throwable -> L1c
            r2 = 16
            if (r1 <= r2) goto L7e
            java.lang.Object r1 = r4.f2262f     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L7e
            java.lang.Object r1 = r4.f2263g     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = ff.o.p0(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r4.f2262f     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L76
            java.lang.Object r3 = r4.f2262f     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L1c
            java.util.Map r3 = kotlin.jvm.internal.K.c(r3)     // Catch: java.lang.Throwable -> L1c
            r3.remove(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r4.f2263g     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.K.a(r3)     // Catch: java.lang.Throwable -> L1c
            r3.remove(r1)     // Catch: java.lang.Throwable -> L1c
            int r3 = r4.h()     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.AbstractC3340k.b(r1)     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + (-1)
            r4.f2258b = r3     // Catch: java.lang.Throwable -> L1c
            goto L80
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "inconsistent state"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L7e:
            r1 = 0
            r2 = r1
        L80:
            monitor-exit(r0)
            if (r1 != 0) goto L86
            if (r2 != 0) goto L86
            return
        L86:
            kotlin.jvm.internal.AbstractC3340k.b(r1)
            kotlin.jvm.internal.AbstractC3340k.b(r2)
            goto L0
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "map/keySet size inconsistency"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L96:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.b.i():void");
    }

    public String toString() {
        String str;
        switch (this.f2257a) {
            case 0:
                synchronized (((C1581e) this.f2261e)) {
                    try {
                        int i5 = this.f2259c;
                        int i10 = this.f2260d + i5;
                        str = "LruCache[maxSize=16,hits=" + this.f2259c + ",misses=" + this.f2260d + ",hitRate=" + (i10 != 0 ? (i5 * 100) / i10 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public b() {
        this.f2257a = 0;
        this.f2261e = new C1581e(19);
        this.f2262f = new HashMap(0, 0.75f);
        this.f2263g = new LinkedHashSet();
    }

    public b(C4531l c4531l) {
        this.f2257a = 2;
        this.f2258b = 1;
        this.f2261e = c4531l;
        this.f2262f = c4531l;
    }
}
