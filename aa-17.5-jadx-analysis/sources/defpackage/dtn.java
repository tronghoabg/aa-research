package defpackage;

import android.os.Bundle;
import j$.time.LocalDate;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class dtn extends dts {
    public final LocalDate a;
    public final int b;

    public dtn(LocalDate localDate, int i) {
        this.a = localDate;
        aclh.o(i >= 0 && i <= 2, "Invalid format: %s", new Object[]{Integer.valueOf(i)});
        this.b = i;
    }

    @Override // defpackage.dts
    public final void a(Bundle bundle) {
        bundle.putLong("value", this.a.toEpochDay());
        bundle.putInt("format", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtn)) {
            return false;
        }
        dtn dtnVar = (dtn) obj;
        if (this == dtnVar) {
            return true;
        }
        return Objects.equals(this.a, dtnVar.a) && this.b == dtnVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mFormat=" + this.b + "}";
    }
}
