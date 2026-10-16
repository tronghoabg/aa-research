package defpackage;

import android.graphics.Canvas;

/* loaded from: classes3.dex */
public final class wwq extends wwr {
    @Override // defpackage.wue
    protected final void J(Canvas canvas) {
        if (this.a.w.isEmpty()) {
            super.J(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.a.w);
        super.J(canvas);
        canvas.restore();
    }
}
