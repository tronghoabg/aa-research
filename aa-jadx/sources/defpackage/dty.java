package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dty extends defpackage.dtz {
    public final j$.time.LocalTime a;

    public dty(j$.time.LocalTime localTime) {
        this.a = localTime.truncatedTo(j$.time.temporal.ChronoUnit.SECONDS);
    }

    @Override // defpackage.dtz
    public final void a(android.os.Bundle bundle) {
        bundle.putLong("value", this.a.toSecondOfDay());
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.dty)) {
            return false;
        }
        defpackage.dty dtyVar = (defpackage.dty) obj;
        if (this == dtyVar) {
            return true;
        }
        return j$.util.Objects.equals(this.a, dtyVar.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a);
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + "}";
    }
}
