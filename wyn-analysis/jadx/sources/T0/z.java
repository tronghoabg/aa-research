package t0;

import A.AbstractC0213f;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final t f45578a;

    /* renamed from: b, reason: collision with root package name */
    public final Y2.B f45579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f45580c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f45581d;

    /* renamed from: e, reason: collision with root package name */
    public final P.d f45582e;

    /* renamed from: f, reason: collision with root package name */
    public final long f45583f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f45584g;

    /* renamed from: h, reason: collision with root package name */
    public L0.a f45585h;

    public z(t root) {
        AbstractC3340k.e(root, "root");
        this.f45578a = root;
        this.f45579b = new Y2.B((byte) 0, 26);
        this.f45581d = new com.google.android.gms.ads.nativead.l(20);
        this.f45582e = new P.d(new InterfaceC4043H[16]);
        this.f45583f = 1L;
        this.f45584g = new ArrayList();
    }

    public final void a(boolean z2) {
        com.google.android.gms.ads.nativead.l lVar = this.f45581d;
        if (z2) {
            lVar.getClass();
            t rootNode = this.f45578a;
            AbstractC3340k.e(rootNode, "rootNode");
            P.d dVar = (P.d) lVar.f26356b;
            dVar.e();
            dVar.b(rootNode);
            rootNode.f45503I = true;
        }
        C4039D c4039d = C4039D.f45430b;
        P.d dVar2 = (P.d) lVar.f26356b;
        dVar2.n(c4039d);
        int i5 = dVar2.f8972c;
        if (i5 > 0) {
            int i10 = i5 - 1;
            Object[] objArr = dVar2.f8970a;
            do {
                t tVar = (t) objArr[i10];
                if (tVar.f45503I) {
                    com.google.android.gms.ads.nativead.l.h(tVar);
                }
                i10--;
            } while (i10 >= 0);
        }
        dVar2.e();
    }

    public final void b(t layoutNode) {
        AbstractC3340k.e(layoutNode, "layoutNode");
        Y2.B b5 = this.f45579b;
        if (((C4051P) b5.f16384c).isEmpty()) {
            return;
        }
        if (!this.f45580c) {
            throw new IllegalStateException("Check failed.");
        }
        if (layoutNode.f45505K) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        P.d dVarL = layoutNode.l();
        int i5 = dVarL.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                t tVar = (t) objArr[i10];
                if (tVar.f45505K && b5.B(tVar)) {
                    d(tVar);
                }
                if (!tVar.f45505K) {
                    b(tVar);
                }
                i10++;
            } while (i10 < i5);
        }
        if (layoutNode.f45505K && b5.B(layoutNode)) {
            d(layoutNode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(C4068p c4068p) {
        boolean z2;
        Y2.B b5 = this.f45579b;
        t tVar = this.f45578a;
        if (!tVar.r()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!tVar.f45528s) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f45580c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i5 = 0;
        Object[] objArr = 0;
        if (this.f45585h != null) {
            this.f45580c = true;
            try {
                C4051P c4051p = (C4051P) b5.f16384c;
                C4051P c4051p2 = (C4051P) b5.f16384c;
                if (c4051p.isEmpty()) {
                    z2 = false;
                } else {
                    z2 = false;
                    while (!c4051p2.isEmpty()) {
                        t node = (t) c4051p2.first();
                        AbstractC3340k.d(node, "node");
                        b5.B(node);
                        boolean zD = d(node);
                        if (node == tVar && zD) {
                            z2 = true;
                        }
                    }
                    if (c4068p != null) {
                        c4068p.invoke();
                    }
                }
            } finally {
                this.f45580c = false;
            }
        } else {
            z2 = false;
        }
        P.d dVar = this.f45582e;
        int i10 = dVar.f8972c;
        if (i10 > 0) {
            Object[] objArr2 = dVar.f8970a;
            do {
                C4061i c4061i = ((t) ((InterfaceC4043H) objArr2[i5])).f45533x;
                for (X0.E e7 = c4061i.f45574s[4]; e7 != null; e7 = (X0.E) e7.f15790d) {
                    ((r0.q) ((Z.j) ((C4050O) e7).f15789c)).r(c4061i);
                }
                i5++;
            } while (i5 < i10);
        }
        dVar.e();
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(t0.t r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.z.d(t0.t):boolean");
    }

    public final boolean e(t layoutNode, boolean z2) {
        t tVarJ;
        AbstractC3340k.e(layoutNode, "layoutNode");
        int iF = AbstractC0213f.f(layoutNode.f45507N);
        if (iF == 0 || iF == 1) {
            return false;
        }
        if (iF != 2) {
            throw new E5.Q((byte) 0, 9);
        }
        if ((layoutNode.f45505K || layoutNode.L) && !z2) {
            return false;
        }
        layoutNode.L = true;
        if (layoutNode.f45528s && (((tVarJ = layoutNode.j()) == null || !tVarJ.L) && (tVarJ == null || !tVarJ.f45505K))) {
            this.f45579b.h(layoutNode);
        }
        return !this.f45580c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(t0.t r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "layoutNode"
            kotlin.jvm.internal.AbstractC3340k.e(r5, r0)
            int r0 = r5.f45507N
            int r0 = A.AbstractC0213f.f(r0)
            r1 = 0
            if (r0 == 0) goto L51
            r2 = 1
            if (r0 == r2) goto L4c
            r3 = 2
            if (r0 != r3) goto L43
            boolean r0 = r5.f45505K
            if (r0 == 0) goto L1b
            if (r6 != 0) goto L1b
            goto L51
        L1b:
            r5.f45505K = r2
            boolean r6 = r5.f45528s
            if (r6 != 0) goto L2e
            int r6 = r5.f45508O
            if (r6 == r2) goto L2e
            t0.u r6 = r5.f45527r
            r6.c()
            t0.t r6 = r6.f45541f
            if (r6 == 0) goto L3e
        L2e:
            t0.t r6 = r5.j()
            if (r6 == 0) goto L39
            boolean r6 = r6.f45505K
            if (r6 != r2) goto L39
            goto L3e
        L39:
            Y2.B r6 = r4.f45579b
            r6.h(r5)
        L3e:
            boolean r5 = r4.f45580c
            if (r5 != 0) goto L51
            return r2
        L43:
            E5.Q r5 = new E5.Q
            r6 = 9
            r0 = 0
            r5.<init>(r0, r6)
            throw r5
        L4c:
            java.util.ArrayList r6 = r4.f45584g
            r6.add(r5)
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.z.f(t0.t, boolean):boolean");
    }
}
