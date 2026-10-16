package W5;

import A7.AbstractC0279p0;
import E5.AbstractC0449f;
import E5.C0448e0;
import E5.C0450f0;
import E5.F;
import E5.I;
import E5.T;
import K8.H;
import S3.s;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class f extends AbstractC0449f implements Handler.Callback {

    /* renamed from: m, reason: collision with root package name */
    public final d f15153m;

    /* renamed from: n, reason: collision with root package name */
    public final F f15154n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f15155o;

    /* renamed from: p, reason: collision with root package name */
    public final e f15156p;

    /* renamed from: q, reason: collision with root package name */
    public ic.d f15157q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15158r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15159s;

    /* renamed from: t, reason: collision with root package name */
    public long f15160t;

    /* renamed from: u, reason: collision with root package name */
    public c f15161u;

    /* renamed from: v, reason: collision with root package name */
    public long f15162v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(F f10, Looper looper) {
        Handler handler;
        super(5);
        d dVar = d.f15151a;
        this.f15154n = f10;
        if (looper == null) {
            handler = null;
        } else {
            int i5 = v.f46721a;
            handler = new Handler(looper, this);
        }
        this.f15155o = handler;
        this.f15153m = dVar;
        this.f15156p = new e(1);
        this.f15162v = -9223372036854775807L;
    }

    public final void A(c cVar) {
        F f10 = this.f15154n;
        I i5 = f10.f3030a;
        C0448e0 c0448e0A = i5.f3087i0.a();
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.f15149a;
            if (i10 >= bVarArr.length) {
                break;
            }
            bVarArr[i10].d(c0448e0A);
            i10++;
        }
        i5.f3087i0 = new C0450f0(c0448e0A);
        C0450f0 c0450f0E0 = i5.e0();
        boolean zEquals = c0450f0E0.equals(i5.f3060P);
        H h10 = i5.f3091l;
        if (!zEquals) {
            i5.f3060P = c0450f0E0;
            h10.o(14, new B8.b(f10, 7));
        }
        h10.o(28, new B8.b(cVar, 8));
        h10.m();
    }

    @Override // E5.AbstractC0449f
    public final String f() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        A((c) message.obj);
        return true;
    }

    @Override // E5.AbstractC0449f
    public final boolean i() {
        return this.f15159s;
    }

    @Override // E5.AbstractC0449f
    public final boolean j() {
        return true;
    }

    @Override // E5.AbstractC0449f
    public final void k() {
        this.f15161u = null;
        this.f15157q = null;
        this.f15162v = -9223372036854775807L;
    }

    @Override // E5.AbstractC0449f
    public final void m(long j8, boolean z2) {
        this.f15161u = null;
        this.f15158r = false;
        this.f15159s = false;
    }

    @Override // E5.AbstractC0449f
    public final void q(T[] tArr, long j8, long j10) {
        this.f15157q = this.f15153m.a(tArr[0]);
        c cVar = this.f15161u;
        if (cVar != null) {
            long j11 = this.f15162v;
            long j12 = cVar.f15150b;
            long j13 = (j11 + j12) - j10;
            if (j12 != j13) {
                cVar = new c(j13, cVar.f15149a);
            }
            this.f15161u = cVar;
        }
        this.f15162v = j10;
    }

    @Override // E5.AbstractC0449f
    public final void s(long j8, long j10) {
        boolean z2 = true;
        while (z2) {
            if (!this.f15158r && this.f15161u == null) {
                e eVar = this.f15156p;
                eVar.o();
                s sVar = this.f3346b;
                sVar.e();
                int iR = r(sVar, eVar, 0);
                if (iR == -4) {
                    if (eVar.h(4)) {
                        this.f15158r = true;
                    } else {
                        eVar.f15152i = this.f15160t;
                        eVar.s();
                        ic.d dVar = this.f15157q;
                        int i5 = v.f46721a;
                        c cVarQ = dVar.q(eVar);
                        if (cVarQ != null) {
                            ArrayList arrayList = new ArrayList(cVarQ.f15149a.length);
                            y(cVarQ, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f15161u = new c(z(eVar.f4919f), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (iR == -5) {
                    T t10 = (T) sVar.f11010c;
                    t10.getClass();
                    this.f15160t = t10.f3242p;
                }
            }
            c cVar = this.f15161u;
            if (cVar == null || cVar.f15150b > z(j8)) {
                z2 = false;
            } else {
                c cVar2 = this.f15161u;
                Handler handler = this.f15155o;
                if (handler != null) {
                    handler.obtainMessage(0, cVar2).sendToTarget();
                } else {
                    A(cVar2);
                }
                this.f15161u = null;
                z2 = true;
            }
            if (this.f15158r && this.f15161u == null) {
                this.f15159s = true;
            }
        }
    }

    @Override // E5.AbstractC0449f
    public final int w(T t10) {
        if (this.f15153m.b(t10)) {
            return AbstractC0279p0.e(t10.f3226E == 0 ? 4 : 2, 0, 0);
        }
        return AbstractC0279p0.e(0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(W5.c r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            W5.b[] r1 = r6.f15149a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            E5.T r2 = r2.a()
            if (r2 == 0) goto L3e
            W5.d r3 = r5.f15153m
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L3e
            ic.d r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.b()
            r1.getClass()
            W5.e r3 = r5.f15156p
            r3.o()
            int r4 = r1.length
            r3.r(r4)
            java.nio.ByteBuffer r4 = r3.f4917d
            r4.put(r1)
            r3.s()
            W5.c r1 = r2.q(r3)
            if (r1 == 0) goto L43
            r5.y(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.f.y(W5.c, java.util.ArrayList):void");
    }

    public final long z(long j8) {
        AbstractC4256a.i(j8 != -9223372036854775807L);
        AbstractC4256a.i(this.f15162v != -9223372036854775807L);
        return j8 - this.f15162v;
    }
}
