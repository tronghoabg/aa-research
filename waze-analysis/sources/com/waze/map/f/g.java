package com.waze.map.f;

import android.util.Size;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import e.c.l;
import h.g.b.x;
import h.i;
import l.a.acu;
import l.a.acv;
import l.a.ahx;
import l.a.ahy;
import l.a.aiq;
import l.a.air;
import l.a.ais;
import l.a.ait;
import l.a.aiy;
import l.a.aiz;
import l.a.ajc;
import l.a.ajd;
import l.a.aje;
import l.a.ajf;
import l.a.aqm;
import l.a.aqn;
import l.a.aqo;
import l.a.aqp;
import l.a.bft;
import l.a.bfu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    private final ax f28908b;

    /* renamed from: c, reason: collision with root package name */
    private final a f28909c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28910d;

    public g(ax axVar, a aVar) {
        x.f(axVar, "wazeStatsReporter");
        x.f(aVar, "externalDependencies");
        this.f28908b = axVar;
        this.f28909c = aVar;
    }

    @Override // com.waze.map.f.f
    public final void a() {
        com.waze.cf.d.c cVarD = l.d(ajc.newBuilder());
        ahx ahxVarNewBuilder = ahy.newBuilder();
        x.f(ahxVarNewBuilder, "builder");
        ahy ahyVarBuild = ahxVarNewBuilder.build();
        x.e(ahyVarBuild, "build(...)");
        cVarD.s(ahyVarBuild);
        o.w(this.f28908b, cVarD.q());
    }

    @Override // com.waze.map.f.f
    public final void b(Size size) {
        x.f(size, "surfaceSize");
        com.waze.cf.d.c cVarD = l.d(ajc.newBuilder());
        acu acuVarNewBuilder = acv.newBuilder();
        x.f(acuVarNewBuilder, "builder");
        acuVarNewBuilder.a(size.getHeight());
        acuVarNewBuilder.b(size.getWidth());
        acv acvVarBuild = acuVarNewBuilder.build();
        x.e(acvVarBuild, "build(...)");
        cVarD.r(acvVarBuild);
        o.w(this.f28908b, cVarD.q());
    }

    @Override // com.waze.map.f.f
    public final void c() {
        if (this.f28910d) {
            return;
        }
        this.f28910d = true;
        a aVar = this.f28909c;
        aVar.b();
        ax axVar = this.f28908b;
        com.waze.cf.d.c cVarD = l.d(ajc.newBuilder());
        aiy aiyVarNewBuilder = aiz.newBuilder();
        x.f(aiyVarNewBuilder, "builder");
        aiyVarNewBuilder.a(aVar.a());
        aiz aizVarBuild = aiyVarNewBuilder.build();
        x.e(aizVarBuild, "build(...)");
        cVarD.v(aizVarBuild);
        o.w(axVar, cVarD.q());
    }

    @Override // com.waze.map.f.f
    public final void d(d dVar, c cVar) {
        aqm aqmVar;
        aqp aqpVar;
        x.f(dVar, "pinType");
        x.f(cVar, "action");
        com.waze.cf.d.c cVarD = l.d(ajc.newBuilder());
        aqn aqnVarNewBuilder = aqo.newBuilder();
        x.f(aqnVarNewBuilder, "builder");
        c cVar2 = c.f28882a;
        d dVar2 = d.f28891a;
        switch (cVar.ordinal()) {
            case 0:
                aqmVar = aqm.ACTION_UNSPECIFIED;
                break;
            case 1:
                aqmVar = aqm.CLOSE;
                break;
            case 2:
                aqmVar = aqm.PRIMARY;
                break;
            case 3:
                aqmVar = aqm.SECONDARY;
                break;
            case 4:
                aqmVar = aqm.INFO;
                break;
            case 5:
                aqmVar = aqm.NEXT;
                break;
            case 6:
                aqmVar = aqm.PHOTO;
                break;
            case 7:
                aqmVar = aqm.MORE;
                break;
            default:
                throw new i();
        }
        x.f(aqmVar, "value");
        aqnVarNewBuilder.a(aqmVar);
        switch (dVar.ordinal()) {
            case 0:
                aqpVar = aqp.PIN_TYPE_UNSPECIFIED;
                break;
            case 1:
                aqpVar = aqp.PIN_TYPE_CURRENT_LOCATION;
                break;
            case 2:
                aqpVar = aqp.PIN_TYPE_HOME;
                break;
            case 3:
                aqpVar = aqp.PIN_TYPE_WORK;
                break;
            case 4:
                aqpVar = aqp.PIN_TYPE_WAZER;
                break;
            case 5:
                aqpVar = aqp.PIN_TYPE_YOUR_PARKING;
                break;
            case 6:
                aqpVar = aqp.PIN_TYPE_PARKING;
                break;
            case 7:
                aqpVar = aqp.PIN_TYPE_VENUE;
                break;
            case 8:
                aqpVar = aqp.PIN_TYPE_DROPPED_PIN;
                break;
            case 9:
                aqpVar = aqp.PIN_TYPE_SEARCH_RESULT;
                break;
            case 10:
                aqpVar = aqp.PIN_TYPE_SHOW_ON_MAP;
                break;
            case 11:
                aqpVar = aqp.PIN_TYPE_SET_START_POINT;
                break;
            case 12:
                aqpVar = aqp.PIN_TYPE_ORIGINAL_DESTINATION;
                break;
            case 13:
                aqpVar = aqp.PIN_TYPE_OTHER;
                break;
            default:
                throw new i();
        }
        ax axVar = this.f28908b;
        x.f(aqpVar, "value");
        aqnVarNewBuilder.b(aqpVar);
        aqo aqoVarBuild = aqnVarNewBuilder.build();
        x.e(aqoVarBuild, "build(...)");
        cVarD.x(aqoVarBuild);
        o.w(axVar, cVarD.q());
    }

    @Override // com.waze.map.f.f
    public final void e() {
        com.waze.cf.d.c cVarD = l.d(ajc.newBuilder());
        aiq aiqVarNewBuilder = air.newBuilder();
        x.f(aiqVarNewBuilder, "builder");
        air airVarBuild = aiqVarNewBuilder.build();
        x.e(airVarBuild, "build(...)");
        cVarD.t(airVarBuild);
        o.w(this.f28908b, cVarD.q());
    }

    @Override // com.waze.map.f.f
    public final void f() {
        com.waze.cf.d.c cVarD = l.d(ajc.newBuilder());
        ais aisVarNewBuilder = ait.newBuilder();
        x.f(aisVarNewBuilder, "builder");
        ait aitVarBuild = aisVarNewBuilder.build();
        x.e(aitVarBuild, "build(...)");
        cVarD.u(aitVarBuild);
        o.w(this.f28908b, cVarD.q());
    }

    @Override // com.waze.map.f.f
    public final void g(boolean z) {
        com.waze.cf.d.c cVarD = l.d(ajc.newBuilder());
        bft bftVarNewBuilder = bfu.newBuilder();
        x.f(bftVarNewBuilder, "builder");
        bftVarNewBuilder.a(z);
        bfu bfuVarBuild = bftVarNewBuilder.build();
        x.e(bfuVarBuild, "build(...)");
        cVarD.y(bfuVarBuild);
        o.w(this.f28908b, cVarD.q());
    }

    @Override // com.waze.map.f.f
    public final void h(e eVar) {
        ajd ajdVar;
        x.f(eVar, "action");
        e eVar2 = e.f28903a;
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            ajdVar = ajd.BUTTON_EXPANDED;
        } else if (iOrdinal == 1) {
            ajdVar = ajd.ZOOM_IN;
        } else {
            if (iOrdinal != 2) {
                throw new i();
            }
            ajdVar = ajd.ZOOM_OUT;
        }
        ax axVar = this.f28908b;
        com.waze.cf.d.c cVarD = l.d(ajc.newBuilder());
        aje ajeVarNewBuilder = ajf.newBuilder();
        x.f(ajeVarNewBuilder, "builder");
        x.f(ajdVar, "value");
        ajeVarNewBuilder.a(ajdVar);
        ajf ajfVarBuild = ajeVarNewBuilder.build();
        x.e(ajfVarBuild, "build(...)");
        cVarD.w(ajfVarBuild);
        o.w(axVar, cVarD.q());
    }
}
