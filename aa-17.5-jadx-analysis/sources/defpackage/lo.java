package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class lo extends lq {
    @Override // defpackage.lq
    public final int a(View view) {
        return lz.bC(view) + ((ma) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.lq
    public final int b(View view) {
        ma maVar = (ma) view.getLayoutParams();
        return lz.bj(view) + maVar.leftMargin + maVar.rightMargin;
    }

    @Override // defpackage.lq
    public final int c(View view) {
        ma maVar = (ma) view.getLayoutParams();
        return lz.bi(view) + maVar.topMargin + maVar.bottomMargin;
    }

    @Override // defpackage.lq
    public final int d(View view) {
        return lz.bB(view) - ((ma) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.lq
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.lq
    public final int f() {
        lz lzVar = this.a;
        return lzVar.C - lzVar.getPaddingRight();
    }

    @Override // defpackage.lq
    public final int g() {
        return this.a.getPaddingRight();
    }

    @Override // defpackage.lq
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.lq
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.lq
    public final int j() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.lq
    public final int k() {
        lz lzVar = this.a;
        return (lzVar.C - lzVar.getPaddingLeft()) - lzVar.getPaddingRight();
    }

    @Override // defpackage.lq
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.right;
    }

    @Override // defpackage.lq
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.left;
    }

    @Override // defpackage.lq
    public final void n(int i) {
        this.a.aK(i);
    }
}
