package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes3.dex */
public final class aiqf extends aiqc implements ails {
    private final afhf classifier;
    private final boolean isMarkedNullable;
    private final afib lowerType;
    private final aiqg typeConstructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiqf(afib afibVar, aiqg aiqgVar, boolean z) {
        super(aiqe.INSTANCE);
        aiqgVar.getClass();
        this.lowerType = afibVar;
        this.typeConstructor = aiqgVar;
        this.isMarkedNullable = z;
    }

    @Override // defpackage.aiqc
    public boolean equals(Object obj) {
        if (!(obj instanceof aiqf)) {
            return false;
        }
        aiqf aiqfVar = (aiqf) obj;
        return affa.f(this.lowerType, aiqfVar.lowerType) && affa.f(this.typeConstructor, aiqfVar.typeConstructor) && isMarkedNullable() == aiqfVar.isMarkedNullable();
    }

    @Override // defpackage.aiqc
    public afib getAbbreviation() {
        return null;
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return afbe.a;
    }

    @Override // defpackage.afib
    public List<afid> getArguments() {
        return afbe.a;
    }

    @Override // defpackage.afib
    public afhf getClassifier() {
        return this.classifier;
    }

    public final afib getLowerType() {
        return this.lowerType;
    }

    @Override // defpackage.aiqc
    public afhe<?> getMutableCollectionClass() {
        return null;
    }

    public final aiqg getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // defpackage.aiqc
    public int hashCode() {
        afib afibVar = this.lowerType;
        return ((((afibVar != null ? afibVar.hashCode() : 0) * 31) + this.typeConstructor.hashCode()) * 31) + aiqd.m(isMarkedNullable());
    }

    @Override // defpackage.aiqc
    public boolean isDefinitelyNotNullType() {
        return false;
    }

    @Override // defpackage.afib
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // defpackage.aiqc
    public boolean isNothingType() {
        return false;
    }

    @Override // defpackage.aiqc
    public boolean isRawType() {
        return false;
    }

    @Override // defpackage.aiqc
    public boolean isSuspendFunctionType() {
        return false;
    }

    @Override // defpackage.aiqc
    public aiqc lowerBoundIfFlexible() {
        return null;
    }

    @Override // defpackage.aiqc
    public aiqc makeDefinitelyNotNullAsSpecified(boolean z) {
        if (!z) {
            return this;
        }
        toString();
        throw new aftw("Definitely not null captured type is not supported yet: ".concat(toString()));
    }

    @Override // defpackage.aiqc
    public aiqc makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : new aiqf(this.lowerType, this.typeConstructor, z);
    }

    @Override // defpackage.aiqc
    public String toString() {
        return this.typeConstructor.toString();
    }

    @Override // defpackage.aiqc
    public aiqc upperBoundIfFlexible() {
        return null;
    }
}
