package com.waze.shared_infra.coordinators;

import h.ab;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f37817a;

    l(o oVar) {
        this.f37817a = oVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final Object emit(Object obj, h.c.e<? super ab> eVar) {
        o oVar = this.f37817a;
        com.waze.shared_infra.i.e eVar2 = oVar.f37826b;
        Objects.toString(obj);
        eVar2.a("Event dispatched: ".concat(String.valueOf(obj)));
        oVar.g(obj);
        return ab.f48028a;
    }
}
