package com.waze.car_lib.j;

import androidx.car.app.CarContext;
import androidx.car.app.navigation.NavigationManager;
import com.waze.car_lib.r.cg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    Object f20228a;

    /* renamed from: b, reason: collision with root package name */
    Object f20229b;

    /* renamed from: c, reason: collision with root package name */
    Object f20230c;

    /* renamed from: d, reason: collision with root package name */
    int f20231d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f20232e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f20233f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f20234g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ NavigationManager f20235h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ CarContext f20236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(r rVar, NavigationManager navigationManager, CarContext carContext, h.c.e eVar) {
        super(3, eVar);
        this.f20234g = rVar;
        this.f20235h = navigationManager;
        this.f20236i = carContext;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        l lVar = new l(this.f20234g, this.f20235h, this.f20236i, (h.c.e) obj3);
        lVar.f20232e = (cg) obj;
        lVar.f20233f = (Long) obj2;
        return lVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (kotlinx.coroutines.aj.q(com.waze.settings.h.c.g(1), r12) != r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x001d, B:34:0x00f9, B:36:0x0101, B:38:0x010f, B:40:0x011c, B:42:0x012a, B:43:0x012f, B:45:0x013d, B:46:0x0142, B:47:0x015e, B:19:0x006f, B:21:0x007e, B:23:0x0089, B:31:0x00d7, B:26:0x0097, B:28:0x00a9, B:30:0x00b0, B:22:0x0085), top: B:56:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.j.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
