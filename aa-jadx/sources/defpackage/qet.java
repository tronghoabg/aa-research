package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qet {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    public int b = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final java.util.List n = new java.util.ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(android.view.View view, int i, int i2, int i3, int i4) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        this.a = java.lang.Math.min(this.a, (view.getLeft() - flexItem.g()) - i);
        this.b = java.lang.Math.min(this.b, (view.getTop() - flexItem.i()) - i2);
        this.c = java.lang.Math.max(this.c, view.getRight() + flexItem.h() + i3);
        this.d = java.lang.Math.max(this.d, view.getBottom() + flexItem.f() + i4);
    }
}
