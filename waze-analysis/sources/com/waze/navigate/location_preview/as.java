package com.waze.navigate.location_preview;

import androidx.activity.result.ActivityResult;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class as extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31569a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ at f31570b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ActivityResult f31571c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.m.z f31572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(at atVar, ActivityResult activityResult, com.waze.ui.m.z zVar, h.c.e eVar) {
        super(2, eVar);
        this.f31570b = atVar;
        this.f31571c = activityResult;
        this.f31572d = zVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new as(this.f31570b, this.f31571c, this.f31572d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((as) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f31569a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bn bnVar = this.f31570b.f31575c;
            if (bnVar == null) {
                h.g.b.x.j("viewModel");
                bnVar = null;
            }
            this.f31569a = 1;
            if (bnVar.b(new com.waze.ui.m.ag(this.f31571c, this.f31572d), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
