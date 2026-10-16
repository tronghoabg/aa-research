package com.waze.search.f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResultLauncher;
import com.waze.ix;
import com.waze.search.h.ba;
import com.waze.search.h.bb;
import com.waze.search.h.bc;
import com.waze.search.h.y;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35722a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ActivityResultLauncher f35723b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f35724c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f35725d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.search.h.q f35726e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f35727f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.o f35728g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(ActivityResultLauncher activityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, com.waze.search.h.q qVar, Context context, com.waze.av.b.o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f35723b = activityResultLauncher;
        this.f35724c = managedActivityResultLauncher;
        this.f35725d = managedActivityResultLauncher2;
        this.f35726e = qVar;
        this.f35727f = context;
        this.f35728g = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        l lVar = new l(this.f35723b, this.f35724c, this.f35725d, this.f35726e, this.f35727f, this.f35728g, eVar);
        lVar.f35722a = obj;
        return lVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((bc) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bc bcVar = (bc) this.f35722a;
        if (bcVar instanceof ba) {
            ba baVar = (ba) bcVar;
            com.waze.search.h.ab abVarA = baVar.a();
            ManagedActivityResultLauncher managedActivityResultLauncher = (h.g.b.x.n(abVarA, com.waze.search.h.s.f35961a) || h.g.b.x.n(abVarA, com.waze.search.h.t.f35962a)) ? this.f35723b : ((abVarA instanceof com.waze.search.h.w) || (abVarA instanceof y) || (abVarA instanceof com.waze.search.h.x)) ? this.f35724c : this.f35725d;
            this.f35726e.a(this.f35727f, baVar.a(), managedActivityResultLauncher, this.f35728g);
        } else {
            if (!h.g.b.x.n(bcVar, bb.f35815a)) {
                throw new h.i();
            }
            ManagedActivityResultLauncher managedActivityResultLauncher2 = this.f35725d;
            Intent intentG = ix.g(this.f35727f);
            h.g.b.x.e(intentG, "createSystemSettingsIntent(...)");
            managedActivityResultLauncher2.launch(intentG);
        }
        return ab.f48028a;
    }
}
