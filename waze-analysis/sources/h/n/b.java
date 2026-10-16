package h.n;

import h.g.b.x;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f48224a;

    /* renamed from: b, reason: collision with root package name */
    private int f48225b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f48226c;

    /* renamed from: d, reason: collision with root package name */
    private int f48227d;

    /* renamed from: e, reason: collision with root package name */
    private h.k.j f48228e;

    /* renamed from: f, reason: collision with root package name */
    private int f48229f;

    b(c cVar) {
        this.f48224a = cVar;
        int iJ = h.k.n.j(0, 0, cVar.f48230a.length());
        this.f48226c = iJ;
        this.f48227d = iJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            r7 = this;
            int r0 = r7.f48227d
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f48225b = r1
            r0 = 0
            r7.f48228e = r0
            return
        Lb:
            h.n.c r2 = r7.f48224a
            int r3 = h.n.c.a(r2)
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L20
            int r3 = r7.f48229f
            int r3 = r3 + r5
            r7.f48229f = r3
            int r6 = h.n.c.a(r2)
            if (r3 >= r6) goto L2a
        L20:
            java.lang.CharSequence r3 = h.n.c.b(r2)
            int r3 = r3.length()
            if (r0 <= r3) goto L3e
        L2a:
            h.k.j r0 = new h.k.j
            int r1 = r7.f48226c
            java.lang.CharSequence r2 = h.n.c.b(r2)
            int r2 = h.n.o.r(r2)
            r0.<init>(r1, r2)
            r7.f48228e = r0
            r7.f48227d = r4
            goto L8d
        L3e:
            h.g.a.p r0 = h.n.c.c(r2)
            java.lang.CharSequence r3 = h.n.c.b(r2)
            int r6 = r7.f48227d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            h.k r0 = (h.k) r0
            if (r0 != 0) goto L68
            h.k.j r0 = new h.k.j
            int r1 = r7.f48226c
            java.lang.CharSequence r2 = h.n.c.b(r2)
            int r2 = h.n.o.r(r2)
            r0.<init>(r1, r2)
            r7.f48228e = r0
            r7.f48227d = r4
            goto L8d
        L68:
            java.lang.Object r2 = r0.a()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.b()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f48226c
            h.k.j r3 = h.k.n.u(r3, r2)
            r7.f48228e = r3
            int r2 = r2 + r0
            r7.f48226c = r2
            if (r0 != 0) goto L8a
            r1 = r5
        L8a:
            int r2 = r2 + r1
            r7.f48227d = r2
        L8d:
            r7.f48225b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.n.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f48225b == -1) {
            a();
        }
        return this.f48225b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f48225b == -1) {
            a();
        }
        if (this.f48225b == 0) {
            throw new NoSuchElementException();
        }
        h.k.j jVar = this.f48228e;
        x.d(jVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f48228e = null;
        this.f48225b = -1;
        return jVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
