package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qhv implements defpackage.qib {
    private final /* synthetic */ int a;
    private final android.view.View b;

    public qhv(android.view.View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.qib
    public final void a(int i) {
        if (this.a == 0) {
            ((android.widget.TextView) this.b).setTextColor(i);
        } else {
            ((android.widget.ImageView) this.b).setColorFilter(new android.graphics.PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
        }
    }
}
