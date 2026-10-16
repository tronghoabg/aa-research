package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
final class wpa extends Drawable.ConstantState {
    final /* synthetic */ wpb a;

    public wpa(wpb wpbVar) {
        this.a = wpbVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.a;
    }
}
