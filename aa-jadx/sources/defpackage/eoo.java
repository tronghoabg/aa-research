package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eoo extends defpackage.eow {
    private int d;

    @Override // defpackage.eow
    public final int a(androidx.gridlayout.widget.GridLayout gridLayout, android.view.View view, defpackage.eor eorVar, int i, boolean z) {
        return java.lang.Math.max(0, super.a(gridLayout, view, eorVar, i, z));
    }

    @Override // defpackage.eow
    public final int b(boolean z) {
        return java.lang.Math.max(super.b(z), this.d);
    }

    @Override // defpackage.eow
    protected final void c(int i, int i2) {
        super.c(i, i2);
        this.d = java.lang.Math.max(this.d, i + i2);
    }

    @Override // defpackage.eow
    protected final void d() {
        super.d();
        this.d = Integer.MIN_VALUE;
    }
}
