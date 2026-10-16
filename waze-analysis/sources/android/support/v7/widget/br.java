package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class br {

    /* renamed from: c, reason: collision with root package name */
    final ei f1176c;

    /* renamed from: e, reason: collision with root package name */
    private View f1178e;

    /* renamed from: d, reason: collision with root package name */
    private int f1177d = 0;

    /* renamed from: a, reason: collision with root package name */
    final bq f1174a = new bq();

    /* renamed from: b, reason: collision with root package name */
    final List f1175b = new ArrayList();

    br(ei eiVar) {
        this.f1176c = eiVar;
    }

    private final int o(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int iG = this.f1176c.g();
        int i3 = i2;
        while (i3 < iG) {
            bq bqVar = this.f1174a;
            int iA = i2 - (i3 - bqVar.a(i3));
            if (iA == 0) {
                while (bqVar.f(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iA;
        }
        return -1;
    }

    private final void p(View view) {
        this.f1175b.add(view);
        fe feVarP = RecyclerView.p(view);
        if (feVarP != null) {
            feVarP.onEnteredHiddenState(this.f1176c.f1403a);
        }
    }

    private final void q(View view) {
        if (this.f1175b.remove(view)) {
            this.f1176c.j(view);
        }
    }

    final int a() {
        return this.f1176c.g() - this.f1175b.size();
    }

    final int b() {
        return this.f1176c.g();
    }

    final int c(View view) {
        int iH = this.f1176c.h(view);
        if (iH != -1) {
            bq bqVar = this.f1174a;
            if (!bqVar.f(iH)) {
                return iH - bqVar.a(iH);
            }
        }
        return -1;
    }

    final View d(int i2) {
        return this.f1176c.i(o(i2));
    }

    final View e(int i2) {
        return this.f1176c.i(i2);
    }

    final void f(View view, int i2, boolean z) {
        int iG = i2 < 0 ? this.f1176c.g() : o(0);
        this.f1174a.c(iG, z);
        if (z) {
            p(view);
        }
        RecyclerView recyclerView = this.f1176c.f1403a;
        recyclerView.addView(view, iG);
        recyclerView.J(view);
    }

    final void g(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iG = i2 < 0 ? this.f1176c.g() : o(i2);
        this.f1174a.c(iG, z);
        if (z) {
            p(view);
        }
        ei eiVar = this.f1176c;
        fe feVarP = RecyclerView.p(view);
        if (feVarP != null) {
            if (!feVarP.isTmpDetached() && !feVarP.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + feVarP + eiVar.f1403a.t());
            }
            feVarP.clearTmpDetachFlag();
        }
        eiVar.f1403a.attachViewToParent(view, iG, layoutParams);
    }

    final void h(int i2) {
        bq bqVar = this.f1174a;
        int iO = o(i2);
        bqVar.g(iO);
        ei eiVar = this.f1176c;
        View viewI = eiVar.i(iO);
        if (viewI != null) {
            fe feVarP = RecyclerView.p(viewI);
            if (feVarP != null) {
                if (feVarP.isTmpDetached() && !feVarP.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + feVarP + eiVar.f1403a.t());
                }
                feVarP.addFlags(256);
            }
        } else {
            int i3 = RecyclerView.O;
        }
        eiVar.f1403a.detachViewFromParent(iO);
    }

    final void i(View view) {
        int iH = this.f1176c.h(view);
        if (iH < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
        this.f1174a.e(iH);
        p(view);
    }

    final void j(View view) {
        int i2 = this.f1177d;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f1177d = 1;
            this.f1178e = view;
            ei eiVar = this.f1176c;
            int iH = eiVar.h(view);
            if (iH >= 0) {
                if (this.f1174a.g(iH)) {
                    q(view);
                }
                eiVar.k(iH);
            }
        } finally {
            this.f1177d = 0;
            this.f1178e = null;
        }
    }

    final void k(int i2) {
        int i3 = this.f1177d;
        if (i3 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i3 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iO = o(i2);
            ei eiVar = this.f1176c;
            View viewI = eiVar.i(iO);
            if (viewI != null) {
                this.f1177d = 1;
                this.f1178e = viewI;
                if (this.f1174a.g(iO)) {
                    q(viewI);
                }
                eiVar.k(iO);
            }
        } finally {
            this.f1177d = 0;
            this.f1178e = null;
        }
    }

    final void l(View view) {
        int iH = this.f1176c.h(view);
        if (iH < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        bq bqVar = this.f1174a;
        if (!bqVar.f(iH)) {
            Objects.toString(view);
            throw new RuntimeException("trying to unhide a view that was not hidden".concat(view.toString()));
        }
        bqVar.b(iH);
        q(view);
    }

    final boolean m(View view) {
        return this.f1175b.contains(view);
    }

    final boolean n(View view) {
        int i2 = this.f1177d;
        if (i2 == 1) {
            if (this.f1178e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f1177d = 2;
            ei eiVar = this.f1176c;
            int iH = eiVar.h(view);
            if (iH == -1) {
                q(view);
            } else {
                bq bqVar = this.f1174a;
                if (!bqVar.f(iH)) {
                    return false;
                }
                bqVar.g(iH);
                q(view);
                eiVar.k(iH);
            }
            return true;
        } finally {
            this.f1177d = 0;
        }
    }

    public final String toString() {
        return this.f1174a.toString() + ", hidden list:" + this.f1175b.size();
    }
}
