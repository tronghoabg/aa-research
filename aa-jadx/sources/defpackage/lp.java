package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lp extends defpackage.lr {
    @Override // defpackage.lr
    public final int a(android.view.View view) {
        return defpackage.mc.bC(view) + ((defpackage.md) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.lr
    public final int b(android.view.View view) {
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        return defpackage.mc.bj(view) + mdVar.leftMargin + mdVar.rightMargin;
    }

    @Override // defpackage.lr
    public final int c(android.view.View view) {
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        return defpackage.mc.bi(view) + mdVar.topMargin + mdVar.bottomMargin;
    }

    @Override // defpackage.lr
    public final int d(android.view.View view) {
        return defpackage.mc.bB(view) - ((defpackage.md) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.lr
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.lr
    public final int f() {
        defpackage.mc mcVar = this.a;
        return mcVar.C - mcVar.getPaddingRight();
    }

    @Override // defpackage.lr
    public final int g() {
        return this.a.getPaddingRight();
    }

    @Override // defpackage.lr
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.lr
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.lr
    public final int j() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.lr
    public final int k() {
        defpackage.mc mcVar = this.a;
        return (mcVar.C - mcVar.getPaddingLeft()) - mcVar.getPaddingRight();
    }

    @Override // defpackage.lr
    public final int l(android.view.View view) {
        android.graphics.Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.right;
    }

    @Override // defpackage.lr
    public final int m(android.view.View view) {
        android.graphics.Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.left;
    }

    @Override // defpackage.lr
    public final void n(int i) {
        this.a.aK(i);
    }
}
