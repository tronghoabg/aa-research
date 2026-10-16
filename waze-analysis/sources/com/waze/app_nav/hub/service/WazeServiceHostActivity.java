package com.waze.app_nav.hub.service;

import android.os.Bundle;
import android.support.v4.app.ch;
import androidx.activity.EdgeToEdge;
import com.waze.R;
import com.waze.app_nav.hub.af;
import h.m;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeServiceHostActivity extends af {

    /* renamed from: f, reason: collision with root package name */
    private final h.f f15370f = h.g.a(new com.waze.ads.b(this, 9));

    public final long f() {
        return ((Number) this.f15370f.getValue()).longValue();
    }

    @Override // com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Object objA;
        super.onCreate(bundle);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        setContentView(R.layout.waze_service_host_activity);
        try {
            WazeServiceHostActivity wazeServiceHostActivity = this;
            a aVarA = k.f15395a.a().a(f());
            ch chVarU = bv().u();
            chVarU.G(R.id.fullContent, aVarA.c(), aVarA.a(), null);
            objA = Integer.valueOf(chVarU.a());
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = m.c(objA);
        if (thC != null) {
            com.waze.shared_infra.i.h.c("failed to start service, serviceId=" + f() + ", error=" + thC.getMessage());
            finish();
        }
    }
}
