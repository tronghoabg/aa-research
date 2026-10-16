package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aiku extends defpackage.aigg {
    public abstract defpackage.agca findClassAcrossModuleDependencies(defpackage.ahod ahodVar);

    public abstract <S extends defpackage.ahye> S getOrPutScopeForClass(defpackage.agca agcaVar, defpackage.afer<? extends S> aferVar);

    public abstract boolean isRefinementNeededForModule(defpackage.agdu agduVar);

    public abstract boolean isRefinementNeededForTypeConstructor(defpackage.aijd aijdVar);

    public abstract defpackage.agcd refineDescriptor(defpackage.agci agciVar);

    public abstract java.util.Collection<defpackage.aihl> refineSupertypes(defpackage.agca agcaVar);

    @Override // defpackage.aigg
    public abstract defpackage.aihl refineType(defpackage.aimw aimwVar);
}
