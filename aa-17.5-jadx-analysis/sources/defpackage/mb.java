package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* loaded from: classes2.dex */
public abstract class mb {
    public RecyclerView a;
    public Scroller b;
    private final ca c = new mv(this);

    public abstract int a(lz lzVar, int i, int i2);

    public abstract View b(lz lzVar);

    public abstract int[] c(lz lzVar, View view);

    public mk d(lz lzVar) {
        return g(lzVar);
    }

    public final void e(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.az(this.c);
            this.a.G = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.G != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.ay(this.c);
            RecyclerView recyclerView3 = this.a;
            recyclerView3.G = this;
            this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void f() {
        lz lzVarG;
        View viewB;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (lzVarG = recyclerView.g()) == null || (viewB = b(lzVarG)) == null) {
            return;
        }
        int[] iArrC = c(lzVarG, viewB);
        int i = iArrC[0];
        if (i == 0) {
            if (iArrC[1] == 0) {
                return;
            } else {
                i = 0;
            }
        }
        this.a.as(i, iArrC[1], false);
    }

    @Deprecated
    protected mk g(lz lzVar) {
        if (lzVar instanceof mj) {
            return new mw(this, this.a.getContext());
        }
        return null;
    }
}
