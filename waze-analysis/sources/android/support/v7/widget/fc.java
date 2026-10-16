package android.support.v7.widget;

import android.widget.EdgeEffect;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fc extends ej {
    fc() {
        super(null);
    }

    @Override // android.support.v7.widget.ej
    protected final EdgeEffect j(RecyclerView recyclerView) {
        return new EdgeEffect(recyclerView.getContext());
    }
}
