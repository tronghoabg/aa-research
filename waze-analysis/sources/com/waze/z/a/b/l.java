package com.waze.z.a.b;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    private final List f45750a = new ArrayList();

    @Override // com.waze.z.a.b.j
    public final void a(int i2, h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onClick");
        this.f45750a.add(new k(i2, aVar));
    }

    public final List b() {
        return this.f45750a;
    }
}
