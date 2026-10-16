package com.waze.search.a;

import h.g.a.l;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f35478a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f35479b;

    public g(p pVar, List list) {
        this.f35478a = pVar;
        this.f35479b = list;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.f35478a.invoke(Integer.valueOf(iIntValue), this.f35479b.get(iIntValue));
    }
}
