package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.auto.components.system.dashboard.media.switcher.PageIndicator;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class nbm extends Animatable2.AnimationCallback {
    final /* synthetic */ PageIndicator a;

    public nbm(PageIndicator pageIndicator) {
        this.a = pageIndicator;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        drawable.getClass();
        super.onAnimationEnd(drawable);
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(this);
        }
        PageIndicator pageIndicator = this.a;
        pageIndicator.f = false;
        ArrayList arrayList = pageIndicator.b;
        if (arrayList.size() != 0) {
            Object objRemove = arrayList.remove(0);
            objRemove.getClass();
            pageIndicator.c(((Number) objRemove).intValue());
        }
    }
}
