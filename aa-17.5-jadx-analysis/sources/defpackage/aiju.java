package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class aiju extends aifg {
    public abstract agba findClassAcrossModuleDependencies(ahnd ahndVar);

    public abstract <S extends ahxe> S getOrPutScopeForClass(agba agbaVar, afdr<? extends S> afdrVar);

    public abstract boolean isRefinementNeededForModule(agcu agcuVar);

    public abstract boolean isRefinementNeededForTypeConstructor(aiid aiidVar);

    public abstract agbd refineDescriptor(agbi agbiVar);

    public abstract Collection<aigl> refineSupertypes(agba agbaVar);

    @Override // defpackage.aifg
    public abstract aigl refineType(ailw ailwVar);
}
