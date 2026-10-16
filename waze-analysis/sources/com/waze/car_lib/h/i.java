package com.waze.car_lib.h;

import android.content.Context;
import android.location.Geocoder;
import androidx.core.content.ContextCompat;
import androidx.core.os.EnvironmentCompat;
import com.waze.install.n;
import com.waze.install.r;
import com.waze.install.s;
import com.waze.install.x;
import com.waze.location.y;
import h.g.b.ar;
import h.g.b.m;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19829a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19830b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.install.a f19831c;

    /* renamed from: d, reason: collision with root package name */
    private final x f19832d;

    /* renamed from: e, reason: collision with root package name */
    private final af f19833e;

    public i(Context context, com.waze.shared_infra.i.e eVar, y yVar, com.waze.install.a aVar, com.waze.sharedui.e.g gVar, x xVar, af afVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(yVar, "locationManager");
        h.g.b.x.f(aVar, "geoConfigController");
        h.g.b.x.f(gVar, "locationService");
        h.g.b.x.f(xVar, "installationRequirements");
        h.g.b.x.f(afVar, "scope");
        this.f19829a = context;
        this.f19830b = eVar;
        this.f19831c = aVar;
        this.f19832d = xVar;
        this.f19833e = afVar;
        new Geocoder(context);
    }

    public static final /* synthetic */ void a(i iVar) {
        com.waze.shared_infra.i.e eVar = iVar.f19830b;
        eVar.a("Location permission requested by InstallNativeManager");
        if (ContextCompat.checkSelfPermission(iVar.f19829a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            eVar.a("Location permission already granted, handling country select");
            iVar.d();
        } else {
            eVar.a("Location permission not granted, waiting for StartAppCoordinator process");
            x xVar = iVar.f19832d;
            int i2 = ar.f48106a;
            xVar.f(new m(s.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        String strA = n.a(this.f19829a);
        if (strA == null) {
            strA = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        this.f19830b.g("selected country code: ".concat(strA));
        this.f19831c.c(strA);
        int i2 = ar.f48106a;
        this.f19832d.f(new m(r.class));
    }

    public final void c() {
        ai.m(ai.K(this.f19832d.a(), new h(this, null)), this.f19833e);
    }
}
