package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wpx extends android.graphics.drawable.Drawable.ConstantState {
    final /* synthetic */ defpackage.wpy a;

    public wpx(defpackage.wpy wpyVar) {
        this.a = wpyVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return this.a;
    }
}
