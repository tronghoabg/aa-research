package android.support.v7.widget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cn extends ed {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cq f1254a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cn(cq cqVar) {
        super(null);
        this.f1254a = cqVar;
    }

    @Override // android.support.v7.widget.ed
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        this.f1254a.e(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
    }
}
