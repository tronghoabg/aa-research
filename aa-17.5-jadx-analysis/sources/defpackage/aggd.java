package defpackage;

/* loaded from: classes3.dex */
final class aggd implements afec {
    final /* synthetic */ agge this$1;

    public aggd(agge aggeVar) {
        this.this$1 = aggeVar;
    }

    @Override // defpackage.afec
    public aigw invoke(aiju aijuVar) {
        agbd agbdVarRefineDescriptor = aijuVar.refineDescriptor(this.this$1.this$0);
        return agbdVarRefineDescriptor == null ? this.this$1.this$0.defaultType.invoke() : agbdVarRefineDescriptor instanceof aged ? aigq.computeExpandedType((aged) agbdVarRefineDescriptor, aijc.getDefaultTypeProjections(agbdVarRefineDescriptor.getTypeConstructor().getParameters())) : agbdVarRefineDescriptor instanceof aghw ? aijc.makeUnsubstitutedType(agbdVarRefineDescriptor.getTypeConstructor().refine(aijuVar), ((aghw) agbdVarRefineDescriptor).getUnsubstitutedMemberScope(aijuVar), this) : agbdVarRefineDescriptor.getDefaultType();
    }
}
