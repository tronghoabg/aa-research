package defpackage;

import androidx.gridlayout.widget.GridLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class eou {
    static final eou a = GridLayout.e(Integer.MIN_VALUE, 1, GridLayout.b, BitmapDescriptorFactory.HUE_RED);
    public final boolean b;
    public final eor c;
    final eol d;
    final float e;

    /* JADX WARN: Illegal instructions before constructor call */
    public eou(boolean z, int i, int i2, eol eolVar, float f) {
        int i3 = i2 + i;
        this(z, new eor(i, i3), eolVar, f);
        if (z) {
            if (i3 < i || i3 > 100000) {
                GridLayout.f("The sum of the start index and the span must not exceed 100000");
            }
        }
    }

    public final eol a(boolean z) {
        eol eolVar = this.d;
        return eolVar != GridLayout.b ? eolVar : this.e == BitmapDescriptorFactory.HUE_RED ? z ? GridLayout.e : GridLayout.j : GridLayout.k;
    }

    public final eou b(eor eorVar) {
        return new eou(this.b, eorVar, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eou)) {
            return false;
        }
        eou eouVar = (eou) obj;
        return this.d.equals(eouVar.d) && this.c.equals(eouVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    private eou(boolean z, eor eorVar, eol eolVar, float f) {
        this.b = z;
        this.c = eorVar;
        this.d = eolVar;
        this.e = f;
    }
}
