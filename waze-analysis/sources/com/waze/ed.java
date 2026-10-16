package com.waze;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ed extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NavBackStackEntry f23633a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ el f23634b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.install.o f23635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ed(NavBackStackEntry navBackStackEntry, el elVar, com.waze.install.o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f23633a = navBackStackEntry;
        this.f23634b = elVar;
        this.f23635c = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ed(this.f23633a, this.f23634b, this.f23635c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ed) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Bundle arguments = this.f23633a.getArguments();
        if (arguments == null || !arguments.getBoolean("isProjected")) {
            this.f23634b.o().c(this.f23635c.b());
        }
        return h.ab.f48028a;
    }
}
