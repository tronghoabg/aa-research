package u3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4240b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q7.a f46573a;

    public C4240b(Q7.a aVar) {
        this.f46573a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f46573a.f9886b.f9901o;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Q7.c cVar = this.f46573a.f9886b;
        ColorStateList colorStateList = cVar.f9901o;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.f9905s, colorStateList.getDefaultColor()));
        }
    }
}
