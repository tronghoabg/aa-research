package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19014a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f19015b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f19016c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f19017d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f19018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f19019f;

    public v0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i5) {
        this.f19019f = staggeredGridLayoutManager;
        this.f19018e = i5;
    }

    public final void a() {
        View view = (View) AbstractC3256n.e(this.f19014a, 1);
        s0 s0Var = (s0) view.getLayoutParams();
        this.f19016c = this.f19019f.f18789c.b(view);
        s0Var.getClass();
    }

    public final void b() {
        this.f19014a.clear();
        this.f19015b = Integer.MIN_VALUE;
        this.f19016c = Integer.MIN_VALUE;
        this.f19017d = 0;
    }

    public final int c() {
        return this.f19019f.f18794h ? e(r1.size() - 1, -1) : e(0, this.f19014a.size());
    }

    public final int d() {
        return this.f19019f.f18794h ? e(0, this.f19014a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i5, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19019f;
        int iK = staggeredGridLayoutManager.f18789c.k();
        int iG = staggeredGridLayoutManager.f18789c.g();
        int i11 = i10 > i5 ? 1 : -1;
        while (i5 != i10) {
            View view = (View) this.f19014a.get(i5);
            int iE = staggeredGridLayoutManager.f18789c.e(view);
            int iB = staggeredGridLayoutManager.f18789c.b(view);
            boolean z2 = iE <= iG;
            boolean z10 = iB >= iK;
            if (z2 && z10 && (iE < iK || iB > iG)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i5 += i11;
        }
        return -1;
    }

    public final int f(int i5) {
        int i10 = this.f19016c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f19014a.size() == 0) {
            return i5;
        }
        a();
        return this.f19016c;
    }

    public final View g(int i5, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19019f;
        ArrayList arrayList = this.f19014a;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f18794h && staggeredGridLayoutManager.getPosition(view2) >= i5) || ((!staggeredGridLayoutManager.f18794h && staggeredGridLayoutManager.getPosition(view2) <= i5) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.f18794h && staggeredGridLayoutManager.getPosition(view3) <= i5) || ((!staggeredGridLayoutManager.f18794h && staggeredGridLayoutManager.getPosition(view3) >= i5) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public final int h(int i5) {
        int i10 = this.f19015b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f19014a.size() == 0) {
            return i5;
        }
        View view = (View) this.f19014a.get(0);
        s0 s0Var = (s0) view.getLayoutParams();
        this.f19015b = this.f19019f.f18789c.e(view);
        s0Var.getClass();
        return this.f19015b;
    }
}
