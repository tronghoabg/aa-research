package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.p;
import com.google.android.datatransport.runtime.scheduling.a.r;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f4338a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.e f4339b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.e f4340c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.e f4341d;

    /* renamed from: e, reason: collision with root package name */
    private final c.b.e f4342e;

    /* renamed from: f, reason: collision with root package name */
    private final c.b.e f4343f;

    /* renamed from: g, reason: collision with root package name */
    private final c.b.e f4344g;

    private l(c.b.e eVar, c.b.e eVar2, c.b.e eVar3, c.b.e eVar4, c.b.e eVar5, c.b.e eVar6, c.b.e eVar7) {
        this.f4338a = eVar;
        this.f4339b = eVar2;
        this.f4340c = eVar3;
        this.f4341d = eVar4;
        this.f4342e = eVar5;
        this.f4343f = eVar6;
        this.f4344g = eVar7;
    }

    public static l a(c.b.e eVar, c.b.e eVar2, c.b.e eVar3, c.b.e eVar4, c.b.e eVar5, c.b.e eVar6, c.b.e eVar7) {
        return new l(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    @Override // g.a.a, f.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.waze.map.g.g get() {
        return new com.waze.map.g.g((Context) this.f4338a.get(), (com.google.android.datatransport.runtime.backends.b) this.f4339b.get(), (r) this.f4340c.get(), ((com.google.android.datatransport.runtime.scheduling.d) this.f4341d).get(), (Executor) this.f4342e.get(), (r) this.f4343f.get(), p.c(), p.d(), (r) this.f4344g.get());
    }
}
