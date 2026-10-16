package com.waze.search.f;

import androidx.compose.material.ModalBottomSheetState;
import com.waze.search.h.bx;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.n f35745a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f35746b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f35747c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bx f35748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(com.waze.av.b.n nVar, ModalBottomSheetState modalBottomSheetState, af afVar, bx bxVar, h.c.e eVar) {
        super(2, eVar);
        this.f35745a = nVar;
        this.f35746b = modalBottomSheetState;
        this.f35747c = afVar;
        this.f35748d = bxVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f35745a, this.f35746b, this.f35747c, this.f35748d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            e.b.c.b(r6)
            com.waze.av.b.n r6 = r5.f35745a
            r0 = 3
            r1 = 0
            if (r6 != 0) goto L21
            androidx.compose.material.ModalBottomSheetState r2 = r5.f35746b
            boolean r3 = r2.isVisible()
            if (r3 == 0) goto L21
            kotlinx.coroutines.af r5 = r5.f35747c
            com.waze.search.f.q r6 = new com.waze.search.f.q
            r3 = 1
            r6.<init>(r2, r1, r3, r1)
            h.g.a.p r6 = (h.g.a.p) r6
            kotlinx.coroutines.aj.z(r5, r1, r1, r6, r0)
            goto L3d
        L21:
            if (r6 == 0) goto L3d
            androidx.compose.material.ModalBottomSheetState r6 = r5.f35746b
            boolean r2 = r6.isVisible()
            if (r2 != 0) goto L3d
            kotlinx.coroutines.af r2 = r5.f35747c
            com.waze.search.f.q r3 = new com.waze.search.f.q
            r4 = 0
            r3.<init>(r6, r1, r4)
            h.g.a.p r3 = (h.g.a.p) r3
            kotlinx.coroutines.aj.z(r2, r1, r1, r3, r0)
            com.waze.search.h.bx r5 = r5.f35748d
            r5.u()
        L3d:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.f.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
