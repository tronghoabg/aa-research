package f8;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c8.C1583g;

/* loaded from: classes4.dex */
public final class g extends C1583g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f35135y = 0;

    /* renamed from: x, reason: collision with root package name */
    public f f35136x;

    @Override // c8.C1583g
    public final void e(Canvas canvas) {
        if (this.f35136x.f35134q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f35136x.f35134q);
        } else {
            canvas.clipRect(this.f35136x.f35134q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f35136x = new f(this.f35136x);
        return this;
    }

    public final void n(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f35136x.f35134q;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
