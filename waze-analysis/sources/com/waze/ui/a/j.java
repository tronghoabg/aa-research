package com.waze.ui.a;

import androidx.compose.material.ModalBottomSheetState;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41680a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f41681b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f41682c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f41683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(u uVar, ModalBottomSheetState modalBottomSheetState, ModalBottomSheetState modalBottomSheetState2, h.c.e eVar) {
        super(2, eVar);
        this.f41681b = uVar;
        this.f41682c = modalBottomSheetState;
        this.f41683d = modalBottomSheetState2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f41681b, this.f41682c, this.f41683d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r6.hide(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r6.show(r5) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.f41680a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L14
            if (r1 == r2) goto L10
            goto L14
        L10:
            e.b.c.b(r6)
            goto L66
        L14:
            e.b.c.b(r6)
            goto L7d
        L18:
            e.b.c.b(r6)
            goto L3d
        L1c:
            e.b.c.b(r6)
            com.waze.ui.a.u r6 = r5.f41681b
            boolean r6 = r6.h()
            androidx.compose.material.ModalBottomSheetState r1 = r5.f41682c
            if (r6 == 0) goto L53
            androidx.compose.material.ModalBottomSheetValue r6 = r1.getTargetValue()
            androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Hidden
            if (r6 != r2) goto L3d
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            r5.f41680a = r4
            java.lang.Object r6 = r1.show(r6)
            if (r6 != r0) goto L3d
            goto L7c
        L3d:
            androidx.compose.material.ModalBottomSheetState r6 = r5.f41683d
            androidx.compose.material.ModalBottomSheetValue r1 = r6.getTargetValue()
            androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Hidden
            if (r1 == r2) goto L7d
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r5.f41680a = r3
            java.lang.Object r5 = r6.hide(r1)
            if (r5 != r0) goto L7d
            goto L7c
        L53:
            androidx.compose.material.ModalBottomSheetValue r6 = r1.getTargetValue()
            androidx.compose.material.ModalBottomSheetValue r3 = androidx.compose.material.ModalBottomSheetValue.Hidden
            if (r6 == r3) goto L66
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            r5.f41680a = r2
            java.lang.Object r6 = r1.hide(r6)
            if (r6 == r0) goto L7c
        L66:
            androidx.compose.material.ModalBottomSheetState r6 = r5.f41683d
            androidx.compose.material.ModalBottomSheetValue r1 = r6.getTargetValue()
            androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Hidden
            if (r1 != r2) goto L7d
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r2 = 4
            r5.f41680a = r2
            java.lang.Object r5 = r6.show(r1)
            if (r5 != r0) goto L7d
        L7c:
            return r0
        L7d:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.a.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
