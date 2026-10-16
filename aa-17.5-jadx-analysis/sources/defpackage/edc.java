package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class edc extends ebj {
    final WindowInsetsController a;
    protected final Window b;

    public edc(Window window) {
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        new aat(0);
        this.a = windowInsetsController;
        this.b = window;
    }

    private final void q(boolean z, int i, int i2) {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (~i));
        }
    }

    @Override // defpackage.ebj
    public void c(boolean z) {
        q(z, 16, 16);
    }

    @Override // defpackage.ebj
    public void d(boolean z) {
        q(z, 8192, 8);
    }

    @Override // defpackage.ebj
    public boolean e() {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            windowInsetsController.setSystemBarsAppearance(0, 0);
            if ((windowInsetsController.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ebj
    public final void f() {
        this.a.hide(519);
    }
}
