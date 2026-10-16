package com.waze.ui.x;

import androidx.compose.material.ModalBottomSheetState;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43833a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f43834b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f43835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(boolean z, ModalBottomSheetState modalBottomSheetState, h.c.e eVar) {
        super(2, eVar);
        this.f43834b = z;
        this.f43835c = modalBottomSheetState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f43834b, this.f43835c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r1.hide(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1.show(r3) == r0) goto L12;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r3.f43833a
            r2 = 1
            if (r1 == 0) goto Lb
            e.b.c.b(r4)
            goto L2d
        Lb:
            e.b.c.b(r4)
            boolean r4 = r3.f43834b
            androidx.compose.material.ModalBottomSheetState r1 = r3.f43835c
            if (r4 == 0) goto L20
            r4 = r3
            h.c.e r4 = (h.c.e) r4
            r3.f43833a = r2
            java.lang.Object r3 = r1.show(r4)
            if (r3 != r0) goto L2d
            goto L2c
        L20:
            r4 = r3
            h.c.e r4 = (h.c.e) r4
            r2 = 2
            r3.f43833a = r2
            java.lang.Object r3 = r1.hide(r4)
            if (r3 != r0) goto L2d
        L2c:
            return r0
        L2d:
            h.ab r3 = h.ab.f48028a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.x.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
