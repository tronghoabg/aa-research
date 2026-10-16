package com.waze.ao.b;

import com.google.firebase.messaging.l;
import com.waze.an.e.m;
import com.waze.asks.at;
import com.waze.main_screen.t.aw;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final m f14903a;

    /* renamed from: b, reason: collision with root package name */
    private final af f14904b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f14905c;

    /* renamed from: d, reason: collision with root package name */
    private final m f14906d;

    /* renamed from: e, reason: collision with root package name */
    private final l f14907e;

    public f(m mVar, m mVar2, l lVar) {
        x.f(mVar, "insightFeedbackEndOfDriveController");
        x.f(mVar2, "wazeAsksStatSender");
        x.f(lVar, "onCloseListener");
        this.f14906d = mVar;
        this.f14903a = mVar2;
        this.f14907e = lVar;
        af afVarP = com.waze.ui.a.l.p(this, null);
        this.f14904b = afVarP;
        e eVar = new e(mVar.h());
        int i2 = bz.f51630a;
        bz bzVarB = by.b();
        at atVar = (at) mVar.h().d();
        this.f14905c = ai.V(eVar, afVarP, bzVarB, atVar != null ? com.waze.ab.a.l.f(atVar) : null);
    }

    private final void f() {
        this.f14906d.i();
        aw.x((aw) this.f14907e.f10212a);
    }

    public final ch a() {
        return this.f14905c;
    }

    public final void b() {
        at atVar = (at) this.f14906d.h().d();
        if (atVar != null) {
            this.f14903a.a(atVar, com.waze.an.e.l.f14874c);
        }
        f();
    }

    public final void c() {
        at atVar = (at) this.f14906d.h().d();
        if (atVar != null) {
            this.f14903a.a(atVar, com.waze.an.e.l.f14873b);
        }
        f();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f14904b, null);
    }

    public final void d() {
        at atVar = (at) this.f14906d.h().d();
        if (atVar != null) {
            this.f14903a.a(atVar, com.waze.an.e.l.f14872a);
        }
        f();
    }

    public final void e() {
        at atVar = (at) this.f14906d.h().d();
        if (atVar != null) {
            this.f14903a.b(atVar);
        }
    }
}
