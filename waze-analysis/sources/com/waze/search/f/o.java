package com.waze.search.f;

import androidx.activity.compose.ManagedActivityResultLauncher;
import com.waze.sound.jv;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jv f35738a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f35739b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(jv jvVar, ManagedActivityResultLauncher managedActivityResultLauncher, h.c.e eVar) {
        super(2, eVar);
        this.f35738a = jvVar;
        this.f35739b = managedActivityResultLauncher;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new o(this.f35738a, this.f35739b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f35738a.b(this.f35739b);
        return ab.f48028a;
    }
}
