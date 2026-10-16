package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eov {
    public final boolean a;
    public int[] f;
    public int[] h;
    public defpackage.eos[] j;
    public int[] l;
    public boolean n;
    public int[] p;
    final /* synthetic */ androidx.gridlayout.widget.GridLayout r;
    defpackage.ndd s;
    defpackage.ndd t;
    defpackage.ndd u;
    public int b = Integer.MIN_VALUE;
    private int v = Integer.MIN_VALUE;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean g = false;
    public boolean i = false;
    public boolean k = false;
    public boolean m = false;
    public boolean o = false;
    boolean q = true;
    private final defpackage.eoz w = new defpackage.eoz(0);
    private final defpackage.eoz x = new defpackage.eoz(-100000);

    public eov(androidx.gridlayout.widget.GridLayout gridLayout, boolean z) {
        this.r = gridLayout;
        this.a = z;
    }

    private static final void A(java.util.List list, defpackage.ndd nddVar) {
        int i = 0;
        while (true) {
            defpackage.eox[] eoxVarArr = (defpackage.eox[]) nddVar.c;
            if (i >= eoxVarArr.length) {
                return;
            }
            t(list, eoxVarArr[i], ((defpackage.eoz[]) nddVar.b)[i], false);
            i++;
        }
    }

    private final int m() {
        int i = this.v;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        androidx.gridlayout.widget.GridLayout gridLayout = this.r;
        int childCount = gridLayout.getChildCount();
        int iMax = -1;
        for (int i2 = 0; i2 < childCount; i2++) {
            defpackage.eoy eoyVarG = androidx.gridlayout.widget.GridLayout.g(gridLayout.getChildAt(i2));
            defpackage.eox eoxVar = (this.a ? eoyVarG.b : eoyVarG.a).c;
            iMax = java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(iMax, eoxVar.a), eoxVar.b), eoxVar.a());
        }
        int iMax2 = java.lang.Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
        this.v = iMax2;
        return iMax2;
    }

    private final int n(int i, int i2) {
        p(i, i2);
        return j()[a()];
    }

    private final java.lang.String o(java.util.List list) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            defpackage.eos eosVar = (defpackage.eos) it.next();
            if (!z) {
                sb.append(", ");
            }
            boolean z2 = this.a;
            defpackage.eox eoxVar = eosVar.a;
            int i = eoxVar.a;
            int i2 = eoxVar.b;
            int i3 = eosVar.b.a;
            java.lang.String str2 = true != z2 ? "y" : "x";
            if (i < i2) {
                str = str2 + i2 + "-" + str2 + i + ">=" + i3;
            } else {
                str = str2 + i + "-" + str2 + i2 + "<=" + (-i3);
            }
            sb.append(str);
            z = false;
        }
        return sb.toString();
    }

    private final void p(int i, int i2) {
        this.w.a = i;
        this.x.a = -i2;
        this.m = false;
    }

    private final void q(int i, float f) {
        java.util.Arrays.fill(this.p, 0);
        androidx.gridlayout.widget.GridLayout gridLayout = this.r;
        int childCount = gridLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = gridLayout.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                defpackage.eoy eoyVarG = androidx.gridlayout.widget.GridLayout.g(childAt);
                float f2 = (this.a ? eoyVarG.b : eoyVarG.a).e;
                if (f2 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    int iRound = java.lang.Math.round((i * f2) / f);
                    this.p[i2] = iRound;
                    i -= iRound;
                    f -= f2;
                }
            }
        }
    }

    private final boolean r(defpackage.eos[] eosVarArr, int[] iArr, boolean z) {
        int iA = a() + 1;
        boolean[] zArr = null;
        for (int i = 0; i < eosVarArr.length; i++) {
            java.util.Arrays.fill(iArr, 0);
            for (int i2 = 0; i2 < iA; i2++) {
                boolean zU = false;
                for (defpackage.eos eosVar : eosVarArr) {
                    zU |= u(iArr, eosVar);
                }
                if (!zU) {
                    if (zArr != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (int i3 = 0; i3 < eosVarArr.length; i3++) {
                            defpackage.eos eosVar2 = eosVarArr[i3];
                            if (zArr[i3]) {
                                arrayList.add(eosVar2);
                            }
                            if (!eosVar2.c) {
                                arrayList2.add(eosVar2);
                            }
                        }
                        this.r.s.println((true != this.a ? "vertical" : "horizontal") + " constraints: " + o(arrayList) + " are inconsistent; permanently removing: " + o(arrayList2) + ". ");
                    }
                    return true;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr2 = new boolean[eosVarArr.length];
            for (int i4 = 0; i4 < iA; i4++) {
                int length = eosVarArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    zArr2[i5] = zArr2[i5] | u(iArr, eosVarArr[i5]);
                }
            }
            if (i == 0) {
                zArr = zArr2;
            }
            for (int i6 = 0; i6 < eosVarArr.length; i6++) {
                if (zArr2[i6]) {
                    defpackage.eos eosVar3 = eosVarArr[i6];
                    defpackage.eox eoxVar = eosVar3.a;
                    if (eoxVar.a >= eoxVar.b) {
                        eosVar3.c = false;
                        break;
                    }
                }
            }
        }
        return true;
    }

    private final defpackage.eos[] s(java.util.List list) {
        defpackage.eou eouVar = new defpackage.eou(this, (defpackage.eos[]) list.toArray(new defpackage.eos[list.size()]));
        int length = eouVar.c.length;
        for (int i = 0; i < length; i++) {
            eouVar.a(i);
        }
        return eouVar.a;
    }

    private static final void t(java.util.List list, defpackage.eox eoxVar, defpackage.eoz eozVar, boolean z) {
        if (eoxVar.a() == 0) {
            return;
        }
        if (z) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((defpackage.eos) it.next()).a.equals(eoxVar)) {
                    return;
                }
            }
        }
        list.add(new defpackage.eos(eoxVar, eozVar));
    }

    private static final boolean u(int[] iArr, defpackage.eos eosVar) {
        if (!eosVar.c) {
            return false;
        }
        defpackage.eox eoxVar = eosVar.a;
        int i = eoxVar.a;
        int i2 = eoxVar.b;
        int i3 = iArr[i] + eosVar.b.a;
        if (i3 <= iArr[i2]) {
            return false;
        }
        iArr[i2] = i3;
        return true;
    }

    private final void v(int[] iArr) {
        r(k(), iArr, true);
    }

    private final defpackage.ndd w(boolean z) {
        defpackage.eox eoxVar;
        defpackage.eot eotVar = new defpackage.eot(defpackage.eox.class, defpackage.eoz.class);
        defpackage.epa[] epaVarArr = (defpackage.epa[]) l().c;
        int length = epaVarArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                eoxVar = epaVarArr[i].c;
            } else {
                defpackage.eox eoxVar2 = epaVarArr[i].c;
                eoxVar = new defpackage.eox(eoxVar2.b, eoxVar2.a);
            }
            eotVar.a(eoxVar, new defpackage.eoz());
        }
        return eotVar.b();
    }

    private final defpackage.ndd x() {
        defpackage.ndd nddVarW = this.u;
        if (nddVarW == null) {
            nddVarW = w(false);
            this.u = nddVarW;
        }
        if (!this.e) {
            z(nddVarW, false);
            this.e = true;
        }
        return this.u;
    }

    private final defpackage.ndd y() {
        defpackage.ndd nddVarW = this.t;
        if (nddVarW == null) {
            nddVarW = w(true);
            this.t = nddVarW;
        }
        if (!this.d) {
            z(nddVarW, true);
            this.d = true;
        }
        return this.t;
    }

    private final void z(defpackage.ndd nddVar, boolean z) {
        for (defpackage.eoz eozVar : (defpackage.eoz[]) nddVar.b) {
            eozVar.a();
        }
        defpackage.eow[] eowVarArr = (defpackage.eow[]) l().b;
        for (int i = 0; i < eowVarArr.length; i++) {
            int iB = eowVarArr[i].b(z);
            defpackage.eoz eozVar2 = (defpackage.eoz) nddVar.C(i);
            int i2 = eozVar2.a;
            if (!z) {
                iB = -iB;
            }
            eozVar2.a = java.lang.Math.max(i2, iB);
        }
    }

    public final int a() {
        return java.lang.Math.max(this.b, m());
    }

    public final int b(int i) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return n(0, size);
        }
        if (mode == 0) {
            return n(0, 100000);
        }
        if (mode != 1073741824) {
            return 0;
        }
        return n(size, size);
    }

    public final void c(boolean z) {
        int[] iArr = z ? this.f : this.h;
        androidx.gridlayout.widget.GridLayout gridLayout = this.r;
        int childCount = gridLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = gridLayout.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                defpackage.eoy eoyVarG = androidx.gridlayout.widget.GridLayout.g(childAt);
                boolean z2 = this.a;
                defpackage.eox eoxVar = (z2 ? eoyVarG.b : eoyVarG.a).c;
                int i2 = z ? eoxVar.a : eoxVar.b;
                iArr[i2] = java.lang.Math.max(iArr[i2], gridLayout.b(childAt, z2, z));
            }
        }
    }

    public final void d() {
        this.v = Integer.MIN_VALUE;
        this.s = null;
        this.t = null;
        this.u = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.p = null;
        this.o = false;
        e();
    }

    public final void e() {
        this.c = false;
        this.d = false;
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
    }

    public final void f(int i) {
        p(i, i);
        j();
    }

    public final void g(int i) {
        if (i != Integer.MIN_VALUE && i < m()) {
            androidx.gridlayout.widget.GridLayout.f((true != this.a ? "row" : "column").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
        }
        if (i != Integer.MIN_VALUE && i > 100000) {
            androidx.gridlayout.widget.GridLayout.f((true == this.a ? "column" : "row").concat("Count must be less than or equal to the maximum size (100000)"));
        }
        this.b = i;
    }

    public final void h(boolean z) {
        this.q = z;
        d();
    }

    public final int[] i() {
        int[] iArr = this.p;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[this.r.getChildCount()];
        this.p = iArr2;
        return iArr2;
    }

    public final int[] j() {
        boolean z;
        int[] iArr = this.l;
        if (iArr == null) {
            iArr = new int[a() + 1];
            this.l = iArr;
        }
        if (!this.m) {
            boolean z2 = this.o;
            float f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            if (!z2) {
                androidx.gridlayout.widget.GridLayout gridLayout = this.r;
                int childCount = gridLayout.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        z = false;
                        break;
                    }
                    android.view.View childAt = gridLayout.getChildAt(i);
                    if (childAt.getVisibility() != 8) {
                        defpackage.eoy eoyVarG = androidx.gridlayout.widget.GridLayout.g(childAt);
                        if ((this.a ? eoyVarG.b : eoyVarG.a).e != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
                this.n = z;
                this.o = true;
            }
            if (this.n) {
                java.util.Arrays.fill(i(), 0);
                v(iArr);
                defpackage.eoz eozVar = this.w;
                androidx.gridlayout.widget.GridLayout gridLayout2 = this.r;
                int childCount2 = (eozVar.a * gridLayout2.getChildCount()) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout2.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        android.view.View childAt2 = gridLayout2.getChildAt(i2);
                        if (childAt2.getVisibility() != 8) {
                            defpackage.eoy eoyVarG2 = androidx.gridlayout.widget.GridLayout.g(childAt2);
                            f += (this.a ? eoyVarG2.b : eoyVarG2.a).e;
                        }
                    }
                    int i3 = -1;
                    boolean z3 = true;
                    int i4 = 0;
                    while (i4 < childCount2) {
                        e();
                        int i5 = (int) ((((long) i4) + ((long) childCount2)) / 2);
                        q(i5, f);
                        boolean zR = r(k(), iArr, false);
                        if (zR) {
                            i4 = i5 + 1;
                            i3 = i5;
                        } else {
                            childCount2 = i5;
                        }
                        z3 = zR;
                    }
                    if (i3 > 0 && !z3) {
                        e();
                        q(i3, f);
                        v(iArr);
                    }
                }
            } else {
                v(iArr);
            }
            if (!this.q) {
                int i6 = iArr[0];
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = iArr[i7] - i6;
                }
            }
            this.m = true;
        }
        return this.l;
    }

    public final defpackage.eos[] k() {
        if (this.j == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            A(arrayList, y());
            A(arrayList2, x());
            if (this.q) {
                int i = 0;
                while (i < a()) {
                    int i2 = i + 1;
                    t(arrayList, new defpackage.eox(i, i2), new defpackage.eoz(0), true);
                    i = i2;
                }
            }
            int iA = a();
            t(arrayList, new defpackage.eox(0, iA), this.w, false);
            t(arrayList2, new defpackage.eox(iA, 0), this.x, false);
            defpackage.eos[] eosVarArrS = s(arrayList);
            defpackage.eos[] eosVarArrS2 = s(arrayList2);
            defpackage.eor eorVar = androidx.gridlayout.widget.GridLayout.c;
            java.lang.Class<?> componentType = eosVarArrS.getClass().getComponentType();
            int length = eosVarArrS.length;
            int length2 = eosVarArrS2.length;
            java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(componentType, length + length2);
            java.lang.System.arraycopy(eosVarArrS, 0, objArr, 0, length);
            java.lang.System.arraycopy(eosVarArrS2, 0, objArr, length, length2);
            this.j = (defpackage.eos[]) objArr;
        }
        if (!this.k) {
            y();
            x();
            this.k = true;
        }
        return this.j;
    }

    public final defpackage.ndd l() {
        defpackage.ndd nddVarB = this.s;
        if (nddVarB == null) {
            defpackage.eot eotVar = new defpackage.eot(defpackage.epa.class, defpackage.eow.class);
            androidx.gridlayout.widget.GridLayout gridLayout = this.r;
            int childCount = gridLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                defpackage.eoy eoyVarG = androidx.gridlayout.widget.GridLayout.g(gridLayout.getChildAt(i));
                boolean z = this.a;
                defpackage.epa epaVar = z ? eoyVarG.b : eoyVarG.a;
                eotVar.a(epaVar, epaVar.a(z).d());
            }
            nddVarB = eotVar.b();
            this.s = nddVarB;
        }
        if (!this.c) {
            for (defpackage.eow eowVar : (defpackage.eow[]) nddVarB.b) {
                eowVar.d();
            }
            androidx.gridlayout.widget.GridLayout gridLayout2 = this.r;
            int childCount2 = gridLayout2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                android.view.View childAt = gridLayout2.getChildAt(i2);
                defpackage.eoy eoyVarG2 = androidx.gridlayout.widget.GridLayout.g(childAt);
                boolean z2 = this.a;
                defpackage.epa epaVar2 = z2 ? eoyVarG2.b : eoyVarG2.a;
                int iH = childAt.getVisibility() == 8 ? 0 : androidx.gridlayout.widget.GridLayout.h(childAt, z2) + gridLayout2.c(childAt, z2);
                float f = epaVar2.e;
                int i3 = iH + (f == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : i()[i2]);
                defpackage.eow eowVar2 = (defpackage.eow) this.s.C(i2);
                int i4 = eowVar2.c;
                int i5 = 2;
                if (epaVar2.d == androidx.gridlayout.widget.GridLayout.b && f == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    i5 = 0;
                }
                eowVar2.c = i4 & i5;
                defpackage.eor eorVarA = epaVar2.a(z2);
                int i6 = defpackage.ebv.a;
                int iA = eorVarA.a(childAt, i3, gridLayout2.getLayoutMode());
                eowVar2.c(iA, i3 - iA);
            }
            this.c = true;
        }
        return this.s;
    }
}
