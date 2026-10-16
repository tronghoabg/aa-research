package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dnp {
    public static final defpackage.dnp a = new defpackage.dnp();

    public final void a(android.view.Window window, int i) {
        if (i <= 0) {
            window.clearFlags(4);
            return;
        }
        window.addFlags(4);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.setBlurBehindRadius(i);
        window.setAttributes(attributes);
    }
}
