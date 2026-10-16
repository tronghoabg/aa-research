package com.waze.ab.a;

import android.content.Context;
import android.content.res.Configuration;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.material.ModalBottomSheetState;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f13720a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f13721b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f13722c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Configuration f13723d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f13724e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f13725f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f13726g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f13727h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f13728i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(n nVar, Context context, Configuration configuration, ManagedActivityResultLauncher managedActivityResultLauncher, ModalBottomSheetState modalBottomSheetState, ManagedActivityResultLauncher managedActivityResultLauncher2, ManagedActivityResultLauncher managedActivityResultLauncher3, ManagedActivityResultLauncher managedActivityResultLauncher4, h.c.e eVar) {
        super(2, eVar);
        this.f13721b = nVar;
        this.f13722c = context;
        this.f13723d = configuration;
        this.f13724e = managedActivityResultLauncher;
        this.f13725f = modalBottomSheetState;
        this.f13726g = managedActivityResultLauncher2;
        this.f13727h = managedActivityResultLauncher3;
        this.f13728i = managedActivityResultLauncher4;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f13721b, this.f13722c, this.f13723d, this.f13724e, this.f13725f, this.f13726g, this.f13727h, this.f13728i, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f13720a == 0) {
            e.b.c.b(obj);
            n nVar = this.f13721b;
            Context context = this.f13722c;
            Configuration configuration = this.f13723d;
            ManagedActivityResultLauncher managedActivityResultLauncher = this.f13724e;
            ModalBottomSheetState modalBottomSheetState = this.f13725f;
            ManagedActivityResultLauncher managedActivityResultLauncher2 = this.f13726g;
            ManagedActivityResultLauncher managedActivityResultLauncher3 = this.f13727h;
            ManagedActivityResultLauncher managedActivityResultLauncher4 = this.f13728i;
            this.f13720a = 1;
            if (nVar.a().collect(new i(context, configuration, nVar, managedActivityResultLauncher, modalBottomSheetState, managedActivityResultLauncher2, managedActivityResultLauncher3, managedActivityResultLauncher4), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
