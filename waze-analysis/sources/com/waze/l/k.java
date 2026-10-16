package com.waze.l;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f25104a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f25105b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f25106c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f25107d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f25108e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f25109f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f25110g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(v vVar, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, ManagedActivityResultLauncher managedActivityResultLauncher3, Context context, h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f25105b = vVar;
        this.f25106c = managedActivityResultLauncher;
        this.f25107d = managedActivityResultLauncher2;
        this.f25108e = managedActivityResultLauncher3;
        this.f25109f = context;
        this.f25110g = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f25105b, this.f25106c, this.f25107d, this.f25108e, this.f25109f, this.f25110g, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25104a == 0) {
            e.b.c.b(obj);
            v vVar = this.f25105b;
            ManagedActivityResultLauncher managedActivityResultLauncher = this.f25106c;
            ManagedActivityResultLauncher managedActivityResultLauncher2 = this.f25107d;
            ManagedActivityResultLauncher managedActivityResultLauncher3 = this.f25108e;
            Context context = this.f25109f;
            h.g.a.a aVar2 = this.f25110g;
            this.f25104a = 1;
            if (vVar.a().collect(new j(vVar, managedActivityResultLauncher, managedActivityResultLauncher2, managedActivityResultLauncher3, context, aVar2), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
