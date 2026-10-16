package com.waze.settings.e.c;

import com.waze.settings.dy;
import com.waze.settings.dz;
import com.waze.settings.eb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final eb f37157a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.g.b.a f37158b;

    public b(eb ebVar, com.waze.settings.g.b.a aVar) {
        x.f(ebVar, "settingsStatsSender");
        x.f(aVar, "licensePlateStatsSender");
        this.f37157a = ebVar;
        this.f37158b = aVar;
    }

    @Override // com.waze.settings.e.c.a
    public final void a() {
        d(dy.f37101d, "MORE_INFO");
    }

    @Override // com.waze.settings.e.c.a
    public final void b(String str, String str2) {
        x.f(str, "value");
        x.f(str2, "oldValue");
        this.f37158b.a(dz.E, str, str2);
    }

    @Override // com.waze.settings.e.c.a
    public final void c(String str, String str2) {
        x.f(str, "permitId");
        x.f(str2, "oldSelectedPermitId");
        this.f37157a.c(dz.E, dy.f37100c, null, str2, str, "PERMIT_ID");
    }

    @Override // com.waze.settings.e.c.a
    public final void d(dy dyVar, String str) {
        x.f(dyVar, "action");
        this.f37157a.c(dz.E, dyVar, str, null, null, null);
    }
}
