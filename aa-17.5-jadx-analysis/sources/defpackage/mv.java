package defpackage;

import android.support.v7.widget.RecyclerView;

/* loaded from: classes2.dex */
final class mv extends ca {
    boolean c;
    final /* synthetic */ mb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(mb mbVar) {
        super(null);
        this.d = mbVar;
        this.c = false;
    }

    @Override // defpackage.ca
    public final void p(RecyclerView recyclerView, int i) {
        if (i == 0 && this.c) {
            this.c = false;
            this.d.f();
        }
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.c = true;
    }
}
