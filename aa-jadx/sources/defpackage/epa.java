package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class epa {
    static final defpackage.epa a = androidx.gridlayout.widget.GridLayout.e(Integer.MIN_VALUE, 1, androidx.gridlayout.widget.GridLayout.b, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    public final boolean b;
    public final defpackage.eox c;
    final defpackage.eor d;
    final float e;

    /* JADX WARN: Illegal instructions before constructor call */
    public epa(boolean z, int i, int i2, defpackage.eor eorVar, float f) {
        int i3 = i2 + i;
        this(z, new defpackage.eox(i, i3), eorVar, f);
        if (z) {
            if (i3 < i || i3 > 100000) {
                androidx.gridlayout.widget.GridLayout.f("The sum of the start index and the span must not exceed 100000");
            }
        }
    }

    public final defpackage.eor a(boolean z) {
        defpackage.eor eorVar = this.d;
        if (eorVar != androidx.gridlayout.widget.GridLayout.b) {
            return eorVar;
        }
        if (this.e == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return z ? androidx.gridlayout.widget.GridLayout.e : androidx.gridlayout.widget.GridLayout.j;
        }
        return androidx.gridlayout.widget.GridLayout.k;
    }

    public final defpackage.epa b(defpackage.eox eoxVar) {
        return new defpackage.epa(this.b, eoxVar, this.d, this.e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.epa)) {
            return false;
        }
        defpackage.epa epaVar = (defpackage.epa) obj;
        return this.d.equals(epaVar.d) && this.c.equals(epaVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    private epa(boolean z, defpackage.eox eoxVar, defpackage.eor eorVar, float f) {
        this.b = z;
        this.c = eoxVar;
        this.d = eorVar;
        this.e = f;
    }
}
