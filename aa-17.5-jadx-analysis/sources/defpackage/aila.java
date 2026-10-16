package defpackage;

/* loaded from: classes3.dex */
public final class aila extends aggw {
    /* JADX WARN: Illegal instructions before constructor call */
    public aila(ahnj ahnjVar) {
        ahnjVar.getClass();
        agcu errorModule = ailm.INSTANCE.getErrorModule();
        agcq agcqVar = agcq.OPEN;
        agbb agbbVar = agbb.CLASS;
        afbe afbeVar = afbe.a;
        super(errorModule, ahnjVar, agcqVar, agbbVar, afbeVar, agdx.NO_SOURCE, false, aidz.NO_LOCKS);
        aggu agguVarCreate = aggu.create(this, agfk.Companion.getEMPTY(), true, agdx.NO_SOURCE);
        agguVarCreate.initialize(afbeVar, agcb.PUBLIC);
        aili ailiVar = aili.SCOPE_FOR_ERROR_CLASS;
        String string = agguVarCreate.getName().toString();
        string.getClass();
        ahxe ahxeVarCreateErrorScope = ailm.createErrorScope(ailiVar, string, "");
        agguVarCreate.setReturnType(new ailj(ailm.INSTANCE.createErrorTypeConstructor(aill.ERROR_CLASS, new String[0]), ahxeVarCreateErrorScope, aill.ERROR_CLASS, null, false, new String[0], 24, null));
        initialize(ahxeVarCreateErrorScope, woy.aO(agguVarCreate), agguVarCreate);
    }

    @Override // defpackage.aggh, defpackage.aghw
    public ahxe getMemberScope(aiit aiitVar, aiju aijuVar) {
        aiitVar.getClass();
        aijuVar.getClass();
        aili ailiVar = aili.SCOPE_FOR_ERROR_CLASS;
        String string = getName().toString();
        string.getClass();
        return ailm.createErrorScope(ailiVar, string, aiitVar.toString());
    }

    @Override // defpackage.aggh, defpackage.agea
    public agba substitute(aiiy aiiyVar) {
        aiiyVar.getClass();
        return this;
    }

    @Override // defpackage.aggw
    public String toString() {
        String strAsString = getName().asString();
        strAsString.getClass();
        return strAsString;
    }

    @Override // defpackage.aggh, defpackage.agea
    public /* bridge */ /* synthetic */ agbj substitute(aiiy aiiyVar) {
        substitute(aiiyVar);
        return this;
    }
}
