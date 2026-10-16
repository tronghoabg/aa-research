package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fhq extends android.graphics.drawable.Drawable.ConstantState {
    private final android.graphics.drawable.Drawable.ConstantState a;

    public fhq(android.graphics.drawable.Drawable.ConstantState constantState) {
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
    public final android.graphics.drawable.Drawable newDrawable() {
        defpackage.fhr fhrVar = new defpackage.fhr(null);
        fhrVar.e = this.a.newDrawable();
        fhrVar.e.setCallback(fhrVar.d);
        return fhrVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        defpackage.fhr fhrVar = new defpackage.fhr(null);
        fhrVar.e = this.a.newDrawable(resources);
        fhrVar.e.setCallback(fhrVar.d);
        return fhrVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        defpackage.fhr fhrVar = new defpackage.fhr(null);
        fhrVar.e = this.a.newDrawable(resources, theme);
        fhrVar.e.setCallback(fhrVar.d);
        return fhrVar;
    }
}
