package com.waze.sharedui.profile;

import com.waze.shared_infra.coordinators.g;
import com.waze.shared_infra.i.e;
import com.waze.sharedui.views.an;
import h.g.a.l;
import h.g.b.x;
import i.b.l.jc;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f39071a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39072b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f39073c;

    public b() {
        e eVarD = com.waze.shared_infra.i.a.d("MyProfileManager");
        this.f39072b = ck.b(a.f39070a);
        this.f39073c = eVarD;
    }

    public static synchronized b a() {
        b bVar;
        bVar = f39071a;
        if (bVar == null) {
            bVar = new b();
            f39071a = bVar;
        }
        return bVar;
    }

    public static UserProfile c() {
        return a().b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final UserProfile b() {
        return (UserProfile) this.f39072b.d();
    }

    public final Long d() {
        return Long.valueOf(b().getUserId());
    }

    public final String e() {
        return b().getBasicInfo().getEmail();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch f() {
        return this.f39072b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final void g() {
        this.f39073c.a("resetting profile");
        h(a.f39070a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void h(UserProfile userProfile) {
        this.f39072b.e(userProfile);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final void i(jc jcVar) {
        this.f39073c.a("updating profile");
        UserProfile userProfile = a.f39070a;
        x.f(jcVar, "<this>");
        h(a.a(jcVar, UserProfileSource.SERVER));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.sharedui.views.an, java.lang.Object] */
    public final an j() {
        return this.f39073c;
    }

    public final String k() {
        return (String) this.f39072b;
    }

    public final String l() {
        return (String) this.f39072b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final l m() {
        return this.f39073c;
    }

    public final String n() {
        return (String) this.f39073c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.shared_infra.coordinators.g, java.lang.Object] */
    public final void o() {
        this.f39072b.a((String) this.f39073c);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.shared_infra.coordinators.g, java.lang.Object] */
    public final void p() {
        this.f39072b.c((String) this.f39073c);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.shared_infra.coordinators.g, java.lang.Object] */
    public final boolean q() {
        return this.f39072b.d((String) this.f39073c);
    }

    public b(String str, an anVar) {
        x.f(str, "url");
        x.f(anVar, "onClick");
        this.f39072b = str;
        this.f39073c = anVar;
    }

    public b(String str, l lVar) {
        x.f(str, "responseElementName");
        x.f(lVar, "getter");
        this.f39072b = str;
        this.f39073c = lVar;
    }

    public b(g gVar, String str) {
        x.f(gVar, "presentableManager");
        x.f(str, "presentableUuid");
        this.f39072b = gVar;
        this.f39073c = str;
    }
}
