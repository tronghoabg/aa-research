package android.support.v7.widget;

import android.database.DataSetObserver;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dj extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dm f1348a;

    dj(dm dmVar) {
        this.f1348a = dmVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        dm dmVar = this.f1348a;
        if (dmVar.u()) {
            dmVar.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f1348a.k();
    }
}
