package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
final class ich extends icf {
    static hwx g(Drawable drawable) {
        if (drawable != null) {
            return new ich(drawable);
        }
        return null;
    }

    @Override // defpackage.hwx
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.hwx
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.hwx
    public final void e() {
    }
}
