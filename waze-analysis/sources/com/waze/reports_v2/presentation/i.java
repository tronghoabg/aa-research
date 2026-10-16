package com.waze.reports_v2.presentation;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResultLauncher;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.a.a.a.b f35047a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f35048b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(com.waze.reports_v2.a.a.a.b bVar, Context context, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f35049c = i2;
        this.f35047a = bVar;
        this.f35048b = context;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f35049c != 0 ? new i(this.f35047a, (Context) this.f35048b, eVar, 1) : new i(this.f35047a, (ManagedActivityResultLauncher) this.f35048b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f35049c != 0 ? ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f35049c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f35047a.h(com.waze.ad.a.j.u((Context) this.f35048b));
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f35047a.f();
        ((ActivityResultLauncher) this.f35048b).launch("android.permission.RECORD_AUDIO");
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(com.waze.reports_v2.a.a.a.b bVar, ManagedActivityResultLauncher managedActivityResultLauncher, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f35049c = i2;
        this.f35047a = bVar;
        this.f35048b = managedActivityResultLauncher;
    }
}
