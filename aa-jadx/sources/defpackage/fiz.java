package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fiz implements defpackage.fiw {
    public static final defpackage.fiz b = new defpackage.fiz();

    @Override // defpackage.fiw
    public final android.graphics.Rect a(android.app.Activity activity) {
        android.graphics.Rect bounds = ((android.view.WindowManager) activity.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
