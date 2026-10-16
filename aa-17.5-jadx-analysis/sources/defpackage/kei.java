package defpackage;

import android.support.v7.widget.RecyclerView;

/* loaded from: classes2.dex */
final class kei extends ca {
    final /* synthetic */ kek c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kei(kek kekVar) {
        super(null);
        this.c = kekVar;
    }

    @Override // defpackage.ca
    public final void p(RecyclerView recyclerView, int i) {
        if (i == 0) {
            kek kekVar = this.c;
            kekVar.b();
            kekVar.f = 0;
        }
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        this.c.f += i2;
    }
}
