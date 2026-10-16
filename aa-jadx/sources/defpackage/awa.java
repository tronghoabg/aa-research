package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class awa {
    public float a;
    public boolean b;
    public defpackage.aue c;
    private defpackage.aum d;

    public awa(byte[] bArr) {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = true;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.awa)) {
            return false;
        }
        defpackage.awa awaVar = (defpackage.awa) obj;
        if (java.lang.Float.compare(this.a, awaVar.a) != 0 || this.b != awaVar.b || !defpackage.afga.f(this.c, awaVar.c)) {
            return false;
        }
        defpackage.aum aumVar = awaVar.d;
        return true;
    }

    public final int hashCode() {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.a) * 31;
        int i = true != this.b ? 1237 : 1231;
        defpackage.aue aueVar = this.c;
        return (((iFloatToIntBits + i) * 31) + (aueVar == null ? 0 : aueVar.hashCode())) * 31;
    }

    public final java.lang.String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public awa() {
        this(null);
    }
}
