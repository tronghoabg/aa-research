package defpackage;

/* loaded from: classes3.dex */
public final class aifn {
    private aifn() {
    }

    private final boolean canHaveUndefinedNullability(aijf aijfVar) {
        return (aijfVar.getConstructor() instanceof aikg) || (aijfVar.getConstructor().getDeclarationDescriptor() instanceof agee) || (aijfVar instanceof aijw) || (aijfVar instanceof aihg);
    }

    private final boolean makesSenseToBeDefinitelyNotNull(aijf aijfVar, boolean z) {
        if (!canHaveUndefinedNullability(aijfVar)) {
            return false;
        }
        if (aijfVar instanceof aihg) {
            return aijc.isNullableType(aijfVar);
        }
        agbd declarationDescriptor = aijfVar.getConstructor().getDeclarationDescriptor();
        agiu agiuVar = declarationDescriptor instanceof agiu ? (agiu) declarationDescriptor : null;
        if (agiuVar == null || agiuVar.isInitialized()) {
            return (z && (aijfVar.getConstructor().getDeclarationDescriptor() instanceof agee)) ? aijc.isNullableType(aijfVar) : !aikh.INSTANCE.isSubtypeOfAny(aijfVar);
        }
        return true;
    }

    public final aifo makeDefinitelyNotNull(aijf aijfVar, boolean z, boolean z2) {
        aijfVar.getClass();
        if (aijfVar instanceof aifo) {
            return (aifo) aijfVar;
        }
        afeu afeuVar = null;
        if (!z2 && !makesSenseToBeDefinitelyNotNull(aijfVar, z)) {
            return null;
        }
        if (aijfVar instanceof aiga) {
            aiga aigaVar = (aiga) aijfVar;
            affa.f(aigaVar.getLowerBound().getConstructor(), aigaVar.getUpperBound().getConstructor());
        }
        return new aifo(aige.lowerIfFlexible(aijfVar).makeNullableAsSpecified(false), z, afeuVar);
    }

    public /* synthetic */ aifn(afeu afeuVar) {
        this();
    }
}
