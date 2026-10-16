package com.waze.app_nav.hub.c;

import h.ab;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f15321a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15322b;

    o(p pVar, int i2) {
        this.f15322b = i2;
        this.f15321a = pVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f15322b != 0) {
            com.waze.app_nav.hub.a.a aVar = (com.waze.app_nav.hub.a.a) obj;
            com.waze.shared_infra.i.e eVar2 = this.f15321a.f15324b;
            Objects.toString(aVar);
            eVar2.a("presenter is blocked, policy=".concat(String.valueOf(aVar)));
            return ab.f48028a;
        }
        a aVar2 = (a) obj;
        com.waze.shared_infra.i.e eVar3 = this.f15321a.f15324b;
        Objects.toString(aVar2);
        eVar3.a("presenter state=".concat(String.valueOf(aVar2)));
        return ab.f48028a;
    }
}
