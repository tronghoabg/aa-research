package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.m.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SlotTable$DebugGroup$slots$1 extends f implements p<j<? super Object>, e<? super ab>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlotTable.DebugGroup this$0;
    final /* synthetic */ SlotTable this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlotTable$DebugGroup$slots$1(SlotTable.DebugGroup debugGroup, SlotTable slotTable, e<? super SlotTable$DebugGroup$slots$1> eVar) {
        super(2, eVar);
        this.this$0 = debugGroup;
        this.this$1 = slotTable;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SlotTable$DebugGroup$slots$1 slotTable$DebugGroup$slots$1 = new SlotTable$DebugGroup$slots$1(this.this$0, this.this$1, eVar);
        slotTable$DebugGroup$slots$1.L$0 = obj;
        return slotTable$DebugGroup$slots$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(j<Object> jVar, e<? super ab> eVar) {
        return ((SlotTable$DebugGroup$slots$1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0057 -> B:12:0x0059). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            int r1 = r6.I$1
            int r3 = r6.I$0
            java.lang.Object r4 = r6.L$0
            h.m.j r4 = (h.m.j) r4
            e.b.c.b(r7)
            goto L59
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1d:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.L$0
            h.m.j r7 = (h.m.j) r7
            androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup r1 = r6.this$0
            androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugSlotRange r1 = r1.getSlotRange()
            int r3 = r1.getAddress()
            androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup r4 = r6.this$0
            int r4 = r4.getFlags()
            int r4 = androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt.utilitySlotsCountForFlags(r4)
            int r3 = r3 + r4
            int r1 = r1.getEnd()
            r4 = r7
        L3e:
            if (r3 >= r1) goto L5c
            androidx.compose.runtime.composer.linkbuffer.SlotTable r7 = r6.this$1
            java.lang.Object[] r7 = androidx.compose.runtime.composer.linkbuffer.SlotTable.access$getSlots(r7)
            r7 = r7[r3]
            r5 = r6
            h.c.e r5 = (h.c.e) r5
            r6.L$0 = r4
            r6.I$0 = r3
            r6.I$1 = r1
            r6.label = r2
            java.lang.Object r7 = r4.a(r7, r5)
            if (r7 == r0) goto L5b
        L59:
            int r3 = r3 + r2
            goto L3e
        L5b:
            return r0
        L5c:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup$slots$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(j<? super Object> jVar, e<? super ab> eVar) {
        return invoke2((j<Object>) jVar, eVar);
    }
}
