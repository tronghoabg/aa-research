package com.waze.ui.o;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f43144a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43145b;

    e(List list, h.g.a.l lVar) {
        this.f43144a = list;
        this.f43145b = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        this.f43145b.invoke((c) this.f43144a.get(((Number) obj).intValue()));
        return h.ab.f48028a;
    }
}
