package com.waze.network.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk implements bj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32023a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.s f32024b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.network.e.d f32025c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32026d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32027e;

    /* renamed from: f, reason: collision with root package name */
    private final u f32028f;

    /* renamed from: g, reason: collision with root package name */
    private final List f32029g;

    /* renamed from: h, reason: collision with root package name */
    private Long f32030h;

    /* renamed from: i, reason: collision with root package name */
    private Long f32031i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f32032j;

    public bk(com.waze.shared_infra.i.e eVar, okhttp3.s sVar, com.waze.network.e.d dVar, boolean z, boolean z2, u uVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(sVar, "cookieJar");
        h.g.b.x.f(dVar, "interceptorFactory");
        h.g.b.x.f(uVar, "dnsResolverFactory");
        this.f32023a = eVar;
        this.f32024b = sVar;
        this.f32025c = dVar;
        this.f32026d = z;
        this.f32027e = z2;
        this.f32028f = uVar;
        this.f32029g = new ArrayList();
    }

    @Override // com.waze.network.b.bj
    public final bj a(com.waze.network.e.e eVar) {
        h.g.b.x.f(eVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        List list = this.f32029g;
        if (list.contains(eVar)) {
            this.f32023a.g("interceptor " + eVar + " is already added");
        } else {
            list.add(eVar);
        }
        return this;
    }

    @Override // com.waze.network.b.bj
    public final okhttp3.ai b() {
        okhttp3.ah ahVar = new okhttp3.ah();
        if (this.f32026d) {
            a(com.waze.network.e.e.f32241b);
        }
        if (this.f32027e) {
            a(com.waze.network.e.e.f32242c);
        }
        a(com.waze.network.e.e.f32243d);
        List list = this.f32029g;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f32025c.a((com.waze.network.e.e) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ahVar.v((okhttp3.ac) it2.next());
        }
        if (this.f32032j) {
            ahVar.w(this.f32024b);
        }
        Long l2 = this.f32030h;
        if (l2 != null) {
            ahVar.y(l2.longValue(), TimeUnit.SECONDS);
        }
        Long l3 = this.f32031i;
        if (l3 != null) {
            ahVar.z(l3.longValue(), TimeUnit.SECONDS);
        }
        ahVar.A();
        ahVar.x(this.f32028f.a());
        return new okhttp3.ai(ahVar);
    }

    @Override // com.waze.network.b.bj
    public final bj c() {
        this.f32030h = 30L;
        this.f32031i = 30L;
        return this;
    }

    @Override // com.waze.network.b.bj
    public final bj d() {
        this.f32032j = true;
        return this;
    }
}
