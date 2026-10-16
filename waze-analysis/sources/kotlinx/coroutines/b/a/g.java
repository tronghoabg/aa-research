package kotlinx.coroutines.b.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class g<S, T> extends e<T> {

    /* renamed from: d, reason: collision with root package name */
    protected final kotlinx.coroutines.b.k f51411d;

    public g(kotlinx.coroutines.b.k kVar, h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        super(jVar, i2, aVar);
        this.f51411d = kVar;
    }

    @Override // kotlinx.coroutines.b.a.e
    protected final Object a(kotlinx.coroutines.a.ad adVar, h.c.e eVar) {
        Object objF = f(new af(adVar), eVar);
        return objF == h.c.a.a.f48038a ? objF : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // kotlinx.coroutines.b.a.e, kotlinx.coroutines.b.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.b.l<? super T> r5, h.c.e<? super h.ab> r6) {
        /*
            r4 = this;
            int r0 = r4.f51405b
            r1 = -3
            if (r0 != r1) goto L5a
            h.c.j r0 = r6.getContext()
            h.c.j r1 = r4.f51404a
            h.c.j r1 = kotlinx.coroutines.y.a(r0, r1)
            boolean r2 = h.g.b.x.n(r1, r0)
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r4.f(r5, r6)
            h.c.a.a r5 = h.c.a.a.f48038a
            if (r4 != r5) goto L63
            return r4
        L1e:
            h.c.f r2 = h.c.g.f48059a
            h.c.i r2 = (h.c.i) r2
            h.c.h r3 = r1.get(r2)
            h.c.h r0 = r0.get(r2)
            boolean r0 = h.g.b.x.n(r3, r0)
            if (r0 == 0) goto L5a
            h.c.j r0 = r6.getContext()
            boolean r2 = r5 instanceof kotlinx.coroutines.b.a.af
            if (r2 != 0) goto L44
            boolean r2 = r5 instanceof kotlinx.coroutines.b.a.aa
            if (r2 != 0) goto L44
            kotlinx.coroutines.b.a.ai r2 = new kotlinx.coroutines.b.a.ai
            r2.<init>(r5, r0)
            r5 = r2
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5
        L44:
            kotlinx.coroutines.b.a.f r0 = new kotlinx.coroutines.b.a.f
            r2 = 0
            r3 = 0
            r0.<init>(r4, r2, r3)
            h.g.a.p r0 = (h.g.a.p) r0
            java.lang.Object r4 = kotlinx.coroutines.e.ap.a(r1)
            java.lang.Object r4 = kotlinx.coroutines.b.a.x.d(r1, r5, r4, r0, r6)
            h.c.a.a r5 = h.c.a.a.f48038a
            if (r4 != r5) goto L63
            return r4
        L5a:
            java.lang.Object r4 = kotlinx.coroutines.b.a.e.g(r4, r5, r6)
            h.c.a.a r5 = h.c.a.a.f48038a
            if (r4 != r5) goto L63
            return r4
        L63:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.a.g.collect(kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }

    protected abstract Object f(kotlinx.coroutines.b.l lVar, h.c.e eVar);

    @Override // kotlinx.coroutines.b.a.e
    public final String toString() throws IOException {
        return this.f51411d + " -> " + super.toString();
    }
}
