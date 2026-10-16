package defpackage;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public abstract class aiqc implements affb, ailt, ailv, aily, ailz {
    private final afup<Type> computeJavaType;

    public aiqc(afdr<? extends Type> afdrVar) {
        afup<Type> afupVarLazySoft = null;
        afup<Type> afupVar = afdrVar instanceof afup ? (afup) afdrVar : null;
        if (afupVar != null) {
            afupVarLazySoft = afupVar;
        } else if (afdrVar != null) {
            afupVarLazySoft = afus.lazySoft(afdrVar);
        }
        this.computeJavaType = afupVarLazySoft;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aiqc) && aiem.INSTANCE.strictEqualTypes(aird.INSTANCE, this, (ailw) obj);
    }

    public abstract afib getAbbreviation();

    protected final afup<Type> getComputeJavaType() {
        return this.computeJavaType;
    }

    @Override // defpackage.affb
    public Type getJavaType() {
        afup<Type> afupVar = this.computeJavaType;
        if (afupVar != null) {
            return afupVar.invoke();
        }
        return null;
    }

    public abstract afhe<?> getMutableCollectionClass();

    public int hashCode() {
        afhf classifier = getClassifier();
        return ((((classifier != null ? classifier.hashCode() : 0) * 31) + getArguments().hashCode()) * 31) + aiqb.m(isMarkedNullable());
    }

    public abstract boolean isDefinitelyNotNullType();

    public abstract boolean isNothingType();

    public abstract boolean isRawType();

    public abstract boolean isSuspendFunctionType();

    public abstract aiqc lowerBoundIfFlexible();

    public abstract aiqc makeDefinitelyNotNullAsSpecified(boolean z);

    public abstract aiqc makeNullableAsSpecified(boolean z);

    public String toString() {
        return afvf.renderType$default(afvf.INSTANCE, this, false, 2, null);
    }

    public abstract aiqc upperBoundIfFlexible();
}
