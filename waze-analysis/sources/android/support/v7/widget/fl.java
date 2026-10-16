package android.support.v7.widget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fl extends ed {

    /* renamed from: a, reason: collision with root package name */
    boolean f1494a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fn f1495b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fl(fn fnVar) {
        super(null);
        this.f1495b = fnVar;
        this.f1494a = false;
    }

    @Override // android.support.v7.widget.ed
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        this.f1494a = true;
    }

    @Override // android.support.v7.widget.ed
    public final void f(RecyclerView recyclerView, int i2) {
        if (i2 == 0 && this.f1494a) {
            this.f1494a = false;
            this.f1495b.g();
        }
    }
}
