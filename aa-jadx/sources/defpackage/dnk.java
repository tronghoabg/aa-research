package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dnk {
    public static final defpackage.dnk a = new defpackage.dnk();

    public final int a(android.view.Window window) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.heightPixels;
        android.graphics.Rect rect = new android.graphics.Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return i - (rect.top + (rect.bottom > i2 ? rect.bottom - i2 : 0));
    }
}
