package N;

import A7.AbstractC0279p0;
import Ef.C0499l0;
import Ef.C0505o0;
import Ef.C0517x;
import Ef.InterfaceC0501m0;
import O.C0783a;
import O.C0784b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jf.C3109i;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import q.s1;

/* renamed from: N.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718d {

    /* renamed from: a, reason: collision with root package name */
    public static final W f7753a = new W("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final W f7754b = new W("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final W f7755c = new W("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final W f7756d = new W("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final W f7757e = new W("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final A0.f f7758f = new A0.f(2);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f7759g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final C f7760h = new C();

    public static final int A(ArrayList arrayList, int i5) {
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iG = AbstractC3340k.g(((J) arrayList.get(i11)).f7711b, i5);
            if (iG < 0) {
                i10 = i11 + 1;
            } else {
                if (iG <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final Q B(InterfaceC3108h interfaceC3108h) {
        Q q4 = (Q) interfaceC3108h.get(P.f7726b);
        if (q4 != null) {
            return q4;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void C() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final void D(C0740o c0740o, tf.p pVar) {
        AbstractC3340k.c(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        kotlin.jvm.internal.K.e(2, pVar);
        pVar.invoke(c0740o, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List E(y0 y0Var, int i5, y0 y0Var2, boolean z2, boolean z10, boolean z11) {
        ff.v vVar;
        boolean z12;
        C0716c c0716cG;
        int i10;
        int i11;
        int iQ = y0Var.q(i5);
        int i12 = i5 + iQ;
        int iF = y0Var.f(y0Var.p(i5), y0Var.f7967b);
        int iF2 = y0Var.f(y0Var.p(i12), y0Var.f7967b);
        int i13 = iF2 - iF;
        boolean z13 = i5 >= 0 && (y0Var.f7967b[(y0Var.p(i5) * 5) + 1] & 201326592) != 0;
        y0Var2.r(iQ);
        y0Var2.s(i13, y0Var2.f7983s);
        if (y0Var.f7972g < i12) {
            y0Var.u(i12);
        }
        if (y0Var.k < iF2) {
            y0Var.v(iF2, i12);
        }
        int[] iArr = y0Var2.f7967b;
        int i14 = y0Var2.f7983s;
        int i15 = i14 * 5;
        ff.m.g0(i15, i5 * 5, i12 * 5, y0Var.f7967b, iArr);
        Object[] objArr = y0Var2.f7968c;
        int i16 = y0Var2.f7974i;
        ff.m.h0(y0Var.f7968c, i16, objArr, iF, iF2);
        int i17 = y0Var2.f7985u;
        iArr[i15 + 2] = i17;
        int i18 = i14 - i5;
        int i19 = i14 + iQ;
        int iF3 = i16 - y0Var2.f(i14, iArr);
        int i20 = y0Var2.f7977m;
        int i21 = y0Var2.f7976l;
        int length = objArr.length;
        boolean z14 = z13;
        int i22 = i20;
        int i23 = i14;
        while (i23 < i19) {
            if (i23 != i14) {
                int i24 = (i23 * 5) + 2;
                iArr[i24] = iArr[i24] + i18;
            }
            int i25 = i18;
            int iF4 = y0Var2.f(i23, iArr) + iF3;
            if (i22 < i23) {
                i10 = i19;
                i11 = 0;
            } else {
                i10 = i19;
                i11 = y0Var2.k;
            }
            iArr[(i23 * 5) + 4] = y0.h(iF4, i11, i21, length);
            if (i23 == i22) {
                i22++;
            }
            i23++;
            i19 = i10;
            i18 = i25;
        }
        int i26 = i18;
        int i27 = i19;
        y0Var2.f7977m = i22;
        int iN = n(y0Var.f7969d, i5, y0Var.n());
        int iN2 = n(y0Var.f7969d, i12, y0Var.n());
        if (iN < iN2) {
            ArrayList arrayList = y0Var.f7969d;
            ArrayList arrayList2 = new ArrayList(iN2 - iN);
            for (int i28 = iN; i28 < iN2; i28++) {
                C0716c c0716c = (C0716c) arrayList.get(i28);
                c0716c.f7752a += i26;
                arrayList2.add(c0716c);
            }
            y0Var2.f7969d.addAll(n(y0Var2.f7969d, y0Var2.f7983s, y0Var2.n()), arrayList2);
            arrayList.subList(iN, iN2).clear();
            vVar = arrayList2;
        } else {
            vVar = ff.v.f35432a;
        }
        if (!vVar.isEmpty()) {
            HashMap map = y0Var.f7970e;
            HashMap map2 = y0Var2.f7970e;
            if (map != null && map2 != null) {
                int size = vVar.size();
                for (int i29 = 0; i29 < size; i29++) {
                }
            }
        }
        int i30 = y0Var2.f7985u;
        HashMap map3 = y0Var2.f7970e;
        if (map3 != null && (c0716cG = y0Var2.G(i17)) != null) {
        }
        int iW = y0Var.w(i5, y0Var.f7967b);
        if (!z11) {
            z12 = false;
        } else if (z2) {
            boolean z15 = iW >= 0;
            if (z15) {
                y0Var.E();
                y0Var.a(iW - y0Var.f7983s);
                y0Var.E();
            }
            y0Var.a(i5 - y0Var.f7983s);
            boolean zY = y0Var.y();
            if (z15) {
                y0Var.B();
                y0Var.i();
                y0Var.B();
                y0Var.i();
            }
            z12 = zY;
        } else {
            z12 = y0Var.z(i5, iQ);
            y0Var.A(iF, i13, i5 - 1);
        }
        if (z12) {
            v("Unexpectedly removed anchors");
            throw null;
        }
        y0Var2.f7979o += m(i14, iArr) ? 1 : o(i14, iArr);
        if (z10) {
            y0Var2.f7983s = i27;
            y0Var2.f7974i = i16 + i13;
        }
        if (z14) {
            y0Var2.I(i17);
        }
        return vVar;
    }

    public static final X.p F() {
        X.p pVar = new X.p();
        R.j jVar = R.j.f10033b;
        X.o oVar = new X.o(jVar);
        if (X.m.f15717a.E() != null) {
            X.o oVar2 = new X.o(jVar);
            oVar2.f15664a = 1;
            oVar.f15665b = oVar2;
        }
        pVar.f15732a = oVar;
        return pVar;
    }

    public static final Y G(Object obj, A0 a02) {
        int i5 = AbstractC0714b.f7745b;
        return new Y(obj, a02);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0102 A[ADDED_TO_REGION, LOOP:1: B:53:0x0102->B:66:0x013b, LOOP_START, PHI: r15
  0x0102: PHI (r15v6 int) = (r15v4 int), (r15v9 int) binds: [B:52:0x0100, B:66:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final N.C0736m H(N.C0740o r15) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0718d.H(N.o):N.m");
    }

    public static final V I(Object obj, C0740o c0740o) {
        Object objF = c0740o.F();
        if (objF == C0732k.f7800a) {
            objF = G(obj, P.f7730f);
            c0740o.U(objF);
        }
        V v2 = (V) objF;
        v2.setValue(obj);
        return v2;
    }

    public static final void J(y0 y0Var, s1 s1Var) {
        int iC;
        int iO;
        int[] iArr = y0Var.f7967b;
        int i5 = y0Var.f7983s;
        int iF = y0Var.f(y0Var.p(y0Var.q(i5) + i5), iArr);
        for (int iF2 = y0Var.f(y0Var.p(y0Var.f7983s), y0Var.f7967b); iF2 < iF; iF2++) {
            Object obj = y0Var.f7968c[y0Var.g(iF2)];
            if (obj instanceof r0) {
                int iO2 = y0Var.o() - iF2;
                r0 r0Var = (r0) obj;
                C0716c c0716c = r0Var.f7903b;
                if (c0716c == null || !c0716c.a()) {
                    iC = -1;
                    iO = -1;
                } else {
                    iC = y0Var.c(c0716c);
                    iO = y0Var.o() - y0Var.f(y0Var.p(y0Var.q(iC) + iC), y0Var.f7967b);
                }
                s1Var.l(r0Var.f7902a, iO2, iC, iO);
            }
            if (obj instanceof C0729i0) {
                ((C0729i0) obj).d();
            }
        }
        y0Var.y();
    }

    public static final void K(boolean z2) {
        if (z2) {
            return;
        }
        v("Check failed");
        throw null;
    }

    public static final int L(ArrayList arrayList, int i5, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((C0716c) arrayList.get(i12)).f7752a;
            if (i13 < 0) {
                i13 += i10;
            }
            int iG = AbstractC3340k.g(i13, i5);
            if (iG < 0) {
                i11 = i12 + 1;
            } else {
                if (iG <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void M(C0740o c0740o, Object obj, tf.p pVar) {
        if (c0740o.f7843O || !AbstractC3340k.a(c0740o.F(), obj)) {
            c0740o.U(obj);
            if (c0740o.f7843O) {
                O.c cVar = c0740o.f7842N;
                cVar.getClass();
                O.y yVar = O.y.f8747c;
                O.B b5 = cVar.f8720b;
                b5.d0(yVar);
                Ba.c.O(b5, 0, obj);
                AbstractC3340k.c(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                kotlin.jvm.internal.K.e(2, pVar);
                Ba.c.O(b5, 1, pVar);
                int i5 = b5.f8706h;
                int i10 = yVar.f8698a;
                int iW = O.B.W(b5, i10);
                int i11 = yVar.f8699b;
                if (i5 == iW && b5.f8707i == O.B.W(b5, i11)) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    if (((1 << i13) & b5.f8706h) != 0) {
                        if (i12 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(yVar.b(i13));
                        i12++;
                    }
                }
                String string = sb2.toString();
                StringBuilder sbW = AbstractC0279p0.w(string, "StringBuilder().apply(builderAction).toString()");
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i11;
                    if (((1 << i14) & b5.f8707i) != 0) {
                        if (i12 > 0) {
                            sbW.append(", ");
                        }
                        sbW.append(yVar.c(i14));
                        i15++;
                    }
                    i14++;
                    i11 = i16;
                }
                String string2 = sbW.toString();
                AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder("Error while pushing ");
                sb3.append(yVar);
                sb3.append(". Not all arguments were provided. Missing ");
                AbstractC0279p0.v(sb3, i12, " int arguments (", string, ") and ");
                AbstractC0279p0.x(sb3, i15, " object arguments (", string2, ").");
                throw null;
            }
            C0784b c0784b = c0740o.L;
            c0784b.b();
            C0783a c0783a = c0784b.f8710b;
            c0783a.getClass();
            O.y yVar2 = O.y.f8747c;
            O.B b10 = c0783a.f8708b;
            b10.d0(yVar2);
            Ba.c.O(b10, 0, obj);
            AbstractC3340k.c(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.K.e(2, pVar);
            Ba.c.O(b10, 1, pVar);
            int i17 = b10.f8706h;
            int i18 = yVar2.f8698a;
            int iW2 = O.B.W(b10, i18);
            int i19 = yVar2.f8699b;
            if (i17 == iW2 && b10.f8707i == O.B.W(b10, i19)) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            int i20 = 0;
            for (int i21 = 0; i21 < i18; i21++) {
                if (((1 << i21) & b10.f8706h) != 0) {
                    if (i20 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(yVar2.b(i21));
                    i20++;
                }
            }
            String string3 = sb4.toString();
            StringBuilder sbW2 = AbstractC0279p0.w(string3, "StringBuilder().apply(builderAction).toString()");
            int i22 = 0;
            int i23 = 0;
            while (i22 < i19) {
                int i24 = i19;
                if (((1 << i22) & b10.f8707i) != 0) {
                    if (i20 > 0) {
                        sbW2.append(", ");
                    }
                    sbW2.append(yVar2.c(i22));
                    i23++;
                }
                i22++;
                i19 = i24;
            }
            String string4 = sbW2.toString();
            AbstractC3340k.d(string4, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb5 = new StringBuilder("Error while pushing ");
            sb5.append(yVar2);
            sb5.append(". Not all arguments were provided. Missing ");
            AbstractC0279p0.v(sb5, i20, " int arguments (", string3, ") and ");
            AbstractC0279p0.x(sb5, i23, " object arguments (", string4, ").");
            throw null;
        }
    }

    public static final Hf.f0 N(tf.a aVar) {
        return new Hf.f0(new H0(aVar, null));
    }

    public static final void O(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void P(String str) {
        throw new IllegalStateException(str);
    }

    public static final int Q(int i5) {
        int i10 = 306783378 & i5;
        int i11 = 613566756 & i5;
        return (i5 & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final V.h R(N.C0725g0[] r13, N.InterfaceC0717c0 r14, N.InterfaceC0717c0 r15) {
        /*
            V.h r0 = V.h.f12864d
            V.g r1 = new V.g
            r1.<init>(r0)
            r1.f12863g = r0
            int r0 = r13.length
            r2 = 0
        Lb:
            if (r2 >= r0) goto L8f
            r3 = r13[r2]
            N.f0 r4 = r3.f7773a
            boolean r5 = r3.f7778f
            if (r5 != 0) goto L1b
            boolean r5 = r14.containsKey(r4)
            if (r5 != 0) goto L8b
        L1b:
            java.lang.Object r5 = r15.get(r4)
            N.N0 r5 = (N.N0) r5
            boolean r6 = r5 instanceof N.E
            java.lang.String r7 = "Unexpected form of a provided value"
            r8 = 0
            java.lang.Object r9 = r3.f7777e
            boolean r10 = r3.f7774b
            boolean r11 = r3.f7776d
            if (r6 == 0) goto L43
            if (r11 == 0) goto L63
            N.E r5 = (N.E) r5
            N.Y r6 = r5.f7678a
            if (r10 == 0) goto L38
            r12 = r8
            goto L3b
        L38:
            if (r9 == 0) goto L3f
            r12 = r9
        L3b:
            r6.setValue(r12)
            goto L64
        L3f:
            w(r7)
            throw r8
        L43:
            boolean r6 = r5 instanceof N.M0
            if (r6 == 0) goto L63
            if (r10 != 0) goto L4b
            if (r9 == 0) goto L63
        L4b:
            if (r11 != 0) goto L63
            if (r10 == 0) goto L51
            r6 = r8
            goto L54
        L51:
            if (r9 == 0) goto L5f
            r6 = r9
        L54:
            N.M0 r5 = (N.M0) r5
            java.lang.Object r12 = r5.f7724a
            boolean r6 = kotlin.jvm.internal.AbstractC3340k.a(r6, r12)
            if (r6 == 0) goto L63
            goto L64
        L5f:
            w(r7)
            throw r8
        L63:
            r5 = r8
        L64:
            if (r5 != 0) goto L88
            if (r11 == 0) goto L78
            N.E r5 = new N.E
            N.A0 r3 = r3.f7775c
            if (r3 != 0) goto L70
            N.P r3 = N.P.f7730f
        L70:
            N.Y r3 = G(r9, r3)
            r5.<init>(r3)
            goto L88
        L78:
            N.M0 r5 = new N.M0
            if (r10 == 0) goto L7d
            goto L80
        L7d:
            if (r9 == 0) goto L84
            r8 = r9
        L80:
            r5.<init>(r8)
            goto L88
        L84:
            w(r7)
            throw r8
        L88:
            r1.put(r4, r5)
        L8b:
            int r2 = r2 + 1
            goto Lb
        L8f:
            V.h r13 = r1.build()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0718d.R(N.g0[], N.c0, N.c0):V.h");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[ADDED_TO_REGION, LOOP:1: B:39:0x00b9->B:52:0x00f2, LOOP_START, PHI: r4
  0x00b9: PHI (r4v17 int) = (r4v15 int), (r4v20 int) binds: [B:38:0x00b7, B:52:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v4, types: [N.c0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(N.C0725g0[] r18, V.d r19, N.C0740o r20, int r21) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0718d.a(N.g0[], V.d, N.o, int):void");
    }

    public static final void b(Object obj, Object obj2, tf.l lVar, C0740o c0740o) {
        boolean zE = c0740o.e(obj) | c0740o.e(obj2);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = new A(lVar);
            c0740o.U(objF);
        }
    }

    public static final void c(Object obj, tf.l lVar, C0740o c0740o) {
        boolean zE = c0740o.e(obj);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = new A(lVar);
            c0740o.U(objF);
        }
    }

    public static final void d(C0740o c0740o, Object obj, tf.p pVar) {
        InterfaceC3108h interfaceC3108hH = c0740o.f7846b.h();
        boolean zE = c0740o.e(obj);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = new M(interfaceC3108hH, pVar);
            c0740o.U(objF);
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, tf.p pVar, C0740o c0740o) {
        InterfaceC3108h interfaceC3108hH = c0740o.f7846b.h();
        boolean zE = c0740o.e(obj) | c0740o.e(obj2) | c0740o.e(obj3);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = new M(interfaceC3108hH, pVar);
            c0740o.U(objF);
        }
    }

    public static final void f(Object obj, Object obj2, tf.p pVar, C0740o c0740o) {
        InterfaceC3108h interfaceC3108hH = c0740o.f7846b.h();
        boolean zE = c0740o.e(obj) | c0740o.e(obj2);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = new M(interfaceC3108hH, pVar);
            c0740o.U(objF);
        }
    }

    public static final void g(tf.a aVar, C0740o c0740o) {
        C0783a c0783a = c0740o.L.f8710b;
        c0783a.getClass();
        O.u uVar = O.u.f8743c;
        O.B b5 = c0783a.f8708b;
        b5.d0(uVar);
        Ba.c.O(b5, 0, aVar);
        int i5 = b5.f8706h;
        int i10 = uVar.f8698a;
        int iW = O.B.W(b5, i10);
        int i11 = uVar.f8699b;
        if (i5 == iW && b5.f8707i == O.B.W(b5, i11)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            if (((1 << i13) & b5.f8706h) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(uVar.b(i13));
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
                sbW.append(uVar.c(i15));
                i14++;
            }
        }
        String string2 = sbW.toString();
        AbstractC3340k.d(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(uVar);
        sb3.append(". Not all arguments were provided. Missing ");
        AbstractC0279p0.v(sb3, i12, " int arguments (", string, ") and ");
        AbstractC0279p0.x(sb3, i14, " object arguments (", string2, ").");
        throw null;
    }

    public static final boolean h(int i5, int[] iArr) {
        return (iArr[(i5 * 5) + 1] & 67108864) != 0;
    }

    public static final int i(int i5, int[] iArr) {
        return iArr[(i5 * 5) + 4];
    }

    public static final int j(int i5, int[] iArr) {
        return iArr[(i5 * 5) + 3];
    }

    public static final boolean k(int i5, int[] iArr) {
        return (iArr[(i5 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean l(int i5, int[] iArr) {
        return (iArr[(i5 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean m(int i5, int[] iArr) {
        return (iArr[(i5 * 5) + 1] & 1073741824) != 0;
    }

    public static final int n(ArrayList arrayList, int i5, int i10) {
        int iL = L(arrayList, i5, i10);
        return iL >= 0 ? iL : -(iL + 1);
    }

    public static final int o(int i5, int[] iArr) {
        return iArr[(i5 * 5) + 1] & 67108863;
    }

    public static final int p(int i5, int[] iArr) {
        return iArr[(i5 * 5) + 2];
    }

    public static final void q(ArrayList arrayList, int i5, int i10) {
        int iA = A(arrayList, i5);
        if (iA < 0) {
            iA = -(iA + 1);
        }
        while (iA < arrayList.size() && ((J) arrayList.get(iA)).f7711b < i10) {
            arrayList.remove(iA);
        }
    }

    public static final int r(int i5, int[] iArr) {
        int i10 = i5 * 5;
        int i11 = iArr[i10 + 4];
        int i12 = 1;
        switch (iArr[i10 + 1] >> 28) {
            case 0:
                i12 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        return i12 + i11;
    }

    public static final void s(int i5, int i10, int[] iArr) {
        K(i10 >= 0);
        iArr[(i5 * 5) + 3] = i10;
    }

    public static final void t(int i5, int i10, int[] iArr) {
        K(i10 >= 0 && i10 < 67108863);
        int i11 = (i5 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    public static final V u(Hf.v0 v0Var, C0740o c0740o, int i5) {
        C3109i c3109i = C3109i.f38759a;
        Object value = v0Var.getValue();
        boolean zG = c0740o.g(c3109i) | c0740o.g(v0Var);
        Object objF = c0740o.F();
        Object obj = C0732k.f7800a;
        if (zG || objF == obj) {
            objF = new F0(c3109i, v0Var, null);
            c0740o.U(objF);
        }
        tf.p pVar = (tf.p) objF;
        Object objF2 = c0740o.F();
        if (objF2 == obj) {
            objF2 = G(value, P.f7730f);
            c0740o.U(objF2);
        }
        V v2 = (V) objF2;
        boolean zG2 = c0740o.g(pVar);
        Object objF3 = c0740o.F();
        if (zG2 || objF3 == obj) {
            objF3 = new C0(pVar, v2, null);
            c0740o.U(objF3);
        }
        f(v0Var, c3109i, (tf.p) objF3, c0740o);
        return v2;
    }

    public static final void v(String str) {
        throw new C0730j(AbstractC0279p0.l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void w(String str) {
        throw new C0730j(AbstractC0279p0.l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Kd.a x(InterfaceC3108h interfaceC3108h, C0740o c0740o) {
        C0499l0 c0499l0 = C0499l0.f3748a;
        if (interfaceC3108h.get(c0499l0) == null) {
            InterfaceC3108h interfaceC3108hH = c0740o.f7846b.h();
            return Ef.H.c(interfaceC3108hH.plus(new C0505o0((InterfaceC0501m0) interfaceC3108hH.get(c0499l0))).plus(interfaceC3108h));
        }
        C0505o0 c0505o0D = Ef.H.d();
        c0505o0D.K(new C0517x(false, new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job")));
        return Ef.H.c(c0505o0D);
    }

    public static final long y() {
        return Thread.currentThread().getId();
    }

    public static final P.d z() {
        Dd.c cVar = B0.f7668b;
        P.d dVar = (P.d) cVar.E();
        if (dVar != null) {
            return dVar;
        }
        P.d dVar2 = new P.d(new C0738n[0]);
        cVar.Q(dVar2);
        return dVar2;
    }
}
