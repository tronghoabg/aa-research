package com.waze.ads.d;

import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import l.a.bps;
import l.a.yo;
import l.a.yp;
import l.a.yq;
import l.a.yr;
import l.a.ys;
import l.a.yt;
import l.a.yu;
import l.a.yv;
import l.a.yw;
import l.a.yx;
import l.a.zg;
import l.a.zh;
import l.a.zl;
import l.a.zm;
import l.a.zn;
import l.a.zo;
import l.a.zq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final ax f14019a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14020b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14021c;

    public j(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f14019a = axVar;
    }

    private static final zh f(com.waze.ads.a.f fVar) {
        zg zgVarNewBuilder = zh.newBuilder();
        zgVarNewBuilder.a(fVar.e());
        zgVarNewBuilder.c(fVar.k());
        zgVarNewBuilder.b(fVar.p());
        zh zhVarBuild = zgVarNewBuilder.build();
        x.e(zhVarBuild, "build(...)");
        return zhVarBuild;
    }

    private static final bps g(com.waze.ads.a.e eVar) {
        if (eVar != null) {
            e eVar2 = e.f14010a;
            c cVar = c.f13998a;
            d dVar = d.f14004a;
            int iOrdinal = eVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return bps.VENUE_OPEN_NOW;
                }
                if (iOrdinal == 2) {
                    return bps.VENUE_OPENING_SOON;
                }
                if (iOrdinal == 3) {
                    return bps.VENUE_CLOSED;
                }
                if (iOrdinal == 4) {
                    return bps.VENUE_CLOSES_SOON;
                }
                throw new h.i();
            }
        }
        return bps.VENUE_OPENING_STATUS_UNSPECIFIED;
    }

    @Override // com.waze.ads.d.i
    public final void a(com.waze.ads.a.f fVar, c cVar) {
        yo yoVar;
        x.f(fVar, "adData");
        x.f(cVar, "action");
        zh zhVarF = f(fVar);
        yp ypVarNewBuilder = yq.newBuilder();
        ypVarNewBuilder.b(zhVarF);
        x.e(ypVarNewBuilder, "setGoogleAdInformation(...)");
        ypVarNewBuilder.d(g(fVar.a()));
        Float fC = fVar.c();
        if (fC != null) {
            ypVarNewBuilder.e(fC.floatValue());
        }
        e eVar = e.f14010a;
        com.waze.ads.a.e eVar2 = com.waze.ads.a.e.f13915a;
        c cVar2 = c.f13998a;
        d dVar = d.f14004a;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            yoVar = yo.ACTION_UNSPECIFIED;
        } else if (iOrdinal == 1) {
            yoVar = yo.ADD_STOP;
        } else if (iOrdinal == 2) {
            yoVar = yo.INFO;
        } else if (iOrdinal == 3) {
            yoVar = yo.WHY_THIS_AD;
        } else {
            if (iOrdinal != 4) {
                throw new h.i();
            }
            yoVar = yo.NEW_DRIVE;
        }
        ypVarNewBuilder.a(yoVar);
        ypVarNewBuilder.c(this.f14021c);
        zo zoVarNewBuilder = zq.newBuilder();
        zoVarNewBuilder.a(ypVarNewBuilder.build());
        zq zqVarBuild = zoVarNewBuilder.build();
        x.e(zqVarBuild, "build(...)");
        o.p(this.f14019a, zqVarBuild);
    }

    @Override // com.waze.ads.d.i
    public final void b(com.waze.ads.a.f fVar, long j2) {
        x.f(fVar, "adData");
        zh zhVarF = f(fVar);
        yr yrVarNewBuilder = ys.newBuilder();
        yrVarNewBuilder.b(zhVarF);
        yrVarNewBuilder.a(h.o.a.n(j2));
        ys ysVarBuild = yrVarNewBuilder.build();
        x.e(ysVarBuild, "build(...)");
        zo zoVarNewBuilder = zq.newBuilder();
        zoVarNewBuilder.b(ysVarBuild);
        zq zqVarBuild = zoVarNewBuilder.build();
        x.e(zqVarBuild, "build(...)");
        o.p(this.f14019a, zqVarBuild);
    }

    @Override // com.waze.ads.d.i
    public final void c(com.waze.ads.a.f fVar, d dVar) {
        yu yuVar;
        x.f(fVar, "adData");
        x.f(dVar, "dismiss");
        zh zhVarF = f(fVar);
        yt ytVarNewBuilder = yv.newBuilder();
        ytVarNewBuilder.b(zhVarF);
        e eVar = e.f14010a;
        com.waze.ads.a.e eVar2 = com.waze.ads.a.e.f13915a;
        c cVar = c.f13998a;
        d dVar2 = d.f14004a;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            yuVar = yu.DISMISS_UNSPECIFIED;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            yuVar = yu.SWIPE_DOWN_OR_TAP_ON_MAP;
        } else if (iOrdinal == 3) {
            yuVar = yu.TAP_X_ICON;
        } else {
            if (iOrdinal != 4) {
                throw new h.i();
            }
            yuVar = yu.BACK_BUTTON;
        }
        ytVarNewBuilder.a(yuVar);
        yv yvVarBuild = ytVarNewBuilder.build();
        x.e(yvVarBuild, "build(...)");
        zo zoVarNewBuilder = zq.newBuilder();
        zoVarNewBuilder.c(yvVarBuild);
        zq zqVarBuild = zoVarNewBuilder.build();
        x.e(zqVarBuild, "build(...)");
        o.p(this.f14019a, zqVarBuild);
    }

    @Override // com.waze.ads.d.i
    public final void d(com.waze.ads.a.f fVar, boolean z) {
        x.f(fVar, "adData");
        this.f14021c = z;
        if (this.f14020b) {
            return;
        }
        zh zhVarF = f(fVar);
        yw ywVarNewBuilder = yx.newBuilder();
        ywVarNewBuilder.a(zhVarF);
        x.e(ywVarNewBuilder, "setGoogleAdInformation(...)");
        ywVarNewBuilder.c(g(fVar.a()));
        Float fC = fVar.c();
        if (fC != null) {
            ywVarNewBuilder.d(fC.floatValue());
        }
        ywVarNewBuilder.b(z);
        zo zoVarNewBuilder = zq.newBuilder();
        zoVarNewBuilder.d(ywVarNewBuilder.build());
        zq zqVarBuild = zoVarNewBuilder.build();
        x.e(zqVarBuild, "build(...)");
        o.p(this.f14019a, zqVarBuild);
        this.f14020b = true;
    }

    @Override // com.waze.ads.d.i
    public final void e(h hVar) {
        zm zmVar;
        x.f(hVar, "result");
        zl zlVarNewBuilder = zn.newBuilder();
        x.e(zlVarNewBuilder, "newBuilder(...)");
        if (hVar instanceof g) {
            zlVarNewBuilder.b(true);
        } else {
            if (!(hVar instanceof f)) {
                throw new h.i();
            }
            zlVarNewBuilder.b(false);
            e eVarA = ((f) hVar).a();
            e eVar = e.f14010a;
            com.waze.ads.a.e eVar2 = com.waze.ads.a.e.f13915a;
            c cVar = c.f13998a;
            d dVar = d.f14004a;
            int iOrdinal = eVarA.ordinal();
            if (iOrdinal == 0) {
                zmVar = zm.FAILURE_REASON_UNSPECIFIED;
            } else if (iOrdinal == 1) {
                zmVar = zm.DEVELOPER_ERROR;
            } else if (iOrdinal == 2) {
                zmVar = zm.GMS_UNAVAILABLE;
            } else if (iOrdinal == 3) {
                zmVar = zm.NETWORK_ERROR;
            } else if (iOrdinal == 4) {
                zmVar = zm.SERVICE_ERROR;
            } else {
                if (iOrdinal != 5) {
                    throw new h.i();
                }
                zmVar = zm.INTERNAL_ERROR;
            }
            zlVarNewBuilder.a(zmVar);
        }
        zo zoVarNewBuilder = zq.newBuilder();
        zoVarNewBuilder.e(zlVarNewBuilder.build());
        zq zqVarBuild = zoVarNewBuilder.build();
        x.e(zqVarBuild, "build(...)");
        o.p(this.f14019a, zqVarBuild);
    }
}
