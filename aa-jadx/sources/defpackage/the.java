package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class the {
    public final java.util.function.BooleanSupplier a;
    public final java.lang.Runnable b;

    public the(java.util.function.BooleanSupplier booleanSupplier, java.lang.Runnable runnable) {
        this.a = booleanSupplier;
        this.b = runnable;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.the) {
            defpackage.the theVar = (defpackage.the) obj;
            if (this.a.equals(theVar.a) && this.b.equals(theVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.Runnable runnable = this.b;
        return "StartupTypeLoggingFunctions{hasBaseAndEndEvents=" + this.a.toString() + ", persistAndResetMeasurements=" + runnable.toString() + "}";
    }

    public the() {
        throw null;
    }
}
