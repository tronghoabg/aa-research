package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public final class aire extends aiqc implements affb {
    private final afib abbreviation;
    private final List<Annotation> annotations;
    private final List<afid> arguments;
    private final afhf classifier;
    private final boolean isDefinitelyNotNullType;
    private final boolean isMarkedNullable;
    private final boolean isNothingType;
    private final boolean isSuspendFunctionType;
    private final afhe<?> mutableCollectionClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aire(afhf afhfVar, List<afid> list, boolean z, List<? extends Annotation> list2, afib afibVar, boolean z2, boolean z3, boolean z4, afhe<?> afheVar, afdr<? extends Type> afdrVar) {
        super(afdrVar);
        afhfVar.getClass();
        list.getClass();
        list2.getClass();
        this.classifier = afhfVar;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.annotations = list2;
        this.abbreviation = afibVar;
        this.isDefinitelyNotNullType = z2;
        this.isNothingType = z3;
        this.isSuspendFunctionType = z4;
        this.mutableCollectionClass = afheVar;
    }

    private final afhf toWrapperClassIfNeeded(afhf afhfVar, boolean z) {
        afhe afheVarL;
        if (!(afhfVar instanceof afhe)) {
            return afhfVar;
        }
        afhe afheVar = (afhe) afhfVar;
        if (z) {
            return affa.l(affa.i(afheVar));
        }
        Class clsJ = affa.j(afheVar);
        return (clsJ == null || (afheVarL = affa.l(clsJ)) == null) ? afheVar : afheVarL;
    }

    @Override // defpackage.aiqc
    public afib getAbbreviation() {
        return this.abbreviation;
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // defpackage.afib
    public List<afid> getArguments() {
        return this.arguments;
    }

    @Override // defpackage.afib
    public afhf getClassifier() {
        return this.classifier;
    }

    @Override // defpackage.aiqc
    public afhe<?> getMutableCollectionClass() {
        return this.mutableCollectionClass;
    }

    @Override // defpackage.aiqc
    public boolean isDefinitelyNotNullType() {
        return this.isDefinitelyNotNullType;
    }

    @Override // defpackage.afib
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // defpackage.aiqc
    public boolean isNothingType() {
        return this.isNothingType;
    }

    @Override // defpackage.aiqc
    public boolean isRawType() {
        return false;
    }

    @Override // defpackage.aiqc
    public boolean isSuspendFunctionType() {
        return this.isSuspendFunctionType;
    }

    @Override // defpackage.aiqc
    public aiqc lowerBoundIfFlexible() {
        return null;
    }

    @Override // defpackage.aiqc
    public aiqc makeDefinitelyNotNullAsSpecified(boolean z) {
        afhf classifier = getClassifier();
        List<afid> arguments = getArguments();
        boolean z2 = false;
        if (isMarkedNullable() && !z) {
            z2 = true;
        }
        return new aire(classifier, arguments, z2, getAnnotations(), getAbbreviation(), z, isNothingType(), isSuspendFunctionType(), getMutableCollectionClass(), null, sk.AUDIO_CONTENT_BUFFER_SIZE, null);
    }

    @Override // defpackage.aiqc
    public aiqc makeNullableAsSpecified(boolean z) {
        return new aire(toWrapperClassIfNeeded(getClassifier(), z), getArguments(), z, getAnnotations(), getAbbreviation(), false, isNothingType(), isSuspendFunctionType(), getMutableCollectionClass(), null, sk.AUDIO_CONTENT_BUFFER_SIZE, null);
    }

    @Override // defpackage.aiqc
    public aiqc upperBoundIfFlexible() {
        return null;
    }

    public /* synthetic */ aire(afhf afhfVar, List list, boolean z, List list2, afib afibVar, boolean z2, boolean z3, boolean z4, afhe afheVar, afdr afdrVar, int i, afeu afeuVar) {
        this(afhfVar, list, z, list2, afibVar, z2, z3, z4, afheVar, (i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : afdrVar);
    }
}
