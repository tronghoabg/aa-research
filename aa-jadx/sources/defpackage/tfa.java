package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class tfa extends android.widget.FrameLayout {
    final /* synthetic */ defpackage.tfc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfa(defpackage.tfc tfcVar, android.content.Context context) {
        super(context);
        this.a = tfcVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        defpackage.yqj yqjVar = (defpackage.yqj) defpackage.tfc.c.l().ai(9014);
        defpackage.tfc tfcVar = this.a;
        yqjVar.T("%s: onSizeChanged(w=%d, h=%d, oldw=%d, oldh=%d)", tfcVar, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
        tfcVar.f(i, i2);
    }
}
