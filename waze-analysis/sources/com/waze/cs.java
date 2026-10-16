package com.waze;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.waze.gas.GasNativeManager;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cs {
    public static final Intent a(Context context, String str, String str2, boolean z, long j2) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "url");
        Intent intentPutExtra = new Intent(context, (Class<?>) InternalWebBrowser.class).putExtra("webViewTitle", str).putExtra("webViewURL", str2).putExtra("webViewShowClose", z).putExtra("cb", j2);
        h.g.b.x.e(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public static final bg c(bf bfVar, h.g.a.q qVar) {
        h.g.b.x.f(bfVar, "<this>");
        h.g.b.x.f(qVar, "callback");
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        bh bhVar = new bh(qVar);
        bfVar.setUpdateHandler(DriveToNativeManager.UH_DANGER_ZONE_FOUND, bhVar);
        return new bg(bfVar, bhVar);
    }

    public static final kotlinx.coroutines.b.k d(ac acVar) {
        h.g.b.x.f(acVar, "<this>");
        return kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.q(acVar.b(), acVar.a(), new ad(null, 1, null)));
    }

    public static final kotlinx.coroutines.b.k e(ac acVar) {
        h.g.b.x.f(acVar, "<this>");
        return kotlinx.coroutines.b.ai.q(acVar.b(), acVar.a(), new ad(null, 0));
    }

    public static final boolean f(ac acVar) {
        h.g.b.x.f(acVar, "<this>");
        return ((Boolean) acVar.b().d()).booleanValue() && ((Boolean) acVar.a().d()).booleanValue();
    }

    public static final boolean g(cf cfVar) {
        h.g.b.x.f(cfVar, "<this>");
        boolean z = true;
        if (!(cfVar instanceof ak)) {
            if (cfVar instanceof am) {
                return true;
            }
            z = false;
            if (!h.g.b.x.n(cfVar, al.f14129a)) {
                if (h.g.b.x.n(cfVar, an.f14320a)) {
                    return false;
                }
                throw new h.i();
            }
        }
        return z;
    }
}
