package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahef<T> {
    private final boolean isForWarningOnly;
    private final T qualifier;

    public /* synthetic */ ahef(java.lang.Object obj, boolean z, int i, defpackage.affu affuVar) {
        this(obj, z & ((i & 2) == 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ defpackage.ahef copy$default(defpackage.ahef ahefVar, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = ahefVar.qualifier;
        }
        if ((i & 2) != 0) {
            z = ahefVar.isForWarningOnly;
        }
        return ahefVar.copy(obj, z);
    }

    public final defpackage.ahef<T> copy(T t, boolean z) {
        return new defpackage.ahef<>(t, z);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahef)) {
            return false;
        }
        defpackage.ahef ahefVar = (defpackage.ahef) obj;
        return defpackage.afga.f(this.qualifier, ahefVar.qualifier) && this.isForWarningOnly == ahefVar.isForWarningOnly;
    }

    public final T getQualifier() {
        return this.qualifier;
    }

    public int hashCode() {
        T t = this.qualifier;
        return ((t == null ? 0 : t.hashCode()) * 31) + defpackage.ahee.m(this.isForWarningOnly);
    }

    public final boolean isForWarningOnly() {
        return this.isForWarningOnly;
    }

    public java.lang.String toString() {
        return "WithMigrationStatus(qualifier=" + this.qualifier + ", isForWarningOnly=" + this.isForWarningOnly + ')';
    }

    public ahef(T t, boolean z) {
        this.qualifier = t;
        this.isForWarningOnly = z;
    }
}
