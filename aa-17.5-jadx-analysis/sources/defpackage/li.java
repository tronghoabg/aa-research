package defpackage;

import android.database.DataSetObserver;

/* loaded from: classes2.dex */
final class li extends DataSetObserver {
    final /* synthetic */ lk a;

    public li(lk lkVar) {
        this.a = lkVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        lk lkVar = this.a;
        if (lkVar.u()) {
            lkVar.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
