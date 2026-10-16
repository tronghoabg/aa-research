package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fvt extends android.view.ViewOutlineProvider {
    final /* synthetic */ defpackage.fvu a;

    public fvt(defpackage.fvu fvuVar) {
        this.a = fvuVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        view.getClass();
        outline.getClass();
        int height = view.getHeight();
        defpackage.fvu fvuVar = this.a;
        if (fvuVar.e()) {
            height += fvuVar.a;
        }
        outline.setRoundRect(0, 0, view.getWidth(), height, fvuVar.a);
        outline.setAlpha(0.5f);
    }
}
