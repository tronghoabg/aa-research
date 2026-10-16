package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes2.dex */
class ecz extends ebj {
    protected final Window a;
    private final kwp b;

    public ecz(Window window, kwp kwpVar) {
        this.a = window;
        this.b = kwpVar;
    }

    @Override // defpackage.ebj
    public final void f() {
        for (int i = 1; i <= 512; i += i) {
            if ((i & 519) != 0) {
                if (i == 1) {
                    q(4);
                } else if (i == 2) {
                    q(2);
                } else if (i == 8) {
                    this.b.k();
                }
            }
        }
    }

    protected final void q(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void r(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    protected final void s(int i) {
        this.a.clearFlags(i);
    }

    protected final void t() {
        this.a.addFlags(Integer.MIN_VALUE);
    }
}
