package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class dx implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dz f31269a;

    dx(dz dzVar) {
        this.f31269a = dzVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        NavResultData navResultData = (NavResultData) obj;
        this.f31269a.X().e(Boolean.valueOf(navResultData != null ? navResultData.bIsCalculating : false));
        return h.ab.f48028a;
    }
}
