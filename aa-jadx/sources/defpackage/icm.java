package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icm implements defpackage.hxg {
    private final android.graphics.drawable.AnimatedImageDrawable a;

    public icm(android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.hxg
    public final int a() {
        android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable = this.a;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight() * defpackage.igg.b(android.graphics.Bitmap.Config.ARGB_8888);
        return intrinsicWidth + intrinsicWidth;
    }

    @Override // defpackage.hxg
    public final java.lang.Class b() {
        return android.graphics.drawable.Drawable.class;
    }

    @Override // defpackage.hxg
    public final /* synthetic */ java.lang.Object c() {
        return this.a;
    }

    @Override // defpackage.hxg
    public final void e() {
        android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable = this.a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}
