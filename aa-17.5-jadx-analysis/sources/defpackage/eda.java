package defpackage;

import android.view.Window;

/* loaded from: classes2.dex */
class eda extends ecz {
    public eda(Window window, kwp kwpVar) {
        super(window, kwpVar);
    }

    @Override // defpackage.ebj
    public final void d(boolean z) {
        if (!z) {
            r(8192);
            return;
        }
        s(67108864);
        t();
        q(8192);
    }

    @Override // defpackage.ebj
    public final boolean e() {
        return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
