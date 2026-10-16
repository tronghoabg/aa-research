package com.google.android.material.textfield;

import android.graphics.Canvas;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends l {
    @Override // com.google.android.material.k.k
    protected final void q(Canvas canvas) {
        if (this.f6899c.w.isEmpty()) {
            super.q(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f6899c.w);
        super.q(canvas);
        canvas.restore();
    }
}
