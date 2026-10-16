package com.waze.alerters.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bl;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private final af f14161a;

    /* renamed from: b, reason: collision with root package name */
    private final bq f14162b;

    public g(kotlinx.coroutines.ab abVar, List list) {
        h.g.b.x.f(abVar, "dispatcher");
        h.g.b.x.f(list, "providers");
        this.f14161a = aj.e(abVar);
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((h) it.next()).a());
        }
        u uVar = new u((kotlinx.coroutines.b.k[]) h.a.i.ao(h.a.i.ao(arrayList)).toArray(new kotlinx.coroutines.b.k[0]), 1);
        af afVar = this.f14161a;
        int i2 = bz.f51630a;
        this.f14162b = bl.b(uVar, afVar, by.c(), 0);
    }

    @Override // com.waze.alerters.a.d
    public final /* synthetic */ kotlinx.coroutines.b.k a() {
        return this.f14162b;
    }
}
