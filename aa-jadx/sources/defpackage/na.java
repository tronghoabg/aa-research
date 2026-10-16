package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class na {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ android.support.v7.widget.StaggeredGridLayoutManager g;

    public na(android.support.v7.widget.StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
    }
}
