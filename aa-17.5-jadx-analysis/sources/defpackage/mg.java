package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mg extends ca {
    final /* synthetic */ RecyclerView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(RecyclerView recyclerView) {
        super(null);
        this.c = recyclerView;
    }

    final void bn() {
        RecyclerView recyclerView = this.c;
        if (!recyclerView.r || !recyclerView.q) {
            recyclerView.w = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.j;
            int[] iArr = ebm.a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // defpackage.ca
    public final void s() {
        RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        recyclerView.N.f = true;
        recyclerView.T(true);
        if (recyclerView.g.k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.ca
    public final void t(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        iu iuVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = iuVar.a;
        arrayList.add(iuVar.b(4, i, i2, obj));
        iuVar.c |= 4;
        if (arrayList.size() == 1) {
            bn();
        }
    }

    @Override // defpackage.ca
    public final void u(int i, int i2) {
        RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        iu iuVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = iuVar.a;
        arrayList.add(iuVar.b(1, i, i2, null));
        iuVar.c |= 1;
        if (arrayList.size() == 1) {
            bn();
        }
    }

    @Override // defpackage.ca
    public final void v(int i, int i2) {
        RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        iu iuVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = iuVar.a;
        arrayList.add(iuVar.b(2, i, i2, null));
        iuVar.c |= 2;
        if (arrayList.size() == 1) {
            bn();
        }
    }

    @Override // defpackage.ca
    public final void x(int i, int i2) {
        RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        iu iuVar = recyclerView.g;
        if (i == i2) {
            return;
        }
        ArrayList arrayList = iuVar.a;
        arrayList.add(iuVar.b(8, i, i2, null));
        iuVar.c |= 8;
        if (arrayList.size() == 1) {
            bn();
        }
    }
}
