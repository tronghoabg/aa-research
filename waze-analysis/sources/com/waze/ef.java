package com.waze;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavHostController;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ef extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f23637a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ el f23638b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Lifecycle f23639c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ NavHostController f23640d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f23641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ef(el elVar, Lifecycle lifecycle, NavHostController navHostController, h.c.e eVar) {
        super(2, eVar);
        this.f23638b = elVar;
        this.f23639c = lifecycle;
        this.f23640d = navHostController;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ef efVar = new ef(this.f23638b, this.f23639c, this.f23640d, eVar);
        efVar.f23641e = obj;
        return efVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ef) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f23637a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f23637a = 1;
            if (kotlinx.coroutines.b.ai.y(FlowExtKt.flowWithLifecycle(this.f23638b.L().g(), this.f23639c, Lifecycle.State.STARTED)).collect(new dr(this.f23640d, 2), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
