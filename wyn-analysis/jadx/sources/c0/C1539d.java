package c0;

import Va.M6;
import a2.v;
import kotlin.jvm.internal.AbstractC3340k;
import s0.InterfaceC3987a;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539d implements s0.b, InterfaceC3987a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19493a;

    /* renamed from: b, reason: collision with root package name */
    public C1539d f19494b;

    /* renamed from: c, reason: collision with root package name */
    public final P.d f19495c = new P.d(new C1539d[16]);

    /* renamed from: d, reason: collision with root package name */
    public final P.d f19496d = new P.d(new C1542g[16]);

    public C1539d(tf.l lVar) {
        this.f19493a = lVar;
    }

    public final void a(C1542g focusModifier) {
        AbstractC3340k.e(focusModifier, "focusModifier");
        this.f19496d.b(focusModifier);
        C1539d c1539d = this.f19494b;
        if (c1539d != null) {
            c1539d.a(focusModifier);
        }
    }

    public final void b(P.d dVar) {
        P.d dVar2 = this.f19496d;
        dVar2.c(dVar2.f8972c, dVar);
        C1539d c1539d = this.f19494b;
        if (c1539d != null) {
            c1539d.b(dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tf.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r10 = this;
            P.d r0 = r10.f19496d
            int r1 = r0.f8972c
            c0.r r2 = c0.r.f19539f
            if (r1 == 0) goto L5c
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L54
            r5 = 0
            if (r1 <= 0) goto L3f
            java.lang.Object[] r0 = r0.f8970a
            r6 = r5
        L12:
            r7 = r0[r4]
            c0.g r7 = (c0.C1542g) r7
            c0.r r8 = r7.f19500d
            int r8 = r8.ordinal()
            if (r8 == 0) goto L35
            if (r8 == r3) goto L35
            r9 = 2
            if (r8 == r9) goto L35
            r9 = 3
            if (r8 == r9) goto L30
            r9 = 4
            if (r8 == r9) goto L35
            r7 = 5
            if (r8 == r7) goto L2d
            goto L38
        L2d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L38
        L30:
            if (r5 != 0) goto L38
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L38
        L35:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = r7
        L38:
            int r4 = r4 + 1
            if (r4 < r1) goto L12
            r0 = r5
            r5 = r6
            goto L40
        L3f:
            r0 = r5
        L40:
            if (r5 == 0) goto L49
            c0.r r1 = r5.f19500d
            if (r1 != 0) goto L47
            goto L49
        L47:
            r2 = r1
            goto L5c
        L49:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.AbstractC3340k.a(r0, r1)
            if (r0 == 0) goto L5c
            c0.r r2 = c0.r.f19537d
            goto L5c
        L54:
            java.lang.Object[] r0 = r0.f8970a
            r0 = r0[r4]
            c0.g r0 = (c0.C1542g) r0
            c0.r r2 = r0.f19500d
        L5c:
            java.lang.Object r0 = r10.f19493a
            r0.invoke(r2)
            c0.d r0 = r10.f19494b
            if (r0 == 0) goto L68
            r0.c()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C1539d.c():void");
    }

    public final void d(C1542g focusModifier) {
        AbstractC3340k.e(focusModifier, "focusModifier");
        this.f19496d.k(focusModifier);
        C1539d c1539d = this.f19494b;
        if (c1539d != null) {
            c1539d.d(focusModifier);
        }
    }

    public final void f(P.d dVar) {
        this.f19496d.l(dVar);
        C1539d c1539d = this.f19494b;
        if (c1539d != null) {
            c1539d.f(dVar);
        }
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final v getKey() {
        return AbstractC1538c.f19492a;
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        AbstractC3340k.e(scope, "scope");
        v vVar = AbstractC1538c.f19492a;
        C1539d c1539d = (C1539d) scope.a(vVar);
        if (!AbstractC3340k.a(c1539d, this.f19494b)) {
            C1539d c1539d2 = this.f19494b;
            P.d dVar = this.f19496d;
            if (c1539d2 != null) {
                c1539d2.f19495c.k(this);
                c1539d2.f(dVar);
            }
            this.f19494b = c1539d;
            if (c1539d != null) {
                c1539d.f19495c.b(this);
                c1539d.b(dVar);
            }
        }
        this.f19494b = (C1539d) scope.a(vVar);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }

    @Override // s0.b
    public final Object getValue() {
        return this;
    }
}
