package defpackage;

import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes2.dex */
final class dnh {
    public static final dnh a = new dnh();

    public final void a(Window window, int i) {
        if (i <= 0) {
            window.clearFlags(4);
            return;
        }
        window.addFlags(4);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.setBlurBehindRadius(i);
        window.setAttributes(attributes);
    }
}
