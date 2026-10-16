package android.support.v7.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class fn extends ep {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f1497a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f1498b;

    /* renamed from: c, reason: collision with root package name */
    private final ed f1499c = new fl(this);

    public abstract int a(en enVar, int i2, int i3);

    public abstract View b(en enVar);

    public abstract int[] c(en enVar, View view);

    protected fa d(en enVar) {
        if (enVar instanceof ez) {
            return new fm(this, this.f1497a.getContext());
        }
        return null;
    }

    @Override // android.support.v7.widget.ep
    public final boolean e(int i2, int i3) {
        fa faVarD;
        int iA;
        RecyclerView recyclerView = this.f1497a;
        en enVar = recyclerView.n;
        if (enVar == null || recyclerView.m == null) {
            return false;
        }
        int iF = recyclerView.f();
        if ((Math.abs(i3) <= iF && Math.abs(i2) <= iF) || !(enVar instanceof ez) || (faVarD = d(enVar)) == null || (iA = a(enVar, i2, i3)) == -1) {
            return false;
        }
        faVarD.h(iA);
        enVar.bh(faVarD);
        return true;
    }

    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1497a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aG(this.f1499c);
            this.f1497a.am(null);
        }
        this.f1497a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.m() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.aF(this.f1499c);
            this.f1497a.am(this);
            this.f1498b = new Scroller(this.f1497a.getContext(), new DecelerateInterpolator());
            g();
        }
    }

    final void g() {
        en enVar;
        View viewB;
        RecyclerView recyclerView = this.f1497a;
        if (recyclerView == null || (enVar = recyclerView.n) == null || (viewB = b(enVar)) == null) {
            return;
        }
        int[] iArrC = c(enVar, viewB);
        int i2 = 0;
        int i3 = iArrC[0];
        if (i3 != 0) {
            i2 = i3;
        } else if (iArrC[1] == 0) {
            return;
        }
        this.f1497a.aD(i2, iArrC[1]);
    }

    public final int[] h(int i2, int i3) {
        this.f1498b.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f1498b.getFinalX(), this.f1498b.getFinalY()};
    }
}
