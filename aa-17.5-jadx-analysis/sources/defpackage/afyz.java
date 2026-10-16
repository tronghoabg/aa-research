package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class afyz extends ahww {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyz(aiei aieiVar, afyw afywVar) {
        super(aieiVar, afywVar);
        aieiVar.getClass();
        afywVar.getClass();
    }

    @Override // defpackage.ahww
    protected List<agcj> computeDeclaredFunctions() {
        agba containingClass = getContainingClass();
        containingClass.getClass();
        afzh functionTypeKind = ((afyw) containingClass).getFunctionTypeKind();
        return affa.f(functionTypeKind, afzd.INSTANCE) ? woy.bg(afzb.Factory.create((afyw) getContainingClass(), false)) : affa.f(functionTypeKind, afzg.INSTANCE) ? woy.bg(afzb.Factory.create((afyw) getContainingClass(), true)) : afbe.a;
    }
}
