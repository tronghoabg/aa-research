package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final class gua implements hju {
    public final gfa a;
    public final gfa b;
    public final Long c;
    public final afdr d;
    public final gab e;
    public final List f;
    private final float g = BitmapDescriptorFactory.HUE_RED;

    public gua(gfa gfaVar, gfa gfaVar2, Long l, afdr afdrVar, gab gabVar, List list) {
        this.a = gfaVar;
        this.b = gfaVar2;
        this.c = l;
        this.d = afdrVar;
        this.e = gabVar;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gua)) {
            return false;
        }
        gua guaVar = (gua) obj;
        if (!affa.f(this.a, guaVar.a) || !affa.f(this.b, guaVar.b)) {
            return false;
        }
        float f = guaVar.g;
        return Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && affa.f(this.c, guaVar.c) && affa.f(this.d, guaVar.d) && affa.f(this.e, guaVar.e) && affa.f(this.f, guaVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        Long l = this.c;
        int iHashCode2 = ((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31;
        afdr afdrVar = this.d;
        int iHashCode3 = (iHashCode2 + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        gab gabVar = this.e;
        return ((iHashCode3 + (gabVar != null ? gabVar.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "AlertCardUiModel(primaryText=" + this.a + ", secondaryText=" + this.b + ", currentProgress=0.0, durationMillis=" + this.c + ", getProgress=" + this.d + ", icon=" + this.e + ", actions=" + this.f + ")";
    }
}
