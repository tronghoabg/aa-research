package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexItem;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ul {
    public Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public ul(zwk zwkVar) {
        this.b = zwkVar;
        synchronized (this) {
            this.d = null;
            this.a = null;
            this.e = null;
            this.c = null;
        }
    }

    private static final List A(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        qdw qdwVar = new qdw();
        qdwVar.g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(qdwVar);
                i3 = 0;
            }
            arrayList.add((qdw) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(qdwVar);
            }
            i3++;
        }
        return arrayList;
    }

    private static final int B(FlexItem flexItem, boolean z) {
        return z ? flexItem.f() : flexItem.h();
    }

    private static final int C(FlexItem flexItem, boolean z) {
        return z ? flexItem.h() : flexItem.f();
    }

    private static final int D(FlexItem flexItem, boolean z) {
        return z ? flexItem.i() : flexItem.g();
    }

    private static final int E(FlexItem flexItem, boolean z) {
        return z ? flexItem.g() : flexItem.i();
    }

    private static final int F(FlexItem flexItem, boolean z) {
        return z ? flexItem.e() : flexItem.o();
    }

    private static final int G(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private static final boolean H(int i, int i2, qdw qdwVar) {
        return i == i2 + (-1) && qdwVar.a() != 0;
    }

    static final long n(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public static final int o(long j) {
        return (int) (j >> 32);
    }

    public static final int[] p(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            qdx qdxVar = (qdx) it.next();
            int i3 = qdxVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, qdxVar.b);
            i2++;
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qdv] */
    private final int r(int i, FlexItem flexItem, int i2) {
        ?? r2 = this.b;
        int iC = r2.c(i, r2.getPaddingTop() + r2.getPaddingBottom() + flexItem.i() + flexItem.f() + i2, flexItem.e());
        int size = View.MeasureSpec.getSize(iC);
        return size > flexItem.j() ? View.MeasureSpec.makeMeasureSpec(flexItem.j(), View.MeasureSpec.getMode(iC)) : size < flexItem.l() ? View.MeasureSpec.makeMeasureSpec(flexItem.l(), View.MeasureSpec.getMode(iC)) : iC;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qdv] */
    private final int s(int i, FlexItem flexItem, int i2) {
        ?? r2 = this.b;
        int iG = r2.g(i, r2.getPaddingLeft() + r2.getPaddingRight() + flexItem.g() + flexItem.h() + i2, flexItem.o());
        int size = View.MeasureSpec.getSize(iG);
        return size > flexItem.k() ? View.MeasureSpec.makeMeasureSpec(flexItem.k(), View.MeasureSpec.getMode(iG)) : size < flexItem.m() ? View.MeasureSpec.makeMeasureSpec(flexItem.m(), View.MeasureSpec.getMode(iG)) : iG;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qdv] */
    private final void t(List list, qdw qdwVar, int i, int i2) {
        qdwVar.m = i2;
        this.b.x(qdwVar);
        qdwVar.p = i;
        list.add(qdwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, qdv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.m()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.m()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.k()
            if (r1 <= r3) goto L26
            int r1 = r0.k()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.l()
            if (r2 >= r5) goto L32
            int r2 = r0.l()
            goto L3e
        L32:
            int r5 = r0.j()
            if (r2 <= r5) goto L3d
            int r2 = r0.j()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.z(r8, r1, r0, r7)
            java.lang.Object r6 = r6.b
            r6.J(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul.u(android.view.View, int):void");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, qdv] */
    private final void v(int i, int i2, qdw qdwVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        int iMax;
        double d;
        boolean z2;
        double d2;
        float f3 = qdwVar.j;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f3 <= BitmapDescriptorFactory.HUE_RED || i3 < (i5 = qdwVar.e)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        qdwVar.e = i4 + qdwVar.f;
        int i6 = 0;
        if (!z) {
            qdwVar.g = Integer.MIN_VALUE;
        }
        boolean z3 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < qdwVar.h) {
            int i8 = qdwVar.o + i6;
            ?? r11 = this.b;
            View viewT = r11.t(i8);
            if (viewT == null || viewT.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z3 = z3;
            } else {
                FlexItem flexItem = (FlexItem) viewT.getLayoutParams();
                int iK = r11.k();
                f = f4;
                if (iK == 0 || iK == 1) {
                    f2 = f5;
                    boolean z4 = z3;
                    int measuredWidth = viewT.getMeasuredWidth();
                    Object obj = this.a;
                    if (obj != null) {
                        measuredWidth = (int) ((long[]) obj)[i8];
                    }
                    int measuredHeight = viewT.getMeasuredHeight();
                    Object obj2 = this.a;
                    if (obj2 != null) {
                        measuredHeight = o(((long[]) obj2)[i8]);
                    }
                    if (((boolean[]) this.d)[i8] || flexItem.b() <= f) {
                        z3 = z4;
                    } else {
                        float fB = measuredWidth + (flexItem.b() * f2);
                        if (i6 == qdwVar.h - 1) {
                            fB += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fB);
                        if (iRound > flexItem.k()) {
                            iRound = flexItem.k();
                            ((boolean[]) this.d)[i8] = true;
                            qdwVar.j -= flexItem.b();
                            z3 = true;
                        } else {
                            f6 += fB - iRound;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                z3 = z4;
                            }
                            f6 = (float) d;
                            z3 = z4;
                        }
                        int iR = r(i2, flexItem, qdwVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewT.measure(iMakeMeasureSpec, iR);
                        int measuredWidth2 = viewT.getMeasuredWidth();
                        int measuredHeight2 = viewT.getMeasuredHeight();
                        z(i8, iMakeMeasureSpec, iR, viewT);
                        r11.J(i8, viewT);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + flexItem.i() + flexItem.f() + r11.i(viewT));
                    qdwVar.e += measuredWidth + flexItem.g() + flexItem.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewT.getMeasuredHeight();
                    Object obj3 = this.a;
                    if (obj3 != null) {
                        measuredHeight3 = o(((long[]) obj3)[i8]);
                    }
                    int measuredWidth3 = viewT.getMeasuredWidth();
                    Object obj4 = this.a;
                    if (obj4 != null) {
                        f2 = f5;
                        z2 = z3;
                        measuredWidth3 = (int) ((long[]) obj4)[i8];
                    } else {
                        f2 = f5;
                        z2 = z3;
                    }
                    if (((boolean[]) this.d)[i8] || flexItem.b() <= f) {
                        z3 = z2;
                    } else {
                        float fB2 = measuredHeight3 + (flexItem.b() * f2);
                        if (i6 == qdwVar.h - 1) {
                            fB2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fB2);
                        if (iRound2 > flexItem.j()) {
                            iRound2 = flexItem.j();
                            ((boolean[]) this.d)[i8] = true;
                            qdwVar.j -= flexItem.b();
                            z3 = true;
                        } else {
                            f6 += fB2 - iRound2;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                z3 = z2;
                            }
                            f6 = (float) d2;
                            z3 = z2;
                        }
                        int iS = s(i, flexItem, qdwVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewT.measure(iS, iMakeMeasureSpec2);
                        int measuredWidth4 = viewT.getMeasuredWidth();
                        int measuredHeight4 = viewT.getMeasuredHeight();
                        z(i8, iS, iMakeMeasureSpec2, viewT);
                        r11.J(i8, viewT);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + flexItem.g() + flexItem.h() + r11.i(viewT));
                    qdwVar.e += measuredHeight3 + flexItem.i() + flexItem.f();
                }
                qdwVar.g = Math.max(qdwVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            f5 = f2;
        }
        if (!z3 || i5 == qdwVar.e) {
            return;
        }
        v(i, i2, qdwVar, i3, i4, true);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, qdv] */
    private final void w(int i, int i2, qdw qdwVar, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int i5 = qdwVar.e;
        float f2 = qdwVar.k;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (f2 <= BitmapDescriptorFactory.HUE_RED || i3 > i5) {
            return;
        }
        float f4 = (i5 - i3) / f2;
        qdwVar.e = i4 + qdwVar.f;
        int i6 = 0;
        if (!z) {
            qdwVar.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < qdwVar.h) {
            int i8 = qdwVar.o + i6;
            ?? r11 = this.b;
            View viewT = r11.t(i8);
            if (viewT == null || viewT.getVisibility() == 8) {
                f = f3;
            } else {
                FlexItem flexItem = (FlexItem) viewT.getLayoutParams();
                int iK = r11.k();
                f = f3;
                if (iK == 0 || iK == 1) {
                    int measuredWidth = viewT.getMeasuredWidth();
                    Object obj = this.a;
                    if (obj != null) {
                        measuredWidth = (int) ((long[]) obj)[i8];
                    }
                    int measuredHeight = viewT.getMeasuredHeight();
                    Object obj2 = this.a;
                    if (obj2 != null) {
                        measuredHeight = o(((long[]) obj2)[i8]);
                    }
                    if (!((boolean[]) this.d)[i8] && flexItem.c() > f) {
                        float fC = measuredWidth - (flexItem.c() * f4);
                        if (i6 == qdwVar.h - 1) {
                            fC += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fC);
                        if (iRound < flexItem.m()) {
                            iRound = flexItem.m();
                            ((boolean[]) this.d)[i8] = true;
                            qdwVar.k -= flexItem.c();
                            z2 = true;
                        } else {
                            f5 += fC - iRound;
                            double d = f5;
                            if (d > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                        }
                        int iR = r(i2, flexItem, qdwVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewT.measure(iMakeMeasureSpec, iR);
                        int measuredWidth2 = viewT.getMeasuredWidth();
                        int measuredHeight2 = viewT.getMeasuredHeight();
                        z(i8, iMakeMeasureSpec, iR, viewT);
                        r11.J(i8, viewT);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + flexItem.i() + flexItem.f() + r11.i(viewT));
                    qdwVar.e += measuredWidth + flexItem.g() + flexItem.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewT.getMeasuredHeight();
                    Object obj3 = this.a;
                    if (obj3 != null) {
                        measuredHeight3 = o(((long[]) obj3)[i8]);
                    }
                    int measuredWidth3 = viewT.getMeasuredWidth();
                    Object obj4 = this.a;
                    if (obj4 != null) {
                        measuredWidth3 = (int) ((long[]) obj4)[i8];
                    }
                    if (!((boolean[]) this.d)[i8] && flexItem.c() > f) {
                        float fC2 = measuredHeight3 - (flexItem.c() * f4);
                        if (i6 == qdwVar.h - 1) {
                            fC2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fC2);
                        if (iRound2 < flexItem.l()) {
                            iRound2 = flexItem.l();
                            ((boolean[]) this.d)[i8] = true;
                            qdwVar.k -= flexItem.c();
                            z2 = true;
                        } else {
                            f5 += fC2 - iRound2;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                        }
                        int iS = s(i, flexItem, qdwVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewT.measure(iS, iMakeMeasureSpec2);
                        measuredWidth3 = viewT.getMeasuredWidth();
                        int measuredHeight4 = viewT.getMeasuredHeight();
                        z(i8, iS, iMakeMeasureSpec2, viewT);
                        r11.J(i8, viewT);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + flexItem.g() + flexItem.h() + r11.i(viewT));
                    qdwVar.e += measuredHeight3 + flexItem.i() + flexItem.f();
                }
                qdwVar.g = Math.max(qdwVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
        }
        if (!z2 || i5 == qdwVar.e) {
            return;
        }
        w(i, i2, qdwVar, i3, i4, true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, qdv] */
    private final void x(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iG = (i - flexItem.g()) - flexItem.h();
        ?? r1 = this.b;
        int iMin = Math.min(Math.max(iG - r1.i(view), flexItem.m()), flexItem.k());
        Object obj = this.a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(obj != null ? o(((long[]) obj)[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        z(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        r1.J(i2, view);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, qdv] */
    private final void y(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int i3 = (i - flexItem.i()) - flexItem.f();
        ?? r1 = this.b;
        int iMin = Math.min(Math.max(i3 - r1.i(view), flexItem.l()), flexItem.j());
        Object obj = this.a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(obj != null ? (int) ((long[]) obj)[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        z(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        r1.J(i2, view);
    }

    private final void z(int i, int i2, int i3, View view) {
        Object obj = this.c;
        if (obj != null) {
            ((long[]) obj)[i] = n(i2, i3);
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            ((long[]) obj2)[i] = n(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final synchronized void a(tnq tnqVar, aadr aadrVar, aaev aaevVar) {
        zkt.n(tnqVar, "mapContainer");
        this.d = tnqVar;
        this.a = aadrVar;
        this.e = aaevVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[Catch: all -> 0x0098, PHI: r1
  0x0078: PHI (r1v1 boolean) = 
  (r1v0 boolean)
  (r1v0 boolean)
  (r1v0 boolean)
  (r1v0 boolean)
  (r1v0 boolean)
  (r1v0 boolean)
  (r1v0 boolean)
  (r1v3 boolean)
  (r1v0 boolean)
 binds: [B:4:0x0004, B:6:0x000c, B:8:0x0010, B:10:0x001d, B:12:0x0028, B:26:0x0067, B:28:0x0071, B:29:0x0073, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000e, B:9:0x0012, B:11:0x001f, B:13:0x002a, B:14:0x0034, B:25:0x005c, B:27:0x0069, B:32:0x0077, B:33:0x0078, B:34:0x007f, B:38:0x0085, B:42:0x008d, B:43:0x0092, B:48:0x0097, B:35:0x0080, B:36:0x0082, B:15:0x0035, B:17:0x0040, B:19:0x0050, B:21:0x0056, B:23:0x0058, B:24:0x005b), top: B:57:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r9.a     // Catch: java.lang.Throwable -> L98
            r1 = 0
            if (r0 == 0) goto L78
            aadr r0 = (defpackage.aadr) r0     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L78
            java.lang.Object r0 = r9.d     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L78
            tnq r0 = (defpackage.tnq) r0     // Catch: java.lang.Throwable -> L98
            tnn r0 = r0.c()     // Catch: java.lang.Throwable -> L98
            r2 = r0
            txu r2 = (defpackage.txu) r2     // Catch: java.lang.Throwable -> L98
            boolean r2 = r2.K     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L78
            r2 = r0
            txu r2 = (defpackage.txu) r2     // Catch: java.lang.Throwable -> L98
            ufz r2 = r2.X     // Catch: java.lang.Throwable -> L98
            boolean r2 = r2.l()     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L78
            r2 = r0
            txu r2 = (defpackage.txu) r2     // Catch: java.lang.Throwable -> L98
            txl r2 = r2.J     // Catch: java.lang.Throwable -> L98
            r3 = r2
            txn r3 = (defpackage.txn) r3     // Catch: java.lang.Throwable -> L98
            java.util.List r3 = r3.c     // Catch: java.lang.Throwable -> L98
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L98
            txn r2 = (defpackage.txn) r2     // Catch: java.lang.Throwable -> L75
            java.util.ArrayList r2 = r2.e     // Catch: java.lang.Throwable -> L75
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L75
            r5 = r1
        L3e:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L75
            ufs r6 = (defpackage.ufs) r6     // Catch: java.lang.Throwable -> L75
            ygr r7 = defpackage.txn.a     // Catch: java.lang.Throwable -> L75
            abgl r8 = r6.b     // Catch: java.lang.Throwable -> L75
            boolean r7 = r7.contains(r8)     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L58
            boolean r6 = r6.J()     // Catch: java.lang.Throwable -> L75
            if (r6 != 0) goto L58
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            goto L78
        L58:
            int r5 = r5 + 1
            goto L3e
        L5b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            r2 = r0
            txu r2 = (defpackage.txu) r2     // Catch: java.lang.Throwable -> L98
            uvg r2 = r2.ac     // Catch: java.lang.Throwable -> L98
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.u     // Catch: java.lang.Throwable -> L98
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L78
            txu r0 = (defpackage.txu) r0     // Catch: java.lang.Throwable -> L98
            ucf r0 = r0.g     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.z()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L78
            r1 = 1
            goto L78
        L75:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L98
        L78:
            java.lang.Object r0 = r9.b     // Catch: java.lang.Throwable -> L98
            zwk r0 = (defpackage.zwk) r0     // Catch: java.lang.Throwable -> L98
            r0.b(r1)     // Catch: java.lang.Throwable -> L98
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = r9.c     // Catch: java.lang.Throwable -> L95
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L93
            vhu r0 = (defpackage.vhu) r0     // Catch: android.os.RemoteException -> L8c java.lang.Throwable -> L98
            r0.a()     // Catch: android.os.RemoteException -> L8c java.lang.Throwable -> L98
            monitor-exit(r9)
            return
        L8c:
            r0 = move-exception
            com.google.android.libraries.maps.model.RuntimeRemoteException r1 = new com.google.android.libraries.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L98
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L98
            throw r1     // Catch: java.lang.Throwable -> L98
        L93:
            monitor-exit(r9)
            return
        L95:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L95
            throw r0     // Catch: java.lang.Throwable -> L98
        L98:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L98
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul.b():void");
    }

    public final synchronized void c(vhu vhuVar) {
        this.c = vhuVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qdv] */
    public final List d(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.b.s(i2).getLayoutParams();
            qdx qdxVar = new qdx();
            qdxVar.b = flexItem.n();
            qdxVar.a = i2;
            arrayList.add(qdxVar);
        }
        return arrayList;
    }

    public final void e(List list, int i) {
        int i2 = ((int[]) this.e)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.c;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qdv] */
    public final void f(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        ?? r0 = this.b;
        int iK = r0.k();
        if (iK == 0 || iK == 1) {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else {
            if (iK != 2 && iK != 3) {
                throw new IllegalArgumentException(a.bp(iK, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<qdw> listV = r0.v();
        if (mode == 1073741824) {
            int iR = r0.r() + i3;
            int i4 = 0;
            if (listV.size() == 1) {
                ((qdw) listV.get(0)).g = size - i3;
                return;
            }
            if (listV.size() >= 2) {
                int iA = r0.a();
                if (iA == 1) {
                    qdw qdwVar = new qdw();
                    qdwVar.g = size - iR;
                    listV.add(0, qdwVar);
                    return;
                }
                if (iA == 2) {
                    r0.z(A(listV, size, iR));
                    return;
                }
                if (iA == 3) {
                    if (iR >= size) {
                        return;
                    }
                    int size2 = listV.size() - 1;
                    ArrayList arrayList = new ArrayList();
                    int size3 = listV.size();
                    float f = 0.0f;
                    while (i4 < size3) {
                        arrayList.add((qdw) listV.get(i4));
                        if (i4 != listV.size() - 1) {
                            qdw qdwVar2 = new qdw();
                            float f2 = (size - iR) / size2;
                            if (i4 == listV.size() - 2) {
                                int iRound2 = Math.round(f + f2);
                                qdwVar2.g = iRound2;
                                iRound = iRound2;
                                f = 0.0f;
                            } else {
                                iRound = Math.round(f2);
                                qdwVar2.g = iRound;
                            }
                            f += f2 - iRound;
                            if (f > 1.0f) {
                                qdwVar2.g = iRound + 1;
                                f -= 1.0f;
                            } else if (f < -1.0f) {
                                qdwVar2.g = iRound - 1;
                                f += 1.0f;
                            }
                            arrayList.add(qdwVar2);
                        }
                        i4++;
                    }
                    r0.z(arrayList);
                    return;
                }
                if (iA == 4) {
                    if (iR >= size) {
                        r0.z(A(listV, size, iR));
                        return;
                    }
                    int size4 = listV.size();
                    int i5 = (size - iR) / (size4 + size4);
                    ArrayList arrayList2 = new ArrayList();
                    qdw qdwVar3 = new qdw();
                    qdwVar3.g = i5;
                    for (qdw qdwVar4 : listV) {
                        arrayList2.add(qdwVar3);
                        arrayList2.add(qdwVar4);
                        arrayList2.add(qdwVar3);
                    }
                    r0.z(arrayList2);
                    return;
                }
                if (iA == 5 && iR < size) {
                    float size5 = listV.size();
                    int size6 = listV.size();
                    float f3 = 0.0f;
                    while (i4 < size6) {
                        qdw qdwVar5 = (qdw) listV.get(i4);
                        float f4 = qdwVar5.g + ((size - iR) / size5);
                        if (i4 == listV.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound3 = Math.round(f4);
                        f3 += f4 - iRound3;
                        if (f3 > 1.0f) {
                            iRound3++;
                            f3 -= 1.0f;
                        } else if (f3 < -1.0f) {
                            iRound3--;
                            f3 += 1.0f;
                        }
                        qdwVar5.g = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qdv] */
    public final void g(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        ul ulVar;
        int i4;
        int i5;
        ?? r0 = this.b;
        int iL = r0.l();
        Object obj = this.d;
        if (obj == null) {
            this.d = new boolean[Math.max(iL, 10)];
        } else {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            if (length < iL) {
                this.d = new boolean[Math.max(length + length, iL)];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 >= r0.l()) {
            return;
        }
        int iK = r0.k();
        int iK2 = r0.k();
        if (iK2 == 0 || iK2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int iN = r0.n();
            if (mode != 1073741824) {
                size = Math.min(iN, size);
            }
            paddingLeft = r0.getPaddingLeft();
            paddingRight = r0.getPaddingRight();
        } else {
            if (iK2 != 2 && iK2 != 3) {
                throw new IllegalArgumentException(a.bp(iK, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = r0.n();
            }
            paddingLeft = r0.getPaddingTop();
            paddingRight = r0.getPaddingBottom();
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        Object obj2 = this.e;
        int i8 = obj2 != null ? ((int[]) obj2)[i3] : 0;
        List listV = r0.v();
        int size2 = listV.size();
        while (i8 < size2) {
            qdw qdwVar = (qdw) listV.get(i8);
            if (qdwVar.e < i7) {
                ulVar = this;
                i4 = i;
                i5 = i2;
                ulVar.v(i4, i5, qdwVar, i7, i6, false);
            } else {
                ulVar = this;
                i4 = i;
                i5 = i2;
                ulVar.w(i4, i5, qdwVar, i7, i6, false);
            }
            i8++;
            this = ulVar;
            i = i4;
            i2 = i5;
        }
    }

    public final void h(int i) {
        Object obj = this.e;
        if (obj == null) {
            this.e = new int[Math.max(i, 10)];
            return;
        }
        int length = ((int[]) obj).length;
        if (length < i) {
            this.e = Arrays.copyOf((int[]) this.e, Math.max(length + length, i));
        }
    }

    public final void i(int i) {
        Object obj = this.c;
        if (obj == null) {
            this.c = new long[Math.max(i, 10)];
            return;
        }
        int length = ((long[]) obj).length;
        if (length < i) {
            this.c = Arrays.copyOf((long[]) this.c, Math.max(length + length, i));
        }
    }

    public final void j(int i) {
        Object obj = this.a;
        if (obj == null) {
            this.a = new long[Math.max(i, 10)];
            return;
        }
        int length = ((long[]) obj).length;
        if (length < i) {
            this.a = Arrays.copyOf((long[]) this.a, Math.max(length + length, i));
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, qdv] */
    public final void k(View view, qdw qdwVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        ?? r5 = this.b;
        int iB = r5.b();
        if (flexItem.d() != -1) {
            iB = flexItem.d();
        }
        int i5 = qdwVar.g;
        if (iB == 0 || iB == 4) {
            if (r5.m() != 2) {
                view.layout(i, i2 + flexItem.i(), i3, i4 + flexItem.i());
                return;
            } else {
                view.layout(i, i2 - flexItem.f(), i3, i4 - flexItem.f());
                return;
            }
        }
        if (iB == 3) {
            if (r5.m() != 2) {
                int iMax = Math.max(qdwVar.l - view.getBaseline(), flexItem.i());
                view.layout(i, i2 + iMax, i3, i4 + iMax);
                return;
            } else {
                int iMax2 = Math.max((qdwVar.l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.f());
                view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                return;
            }
        }
        if (iB == 1) {
            if (r5.m() == 2) {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.i(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.i());
                return;
            } else {
                int i6 = i2 + i5;
                view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.f(), i3, i6 - flexItem.f());
                return;
            }
        }
        if (iB == 2) {
            int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.i()) - flexItem.f()) / 2;
            if (r5.m() != 2) {
                int i7 = i2 + measuredHeight;
                view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
            } else {
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qdv] */
    public final void l(View view, qdw qdwVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iB = this.b.b();
        if (flexItem.d() != -1) {
            iB = flexItem.d();
        }
        int i5 = qdwVar.g;
        if (iB == 0 || iB == 4 || iB == 3) {
            if (z) {
                view.layout(i - flexItem.h(), i2, i3 - flexItem.h(), i4);
                return;
            } else {
                view.layout(i + flexItem.g(), i2, i3 + flexItem.g(), i4);
                return;
            }
        }
        if (iB == 1) {
            if (z) {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.g(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.g(), i4);
                return;
            } else {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.h(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.h(), i4);
                return;
            }
        }
        if (iB == 2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
            if (z) {
                view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
            } else {
                view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qdv] */
    public final void m(int i) {
        View viewT;
        ?? r2 = this.b;
        if (i >= r2.l()) {
            return;
        }
        int iK = r2.k();
        if (r2.b() != 4) {
            for (qdw qdwVar : r2.v()) {
                for (Integer num : qdwVar.n) {
                    View viewT2 = r2.t(num.intValue());
                    if (iK == 0 || iK == 1) {
                        y(viewT2, qdwVar.g, num.intValue());
                    } else {
                        if (iK != 2 && iK != 3) {
                            throw new IllegalArgumentException(a.bp(iK, "Invalid flex direction: "));
                        }
                        x(viewT2, qdwVar.g, num.intValue());
                    }
                }
            }
            return;
        }
        Object obj = this.e;
        List listV = r2.v();
        int size = listV.size();
        for (int i2 = obj != null ? ((int[]) obj)[i] : 0; i2 < size; i2++) {
            qdw qdwVar2 = (qdw) listV.get(i2);
            int i3 = qdwVar2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = qdwVar2.o + i4;
                if (i4 < r2.l() && (viewT = r2.t(i5)) != null && viewT.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewT.getLayoutParams();
                    if (flexItem.d() == -1 || flexItem.d() == 4) {
                        if (iK == 0 || iK == 1) {
                            y(viewT, qdwVar2.g, i5);
                        } else {
                            if (iK != 2 && iK != 3) {
                                throw new IllegalArgumentException(a.bp(iK, "Invalid flex direction: "));
                            }
                            x(viewT, qdwVar2.g, i5);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, qdv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(defpackage.ajnt r31, int r32, int r33, int r34, int r35, int r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul.q(ajnt, int, int, int, int, int, java.util.List):void");
    }

    public ul() {
        this.b = new ygp();
    }

    public ul(qdv qdvVar) {
        this.b = qdvVar;
    }
}
