package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
class fgx extends fgw {
    private static boolean a = true;

    @Override // defpackage.fgv
    public void c(View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
