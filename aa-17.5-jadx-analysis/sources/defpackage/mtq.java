package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class mtq extends View {
    private static final float[] a = {1.0f, 0.6f, BitmapDescriptorFactory.HUE_RED};
    private static final float[] b = {BitmapDescriptorFactory.HUE_RED, 0.7f, 1.0f};
    private final Rect c;
    private final Rect d;
    private final boolean e;
    private final List f;
    private final Paint g;
    private final int h;
    private int i;
    private int j;
    private float k;

    public mtq(Context context, Rect rect, Rect rect2, boolean z, List list) {
        super(context);
        this.c = rect;
        this.d = rect2;
        this.e = z;
        this.f = list;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.g = paint;
        this.h = context.getColor(R.color.irregular_activity_and_widget_scrim);
        this.j = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtq.a(int):void");
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int i = ((yls) this.f).c;
        int i2 = i - 3;
        int i3 = i - 2;
        int i4 = this.j;
        if (i < 4) {
            canvas.drawColor(dvd.e(this.h, afgi.k((i4 == i3 ? this.k : BitmapDescriptorFactory.HUE_RED) * 255.0f)));
        } else {
            if (i4 < i2) {
                return;
            }
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), this.g);
        }
    }
}
