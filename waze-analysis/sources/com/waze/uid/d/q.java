package com.waze.uid.d;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final p f44463a = new p();

    /* renamed from: b, reason: collision with root package name */
    public final c f44464b;

    /* renamed from: c, reason: collision with root package name */
    public final j f44465c;

    /* renamed from: d, reason: collision with root package name */
    public final s f44466d;

    /* renamed from: e, reason: collision with root package name */
    public final i f44467e;

    /* renamed from: f, reason: collision with root package name */
    public final com.waze.bf.a f44468f;

    /* renamed from: g, reason: collision with root package name */
    public final com.waze.shared_infra.d.a f44469g;

    /* renamed from: h, reason: collision with root package name */
    public final com.waze.r.a f44470h;

    /* renamed from: i, reason: collision with root package name */
    public final h f44471i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.uid.stats.s f44472j;

    /* renamed from: k, reason: collision with root package name */
    private final af f44473k;

    /* renamed from: l, reason: collision with root package name */
    private final o f44474l;

    public q(c cVar, j jVar, s sVar, i iVar, com.waze.bf.a aVar, com.waze.shared_infra.d.a aVar2, com.waze.r.a aVar3, h hVar, com.waze.uid.stats.s sVar2, af afVar, o oVar) {
        x.f(cVar, NotificationCompat.CATEGORY_EMAIL);
        x.f(jVar, "persistence");
        x.f(sVar, "webViewFactory");
        x.f(iVar, "installServices");
        x.f(aVar, "privacyConsentManager");
        x.f(aVar2, "runtimeConstants");
        x.f(aVar3, "nd4CConsentRepository");
        x.f(hVar, "homeAndWorkService");
        x.f(sVar2, "statsSender");
        x.f(afVar, "coroutineScope");
        x.f(oVar, "config");
        this.f44464b = cVar;
        this.f44465c = jVar;
        this.f44466d = sVar;
        this.f44467e = iVar;
        this.f44468f = aVar;
        this.f44469g = aVar2;
        this.f44470h = aVar3;
        this.f44471i = hVar;
        this.f44472j = sVar2;
        this.f44473k = afVar;
        this.f44474l = oVar;
    }

    public static final q b() {
        return f44463a.a();
    }

    public final o a() {
        return this.f44474l;
    }

    public final com.waze.uid.stats.s c() {
        return this.f44472j;
    }

    public final af d() {
        return this.f44473k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return x.n(this.f44464b, qVar.f44464b) && x.n(this.f44465c, qVar.f44465c) && x.n(this.f44466d, qVar.f44466d) && x.n(this.f44467e, qVar.f44467e) && x.n(this.f44468f, qVar.f44468f) && x.n(this.f44469g, qVar.f44469g) && x.n(this.f44470h, qVar.f44470h) && x.n(this.f44471i, qVar.f44471i) && x.n(this.f44472j, qVar.f44472j) && x.n(this.f44473k, qVar.f44473k) && x.n(this.f44474l, qVar.f44474l);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.f44464b.hashCode() * 31) + this.f44465c.hashCode()) * 31) + this.f44466d.hashCode()) * 31) + this.f44467e.hashCode()) * 31) + this.f44468f.hashCode()) * 31) + this.f44469g.hashCode()) * 31) + this.f44470h.hashCode()) * 31) + this.f44471i.hashCode()) * 31) + this.f44472j.hashCode()) * 31) + this.f44473k.hashCode()) * 31) + this.f44474l.hashCode();
    }

    public final String toString() {
        return "UidServices(email=" + this.f44464b + ", persistence=" + this.f44465c + ", webViewFactory=" + this.f44466d + ", installServices=" + this.f44467e + ", privacyConsentManager=" + this.f44468f + ", runtimeConstants=" + this.f44469g + ", nd4CConsentRepository=" + this.f44470h + ", homeAndWorkService=" + this.f44471i + ", statsSender=" + this.f44472j + ", coroutineScope=" + this.f44473k + ", config=" + this.f44474l + ")";
    }
}
