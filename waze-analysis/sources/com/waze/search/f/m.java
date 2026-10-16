package com.waze.search.f;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResultLauncher;
import com.waze.search.h.bx;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f35729a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ActivityResultLauncher f35730b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f35731c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f35732d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.search.h.q f35733e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f35734f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.o f35735g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f35736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(bx bxVar, ActivityResultLauncher activityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, com.waze.search.h.q qVar, Context context, com.waze.av.b.o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f35729a = bxVar;
        this.f35730b = activityResultLauncher;
        this.f35731c = managedActivityResultLauncher;
        this.f35732d = managedActivityResultLauncher2;
        this.f35733e = qVar;
        this.f35734f = context;
        this.f35735g = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        m mVar = new m(this.f35729a, this.f35730b, this.f35731c, this.f35732d, this.f35733e, this.f35734f, this.f35735g, eVar);
        mVar.f35736h = obj;
        return mVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ai.m(ai.K(this.f35729a.f(), new l(this.f35730b, this.f35731c, this.f35732d, this.f35733e, this.f35734f, this.f35735g, null)), (af) this.f35736h);
        return ab.f48028a;
    }
}
