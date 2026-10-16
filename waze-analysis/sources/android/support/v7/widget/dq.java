package android.support.v7.widget;

import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dq extends ed {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dr f1368a;

    dq(dr drVar) {
        this.f1368a = drVar;
    }

    @Override // android.support.v7.widget.ed
    public final void onChanged() {
        dr drVar = this.f1368a;
        drVar.f1370b = drVar.f1369a.getItemCount();
        drVar.f1371c.q();
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeChanged(int i2, int i3) {
        dr drVar = this.f1368a;
        drVar.f1371c.h(drVar, i2, i3, null);
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeInserted(int i2, int i3) {
        dr drVar = this.f1368a;
        drVar.f1370b += i3;
        bu buVar = drVar.f1371c;
        buVar.i(drVar, i2, i3);
        if (drVar.f1370b <= 0 || drVar.f1369a.getStateRestorationPolicy() != ea.f1386b) {
            return;
        }
        buVar.r();
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeMoved(int i2, int i3, int i4) {
        Preconditions.checkArgument(i4 == 1, "moving more than 1 item is not supported in RecyclerView");
        dr drVar = this.f1368a;
        drVar.f1371c.j(drVar, i2, i3);
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeRemoved(int i2, int i3) {
        dr drVar = this.f1368a;
        drVar.f1370b -= i3;
        bu buVar = drVar.f1371c;
        buVar.k(drVar, i2, i3);
        if (drVar.f1370b > 0 || drVar.f1369a.getStateRestorationPolicy() != ea.f1386b) {
            return;
        }
        buVar.r();
    }

    @Override // android.support.v7.widget.ed
    public final void onStateRestorationPolicyChanged() {
        this.f1368a.f1371c.r();
    }

    @Override // android.support.v7.widget.ed
    public final void onItemRangeChanged(int i2, int i3, Object obj) {
        dr drVar = this.f1368a;
        drVar.f1371c.h(drVar, i2, i3, obj);
    }
}
