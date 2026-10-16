package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fhp extends android.graphics.drawable.Drawable.ConstantState {
    int a;
    defpackage.fia b;
    public android.animation.AnimatorSet c;
    java.util.ArrayList d;
    defpackage.zd e;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
    }
}
