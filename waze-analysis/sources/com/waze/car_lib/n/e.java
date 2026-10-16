package com.waze.car_lib.n;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20397a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20398b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f20399c;

    e(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        e eVar = new e((h.c.e) obj4);
        eVar.f20397a = (Boolean) obj;
        eVar.f20398b = (List) obj2;
        eVar.f20399c = zBooleanValue;
        return eVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Boolean bool = (Boolean) this.f20397a;
        List list = (List) this.f20398b;
        boolean z = this.f20399c;
        if (!bool.booleanValue() || !z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!h.g.b.x.n(((d) obj2).b(), "gas_station")) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
