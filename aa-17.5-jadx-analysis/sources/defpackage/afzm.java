package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class afzm extends ahww {
    public static final afzl Companion = new afzl(null);
    private static final ahnj CLONE_NAME = ahnj.identifier("clone");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzm(aiei aieiVar, agba agbaVar) {
        super(aieiVar, agbaVar);
        aieiVar.getClass();
        agbaVar.getClass();
    }

    @Override // defpackage.ahww
    protected List<agcj> computeDeclaredFunctions() {
        agio agioVarCreate = agio.create(getContainingClass(), agfk.Companion.getEMPTY(), CLONE_NAME, agaw.DECLARATION, agdx.NO_SOURCE);
        agdq thisAsReceiverParameter = getContainingClass().getThisAsReceiverParameter();
        afbe afbeVar = afbe.a;
        agioVarCreate.initialize((agdq) null, thisAsReceiverParameter, (List<agdq>) afbeVar, (List<? extends agee>) afbeVar, (List<agel>) afbeVar, (aigl) ahvz.getBuiltIns(getContainingClass()).getAnyType(), agcq.OPEN, agcb.PROTECTED);
        return woy.bg(agioVarCreate);
    }
}
