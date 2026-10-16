package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* loaded from: classes2.dex */
public final class ifa implements ife {
    private final boolean a;

    public ifa(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ife
    public final /* bridge */ /* synthetic */ boolean a(Object obj, ifd ifdVar) {
        Drawable drawable = (Drawable) obj;
        Drawable drawableM = ifdVar.m();
        if (drawableM == null) {
            drawableM = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableM, drawable});
        transitionDrawable.setCrossFadeEnabled(this.a);
        transitionDrawable.startTransition(300);
        ifdVar.n(transitionDrawable);
        return true;
    }
}
