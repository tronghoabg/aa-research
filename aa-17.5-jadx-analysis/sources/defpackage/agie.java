package defpackage;

/* loaded from: classes3.dex */
public abstract class agie extends aggz implements agdc {
    private final String debugString;
    private final ahnf fqName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agie(agcu agcuVar, ahnf ahnfVar) {
        super(agcuVar, agfk.Companion.getEMPTY(), ahnfVar.shortNameOrSpecial(), agdx.NO_SOURCE);
        agcuVar.getClass();
        ahnfVar.getClass();
        this.fqName = ahnfVar;
        this.debugString = "package " + ahnfVar + " of " + agcuVar;
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        agbkVar.getClass();
        return agbkVar.visitPackageFragmentDescriptor(this, d);
    }

    @Override // defpackage.aggz, defpackage.agbi
    public agcu getContainingDeclaration() {
        agbi containingDeclaration = super.getContainingDeclaration();
        containingDeclaration.getClass();
        return (agcu) containingDeclaration;
    }

    @Override // defpackage.agdc
    public final ahnf getFqName() {
        return this.fqName;
    }

    @Override // defpackage.aggz, defpackage.agbl
    public agdx getSource() {
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        return agdxVar;
    }

    @Override // defpackage.aggy
    public String toString() {
        return this.debugString;
    }
}
