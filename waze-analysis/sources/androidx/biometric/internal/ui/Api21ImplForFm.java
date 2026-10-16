package androidx.biometric.internal.ui;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api21ImplForFm {
    public static final Api21ImplForFm INSTANCE = new Api21ImplForFm();

    private Api21ImplForFm() {
    }

    public final void startAnimation(Drawable drawable) {
        x.f(drawable, "icon");
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
    }
}
