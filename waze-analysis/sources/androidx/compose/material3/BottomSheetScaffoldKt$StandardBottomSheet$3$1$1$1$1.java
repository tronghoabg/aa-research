package androidx.compose.material3;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ SheetState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1(SheetState sheetState, e<? super BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1> eVar) {
        super(2, eVar);
        this.$state = sheetState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1(this.$state, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r1.hide(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r1.partialExpand(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
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
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L15:
            e.b.c.b(r5)
            goto L3e
        L19:
            e.b.c.b(r5)
            androidx.compose.material3.SheetState r5 = r4.$state
            boolean r5 = r5.getSkipHiddenState$material3()
            androidx.compose.material3.SheetState r1 = r4.$state
            if (r5 != 0) goto L32
            r5 = r4
            h.c.e r5 = (h.c.e) r5
            r4.label = r3
            java.lang.Object r4 = r1.hide(r5)
            if (r4 != r0) goto L3e
            goto L3d
        L32:
            r5 = r4
            h.c.e r5 = (h.c.e) r5
            r4.label = r2
            java.lang.Object r4 = r1.partialExpand(r5)
            if (r4 != r0) goto L3e
        L3d:
            return r0
        L3e:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
