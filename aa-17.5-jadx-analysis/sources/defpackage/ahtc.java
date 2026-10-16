package defpackage;

/* loaded from: classes3.dex */
final class ahtc implements afec {
    final /* synthetic */ agbi val$containingDeclaration;

    public ahtc(agbi agbiVar) {
        this.val$containingDeclaration = agbiVar;
    }

    @Override // defpackage.afec
    public Boolean invoke(agax agaxVar) {
        return Boolean.valueOf(agaxVar.getContainingDeclaration() == this.val$containingDeclaration);
    }
}
