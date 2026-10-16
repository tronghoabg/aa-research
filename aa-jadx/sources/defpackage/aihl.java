package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aihl implements defpackage.agfz, defpackage.aimw {
    private int cachedHashCode;

    private aihl() {
    }

    private final int computeHashCode() {
        return defpackage.aihr.isError(this) ? super.hashCode() : (((getConstructor().hashCode() * 31) + getArguments().hashCode()) * 31) + (isMarkedNullable() ? 1 : 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aihl)) {
            return false;
        }
        defpackage.aihl aihlVar = (defpackage.aihl) obj;
        return isMarkedNullable() == aihlVar.isMarkedNullable() && defpackage.ailk.INSTANCE.strictEqualTypes(unwrap(), aihlVar.unwrap());
    }

    @Override // defpackage.agfz
    public defpackage.aggk getAnnotations() {
        return defpackage.aigi.getAnnotations(getAttributes());
    }

    public abstract java.util.List<defpackage.aijn> getArguments();

    public abstract defpackage.aiir getAttributes();

    public abstract defpackage.aijd getConstructor();

    public abstract defpackage.ahye getMemberScope();

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

    public abstract defpackage.aihl refine(defpackage.aiku aikuVar);

    public abstract defpackage.aikf unwrap();

    public /* synthetic */ aihl(defpackage.affu affuVar) {
        this();
    }
}
