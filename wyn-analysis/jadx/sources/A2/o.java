package a2;

import A7.AbstractC0279p0;
import N1.C0765n;
import Q1.x;
import io.ktor.utils.io.T;
import java.io.IOException;
import java.util.ArrayList;
import k2.d0;

/* loaded from: classes.dex */
public final class o implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17249a;

    /* renamed from: b, reason: collision with root package name */
    public final s f17250b;

    /* renamed from: c, reason: collision with root package name */
    public int f17251c = -1;

    public o(s sVar, int i5) {
        this.f17250b = sVar;
        this.f17249a = i5;
    }

    @Override // k2.d0
    public final void a() throws IOException {
        int i5 = this.f17251c;
        s sVar = this.f17250b;
        if (i5 == -2) {
            sVar.a();
            throw new T(AbstractC0279p0.l("Unable to bind a sample queue to TrackGroup with MIME type ", sVar.f17272I.a(this.f17249a).f8076d[0].f8232n, "."));
        }
        if (i5 == -1) {
            sVar.D();
        } else if (i5 != -3) {
            sVar.D();
            sVar.f17307v[i5].x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            int r0 = r6.f17251c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            Q1.k.c(r0)
            a2.s r0 = r6.f17250b
            r0.a()
            int[] r3 = r0.f17274K
            r3.getClass()
            int[] r3 = r0.f17274K
            int r4 = r6.f17249a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.f17273J
            k2.n0 r0 = r0.f17272I
            N1.O r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = r5
            goto L3a
        L31:
            boolean[] r0 = r0.f17276N
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.f17251c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.o.b():void");
    }

    public final boolean c() {
        int i5 = this.f17251c;
        return (i5 == -1 || i5 == -3 || i5 == -2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // k2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(long r5) {
        /*
            r4 = this;
            boolean r0 = r4.c()
            if (r0 == 0) goto L5e
            int r0 = r4.f17251c
            a2.s r1 = r4.f17250b
            boolean r2 = r1.z()
            if (r2 == 0) goto L11
            goto L5e
        L11:
            a2.r[] r2 = r1.f17307v
            r2 = r2[r0]
            boolean r3 = r1.f17282T
            int r5 = r2.t(r5, r3)
            java.util.ArrayList r6 = r1.f17299n
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L2e
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L28
            goto L44
        L28:
            r1 = 1
            java.lang.Object r6 = ka.AbstractC3256n.e(r6, r1)
            goto L45
        L2e:
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L44
        L38:
            java.lang.Object r1 = r6.next()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L38
            r6 = r1
            goto L45
        L44:
            r6 = 0
        L45:
            a2.l r6 = (a2.l) r6
            if (r6 == 0) goto L5a
            boolean r1 = r6.f17200K
            if (r1 != 0) goto L5a
            int r1 = r2.r()
            int r6 = r6.e(r0)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L5a:
            r2.G(r5)
            return r5
        L5e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.o.g(long):int");
    }

    @Override // k2.d0
    public final boolean isReady() {
        if (this.f17251c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i5 = this.f17251c;
        s sVar = this.f17250b;
        return !sVar.z() && sVar.f17307v[i5].v(sVar.f17282T);
    }

    @Override // k2.d0
    public final int s(S3.c cVar, T1.d dVar, int i5) {
        C0765n c0765n;
        if (this.f17251c == -3) {
            dVar.b(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f17251c;
            s sVar = this.f17250b;
            if (!sVar.z()) {
                ArrayList arrayList = sVar.f17299n;
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((l) arrayList.get(i12)).k;
                        int length = sVar.f17307v.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (sVar.f17276N[i14] && sVar.f17307v[i14].z() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    x.P(arrayList, 0, i12);
                    l lVar = (l) arrayList.get(0);
                    C0765n c0765n2 = lVar.f39892d;
                    if (!c0765n2.equals(sVar.f17270G)) {
                        sVar.k.b(sVar.f17288b, c0765n2, lVar.f39893e, lVar.f39894f, lVar.f39895g);
                    }
                    sVar.f17270G = c0765n2;
                }
                if (arrayList.isEmpty() || ((l) arrayList.get(0)).f17200K) {
                    int iA = sVar.f17307v[i10].A(cVar, dVar, i5, sVar.f17282T);
                    if (iA == -5) {
                        C0765n c0765nD = (C0765n) cVar.f10937c;
                        c0765nD.getClass();
                        if (i10 == sVar.f17265B) {
                            int iL = S3.f.l(sVar.f17307v[i10].z());
                            while (i11 < arrayList.size() && ((l) arrayList.get(i11)).k != iL) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                c0765n = ((l) arrayList.get(i11)).f39892d;
                            } else {
                                c0765n = sVar.f17269F;
                                c0765n.getClass();
                            }
                            c0765nD = c0765nD.d(c0765n);
                        }
                        cVar.f10937c = c0765nD;
                    }
                    return iA;
                }
            }
        }
        return -3;
    }
}
