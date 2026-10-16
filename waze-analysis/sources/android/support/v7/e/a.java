package android.support.v7.e;

import android.support.v7.widget.eb;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    private final eb f641a;

    public a(eb ebVar) {
        this.f641a = ebVar;
    }

    @Override // android.support.v7.e.k
    public final void a(int i2, int i3) {
        this.f641a.notifyItemRangeInserted(i2, i3);
    }

    @Override // android.support.v7.e.k
    public final void b(int i2, int i3) {
        this.f641a.notifyItemMoved(i2, i3);
    }

    @Override // android.support.v7.e.k
    public final void c(int i2, int i3) {
        this.f641a.notifyItemRangeRemoved(i2, i3);
    }

    @Override // android.support.v7.e.k
    public final void d(int i2, int i3) {
        this.f641a.notifyItemRangeChanged(i2, i3, null);
    }
}
