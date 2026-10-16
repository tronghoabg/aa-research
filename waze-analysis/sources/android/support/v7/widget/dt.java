package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dt extends dv {
    @Override // android.support.v7.widget.dv
    public final int a(View view) {
        return en.bs(view) + ((eo) view.getLayoutParams()).rightMargin;
    }

    @Override // android.support.v7.widget.dv
    public final int b(View view) {
        eo eoVar = (eo) view.getLayoutParams();
        return en.br(view) + eoVar.leftMargin + eoVar.rightMargin;
    }

    @Override // android.support.v7.widget.dv
    public final int c(View view) {
        eo eoVar = (eo) view.getLayoutParams();
        return en.bq(view) + eoVar.topMargin + eoVar.bottomMargin;
    }

    @Override // android.support.v7.widget.dv
    public final int d(View view) {
        return en.bp(view) - ((eo) view.getLayoutParams()).leftMargin;
    }

    @Override // android.support.v7.widget.dv
    public final int e() {
        return this.f1376a.aE();
    }

    @Override // android.support.v7.widget.dv
    public final int f() {
        en enVar = this.f1376a;
        return enVar.aE() - enVar.aC();
    }

    @Override // android.support.v7.widget.dv
    public final int g() {
        return this.f1376a.aC();
    }

    @Override // android.support.v7.widget.dv
    public final int h() {
        return this.f1376a.aF();
    }

    @Override // android.support.v7.widget.dv
    public final int i() {
        return this.f1376a.av();
    }

    @Override // android.support.v7.widget.dv
    public final int j() {
        return this.f1376a.aB();
    }

    @Override // android.support.v7.widget.dv
    public final int k() {
        en enVar = this.f1376a;
        return (enVar.aE() - enVar.aB()) - enVar.aC();
    }

    @Override // android.support.v7.widget.dv
    public final int l(View view) {
        Rect rect = this.f1377b;
        this.f1376a.bv(view, rect);
        return rect.right;
    }

    @Override // android.support.v7.widget.dv
    public final int m(View view) {
        Rect rect = this.f1377b;
        this.f1376a.bv(view, rect);
        return rect.left;
    }

    @Override // android.support.v7.widget.dv
    public final void n(int i2) {
        this.f1376a.aR(i2);
    }
}
