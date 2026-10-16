package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class seo extends android.text.method.LinkMovementMethod {
    final /* synthetic */ defpackage.sep a;

    public seo(defpackage.sep sepVar) {
        this.a = sepVar;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod
    protected final boolean handleMovementKey(android.widget.TextView textView, android.text.Spannable spannable, int i, int i2, android.view.KeyEvent keyEvent) {
        this.a.a();
        return super.handleMovementKey(textView, spannable, i, i2, keyEvent);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        this.a.a();
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
