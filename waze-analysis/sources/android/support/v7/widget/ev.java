package android.support.v7.widget;

import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ev extends ed {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f1436a;

    ev(RecyclerView recyclerView) {
        this.f1436a = recyclerView;
    }

    final void g() {
        RecyclerView recyclerView = this.f1436a;
        if (recyclerView.r && recyclerView.q) {
            ViewCompat.postOnAnimation(recyclerView, recyclerView.f943j);
        } else {
            recyclerView.v = true;
            recyclerView.requestLayout();
        }
    }

    @Override // android.support.v7.widget.ed
    public final void onChanged() {
        RecyclerView recyclerView = this.f1436a;
        recyclerView.D(null);
        recyclerView.E.f1462f = true;
        recyclerView.ac(true);
        if (recyclerView.f939f.l()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeChanged(int i2, int i3, Object obj) {
        RecyclerView recyclerView = this.f1436a;
        recyclerView.D(null);
        if (recyclerView.f939f.m(i2, i3, obj)) {
            g();
        }
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeInserted(int i2, int i3) {
        RecyclerView recyclerView = this.f1436a;
        recyclerView.D(null);
        if (recyclerView.f939f.n(i2, i3)) {
            g();
        }
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeMoved(int i2, int i3, int i4) {
        RecyclerView recyclerView = this.f1436a;
        recyclerView.D(null);
        if (recyclerView.f939f.o(i2, i3, i4)) {
            g();
        }
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeRemoved(int i2, int i3) {
        RecyclerView recyclerView = this.f1436a;
        recyclerView.D(null);
        if (recyclerView.f939f.p(i2, i3)) {
            g();
        }
    }

    @Override // android.support.v7.widget.ed
    public final void onStateRestorationPolicyChanged() {
        eb ebVar;
        RecyclerView recyclerView = this.f1436a;
        if (recyclerView.f938e == null || (ebVar = recyclerView.m) == null || !ebVar.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
