package defpackage;

import android.support.v7.widget.RecyclerView;

@Deprecated
/* loaded from: classes2.dex */
public final class eyf extends mq {
    final RecyclerView c;
    final dzp d;
    final dzp e;

    public eyf(RecyclerView recyclerView) {
        super(recyclerView);
        this.d = ((mq) this).b;
        this.e = new eye(this);
        this.c = recyclerView;
    }

    @Override // defpackage.mq
    public final dzp j() {
        return this.e;
    }
}
