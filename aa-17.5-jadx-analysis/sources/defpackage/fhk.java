package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
final class fhk extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public fhk(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        fhl fhlVar = new fhl(null);
        fhlVar.e = this.a.newDrawable();
        fhlVar.e.setCallback(fhlVar.d);
        return fhlVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        fhl fhlVar = new fhl(null);
        fhlVar.e = this.a.newDrawable(resources);
        fhlVar.e.setCallback(fhlVar.d);
        return fhlVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        fhl fhlVar = new fhl(null);
        fhlVar.e = this.a.newDrawable(resources, theme);
        fhlVar.e.setCallback(fhlVar.d);
        return fhlVar;
    }
}
