package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lk implements android.widget.AbsListView.OnScrollListener {
    final /* synthetic */ defpackage.ll a;

    public lk(defpackage.ll llVar) {
        this.a = llVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
        if (i == 1) {
            defpackage.ll llVar = this.a;
            if (llVar.w() || llVar.p.getContentView() == null) {
                return;
            }
            defpackage.ku kuVar = llVar.q;
            llVar.n.removeCallbacks(kuVar);
            kuVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
    }
}
