package e2;

import N1.A;
import N1.B;
import N1.C0765n;
import N1.C0775y;
import N1.z;
import Q1.j;
import Q1.k;
import Q1.x;
import R8.v;
import S3.c;
import U1.AbstractC0834d;
import U1.C0850u;
import U1.r;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ic.d;
import java.util.ArrayList;
import k2.H;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2469b extends AbstractC0834d implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public long f34404A;

    /* renamed from: r, reason: collision with root package name */
    public final C2468a f34405r;

    /* renamed from: s, reason: collision with root package name */
    public final r f34406s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f34407t;

    /* renamed from: u, reason: collision with root package name */
    public final B2.a f34408u;

    /* renamed from: v, reason: collision with root package name */
    public d f34409v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34410w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f34411x;

    /* renamed from: y, reason: collision with root package name */
    public long f34412y;

    /* renamed from: z, reason: collision with root package name */
    public B f34413z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2469b(r rVar, Looper looper) {
        super(5);
        C2468a c2468a = C2468a.f34403a;
        this.f34406s = rVar;
        this.f34407t = looper == null ? null : new Handler(looper, this);
        this.f34405r = c2468a;
        this.f34408u = new B2.a(1);
        this.f34404A = -9223372036854775807L;
    }

    @Override // U1.AbstractC0834d
    public final void D() {
        this.f34413z = null;
        this.f34409v = null;
        this.f34404A = -9223372036854775807L;
    }

    @Override // U1.AbstractC0834d
    public final void F(long j8, boolean z2) {
        this.f34413z = null;
        this.f34410w = false;
        this.f34411x = false;
    }

    @Override // U1.AbstractC0834d
    public final void K(C0765n[] c0765nArr, long j8, long j10, H h10) {
        this.f34409v = this.f34405r.a(c0765nArr[0]);
        B b5 = this.f34413z;
        if (b5 != null) {
            long j11 = this.f34404A;
            long j12 = b5.f8024b;
            long j13 = (j11 + j12) - j10;
            if (j12 != j13) {
                b5 = new B(j13, b5.f8023a);
            }
            this.f34413z = b5;
        }
        this.f34404A = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(N1.B r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            N1.A[] r1 = r6.f8023a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            N1.n r2 = r2.a()
            if (r2 == 0) goto L3e
            e2.a r3 = r5.f34405r
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L3e
            ic.d r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.b()
            r1.getClass()
            B2.a r3 = r5.f34408u
            r3.o()
            int r4 = r1.length
            r3.r(r4)
            java.nio.ByteBuffer r4 = r3.f11358e
            r4.put(r1)
            r3.s()
            N1.B r1 = r2.o(r3)
            if (r1 == 0) goto L43
            r5.M(r1, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: e2.C2469b.M(N1.B, java.util.ArrayList):void");
    }

    public final long N(long j8) {
        k.g(j8 != -9223372036854775807L);
        k.g(this.f34404A != -9223372036854775807L);
        return j8 - this.f34404A;
    }

    @Override // U1.AbstractC0834d, U1.W
    public final boolean b() {
        return this.f34411x;
    }

    @Override // U1.X
    public final int d(C0765n c0765n) {
        if (this.f34405r.b(c0765n)) {
            return v.a(c0765n.L == 0 ? 4 : 2, 0, 0, 0);
        }
        return v.a(0, 0, 0, 0);
    }

    @Override // U1.W, U1.X
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        B b5 = (B) message.obj;
        r rVar = this.f34406s;
        C0850u c0850u = rVar.f12116a;
        C0775y c0775yA = c0850u.f12150c0.a();
        int i5 = 0;
        while (true) {
            A[] aArr = b5.f8023a;
            if (i5 >= aArr.length) {
                break;
            }
            aArr[i5].P(c0775yA);
            i5++;
        }
        c0850u.f12150c0 = new z(c0775yA);
        z zVarG0 = c0850u.g0();
        boolean zEquals = zVarG0.equals(c0850u.L);
        j jVar = c0850u.f12161l;
        if (!zEquals) {
            c0850u.L = zVarG0;
            jVar.c(14, new S8.b(rVar, 4));
        }
        jVar.c(28, new S8.b(b5, 5));
        jVar.b();
        return true;
    }

    @Override // U1.W
    public final boolean isReady() {
        return true;
    }

    @Override // U1.W
    public final void v(long j8, long j10) {
        boolean z2 = true;
        while (z2) {
            int i5 = 0;
            if (!this.f34410w && this.f34413z == null) {
                B2.a aVar = this.f34408u;
                aVar.o();
                c cVar = this.f12032c;
                cVar.i();
                int iL = L(cVar, aVar, 0);
                if (iL == -4) {
                    if (aVar.h(4)) {
                        this.f34410w = true;
                    } else if (aVar.f11360g >= this.f12040l) {
                        aVar.f1573j = this.f34412y;
                        aVar.s();
                        d dVar = this.f34409v;
                        int i10 = x.f9724a;
                        B bO = dVar.o(aVar);
                        if (bO != null) {
                            ArrayList arrayList = new ArrayList(bO.f8023a.length);
                            M(bO, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f34413z = new B(N(aVar.f11360g), (A[]) arrayList.toArray(new A[0]));
                            }
                        }
                    }
                } else if (iL == -5) {
                    C0765n c0765n = (C0765n) cVar.f10937c;
                    c0765n.getClass();
                    this.f34412y = c0765n.f8237s;
                }
            }
            B b5 = this.f34413z;
            if (b5 == null || b5.f8024b > N(j8)) {
                z2 = false;
            } else {
                B b10 = this.f34413z;
                Handler handler = this.f34407t;
                if (handler != null) {
                    handler.obtainMessage(1, b10).sendToTarget();
                } else {
                    r rVar = this.f34406s;
                    C0850u c0850u = rVar.f12116a;
                    C0775y c0775yA = c0850u.f12150c0.a();
                    while (true) {
                        A[] aArr = b10.f8023a;
                        if (i5 >= aArr.length) {
                            break;
                        }
                        aArr[i5].P(c0775yA);
                        i5++;
                    }
                    c0850u.f12150c0 = new z(c0775yA);
                    z zVarG0 = c0850u.g0();
                    boolean zEquals = zVarG0.equals(c0850u.L);
                    j jVar = c0850u.f12161l;
                    if (!zEquals) {
                        c0850u.L = zVarG0;
                        jVar.c(14, new S8.b(rVar, 4));
                    }
                    jVar.c(28, new S8.b(b10, 5));
                    jVar.b();
                }
                this.f34413z = null;
                z2 = true;
            }
            if (this.f34410w && this.f34413z == null) {
                this.f34411x = true;
            }
        }
    }
}
