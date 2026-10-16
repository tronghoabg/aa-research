package N;

import A7.AbstractC0279p0;
import O.C0783a;
import O.C0784b;
import android.os.Trace;
import ef.C2527k;
import java.util.ArrayList;
import java.util.Set;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import x.AbstractC4428u;
import x.C4418k;
import x.C4420m;
import x.C4422o;
import x.C4424q;
import x.C4425r;

/* renamed from: N.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740o {

    /* renamed from: A, reason: collision with root package name */
    public int f7830A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7831B;

    /* renamed from: C, reason: collision with root package name */
    public final C0738n f7832C;

    /* renamed from: D, reason: collision with root package name */
    public final J0 f7833D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f7834E;

    /* renamed from: F, reason: collision with root package name */
    public v0 f7835F;

    /* renamed from: G, reason: collision with root package name */
    public w0 f7836G;

    /* renamed from: H, reason: collision with root package name */
    public y0 f7837H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f7838I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC0717c0 f7839J;

    /* renamed from: K, reason: collision with root package name */
    public C0783a f7840K;
    public final C0784b L;

    /* renamed from: M, reason: collision with root package name */
    public C0716c f7841M;

    /* renamed from: N, reason: collision with root package name */
    public O.c f7842N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7843O;

    /* renamed from: P, reason: collision with root package name */
    public int f7844P;

    /* renamed from: a, reason: collision with root package name */
    public final E9.c f7845a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0743q f7846b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f7847c;

    /* renamed from: d, reason: collision with root package name */
    public final C4424q f7848d;

    /* renamed from: e, reason: collision with root package name */
    public final C0783a f7849e;

    /* renamed from: f, reason: collision with root package name */
    public final C0783a f7850f;

    /* renamed from: g, reason: collision with root package name */
    public final C0744s f7851g;

    /* renamed from: i, reason: collision with root package name */
    public C0715b0 f7853i;

    /* renamed from: j, reason: collision with root package name */
    public int f7854j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f7855l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f7857n;

    /* renamed from: o, reason: collision with root package name */
    public C4418k f7858o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7859p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7860q;

    /* renamed from: u, reason: collision with root package name */
    public S3.l f7864u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7865v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7867x;

    /* renamed from: z, reason: collision with root package name */
    public int f7869z;

    /* renamed from: h, reason: collision with root package name */
    public final J0 f7852h = new J0((byte) 0, 0);

    /* renamed from: m, reason: collision with root package name */
    public final I f7856m = new I(0);

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f7861r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final I f7862s = new I(0);

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0717c0 f7863t = V.h.f12864d;

    /* renamed from: w, reason: collision with root package name */
    public final I f7866w = new I(0);

    /* renamed from: y, reason: collision with root package name */
    public int f7868y = -1;

    public C0740o(E9.c cVar, AbstractC0743q abstractC0743q, w0 w0Var, C4424q c4424q, C0783a c0783a, C0783a c0783a2, C0744s c0744s) {
        this.f7845a = cVar;
        this.f7846b = abstractC0743q;
        this.f7847c = w0Var;
        this.f7848d = c4424q;
        this.f7849e = c0783a;
        this.f7850f = c0783a2;
        this.f7851g = c0744s;
        this.f7831B = abstractC0743q.e() || abstractC0743q.c();
        this.f7832C = new C0738n(this, 0);
        this.f7833D = new J0((byte) 0, 0);
        v0 v0VarD = w0Var.d();
        v0VarD.c();
        this.f7835F = v0VarD;
        w0 w0Var2 = new w0();
        if (abstractC0743q.e()) {
            w0Var2.c();
        }
        if (abstractC0743q.c()) {
            w0Var2.f7953j = new C4420m();
        }
        this.f7836G = w0Var2;
        y0 y0VarE = w0Var2.e();
        y0VarE.e(true);
        this.f7837H = y0VarE;
        this.L = new C0784b(this, c0783a);
        v0 v0VarD2 = this.f7836G.d();
        try {
            C0716c c0716cA = v0VarD2.a(0);
            v0VarD2.c();
            this.f7841M = c0716cA;
            this.f7842N = new O.c();
        } catch (Throwable th) {
            v0VarD2.c();
            throw th;
        }
    }

    public static final int G(C0740o c0740o, int i5, boolean z2, int i10) {
        v0 v0Var = c0740o.f7835F;
        int[] iArr = v0Var.f7930b;
        int i11 = i5 * 5;
        if ((iArr[i11 + 1] & 134217728) != 0) {
            int i12 = iArr[i11];
            Object objJ = v0Var.j(i5, iArr);
            if (i12 == 206 && AbstractC3340k.a(objJ, C0718d.f7757e)) {
                Object objG = v0Var.g(i5, 0);
                C0734l c0734l = objG instanceof C0734l ? (C0734l) objG : null;
                if (c0734l != null) {
                    for (C0740o c0740o2 : c0734l.f7802a.f7811e) {
                        C0784b c0784b = c0740o2.L;
                        w0 w0Var = c0740o2.f7847c;
                        if (w0Var.f7945b > 0 && C0718d.h(0, w0Var.f7944a)) {
                            C0783a c0783a = new C0783a();
                            c0740o2.f7840K = c0783a;
                            v0 v0VarD = w0Var.d();
                            try {
                                c0740o2.f7835F = v0VarD;
                                C0783a c0783a2 = c0784b.f8710b;
                                try {
                                    c0784b.f8710b = c0783a;
                                    G(c0740o2, 0, false, 0);
                                    c0784b.c();
                                    c0784b.b();
                                    if (c0784b.f8711c) {
                                        C0783a c0783a3 = c0784b.f8710b;
                                        c0783a3.getClass();
                                        c0783a3.f8708b.c0(O.v.f8744c);
                                        if (c0784b.f8711c) {
                                            c0784b.d(false);
                                            c0784b.d(false);
                                            C0783a c0783a4 = c0784b.f8710b;
                                            c0783a4.getClass();
                                            c0783a4.f8708b.c0(O.h.f8726c);
                                            c0784b.f8711c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                v0VarD.c();
                            }
                        }
                        c0740o.f7846b.l(c0740o2.f7851g);
                    }
                }
                return C0718d.o(i5, iArr);
            }
            if (!C0718d.m(i5, iArr)) {
                return C0718d.o(i5, iArr);
            }
        } else if (C0718d.h(i5, iArr)) {
            int i13 = iArr[i11 + 3] + i5;
            int iG = 0;
            for (int i14 = i5 + 1; i14 < i13; i14 += iArr[(i14 * 5) + 3]) {
                boolean zM = C0718d.m(i14, iArr);
                C0784b c0784b2 = c0740o.L;
                if (zM) {
                    c0784b2.c();
                    Object objI = v0Var.i(i14);
                    c0784b2.c();
                    c0784b2.f8716h.f7714b.add(objI);
                }
                iG += G(c0740o, i14, zM || z2, zM ? 0 : i10 + iG);
                if (zM) {
                    c0784b2.c();
                    c0784b2.a();
                }
            }
            if (!C0718d.m(i5, iArr)) {
                return iG;
            }
        } else if (!C0718d.m(i5, iArr)) {
            return C0718d.o(i5, iArr);
        }
        return 1;
    }

    public final int A(int i5) {
        int iP = C0718d.p(i5, this.f7835F.f7930b) + 1;
        int i10 = 0;
        while (iP < i5) {
            if (!C0718d.l(iP, this.f7835F.f7930b)) {
                i10++;
            }
            iP += C0718d.j(iP, this.f7835F.f7930b);
        }
        return i10;
    }

    public final boolean B(Y9.c cVar) {
        O.B b5 = this.f7849e.f8708b;
        if (!b5.Z()) {
            C0718d.v("Expected applyChanges() to have been called");
            throw null;
        }
        if (((C4422o) cVar.f16739b).f47538e <= 0 && this.f7861r.isEmpty()) {
            return false;
        }
        m(cVar, null);
        return b5.a0();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.C():void");
    }

    public final void D() {
        G(this, this.f7835F.f7935g, false, 0);
        C0784b c0784b = this.L;
        c0784b.c();
        c0784b.d(false);
        C0740o c0740o = c0784b.f8709a;
        v0 v0Var = c0740o.f7835F;
        if (v0Var.f7931c > 0) {
            int i5 = v0Var.f7937i;
            I i10 = c0784b.f8712d;
            int i11 = i10.f7705a;
            if ((i11 > 0 ? i10.f7706b[i11 - 1] : -2) != i5) {
                if (!c0784b.f8711c && c0784b.f8713e) {
                    c0784b.d(false);
                    C0783a c0783a = c0784b.f8710b;
                    c0783a.getClass();
                    c0783a.f8708b.c0(O.k.f8729c);
                    c0784b.f8711c = true;
                }
                if (i5 > 0) {
                    C0716c c0716cA = v0Var.a(i5);
                    i10.c(i5);
                    c0784b.d(false);
                    C0783a c0783a2 = c0784b.f8710b;
                    c0783a2.getClass();
                    O.j jVar = O.j.f8728c;
                    O.B b5 = c0783a2.f8708b;
                    b5.d0(jVar);
                    Ba.c.O(b5, 0, c0716cA);
                    int i12 = b5.f8706h;
                    int i13 = jVar.f8698a;
                    int iW = O.B.W(b5, i13);
                    int i14 = jVar.f8699b;
                    if (i12 != iW || b5.f8707i != O.B.W(b5, i14)) {
                        StringBuilder sb2 = new StringBuilder();
                        int i15 = 0;
                        for (int i16 = 0; i16 < i13; i16++) {
                            if (((1 << i16) & b5.f8706h) != 0) {
                                if (i15 > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(jVar.b(i16));
                                i15++;
                            }
                        }
                        String string = sb2.toString();
                        StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
                        int i17 = 0;
                        for (int i18 = 0; i18 < i14; i18++) {
                            if (((1 << i18) & b5.f8707i) != 0) {
                                if (i15 > 0) {
                                    sbW.append(", ");
                                }
                                sbW.append(jVar.c(i18));
                                i17++;
                            }
                        }
                        String string2 = sbW.toString();
                        AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb3 = new StringBuilder("Error while pushing ");
                        sb3.append(jVar);
                        sb3.append(". Not all arguments were provided. Missing ");
                        AbstractC0279p0.v(sb3, i15, " int arguments (", string, ") and ");
                        AbstractC0279p0.x(sb3, i17, " object arguments (", string2, ").");
                        throw null;
                    }
                    c0784b.f8711c = true;
                }
            }
        }
        C0783a c0783a3 = c0784b.f8710b;
        c0783a3.getClass();
        c0783a3.f8708b.c0(O.r.f8740c);
        int i19 = c0784b.f8714f;
        v0 v0Var2 = c0740o.f7835F;
        c0784b.f8714f = v0Var2.f7930b[(v0Var2.f7935g * 5) + 3] + i19;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(int r8, int r9, int r10) {
        /*
            r7 = this;
            N.v0 r0 = r7.f7835F
            if (r8 != r9) goto L5
            goto L20
        L5:
            if (r8 == r10) goto L70
            if (r9 != r10) goto Lb
            goto L70
        Lb:
            int[] r1 = r0.f7930b
            int r2 = r8 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            if (r2 != r9) goto L18
            r10 = r9
            goto L70
        L18:
            int r3 = r9 * 5
            int r3 = r3 + 2
            r3 = r1[r3]
            if (r3 != r8) goto L22
        L20:
            r10 = r8
            goto L70
        L22:
            if (r2 != r3) goto L26
            r10 = r2
            goto L70
        L26:
            r2 = 0
            r3 = r8
            r4 = r2
        L29:
            int[] r5 = r0.f7930b
            if (r3 <= 0) goto L36
            if (r3 == r10) goto L36
            int r3 = N.C0718d.p(r3, r5)
            int r4 = r4 + 1
            goto L29
        L36:
            r3 = r9
            r6 = r2
        L38:
            if (r3 <= 0) goto L43
            if (r3 == r10) goto L43
            int r3 = N.C0718d.p(r3, r5)
            int r6 = r6 + 1
            goto L38
        L43:
            int r10 = r4 - r6
            r5 = r8
            r3 = r2
        L47:
            if (r3 >= r10) goto L52
            int r5 = r5 * 5
            int r5 = r5 + 2
            r5 = r1[r5]
            int r3 = r3 + 1
            goto L47
        L52:
            int r6 = r6 - r4
            r10 = r9
        L54:
            if (r2 >= r6) goto L5f
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 + 1
            goto L54
        L5f:
            r2 = r10
            r10 = r5
        L61:
            if (r10 == r2) goto L70
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            goto L61
        L70:
            if (r8 <= 0) goto L8a
            if (r8 == r10) goto L8a
            int[] r1 = r0.f7930b
            boolean r1 = N.C0718d.m(r8, r1)
            if (r1 == 0) goto L81
            O.b r1 = r7.L
            r1.a()
        L81:
            int[] r1 = r0.f7930b
            int r8 = r8 * 5
            int r8 = r8 + 2
            r8 = r1[r8]
            goto L70
        L8a:
            r7.n(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.E(int, int, int):void");
    }

    public final Object F() {
        boolean z2 = this.f7843O;
        P p10 = C0732k.f7800a;
        if (!z2) {
            Object objH = this.f7835F.h();
            if (!this.f7867x || (objH instanceof C0734l)) {
                return objH instanceof r0 ? ((r0) objH).f7902a : objH;
            }
        } else if (this.f7860q) {
            C0718d.v("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return p10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f7861r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            int r0 = r12.k
            N.v0 r1 = r12.f7835F
            int r1 = r1.l()
            int r1 = r1 + r0
            r12.k = r1
            return
        L14:
            N.v0 r0 = r12.f7835F
            int r1 = r0.f()
            int r2 = r0.f7935g
            int r3 = r0.f7936h
            r4 = 0
            int[] r5 = r0.f7930b
            if (r2 >= r3) goto L28
            java.lang.Object r2 = r0.j(r2, r5)
            goto L29
        L28:
            r2 = r4
        L29:
            java.lang.Object r3 = r0.e()
            int r6 = r12.f7855l
            N.P r7 = N.C0732k.f7800a
            r8 = 207(0xcf, float:2.9E-43)
            r9 = 3
            if (r2 != 0) goto L62
            if (r3 == 0) goto L53
            if (r1 != r8) goto L53
            boolean r10 = r3.equals(r7)
            if (r10 != 0) goto L53
            int r10 = r3.hashCode()
            int r11 = r12.f7844P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
            r12.f7844P = r10
            goto L7e
        L53:
            int r10 = r12.f7844P
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r1
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
        L5f:
            r12.f7844P = r10
            goto L7e
        L62:
            boolean r10 = r2 instanceof java.lang.Enum
            if (r10 == 0) goto L79
            r10 = r2
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
        L6d:
            int r11 = r12.f7844P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            goto L5f
        L79:
            int r10 = r2.hashCode()
            goto L6d
        L7e:
            int r10 = r0.f7935g
            boolean r5 = N.C0718d.m(r10, r5)
            r12.L(r5, r4)
            r12.C()
            r0.d()
            if (r2 != 0) goto Lbb
            if (r3 == 0) goto Lac
            if (r1 != r8) goto Lac
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto Lac
            int r0 = r3.hashCode()
            int r1 = r12.f7844P
            r1 = r1 ^ r6
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f7844P = r0
            return
        Lac:
            int r0 = r12.f7844P
            r0 = r0 ^ r6
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f7844P = r0
            return
        Lbb:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Ld3
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
            int r1 = r12.f7844P
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f7844P = r0
            return
        Ld3:
            int r0 = r2.hashCode()
            int r1 = r12.f7844P
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f7844P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.H():void");
    }

    public final void I() {
        if (this.k != 0) {
            C0718d.v("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C0729i0 c0729i0V = v();
        if (c0729i0V != null) {
            c0729i0V.f7785a |= 16;
        }
        if (!this.f7861r.isEmpty()) {
            C();
            return;
        }
        v0 v0Var = this.f7835F;
        int i5 = v0Var.f7937i;
        this.k = i5 >= 0 ? C0718d.o(i5, v0Var.f7930b) : 0;
        this.f7835F.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Type inference failed for: r3v4, types: [N.c0] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r28, java.lang.Object r29, int r30, N.InterfaceC0717c0 r31) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.J(int, java.lang.Object, int, N.c0):void");
    }

    public final void K() {
        J(-127, null, 0, null);
    }

    public final void L(boolean z2, InterfaceC0717c0 interfaceC0717c0) {
        if (z2) {
            v0 v0Var = this.f7835F;
            if (v0Var.k <= 0) {
                if (C0718d.m(v0Var.f7935g, v0Var.f7930b)) {
                    v0Var.n();
                    return;
                } else {
                    C0718d.O("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (interfaceC0717c0 != null && this.f7835F.e() != interfaceC0717c0) {
            C0784b c0784b = this.L;
            c0784b.getClass();
            c0784b.d(false);
            C0783a c0783a = c0784b.f8710b;
            c0783a.getClass();
            O.x xVar = O.x.f8746c;
            O.B b5 = c0783a.f8708b;
            b5.d0(xVar);
            Ba.c.O(b5, 0, interfaceC0717c0);
            int i5 = b5.f8706h;
            int i10 = xVar.f8698a;
            int iW = O.B.W(b5, i10);
            int i11 = xVar.f8699b;
            if (i5 != iW || b5.f8707i != O.B.W(b5, i11)) {
                StringBuilder sb2 = new StringBuilder();
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    if (((1 << i13) & b5.f8706h) != 0) {
                        if (i12 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(xVar.b(i13));
                        i12++;
                    }
                }
                String string = sb2.toString();
                StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    if (((1 << i15) & b5.f8707i) != 0) {
                        if (i12 > 0) {
                            sbW.append(", ");
                        }
                        sbW.append(xVar.c(i15));
                        i14++;
                    }
                }
                String string2 = sbW.toString();
                AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder("Error while pushing ");
                sb3.append(xVar);
                sb3.append(". Not all arguments were provided. Missing ");
                AbstractC0279p0.v(sb3, i12, " int arguments (", string, ") and ");
                AbstractC0279p0.x(sb3, i14, " object arguments (", string2, ").");
                throw null;
            }
        }
        this.f7835F.n();
    }

    public final void M(int i5) {
        J(i5, null, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N.C0740o N(int r11) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.N(int):N.o");
    }

    public final void O() {
        J(125, null, 2, null);
        this.f7860q = true;
    }

    public final void P() {
        this.f7855l = 0;
        w0 w0Var = this.f7847c;
        this.f7835F = w0Var.d();
        J(100, null, 0, null);
        AbstractC0743q abstractC0743q = this.f7846b;
        abstractC0743q.m();
        this.f7863t = abstractC0743q.f();
        this.f7866w.c(this.f7865v ? 1 : 0);
        this.f7865v = e(this.f7863t);
        this.f7839J = null;
        if (!this.f7859p) {
            this.f7859p = abstractC0743q.d();
        }
        if (!this.f7831B) {
            this.f7831B = abstractC0743q.e();
        }
        InterfaceC0717c0 interfaceC0717c0 = this.f7863t;
        L0 l02 = Y.b.f16299a;
        AbstractC3340k.c(l02, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = interfaceC0717c0.get(l02);
        Object obj2 = obj;
        if (obj == null) {
            obj2 = l02.f7766a;
        }
        Set set = (Set) ((N0) obj2).a(interfaceC0717c0);
        if (set != null) {
            set.add(w0Var);
            abstractC0743q.j(set);
        }
        J(abstractC0743q.g(), null, 0, null);
    }

    public final boolean Q(C0729i0 c0729i0, Object obj) {
        C0716c c0716c = c0729i0.f7787c;
        if (c0716c == null) {
            return false;
        }
        int iA = this.f7835F.f7929a.a(c0716c);
        if (!this.f7834E || iA < this.f7835F.f7935g) {
            return false;
        }
        ArrayList arrayList = this.f7861r;
        int iA2 = C0718d.A(arrayList, iA);
        if (iA2 < 0) {
            int i5 = -(iA2 + 1);
            if (!(obj instanceof C0751z)) {
                obj = null;
            }
            arrayList.add(i5, new J(c0729i0, iA, obj));
            return true;
        }
        J j8 = (J) arrayList.get(iA2);
        if (!(obj instanceof C0751z)) {
            j8.f7712c = null;
            return true;
        }
        Object obj2 = j8.f7712c;
        if (obj2 == null) {
            j8.f7712c = obj;
            return true;
        }
        if (obj2 instanceof C4425r) {
            ((C4425r) obj2).a(obj);
            return true;
        }
        int i10 = AbstractC4428u.f47560a;
        C4425r c4425r = new C4425r(2);
        c4425r.f47554b[c4425r.d(obj2)] = obj2;
        c4425r.f47554b[c4425r.d(obj)] = obj;
        j8.f7712c = c4425r;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
    
        if (((r4 & ((~r4) << r18)) & r14) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        r4 = r3.a(r7);
        r10 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        if (r3.f47519f != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        if (((r3.f47514a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        r25 = 255;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        r4 = r3.f47517d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        if (r4 <= 8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (java.lang.Long.compare((r3.f47518e * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        r4 = r3.f47514a;
        r5 = r3.f47517d;
        r6 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        if (r6 >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        r15 = r6 >> 3;
        r22 = (r6 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f7, code lost:
    
        if (((r4[r15] >> r22) & r10) != 254) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
    
        r8 = r3.f47514a;
        r25 = r10;
        r8[r15] = (r8[r15] & (~(r25 << r22))) | (128 << r22);
        r9 = r3.f47517d;
        r10 = ((r6 - 7) & r9) + (r9 & 7);
        r9 = r10 >> 3;
        r10 = (r10 & 7) << 3;
        r8[r9] = (r8[r9] & (~(r25 << r10))) | (128 << r10);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0129, code lost:
    
        r25 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012d, code lost:
    
        r6 = r6 + 1;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0136, code lost:
    
        r25 = r10;
        r23 = 128;
        r3.f47519f += r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0141, code lost:
    
        r25 = 255;
        r23 = 128;
        r1 = x.AbstractC4427t.b(r3.f47517d);
        r2 = r3.f47514a;
        r4 = r3.f47515b;
        r5 = r3.f47516c;
        r6 = r3.f47517d;
        r3.d(r1);
        r1 = r3.f47515b;
        r8 = r3.f47516c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015b, code lost:
    
        if (r9 >= r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016a, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
    
        r10 = r4[r9];
        r11 = r10 * r19;
        r11 = r11 ^ (r11 << 16);
        r14 = r3.a(r11 >>> 7);
        r18 = r1;
        r15 = r2;
        r1 = r11 & 127;
        r11 = r3.f47514a;
        r20 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r11[r20] = (r11[r20] & (~(255 << r21))) | (r1 << r21);
        r1 = r3.f47517d;
        r2 = ((r14 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r11[r1] = (r11[r1] & (~(255 << r2))) | (r1 << r2);
        r18[r14] = r10;
        r8[r14] = r5[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01bc, code lost:
    
        r18 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bf, code lost:
    
        r9 = r9 + 1;
        r2 = r15;
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c5, code lost:
    
        r4 = r3.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c9, code lost:
    
        r3.f47518e++;
        r1 = r3.f47519f;
        r2 = r3.f47514a;
        r5 = r4 >> 3;
        r6 = r2[r5];
        r8 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
    
        if (((r6 >> r8) & r25) != r23) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e6, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e7, code lost:
    
        r3.f47519f = r1 - r10;
        r2[r5] = (r6 & (~(r25 << r8))) | (r12 << r8);
        r1 = r3.f47517d;
        r5 = ((r4 - 7) & r1) + (r1 & 7);
        r1 = r5 >> 3;
        r5 = (r5 & 7) << 3;
        r2[r1] = (r2[r1] & (~(r25 << r5))) | (r12 << r5);
        r1 = ~r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.R(int, int):void");
    }

    public final void S(int i5, int i10) {
        int iW = W(i5);
        if (iW != i10) {
            int i11 = i10 - iW;
            J0 j02 = this.f7852h;
            int size = j02.f7714b.size() - 1;
            while (i5 != -1) {
                int iW2 = W(i5) + i11;
                R(i5, iW2);
                int i12 = size;
                while (true) {
                    if (-1 < i12) {
                        C0715b0 c0715b0 = (C0715b0) j02.f7714b.get(i12);
                        if (c0715b0 != null && c0715b0.a(i5, iW2)) {
                            size = i12 - 1;
                            break;
                        }
                        i12--;
                    } else {
                        break;
                    }
                }
                if (i5 < 0) {
                    i5 = this.f7835F.f7937i;
                } else if (C0718d.m(i5, this.f7835F.f7930b)) {
                    return;
                } else {
                    i5 = C0718d.p(i5, this.f7835F.f7930b);
                }
            }
        }
    }

    public final V.h T(InterfaceC0717c0 interfaceC0717c0, V.h hVar) {
        V.h hVar2 = (V.h) interfaceC0717c0;
        hVar2.getClass();
        V.g gVar = new V.g(hVar2);
        gVar.f12863g = hVar2;
        gVar.putAll(hVar);
        V.h hVarBuild = gVar.build();
        J(204, C0718d.f7756d, 0, null);
        z();
        V(hVarBuild);
        z();
        V(hVar);
        p(false);
        return hVarBuild;
    }

    public final void U(Object obj) {
        int i5;
        v0 v0Var;
        int i10;
        y0 y0Var;
        if (obj instanceof q0) {
            C0716c c0716cA = null;
            if (this.f7843O) {
                C0783a c0783a = this.L.f8710b;
                c0783a.getClass();
                O.q qVar = O.q.f8739c;
                O.B b5 = c0783a.f8708b;
                b5.d0(qVar);
                Ba.c.O(b5, 0, (q0) obj);
                int i11 = b5.f8706h;
                int i12 = qVar.f8698a;
                int iW = O.B.W(b5, i12);
                int i13 = qVar.f8699b;
                if (i11 != iW || b5.f8707i != O.B.W(b5, i13)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i14 = 0;
                    for (int i15 = 0; i15 < i12; i15++) {
                        if (((1 << i15) & b5.f8706h) != 0) {
                            if (i14 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(qVar.b(i15));
                            i14++;
                        }
                    }
                    String string = sb2.toString();
                    StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
                    int i16 = 0;
                    for (int i17 = 0; i17 < i13; i17++) {
                        if (((1 << i17) & b5.f8707i) != 0) {
                            if (i14 > 0) {
                                sbW.append(", ");
                            }
                            sbW.append(qVar.c(i17));
                            i16++;
                        }
                    }
                    String string2 = sbW.toString();
                    AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb3 = new StringBuilder("Error while pushing ");
                    sb3.append(qVar);
                    sb3.append(". Not all arguments were provided. Missing ");
                    AbstractC0279p0.v(sb3, i14, " int arguments (", string, ") and ");
                    AbstractC0279p0.x(sb3, i16, " object arguments (", string2, ").");
                    throw null;
                }
            }
            this.f7848d.add(obj);
            q0 q0Var = (q0) obj;
            if (this.f7843O) {
                y0 y0Var2 = this.f7837H;
                int i18 = y0Var2.f7983s;
                if (i18 > y0Var2.f7985u + 1) {
                    int i19 = i18 - 1;
                    int iW2 = y0Var2.w(i19, y0Var2.f7967b);
                    while (true) {
                        i10 = i19;
                        i19 = iW2;
                        y0Var = this.f7837H;
                        if (i19 == y0Var.f7985u || i19 < 0) {
                            break;
                        } else {
                            iW2 = y0Var.w(i19, y0Var.f7967b);
                        }
                    }
                    c0716cA = y0Var.b(i10);
                }
            } else {
                v0 v0Var2 = this.f7835F;
                int i20 = v0Var2.f7935g;
                if (i20 > v0Var2.f7937i + 1) {
                    int i21 = i20 - 1;
                    int i22 = v0Var2.f7930b[(i21 * 5) + 2];
                    while (true) {
                        i5 = i21;
                        i21 = i22;
                        v0Var = this.f7835F;
                        if (i21 == v0Var.f7937i || i21 < 0) {
                            break;
                        } else {
                            i22 = v0Var.f7930b[(i21 * 5) + 2];
                        }
                    }
                    c0716cA = v0Var.a(i5);
                }
            }
            r0 r0Var = new r0();
            r0Var.f7902a = q0Var;
            r0Var.f7903b = c0716cA;
            obj = r0Var;
        }
        V(obj);
    }

    public final void V(Object obj) {
        int i5;
        int i10;
        int i11;
        if (this.f7843O) {
            y0 y0Var = this.f7837H;
            if (y0Var.f7978n > 0) {
                y0Var.s(1, y0Var.f7985u);
            }
            Object[] objArr = y0Var.f7968c;
            int i12 = y0Var.f7974i;
            y0Var.f7974i = i12 + 1;
            Object obj2 = objArr[y0Var.g(i12)];
            int i13 = y0Var.f7974i;
            if (i13 <= y0Var.f7975j) {
                y0Var.f7968c[y0Var.g(i13 - 1)] = obj;
                return;
            } else {
                C0718d.v("Writing to an invalid slot");
                throw null;
            }
        }
        v0 v0Var = this.f7835F;
        boolean z2 = v0Var.f7941n;
        C0784b c0784b = this.L;
        if (!z2) {
            C0716c c0716cA = v0Var.a(v0Var.f7937i);
            C0783a c0783a = c0784b.f8710b;
            c0783a.getClass();
            O.e eVar = O.e.f8723c;
            O.B b5 = c0783a.f8708b;
            b5.d0(eVar);
            Ba.c.O(b5, 0, c0716cA);
            Ba.c.O(b5, 1, obj);
            int i14 = b5.f8706h;
            int i15 = eVar.f8698a;
            int iW = O.B.W(b5, i15);
            int i16 = eVar.f8699b;
            if (i14 == iW && b5.f8707i == O.B.W(b5, i16)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int i17 = 0;
            for (int i18 = 0; i18 < i15; i18++) {
                if (((1 << i18) & b5.f8706h) != 0) {
                    if (i17 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(eVar.b(i18));
                    i17++;
                }
            }
            String string = sb2.toString();
            StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
            int i19 = 0;
            int i20 = 0;
            while (i19 < i16) {
                int i21 = i16;
                if (((1 << i19) & b5.f8707i) != 0) {
                    if (i17 > 0) {
                        sbW.append(", ");
                    }
                    sbW.append(eVar.c(i19));
                    i20++;
                }
                i19++;
                i16 = i21;
            }
            String string2 = sbW.toString();
            AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(eVar);
            sb3.append(". Not all arguments were provided. Missing ");
            AbstractC0279p0.v(sb3, i17, " int arguments (", string, ") and ");
            AbstractC0279p0.x(sb3, i20, " object arguments (", string2, ").");
            throw null;
        }
        int iR = (v0Var.f7939l - C0718d.r(v0Var.f7937i, v0Var.f7930b)) - 1;
        if (c0784b.f8709a.f7835F.f7937i - c0784b.f8714f >= 0) {
            c0784b.d(true);
            C0783a c0783a2 = c0784b.f8710b;
            O.l lVar = O.l.f8733g;
            O.B b10 = c0783a2.f8708b;
            b10.d0(lVar);
            Ba.c.O(b10, 0, obj);
            Ba.c.N(b10, 0, iR);
            if (b10.f8706h == O.B.W(b10, 1) && b10.f8707i == O.B.W(b10, 1)) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            if ((b10.f8706h & 1) != 0) {
                sb4.append(lVar.b(0));
                i5 = 1;
            } else {
                i5 = 0;
            }
            String string3 = sb4.toString();
            StringBuilder sbW2 = AbstractC0279p0.w(string3, "StringBuilder().apply(builderAction).toString()");
            if ((b10.f8707i & 1) != 0) {
                if (i5 > 0) {
                    sbW2.append(", ");
                }
                sbW2.append(lVar.c(0));
                i10 = 1;
            } else {
                i10 = 0;
            }
            String string4 = sbW2.toString();
            AbstractC3340k.d(string4, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb5 = new StringBuilder("Error while pushing ");
            sb5.append(lVar);
            sb5.append(". Not all arguments were provided. Missing ");
            AbstractC0279p0.v(sb5, i5, " int arguments (", string3, ") and ");
            AbstractC0279p0.x(sb5, i10, " object arguments (", string4, ").");
            throw null;
        }
        v0 v0Var2 = this.f7835F;
        C0716c c0716cA2 = v0Var2.a(v0Var2.f7937i);
        C0783a c0783a3 = c0784b.f8710b;
        O.l lVar2 = O.l.f8732f;
        O.B b11 = c0783a3.f8708b;
        b11.d0(lVar2);
        Ba.c.O(b11, 0, obj);
        Ba.c.O(b11, 1, c0716cA2);
        Ba.c.N(b11, 0, iR);
        if (b11.f8706h == O.B.W(b11, 1) && b11.f8707i == O.B.W(b11, 2)) {
            return;
        }
        StringBuilder sb6 = new StringBuilder();
        if ((b11.f8706h & 1) != 0) {
            sb6.append(lVar2.b(0));
            i11 = 1;
        } else {
            i11 = 0;
        }
        String string5 = sb6.toString();
        StringBuilder sbW3 = AbstractC0279p0.w(string5, "StringBuilder().apply(builderAction).toString()");
        int i22 = 0;
        int i23 = 0;
        for (int i24 = 2; i23 < i24; i24 = 2) {
            if (((1 << i23) & b11.f8707i) != 0) {
                if (i11 > 0) {
                    sbW3.append(", ");
                }
                sbW3.append(lVar2.c(i23));
                i22++;
            }
            i23++;
        }
        String string6 = sbW3.toString();
        AbstractC3340k.d(string6, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb7 = new StringBuilder("Error while pushing ");
        sb7.append(lVar2);
        sb7.append(". Not all arguments were provided. Missing ");
        AbstractC0279p0.v(sb7, i11, " int arguments (", string5, ") and ");
        AbstractC0279p0.x(sb7, i22, " object arguments (", string6, ").");
        throw null;
    }

    public final int W(int i5) {
        int i10;
        if (i5 >= 0) {
            int[] iArr = this.f7857n;
            return (iArr == null || (i10 = iArr[i5]) < 0) ? C0718d.o(i5, this.f7835F.f7930b) : i10;
        }
        C4418k c4418k = this.f7858o;
        if (c4418k == null || c4418k.b(i5) < 0) {
            return 0;
        }
        return c4418k.c(i5);
    }

    public final void X() {
        if (!this.f7860q) {
            C0718d.v("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f7860q = false;
        if (this.f7843O) {
            C0718d.v("useNode() called while inserting");
            throw null;
        }
        v0 v0Var = this.f7835F;
        Object objI = v0Var.i(v0Var.f7937i);
        C0784b c0784b = this.L;
        c0784b.c();
        c0784b.f8716h.f7714b.add(objI);
    }

    public final void a() {
        h();
        this.f7852h.f7714b.clear();
        this.f7856m.f7705a = 0;
        this.f7862s.f7705a = 0;
        this.f7866w.f7705a = 0;
        this.f7864u = null;
        O.c cVar = this.f7842N;
        cVar.f8721c.X();
        cVar.f8720b.X();
        this.f7844P = 0;
        this.f7869z = 0;
        this.f7860q = false;
        this.f7843O = false;
        this.f7867x = false;
        this.f7834E = false;
        this.f7868y = -1;
        v0 v0Var = this.f7835F;
        if (!v0Var.f7934f) {
            v0Var.c();
        }
        if (this.f7837H.f7986v) {
            return;
        }
        u();
    }

    public final boolean b(float f10) {
        Object objZ = z();
        if ((objZ instanceof Float) && f10 == ((Number) objZ).floatValue()) {
            return false;
        }
        V(Float.valueOf(f10));
        return true;
    }

    public final boolean c(int i5) {
        Object objZ = z();
        if ((objZ instanceof Integer) && i5 == ((Number) objZ).intValue()) {
            return false;
        }
        V(Integer.valueOf(i5));
        return true;
    }

    public final boolean d(long j8) {
        Object objZ = z();
        if ((objZ instanceof Long) && j8 == ((Number) objZ).longValue()) {
            return false;
        }
        V(Long.valueOf(j8));
        return true;
    }

    public final boolean e(Object obj) {
        if (AbstractC3340k.a(z(), obj)) {
            return false;
        }
        V(obj);
        return true;
    }

    public final boolean f(boolean z2) {
        Object objZ = z();
        if ((objZ instanceof Boolean) && z2 == ((Boolean) objZ).booleanValue()) {
            return false;
        }
        V(Boolean.valueOf(z2));
        return true;
    }

    public final boolean g(Object obj) {
        if (z() == obj) {
            return false;
        }
        V(obj);
        return true;
    }

    public final void h() {
        this.f7853i = null;
        this.f7854j = 0;
        this.k = 0;
        this.f7844P = 0;
        this.f7860q = false;
        C0784b c0784b = this.L;
        c0784b.f8711c = false;
        c0784b.f8712d.f7705a = 0;
        c0784b.f8714f = 0;
        this.f7833D.f7714b.clear();
        this.f7857n = null;
        this.f7858o = null;
    }

    public final int i(int i5, int i10, int i11, int i12) {
        int iHashCode;
        Object objB;
        if (i5 == i11) {
            return i12;
        }
        v0 v0Var = this.f7835F;
        boolean zL = C0718d.l(i5, v0Var.f7930b);
        int[] iArr = v0Var.f7930b;
        if (zL) {
            Object objJ = v0Var.j(i5, iArr);
            iHashCode = objJ != null ? objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode() : 0;
        } else {
            int i13 = iArr[i5 * 5];
            iHashCode = (i13 != 207 || (objB = v0Var.b(i5, iArr)) == null || objB.equals(C0732k.f7800a)) ? i13 : objB.hashCode();
        }
        if (iHashCode == 126665345) {
            return iHashCode;
        }
        int i14 = this.f7835F.f7930b[(i5 * 5) + 2];
        if (i14 != i11) {
            i12 = i(i14, A(i14), i11, i12);
        }
        if (C0718d.l(i5, this.f7835F.f7930b)) {
            i10 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i12, 3) ^ iHashCode, 3) ^ i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5 A[ADDED_TO_REGION, LOOP:1: B:38:0x00a5->B:51:0x00de, LOOP_START, PHI: r0
  0x00a5: PHI (r0v5 int) = (r0v3 int), (r0v8 int) binds: [B:37:0x00a3, B:51:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(N.AbstractC0723f0 r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.j(N.f0):java.lang.Object");
    }

    public final void k(tf.a aVar) {
        int i5;
        int i10;
        if (!this.f7860q) {
            C0718d.v("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        int i11 = 0;
        this.f7860q = false;
        if (!this.f7843O) {
            C0718d.v("createNode() can only be called when inserting");
            throw null;
        }
        I i12 = this.f7856m;
        int i13 = i12.f7706b[i12.f7705a - 1];
        y0 y0Var = this.f7837H;
        C0716c c0716cB = y0Var.b(y0Var.f7985u);
        this.k++;
        O.c cVar = this.f7842N;
        O.l lVar = O.l.f8730d;
        O.B b5 = cVar.f8720b;
        b5.d0(lVar);
        Ba.c.O(b5, 0, aVar);
        Ba.c.N(b5, 0, i13);
        Ba.c.O(b5, 1, c0716cB);
        if (!(b5.f8706h == O.B.W(b5, 1) && b5.f8707i == O.B.W(b5, 2))) {
            StringBuilder sb2 = new StringBuilder();
            if ((1 & b5.f8706h) != 0) {
                sb2.append(lVar.b(0));
                i10 = 1;
            } else {
                i10 = 0;
            }
            String string = sb2.toString();
            StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
            int i14 = 0;
            while (i11 < 2) {
                if (((1 << i11) & b5.f8707i) != 0) {
                    if (i10 > 0) {
                        sbW.append(", ");
                    }
                    sbW.append(lVar.c(i11));
                    i14++;
                }
                i11++;
            }
            String string2 = sbW.toString();
            AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(lVar);
            sb3.append(". Not all arguments were provided. Missing ");
            AbstractC0279p0.v(sb3, i10, " int arguments (", string, ") and ");
            AbstractC0279p0.x(sb3, i14, " object arguments (", string2, ").");
            throw null;
        }
        O.l lVar2 = O.l.f8731e;
        O.B b10 = cVar.f8721c;
        b10.d0(lVar2);
        Ba.c.N(b10, 0, i13);
        Ba.c.O(b10, 0, c0716cB);
        if (b10.f8706h == O.B.W(b10, 1) && b10.f8707i == O.B.W(b10, 1)) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        if ((b10.f8706h & 1) != 0) {
            sb4.append(lVar2.b(0));
            i5 = 1;
        } else {
            i5 = 0;
        }
        String string3 = sb4.toString();
        StringBuilder sbW2 = AbstractC0279p0.w(string3, "StringBuilder().apply(builderAction).toString()");
        if ((b10.f8707i & 1) != 0) {
            if (i5 > 0) {
                sbW2.append(", ");
            }
            sbW2.append(lVar2.c(0));
            i11 = 1;
        }
        String string4 = sbW2.toString();
        AbstractC3340k.d(string4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(lVar2);
        sb5.append(". Not all arguments were provided. Missing ");
        AbstractC0279p0.v(sb5, i5, " int arguments (", string3, ") and ");
        AbstractC0279p0.x(sb5, i11, " object arguments (", string4, ").");
        throw null;
    }

    public final void l() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f7846b.n(this);
            this.f7833D.f7714b.clear();
            this.f7861r.clear();
            this.f7849e.f8708b.X();
            this.f7864u = null;
            this.f7845a.c();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(Y9.c r21, V.d r22) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.m(Y9.c, V.d):void");
    }

    public final void n(int i5, int i10) {
        if (i5 <= 0 || i5 == i10) {
            return;
        }
        n(this.f7835F.f7930b[(i5 * 5) + 2], i10);
        if (C0718d.m(i5, this.f7835F.f7930b)) {
            Object objI = this.f7835F.i(i5);
            C0784b c0784b = this.L;
            c0784b.c();
            c0784b.f8716h.f7714b.add(objI);
        }
    }

    public final void o() {
        this.f7867x = this.f7868y >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0903  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r45) {
        /*
            Method dump skipped, instructions count: 2674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.p(boolean):void");
    }

    public final void q() {
        p(false);
        C0729i0 c0729i0V = v();
        if (c0729i0V != null) {
            int i5 = c0729i0V.f7785a;
            if ((i5 & 1) != 0) {
                c0729i0V.f7785a = i5 | 2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N.C0729i0 r() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0740o.r():N.i0");
    }

    public final void s() {
        p(false);
        this.f7846b.b();
        p(false);
        C0784b c0784b = this.L;
        if (c0784b.f8711c) {
            c0784b.d(false);
            c0784b.d(false);
            C0783a c0783a = c0784b.f8710b;
            c0783a.getClass();
            c0783a.f8708b.c0(O.h.f8726c);
            c0784b.f8711c = false;
        }
        c0784b.b();
        if (!(c0784b.f8712d.f7705a == 0)) {
            C0718d.v("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f7852h.f7714b.isEmpty()) {
            C0718d.v("Start/end imbalance");
            throw null;
        }
        h();
        this.f7835F.c();
        this.f7865v = this.f7866w.b() != 0;
    }

    public final void t(boolean z2, C0715b0 c0715b0) {
        this.f7852h.f7714b.add(this.f7853i);
        this.f7853i = c0715b0;
        int i5 = this.k;
        I i10 = this.f7856m;
        i10.c(i5);
        i10.c(this.f7855l);
        i10.c(this.f7854j);
        if (z2) {
            this.f7854j = 0;
        }
        this.k = 0;
        this.f7855l = 0;
    }

    public final void u() {
        w0 w0Var = new w0();
        if (this.f7831B) {
            w0Var.c();
        }
        if (this.f7846b.c()) {
            w0Var.f7953j = new C4420m();
        }
        this.f7836G = w0Var;
        y0 y0VarE = w0Var.e();
        y0VarE.e(true);
        this.f7837H = y0VarE;
    }

    public final C0729i0 v() {
        if (this.f7869z != 0) {
            return null;
        }
        J0 j02 = this.f7833D;
        if (j02.f7714b.isEmpty()) {
            return null;
        }
        return (C0729i0) AbstractC3256n.e(j02.f7714b, 1);
    }

    public final boolean w() {
        if (!x() || this.f7865v) {
            return true;
        }
        C0729i0 c0729i0V = v();
        return (c0729i0V == null || (c0729i0V.f7785a & 4) == 0) ? false : true;
    }

    public final boolean x() {
        C0729i0 c0729i0V;
        return (this.f7843O || this.f7867x || this.f7865v || (c0729i0V = v()) == null || (c0729i0V.f7785a & 8) != 0) ? false : true;
    }

    public final void y(ArrayList arrayList) {
        C0783a c0783a = this.f7850f;
        C0784b c0784b = this.L;
        C0783a c0783a2 = c0784b.f8710b;
        try {
            c0784b.f8710b = c0783a;
            c0783a.f8708b.c0(O.t.f8742c);
            if (arrayList.size() > 0) {
                C2527k c2527k = (C2527k) arrayList.get(0);
                T t10 = (T) c2527k.f34671a;
                t10.getClass();
                throw null;
            }
            C0783a c0783a3 = c0784b.f8710b;
            c0783a3.getClass();
            c0783a3.f8708b.c0(O.i.f8727c);
            c0784b.f8714f = 0;
        } finally {
            c0784b.f8710b = c0783a2;
        }
    }

    public final Object z() {
        boolean z2 = this.f7843O;
        P p10 = C0732k.f7800a;
        if (!z2) {
            Object objH = this.f7835F.h();
            if (!this.f7867x || (objH instanceof C0734l)) {
                return objH;
            }
        } else if (this.f7860q) {
            C0718d.v("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return p10;
    }
}
