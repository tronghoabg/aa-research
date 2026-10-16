package com.waze.an.a.a;

import java.util.HashSet;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HashSet f14421a;

    ba(HashSet hashSet) {
        this.f14421a = hashSet;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        h.g.b.x.f((Map.Entry) obj, "it");
        return Boolean.valueOf(!this.f14421a.contains(r2.getKey()));
    }
}
