package defpackage;

import android.view.WindowManager;

/* loaded from: classes2.dex */
final class dnn {
    public static final dnn a = new dnn();

    public final void a(WindowManager.LayoutParams layoutParams, int i) {
        if (i > 0) {
            layoutParams.flags |= 4;
        } else {
            layoutParams.flags &= -5;
        }
        layoutParams.setBlurBehindRadius(i);
    }
}
