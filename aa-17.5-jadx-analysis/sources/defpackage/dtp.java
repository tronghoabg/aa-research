package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class dtp extends dts {
    public final int a;
    public final String b;

    public dtp(int i, CharSequence charSequence) {
        this.a = i;
        this.b = dsx.d(charSequence);
    }

    @Override // defpackage.dts
    public final void a(Bundle bundle) {
        bundle.putInt("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtp)) {
            return false;
        }
        dtp dtpVar = (dtp) obj;
        if (this == dtpVar) {
            return true;
        }
        return this.a == dtpVar.a && Objects.equals(this.b, dtpVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mUnit=" + this.b + "}";
    }
}
