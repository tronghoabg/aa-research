package com.waze.car_lib.k;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.push.c;
import h.a.i;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a implements c {
    @Override // com.waze.push.c
    public final NotificationCompat.Extender a(Context context, com.waze.push.b bVar) {
        x.f(context, "context");
        x.f(bVar, "data");
        return com.waze.i.a.e(bVar.b(), bVar.a(), null, Integer.valueOf(R.drawable.notification), i.h(), 4);
    }
}
