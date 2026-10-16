package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class dtq extends dts {
    public final String a;
    public final String b;

    public dtq(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        this.a = dsx.d(charSequence);
        this.b = dsx.d(charSequence2);
    }

    @Override // defpackage.dts
    public final void a(Bundle bundle) {
        bundle.putString("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtq)) {
            return false;
        }
        dtq dtqVar = (dtq) obj;
        if (this == dtqVar) {
            return true;
        }
        return Objects.equals(this.a, dtqVar.a) && Objects.equals(this.b, dtqVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mUnit=" + this.b + "}";
    }
}
