package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* loaded from: classes3.dex */
public final class tka extends tkb {
    private final int b;

    public tka(Context context, tjy tjyVar, int i, int i2) {
        super(context, tjyVar, Integer.valueOf(i));
        this.b = i2;
    }

    @Override // defpackage.tkb
    protected final Drawable e(Drawable drawable) {
        int i = this.b;
        return new InsetDrawable(drawable, i, i, i, i);
    }
}
