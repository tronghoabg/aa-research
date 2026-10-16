package com.waze.ab.a;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13736a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.j.a f13737b;

    /* renamed from: c, reason: collision with root package name */
    private final ae f13738c;

    /* renamed from: d, reason: collision with root package name */
    private final d f13739d;

    /* renamed from: e, reason: collision with root package name */
    private final b f13740e;

    public p(Context context, com.waze.shared_infra.j.a aVar, ae aeVar, d dVar, b bVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(aVar, "permissionChecker");
        h.g.b.x.f(aeVar, "repository");
        h.g.b.x.f(dVar, "imageUtils");
        h.g.b.x.f(bVar, "fileUtils");
        this.f13736a = context;
        this.f13737b = aVar;
        this.f13738c = aeVar;
        this.f13739d = dVar;
        this.f13740e = bVar;
    }

    public final ad a() {
        return new ad(this.f13736a, this.f13737b, this.f13738c, this.f13739d, this.f13740e);
    }
}
