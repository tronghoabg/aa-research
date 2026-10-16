package f8;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import c8.C1582f;
import c8.C1587k;

/* loaded from: classes4.dex */
public final class f extends C1582f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f35134q;

    public f(C1587k c1587k, RectF rectF) {
        super(c1587k);
        this.f35134q = rectF;
    }

    @Override // c8.C1582f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f35136x = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f35134q = fVar.f35134q;
    }
}
