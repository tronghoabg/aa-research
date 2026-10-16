package i6;

import h6.C2785d;
import h6.C2791j;
import h6.InterfaceC2788g;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public abstract class h implements InterfaceC2788g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f36868a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f36869b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f36870c;

    /* renamed from: d, reason: collision with root package name */
    public g f36871d;

    /* renamed from: e, reason: collision with root package name */
    public long f36872e;

    /* renamed from: f, reason: collision with root package name */
    public long f36873f;

    public h() {
        for (int i5 = 0; i5 < 10; i5++) {
            this.f36868a.add(new g(1));
        }
        this.f36869b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f36869b;
            com.unity3d.services.core.webview.b bVar = new com.unity3d.services.core.webview.b(this, 10);
            C2785d c2785d = new C2785d();
            c2785d.f36190g = bVar;
            arrayDeque.add(c2785d);
        }
        this.f36870c = new PriorityQueue();
    }

    @Override // h6.InterfaceC2788g
    public final void a(long j8) {
        this.f36872e = j8;
    }

    @Override // H5.d
    public final Object c() {
        AbstractC4256a.i(this.f36871d == null);
        ArrayDeque arrayDeque = this.f36868a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f36871d = gVar;
        return gVar;
    }

    @Override // H5.d
    public final void d(C2791j c2791j) {
        AbstractC4256a.e(c2791j == this.f36871d);
        g gVar = (g) c2791j;
        if (gVar.h(Integer.MIN_VALUE)) {
            gVar.o();
            this.f36868a.add(gVar);
        } else {
            long j8 = this.f36873f;
            this.f36873f = 1 + j8;
            gVar.f36867j = j8;
            this.f36870c.add(gVar);
        }
        this.f36871d = null;
    }

    public abstract i e();

    public abstract void f(g gVar);

    @Override // H5.d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f36873f = 0L;
        this.f36872e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f36870c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f36868a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i5 = v.f46721a;
            gVar.o();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f36871d;
        if (gVar2 != null) {
            gVar2.o();
            arrayDeque.add(gVar2);
            this.f36871d = null;
        }
    }

    @Override // H5.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2785d b() {
        ArrayDeque arrayDeque = this.f36869b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f36870c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            g gVar = (g) priorityQueue.peek();
            int i5 = v.f46721a;
            if (gVar.f4919f > this.f36872e) {
                return null;
            }
            g gVar2 = (g) priorityQueue.poll();
            boolean zH = gVar2.h(4);
            ArrayDeque arrayDeque2 = this.f36868a;
            if (zH) {
                C2785d c2785d = (C2785d) arrayDeque.pollFirst();
                c2785d.b(4);
                gVar2.o();
                arrayDeque2.add(gVar2);
                return c2785d;
            }
            f(gVar2);
            if (h()) {
                i iVarE = e();
                C2785d c2785d2 = (C2785d) arrayDeque.pollFirst();
                c2785d2.q(gVar2.f4919f, iVarE, Long.MAX_VALUE);
                gVar2.o();
                arrayDeque2.add(gVar2);
                return c2785d2;
            }
            gVar2.o();
            arrayDeque2.add(gVar2);
        }
    }

    public abstract boolean h();

    @Override // H5.d
    public void release() {
    }
}
