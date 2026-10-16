package com.waze.settings.tree.b;

import com.waze.R;
import com.waze.car_lib.o.k;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.ds;
import com.waze.settings.eb;
import com.waze.settings.tree.d.o;
import com.waze.settings.tree.p;
import com.waze.ui.ac.n;
import h.a.i;
import h.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37526a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37527b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f37528c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f37529d;

    public f() {
        this.f37529d = g.a(new com.waze.bx.a(4));
        this.f37528c = g.a(new com.waze.bx.a(5));
        this.f37527b = g.a(new com.waze.bx.a(6));
        this.f37526a = g.a(new com.waze.bx.a(7));
    }

    public static final /* synthetic */ SettingsNativeManager a(f fVar) {
        return (SettingsNativeManager) fVar.f37526a;
    }

    public static final /* synthetic */ a d(f fVar) {
        return (a) fVar.f37529d;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [com.waze.settings.tree.o, java.lang.Object] */
    public final com.waze.settings.tree.f c() {
        n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.NAVIGATION));
        e eVar = new e(this, 0);
        a aVar = (a) this.f37529d;
        int[] iArr = new int[1];
        c cVar = new c(this, iArr, com.waze.ui.ad.b.c(Integer.valueOf(R.string.GAS_TYPE_SETTINGS)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_gas)), i.d(new o("scrolling_gas_type", "SCROLLING_GAS_TYPE_SETTINGS", new d(this, iArr), aVar.b().c(), true)));
        cVar.A(new k(11));
        ?? r13 = this.f37527b;
        return new com.waze.settings.tree.e("quick_navigation", "QUICK_NAVIGATION_SETTINGS", nVarC, i.i(new o("vehicle_type", "VEHICLE_TYPE_SETTINGS", eVar, aVar.d(), false), cVar, new p("license_plate", "settings_main.driving_preferences.car_details.license_plate", r13, null, null, 56), new p("subscriptions", "settings_main.driving_preferences.subscriptions", r13, null, null, 56), new p("avoid_toll_roads", "settings_main.driving_preferences.navigation.navigation_preferences.avoid_toll_roads", r13, null, null, 56), new p("navigation", "settings_main.driving_preferences.navigation", r13, com.waze.ui.ad.b.c(Integer.valueOf(R.string.MORE_ROUTING_OPTIONS)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_more_options)), 32)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.f, java.lang.Object] */
    public final int e() {
        return ((Number) this.f37526a.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.f, java.lang.Object] */
    public final long f() {
        return ((h.o.a) this.f37528c.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.f, java.lang.Object] */
    public final long g() {
        return ((h.o.a) this.f37527b.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.f, java.lang.Object] */
    public final boolean h() {
        return ((Boolean) this.f37529d.getValue()).booleanValue();
    }

    public f(ds dsVar, SettingsNativeManager settingsNativeManager, com.waze.settings.tree.o oVar, eb ebVar) {
        x.f(dsVar, "settingsViewModel");
        x.f(settingsNativeManager, "settingsNativeManager");
        x.f(oVar, "referencedSettingProvider");
        x.f(ebVar, "settingsStatsSender");
        this.f37526a = settingsNativeManager;
        this.f37527b = oVar;
        this.f37528c = ebVar;
        this.f37529d = new a(dsVar);
    }
}
