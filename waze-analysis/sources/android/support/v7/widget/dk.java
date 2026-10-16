package android.support.v7.widget;

import android.widget.AbsListView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dk implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dm f1349a;

    dk(dm dmVar) {
        this.f1349a = dmVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            dm dmVar = this.f1349a;
            if (dmVar.F() || dmVar.f1356f.getContentView() == null) {
                return;
            }
            e eVar = dmVar.f1357g;
            dmVar.f1355e.removeCallbacks(eVar);
            eVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
