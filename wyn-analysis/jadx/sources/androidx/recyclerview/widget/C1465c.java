package androidx.recyclerview.widget;

import Va.M6;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465c {

    /* renamed from: a, reason: collision with root package name */
    public final G f18832a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.d f18833b = new A2.d();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18834c = new ArrayList();

    public C1465c(G g9) {
        this.f18832a = g9;
    }

    public final void a(View view, int i5, boolean z2) {
        RecyclerView recyclerView = this.f18832a.f18766a;
        int childCount = i5 < 0 ? recyclerView.getChildCount() : f(i5);
        this.f18833b.K(childCount, z2);
        if (z2) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = this.f18832a.f18766a;
        int childCount = i5 < 0 ? recyclerView.getChildCount() : f(i5);
        this.f18833b.K(childCount, z2);
        if (z2) {
            i(view);
        }
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(M6.m(recyclerView, sb2));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i5) {
        m0 childViewHolderInt;
        int iF = f(i5);
        this.f18833b.L(iF);
        RecyclerView recyclerView = this.f18832a.f18766a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(M6.m(recyclerView, sb2));
            }
            childViewHolderInt.addFlags(256);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i5) {
        return this.f18832a.f18766a.getChildAt(f(i5));
    }

    public final int e() {
        return this.f18832a.f18766a.getChildCount() - this.f18834c.size();
    }

    public final int f(int i5) {
        if (i5 < 0) {
            return -1;
        }
        int childCount = this.f18832a.f18766a.getChildCount();
        int i10 = i5;
        while (i10 < childCount) {
            A2.d dVar = this.f18833b;
            int iH = i5 - (i10 - dVar.H(i10));
            if (iH == 0) {
                while (dVar.J(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iH;
        }
        return -1;
    }

    public final View g(int i5) {
        return this.f18832a.f18766a.getChildAt(i5);
    }

    public final int h() {
        return this.f18832a.f18766a.getChildCount();
    }

    public final void i(View view) {
        this.f18834c.add(view);
        G g9 = this.f18832a;
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(g9.f18766a);
        }
    }

    public final int j(View view) {
        int iIndexOfChild = this.f18832a.f18766a.indexOfChild(view);
        if (iIndexOfChild != -1) {
            A2.d dVar = this.f18833b;
            if (!dVar.J(iIndexOfChild)) {
                return iIndexOfChild - dVar.H(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i5) {
        int iF = f(i5);
        G g9 = this.f18832a;
        View childAt = g9.f18766a.getChildAt(iF);
        if (childAt == null) {
            return;
        }
        if (this.f18833b.L(iF)) {
            l(childAt);
        }
        g9.b(iF);
    }

    public final void l(View view) {
        if (this.f18834c.remove(view)) {
            G g9 = this.f18832a;
            m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(g9.f18766a);
            }
        }
    }

    public final String toString() {
        return this.f18833b.toString() + ", hidden list:" + this.f18834c.size();
    }
}
