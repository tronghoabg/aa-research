package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agyf {
    private final List<String> errors;
    private final boolean hasStableParameterNames;
    private final aigl receiverType;
    private final aigl returnType;
    private final List<agee> typeParameters;
    private final List<agel> valueParameters;

    /* JADX WARN: Multi-variable type inference failed */
    public agyf(aigl aiglVar, aigl aiglVar2, List<? extends agel> list, List<? extends agee> list2, boolean z, List<String> list3) {
        aiglVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.returnType = aiglVar;
        this.receiverType = aiglVar2;
        this.valueParameters = list;
        this.typeParameters = list2;
        this.hasStableParameterNames = z;
        this.errors = list3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agyf)) {
            return false;
        }
        agyf agyfVar = (agyf) obj;
        return affa.f(this.returnType, agyfVar.returnType) && affa.f(this.receiverType, agyfVar.receiverType) && affa.f(this.valueParameters, agyfVar.valueParameters) && affa.f(this.typeParameters, agyfVar.typeParameters) && this.hasStableParameterNames == agyfVar.hasStableParameterNames && affa.f(this.errors, agyfVar.errors);
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final boolean getHasStableParameterNames() {
        return this.hasStableParameterNames;
    }

    public final aigl getReceiverType() {
        return this.receiverType;
    }

    public final aigl getReturnType() {
        return this.returnType;
    }

    public final List<agee> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<agel> getValueParameters() {
        return this.valueParameters;
    }

    public int hashCode() {
        int iHashCode = this.returnType.hashCode() * 31;
        aigl aiglVar = this.receiverType;
        return ((((((((iHashCode + (aiglVar == null ? 0 : aiglVar.hashCode())) * 31) + this.valueParameters.hashCode()) * 31) + this.typeParameters.hashCode()) * 31) + agye.m(this.hasStableParameterNames)) * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "MethodSignatureData(returnType=" + this.returnType + ", receiverType=" + this.receiverType + ", valueParameters=" + this.valueParameters + ", typeParameters=" + this.typeParameters + ", hasStableParameterNames=" + this.hasStableParameterNames + ", errors=" + this.errors + ')';
    }
}
