package com.waze.sound.e;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.State;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f39848a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f39849b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ State f39850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ModalBottomSheetState modalBottomSheetState, State state, h.c.e eVar) {
        super(2, eVar);
        this.f39849b = modalBottomSheetState;
        this.f39850c = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f39849b, this.f39850c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.show(r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r1.hide(r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return r0;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f39848a
            r2 = 1
            if (r1 == 0) goto Lb
            e.b.c.b(r5)
            goto L41
        Lb:
            e.b.c.b(r5)
            androidx.compose.runtime.State r5 = r4.f39850c
            boolean r5 = a.a.j(r5)
            androidx.compose.material.ModalBottomSheetState r1 = r4.f39849b
            if (r5 == 0) goto L2c
            androidx.compose.material.ModalBottomSheetValue r5 = r1.getTargetValue()
            androidx.compose.material.ModalBottomSheetValue r3 = androidx.compose.material.ModalBottomSheetValue.Expanded
            if (r5 == r3) goto L41
            r5 = r4
            h.c.e r5 = (h.c.e) r5
            r4.f39848a = r2
            java.lang.Object r4 = r1.show(r5)
            if (r4 != r0) goto L41
            goto L40
        L2c:
            androidx.compose.material.ModalBottomSheetValue r5 = r1.getTargetValue()
            androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Hidden
            if (r5 == r2) goto L41
            r5 = r4
            h.c.e r5 = (h.c.e) r5
            r2 = 2
            r4.f39848a = r2
            java.lang.Object r4 = r1.hide(r5)
            if (r4 != r0) goto L41
        L40:
            return r0
        L41:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.e.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
