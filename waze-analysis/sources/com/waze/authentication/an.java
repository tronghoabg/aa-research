package com.waze.authentication;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class an implements al {

    /* renamed from: a, reason: collision with root package name */
    private final ai f15726a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15727b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f15728c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.l f15729d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f15730e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f15731f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f15732g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f15733h;

    public an(ai aiVar, Context context, h.g.a.l lVar, h.g.a.l lVar2) {
        h.g.b.x.f(aiVar, "settings");
        h.g.b.x.f(context, "context");
        h.g.b.x.f(lVar, "setPlatformStatus");
        h.g.b.x.f(lVar2, "createEncryptedSharedPreferences");
        this.f15726a = aiVar;
        this.f15727b = context;
        this.f15728c = lVar;
        this.f15729d = lVar2;
        this.f15730e = h.g.a(new am(this, 1));
        this.f15731f = h.g.a(new am(this, 0));
        this.f15732g = h.g.a(new am(this, 2));
        this.f15733h = h.g.a(new am(this, 3));
    }

    static final aj b(an anVar) {
        aj ajVarH = anVar.h();
        return ajVarH == null ? anVar.g() : ajVarH;
    }

    static final aj c(an anVar) {
        return h.g.b.x.n(anVar.f(), anVar.g()) ? anVar.h() : anVar.g();
    }

    static final ap d(an anVar) {
        ai aiVar = anVar.f15726a;
        return new ap(aiVar.a(), aiVar.b());
    }

    static final aw e(an anVar) {
        Object objA;
        try {
            h.g.a.l lVar = anVar.f15729d;
            Context context = anVar.f15727b;
            SharedPreferences sharedPreferences = (SharedPreferences) lVar.invoke(context);
            com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("PlatformCredentialsRepository");
            h.g.b.x.e(eVarD, "create(...)");
            objA = new aw(sharedPreferences, context, eVarD);
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (h.m.e(objA)) {
            anVar.f15728c.invoke(h.m.d(h.ab.f48028a));
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            anVar.f15728c.invoke(h.m.d(e.b.c.a(thC)));
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        return (aw) objA;
    }

    private final aj f() {
        return (aj) this.f15732g.getValue();
    }

    private final aj g() {
        return (aj) this.f15731f.getValue();
    }

    private final aj h() {
        return (aj) this.f15730e.getValue();
    }

    @Override // com.waze.authentication.al
    public final aj a(ak akVar) {
        h.g.b.x.f(akVar, "mode");
        ak akVar2 = ak.f15719a;
        int iOrdinal = akVar.ordinal();
        if (iOrdinal == 0) {
            return f();
        }
        if (iOrdinal == 1) {
            return (aj) this.f15733h.getValue();
        }
        if (iOrdinal == 2) {
            return g();
        }
        if (iOrdinal == 3) {
            return h();
        }
        throw new h.i();
    }
}
