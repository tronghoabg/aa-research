package com.waze.gw;

import android.content.Context;
import com.waze.bk.a.c;
import com.waze.car_lib.i.b.a.d;
import com.waze.map.eo;
import com.waze.map.isolated.WazeMapWidgetNativeRenderer;

/* compiled from: WazeSource */
/* loaded from: classes10.dex */
public final class AaStreetRendererBridge {
    public static boolean render(Context context, Object obj, String str) {
        try {
            ((WazeMapWidgetNativeRenderer) obj).g(new c(false, true, new eo(new d().a(context, str, false, -15108398, -1))));
            return true;
        } catch (Throwable th) {
            return false;
        }
    }
}
