package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fw {

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f1526a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    int f1527b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    int f1528c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    int f1529d = 0;

    /* renamed from: e, reason: collision with root package name */
    final int f1530e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ StaggeredGridLayoutManager f1531f;

    fw(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f1531f = staggeredGridLayoutManager;
        this.f1530e = i2;
    }

    static final fs n(View view) {
        return (fs) view.getLayoutParams();
    }

    public final int a() {
        return this.f1531f.f950d ? m(r1.size() - 1, -1) : m(0, this.f1526a.size());
    }

    public final int b() {
        return this.f1531f.f950d ? m(0, this.f1526a.size()) : m(r1.size() - 1, -1);
    }

    final int c() {
        int i2 = this.f1528c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        h();
        return this.f1528c;
    }

    final int d(int i2) {
        int i3 = this.f1528c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f1526a.size() == 0) {
            return i2;
        }
        h();
        return this.f1528c;
    }

    final int e() {
        int i2 = this.f1527b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        i();
        return this.f1527b;
    }

    final int f(int i2) {
        int i3 = this.f1527b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f1526a.size() == 0) {
            return i2;
        }
        i();
        return this.f1527b;
    }

    public final View g(int i2, int i3) {
        ArrayList arrayList = this.f1526a;
        View view = null;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1531f;
                if ((staggeredGridLayoutManager.f950d && StaggeredGridLayoutManager.bu(view2) >= i2) || ((!staggeredGridLayoutManager.f950d && StaggeredGridLayoutManager.bu(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            View view3 = (View) arrayList.get(i4);
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f1531f;
            if ((staggeredGridLayoutManager2.f950d && StaggeredGridLayoutManager.bu(view3) <= i2) || ((!staggeredGridLayoutManager2.f950d && StaggeredGridLayoutManager.bu(view3) >= i2) || !view3.hasFocusable())) {
                break;
            }
            i4++;
            view = view3;
        }
        return view;
    }

    final void h() {
        View view = (View) this.f1526a.get(r0.size() - 1);
        fs fsVarN = n(view);
        this.f1528c = this.f1531f.f948b.a(view);
        boolean z = fsVarN.f1509b;
    }

    final void i() {
        View view = (View) this.f1526a.get(0);
        fs fsVarN = n(view);
        this.f1527b = this.f1531f.f948b.d(view);
        boolean z = fsVarN.f1509b;
    }

    final void j() {
        this.f1526a.clear();
        this.f1527b = Integer.MIN_VALUE;
        this.f1528c = Integer.MIN_VALUE;
        this.f1529d = 0;
    }

    final void k(int i2) {
        int i3 = this.f1527b;
        if (i3 != Integer.MIN_VALUE) {
            this.f1527b = i3 + i2;
        }
        int i4 = this.f1528c;
        if (i4 != Integer.MIN_VALUE) {
            this.f1528c = i4 + i2;
        }
    }

    final void l(int i2) {
        this.f1527b = i2;
        this.f1528c = i2;
    }

    final int m(int i2, int i3) {
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1531f;
        int iJ = staggeredGridLayoutManager.f948b.j();
        int iF = staggeredGridLayoutManager.f948b.f();
        int i4 = i2;
        while (true) {
            int i5 = -1;
            if (i4 == i3) {
                return -1;
            }
            view = (View) this.f1526a.get(i4);
            int iD = staggeredGridLayoutManager.f948b.d(view);
            int iA = staggeredGridLayoutManager.f948b.a(view);
            boolean z = iD <= iF;
            boolean z2 = iA >= iJ;
            if (z && z2 && (iD < iJ || iA > iF)) {
                break;
            }
            if (i3 > i2) {
                i5 = 1;
            }
            i4 += i5;
        }
        return StaggeredGridLayoutManager.bu(view);
    }
}
