package com.waze.jni;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f24957a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Runnable runnable, e eVar) {
        super(2, eVar);
        this.f24957a = runnable;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new b(this.f24957a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f24957a.run();
        return ab.f48028a;
    }
}
