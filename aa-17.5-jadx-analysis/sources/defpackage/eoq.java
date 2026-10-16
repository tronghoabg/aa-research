package defpackage;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;

/* loaded from: classes2.dex */
public class eoq {
    public int a;
    public int b;
    public int c;

    public eoq() {
        d();
    }

    public int a(GridLayout gridLayout, View view, eol eolVar, int i, boolean z) {
        int i2 = this.a;
        int i3 = ebo.a;
        return i2 - eolVar.a(view, i, gridLayout.getLayoutMode());
    }

    public int b(boolean z) {
        if (!z) {
            int i = this.c;
            eol eolVar = GridLayout.c;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }

    protected void c(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    protected void d() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 2;
    }

    public final String toString() {
        return "Bounds{before=" + this.a + ", after=" + this.b + '}';
    }
}
