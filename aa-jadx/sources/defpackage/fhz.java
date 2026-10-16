package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fhz extends android.graphics.drawable.Drawable.ConstantState {
    private final android.graphics.drawable.Drawable.ConstantState a;

    public fhz(android.graphics.drawable.Drawable.ConstantState constantState) {
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
    public final android.graphics.drawable.Drawable newDrawable() {
        defpackage.fia fiaVar = new defpackage.fia();
        fiaVar.e = (android.graphics.drawable.VectorDrawable) this.a.newDrawable();
        return fiaVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        defpackage.fia fiaVar = new defpackage.fia();
        fiaVar.e = (android.graphics.drawable.VectorDrawable) this.a.newDrawable(resources);
        return fiaVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        defpackage.fia fiaVar = new defpackage.fia();
        fiaVar.e = (android.graphics.drawable.VectorDrawable) this.a.newDrawable(resources, theme);
        return fiaVar;
    }
}
