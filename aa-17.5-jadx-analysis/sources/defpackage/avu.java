package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class avu {
    public float a;
    public boolean b;
    public atz c;
    private auh d;

    public avu(byte[] bArr) {
        this.a = BitmapDescriptorFactory.HUE_RED;
        this.b = true;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avu)) {
            return false;
        }
        avu avuVar = (avu) obj;
        if (Float.compare(this.a, avuVar.a) != 0 || this.b != avuVar.b || !affa.f(this.c, avuVar.c)) {
            return false;
        }
        auh auhVar = avuVar.d;
        return true;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i = true != this.b ? 1237 : 1231;
        atz atzVar = this.c;
        return (((iFloatToIntBits + i) * 31) + (atzVar == null ? 0 : atzVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public avu() {
        this(null);
    }
}
