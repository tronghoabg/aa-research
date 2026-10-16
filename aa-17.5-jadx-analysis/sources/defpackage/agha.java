package defpackage;

/* loaded from: classes3.dex */
public class agha<R, D> implements agbk<R, D> {
    @Override // defpackage.agbk
    public R visitClassDescriptor(agba agbaVar, D d) {
        return visitDeclarationDescriptor(agbaVar, d);
    }

    @Override // defpackage.agbk
    public R visitConstructorDescriptor(agbh agbhVar, D d) {
        return visitFunctionDescriptor(agbhVar, d);
    }

    public R visitDeclarationDescriptor(agbi agbiVar, D d) {
        return null;
    }

    @Override // defpackage.agbk
    public R visitFunctionDescriptor(agcj agcjVar, D d) {
        return visitDeclarationDescriptor(agcjVar, d);
    }

    @Override // defpackage.agbk
    public R visitModuleDeclaration(agcu agcuVar, D d) {
        return visitDeclarationDescriptor(agcuVar, d);
    }

    @Override // defpackage.agbk
    public R visitPackageFragmentDescriptor(agdc agdcVar, D d) {
        return visitDeclarationDescriptor(agdcVar, d);
    }

    @Override // defpackage.agbk
    public R visitPackageViewDescriptor(agdj agdjVar, D d) {
        return visitDeclarationDescriptor(agdjVar, d);
    }

    @Override // defpackage.agbk
    public R visitPropertyDescriptor(agdn agdnVar, D d) {
        return visitVariableDescriptor(agdnVar, d);
    }

    @Override // defpackage.agbk
    public R visitPropertyGetterDescriptor(agdo agdoVar, D d) {
        return visitFunctionDescriptor(agdoVar, d);
    }

    @Override // defpackage.agbk
    public R visitPropertySetterDescriptor(agdp agdpVar, D d) {
        return visitFunctionDescriptor(agdpVar, d);
    }

    @Override // defpackage.agbk
    public R visitReceiverParameterDescriptor(agdq agdqVar, D d) {
        return visitDeclarationDescriptor(agdqVar, d);
    }

    @Override // defpackage.agbk
    public R visitTypeAliasDescriptor(aged agedVar, D d) {
        return visitDeclarationDescriptor(agedVar, d);
    }

    @Override // defpackage.agbk
    public R visitTypeParameterDescriptor(agee ageeVar, D d) {
        return visitDeclarationDescriptor(ageeVar, d);
    }

    @Override // defpackage.agbk
    public R visitValueParameterDescriptor(agel agelVar, D d) {
        return visitVariableDescriptor(agelVar, d);
    }

    public R visitVariableDescriptor(agem agemVar, D d) {
        return visitDeclarationDescriptor(agemVar, d);
    }
}
