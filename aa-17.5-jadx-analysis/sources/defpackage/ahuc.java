package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public class ahuc extends ahuh<List<? extends ahuh<?>>> {
    private final afec<agcu, aigl> computeType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ahuc(List<? extends ahuh<?>> list, afec<? super agcu, ? extends aigl> afecVar) {
        super(list);
        list.getClass();
        afecVar.getClass();
        this.computeType = afecVar;
    }

    @Override // defpackage.ahuh
    public aigl getType(agcu agcuVar) {
        agcuVar.getClass();
        aigl aiglVarInvoke = this.computeType.invoke(agcuVar);
        if (!afye.isArray(aiglVarInvoke) && !afye.isPrimitiveArray(aiglVarInvoke)) {
            afye.isUnsignedArrayType(aiglVarInvoke);
        }
        return aiglVarInvoke;
    }
}
