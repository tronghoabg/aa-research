package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.a.d f51926a = h.e.b.h(this);

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.d f51927b = h.e.b.h(this);

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.a.d f51928c = h.e.b.h(null);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r4.f51926a.e(r3, ((kotlinx.coroutines.e.af) r5).f51864a) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.e.z a() {
        /*
            r8 = this;
        L0:
            kotlinx.a.d r0 = r8.f51927b
            java.lang.Object r1 = r0.b()
            kotlinx.coroutines.e.z r1 = (kotlinx.coroutines.e.z) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            kotlinx.a.d r5 = r3.f51926a
            java.lang.Object r5 = r5.b()
            if (r5 != r8) goto L1d
            if (r1 != r3) goto L16
            goto L1c
        L16:
            boolean r0 = r0.e(r1, r3)
            if (r0 == 0) goto L0
        L1c:
            return r3
        L1d:
            boolean r6 = r8.bN()
            if (r6 == 0) goto L24
            return r2
        L24:
            boolean r6 = r5 instanceof kotlinx.coroutines.e.af
            if (r6 == 0) goto L41
            if (r4 == 0) goto L38
            kotlinx.coroutines.e.af r5 = (kotlinx.coroutines.e.af) r5
            kotlinx.coroutines.e.z r5 = r5.f51864a
            kotlinx.a.d r6 = r4.f51926a
            boolean r3 = r6.e(r3, r5)
            if (r3 == 0) goto L0
            r3 = r4
            goto La
        L38:
            kotlinx.a.d r3 = r3.f51927b
            java.lang.Object r3 = r3.b()
            kotlinx.coroutines.e.z r3 = (kotlinx.coroutines.e.z) r3
            goto Lb
        L41:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            h.g.b.x.d(r5, r4)
            r4 = r5
            kotlinx.coroutines.e.z r4 = (kotlinx.coroutines.e.z) r4
            r7 = r4
            r4 = r3
            r3 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e.z.a():kotlinx.coroutines.e.z");
    }

    private final void b(z zVar) {
        kotlinx.a.d dVar;
        z zVar2;
        do {
            dVar = zVar.f51927b;
            zVar2 = (z) dVar.b();
            if (g() != zVar) {
                return;
            }
        } while (!dVar.e(zVar2, this));
        if (bN()) {
            zVar.a();
        }
    }

    public boolean bN() {
        return g() instanceof af;
    }

    public final Object g() {
        return this.f51926a.b();
    }

    public final z h() {
        Object objG = g();
        af afVar = objG instanceof af ? (af) objG : null;
        if (afVar != null) {
            return afVar.f51864a;
        }
        h.g.b.x.d(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (z) objG;
    }

    public final z i() {
        z zVarA = a();
        if (zVarA != null) {
            return zVarA;
        }
        Object objB = this.f51927b.b();
        while (true) {
            z zVar = (z) objB;
            if (!zVar.bN()) {
                return zVar;
            }
            objB = zVar.f51927b.b();
        }
    }

    public final void j(int i2) {
        k(new w(i2), i2);
    }

    public final boolean k(z zVar, int i2) {
        z zVarI;
        do {
            zVarI = i();
            if (zVarI instanceof w) {
                return (((w) zVarI).f51925a & i2) == 0 && zVarI.k(zVar, i2);
            }
            zVar.f51927b.c(zVarI);
            zVar.f51926a.c(this);
        } while (!zVarI.f51926a.e(this, zVar));
        zVar.b(this);
        return true;
    }

    public final void l(z zVar) {
        zVar.f51927b.c(this);
        zVar.f51926a.c(this);
        while (g() == this) {
            if (this.f51926a.e(this, zVar)) {
                zVar.b(this);
                return;
            }
        }
    }

    public final void m() {
        Object objG;
        z zVar;
        af afVar;
        do {
            objG = g();
            if (objG instanceof af) {
                z zVar2 = ((af) objG).f51864a;
                return;
            }
            if (objG == this) {
                return;
            }
            h.g.b.x.d(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            zVar = (z) objG;
            kotlinx.a.d dVar = zVar.f51928c;
            afVar = (af) dVar.b();
            if (afVar == null) {
                afVar = new af(zVar);
                dVar.c(afVar);
            }
        } while (!this.f51926a.e(objG, afVar));
        zVar.a();
    }

    public String toString() {
        return new h.g.b.ah(this) { // from class: kotlinx.coroutines.e.y
            @Override // h.g.b.ah, h.l.n
            public final Object get() {
                return kotlinx.coroutines.aj.a(this.receiver);
            }
        } + "@" + kotlinx.coroutines.aj.b(this);
    }
}
