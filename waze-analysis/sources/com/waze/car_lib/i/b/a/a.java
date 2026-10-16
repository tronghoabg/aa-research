package com.waze.car_lib.i.b.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.waze.R;
import com.waze.ad.a.j;
import com.waze.main_screen.g.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f19937a;

    public a(com.waze.shared_infra.o.a aVar) {
        x.f(aVar, "stringProvider");
        this.f19937a = aVar;
    }

    public final Bitmap a(Context context, com.waze.sharedui.utils.c cVar) throws Resources.NotFoundException {
        x.f(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.current_street_pill_aaos_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.current_street_pill_aaos_width);
        l lVar = new l(context, R.drawable.icon_report_cam_average_speed_vector, R.color.primary_variant);
        l lVar2 = lVar;
        j.d(lVar2, dimensionPixelSize2, dimensionPixelSize, 1073741824);
        if (cVar != null) {
            lVar.a(cVar.b(this.f19937a));
        } else {
            lVar.a(null);
        }
        return j.a(lVar2, dimensionPixelSize2, dimensionPixelSize, Integer.MIN_VALUE);
    }
}
