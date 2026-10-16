package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class aifq extends aigw {
    @Override // defpackage.aigl
    public List<aiin> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // defpackage.aigl
    public aihr getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // defpackage.aigl
    public aiid getConstructor() {
        return getDelegate().getConstructor();
    }

    protected abstract aigw getDelegate();

    @Override // defpackage.aigl
    public ahxe getMemberScope() {
        return getDelegate().getMemberScope();
    }

    @Override // defpackage.aigl
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    @Override // defpackage.aijf, defpackage.aigl
    public aigw refine(aiju aijuVar) {
        aijuVar.getClass();
        aigl aiglVarRefineType = aijuVar.refineType((ailw) getDelegate());
        aiglVarRefineType.getClass();
        return replaceDelegate((aigw) aiglVarRefineType);
    }

    public abstract aifq replaceDelegate(aigw aigwVar);
}
