package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends en implements ez {
    private int[] D;

    /* renamed from: a, reason: collision with root package name */
    fw[] f947a;

    /* renamed from: b, reason: collision with root package name */
    dv f948b;

    /* renamed from: c, reason: collision with root package name */
    dv f949c;

    /* renamed from: i, reason: collision with root package name */
    private int f955i;

    /* renamed from: j, reason: collision with root package name */
    private int f956j;

    /* renamed from: k, reason: collision with root package name */
    private int f957k;

    /* renamed from: l, reason: collision with root package name */
    private final cz f958l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private fv q;

    /* renamed from: d, reason: collision with root package name */
    boolean f950d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f951e = false;

    /* renamed from: f, reason: collision with root package name */
    int f952f = -1;

    /* renamed from: g, reason: collision with root package name */
    int f953g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    fu f954h = new fu();
    private int n = 2;
    private final Rect A = new Rect();
    private final fr B = new fr(this);
    private boolean C = true;
    private final Runnable E = new e(this, 8);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f955i = -1;
        em emVarAG = aG(context, attributeSet, i2, i3);
        int i4 = emVarAG.f1406a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        T(null);
        if (i4 != this.f956j) {
            this.f956j = i4;
            dv dvVar = this.f948b;
            this.f948b = this.f949c;
            this.f949c = dvVar;
            ba();
        }
        int i5 = emVarAG.f1407b;
        T(null);
        if (i5 != this.f955i) {
            this.f954h.a();
            ba();
            this.f955i = i5;
            this.m = new BitSet(i5);
            this.f947a = new fw[this.f955i];
            for (int i6 = 0; i6 < this.f955i; i6++) {
                this.f947a[i6] = new fw(this, i6);
            }
            ba();
        }
        u(emVarAG.f1408c);
        this.f958l = new cz();
        this.f948b = dv.p(this, this.f956j);
        this.f949c = dv.p(this, 1 - this.f956j);
    }

    private final int M(int i2) {
        if (as() == 0) {
            return this.f951e ? 1 : -1;
        }
        return (i2 < c()) != this.f951e ? -1 : 1;
    }

    private final int N(fb fbVar) {
        if (as() == 0) {
            return 0;
        }
        return ed.c(fbVar, this.f948b, m(!this.C), l(!this.C), this, this.C);
    }

    private final int O(fb fbVar) {
        if (as() == 0) {
            return 0;
        }
        return ed.d(fbVar, this.f948b, m(!this.C), l(!this.C), this, this.C, this.f951e);
    }

    private final int R(fb fbVar) {
        if (as() == 0) {
            return 0;
        }
        return ed.e(fbVar, this.f948b, m(!this.C), l(!this.C), this, this.C);
    }

    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    private final int U(et etVar, cz czVar, fb fbVar) {
        fw fwVar;
        ?? r6;
        int iF;
        int iB;
        int iJ;
        int iB2;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 1;
        this.m.set(0, this.f955i, true);
        cz czVar2 = this.f958l;
        int i7 = czVar2.f1306i ? czVar.f1302e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : czVar.f1302e == 1 ? czVar.f1304g + czVar.f1299b : czVar.f1303f - czVar.f1299b;
        int i8 = czVar.f1302e;
        for (int i9 = 0; i9 < this.f955i; i9++) {
            if (!this.f947a[i9].f1526a.isEmpty()) {
                bE(this.f947a[i9], i8, i7);
            }
        }
        boolean z = this.f951e;
        dv dvVar = this.f948b;
        int iF2 = z ? dvVar.f() : dvVar.j();
        boolean z2 = false;
        while (czVar.a(fbVar) && (czVar2.f1306i || !this.m.isEmpty())) {
            View viewC = etVar.c(czVar.f1300c);
            czVar.f1300c += czVar.f1301d;
            fs fsVar = (fs) viewC.getLayoutParams();
            int iA = fsVar.a();
            int[] iArr = this.f954h.f1514a;
            int i10 = (iArr == null || iA >= iArr.length) ? -1 : iArr[iA];
            int i11 = i10 == -1 ? i6 : i5;
            if (i11 != 0) {
                boolean z3 = fsVar.f1509b;
                boolean zBF = bF(czVar.f1302e);
                int i12 = this.f955i;
                if (zBF) {
                    i4 = i12 - 1;
                    i3 = -1;
                    i2 = -1;
                } else {
                    i2 = i6;
                    i3 = i12;
                    i4 = i5;
                }
                int i13 = czVar.f1302e;
                dv dvVar2 = this.f948b;
                fw fwVar2 = null;
                if (i13 == i6) {
                    int iJ2 = dvVar2.j();
                    int i14 = Integer.MAX_VALUE;
                    while (i4 != i3) {
                        fw fwVar3 = this.f947a[i4];
                        int iD = fwVar3.d(iJ2);
                        int i15 = iD < i14 ? iD : i14;
                        if (iD < i14) {
                            fwVar2 = fwVar3;
                        }
                        i4 += i2;
                        i14 = i15;
                    }
                } else {
                    int iF3 = dvVar2.f();
                    int i16 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        fw fwVar4 = this.f947a[i4];
                        int iF4 = fwVar4.f(iF3);
                        int i17 = iF4 > i16 ? iF4 : i16;
                        if (iF4 > i16) {
                            fwVar2 = fwVar4;
                        }
                        i4 += i2;
                        i16 = i17;
                    }
                }
                fwVar = fwVar2;
                fu fuVar = this.f954h;
                fuVar.b(iA);
                fuVar.f1514a[iA] = fwVar.f1530e;
            } else {
                fwVar = this.f947a[i10];
            }
            fsVar.f1508a = fwVar;
            if (czVar.f1302e == 1) {
                aM(viewC);
                r6 = 0;
            } else {
                r6 = 0;
                aN(viewC, 0);
            }
            boolean z4 = fsVar.f1509b;
            if (this.f956j == 1) {
                bG(viewC, at(this.f957k, aF(), r6, fsVar.width, r6), at(au(), av(), aD() + aA(), fsVar.height, true));
            } else {
                bG(viewC, at(aE(), aF(), aB() + aC(), fsVar.width, true), at(this.f957k, av(), 0, fsVar.height, false));
            }
            if (czVar.f1302e == 1) {
                boolean z5 = fsVar.f1509b;
                iB = fwVar.d(iF2);
                iF = this.f948b.b(viewC) + iB;
                if (i11 != 0) {
                    boolean z6 = fsVar.f1509b;
                }
            } else {
                boolean z7 = fsVar.f1509b;
                iF = fwVar.f(iF2);
                iB = iF - this.f948b.b(viewC);
                if (i11 != 0) {
                    boolean z8 = fsVar.f1509b;
                }
            }
            boolean z9 = fsVar.f1509b;
            if (czVar.f1302e == 1) {
                fw fwVar5 = fsVar.f1508a;
                fs fsVarN = fw.n(viewC);
                fsVarN.f1508a = fwVar5;
                ArrayList arrayList = fwVar5.f1526a;
                arrayList.add(viewC);
                fwVar5.f1528c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fwVar5.f1527b = Integer.MIN_VALUE;
                }
                if (fsVarN.c() || fsVarN.b()) {
                    fwVar5.f1529d += fwVar5.f1531f.f948b.b(viewC);
                }
            } else {
                fw fwVar6 = fsVar.f1508a;
                fs fsVarN2 = fw.n(viewC);
                fsVarN2.f1508a = fwVar6;
                ArrayList arrayList2 = fwVar6.f1526a;
                arrayList2.add(0, viewC);
                fwVar6.f1527b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fwVar6.f1528c = Integer.MIN_VALUE;
                }
                if (fsVarN2.c() || fsVarN2.b()) {
                    fwVar6.f1529d += fwVar6.f1531f.f948b.b(viewC);
                }
            }
            if (L() && this.f956j == 1) {
                boolean z10 = fsVar.f1509b;
                iB2 = this.f949c.f() - (((this.f955i - 1) - fwVar.f1530e) * this.f957k);
                iJ = iB2 - this.f949c.b(viewC);
            } else {
                boolean z11 = fsVar.f1509b;
                iJ = this.f949c.j() + (fwVar.f1530e * this.f957k);
                iB2 = this.f949c.b(viewC) + iJ;
            }
            if (this.f956j == 1) {
                bw(viewC, iJ, iB, iB2, iF);
            } else {
                bw(viewC, iB, iJ, iF, iB2);
            }
            boolean z12 = fsVar.f1509b;
            bE(fwVar, czVar2.f1302e, i7);
            al(etVar, czVar2);
            if (czVar2.f1305h && viewC.hasFocusable()) {
                boolean z13 = fsVar.f1509b;
                this.m.set(fwVar.f1530e, false);
                i5 = 0;
                i6 = 1;
                z2 = true;
            } else {
                i6 = 1;
                z2 = true;
                i5 = 0;
            }
        }
        if (!z2) {
            al(etVar, czVar2);
        }
        int i18 = czVar2.f1302e;
        dv dvVar3 = this.f948b;
        int iJ3 = i18 == -1 ? this.f948b.j() - ab(dvVar3.j()) : X(dvVar3.f()) - this.f948b.f();
        if (iJ3 > 0) {
            return Math.min(czVar.f1299b, iJ3);
        }
        return 0;
    }

    private final int X(int i2) {
        int iD = this.f947a[0].d(i2);
        for (int i3 = 1; i3 < this.f955i; i3++) {
            int iD2 = this.f947a[i3].d(i2);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int ab(int i2) {
        int iF = this.f947a[0].f(i2);
        for (int i3 = 1; i3 < this.f955i; i3++) {
            int iF2 = this.f947a[i3].f(i2);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    private final void ac(et etVar, fb fbVar, boolean z) {
        int iF;
        int i2;
        int iX = X(Integer.MIN_VALUE);
        if (iX != Integer.MIN_VALUE && (iF = this.f948b.f() - iX) > 0) {
            int i3 = -j(-iF, etVar, fbVar);
            if (!z || (i2 = iF - i3) <= 0) {
                return;
            }
            this.f948b.n(i2);
        }
    }

    private final void ad(et etVar, fb fbVar, boolean z) {
        int iJ;
        int iAb = ab(Integer.MAX_VALUE);
        if (iAb != Integer.MAX_VALUE && (iJ = iAb - this.f948b.j()) > 0) {
            int iJ2 = iJ - j(iJ, etVar, fbVar);
            if (!z || iJ2 <= 0) {
                return;
            }
            this.f948b.n(-iJ2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ah(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.f951e
            if (r0 == 0) goto L9
            int r0 = r10.d()
            goto Ld
        L9:
            int r0 = r10.c()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1a
            if (r11 >= r12) goto L16
            int r2 = r12 + 1
            goto L1c
        L16:
            int r2 = r11 + 1
            r3 = r12
            goto L1d
        L1a:
            int r2 = r11 + r12
        L1c:
            r3 = r11
        L1d:
            android.support.v7.widget.fu r4 = r10.f954h
            int[] r5 = r4.f1514a
            r6 = 1
            if (r5 != 0) goto L26
            goto L93
        L26:
            int r5 = r5.length
            if (r3 >= r5) goto L93
            java.util.List r5 = r4.f1515b
            r7 = -1
            if (r5 != 0) goto L30
        L2e:
            r5 = r7
            goto L7a
        L30:
            int r5 = r5.size()
            int r5 = r5 + r7
        L35:
            if (r5 < 0) goto L47
            java.util.List r8 = r4.f1515b
            java.lang.Object r8 = r8.get(r5)
            android.support.v7.widget.ft r8 = (android.support.v7.widget.ft) r8
            int r9 = r8.f1510a
            if (r9 != r3) goto L44
            goto L48
        L44:
            int r5 = r5 + (-1)
            goto L35
        L47:
            r8 = 0
        L48:
            if (r8 == 0) goto L4f
            java.util.List r5 = r4.f1515b
            r5.remove(r8)
        L4f:
            java.util.List r5 = r4.f1515b
            int r5 = r5.size()
            r8 = 0
        L56:
            if (r8 >= r5) goto L68
            java.util.List r9 = r4.f1515b
            java.lang.Object r9 = r9.get(r8)
            android.support.v7.widget.ft r9 = (android.support.v7.widget.ft) r9
            int r9 = r9.f1510a
            if (r9 < r3) goto L65
            goto L69
        L65:
            int r8 = r8 + 1
            goto L56
        L68:
            r8 = r7
        L69:
            if (r8 == r7) goto L2e
            java.util.List r5 = r4.f1515b
            java.lang.Object r5 = r5.get(r8)
            android.support.v7.widget.ft r5 = (android.support.v7.widget.ft) r5
            java.util.List r9 = r4.f1515b
            r9.remove(r8)
            int r5 = r5.f1510a
        L7a:
            if (r5 != r7) goto L86
            int[] r5 = r4.f1514a
            int r8 = r5.length
            java.util.Arrays.fill(r5, r3, r8, r7)
            int[] r4 = r4.f1514a
            int r4 = r4.length
            goto L93
        L86:
            int r5 = r5 + r6
            int[] r8 = r4.f1514a
            int r8 = r8.length
            int r5 = java.lang.Math.min(r5, r8)
            int[] r4 = r4.f1514a
            java.util.Arrays.fill(r4, r3, r5, r7)
        L93:
            if (r13 == r6) goto Lac
            r4 = 2
            if (r13 == r4) goto La6
            if (r13 == r1) goto L9b
            goto Lb1
        L9b:
            android.support.v7.widget.fu r13 = r10.f954h
            r13.d(r11, r6)
            android.support.v7.widget.fu r11 = r10.f954h
            r11.c(r12, r6)
            goto Lb1
        La6:
            android.support.v7.widget.fu r13 = r10.f954h
            r13.d(r11, r12)
            goto Lb1
        Lac:
            android.support.v7.widget.fu r13 = r10.f954h
            r13.c(r11, r12)
        Lb1:
            if (r2 > r0) goto Lb4
            goto Lc6
        Lb4:
            boolean r11 = r10.f951e
            if (r11 == 0) goto Lbd
            int r11 = r10.c()
            goto Lc1
        Lbd:
            int r11 = r10.d()
        Lc1:
            if (r3 > r11) goto Lc6
            r10.ba()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ah(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aj(android.support.v7.widget.et r12, android.support.v7.widget.fb r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.aj(android.support.v7.widget.et, android.support.v7.widget.fb, boolean):void");
    }

    private final void al(et etVar, cz czVar) {
        if (!czVar.f1298a || czVar.f1306i) {
            return;
        }
        if (czVar.f1299b == 0) {
            if (czVar.f1302e == -1) {
                am(etVar, czVar.f1304g);
                return;
            } else {
                an(etVar, czVar.f1303f);
                return;
            }
        }
        int i2 = 1;
        if (czVar.f1302e == -1) {
            int i3 = czVar.f1303f;
            int iF = this.f947a[0].f(i3);
            while (i2 < this.f955i) {
                int iF2 = this.f947a[i2].f(i3);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i2++;
            }
            int i4 = i3 - iF;
            am(etVar, i4 < 0 ? czVar.f1304g : czVar.f1304g - Math.min(i4, czVar.f1299b));
            return;
        }
        int i5 = czVar.f1304g;
        int iD = this.f947a[0].d(i5);
        while (i2 < this.f955i) {
            int iD2 = this.f947a[i2].d(i5);
            if (iD2 < iD) {
                iD = iD2;
            }
            i2++;
        }
        int i6 = iD - czVar.f1304g;
        an(etVar, i6 < 0 ? czVar.f1303f : Math.min(i6, czVar.f1299b) + czVar.f1303f);
    }

    private final void am(et etVar, int i2) {
        int iAs = as();
        while (true) {
            iAs--;
            if (iAs < 0) {
                return;
            }
            View viewAI = aI(iAs);
            if (this.f948b.d(viewAI) < i2 || this.f948b.m(viewAI) < i2) {
                return;
            }
            fs fsVar = (fs) viewAI.getLayoutParams();
            boolean z = fsVar.f1509b;
            if (fsVar.f1508a.f1526a.size() == 1) {
                return;
            }
            fw fwVar = fsVar.f1508a;
            ArrayList arrayList = fwVar.f1526a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            fs fsVarN = fw.n(view);
            fsVarN.f1508a = null;
            if (fsVarN.c() || fsVarN.b()) {
                fwVar.f1529d -= fwVar.f1531f.f948b.b(view);
            }
            if (size == 1) {
                fwVar.f1527b = Integer.MIN_VALUE;
            }
            fwVar.f1528c = Integer.MIN_VALUE;
            aX(viewAI, etVar);
        }
    }

    private final void an(et etVar, int i2) {
        while (as() > 0) {
            View viewAI = aI(0);
            if (this.f948b.a(viewAI) > i2 || this.f948b.l(viewAI) > i2) {
                return;
            }
            fs fsVar = (fs) viewAI.getLayoutParams();
            boolean z = fsVar.f1509b;
            if (fsVar.f1508a.f1526a.size() == 1) {
                return;
            }
            fw fwVar = fsVar.f1508a;
            ArrayList arrayList = fwVar.f1526a;
            View view = (View) arrayList.remove(0);
            fs fsVarN = fw.n(view);
            fsVarN.f1508a = null;
            if (arrayList.size() == 0) {
                fwVar.f1528c = Integer.MIN_VALUE;
            }
            if (fsVarN.c() || fsVarN.b()) {
                fwVar.f1529d -= fwVar.f1531f.f948b.b(view);
            }
            fwVar.f1527b = Integer.MIN_VALUE;
            aX(viewAI, etVar);
        }
    }

    private final void ap() {
        this.f951e = (this.f956j == 1 || !L()) ? this.f950d : !this.f950d;
    }

    private final void bC(int i2) {
        cz czVar = this.f958l;
        czVar.f1302e = i2;
        czVar.f1301d = this.f951e != (i2 == -1) ? -1 : 1;
    }

    private final void bD(int i2, fb fbVar) {
        int iK;
        int iK2;
        int i3;
        cz czVar = this.f958l;
        boolean z = false;
        czVar.f1299b = 0;
        czVar.f1300c = i2;
        if (!bj() || (i3 = fbVar.f1457a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            boolean z2 = this.f951e;
            boolean z3 = i3 < i2;
            dv dvVar = this.f948b;
            if (z2 == z3) {
                iK = dvVar.k();
                iK2 = 0;
            } else {
                iK2 = dvVar.k();
                iK = 0;
            }
        }
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || !recyclerView.f942i) {
            czVar.f1304g = this.f948b.e() + iK;
            czVar.f1303f = -iK2;
        } else {
            czVar.f1303f = this.f948b.j() - iK2;
            czVar.f1304g = this.f948b.f() + iK;
        }
        czVar.f1305h = false;
        czVar.f1298a = true;
        if (this.f948b.h() == 0 && this.f948b.e() == 0) {
            z = true;
        }
        czVar.f1306i = z;
    }

    private final void bE(fw fwVar, int i2, int i3) {
        int i4 = fwVar.f1529d;
        if (i2 == -1) {
            if (fwVar.e() + i4 <= i3) {
                this.m.set(fwVar.f1530e, false);
            }
        } else if (fwVar.c() - i4 >= i3) {
            this.m.set(fwVar.f1530e, false);
        }
    }

    private final boolean bF(int i2) {
        int i3 = this.f956j;
        boolean z = i2 == -1;
        boolean z2 = this.f951e;
        if (i3 == 0) {
            return z != z2;
        }
        return (z == z2) == L();
    }

    private final void bG(View view, int i2, int i3) {
        Rect rect = this.A;
        aO(view, rect);
        fs fsVar = (fs) view.getLayoutParams();
        int iBH = bH(i2, fsVar.leftMargin + rect.left, fsVar.rightMargin + rect.right);
        int iBH2 = bH(i3, fsVar.topMargin + rect.top, fsVar.bottomMargin + rect.bottom);
        if (bl(view, iBH, iBH2, fsVar)) {
            view.measure(iBH, iBH2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int bH(int r3, int r4, int r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L6
            if (r5 == 0) goto L14
            r4 = r0
        L6:
            int r1 = android.view.View.MeasureSpec.getMode(r3)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L15
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L14
            r1 = r2
            goto L15
        L14:
            return r3
        L15:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bH(int, int, int):int");
    }

    @Override // android.support.v7.widget.en
    public final void A() {
        this.f954h.a();
        ba();
    }

    @Override // android.support.v7.widget.en
    public final void B(int i2, int i3) {
        ah(i2, i3, 8);
    }

    @Override // android.support.v7.widget.en
    public final void C(int i2, int i3) {
        ah(i2, i3, 2);
    }

    @Override // android.support.v7.widget.en
    public final void D(int i2, int i3) {
        ah(i2, i3, 4);
    }

    @Override // android.support.v7.widget.en
    public final int E(fb fbVar) {
        return N(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int F(fb fbVar) {
        return O(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int G(fb fbVar) {
        return R(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int H(fb fbVar) {
        return N(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int I(fb fbVar) {
        return O(fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int J(fb fbVar) {
        return R(fbVar);
    }

    final boolean K() {
        int iC;
        if (as() == 0 || this.n == 0 || !this.x) {
            return false;
        }
        if (this.f951e) {
            iC = d();
            c();
        } else {
            iC = c();
            d();
        }
        if (iC != 0 || n() == null) {
            return false;
        }
        this.f954h.a();
        bb();
        ba();
        return true;
    }

    final boolean L() {
        return ax() == 1;
    }

    @Override // android.support.v7.widget.ez
    public final PointF P(int i2) {
        int iM = M(i2);
        PointF pointF = new PointF();
        if (iM == 0) {
            return null;
        }
        float f2 = iM;
        if (this.f956j == 0) {
            pointF.x = f2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f2;
        return pointF;
    }

    @Override // android.support.v7.widget.en
    public final Parcelable Q() {
        int iF;
        int iJ;
        int[] iArr;
        fv fvVar = this.q;
        if (fvVar != null) {
            return new fv(fvVar);
        }
        fv fvVar2 = new fv();
        fvVar2.f1523h = this.f950d;
        fvVar2.f1524i = this.o;
        fvVar2.f1525j = this.p;
        fu fuVar = this.f954h;
        if (fuVar == null || (iArr = fuVar.f1514a) == null) {
            fvVar2.f1520e = 0;
        } else {
            fvVar2.f1521f = iArr;
            fvVar2.f1520e = fvVar2.f1521f.length;
            fvVar2.f1522g = fuVar.f1515b;
        }
        if (as() <= 0) {
            fvVar2.f1516a = -1;
            fvVar2.f1517b = -1;
            fvVar2.f1518c = 0;
            return fvVar2;
        }
        fvVar2.f1516a = this.o ? d() : c();
        View viewL = this.f951e ? l(true) : m(true);
        fvVar2.f1517b = viewL != null ? bu(viewL) : -1;
        int i2 = this.f955i;
        fvVar2.f1518c = i2;
        fvVar2.f1519d = new int[i2];
        for (int i3 = 0; i3 < this.f955i; i3++) {
            boolean z = this.o;
            fw[] fwVarArr = this.f947a;
            if (z) {
                iF = fwVarArr[i3].d(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.f948b.f();
                    iF -= iJ;
                }
            } else {
                iF = fwVarArr[i3].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.f948b.j();
                    iF -= iJ;
                }
            }
            fvVar2.f1519d[i3] = iF;
        }
        return fvVar2;
    }

    @Override // android.support.v7.widget.en
    public final void T(String str) {
        if (this.q == null) {
            super.T(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    @Override // android.support.v7.widget.en
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r5, int r6, android.support.v7.widget.fb r7, android.support.v7.widget.el r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.f956j
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.as()
            if (r6 == 0) goto L76
            if (r5 != 0) goto Lf
            goto L76
        Lf:
            r4.t(r5, r7)
            int[] r5 = r4.D
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.f955i
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.f955i
            int[] r5 = new int[r5]
            r4.D = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.f955i
            if (r5 >= r1) goto L54
            android.support.v7.widget.cz r1 = r4.f958l
            int r2 = r1.f1301d
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.f1303f
            android.support.v7.widget.fw[] r2 = r4.f947a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            int r1 = r1 - r2
            goto L49
        L3b:
            android.support.v7.widget.fw[] r2 = r4.f947a
            r2 = r2[r5]
            int r3 = r1.f1304g
            int r2 = r2.d(r3)
            int r1 = r1.f1304g
            int r1 = r2 - r1
        L49:
            if (r1 < 0) goto L51
            int[] r2 = r4.D
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.D
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L76
            android.support.v7.widget.cz r5 = r4.f958l
            boolean r1 = r5.a(r7)
            if (r1 == 0) goto L76
            int r1 = r5.f1300c
            int[] r2 = r4.D
            r2 = r2[r6]
            r8.a(r1, r2)
            int r1 = r5.f1300c
            int r2 = r5.f1301d
            int r1 = r1 + r2
            r5.f1300c = r1
            int r6 = r6 + 1
            goto L59
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.V(int, int, android.support.v7.widget.fb, android.support.v7.widget.el):void");
    }

    @Override // android.support.v7.widget.en
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (as() > 0) {
            View viewM = m(false);
            View viewL = l(false);
            if (viewM == null || viewL == null) {
                return;
            }
            int iBu = bu(viewM);
            int iBu2 = bu(viewL);
            if (iBu < iBu2) {
                accessibilityEvent.setFromIndex(iBu);
                accessibilityEvent.setToIndex(iBu2);
            } else {
                accessibilityEvent.setFromIndex(iBu2);
                accessibilityEvent.setToIndex(iBu);
            }
        }
    }

    @Override // android.support.v7.widget.en
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof fv) {
            fv fvVar = (fv) parcelable;
            this.q = fvVar;
            if (this.f952f != -1) {
                fvVar.a();
                this.q.b();
            }
            ba();
        }
    }

    @Override // android.support.v7.widget.en
    public final int a(et etVar, fb fbVar) {
        if (this.f956j == 1) {
            return Math.min(this.f955i, fbVar.a());
        }
        return -1;
    }

    @Override // android.support.v7.widget.en
    public final void aR(int i2) {
        super.aR(i2);
        for (int i3 = 0; i3 < this.f955i; i3++) {
            this.f947a[i3].k(i2);
        }
    }

    @Override // android.support.v7.widget.en
    public final void aS(int i2) {
        super.aS(i2);
        for (int i3 = 0; i3 < this.f955i; i3++) {
            this.f947a[i3].k(i2);
        }
    }

    @Override // android.support.v7.widget.en
    public final void aU(int i2) {
        if (i2 == 0) {
            K();
        }
    }

    @Override // android.support.v7.widget.en
    public final void aa(int i2) {
        fv fvVar = this.q;
        if (fvVar != null && fvVar.f1516a != i2) {
            fvVar.a();
        }
        this.f952f = i2;
        this.f953g = Integer.MIN_VALUE;
        ba();
    }

    @Override // android.support.v7.widget.en
    public final boolean ae() {
        return this.f956j == 0;
    }

    @Override // android.support.v7.widget.en
    public final boolean af() {
        return this.f956j == 1;
    }

    @Override // android.support.v7.widget.en
    public final boolean ag() {
        return this.n != 0;
    }

    @Override // android.support.v7.widget.en
    public final boolean ai() {
        return this.f950d;
    }

    @Override // android.support.v7.widget.en
    public final void ao(RecyclerView recyclerView) {
        bA(this.E);
        for (int i2 = 0; i2 < this.f955i; i2++) {
            this.f947a[i2].j();
        }
        recyclerView.requestLayout();
    }

    @Override // android.support.v7.widget.en
    public final void aq(RecyclerView recyclerView, int i2) {
        fa faVar = new fa(recyclerView.getContext());
        faVar.h(i2);
        bh(faVar);
    }

    @Override // android.support.v7.widget.en
    public final int b(et etVar, fb fbVar) {
        if (this.f956j == 0) {
            return Math.min(this.f955i, fbVar.a());
        }
        return -1;
    }

    @Override // android.support.v7.widget.en
    public final void by() {
        this.f954h.a();
        for (int i2 = 0; i2 < this.f955i; i2++) {
            this.f947a[i2].j();
        }
    }

    final int c() {
        if (as() == 0) {
            return 0;
        }
        return bu(aI(0));
    }

    final int d() {
        int iAs = as();
        if (iAs == 0) {
            return 0;
        }
        return bu(aI(iAs - 1));
    }

    @Override // android.support.v7.widget.en
    public final int e(int i2, et etVar, fb fbVar) {
        return j(i2, etVar, fbVar);
    }

    @Override // android.support.v7.widget.en
    public final int f(int i2, et etVar, fb fbVar) {
        return j(i2, etVar, fbVar);
    }

    @Override // android.support.v7.widget.en
    public final eo g() {
        return this.f956j == 0 ? new fs(-2, -1) : new fs(-1, -2);
    }

    @Override // android.support.v7.widget.en
    public final eo h(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new fs((ViewGroup.MarginLayoutParams) layoutParams) : new fs(layoutParams);
    }

    @Override // android.support.v7.widget.en
    public final eo i(Context context, AttributeSet attributeSet) {
        return new fs(context, attributeSet);
    }

    final int j(int i2, et etVar, fb fbVar) {
        if (as() == 0 || i2 == 0) {
            return 0;
        }
        t(i2, fbVar);
        cz czVar = this.f958l;
        int iU = U(etVar, czVar, fbVar);
        if (czVar.f1299b >= iU) {
            i2 = i2 < 0 ? -iU : iU;
        }
        this.f948b.n(-i2);
        this.o = this.f951e;
        czVar.f1299b = 0;
        al(etVar, czVar);
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    @Override // android.support.v7.widget.en
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View k(android.view.View r9, int r10, android.support.v7.widget.et r11, android.support.v7.widget.fb r12) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.k(android.view.View, int, android.support.v7.widget.et, android.support.v7.widget.fb):android.view.View");
    }

    final View l(boolean z) {
        int iJ = this.f948b.j();
        int iF = this.f948b.f();
        View view = null;
        for (int iAs = as() - 1; iAs >= 0; iAs--) {
            View viewAI = aI(iAs);
            int iD = this.f948b.d(viewAI);
            int iA = this.f948b.a(viewAI);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAI;
                }
                if (view == null) {
                    view = viewAI;
                }
            }
        }
        return view;
    }

    final View m(boolean z) {
        int iJ = this.f948b.j();
        int iF = this.f948b.f();
        int iAs = as();
        View view = null;
        for (int i2 = 0; i2 < iAs; i2++) {
            View viewAI = aI(i2);
            int iD = this.f948b.d(viewAI);
            if (this.f948b.a(viewAI) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAI;
                }
                if (view == null) {
                    view = viewAI;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.view.View n() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.n():android.view.View");
    }

    @Override // android.support.v7.widget.en
    public final void o(et etVar, fb fbVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.o(etVar, fbVar, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // android.support.v7.widget.en
    public final void p(et etVar, fb fbVar, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof fs)) {
            super.aT(view, accessibilityNodeInfoCompat);
            return;
        }
        fs fsVar = (fs) layoutParams;
        if (this.f956j == 0) {
            int iD = fsVar.d();
            boolean z = fsVar.f1509b;
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(iD, 1, -1, -1, false, false));
        } else {
            int iD2 = fsVar.d();
            boolean z2 = fsVar.f1509b;
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(-1, -1, iD2, 1, false, false));
        }
    }

    @Override // android.support.v7.widget.en
    public final void q(et etVar, fb fbVar) {
        aj(etVar, fbVar, true);
    }

    @Override // android.support.v7.widget.en
    public final void r(fb fbVar) {
        this.f952f = -1;
        this.f953g = Integer.MIN_VALUE;
        this.q = null;
        this.B.a();
    }

    @Override // android.support.v7.widget.en
    public final void s(Rect rect, int i2, int i3) {
        int iAr;
        int iAr2;
        int iAB = aB() + aC();
        int iAD = aD() + aA();
        if (this.f956j == 1) {
            iAr2 = ar(i3, rect.height() + iAD, ay());
            iAr = ar(i2, (this.f957k * this.f955i) + iAB, az());
        } else {
            iAr = ar(i2, rect.width() + iAB, az());
            iAr2 = ar(i3, (this.f957k * this.f955i) + iAD, ay());
        }
        be(iAr, iAr2);
    }

    final void t(int i2, fb fbVar) {
        int iC;
        int i3;
        if (i2 > 0) {
            iC = d();
            i3 = 1;
        } else {
            iC = c();
            i3 = -1;
        }
        cz czVar = this.f958l;
        czVar.f1298a = true;
        bD(iC, fbVar);
        bC(i3);
        czVar.f1300c = iC + czVar.f1301d;
        czVar.f1299b = Math.abs(i2);
    }

    public final void u(boolean z) {
        T(null);
        fv fvVar = this.q;
        if (fvVar != null && fvVar.f1523h != z) {
            fvVar.f1523h = z;
        }
        this.f950d = z;
        ba();
    }

    final void v(int i2) {
        this.f957k = i2 / this.f955i;
        View.MeasureSpec.makeMeasureSpec(i2, this.f949c.h());
    }

    @Override // android.support.v7.widget.en
    public final boolean w(eo eoVar) {
        return eoVar instanceof fs;
    }

    @Override // android.support.v7.widget.en
    public final boolean y() {
        return this.q == null;
    }

    @Override // android.support.v7.widget.en
    public final void z(int i2, int i3) {
        ah(i2, i3, 1);
    }
}
