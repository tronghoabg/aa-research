package X1;

import A.C0230x;
import A7.C0292u;
import E4.F;
import F6.p;
import N1.C;
import N1.C0765n;
import Q1.x;
import S1.u;
import android.os.SystemClock;
import com.unity3d.services.core.device.MimeTypes;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k2.C3145b;
import l2.AbstractC3380e;
import l2.C3379d;
import l8.AbstractC3409K;
import n2.q;
import o2.n;
import s2.w;
import wa.C4398a;

/* loaded from: classes.dex */
public final class i implements l2.i {

    /* renamed from: a, reason: collision with root package name */
    public final n f15989a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.n f15990b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f15991c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15992d;

    /* renamed from: e, reason: collision with root package name */
    public final S1.h f15993e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15994f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15995g;

    /* renamed from: h, reason: collision with root package name */
    public final l f15996h;

    /* renamed from: i, reason: collision with root package name */
    public final C0292u[] f15997i;

    /* renamed from: j, reason: collision with root package name */
    public q f15998j;
    public Y1.c k;

    /* renamed from: l, reason: collision with root package name */
    public int f15999l;

    /* renamed from: m, reason: collision with root package name */
    public C3145b f16000m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16001n;

    /* JADX WARN: Type inference failed for: r0v0, types: [X1.i, java.lang.Object] */
    public i(F f10, n nVar, Y1.c cVar, S3.n nVar2, int i5, int[] iArr, q qVar, int i10, S1.h hVar, long j8, int i11, boolean z2, ArrayList arrayList, l lVar) {
        C0292u[] c0292uArr;
        int i12;
        C0765n c0765n;
        Y1.m mVar;
        s2.m lVar2;
        C3379d c3379d;
        ?? obj = new Object();
        obj.f15989a = nVar;
        obj.k = cVar;
        obj.f15990b = nVar2;
        obj.f15991c = iArr;
        obj.f15998j = qVar;
        obj.f15992d = i10;
        obj.f15993e = hVar;
        obj.f15999l = i5;
        obj.f15994f = j8;
        obj.f15995g = i11;
        l lVar3 = lVar;
        obj.f15996h = lVar3;
        long jD = cVar.d(i5);
        ArrayList arrayListH = obj.h();
        obj.f15997i = new C0292u[qVar.length()];
        int i13 = 0;
        int i14 = 0;
        i iVar = obj;
        while (i14 < iVar.f15997i.length) {
            Y1.m mVar2 = (Y1.m) arrayListH.get(qVar.c(i14));
            Y1.b bVarD = nVar2.d(mVar2.f16359b);
            C0292u[] c0292uArr2 = iVar.f15997i;
            Y1.b bVar = bVarD == null ? (Y1.b) mVar2.f16359b.get(i13) : bVarD;
            f10.getClass();
            C0765n c0765n2 = mVar2.f16358a;
            String str = c0765n2.f8231m;
            if (!C.k(str)) {
                if (str != null && (str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i12 = i14;
                    mVar = mVar2;
                    c0765n = c0765n2;
                    c0292uArr = c0292uArr2;
                    lVar2 = new K2.d((C4398a) f10.f2854c, f10.f2853b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    lVar2 = new O2.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    lVar2 = new O2.a((byte) 0, 0);
                } else {
                    int i15 = z2 ? 4 : 0;
                    c0292uArr = c0292uArr2;
                    i12 = i14;
                    c0765n = c0765n2;
                    int i16 = f10.f2853b ? i15 : i15 | 32;
                    mVar = mVar2;
                    lVar2 = new M2.l((C4398a) f10.f2854c, i16, null, null, arrayList, lVar3);
                }
                c3379d = new C3379d(lVar2, i10, c0765n);
                long j10 = jD;
                c0292uArr[i12] = new C0292u(j10, mVar, bVar, c3379d, 0L, mVar.c());
                i14 = i12 + 1;
                iVar = this;
                lVar3 = lVar;
                jD = j10;
                i13 = 0;
            } else if (f10.f2853b) {
                lVar2 = new P2.h(((C4398a) f10.f2854c).i(c0765n2), c0765n2);
            } else {
                c3379d = null;
                i12 = i14;
                mVar = mVar2;
                c0292uArr = c0292uArr2;
                long j102 = jD;
                c0292uArr[i12] = new C0292u(j102, mVar, bVar, c3379d, 0L, mVar.c());
                i14 = i12 + 1;
                iVar = this;
                lVar3 = lVar;
                jD = j102;
                i13 = 0;
            }
            i12 = i14;
            mVar = mVar2;
            c0765n = c0765n2;
            c0292uArr = c0292uArr2;
            c3379d = new C3379d(lVar2, i10, c0765n);
            long j1022 = jD;
            c0292uArr[i12] = new C0292u(j1022, mVar, bVar, c3379d, 0L, mVar.c());
            i14 = i12 + 1;
            iVar = this;
            lVar3 = lVar;
            jD = j1022;
            i13 = 0;
        }
    }

    @Override // l2.i
    public final void a() throws C3145b {
        C3145b c3145b = this.f16000m;
        if (c3145b != null) {
            throw c3145b;
        }
        this.f15989a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // l2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r19, U1.a0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            A7.u[] r0 = r7.f15997i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L64
            r5 = r0[r4]
            java.lang.Object r6 = r5.f1074g
            X1.g r6 = (X1.g) r6
            if (r6 == 0) goto L5f
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L5f
        L1d:
            java.lang.Object r0 = r5.f1074g
            X1.g r0 = (X1.g) r0
            Q1.k.h(r0)
            long r3 = r5.f1069b
            long r3 = r0.v(r1, r3)
            long r10 = r5.f1070c
            long r3 = r3 + r10
            r12 = r3
            long r3 = r5.f(r12)
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 >= 0) goto L58
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4f
            Q1.k.h(r0)
            long r16 = r0.E()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto L58
        L4f:
            long r8 = r12 + r14
            long r5 = r5.f(r8)
        L55:
            r0 = r21
            goto L5a
        L58:
            r5 = r3
            goto L55
        L5a:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5f:
            int r4 = r4 + 1
            r1 = r19
            goto L8
        L64:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.i.b(long, U1.a0):long");
    }

    @Override // l2.i
    public final void c(AbstractC3380e abstractC3380e) {
        if (abstractC3380e instanceof l2.k) {
            int iQ = this.f15998j.q(((l2.k) abstractC3380e).f39892d);
            C0292u[] c0292uArr = this.f15997i;
            C0292u c0292u = c0292uArr[iQ];
            if (((g) c0292u.f1074g) == null) {
                C3379d c3379d = (C3379d) c0292u.f1071d;
                Q1.k.h(c3379d);
                w wVar = c3379d.f39887h;
                s2.h hVar = wVar instanceof s2.h ? (s2.h) wVar : null;
                if (hVar != null) {
                    Y1.m mVar = (Y1.m) c0292u.f1072e;
                    c0292uArr[iQ] = new C0292u(c0292u.f1069b, mVar, (Y1.b) c0292u.f1073f, (C3379d) c0292u.f1071d, c0292u.f1070c, new A2.d(hVar, mVar.f16360c, 8));
                }
            }
        }
        l lVar = this.f15996h;
        if (lVar != null) {
            long j8 = lVar.f16015d;
            if (j8 == -9223372036854775807L || abstractC3380e.f39896h > j8) {
                lVar.f16015d = abstractC3380e.f39896h;
            }
            lVar.f16016e.f16023g = true;
        }
    }

    @Override // l2.i
    public final boolean d(long j8, AbstractC3380e abstractC3380e, List list) {
        if (this.f16000m != null) {
            return false;
        }
        return this.f15998j.r(j8, abstractC3380e, list);
    }

    @Override // l2.i
    public final boolean e(AbstractC3380e abstractC3380e, boolean z2, C0230x c0230x, ae.d dVar) {
        long jMax;
        if (z2) {
            l lVar = this.f15996h;
            if (lVar != null) {
                long j8 = lVar.f16015d;
                boolean z10 = j8 != -9223372036854775807L && j8 < abstractC3380e.f39895g;
                m mVar = lVar.f16016e;
                if (mVar.f16022f.f16313d) {
                    if (!mVar.f16024h) {
                        if (z10) {
                            if (mVar.f16023g) {
                                mVar.f16024h = true;
                                mVar.f16023g = false;
                                f fVar = (f) mVar.f16018b.f16739b;
                                fVar.f15957D.removeCallbacks(fVar.f15983w);
                                fVar.z();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z11 = this.k.f16313d;
            C0292u[] c0292uArr = this.f15997i;
            if (!z11 && (abstractC3380e instanceof l2.l)) {
                IOException iOException = (IOException) c0230x.f188c;
                if ((iOException instanceof u) && ((u) iOException).f10908d == 404) {
                    C0292u c0292u = c0292uArr[this.f15998j.q(abstractC3380e.f39892d)];
                    long jD = c0292u.d();
                    if (jD != -1 && jD != 0) {
                        g gVar = (g) c0292u.f1074g;
                        Q1.k.h(gVar);
                        if (((l2.l) abstractC3380e).a() > ((gVar.E() + c0292u.f1070c) + jD) - 1) {
                            this.f16001n = true;
                            return true;
                        }
                    }
                }
            }
            C0292u c0292u2 = c0292uArr[this.f15998j.q(abstractC3380e.f39892d)];
            AbstractC3409K abstractC3409K = ((Y1.m) c0292u2.f1072e).f16359b;
            S3.n nVar = this.f15990b;
            Y1.b bVarD = nVar.d(abstractC3409K);
            Y1.b bVar = (Y1.b) c0292u2.f1073f;
            if (bVarD == null || bVar.equals(bVarD)) {
                q qVar = this.f15998j;
                AbstractC3409K abstractC3409K2 = ((Y1.m) c0292u2.f1072e).f16359b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int length = qVar.length();
                int i5 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    if (qVar.m(i10, jElapsedRealtime)) {
                        i5++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < abstractC3409K2.size(); i11++) {
                    hashSet.add(Integer.valueOf(((Y1.b) abstractC3409K2.get(i11)).f16308c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayListA = nVar.a(abstractC3409K2);
                for (int i12 = 0; i12 < arrayListA.size(); i12++) {
                    hashSet2.add(Integer.valueOf(((Y1.b) arrayListA.get(i12)).f16308c));
                }
                p pVar = new p(size, size - hashSet2.size(), length, i5);
                if (pVar.a(2) || pVar.a(1)) {
                    dVar.getClass();
                    U5.f fVarF = ae.d.f(pVar, c0230x);
                    if (fVarF != null) {
                        int i13 = fVarF.f12344a;
                        if (pVar.a(i13)) {
                            long j10 = fVarF.f12345b;
                            if (i13 == 2) {
                                q qVar2 = this.f15998j;
                                return qVar2.o(qVar2.q(abstractC3380e.f39892d), j10);
                            }
                            if (i13 == 1) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                String str = bVar.f16307b;
                                HashMap map = (HashMap) nVar.f10970a;
                                if (map.containsKey(str)) {
                                    Long l10 = (Long) map.get(str);
                                    int i14 = x.f9724a;
                                    jMax = Math.max(jElapsedRealtime2, l10.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                int i15 = bVar.f16308c;
                                if (i15 != Integer.MIN_VALUE) {
                                    Integer numValueOf = Integer.valueOf(i15);
                                    HashMap map2 = (HashMap) nVar.f10971b;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l11 = (Long) map2.get(numValueOf);
                                        int i16 = x.f9724a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l11.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d  */
    @Override // l2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(U1.C r59, long r60, java.util.List r62, E4.F r63) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.i.f(U1.C, long, java.util.List, E4.F):void");
    }

    @Override // l2.i
    public final int g(long j8, List list) {
        return (this.f16000m != null || this.f15998j.length() < 2) ? list.size() : this.f15998j.s(j8, list);
    }

    public final ArrayList h() {
        List list = this.k.b(this.f15999l).f16344c;
        ArrayList arrayList = new ArrayList();
        for (int i5 : this.f15991c) {
            arrayList.addAll(((Y1.a) list.get(i5)).f16302c);
        }
        return arrayList;
    }

    public final C0292u i(int i5) {
        C0292u[] c0292uArr = this.f15997i;
        C0292u c0292u = c0292uArr[i5];
        Y1.b bVarD = this.f15990b.d(((Y1.m) c0292u.f1072e).f16359b);
        if (bVarD == null || bVarD.equals((Y1.b) c0292u.f1073f)) {
            return c0292u;
        }
        C0292u c0292u2 = new C0292u(c0292u.f1069b, (Y1.m) c0292u.f1072e, bVarD, (C3379d) c0292u.f1071d, c0292u.f1070c, (g) c0292u.f1074g);
        c0292uArr[i5] = c0292u2;
        return c0292u2;
    }

    @Override // l2.i
    public final void release() {
        for (C0292u c0292u : this.f15997i) {
            C3379d c3379d = (C3379d) c0292u.f1071d;
            if (c3379d != null) {
                c3379d.f39880a.release();
            }
        }
    }
}
