package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p0 extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18959a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f18960b;

    public p0(q0 q0Var) {
        this.f18960b = q0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i5) {
        super.onScrollStateChanged(recyclerView, i5);
        if (i5 == 0 && this.f18959a) {
            this.f18959a = false;
            this.f18960b.snapToTargetExistingView();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        if (i5 == 0 && i10 == 0) {
            return;
        }
        this.f18959a = true;
    }
}
