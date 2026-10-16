package com.waze.location.a;

import com.waze.R;
import com.waze.sound.co;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.d.b f25198a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f25199b;

    /* renamed from: c, reason: collision with root package name */
    private final co f25200c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sound.d.a f25201d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f25202e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25203f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25204g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25205h;

    public g(com.waze.an.d.b bVar, com.waze.shared_infra.o.a aVar, co coVar, com.waze.sound.d.a aVar2, kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bVar, "notificationInsightsService");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(coVar, "promptPlayingUseCase");
        h.g.b.x.f(aVar2, "ttsPlayerUseCase");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "logger");
        this.f25198a = bVar;
        this.f25199b = aVar;
        this.f25200c = coVar;
        this.f25201d = aVar2;
        this.f25202e = afVar;
        this.f25203f = eVar;
        this.f25205h = "TTS_GPS_ISSUES_IN_AREA";
    }

    static final h.ab d(g gVar) {
        gVar.f25203f.a("GPS Issue insight shown");
        aj.z(gVar.f25202e, null, null, new f(gVar, null, 0), 3);
        return h.ab.f48028a;
    }

    static final h.ab e(g gVar) {
        gVar.f25203f.a("GPS Issue insight ended");
        return h.ab.f48028a;
    }

    static final h.ab f(g gVar) {
        gVar.f25203f.a("GPS Issue insight ignored");
        gVar.f25204g = false;
        return h.ab.f48028a;
    }

    @Override // com.waze.location.a.h
    public final void g(i iVar) {
        h.g.b.x.f(iVar, "issue");
        if (this.f25204g) {
            return;
        }
        final int i2 = 1;
        aj.z(this.f25202e, null, null, new f(this, null, 1, null), 3);
        this.f25204g = true;
        this.f25203f.a("presenting GPS Issue notification insight");
        final int i3 = 0;
        String strC = this.f25199b.c(R.string.GPS_ISSUES_IN_AREA, new Object[0]);
        h.o.c cVar = h.o.a.f48264a;
        final int i4 = 2;
        this.f25198a.b(new com.waze.an.a.u("gps_sensor_inconsistency", com.waze.an.a.ae.f14555k), new com.waze.an.a.k(strC, null, Integer.valueOf(R.drawable.icon_tier3_gps_issues_96px), new com.waze.an.a.j(h.o.c.i(30, h.o.d.f48273d), new com.waze.ab.z(7), null), h.a.i.h()), new h.g.a.a(this) { // from class: com.waze.location.a.e

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f25193a;

            {
                this.f25193a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i5 = i2;
                if (i5 == 0) {
                    return g.e(this.f25193a);
                }
                g gVar = this.f25193a;
                return i5 != 1 ? g.f(gVar) : g.d(gVar);
            }
        }, new h.g.a.a(this) { // from class: com.waze.location.a.e

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f25193a;

            {
                this.f25193a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i5 = i3;
                if (i5 == 0) {
                    return g.e(this.f25193a);
                }
                g gVar = this.f25193a;
                return i5 != 1 ? g.f(gVar) : g.d(gVar);
            }
        }, new h.g.a.a(this) { // from class: com.waze.location.a.e

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f25193a;

            {
                this.f25193a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i5 = i4;
                if (i5 == 0) {
                    return g.e(this.f25193a);
                }
                g gVar = this.f25193a;
                return i5 != 1 ? g.f(gVar) : g.d(gVar);
            }
        });
    }
}
