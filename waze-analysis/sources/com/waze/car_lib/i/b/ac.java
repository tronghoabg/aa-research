package com.waze.car_lib.i.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ac implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f19954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.waze.map.h f19955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.waze.car_lib.i.a.a f19956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19957d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f19958e;

    public /* synthetic */ ac(List list, com.waze.car_lib.i.a.a aVar, Object obj, com.waze.map.h hVar, int i2) {
        this.f19958e = i2;
        this.f19954a = list;
        this.f19956c = aVar;
        this.f19957d = obj;
        this.f19955b = hVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f19958e;
        com.waze.map.h hVar = this.f19955b;
        if (i2 != 0) {
            Object obj = this.f19957d;
            return c.b(this.f19954a, this.f19956c, (c) obj, hVar);
        }
        Object obj2 = this.f19957d;
        return ah.e(this.f19954a, this.f19956c, (ah) obj2, hVar);
    }
}
