package Q2;

import Pc.C0786b;
import Q1.k;
import Q1.x;
import java.util.ArrayDeque;
import y3.C4552j;

/* loaded from: classes.dex */
public abstract class h implements P2.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f9817a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f9818b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f9819c;

    /* renamed from: d, reason: collision with root package name */
    public g f9820d;

    /* renamed from: e, reason: collision with root package name */
    public long f9821e;

    /* renamed from: f, reason: collision with root package name */
    public long f9822f;

    /* renamed from: g, reason: collision with root package name */
    public long f9823g;

    public h() {
        for (int i5 = 0; i5 < 10; i5++) {
            this.f9817a.add(new g(1));
        }
        this.f9818b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f9818b;
            C0786b c0786b = new C0786b(this, 24);
            P2.c cVar = new P2.c();
            cVar.f9065h = c0786b;
            arrayDeque.add(cVar);
        }
        this.f9819c = new ArrayDeque();
        this.f9823g = -9223372036854775807L;
    }

    @Override // P2.e
    public final void a(long j8) {
        this.f9821e = j8;
    }

    @Override // T1.b
    public final Object c() {
        k.g(this.f9820d == null);
        ArrayDeque arrayDeque = this.f9817a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f9820d = gVar;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // T1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(P2.i r7) {
        /*
            r6 = this;
            Q2.g r0 = r6.f9820d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            Q1.k.c(r0)
            Q2.g r7 = (Q2.g) r7
            long r0 = r7.f11360g
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2c
            long r2 = r6.f9823g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r7.o()
            java.util.ArrayDeque r0 = r6.f9817a
            r0.add(r7)
            goto L3a
        L2c:
            long r0 = r6.f9822f
            r2 = 1
            long r2 = r2 + r0
            r6.f9822f = r2
            r7.k = r0
            java.util.ArrayDeque r0 = r6.f9819c
            r0.add(r7)
        L3a:
            r7 = 0
            r6.f9820d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.h.d(P2.i):void");
    }

    @Override // T1.b
    public final void e(long j8) {
        this.f9823g = j8;
    }

    public abstract C4552j f();

    @Override // T1.b
    public void flush() {
        ArrayDeque arrayDeque;
        this.f9822f = 0L;
        this.f9821e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f9819c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f9817a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            int i5 = x.f9724a;
            gVar.o();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f9820d;
        if (gVar2 != null) {
            gVar2.o();
            arrayDeque.add(gVar2);
            this.f9820d = null;
        }
    }

    public abstract void g(g gVar);

    @Override // T1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public P2.c b() {
        ArrayDeque arrayDeque = this.f9818b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f9819c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            g gVar = (g) arrayDeque2.peek();
            int i5 = x.f9724a;
            if (gVar.f11360g > this.f9821e) {
                return null;
            }
            g gVar2 = (g) arrayDeque2.poll();
            boolean zH = gVar2.h(4);
            ArrayDeque arrayDeque3 = this.f9817a;
            if (zH) {
                P2.c cVar = (P2.c) arrayDeque.pollFirst();
                cVar.b(4);
                gVar2.o();
                arrayDeque3.add(gVar2);
                return cVar;
            }
            g(gVar2);
            if (i()) {
                C4552j c4552jF = f();
                P2.c cVar2 = (P2.c) arrayDeque.pollFirst();
                long j8 = gVar2.f11360g;
                cVar2.f11363c = j8;
                cVar2.f9062e = c4552jF;
                cVar2.f9063f = j8;
                gVar2.o();
                arrayDeque3.add(gVar2);
                return cVar2;
            }
            gVar2.o();
            arrayDeque3.add(gVar2);
        }
    }

    public abstract boolean i();

    @Override // T1.b
    public void release() {
    }
}
