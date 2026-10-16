package androidx.compose.runtime.composer.gapbuffer;

import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.m.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SlotTable$getSlots$1$iterator$1 extends f implements p<j<? super Object>, e<? super ab>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlotTable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlotTable$getSlots$1$iterator$1(SlotTable slotTable, e<? super SlotTable$getSlots$1$iterator$1> eVar) {
        super(2, eVar);
        this.this$0 = slotTable;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SlotTable$getSlots$1$iterator$1 slotTable$getSlots$1$iterator$1 = new SlotTable$getSlots$1$iterator$1(this.this$0, eVar);
        slotTable$getSlots$1$iterator$1.L$0 = obj;
        return slotTable$getSlots$1$iterator$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(j<Object> jVar, e<? super ab> eVar) {
        return ((SlotTable$getSlots$1$iterator$1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0045 -> B:12:0x0047). Please report as a decompilation issue!!! */
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
            goto L47
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1d:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.L$0
            h.m.j r7 = (h.m.j) r7
            androidx.compose.runtime.composer.gapbuffer.SlotTable r1 = r6.this$0
            int r1 = r1.getSlotsSize()
            r3 = 0
            r4 = r7
        L2c:
            if (r3 >= r1) goto L4a
            androidx.compose.runtime.composer.gapbuffer.SlotTable r7 = r6.this$0
            java.lang.Object[] r7 = r7.m7429getSlots()
            r7 = r7[r3]
            r5 = r6
            h.c.e r5 = (h.c.e) r5
            r6.L$0 = r4
            r6.I$0 = r3
            r6.I$1 = r1
            r6.label = r2
            java.lang.Object r7 = r4.a(r7, r5)
            if (r7 == r0) goto L49
        L47:
            int r3 = r3 + r2
            goto L2c
        L49:
            return r0
        L4a:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.gapbuffer.SlotTable$getSlots$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(j<? super Object> jVar, e<? super ab> eVar) {
        return invoke2((j<Object>) jVar, eVar);
    }
}
