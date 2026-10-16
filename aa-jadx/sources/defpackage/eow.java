package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class eow {
    public int a;
    public int b;
    public int c;

    public eow() {
        d();
    }

    public int a(androidx.gridlayout.widget.GridLayout gridLayout, android.view.View view, defpackage.eor eorVar, int i, boolean z) {
        int i2 = this.a;
        int i3 = defpackage.ebv.a;
        return i2 - eorVar.a(view, i, gridLayout.getLayoutMode());
    }

    public int b(boolean z) {
        if (!z) {
            int i = this.c;
            defpackage.eor eorVar = androidx.gridlayout.widget.GridLayout.c;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }

    protected void c(int i, int i2) {
        this.a = java.lang.Math.max(this.a, i);
        this.b = java.lang.Math.max(this.b, i2);
    }

    protected void d() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 2;
    }

    public final java.lang.String toString() {
        return "Bounds{before=" + this.a + ", after=" + this.b + '}';
    }
}
