package defpackage;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class sdz extends BitmapDrawable {
    public sdz(Resources resources, int i) {
        super(resources, BitmapFactory.decodeResource(resources, i));
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (-(canvas.getHeight() / 2)) + (getIntrinsicHeight() / 2));
        super.draw(canvas);
        canvas.restore();
    }
}
