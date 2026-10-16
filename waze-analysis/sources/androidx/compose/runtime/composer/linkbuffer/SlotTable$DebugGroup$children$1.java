package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.m.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SlotTable$DebugGroup$children$1 extends f implements p<j<? super SlotTable.DebugGroup>, e<? super ab>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SlotTable this$0;
    final /* synthetic */ SlotTable.DebugGroup this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlotTable$DebugGroup$children$1(SlotTable slotTable, SlotTable.DebugGroup debugGroup, e<? super SlotTable$DebugGroup$children$1> eVar) {
        super(2, eVar);
        this.this$0 = slotTable;
        this.this$1 = debugGroup;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SlotTable$DebugGroup$children$1 slotTable$DebugGroup$children$1 = new SlotTable$DebugGroup$children$1(this.this$0, this.this$1, eVar);
        slotTable$DebugGroup$children$1.L$0 = obj;
        return slotTable$DebugGroup$children$1;
    }

    @Override // h.g.a.p
    public final Object invoke(j<? super SlotTable.DebugGroup> jVar, e<? super ab> eVar) {
        return ((SlotTable$DebugGroup$children$1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0058 -> B:12:0x005a). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            int r1 = r6.I$0
            java.lang.Object r3 = r6.L$2
            int[] r3 = (int[]) r3
            java.lang.Object r4 = r6.L$1
            androidx.compose.runtime.composer.linkbuffer.SlotTable r4 = (androidx.compose.runtime.composer.linkbuffer.SlotTable) r4
            java.lang.Object r5 = r6.L$0
            h.m.j r5 = (h.m.j) r5
            e.b.c.b(r7)
            goto L5a
        L1b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L23:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.L$0
            h.m.j r7 = (h.m.j) r7
            androidx.compose.runtime.composer.linkbuffer.SlotTable r1 = r6.this$0
            androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup r3 = r6.this$1
            int r3 = r3.getAddress()
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r4 = r1.getAddressSpace()
            int[] r4 = r4.getGroups()
            int r3 = r3 + 3
            r3 = r4[r3]
            r5 = r4
            r4 = r1
            r1 = r3
            r3 = r5
            r5 = r7
        L43:
            if (r1 <= 0) goto L5f
            androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup r7 = new androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup
            r7.<init>(r1)
            r6.L$0 = r5
            r6.L$1 = r4
            r6.L$2 = r3
            r6.I$0 = r1
            r6.label = r2
            java.lang.Object r7 = r5.a(r7, r6)
            if (r7 == r0) goto L5e
        L5a:
            int r1 = r1 + r2
            r1 = r3[r1]
            goto L43
        L5e:
            return r0
        L5f:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
