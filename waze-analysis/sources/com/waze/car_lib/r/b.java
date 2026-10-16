package com.waze.car_lib.r;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20994a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f20995b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.n f20996c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableLiveData f20997d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f20998e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f20999f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f21000g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Context f21001h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.l f21002i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(com.waze.av.b.n nVar, MutableLiveData mutableLiveData, d dVar, h.g.b.am amVar, long j2, Context context, com.waze.car_lib.screens.core.l lVar, h.c.e eVar) {
        super(3, eVar);
        this.f20996c = nVar;
        this.f20997d = mutableLiveData;
        this.f20998e = dVar;
        this.f20999f = amVar;
        this.f21000g = j2;
        this.f21001h = context;
        this.f21002i = lVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        b bVar = new b(this.f20996c, this.f20997d, this.f20998e, this.f20999f, this.f21000g, this.f21001h, this.f21002i, (h.c.e) obj3);
        bVar.f20994a = (com.waze.navigate.n) obj;
        bVar.f20995b = zBooleanValue;
        return bVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116 A[PHI: r6
  0x0116: PHI (r6v3 boolean) = (r6v0 boolean), (r6v0 boolean), (r6v5 boolean), (r6v0 boolean) binds: [B:34:0x00dc, B:36:0x00e2, B:218:0x0116, B:40:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.waze.car_lib.p.dh] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v7 */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
