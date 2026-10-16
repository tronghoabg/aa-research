package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class icf implements hwx, hwu {
    protected final Drawable a;

    public icf(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.hwu
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof icm) {
            ((icm) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.hwx
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
