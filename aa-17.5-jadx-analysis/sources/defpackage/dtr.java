package defpackage;

import android.os.Bundle;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class dtr extends dts {
    public final LocalTime a;

    public dtr(LocalTime localTime) {
        this.a = localTime.truncatedTo(ChronoUnit.SECONDS);
    }

    @Override // defpackage.dts
    public final void a(Bundle bundle) {
        bundle.putLong("value", this.a.toSecondOfDay());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtr)) {
            return false;
        }
        dtr dtrVar = (dtr) obj;
        if (this == dtrVar) {
            return true;
        }
        return Objects.equals(this.a, dtrVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + "}";
    }
}
