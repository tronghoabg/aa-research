package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class aigl implements agez, ailw {
    private int cachedHashCode;

    private aigl() {
    }

    private final int computeHashCode() {
        return aigr.isError(this) ? super.hashCode() : (((getConstructor().hashCode() * 31) + getArguments().hashCode()) * 31) + (isMarkedNullable() ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aigl)) {
            return false;
        }
        aigl aiglVar = (aigl) obj;
        return isMarkedNullable() == aiglVar.isMarkedNullable() && aikk.INSTANCE.strictEqualTypes(unwrap(), aiglVar.unwrap());
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        return aifi.getAnnotations(getAttributes());
    }

    public abstract List<aiin> getArguments();

    public abstract aihr getAttributes();

    public abstract aiid getConstructor();

    public abstract ahxe getMemberScope();

    public final int hashCode() {
        int i = this.cachedHashCode;
        if (i != 0) {
            return i;
        }
        int iComputeHashCode = computeHashCode();
        this.cachedHashCode = iComputeHashCode;
        return iComputeHashCode;
    }

    public abstract boolean isMarkedNullable();

    public abstract aigl refine(aiju aijuVar);

    public abstract aijf unwrap();

    public /* synthetic */ aigl(afeu afeuVar) {
        this();
    }
}
