package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
public final class adzm {
    public final String a;
    public final Map b;

    public adzm(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adzm) {
            adzm adzmVar = (adzm) obj;
            if (this.a.equals(adzmVar.a) && this.b.equals(adzmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("policyName", this.a);
        xxgVarAo.b("rawConfigValue", this.b);
        return xxgVarAo.toString();
    }
}
