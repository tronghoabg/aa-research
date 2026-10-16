package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ke {
    public View d;
    public final izj e;
    public int c = 0;
    public final kd a = new kd();
    public final List b = new ArrayList();

    public ke(izj izjVar) {
        this.e = izjVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int iW = this.e.w();
        int i2 = i;
        while (i2 < iW) {
            kd kdVar = this.a;
            int iA = i - (i2 - kdVar.a(i2));
            if (iA == 0) {
                while (kdVar.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iA;
        }
        return -1;
    }

    public final int a() {
        return this.e.w() - this.b.size();
    }

    public final int b() {
        return this.e.w();
    }

    final int c(View view) {
        int iX = this.e.x(view);
        if (iX != -1) {
            kd kdVar = this.a;
            if (!kdVar.f(iX)) {
                return iX - kdVar.a(iX);
            }
        }
        return -1;
    }

    public final View d(int i) {
        return this.e.y(m(i));
    }

    public final View e(int i) {
        return this.e.y(i);
    }

    public final void f(View view, int i, boolean z) {
        int iW = i < 0 ? this.e.w() : m(i);
        this.a.c(iW, z);
        if (z) {
            i(view);
        }
        RecyclerView recyclerView = (RecyclerView) this.e.a;
        recyclerView.addView(view, iW);
        if (view != null) {
            mo moVar = ((ma) view.getLayoutParams()).c;
        }
        List list = recyclerView.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iW = i < 0 ? this.e.w() : m(i);
        this.a.c(iW, z);
        if (z) {
            i(view);
        }
        izj izjVar = this.e;
        int i2 = RecyclerView.ac;
        mo moVar = view == null ? null : ((ma) view.getLayoutParams()).c;
        if (moVar != null) {
            if (!moVar.x() && !moVar.A()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + moVar + ((RecyclerView) izjVar.a).n());
            }
            moVar.j();
        }
        ((RecyclerView) izjVar.a).attachViewToParent(view, iW, layoutParams);
    }

    final void h(int i) {
        kd kdVar = this.a;
        int iM = m(i);
        kdVar.g(iM);
        izj izjVar = this.e;
        View viewY = izjVar.y(iM);
        if (viewY != null) {
            int i2 = RecyclerView.ac;
            mo moVar = ((ma) viewY.getLayoutParams()).c;
            if (moVar != null) {
                if (moVar.x() && !moVar.A()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + moVar + ((RecyclerView) izjVar.a).n());
                }
                moVar.f(256);
            }
        } else {
            int i3 = RecyclerView.ac;
        }
        ((RecyclerView) izjVar.a).detachViewFromParent(iM);
    }

    public final void i(View view) {
        this.b.add(view);
        mo moVarK = RecyclerView.k(view);
        if (moVarK != null) {
            izj izjVar = this.e;
            int i = moVarK.p;
            if (i != -1) {
                moVarK.o = i;
            } else {
                moVarK.o = moVarK.a.getImportantForAccessibility();
            }
            ((RecyclerView) izjVar.a).ar(moVarK, 4);
        }
    }

    final void j(int i) {
        int i2 = this.c;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM = m(i);
            izj izjVar = this.e;
            View viewY = izjVar.y(iM);
            if (viewY != null) {
                this.c = 1;
                this.d = viewY;
                if (this.a.g(iM)) {
                    l(viewY);
                }
                izjVar.A(iM);
            }
        } finally {
            this.c = 0;
            this.d = null;
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.z(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
