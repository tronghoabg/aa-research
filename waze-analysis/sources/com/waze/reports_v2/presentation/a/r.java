package com.waze.reports_v2.presentation.a;

import android.content.Context;
import android.text.TextUtils;
import com.waze.config.ConfigValues;
import com.waze.sound.fm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34745a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.ap f34746b;

    /* renamed from: c, reason: collision with root package name */
    private final fm f34747c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f34748d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34749e;

    public r(Context context, com.waze.reports_v2.b.ap apVar, fm fmVar, h.g.a.a aVar, com.waze.map.opengl.j jVar, com.waze.reports_v2.d.j jVar2) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(apVar, "reportFeedback");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(aVar, "onReportPointsHidden");
        h.g.b.x.f(jVar, "config");
        h.g.b.x.f(jVar2, "statsSender");
        this.f34745a = context;
        this.f34746b = apVar;
        this.f34747c = fmVar;
        this.f34748d = aVar;
        this.f34749e = jVar2;
    }

    @Override // com.waze.reports_v2.presentation.a.m
    public final com.waze.reports_v2.b.ap a() {
        return this.f34746b;
    }

    @Override // com.waze.reports_v2.presentation.a.m
    public final void b() {
        this.f34748d.invoke();
    }

    @Override // com.waze.reports_v2.presentation.a.m
    public final void c() {
        com.waze.reports_v2.d.j jVar = this.f34749e;
        com.waze.reports_v2.b.ap apVar = this.f34746b;
        jVar.w(apVar.b());
        String strB = ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE.b();
        h.g.b.x.e(strB, "getValue(...)");
        if (TextUtils.equals(strB, "yes")) {
            com.waze.sharedui.e.e.i(this.f34747c, com.waze.resources.h.e(this.f34745a, "points_animation"), null, false, false, null, 30);
            jVar.x(apVar.b());
        }
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
