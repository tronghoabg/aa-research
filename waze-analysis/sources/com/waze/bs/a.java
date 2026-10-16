package com.waze.bs;

import android.content.Context;
import com.waze.MainActivity;
import com.waze.lm;
import com.waze.settings.SettingsMainActivity;
import com.waze.settings.de;
import e.a.cn;
import e.a.cp;
import e.a.cq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f17427a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile cq f17428b;

    private a() {
    }

    public static cq a() {
        cq cqVarA;
        cq cqVar = f17428b;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (a.class) {
            cqVarA = f17428b;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46546c);
                cnVarA.b(cq.e("com.waze.searchagent.SearchAgentServiceExternal", "chat"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(m.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(ab.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f17428b = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq b() {
        cq cqVarA;
        cq cqVar = f17427a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (a.class) {
            cqVarA = f17427a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46546c);
                cnVarA.b(cq.e("com.waze.searchagent.SearchAgentServiceExternal", "startChat"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(ad.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(af.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f17427a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static final com.waze.z.a.e.c c(com.waze.br.c.n nVar) {
        if (nVar == null || h.g.b.x.n(nVar, com.waze.br.c.i.f17396a) || h.g.b.x.n(nVar, com.waze.br.c.h.f17395a)) {
            return com.waze.z.a.e.c.f46025a;
        }
        if (h.g.b.x.n(nVar, com.waze.br.c.j.f17397a)) {
            return com.waze.z.a.e.c.f46026b;
        }
        if (nVar instanceof com.waze.br.c.k) {
            return com.waze.z.a.e.c.f46027c;
        }
        if (h.g.b.x.n(nVar, com.waze.br.c.m.f17400a)) {
            return com.waze.z.a.e.c.f46028d;
        }
        if (nVar instanceof com.waze.br.c.l) {
            return com.waze.z.a.e.c.f46029e;
        }
        if (nVar instanceof com.waze.br.c.f) {
            return com.waze.z.a.e.c.f46028d;
        }
        if (nVar instanceof com.waze.br.c.g) {
            return com.waze.z.a.e.c.f46030f;
        }
        throw new h.i();
    }

    public static String d(de deVar) {
        com.waze.settings.tree.g gVarB = deVar.b();
        if (gVarB != null) {
            return gVarB.r();
        }
        return null;
    }

    public static final void e(Context context, String str, String str2) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(str, "pageName");
        int i2 = SettingsMainActivity.f36691g;
        if (str2 == null) {
            str2 = "";
        }
        context.startActivity(com.waze.br.c.d.e(context, str, str2));
    }

    public static final void f(String str, String str2, boolean z) {
        com.waze.app_nav.a.e eVarO;
        com.waze.app_nav.a.k kVarA;
        h.g.b.x.f(str, "pageId");
        MainActivity mainActivityC = lm.d().c();
        if (mainActivityC == null || (eVarO = mainActivityC.O()) == null || (kVarA = eVarO.a()) == null) {
            return;
        }
        kVarA.d(str, str2, z);
    }

    public static final void g() {
        h.g.b.x.f("settings_main.notifications_and_reminders.reminders", "pageId");
        f("settings_main.notifications_and_reminders.reminders", null, true);
    }
}
