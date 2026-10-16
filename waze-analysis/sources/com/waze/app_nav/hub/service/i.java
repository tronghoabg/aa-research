package com.waze.app_nav.hub.service;

import android.content.Context;
import android.content.Intent;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements com.waze.app_nav.hub.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final a f15388a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.hub.k f15389b;

    /* renamed from: c, reason: collision with root package name */
    private final k f15390c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15391d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.app_nav.hub.i f15392e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f15393f;

    public i(a aVar, com.waze.app_nav.hub.k kVar, k kVar2, com.waze.shared_infra.i.e eVar) {
        x.f(aVar, "serviceEntry");
        x.f(kVar, "activityLauncher");
        x.f(kVar2, "serviceRegistry");
        x.f(eVar, "logger");
        this.f15388a = aVar;
        this.f15389b = kVar;
        this.f15390c = kVar2;
        this.f15391d = eVar;
        this.f15392e = new com.waze.app_nav.hub.i("ServiceHostActivity[" + aVar.e() + "]", new com.waze.app_nav.hub.e() { // from class: com.waze.app_nav.hub.service.e
            @Override // com.waze.app_nav.hub.e
            public final Intent a(Context context) {
                return i.d(this.f15380a, context);
            }
        }, aVar);
        this.f15393f = new h(kVar.b(), this);
    }

    static final Intent d(i iVar, Context context) {
        x.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) WazeServiceHostActivity.class);
        long jA = iVar.f15388a.b().a();
        x.f(intent, "<this>");
        x.e(intent.putExtra("ARG_SERVICE_ID", jA), "putExtra(...)");
        return intent;
    }

    @Override // com.waze.app_nav.hub.c.b
    public final kotlinx.coroutines.b.k a() {
        return this.f15393f;
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void b() {
        com.waze.app_nav.hub.i iVar = this.f15392e;
        Objects.toString(iVar);
        this.f15391d.e("stopping activity ".concat(String.valueOf(iVar)));
        this.f15389b.d(iVar.e());
        this.f15390c.c(this.f15388a.b().a());
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void c() {
        com.waze.app_nav.hub.i iVar = this.f15392e;
        Objects.toString(iVar);
        this.f15391d.e("starting activity ".concat(String.valueOf(iVar)));
        this.f15390c.b(this.f15388a);
        this.f15389b.c(iVar);
    }

    public final String toString() {
        return "WazeServicePresenter(" + this.f15388a.e() + ")";
    }
}
