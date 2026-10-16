package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mj extends defpackage.ca {
    final /* synthetic */ android.support.v7.widget.RecyclerView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(android.support.v7.widget.RecyclerView recyclerView) {
        super(null);
        this.c = recyclerView;
    }

    final void bn() {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        if (!recyclerView.r || !recyclerView.q) {
            recyclerView.w = true;
            recyclerView.requestLayout();
        } else {
            java.lang.Runnable runnable = recyclerView.j;
            int[] iArr = defpackage.ebt.a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // defpackage.ca
    public final void s() {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        recyclerView.N.f = true;
        recyclerView.T(true);
        if (recyclerView.g.k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.ca
    public final void t(int i, int i2, java.lang.Object obj) {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        defpackage.iv ivVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        java.util.ArrayList arrayList = ivVar.a;
        arrayList.add(ivVar.b(4, i, i2, obj));
        ivVar.c |= 4;
        if (arrayList.size() == 1) {
            bn();
        }
    }

    @Override // defpackage.ca
    public final void u(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        defpackage.iv ivVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        java.util.ArrayList arrayList = ivVar.a;
        arrayList.add(ivVar.b(1, i, i2, null));
        ivVar.c |= 1;
        if (arrayList.size() == 1) {
            bn();
        }
    }

    @Override // defpackage.ca
    public final void v(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        defpackage.iv ivVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        java.util.ArrayList arrayList = ivVar.a;
        arrayList.add(ivVar.b(2, i, i2, null));
        ivVar.c |= 2;
        if (arrayList.size() == 1) {
            bn();
        }
    }

    @Override // defpackage.ca
    public final void x(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.v(null);
        defpackage.iv ivVar = recyclerView.g;
        if (i == i2) {
            return;
        }
        java.util.ArrayList arrayList = ivVar.a;
        arrayList.add(ivVar.b(8, i, i2, null));
        ivVar.c |= 8;
        if (arrayList.size() == 1) {
            bn();
        }
    }
}
