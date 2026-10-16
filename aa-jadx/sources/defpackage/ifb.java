package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ifb extends defpackage.ifg implements defpackage.ifl {
    private android.graphics.drawable.Animatable b;

    public ifb(android.widget.ImageView imageView) {
        super(imageView);
    }

    private final void o(java.lang.Object obj) {
        if (!(obj instanceof android.graphics.drawable.Animatable)) {
            this.b = null;
            return;
        }
        android.graphics.drawable.Animatable animatable = (android.graphics.drawable.Animatable) obj;
        this.b = animatable;
        animatable.start();
    }

    private final void p(java.lang.Object obj) {
        i(obj);
        o(obj);
    }

    @Override // defpackage.ifg, defpackage.iew, defpackage.ifd
    public final void a(android.graphics.drawable.Drawable drawable) {
        super.a(drawable);
        android.graphics.drawable.Animatable animatable = this.b;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        n(drawable);
    }

    @Override // defpackage.iew, defpackage.ifd
    public final void b(android.graphics.drawable.Drawable drawable) {
        p(null);
        n(drawable);
    }

    @Override // defpackage.ifd
    public final void c(java.lang.Object obj, defpackage.ifm ifmVar) {
        if (ifmVar == null || !ifmVar.a(obj, this)) {
            p(obj);
        } else {
            o(obj);
        }
    }

    @Override // defpackage.ifg, defpackage.iew, defpackage.ifd
    public final void f(android.graphics.drawable.Drawable drawable) {
        p(null);
        n(drawable);
    }

    protected abstract void i(java.lang.Object obj);

    @Override // defpackage.iew, defpackage.idq
    public final void k() {
        android.graphics.drawable.Animatable animatable = this.b;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.iew, defpackage.idq
    public final void l() {
        android.graphics.drawable.Animatable animatable = this.b;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.ifl
    public final android.graphics.drawable.Drawable m() {
        return ((android.widget.ImageView) this.a).getDrawable();
    }

    @Override // defpackage.ifl
    public final void n(android.graphics.drawable.Drawable drawable) {
        ((android.widget.ImageView) this.a).setImageDrawable(drawable);
    }
}
