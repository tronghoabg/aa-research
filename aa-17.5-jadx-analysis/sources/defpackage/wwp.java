package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class wwp extends wuc {
    public final RectF w;

    public wwp(wwp wwpVar) {
        super(wwpVar);
        this.w = wwpVar.w;
    }

    @Override // defpackage.wuc, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = wwr.b;
        wwq wwqVar = new wwq(this);
        wwqVar.invalidateSelf();
        return wwqVar;
    }

    public wwp(wuk wukVar, RectF rectF) {
        super(wukVar);
        this.w = rectF;
    }
}
