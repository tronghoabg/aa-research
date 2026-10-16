package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes2.dex */
final class fht extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public fht(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        fhu fhuVar = new fhu();
        fhuVar.e = (VectorDrawable) this.a.newDrawable();
        return fhuVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        fhu fhuVar = new fhu();
        fhuVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return fhuVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        fhu fhuVar = new fhu();
        fhuVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return fhuVar;
    }
}
