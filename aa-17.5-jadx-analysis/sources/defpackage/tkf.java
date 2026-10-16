package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class tkf extends tjv {
    private final tke b;

    public tkf(tjy tjyVar, tke tkeVar) {
        super(tjyVar);
        this.b = tkeVar;
    }

    @Override // defpackage.tjv
    public final void e(Canvas canvas, Paint paint) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        float width2 = canvas.getWidth();
        float height2 = canvas.getHeight();
        float f = this.b.c;
        canvas.drawRoundRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, width2 * f, height2 * f, paint);
    }
}
