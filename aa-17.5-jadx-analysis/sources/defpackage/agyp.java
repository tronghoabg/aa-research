package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class agyp extends agyh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public agyp(agvu agvuVar) {
        super(agvuVar, null, 2, 0 == true ? 1 : 0);
        agvuVar.getClass();
    }

    @Override // defpackage.agyh
    protected void computeNonDeclaredProperties(ahnj ahnjVar, Collection<agdn> collection) {
        ahnjVar.getClass();
        collection.getClass();
    }

    @Override // defpackage.agyh
    protected agdq getDispatchReceiverParameter() {
        return null;
    }

    @Override // defpackage.agyh
    protected agyf resolveMethodSignature(agzr agzrVar, List<? extends agee> list, aigl aiglVar, List<? extends agel> list2) {
        agzrVar.getClass();
        list.getClass();
        aiglVar.getClass();
        list2.getClass();
        return new agyf(aiglVar, null, list2, list, false, afbe.a);
    }
}
