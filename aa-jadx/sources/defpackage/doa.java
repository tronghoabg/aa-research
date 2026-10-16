package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class doa extends defpackage.dnz {
    @Override // defpackage.vz
    public final void j(android.view.View view, android.graphics.Rect rect) {
        java.lang.Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((android.view.WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
