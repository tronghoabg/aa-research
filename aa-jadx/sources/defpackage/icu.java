package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class icu extends android.graphics.drawable.Drawable.ConstantState {
    final defpackage.ida a;

    public icu(defpackage.ida idaVar) {
        this.a = idaVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return new defpackage.icv(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return new defpackage.icv(this);
    }
}
