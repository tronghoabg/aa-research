package com.waze.reports_v2.presentation.a;

import android.content.Context;
import com.waze.sound.fm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34740a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.aq f34741b;

    /* renamed from: c, reason: collision with root package name */
    private final fm f34742c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34743d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.opengl.j f34744e;

    public q(Context context, com.waze.reports_v2.b.aq aqVar, fm fmVar, com.waze.map.opengl.j jVar, com.waze.reports_v2.d.j jVar2) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(aqVar, "reportPointsProvider");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(jVar, "config");
        h.g.b.x.f(jVar2, "statsSender");
        this.f34740a = context;
        this.f34741b = aqVar;
        this.f34742c = fmVar;
        this.f34744e = jVar;
        this.f34743d = jVar2;
    }

    public static final /* synthetic */ m b(q qVar, com.waze.reports_v2.b.ap apVar, h.g.a.a aVar) {
        com.waze.map.opengl.j jVar = qVar.f34744e;
        com.waze.reports_v2.d.j jVar2 = qVar.f34743d;
        return new r(qVar.f34740a, apVar, qVar.f34742c, aVar, jVar, jVar2);
    }

    @Override // com.waze.reports_v2.presentation.a.l
    public final kotlinx.coroutines.b.k a(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onHidden");
        return new p(this.f34741b.a(), this, aVar);
    }
}
