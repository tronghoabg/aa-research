package X;

import B.F;
import N.C0718d;
import N.C0738n;
import N.C0751z;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3340k;
import x.C4421n;
import x.C4422o;
import x.C4425r;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final tf.l f15741a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15742b;

    /* renamed from: c, reason: collision with root package name */
    public C4421n f15743c;

    /* renamed from: j, reason: collision with root package name */
    public int f15750j;

    /* renamed from: d, reason: collision with root package name */
    public int f15744d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final Y9.c f15745e = new Y9.c(20);

    /* renamed from: f, reason: collision with root package name */
    public final C4422o f15746f = new C4422o();

    /* renamed from: g, reason: collision with root package name */
    public final C4425r f15747g = new C4425r();

    /* renamed from: h, reason: collision with root package name */
    public final P.d f15748h = new P.d(new C0751z[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0738n f15749i = new C0738n(this, 1);
    public final Y9.c k = new Y9.c(20);

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f15751l = new HashMap();

    public t(tf.l lVar) {
        this.f15741a = lVar;
    }

    public final void a(Object obj, F f10, tf.a aVar) {
        boolean z2;
        int i5;
        int i10;
        Object obj2 = this.f15742b;
        C4421n c4421n = this.f15743c;
        int i11 = this.f15744d;
        this.f15742b = obj;
        this.f15743c = (C4421n) this.f15746f.e(obj);
        if (this.f15744d == -1) {
            this.f15744d = m.k().d();
        }
        C0738n c0738n = this.f15749i;
        P.d dVarZ = C0718d.z();
        boolean z10 = true;
        try {
            dVarZ.b(c0738n);
            q.c(aVar, f10);
            dVarZ.m(dVarZ.f8972c - 1);
            Object obj3 = this.f15742b;
            AbstractC3340k.b(obj3);
            int i12 = this.f15744d;
            C4421n c4421n2 = this.f15743c;
            if (c4421n2 != null) {
                long[] jArr = c4421n2.f47528a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j8 = jArr[i13];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            z2 = z10;
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j8 & 255) < 128) {
                                    int i17 = (i13 << 3) + i16;
                                    i10 = i14;
                                    Object obj4 = c4421n2.f47529b[i17];
                                    i5 = i16;
                                    boolean z11 = c4421n2.f47530c[i17] != i12 ? z2 : false;
                                    if (z11) {
                                        d(obj3, obj4);
                                    }
                                    if (z11) {
                                        c4421n2.e(i17);
                                    }
                                } else {
                                    i5 = i16;
                                    i10 = i14;
                                }
                                j8 >>= i10;
                                i16 = i5 + 1;
                                i14 = i10;
                            }
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            z2 = z10;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        z10 = z2;
                    }
                }
            }
            this.f15742b = obj2;
            this.f15743c = c4421n;
            this.f15744d = i11;
        } catch (Throwable th) {
            dVarZ.m(dVarZ.f8972c - 1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x027b A[PHI: r22
  0x027b: PHI (r22v38 boolean) = (r22v37 boolean), (r22v39 boolean) binds: [B:101:0x0252, B:109:0x0279] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d3 A[PHI: r22
  0x03d3: PHI (r22v21 boolean) = (r22v20 boolean), (r22v22 boolean) binds: [B:157:0x03a1, B:167:0x03d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x049c A[PHI: r22
  0x049c: PHI (r22v11 boolean) = (r22v10 boolean), (r22v12 boolean) binds: [B:193:0x0473, B:201:0x049a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0505 A[EDGE_INSN: B:224:0x0505->B:304:0x050f BREAK  A[LOOP:18: B:214:0x04d2->B:225:0x0507], PHI: r22
  0x0505: PHI (r22v5 boolean) = (r22v4 boolean), (r22v6 boolean) binds: [B:215:0x04dc, B:223:0x0503] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139 A[PHI: r22
  0x0139: PHI (r22v54 boolean) = (r22v53 boolean), (r22v55 boolean) binds: [B:44:0x010d, B:53:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e A[PHI: r22
  0x020e: PHI (r22v44 boolean) = (r22v43 boolean), (r22v45 boolean) binds: [B:79:0x01e5, B:87:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.Set r48) {
        /*
            Method dump skipped, instructions count: 1525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.t.b(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r21, int r22, java.lang.Object r23, x.C4421n r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f15750j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.b(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f47530c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f47529b
            r7[r4] = r1
            int[] r3 = r3.f47530c
            r3[r4] = r2
            boolean r3 = r1 instanceof N.C0751z
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            N.z r2 = (N.C0751z) r2
            N.x r2 = r2.j()
            java.util.HashMap r3 = r0.f15751l
            java.lang.Object r7 = r2.f7958f
            r3.put(r1, r7)
            x.n r2 = r2.f7957e
            Y9.c r3 = r0.k
            r3.p(r1)
            java.lang.Object[] r7 = r2.f47529b
            long[] r2 = r2.f47528a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            X.y r9 = (X.y) r9
            boolean r5 = r9 instanceof X.z
            if (r5 == 0) goto L82
            r5 = r9
            X.z r5 = (X.z) r5
            r5.h(r4)
        L82:
            r3.b(r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof X.z
            if (r2 == 0) goto L9d
            r2 = r1
            X.z r2 = (X.z) r2
            r2.h(r4)
        L9d:
            Y9.c r2 = r0.f15745e
            r3 = r23
            r2.b(r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.t.c(java.lang.Object, int, java.lang.Object, x.n):void");
    }

    public final void d(Object obj, Object obj2) {
        Y9.c cVar = this.f15745e;
        cVar.n(obj2, obj);
        if (!(obj2 instanceof C0751z) || ((C4422o) cVar.f16739b).b(obj2)) {
            return;
        }
        this.k.p(obj2);
        this.f15751l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.t.e():void");
    }
}
