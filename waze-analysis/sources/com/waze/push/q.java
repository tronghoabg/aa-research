package com.waze.push;

import android.content.Context;
import com.waze.NativeManager;
import com.waze.kw;
import com.waze.navigate.dg;
import com.waze.navigate.et;
import com.waze.t;
import com.waze.ui.z.as;
import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements h, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33448a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33449b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f33450c;

    public q(Context context) {
        x.f(context, "context");
        this.f33448a = context;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("QuestionTypePushMessageHandler");
        x.e(eVarD, "create(...)");
        this.f33449b = eVarD;
        this.f33450c = h.g.b(h.h.f48130a, new p(this));
    }

    @Override // com.waze.push.h
    public final String a() {
        return "QuestionTypePushMessageHandler";
    }

    @Override // com.waze.push.h
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        g gVar = (g) obj;
        x.f(gVar, "pushMessage");
        return gVar.B();
    }

    @Override // com.waze.push.h
    public final /* synthetic */ boolean c(Object obj) throws NumberFormatException {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        g gVar = (g) obj;
        x.f(gVar, "pushMessage");
        String strConcat = "Received question type push: ".concat(String.valueOf(gVar.e()));
        com.waze.shared_infra.i.e eVar = this.f33449b;
        eVar.a(strConcat);
        if (NativeManager.isAppStarted() && et.c((dg) this.f33450c.getValue())) {
            return false;
        }
        if (gVar.z()) {
            String str = gVar.t() + "|" + gVar.o() + "|" + gVar.k();
            if (gVar.q() != null) {
                str = str + "|" + gVar.q();
            }
            if (t.o()) {
                kw.f25072a.a().a(as.c(eVar, str));
                com.waze.shared_infra.i.h.j("Received push while running (ANALYTICS_EVENT_PUSH_MESSAGE_WHILE_RUNNING): ".concat(str));
                eVar.g("Received push while running (ANALYTICS_EVENT_PUSH_MESSAGE_WHILE_RUNNING): ".concat(str));
            } else {
                kw.f25072a.a().b(as.c(eVar, str));
                com.waze.shared_infra.i.h.j("Received push while offline (ANALYTICS_EVENT_OFFLINE_PUSH_RECEIVED): ".concat(str));
                eVar.g("Received push while offline running (ANALYTICS_EVENT_OFFLINE_PUSH_RECEIVED): ".concat(str));
            }
            if (gVar.C()) {
                Context context = this.f33448a;
                q qVar = this;
                if (qVar instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) qVar).l();
                    int i2 = ar.f48106a;
                    mVar = new h.g.b.m(c.class);
                } else {
                    bVarC = qVar.getKoin().a().c();
                    int i3 = ar.f48106a;
                    mVar = new h.g.b.m(c.class);
                }
                new j(context, gVar, null, (c) bVarC.a(mVar, null, null)).b();
            }
        }
        return !NativeManager.isAppStarted();
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
