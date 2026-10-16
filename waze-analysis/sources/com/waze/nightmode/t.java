package com.waze.nightmode;

import android.content.Context;
import com.waze.ConfigManager;
import com.waze.ao;
import com.waze.config.ConfigValues;
import com.waze.config.dj;
import com.waze.network.f.ak;
import com.waze.ni;
import h.g.b.ar;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t implements org.a.d.a.a, j {

    /* renamed from: a, reason: collision with root package name */
    public static final t f32494a = new t();

    /* renamed from: b, reason: collision with root package name */
    private static final af f32495b = aj.f();

    /* renamed from: c, reason: collision with root package name */
    private static final h.f f32496c = h.g.a(new com.waze.native_managers.n(16));

    /* renamed from: d, reason: collision with root package name */
    private static final bn f32497d = ck.b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final long f32498e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f32499f;

    /* renamed from: g, reason: collision with root package name */
    private static final bn f32500g;

    /* renamed from: h, reason: collision with root package name */
    private static final ch f32501h;

    /* renamed from: i, reason: collision with root package name */
    private static final bn f32502i;

    /* renamed from: j, reason: collision with root package name */
    private static final h.f f32503j;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f32498e = 432000000L;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f32499f = 120000L;
        bn bnVarB = ck.b(false);
        f32500g = bnVarB;
        f32501h = ai.U(bnVarB);
        f32502i = ck.b(k.f32473a);
        f32503j = h.g.a(new m(0));
    }

    static final WazeDaylightTimeProvider b() {
        return new WazeDaylightTimeProvider(l());
    }

    static final void d(String str) {
        bn bnVar = f32502i;
        k kVar = k.f32473a;
        if (str == null) {
            str = "";
        }
        bnVar.e(ak.e(str));
    }

    public static final boolean f() {
        return !((Boolean) f32501h.d()).booleanValue();
    }

    static final boolean g(NightModeDaylightTime nightModeDaylightTime, NightModeDaylightTime nightModeDaylightTime2) {
        h.g.b.x.f(nightModeDaylightTime, "old");
        h.g.b.x.f(nightModeDaylightTime2, "new");
        long jAbs = Math.abs(nightModeDaylightTime.getSunriseMs() - nightModeDaylightTime2.getSunriseMs());
        long j2 = f32499f;
        return jAbs < j2 && Math.abs(nightModeDaylightTime.getSunsetMs() - nightModeDaylightTime2.getSunsetMs()) < j2;
    }

    public static final void j() {
        af afVar = f32495b;
        aj.z(afVar, null, null, new o(null), 3);
        l().g("listening to configuration updates");
        ConfigManager.getInstance().registerOnConfigSyncOrUpdated(ConfigValues.CONFIG_VALUE_DISPLAY_MAP_SUB_SKIN, null, new l());
        ai.m(ai.K(f32501h, new q(null, 1, null)), afVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WazeDaylightTimeProvider k() {
        return (WazeDaylightTimeProvider) f32503j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.shared_infra.i.e l() {
        Object value = f32496c.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return (com.waze.shared_infra.i.e) value;
    }

    @Override // com.waze.nightmode.j
    public final ch a() {
        return f32501h;
    }

    public final void e(Context context) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.k.b bVarC2;
        h.g.b.m mVar2;
        h.g.b.x.f(context, "context");
        i iVar = new i(l(), new com.waze.shared_infra.b.c("com.waze.display_settings", "daytime", context), f32498e);
        af afVar = f32495b;
        aj.z(afVar, null, null, new p(iVar, (h.c.e) null, 0), 3);
        ai.m(ai.K(ai.z(ai.X(k().b()), new u(1)), new s(iVar, null)), afVar);
        bn bnVar = f32502i;
        k kVar = k.f32473a;
        int i2 = dj.f22618a;
        dj djVarC = ni.c();
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_DISPLAY_MAP_SUB_SKIN;
        h.g.b.x.e(dVar, "CONFIG_VALUE_DISPLAY_MAP_SUB_SKIN");
        bnVar.e(ak.e(djVarC.b(dVar)));
        bn bnVar2 = bnVar;
        kotlinx.coroutines.b.k kVarY = ai.y(ai.q(k().b(), bnVar2, new r(null)));
        com.waze.shared_infra.i.e eVarL = l();
        int i3 = com.waze.sharedui.a.f.f38783a;
        bn bnVarB = com.waze.sharedui.a.f.b();
        int i4 = com.waze.sharedui.a.c.f38778a;
        bn bnVarB2 = com.waze.sharedui.a.c.b();
        bn bnVar3 = f32497d;
        t tVar = this;
        boolean z = tVar instanceof org.a.d.a.b;
        if (z) {
            bVarC = ((org.a.d.a.b) tVar).l();
            int i5 = ar.f48106a;
            mVar = new h.g.b.m(ao.class);
        } else {
            bVarC = tVar.getKoin().a().c();
            int i6 = ar.f48106a;
            mVar = new h.g.b.m(ao.class);
        }
        ao aoVar = (ao) bVarC.a(mVar, null, null);
        if (z) {
            bVarC2 = ((org.a.d.a.b) tVar).l();
            mVar2 = new h.g.b.m(b.class);
        } else {
            bVarC2 = tVar.getKoin().a().c();
            mVar2 = new h.g.b.m(b.class);
        }
        ai.m(ai.K(new ae(eVarL, aoVar, afVar, bnVarB, bnVarB2, bnVar3, kVarY, bnVar2, (b) bVarC2.a(mVar2, null, null)).a(), new q(null, 0)), afVar);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
