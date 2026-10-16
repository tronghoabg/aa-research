package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class icd implements hwx {
    private final AnimatedImageDrawable a;

    public icd(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.hwx
    public final int a() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight() * ify.b(Bitmap.Config.ARGB_8888);
        return intrinsicWidth + intrinsicWidth;
    }

    @Override // defpackage.hwx
    public final Class b() {
        return Drawable.class;
    }

    @Override // defpackage.hwx
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.hwx
    public final void e() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}
