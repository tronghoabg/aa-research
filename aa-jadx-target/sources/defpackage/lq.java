package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lq extends defpackage.lr {
    @Override // defpackage.lr
    public final int a(android.view.View view) {
        return defpackage.mc.bA(view) + ((defpackage.md) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.lr
    public final int b(android.view.View view) {
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        return defpackage.mc.bi(view) + mdVar.topMargin + mdVar.bottomMargin;
    }

    @Override // defpackage.lr
    public final int c(android.view.View view) {
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        return defpackage.mc.bj(view) + mdVar.leftMargin + mdVar.rightMargin;
    }

    @Override // defpackage.lr
    public final int d(android.view.View view) {
        return defpackage.mc.bD(view) - ((defpackage.md) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.lr
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.lr
    public final int f() {
        defpackage.mc mcVar = this.a;
        return mcVar.D - mcVar.getPaddingBottom();
    }

    @Override // defpackage.lr
    public final int g() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.lr
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.lr
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.lr
    public final int j() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.lr
    public final int k() {
        defpackage.mc mcVar = this.a;
        return (mcVar.D - mcVar.getPaddingTop()) - mcVar.getPaddingBottom();
    }

    @Override // defpackage.lr
    public final int l(android.view.View view) {
        android.graphics.Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.lr
    public final int m(android.view.View view) {
        android.graphics.Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.top;
    }

    @Override // defpackage.lr
    public final void n(int i) {
        this.a.aL(i);
    }
}
