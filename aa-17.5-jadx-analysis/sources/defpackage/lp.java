package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class lp extends lq {
    @Override // defpackage.lq
    public final int a(View view) {
        return lz.bA(view) + ((ma) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.lq
    public final int b(View view) {
        ma maVar = (ma) view.getLayoutParams();
        return lz.bi(view) + maVar.topMargin + maVar.bottomMargin;
    }

    @Override // defpackage.lq
    public final int c(View view) {
        ma maVar = (ma) view.getLayoutParams();
        return lz.bj(view) + maVar.leftMargin + maVar.rightMargin;
    }

    @Override // defpackage.lq
    public final int d(View view) {
        return lz.bD(view) - ((ma) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.lq
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.lq
    public final int f() {
        lz lzVar = this.a;
        return lzVar.D - lzVar.getPaddingBottom();
    }

    @Override // defpackage.lq
    public final int g() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.lq
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.lq
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.lq
    public final int j() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.lq
    public final int k() {
        lz lzVar = this.a;
        return (lzVar.D - lzVar.getPaddingTop()) - lzVar.getPaddingBottom();
    }

    @Override // defpackage.lq
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.lq
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.top;
    }

    @Override // defpackage.lq
    public final void n(int i) {
        this.a.aL(i);
    }
}
