package defpackage;

/* loaded from: classes3.dex */
public final class ahdf<T> {
    private final boolean isForWarningOnly;
    private final T qualifier;

    public /* synthetic */ ahdf(Object obj, boolean z, int i, afeu afeuVar) {
        this(obj, z & ((i & 2) == 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ahdf copy$default(ahdf ahdfVar, Object obj, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = ahdfVar.qualifier;
        }
        if ((i & 2) != 0) {
            z = ahdfVar.isForWarningOnly;
        }
        return ahdfVar.copy(obj, z);
    }

    public final ahdf<T> copy(T t, boolean z) {
        return new ahdf<>(t, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahdf)) {
            return false;
        }
        ahdf ahdfVar = (ahdf) obj;
        return affa.f(this.qualifier, ahdfVar.qualifier) && this.isForWarningOnly == ahdfVar.isForWarningOnly;
    }

    public final T getQualifier() {
        return this.qualifier;
    }

    public int hashCode() {
        T t = this.qualifier;
        return ((t == null ? 0 : t.hashCode()) * 31) + ahde.m(this.isForWarningOnly);
    }

    public final boolean isForWarningOnly() {
        return this.isForWarningOnly;
    }

    public String toString() {
        return "WithMigrationStatus(qualifier=" + this.qualifier + ", isForWarningOnly=" + this.isForWarningOnly + ')';
    }

    public ahdf(T t, boolean z) {
        this.qualifier = t;
        this.isForWarningOnly = z;
    }
}
