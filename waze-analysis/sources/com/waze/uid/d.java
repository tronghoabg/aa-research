package com.waze.uid;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.ix;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.hub.c.e f44440a;

    /* renamed from: b, reason: collision with root package name */
    private final ConfigManager f44441b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.b.u f44442c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44443d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f44444e;

    /* renamed from: f, reason: collision with root package name */
    private final String f44445f;

    public d(com.waze.app_nav.hub.c.e eVar, ConfigManager configManager, com.waze.b.u uVar, com.waze.shared_infra.o.a aVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(eVar, "presenterProvider");
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(eVar2, "logger");
        this.f44440a = eVar;
        this.f44441b = configManager;
        this.f44442c = uVar;
        this.f44443d = aVar;
        this.f44444e = eVar2;
        String canonicalName = d.class.getCanonicalName();
        h.g.b.x.c(canonicalName);
        this.f44445f = canonicalName;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(com.waze.uid.d r25, com.waze.b.s r26, h.c.e r27) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.d.a(com.waze.uid.d, com.waze.b.s, h.c.e):java.lang.Object");
    }

    static final h.ab d(d dVar) {
        dVar.g(true, true);
        return h.ab.f48028a;
    }

    static final h.ab e(d dVar) {
        dVar.g(false, true);
        return h.ab.f48028a;
    }

    static final h.ab f(d dVar, com.waze.design_components.c.b bVar) {
        h.g.b.x.f(bVar, "it");
        dVar.g(false, false);
        return h.ab.f48028a;
    }

    private final void g(boolean z, boolean z2) {
        if (z2) {
            this.f44441b.setConfigValueString(ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING_SELECTION_STATUS, g.f44521a.a());
        }
        ix.l(z);
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        Object objD = kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.K(this.f44442c.a(), new ah(this, (h.c.e) null, 1)), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f44445f;
    }
}
