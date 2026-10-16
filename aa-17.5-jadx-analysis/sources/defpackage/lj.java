package defpackage;

import android.widget.AbsListView;

/* loaded from: classes2.dex */
final class lj implements AbsListView.OnScrollListener {
    final /* synthetic */ lk a;

    public lj(lk lkVar) {
        this.a = lkVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            lk lkVar = this.a;
            if (lkVar.w() || lkVar.p.getContentView() == null) {
                return;
            }
            lh lhVar = lkVar.q;
            lkVar.n.removeCallbacks(lhVar);
            lhVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
