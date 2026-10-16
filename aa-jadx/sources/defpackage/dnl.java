package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dnl {
    public static final defpackage.dnl a = new defpackage.dnl();

    public final int a(android.view.Window window) {
        android.view.WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        android.graphics.Insets insets = currentWindowMetrics.getWindowInsets().getInsets(android.view.WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }
}
