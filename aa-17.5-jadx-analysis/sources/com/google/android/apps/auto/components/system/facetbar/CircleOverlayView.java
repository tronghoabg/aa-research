package com.google.android.apps.auto.components.system.facetbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.afeu;
import defpackage.cjn;
import defpackage.krr;
import defpackage.krs;
import defpackage.krz;
import defpackage.ksa;
import defpackage.ksk;
import defpackage.leg;
import defpackage.leh;
import defpackage.olm;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/google/android/apps/auto/components/system/facetbar/CircleOverlayView;", "Lcom/google/android/apps/auto/components/coolwalk/button/CoolwalkButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "paint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "java.com.google.android.apps.auto.components.system.facetbar_facetbar"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CircleOverlayView extends CoolwalkButton {
    private final Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleOverlayView(Context context, AttributeSet attributeSet) {
        int iH;
        super(context, attributeSet);
        context.getClass();
        Paint paint = new Paint();
        leg legVar = leh.a;
        if (legVar.a().b()) {
            iH = krr.o.b(context, ksa.a.a().c());
        } else {
            ksk kskVar = krs.a;
            krz krzVarC = ksa.a.a().c();
            iH = cjn.h(cjn.i((olm.b(context) || !legVar.a().b()) ? kskVar.a(krzVarC.a.b()) : kskVar.b(krzVarC.a.b())));
        }
        paint.setColor(iH);
        paint.setStyle(Paint.Style.FILL);
        this.c = paint;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int width = getWidth();
        float f = width;
        int height = getHeight();
        float f2 = height;
        Paint paint = this.c;
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        double dMin = Math.min(width, height) / 2.0d;
        Path path = new Path();
        path.addCircle(f / 2.0f, f2 / 2.0f, (float) dMin, Path.Direction.CW);
        canvas.drawPath(path, paint);
        paint.setXfermode(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CircleOverlayView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ CircleOverlayView(Context context, AttributeSet attributeSet, int i, afeu afeuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
