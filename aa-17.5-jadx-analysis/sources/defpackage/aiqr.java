package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public final class aiqr extends aiqc {
    public static final aiqq Companion = new aiqq(null);
    private final boolean isRawType;
    private final aiqc lowerBound;
    private final aiqc upperBound;

    private aiqr(aiqc aiqcVar, aiqc aiqcVar2, boolean z, afdr<? extends Type> afdrVar) {
        super(afdrVar);
        this.lowerBound = aiqcVar;
        this.upperBound = aiqcVar2;
        this.isRawType = z;
    }

    @Override // defpackage.aiqc
    public afib getAbbreviation() {
        return null;
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return this.lowerBound.getAnnotations();
    }

    @Override // defpackage.afib
    public List<afid> getArguments() {
        return this.lowerBound.getArguments();
    }

    @Override // defpackage.afib
    public afhf getClassifier() {
        return this.lowerBound.getClassifier();
    }

    @Override // defpackage.aiqc
    public afhe<?> getMutableCollectionClass() {
        return this.lowerBound.getMutableCollectionClass();
    }

    @Override // defpackage.aiqc
    public boolean isDefinitelyNotNullType() {
        return false;
    }

    @Override // defpackage.afib
    public boolean isMarkedNullable() {
        return this.lowerBound.isMarkedNullable();
    }

    @Override // defpackage.aiqc
    public boolean isNothingType() {
        return false;
    }

    @Override // defpackage.aiqc
    public boolean isRawType() {
        return this.isRawType;
    }

    @Override // defpackage.aiqc
    public boolean isSuspendFunctionType() {
        return false;
    }

    @Override // defpackage.aiqc
    public aiqc lowerBoundIfFlexible() {
        return this.lowerBound;
    }

    @Override // defpackage.aiqc
    public aiqc makeDefinitelyNotNullAsSpecified(boolean z) {
        aiqc aiqcVar = this.upperBound;
        return aiqq.create$default(Companion, this.lowerBound.makeDefinitelyNotNullAsSpecified(z), aiqcVar.makeDefinitelyNotNullAsSpecified(z), isRawType(), null, 8, null);
    }

    @Override // defpackage.aiqc
    public aiqc makeNullableAsSpecified(boolean z) {
        aiqc aiqcVar = this.upperBound;
        return aiqq.create$default(Companion, this.lowerBound.makeNullableAsSpecified(z), aiqcVar.makeNullableAsSpecified(z), isRawType(), null, 8, null);
    }

    @Override // defpackage.aiqc
    public aiqc upperBoundIfFlexible() {
        return this.upperBound;
    }

    public /* synthetic */ aiqr(aiqc aiqcVar, aiqc aiqcVar2, boolean z, afdr afdrVar, afeu afeuVar) {
        this(aiqcVar, aiqcVar2, z, afdrVar);
    }
}
