package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agyq extends aggi {
    private final agvu c;
    private final agzx javaTypeParameter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agyq(agvu agvuVar, agzx agzxVar, int i, agbi agbiVar) {
        super(agvuVar.getStorageManager(), agbiVar, new agvq(agvuVar, agzxVar, false, 4, null), agzxVar.getName(), aijg.INVARIANT, false, i, agdx.NO_SOURCE, agvuVar.getComponents().getSupertypeLoopChecker());
        agvuVar.getClass();
        agzxVar.getClass();
        agbiVar.getClass();
        this.c = agvuVar;
        this.javaTypeParameter = agzxVar;
    }

    private final List<aigl> computeNotEnhancedBounds() {
        Collection<agzl> upperBounds = this.javaTypeParameter.getUpperBounds();
        if (upperBounds.isEmpty()) {
            aigw anyType = this.c.getModule().getBuiltIns().getAnyType();
            anyType.getClass();
            aigw nullableAnyType = this.c.getModule().getBuiltIns().getNullableAnyType();
            nullableAnyType.getClass();
            return woy.bg(aigq.flexibleType(anyType, nullableAnyType));
        }
        ArrayList arrayList = new ArrayList(woy.bp(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            agyq agyqVar = this;
            arrayList.add(this.c.getTypeResolver().transformJavaType((agzl) it.next(), agys.toAttributes$default(aija.COMMON, false, false, agyqVar, 3, null)));
            this = agyqVar;
        }
        return arrayList;
    }

    @Override // defpackage.aggt
    protected List<aigl> processBoundsWithoutCycles(List<? extends aigl> list) {
        list.getClass();
        return this.c.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, list, this.c);
    }

    @Override // defpackage.aggt
    /* renamed from: reportSupertypeLoopError */
    protected void mo92reportSupertypeLoopError(aigl aiglVar) {
        aiglVar.getClass();
    }

    @Override // defpackage.aggt
    protected List<aigl> resolveUpperBounds() {
        return computeNotEnhancedBounds();
    }
}
