package defpackage;

import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jss {
    public final GoogleListTemplate a;
    public final gml b;
    public final jtb c;
    public final Map d;

    public jss(GoogleListTemplate googleListTemplate, gml gmlVar, jtb jtbVar, Map map) {
        gmlVar.getClass();
        this.a = googleListTemplate;
        this.b = gmlVar;
        this.c = jtbVar;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jss)) {
            return false;
        }
        jss jssVar = (jss) obj;
        return affa.f(this.a, jssVar.a) && this.b == jssVar.b && affa.f(this.c, jssVar.c) && affa.f(this.d, jssVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        jtb jtbVar = this.c;
        return (((iHashCode * 31) + (jtbVar == null ? 0 : jtbVar.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AlphaJumpModel(listTemplate=" + this.a + ", state=" + this.b + ", jumpKey=" + this.c + ", alphaJumpKeyIndex=" + this.d + ")";
    }
}
