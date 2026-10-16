package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class dto extends dts {
    public final float a;
    public final String b;
    public final int c;
    public final int d;

    public dto(float f, CharSequence charSequence, int i, int i2) {
        this.a = f;
        this.b = dsx.d(charSequence);
        boolean z = i >= 0 && i <= 6;
        Integer numValueOf = Integer.valueOf(i);
        aclh.o(z, "Invalid minFractionDigits: %s", new Object[]{numValueOf});
        boolean z2 = i2 >= 0 && i2 <= 6;
        Integer numValueOf2 = Integer.valueOf(i2);
        aclh.o(z2, "Invalid maxFractionDigits: %s", new Object[]{numValueOf2});
        aclh.o(i <= i2, "Invalid minFractionDigits/maxFractionDigits: %s/%s", new Object[]{numValueOf, numValueOf2});
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.dts
    public final void a(Bundle bundle) {
        bundle.putFloat("value", this.a);
        bundle.putString("unit", this.b);
        bundle.putInt("minDigits", this.c);
        bundle.putInt("maxDigits", this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dto)) {
            return false;
        }
        dto dtoVar = (dto) obj;
        if (this == dtoVar) {
            return true;
        }
        return this.a == dtoVar.a && Objects.equals(this.b, dtoVar.b) && this.c == dtoVar.c && this.d == dtoVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mUnit=" + this.b + ", mMinFractionDigits=" + this.c + ", mMaxFractionDigits=" + this.d + "}";
    }
}
