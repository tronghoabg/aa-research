package defpackage;

import j$.util.Objects;
import java.util.Locale;

@zje(a = zjc.a)
/* loaded from: classes.dex */
public final class ntq {
    public final nts a;
    public final int b;
    public final boolean c;

    public ntq(nts ntsVar, int i, boolean z) {
        this.a = ntsVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntq)) {
            return false;
        }
        ntq ntqVar = (ntq) obj;
        return this.b == ntqVar.b && this.c == ntqVar.c && this.a == ntqVar.a;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public final String toString() {
        return String.format(Locale.US, "CellSignal{overlay=%s, level=%d, isDataConnected=%b}", this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c));
    }
}
