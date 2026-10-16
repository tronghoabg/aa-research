package com.waze.bx;

import android.content.Context;
import android.webkit.WebView;
import android.widget.Toast;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.an.a.a.p;
import com.waze.an.a.k;
import com.waze.an.a.u;
import com.waze.app_nav.hub.ah;
import com.waze.app_nav.w;
import com.waze.config.ConfigValues;
import com.waze.sound.em;
import com.waze.sound.en;
import com.waze.sound.kc;
import com.waze.ui.p.j;
import com.waze.web.r;
import com.waze.z.a.c.n;
import h.ab;
import h.g.b.x;
import h.n.o;
import j$.util.Map;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ah f18193a;

    /* renamed from: b, reason: collision with root package name */
    private final kc f18194b;

    /* renamed from: c, reason: collision with root package name */
    private final ConfigManager f18195c;

    /* renamed from: d, reason: collision with root package name */
    private final af f18196d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f18197e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f18198f;

    /* renamed from: g, reason: collision with root package name */
    private int f18199g;

    public i(ah ahVar, em emVar, kc kcVar, ConfigManager configManager, Context context) {
        x.f(ahVar, "hubManager");
        x.f(emVar, "soundConfig");
        x.f(kcVar, "voicesFileCacheProvider");
        x.f(configManager, "configManager");
        x.f(context, "context");
        this.f18193a = ahVar;
        this.f18194b = kcVar;
        this.f18195c = configManager;
        int i2 = av.f51370a;
        this.f18196d = aj.e(ac.f51860a.plus(aj.Q()).plus(new ae("TechCodeManager ")));
        this.f18197e = new WeakReference(context);
        this.f18198f = new LinkedHashMap();
        final int i3 = 1;
        d dVar = new d(configManager, 6, (float[]) null);
        final int i4 = 0;
        w("config", dVar);
        w("inspectwebview", new d((Object) this, 7, (byte[][]) null));
        w("insight", new d((Object) this, 8, (char[][]) null));
        w("insightreg", new d((Object) this, 9, (short[][]) null));
        w("insightregp", new d((Object) this, 10, (int[][]) null));
        w("insightregs", new d(this, 11, (boolean[][]) null));
        w("insightfte", new d(this, 12, (float[][]) null));
        w("nm_toggle_delay", new d(this, 13, (byte[][][]) null));
        final int i5 = 2;
        w("send_stat_bad_credential", new a(2));
        w("new_renderer", new d((Object) this, 1, (byte[]) null));
        w("map_stats", new d(this, 0));
        w("cctts", new d((Object) this, 2, (char[]) null));
        w("grpc_expire", new a(3));
        w("open_loc_fail", new d((Object) this, 3, (short[]) null));
        w("reset_ov_tooltip", new d((Object) this, 4, (int[]) null));
        w("goal_s", new h.g.a.a(this) { // from class: com.waze.bx.b

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f18177a;

            {
                this.f18177a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i6 = i3;
                if (i6 == 0) {
                    return i.d(this.f18177a);
                }
                i iVar = this.f18177a;
                return i6 != 1 ? i.e(iVar) : i.c(iVar);
            }
        });
        w("goal_ko", new h.g.a.a(this) { // from class: com.waze.bx.b

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f18177a;

            {
                this.f18177a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i6 = i4;
                if (i6 == 0) {
                    return i.d(this.f18177a);
                }
                i iVar = this.f18177a;
                return i6 != 1 ? i.e(iVar) : i.c(iVar);
            }
        });
        w("goal_ft", new h.g.a.a(this) { // from class: com.waze.bx.b

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f18177a;

            {
                this.f18177a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i6 = i5;
                if (i6 == 0) {
                    return i.d(this.f18177a);
                }
                i iVar = this.f18177a;
                return i6 != 1 ? i.e(iVar) : i.c(iVar);
            }
        });
        w("trustlesstoken", new d(this, 5, (boolean[]) null));
    }

    static final ab c(i iVar) {
        iVar.v(com.waze.cg.b.f.b());
        return ab.f48028a;
    }

    static final ab d(i iVar) {
        iVar.v(com.waze.cg.b.f.c());
        return ab.f48028a;
    }

    static final ab e(i iVar) {
        iVar.v(com.waze.cg.b.f.a());
        return ab.f48028a;
    }

    public static final /* synthetic */ void g(i iVar) {
        j.a().e(true);
        iVar.x("showing map stats");
    }

    public static final /* synthetic */ void h(i iVar) {
        com.waze.an.d.b bVar = (com.waze.an.d.b) r.n(com.waze.an.d.b.class);
        if (bVar != null) {
            k kVar = new k("Title", "description", Integer.valueOf(R.drawable.icon_report_police_mobile_camera), null, h.a.i.h());
            y();
            aj.z(iVar.f18196d, null, null, new g(bVar, kVar, (h.c.e) null, 1), 3);
        }
    }

    public static final /* synthetic */ void i(i iVar) {
        p pVar = (p) r.n(p.class);
        y();
        aj.z(iVar.f18196d, null, null, new h(pVar, (h.c.e) null, 1), 3);
    }

    public static final /* synthetic */ void j(i iVar) {
        com.waze.an.d.b bVar = (com.waze.an.d.b) r.n(com.waze.an.d.b.class);
        if (bVar != null) {
            u uVar = new u("techcode-test", com.waze.an.a.ae.f14546b);
            Integer numValueOf = Integer.valueOf(R.drawable.icon_report_police_mobile_camera);
            h.o.c cVar = h.o.a.f48264a;
            k kVar = new k("Title", "description", numValueOf, new com.waze.an.a.j(h.o.c.i(60, h.o.d.f48273d), new en(17), null), h.a.i.i(new com.waze.an.a.i("primary", new en(18), com.waze.an.a.c.f14570b, null, null), new com.waze.an.a.i("secondary", new en(19), com.waze.an.a.c.f14570b, null, null)));
            y();
            aj.z(iVar.f18196d, null, null, new f(bVar, uVar, kVar, (h.c.e) null, 1, (byte[]) null), 3);
        }
    }

    public static final /* synthetic */ void k(i iVar) {
        com.waze.an.d.b bVar = (com.waze.an.d.b) r.n(com.waze.an.d.b.class);
        if (bVar != null) {
            u uVar = new u("techcode-test-p", com.waze.an.a.ae.f14546b);
            Integer numValueOf = Integer.valueOf(R.drawable.icon_report_police_mobile_camera);
            en enVar = new en(14);
            com.waze.an.a.c cVar = com.waze.an.a.c.f14569a;
            h.o.c cVar2 = h.o.a.f48264a;
            k kVar = new k("Title", "description", numValueOf, null, h.a.i.i(new com.waze.an.a.i("primary", enVar, cVar, new com.waze.an.a.j(h.o.c.i(30, h.o.d.f48273d), new en(15), null), null), new com.waze.an.a.i("secondary", new en(16), com.waze.an.a.c.f14570b, null, null)));
            y();
            aj.z(iVar.f18196d, null, null, new f(bVar, uVar, kVar, null, 0), 3);
        }
    }

    public static final /* synthetic */ void l(i iVar) {
        com.waze.an.d.b bVar = (com.waze.an.d.b) r.n(com.waze.an.d.b.class);
        if (bVar != null) {
            u uVar = new u("techcode-test-s", com.waze.an.a.ae.f14546b);
            Integer numValueOf = Integer.valueOf(R.drawable.icon_report_police_mobile_camera);
            a aVar = new a(1);
            com.waze.an.a.c cVar = com.waze.an.a.c.f14570b;
            h.o.c cVar2 = h.o.a.f48264a;
            k kVar = new k("Title", "description", numValueOf, null, h.a.i.i(new com.waze.an.a.i("primary", new en(20), com.waze.an.a.c.f14569a, null, null), new com.waze.an.a.i("secondary", aVar, cVar, new com.waze.an.a.j(h.o.c.i(30, h.o.d.f48273d), new a(0), null), null)));
            y();
            aj.z(iVar.f18196d, null, null, new f(bVar, uVar, kVar, (h.c.e) null, 2, (char[]) null), 3);
        }
    }

    public static final /* synthetic */ void m(i iVar) {
        if (!ConfigValues.CONFIG_VALUE_GENERAL_IS_STAFF_USER.b().booleanValue()) {
            iVar.x("WebView debug is not supported on this build");
        } else {
            WebView.setWebContentsDebuggingEnabled(true);
            com.waze.shared_infra.i.h.a("WebView debuggable enabled, debug build=false, tech code=true");
        }
    }

    public static final /* synthetic */ void n(i iVar) {
        iVar.x("Toggling day-night mode in 10 seconds.");
        aj.z(iVar.f18196d, null, null, new h(iVar, (h.c.e) null, 0), 3);
    }

    public static final /* synthetic */ void p(i iVar) {
        ConfigManager configManager = iVar.f18195c;
        configManager.setConfigValueBool(ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_INTERACTED, false);
        configManager.setConfigValueLong(ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_TOOLTIP_TIMES_SHOWN, 0L);
    }

    public static final /* synthetic */ void s(i iVar) {
        com.waze.ads.a.h hVar = (com.waze.ads.a.h) r.n(com.waze.ads.a.h.class);
        if (hVar == null) {
            iVar.x("TrustlessTokenFetcher not found");
        } else {
            hVar.b(!hVar.c());
            iVar.x("Trustless token logging ".concat(true != hVar.c() ? "disabled" : "enabled"));
        }
    }

    private final void v(com.waze.cg.c.p pVar) {
        aj.z(this.f18196d, null, null, new g(this, pVar, (h.c.e) null, 0), 3);
    }

    private final void w(String str, h.g.a.a... aVarArr) {
        if (!o.ah(str, "##@")) {
            str = "##@".concat(str);
        }
        Map.EL.compute(this.f18198f, str, new com.waze.an.a.a.av(new n(aVarArr, 13), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str) {
        Context context = (Context) this.f18197e.get();
        if (context != null) {
            Toast.makeText(context, str, 1).show();
        }
    }

    private static final void y() {
        w wVar = (w) r.n(w.class);
        if (wVar != null) {
            wVar.d();
        }
    }

    public final boolean t(String str) {
        x.f(str, "searchQuery");
        Set set = (Set) this.f18198f.get(str);
        if (set == null) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((h.g.a.a) it.next()).invoke();
        }
        String str2 = "Tech code triggered:" + str;
        x.e(str2, "toString(...)");
        x(str2);
        return true;
    }
}
