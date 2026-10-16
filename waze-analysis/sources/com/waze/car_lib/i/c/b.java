package com.waze.car_lib.i.c;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.waze.R;
import com.waze.car_lib.p.dh;
import com.waze.map.em;
import com.waze.map.en;
import com.waze.map.eo;
import com.waze.map.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.i.b.a.a f20086a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.i.b.a.c f20087b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.i.b.a.e f20088c;

    public b(com.waze.car_lib.i.b.a.a aVar, com.waze.car_lib.i.b.a.c cVar, com.waze.car_lib.i.b.a.e eVar, com.waze.car_lib.i.b.a.b bVar) {
        h.g.b.x.f(aVar, "averageSpeedCamBitmapGenerator");
        h.g.b.x.f(cVar, "streetBitmapGenerator");
        h.g.b.x.f(eVar, "trafficBitmapGenerator");
        h.g.b.x.f(bVar, "insightBitmapGenerator");
        this.f20086a = aVar;
        this.f20087b = cVar;
        this.f20088c = eVar;
    }

    @Override // com.waze.car_lib.i.c.a
    public final com.waze.map.canvas.m a(Context context, boolean z, dh dhVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(dhVar, "pill");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.uiMode = true != z ? 16 : 32;
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        if (dhVar instanceof d) {
            d dVar = (d) dhVar;
            com.waze.car_lib.i.b.a.c cVar = this.f20087b;
            h.g.b.x.c(contextCreateConfigurationContext);
            return new eo(cVar.a(contextCreateConfigurationContext, dVar.b(), dVar.c(), dVar.a().a(), dVar.a().b()));
        }
        if (dhVar instanceof f) {
            com.waze.car_lib.i.b.a.e eVar = this.f20088c;
            h.g.b.x.c(contextCreateConfigurationContext);
            return new ep(eVar.a(contextCreateConfigurationContext, ((f) dhVar).a()));
        }
        if (dhVar instanceof c) {
            com.waze.car_lib.i.b.a.a aVar = this.f20086a;
            h.g.b.x.c(contextCreateConfigurationContext);
            return new em(aVar.a(contextCreateConfigurationContext, ((c) dhVar).a()));
        }
        if (!(dhVar instanceof e)) {
            throw new h.i();
        }
        h.g.b.x.c(contextCreateConfigurationContext);
        e eVar2 = (e) dhVar;
        String strB = eVar2.b();
        Integer numA = eVar2.a();
        h.g.b.x.f(contextCreateConfigurationContext, "context");
        h.g.b.x.f(strB, "text");
        com.waze.main_screen.g.k kVar = new com.waze.main_screen.g.k(contextCreateConfigurationContext, strB, numA);
        kVar.measure(View.MeasureSpec.makeMeasureSpec(contextCreateConfigurationContext.getResources().getDimensionPixelSize(R.dimen.current_street_pill_aaos_width), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = kVar.getMeasuredWidth();
        int measuredHeight = kVar.getMeasuredHeight();
        kVar.layout(0, 0, measuredWidth, measuredHeight);
        Drawable background = kVar.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
        }
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(measuredHeight / 2.0f);
        }
        int i2 = (measuredWidth + 19) & (-4);
        int i3 = (measuredHeight + 19) & (-4);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        h.g.b.x.e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate((i2 - measuredWidth) / 2.0f, (i3 - measuredHeight) / 2.0f);
        kVar.draw(canvas);
        int[] iArr = new int[i2 * i3];
        bitmapCreateBitmap.getPixels(iArr, 0, i2, 0, 0, i2, i3);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        h.g.b.x.e(bitmapCreateBitmap2, "createBitmap(...)");
        bitmapCreateBitmap2.setPremultiplied(false);
        bitmapCreateBitmap2.setPixels(iArr, 0, i2, 0, 0, i2, i3);
        bitmapCreateBitmap.recycle();
        return eVar2.a() == null ? new eo(bitmapCreateBitmap2) : new en(bitmapCreateBitmap2);
    }
}
