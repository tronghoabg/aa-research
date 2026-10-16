package defpackage;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class eop {
    public final boolean a;
    public int[] f;
    public int[] h;
    public eom[] j;
    public int[] l;
    public boolean n;
    public int[] p;
    final /* synthetic */ GridLayout r;
    ncp s;
    ncp t;
    ncp u;
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
    private final eot w = new eot(0);
    private final eot x = new eot(-100000);

    public eop(GridLayout gridLayout, boolean z) {
        this.r = gridLayout;
        this.a = z;
    }

    private static final void A(List list, ncp ncpVar) {
        int i = 0;
        while (true) {
            eor[] eorVarArr = (eor[]) ncpVar.c;
            if (i >= eorVarArr.length) {
                return;
            }
            t(list, eorVarArr[i], ((eot[]) ncpVar.b)[i], false);
            i++;
        }
    }

    private final int m() {
        int i = this.v;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        GridLayout gridLayout = this.r;
        int childCount = gridLayout.getChildCount();
        int iMax = -1;
        for (int i2 = 0; i2 < childCount; i2++) {
            eos eosVarG = GridLayout.g(gridLayout.getChildAt(i2));
            eor eorVar = (this.a ? eosVarG.b : eosVarG.a).c;
            iMax = Math.max(Math.max(Math.max(iMax, eorVar.a), eorVar.b), eorVar.a());
        }
        int iMax2 = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
        this.v = iMax2;
        return iMax2;
    }

    private final int n(int i, int i2) {
        p(i, i2);
        return j()[a()];
    }

    private final String o(List list) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            eom eomVar = (eom) it.next();
            if (!z) {
                sb.append(", ");
            }
            boolean z2 = this.a;
            eor eorVar = eomVar.a;
            int i = eorVar.a;
            int i2 = eorVar.b;
            int i3 = eomVar.b.a;
            String str2 = true != z2 ? "y" : "x";
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
        Arrays.fill(this.p, 0);
        GridLayout gridLayout = this.r;
        int childCount = gridLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = gridLayout.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                eos eosVarG = GridLayout.g(childAt);
                float f2 = (this.a ? eosVarG.b : eosVarG.a).e;
                if (f2 != BitmapDescriptorFactory.HUE_RED) {
                    int iRound = Math.round((i * f2) / f);
                    this.p[i2] = iRound;
                    i -= iRound;
                    f -= f2;
                }
            }
        }
    }

    private final boolean r(eom[] eomVarArr, int[] iArr, boolean z) {
        int iA = a() + 1;
        boolean[] zArr = null;
        for (int i = 0; i < eomVarArr.length; i++) {
            Arrays.fill(iArr, 0);
            for (int i2 = 0; i2 < iA; i2++) {
                boolean zU = false;
                for (eom eomVar : eomVarArr) {
                    zU |= u(iArr, eomVar);
                }
                if (!zU) {
                    if (zArr != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < eomVarArr.length; i3++) {
                            eom eomVar2 = eomVarArr[i3];
                            if (zArr[i3]) {
                                arrayList.add(eomVar2);
                            }
                            if (!eomVar2.c) {
                                arrayList2.add(eomVar2);
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
            boolean[] zArr2 = new boolean[eomVarArr.length];
            for (int i4 = 0; i4 < iA; i4++) {
                int length = eomVarArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    zArr2[i5] = zArr2[i5] | u(iArr, eomVarArr[i5]);
                }
            }
            if (i == 0) {
                zArr = zArr2;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= eomVarArr.length) {
                    break;
                }
                if (zArr2[i6]) {
                    eom eomVar3 = eomVarArr[i6];
                    eor eorVar = eomVar3.a;
                    if (eorVar.a >= eorVar.b) {
                        eomVar3.c = false;
                        break;
                    }
                }
                i6++;
            }
        }
        return true;
    }

    private final eom[] s(List list) {
        eoo eooVar = new eoo(this, (eom[]) list.toArray(new eom[list.size()]));
        int length = eooVar.c.length;
        for (int i = 0; i < length; i++) {
            eooVar.a(i);
        }
        return eooVar.a;
    }

    private static final void t(List list, eor eorVar, eot eotVar, boolean z) {
        if (eorVar.a() == 0) {
            return;
        }
        if (z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((eom) it.next()).a.equals(eorVar)) {
                    return;
                }
            }
        }
        list.add(new eom(eorVar, eotVar));
    }

    private static final boolean u(int[] iArr, eom eomVar) {
        if (!eomVar.c) {
            return false;
        }
        eor eorVar = eomVar.a;
        int i = eorVar.a;
        int i2 = eorVar.b;
        int i3 = iArr[i] + eomVar.b.a;
        if (i3 <= iArr[i2]) {
            return false;
        }
        iArr[i2] = i3;
        return true;
    }

    private final void v(int[] iArr) {
        r(k(), iArr, true);
    }

    private final ncp w(boolean z) {
        eor eorVar;
        eon eonVar = new eon(eor.class, eot.class);
        eou[] eouVarArr = (eou[]) l().c;
        int length = eouVarArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                eorVar = eouVarArr[i].c;
            } else {
                eor eorVar2 = eouVarArr[i].c;
                eorVar = new eor(eorVar2.b, eorVar2.a);
            }
            eonVar.a(eorVar, new eot());
        }
        return eonVar.b();
    }

    private final ncp x() {
        ncp ncpVarW = this.u;
        if (ncpVarW == null) {
            ncpVarW = w(false);
            this.u = ncpVarW;
        }
        if (!this.e) {
            z(ncpVarW, false);
            this.e = true;
        }
        return this.u;
    }

    private final ncp y() {
        ncp ncpVarW = this.t;
        if (ncpVarW == null) {
            ncpVarW = w(true);
            this.t = ncpVarW;
        }
        if (!this.d) {
            z(ncpVarW, true);
            this.d = true;
        }
        return this.t;
    }

    private final void z(ncp ncpVar, boolean z) {
        for (eot eotVar : (eot[]) ncpVar.b) {
            eotVar.a();
        }
        eoq[] eoqVarArr = (eoq[]) l().b;
        for (int i = 0; i < eoqVarArr.length; i++) {
            int iB = eoqVarArr[i].b(z);
            eot eotVar2 = (eot) ncpVar.C(i);
            int i2 = eotVar2.a;
            if (!z) {
                iB = -iB;
            }
            eotVar2.a = Math.max(i2, iB);
        }
    }

    public final int a() {
        return Math.max(this.b, m());
    }

    public final int b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
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
        GridLayout gridLayout = this.r;
        int childCount = gridLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = gridLayout.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                eos eosVarG = GridLayout.g(childAt);
                boolean z2 = this.a;
                eor eorVar = (z2 ? eosVarG.b : eosVarG.a).c;
                int i2 = z ? eorVar.a : eorVar.b;
                iArr[i2] = Math.max(iArr[i2], gridLayout.b(childAt, z2, z));
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
            GridLayout.f((true != this.a ? "row" : "column").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
        }
        if (i != Integer.MIN_VALUE && i > 100000) {
            GridLayout.f((true == this.a ? "column" : "row").concat("Count must be less than or equal to the maximum size (100000)"));
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
            float f = BitmapDescriptorFactory.HUE_RED;
            if (!z2) {
                GridLayout gridLayout = this.r;
                int childCount = gridLayout.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        z = false;
                        break;
                    }
                    View childAt = gridLayout.getChildAt(i);
                    if (childAt.getVisibility() != 8) {
                        eos eosVarG = GridLayout.g(childAt);
                        if ((this.a ? eosVarG.b : eosVarG.a).e != BitmapDescriptorFactory.HUE_RED) {
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
                Arrays.fill(i(), 0);
                v(iArr);
                eot eotVar = this.w;
                GridLayout gridLayout2 = this.r;
                int childCount2 = (eotVar.a * gridLayout2.getChildCount()) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout2.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        View childAt2 = gridLayout2.getChildAt(i2);
                        if (childAt2.getVisibility() != 8) {
                            eos eosVarG2 = GridLayout.g(childAt2);
                            f += (this.a ? eosVarG2.b : eosVarG2.a).e;
                        }
                    }
                    int i3 = -1;
                    boolean z3 = true;
                    int i4 = 0;
                    while (i4 < childCount2) {
                        e();
                        int i5 = (int) ((i4 + childCount2) / 2);
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

    public final eom[] k() {
        if (this.j == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            A(arrayList, y());
            A(arrayList2, x());
            if (this.q) {
                int i = 0;
                while (i < a()) {
                    int i2 = i + 1;
                    t(arrayList, new eor(i, i2), new eot(0), true);
                    i = i2;
                }
            }
            int iA = a();
            t(arrayList, new eor(0, iA), this.w, false);
            t(arrayList2, new eor(iA, 0), this.x, false);
            eom[] eomVarArrS = s(arrayList);
            eom[] eomVarArrS2 = s(arrayList2);
            eol eolVar = GridLayout.c;
            Class<?> componentType = eomVarArrS.getClass().getComponentType();
            int length = eomVarArrS.length;
            int length2 = eomVarArrS2.length;
            Object[] objArr = (Object[]) Array.newInstance(componentType, length + length2);
            System.arraycopy(eomVarArrS, 0, objArr, 0, length);
            System.arraycopy(eomVarArrS2, 0, objArr, length, length2);
            this.j = (eom[]) objArr;
        }
        if (!this.k) {
            y();
            x();
            this.k = true;
        }
        return this.j;
    }

    public final ncp l() {
        ncp ncpVarB = this.s;
        if (ncpVarB == null) {
            eon eonVar = new eon(eou.class, eoq.class);
            GridLayout gridLayout = this.r;
            int childCount = gridLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                eos eosVarG = GridLayout.g(gridLayout.getChildAt(i));
                boolean z = this.a;
                eou eouVar = z ? eosVarG.b : eosVarG.a;
                eonVar.a(eouVar, eouVar.a(z).d());
            }
            ncpVarB = eonVar.b();
            this.s = ncpVarB;
        }
        if (!this.c) {
            for (eoq eoqVar : (eoq[]) ncpVarB.b) {
                eoqVar.d();
            }
            GridLayout gridLayout2 = this.r;
            int childCount2 = gridLayout2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt = gridLayout2.getChildAt(i2);
                eos eosVarG2 = GridLayout.g(childAt);
                boolean z2 = this.a;
                eou eouVar2 = z2 ? eosVarG2.b : eosVarG2.a;
                int iH = childAt.getVisibility() == 8 ? 0 : GridLayout.h(childAt, z2) + gridLayout2.c(childAt, z2);
                float f = eouVar2.e;
                int i3 = iH + (f == BitmapDescriptorFactory.HUE_RED ? 0 : i()[i2]);
                eoq eoqVar2 = (eoq) this.s.C(i2);
                int i4 = eoqVar2.c;
                int i5 = 2;
                if (eouVar2.d == GridLayout.b && f == BitmapDescriptorFactory.HUE_RED) {
                    i5 = 0;
                }
                eoqVar2.c = i4 & i5;
                eol eolVarA = eouVar2.a(z2);
                int i6 = ebo.a;
                int iA = eolVarA.a(childAt, i3, gridLayout2.getLayoutMode());
                eoqVar2.c(iA, i3 - iA);
            }
            this.c = true;
        }
        return this.s;
    }
}
