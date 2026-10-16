package com.waze.car_lib.i.b.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.waze.R;
import com.waze.ad.a.j;
import com.waze.main_screen.g.h;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements c {
    @Override // com.waze.car_lib.i.b.a.c
    public final Bitmap a(Context context, String str, boolean z, int i2, int i3) throws Resources.NotFoundException {
        x.f(context, "context");
        x.f(str, "streetName");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.current_street_pill_aaos_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.current_street_pill_aaos_width);
        h hVar = new h(context);
        h hVar2 = hVar;
        j.d(hVar2, dimensionPixelSize2, dimensionPixelSize, 1073741824);
        hVar.bC(str, z);
        hVar.b(i3, i2);
        return j.a(hVar2, dimensionPixelSize2, dimensionPixelSize, Integer.MIN_VALUE);
    }
}
