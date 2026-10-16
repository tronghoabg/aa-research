package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public abstract class iet extends iey implements ifd {
    private Animatable b;

    public iet(ImageView imageView) {
        super(imageView);
    }

    private final void o(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.b = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.b = animatable;
        animatable.start();
    }

    private final void p(Object obj) {
        i(obj);
        o(obj);
    }

    @Override // defpackage.iey, defpackage.ieo, defpackage.iev
    public final void a(Drawable drawable) {
        super.a(drawable);
        Animatable animatable = this.b;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        n(drawable);
    }

    @Override // defpackage.ieo, defpackage.iev
    public final void b(Drawable drawable) {
        p(null);
        n(drawable);
    }

    @Override // defpackage.iev
    public final void c(Object obj, ife ifeVar) {
        if (ifeVar == null || !ifeVar.a(obj, this)) {
            p(obj);
        } else {
            o(obj);
        }
    }

    @Override // defpackage.iey, defpackage.ieo, defpackage.iev
    public final void f(Drawable drawable) {
        p(null);
        n(drawable);
    }

    protected abstract void i(Object obj);

    @Override // defpackage.ieo, defpackage.idh
    public final void k() {
        Animatable animatable = this.b;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.ieo, defpackage.idh
    public final void l() {
        Animatable animatable = this.b;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.ifd
    public final Drawable m() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // defpackage.ifd
    public final void n(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
