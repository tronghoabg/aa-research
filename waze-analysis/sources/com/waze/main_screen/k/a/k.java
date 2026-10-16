package com.waze.main_screen.k.a;

import h.ab;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f26534a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f26535b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f26536c;

    public k(kotlinx.coroutines.b.k kVar, aq aqVar, u uVar) {
        this.f26534a = kVar;
        this.f26535b = aqVar;
        this.f26536c = uVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f26534a.collect(new j(lVar, this.f26535b, this.f26536c), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
