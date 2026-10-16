package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cd implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f42666a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f42667b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba f42668c;

    public cd(kotlinx.coroutines.b.k kVar, float f2, ba baVar) {
        this.f42666a = kVar;
        this.f42667b = f2;
        this.f42668c = baVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f42666a.collect(new cc(lVar, this.f42667b, this.f42668c), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
