package defpackage;

import java.util.function.BooleanSupplier;

/* loaded from: classes.dex */
final class tgi {
    public final BooleanSupplier a;
    public final Runnable b;

    public tgi(BooleanSupplier booleanSupplier, Runnable runnable) {
        this.a = booleanSupplier;
        this.b = runnable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgi) {
            tgi tgiVar = (tgi) obj;
            if (this.a.equals(tgiVar.a) && this.b.equals(tgiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Runnable runnable = this.b;
        return "StartupTypeLoggingFunctions{hasBaseAndEndEvents=" + this.a.toString() + ", persistAndResetMeasurements=" + runnable.toString() + "}";
    }

    public tgi() {
        throw null;
    }
}
