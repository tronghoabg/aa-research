package defpackage;

import android.view.View;

/* loaded from: classes.dex */
final class lx implements nm {
    final /* synthetic */ lz a;
    private final /* synthetic */ int b;

    public lx(lz lzVar, int i) {
        this.b = i;
        this.a = lzVar;
    }

    @Override // defpackage.nm
    public final int a(View view) {
        int iBA;
        int i;
        if (this.b != 0) {
            ma maVar = (ma) view.getLayoutParams();
            iBA = lz.bC(view);
            i = maVar.rightMargin;
        } else {
            ma maVar2 = (ma) view.getLayoutParams();
            iBA = lz.bA(view);
            i = maVar2.bottomMargin;
        }
        return iBA + i;
    }

    @Override // defpackage.nm
    public final int b(View view) {
        int iBD;
        int i;
        if (this.b != 0) {
            ma maVar = (ma) view.getLayoutParams();
            iBD = lz.bB(view);
            i = maVar.leftMargin;
        } else {
            ma maVar2 = (ma) view.getLayoutParams();
            iBD = lz.bD(view);
            i = maVar2.topMargin;
        }
        return iBD - i;
    }

    @Override // defpackage.nm
    public final int c() {
        int i;
        int paddingBottom;
        int i2 = this.b;
        lz lzVar = this.a;
        if (i2 != 0) {
            i = lzVar.C;
            paddingBottom = lzVar.getPaddingRight();
        } else {
            i = lzVar.D;
            paddingBottom = lzVar.getPaddingBottom();
        }
        return i - paddingBottom;
    }

    @Override // defpackage.nm
    public final int d() {
        int i = this.b;
        lz lzVar = this.a;
        return i != 0 ? lzVar.getPaddingLeft() : lzVar.getPaddingTop();
    }

    @Override // defpackage.nm
    public final View e(int i) {
        int i2 = this.b;
        lz lzVar = this.a;
        return i2 != 0 ? lzVar.aD(i) : lzVar.aD(i);
    }
}
