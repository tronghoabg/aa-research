package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dnv {
    public static final defpackage.dnv a = new defpackage.dnv();

    public final void a(android.view.WindowManager.LayoutParams layoutParams, int i) {
        if (i > 0) {
            layoutParams.flags |= 4;
        } else {
            layoutParams.flags &= -5;
        }
        layoutParams.setBlurBehindRadius(i);
    }
}
