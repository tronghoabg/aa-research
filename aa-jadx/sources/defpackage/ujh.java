package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujh {
    public final defpackage.tpm a;
    public float b;
    public int c;

    public ujh(defpackage.tpm tpmVar, int i, float f) {
        this.a = tpmVar;
        this.c = i;
        this.b = f;
    }

    public static defpackage.ujh a(defpackage.abbj abbjVar, defpackage.tpd tpdVar) throws java.io.IOException {
        float f;
        int i;
        defpackage.abbk abbkVar = abbjVar.c;
        if (abbkVar == null) {
            abbkVar = defpackage.abbk.a;
        }
        defpackage.abnv abnvVar = abbkVar.c;
        defpackage.tpm tpmVar = new defpackage.tpm();
        tpdVar.i(abnvVar, tpmVar);
        if ((abbjVar.b & 4) != 0) {
            f = abbjVar.e / 10.0f;
            i = 1;
        } else {
            f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            i = 2;
        }
        return new defpackage.ujh(tpmVar, i, f);
    }

    public final boolean b() {
        if (java.lang.Float.isNaN(this.b)) {
            return false;
        }
        return (this.b == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && this.c == 2) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.ujh ujhVar = (defpackage.ujh) obj;
        return this.c == ujhVar.c && this.a.equals(ujhVar.a) && java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(ujhVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        defpackage.a.aI(i);
        return ((((i + 31) * 31) + this.a.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AbsolutePosition{position=");
        sb.append(this.a);
        if (b()) {
            sb.append(", rotationMode=");
            int i = this.c;
            if (i != 1) {
                str = i != 2 ? "null" : "SCREEN_RELATIVE";
            } else {
                str = "WORLD_RELATIVE";
            }
            sb.append((java.lang.Object) str);
            sb.append(", rotation=");
            sb.append(this.b);
        }
        sb.append('}');
        return sb.toString();
    }
}
