package P4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import u3.C4242d;

/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9106a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9107b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f9106a = i5;
        this.f9107b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f9106a) {
            case 1:
                return ((Drawable.ConstantState) this.f9107b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f9106a) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f9107b).getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f9106a) {
            case 0:
                return new c(this);
            default:
                C4242d c4242d = new C4242d(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f9107b).newDrawable();
                c4242d.f46586a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c4242d.f46583f);
                return c4242d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f9106a) {
            case 0:
                return new c(this);
            default:
                C4242d c4242d = new C4242d(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f9107b).newDrawable(resources);
                c4242d.f46586a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c4242d.f46583f);
                return c4242d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f9106a) {
            case 1:
                C4242d c4242d = new C4242d(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f9107b).newDrawable(resources, theme);
                c4242d.f46586a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c4242d.f46583f);
                return c4242d;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
