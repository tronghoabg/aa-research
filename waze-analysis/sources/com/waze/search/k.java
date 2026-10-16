package com.waze.search;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements com.waze.app_nav.c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f35975a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final org.a.d.g.a f35976b = com.waze.web.r.p(new d());

    public static /* synthetic */ String c() {
        String strA = ConfigValues.CONFIG_VALUE_START_STATE_ADS_POLICY_URL.b();
        h.g.b.x.e(strA, "getValue(...)");
        return strA;
    }

    @Override // com.waze.app_nav.c.a
    public final /* synthetic */ com.waze.app_nav.l a() {
        return new e();
    }

    @Override // com.waze.app_nav.c.a
    public final org.a.d.g.a b() {
        return f35976b;
    }
}
