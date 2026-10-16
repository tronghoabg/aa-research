package com.waze.reports_v2.presentation.a;

import android.content.Context;
import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import com.waze.reports.ClosureMap;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34714a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f34715b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ au f34716c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f34717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Context context, au auVar, ManagedActivityResultLauncher managedActivityResultLauncher, h.c.e eVar) {
        super(2, eVar);
        this.f34715b = context;
        this.f34716c = auVar;
        this.f34717d = managedActivityResultLauncher;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new d(this.f34715b, this.f34716c, this.f34717d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34714a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Context context = this.f34715b;
            au auVar = this.f34716c;
            CompletableDeferred completableDeferredJ = bo.j();
            ClosureMap.o(context, auVar.b() != null, completableDeferredJ);
            this.f34714a = 1;
            obj = completableDeferredJ.c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Intent intent = (Intent) obj;
        if (intent != null) {
            this.f34717d.launch(intent);
        }
        return h.ab.f48028a;
    }
}
