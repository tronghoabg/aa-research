package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lv implements defpackage.eaf {
    final /* synthetic */ android.support.v7.widget.RecyclerView a;

    public lv(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.eaf
    public final float a() {
        float f;
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        if (recyclerView.n.ah()) {
            f = recyclerView.J;
        } else {
            if (!recyclerView.n.ag()) {
                return 0.0f;
            }
            f = recyclerView.I;
        }
        return -f;
    }

    @Override // defpackage.eaf
    public final void b() {
        this.a.ah();
    }

    @Override // defpackage.eaf
    public final boolean c(float f) {
        int i;
        int i2;
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        if (recyclerView.n.ah()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.n.ag()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.ah();
        return recyclerView.al(i, i2, 0, Integer.MAX_VALUE);
    }
}
