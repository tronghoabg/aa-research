package defpackage;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;

/* loaded from: classes2.dex */
final class eoi extends eoq {
    private int d;

    @Override // defpackage.eoq
    public final int a(GridLayout gridLayout, View view, eol eolVar, int i, boolean z) {
        return Math.max(0, super.a(gridLayout, view, eolVar, i, z));
    }

    @Override // defpackage.eoq
    public final int b(boolean z) {
        return Math.max(super.b(z), this.d);
    }

    @Override // defpackage.eoq
    protected final void c(int i, int i2) {
        super.c(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override // defpackage.eoq
    protected final void d() {
        super.d();
        this.d = Integer.MIN_VALUE;
    }
}
