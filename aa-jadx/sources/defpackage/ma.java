package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ma implements defpackage.no {
    final /* synthetic */ defpackage.mc a;
    private final /* synthetic */ int b;

    public ma(defpackage.mc mcVar, int i) {
        this.b = i;
        this.a = mcVar;
    }

    @Override // defpackage.no
    public final int a(android.view.View view) {
        int iBA;
        int i;
        if (this.b != 0) {
            defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
            iBA = defpackage.mc.bC(view);
            i = mdVar.rightMargin;
        } else {
            defpackage.md mdVar2 = (defpackage.md) view.getLayoutParams();
            iBA = defpackage.mc.bA(view);
            i = mdVar2.bottomMargin;
        }
        return iBA + i;
    }

    @Override // defpackage.no
    public final int b(android.view.View view) {
        int iBD;
        int i;
        if (this.b != 0) {
            defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
            iBD = defpackage.mc.bB(view);
            i = mdVar.leftMargin;
        } else {
            defpackage.md mdVar2 = (defpackage.md) view.getLayoutParams();
            iBD = defpackage.mc.bD(view);
            i = mdVar2.topMargin;
        }
        return iBD - i;
    }

    @Override // defpackage.no
    public final int c() {
        int i;
        int paddingBottom;
        int i2 = this.b;
        defpackage.mc mcVar = this.a;
        if (i2 != 0) {
            i = mcVar.C;
            paddingBottom = mcVar.getPaddingRight();
        } else {
            i = mcVar.D;
            paddingBottom = mcVar.getPaddingBottom();
        }
        return i - paddingBottom;
    }

    @Override // defpackage.no
    public final int d() {
        int i = this.b;
        defpackage.mc mcVar = this.a;
        return i != 0 ? mcVar.getPaddingLeft() : mcVar.getPaddingTop();
    }

    @Override // defpackage.no
    public final android.view.View e(int i) {
        int i2 = this.b;
        defpackage.mc mcVar = this.a;
        return i2 != 0 ? mcVar.aD(i) : mcVar.aD(i);
    }
}
