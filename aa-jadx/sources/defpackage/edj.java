package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class edj extends defpackage.ebr {
    final android.view.WindowInsetsController a;
    protected final android.view.Window b;

    public edj(android.view.Window window) {
        android.view.WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        new defpackage.aba(0);
        this.a = windowInsetsController;
        this.b = window;
    }

    private final void j(boolean z, int i, int i2) {
        android.view.Window window = this.b;
        if (window == null) {
            android.view.WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
        } else {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (~i));
        }
    }

    @Override // defpackage.ebr
    public void d(boolean z) {
        j(z, 16, 16);
    }

    @Override // defpackage.ebr
    public void e(boolean z) {
        j(z, 8192, 8);
    }

    @Override // defpackage.ebr
    public boolean f() {
        android.view.Window window = this.b;
        if (window == null) {
            android.view.WindowInsetsController windowInsetsController = this.a;
            windowInsetsController.setSystemBarsAppearance(0, 0);
            if ((windowInsetsController.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ebr
    public final void g() {
        this.a.hide(519);
    }
}
