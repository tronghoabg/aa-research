package com.waze.bv;

import com.waze.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final c f17548a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.f.f f17549b;

    /* renamed from: c, reason: collision with root package name */
    private final ac f17550c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17551d;

    /* renamed from: e, reason: collision with root package name */
    private int f17552e;

    public q(c cVar, com.waze.sharedui.utils.o oVar, com.waze.map.f.f fVar, ac acVar) {
        h.g.b.x.f(cVar, "audioAlertPlayer");
        h.g.b.x.f(oVar, "configsFlow");
        h.g.b.x.f(fVar, "mapStatsSender");
        h.g.b.x.f(acVar, "backgroundStateProvider");
        this.f17548a = cVar;
        this.f17549b = fVar;
        this.f17550c = acVar;
        this.f17551d = true;
        this.f17552e = -1;
    }
}
