package com.waze.settings.f.b;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f37230a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f37231b;

    public f(k kVar, g gVar) {
        this.f37230a = kVar;
        this.f37231b = gVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f37230a.collect(new e(lVar, this.f37231b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
