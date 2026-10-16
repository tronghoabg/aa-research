package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* loaded from: classes3.dex */
final class wnz extends ca {
    final /* synthetic */ wol c;
    final /* synthetic */ woa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnz(woa woaVar, wol wolVar) {
        super(null);
        this.c = wolVar;
        this.d = woaVar;
    }

    @Override // defpackage.ca
    public final void p(RecyclerView recyclerView, int i) {
        woa woaVar;
        ls lsVar;
        int iC;
        if (i != 0 || (lsVar = (woaVar = this.d).i) == null) {
            return;
        }
        View viewB = lsVar.b(woaVar.b());
        if (viewB != null && (iC = recyclerView.c(viewB)) != -1) {
            wol wolVar = this.c;
            woaVar.c = wolVar.c(iC);
            woaVar.h.setText(wolVar.s(iC));
            woaVar.f(iC);
        }
        woaVar.e();
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        woa woaVar = this.d;
        int iL = i < 0 ? woaVar.b().L() : woaVar.b().M();
        woa woaVar2 = this.d;
        if (woaVar2.i == null) {
            woaVar2.c = this.c.c(iL);
        }
        woaVar2.h.setText(this.c.s(iL));
        woaVar2.f(iL);
    }
}
