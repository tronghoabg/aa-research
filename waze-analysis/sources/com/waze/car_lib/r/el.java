package com.waze.car_lib.r;

import android.net.Uri;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.car_lib.f.hm;
import com.waze.car_lib.f.hp;
import com.waze.car_lib.f.hq;
import com.waze.car_lib.f.hu;
import com.waze.car_lib.f.hv;
import com.waze.car_lib.f.hw;
import com.waze.car_lib.f.hx;
import com.waze.car_lib.f.ib;
import com.waze.config.ConfigValues;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.settings.SettingsNativeManager;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class el {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21539a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.c.n f21540b;

    /* renamed from: c, reason: collision with root package name */
    private final NativeManager f21541c;

    /* renamed from: d, reason: collision with root package name */
    private final hm f21542d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.r.b.b f21543e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.settings.tree.d.n f21544f;

    public el(com.waze.shared_infra.o.a aVar, com.waze.settings.ds dsVar, com.waze.car_lib.c.n nVar, com.waze.settings.eb ebVar, MyWazeNativeManager myWazeNativeManager, RealtimeNativeManager realtimeNativeManager, NativeManager nativeManager, SettingsNativeManager settingsNativeManager, com.waze.car_lib.c.a aVar2, com.waze.settings.tree.d.n nVar2, hm hmVar, com.waze.sharedui.b.d dVar, com.waze.ev.n nVar3, com.waze.google_assistant.c cVar, com.waze.settings.d.f fVar, com.waze.reports_v2.e eVar, boolean z, com.waze.car_lib.r.b.b bVar) {
        com.waze.car_lib.o.s sVar;
        com.waze.settings.tree.d.n nVarA;
        h.g.a.a aVarB;
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(nVar, "analyticsSender");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(myWazeNativeManager, "myWazeNativeManager");
        h.g.b.x.f(realtimeNativeManager, "realtimeNativeManager");
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(aVar2, "aaosAuditReporter");
        h.g.b.x.f(hmVar, "controller");
        h.g.b.x.f(dVar, "auditReporter");
        h.g.b.x.f(nVar3, "evRepository");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(fVar, "settingsGasTypeController");
        h.g.b.x.f(eVar, "conversationalModeProvider");
        h.g.b.x.f(bVar, "hncSettingsStateHolder");
        this.f21539a = aVar;
        this.f21540b = nVar;
        this.f21541c = nativeManager;
        this.f21542d = hmVar;
        this.f21543e = bVar;
        if (nVar2 == null) {
            sVar = null;
            nVarA = com.waze.car_lib.o.i.f20472a.a(aVar, dsVar, ebVar, dVar, aVar2, nVar3, new ej((Object) this, 1, (byte[]) null), new ej((Object) this, 4, (int[]) null), new ej(this, 5, (boolean[]) null), myWazeNativeManager, realtimeNativeManager, settingsNativeManager, new ej(this, 0), new ej((Object) this, 2, (char[]) null), new ej((Object) this, 3, (short[]) null), cVar, fVar, eVar, new ek((Object) this, 1, (byte[]) null), z, bVar);
        } else {
            sVar = null;
            nVarA = nVar2;
        }
        this.f21544f = nVarA;
        com.waze.car_lib.o.s sVar2 = nVar2 instanceof com.waze.car_lib.o.s ? (com.waze.car_lib.o.s) nVar2 : sVar;
        if (sVar2 == null || (aVarB = sVar2.b()) == null) {
            return;
        }
        aVarB.invoke();
    }

    public static final /* synthetic */ void b(el elVar, com.waze.car_lib.o.v vVar) {
        elVar.f21540b.a(vVar);
        h.g.b.x.f(vVar, "settingsCustomPage");
        elVar.f21542d.H(new hq(vVar));
    }

    public static final /* synthetic */ void c(el elVar) {
        elVar.f21541c.LogOutAccount();
        elVar.f21542d.i(ib.f19693a);
    }

    public static final /* synthetic */ void d(el elVar, com.waze.car_lib.o.x xVar) {
        elVar.f21540b.a(xVar);
        h.g.b.x.f(xVar, "settingMessage");
        elVar.f21542d.H(xVar.j() ? new hu(xVar) : new hv(xVar));
    }

    public static final /* synthetic */ void i(el elVar) {
        String strB = ConfigValues.CONFIG_VALUE_GDPR_PRIVACY_SETTINGS_LOCALIZED_PRIVACY_POLICY_URL_PS.b();
        h.g.b.x.e(strB, "getValue(...)");
        com.waze.shared_infra.o.a aVar = elVar.f21539a;
        String str = String.format(strB, Arrays.copyOf(new Object[]{aVar.a()}, 1));
        h.g.b.x.e(str, "format(...)");
        Uri uri = Uri.parse(str);
        h.g.b.x.e(uri, "parse(...)");
        elVar.p(new com.waze.car_lib.p.bh(uri, aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_TITLE, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_QR_TEXT, new Object[0])));
    }

    public static final /* synthetic */ void j(el elVar, h.g.a.l lVar) {
        h.g.b.x.f(lVar, "onPermissionResult");
        elVar.f21542d.H(new hx(lVar));
    }

    public static final /* synthetic */ void k(el elVar) {
        String strB = ConfigValues.CONFIG_VALUE_GDPR_PRIVACY_SETTINGS_LOCALIZED_TERMS_OF_USE_URL_PS.b();
        h.g.b.x.e(strB, "getValue(...)");
        com.waze.shared_infra.o.a aVar = elVar.f21539a;
        String str = String.format(strB, Arrays.copyOf(new Object[]{aVar.a()}, 1));
        h.g.b.x.e(str, "format(...)");
        Uri uri = Uri.parse(str);
        h.g.b.x.e(uri, "parse(...)");
        elVar.p(new com.waze.car_lib.p.bh(uri, aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_TITLE, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_QR_TEXT, new Object[0])));
    }

    public static final /* synthetic */ void l(el elVar, com.waze.settings.tree.d.d dVar) {
        elVar.f21540b.a(dVar);
        h.g.b.x.f(dVar, "settingChoice");
        elVar.f21542d.H(new hw(dVar));
    }

    public static final /* synthetic */ void m(el elVar, com.waze.settings.tree.d.n nVar) {
        elVar.f21540b.a(nVar);
        elVar.f21542d.h(nVar);
    }

    private final void p(com.waze.car_lib.p.bh bhVar) {
        h.g.b.x.f(bhVar, "uiState");
        this.f21542d.H(new hp(bhVar));
    }

    public final com.waze.settings.tree.d.n a() {
        return this.f21544f;
    }

    public final void n() {
        h.g.a.a aVarA;
        com.waze.settings.tree.d.n nVar = this.f21544f;
        com.waze.car_lib.o.s sVar = nVar instanceof com.waze.car_lib.o.s ? (com.waze.car_lib.o.s) nVar : null;
        if (sVar == null || (aVarA = sVar.a()) == null) {
            this.f21540b.d(nVar);
        } else {
            aVarA.invoke();
        }
    }

    public final co o() {
        return com.waze.car_lib.o.ae.m(this.f21544f, new ek(this, 0), new ek((Object) this, 2, (char[]) null), new ek((Object) this, 3, (short[]) null), new ek(this, 4, (int[]) null), new ek(this, 5, (boolean[]) null));
    }
}
