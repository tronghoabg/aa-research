package com.waze.ui;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41724a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f41725b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MutableState f41726c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f41727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ModalBottomSheetState modalBottomSheetState, MutableState mutableState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41727d = i2;
        this.f41725b = modalBottomSheetState;
        this.f41726c = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f41727d != 0 ? new ab(this.f41725b, this.f41726c, eVar, 1, null) : new ab(this.f41725b, this.f41726c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f41727d != 0 ? ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (kotlinx.coroutines.aj.q(300, r4) == r0) goto L14;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f41727d
            r1 = 1
            if (r0 == 0) goto L3e
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r4.f41724a
            if (r2 == 0) goto L15
            if (r2 == r1) goto L11
            e.b.c.b(r5)
            goto L35
        L11:
            e.b.c.b(r5)
            goto L26
        L15:
            e.b.c.b(r5)
            androidx.compose.material.ModalBottomSheetState r5 = r4.f41725b
            r2 = r4
            h.c.e r2 = (h.c.e) r2
            r4.f41724a = r1
            java.lang.Object r5 = r5.hide(r2)
            if (r5 != r0) goto L26
            goto L34
        L26:
            r5 = r4
            h.c.e r5 = (h.c.e) r5
            r1 = 2
            r4.f41724a = r1
            r1 = 300(0x12c, double:1.48E-321)
            java.lang.Object r5 = kotlinx.coroutines.aj.q(r1, r5)
            if (r5 != r0) goto L35
        L34:
            return r0
        L35:
            androidx.compose.runtime.MutableState r4 = r4.f41726c
            r5 = 0
            r4.setValue(r5)
            h.ab r4 = h.ab.f48028a
            return r4
        L3e:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r4.f41724a
            if (r2 == 0) goto L48
            e.b.c.b(r5)
            goto L6d
        L48:
            e.b.c.b(r5)
            androidx.compose.material.ModalBottomSheetState r5 = r4.f41725b
            com.waze.settings.g.a.b r2 = new com.waze.settings.g.a.b
            r3 = 15
            r2.<init>(r5, r3)
            kotlinx.coroutines.b.k r5 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r2)
            androidx.compose.runtime.MutableState r2 = r4.f41726c
            com.waze.ui.aa r3 = new com.waze.ui.aa
            r3.<init>(r2)
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            r2 = r4
            h.c.e r2 = (h.c.e) r2
            r4.f41724a = r1
            java.lang.Object r4 = r5.collect(r3, r2)
            if (r4 != r0) goto L6d
            return r0
        L6d:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.ab.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ModalBottomSheetState modalBottomSheetState, MutableState mutableState, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f41727d = i2;
        this.f41725b = modalBottomSheetState;
        this.f41726c = mutableState;
    }
}
