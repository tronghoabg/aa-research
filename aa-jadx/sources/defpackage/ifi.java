package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ifi implements defpackage.ifm {
    private final boolean a;

    public ifi(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ifm
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, defpackage.ifl iflVar) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        android.graphics.drawable.Drawable drawableM = iflVar.m();
        if (drawableM == null) {
            drawableM = new android.graphics.drawable.ColorDrawable(0);
        }
        android.graphics.drawable.TransitionDrawable transitionDrawable = new android.graphics.drawable.TransitionDrawable(new android.graphics.drawable.Drawable[]{drawableM, drawable});
        transitionDrawable.setCrossFadeEnabled(this.a);
        transitionDrawable.startTransition(300);
        iflVar.n(transitionDrawable);
        return true;
    }
}
