package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class adle {
    public final List a;
    public final adis b;
    public final Object c;

    public adle(List list, adis adisVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        adisVar.getClass();
        this.b = adisVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adle)) {
            return false;
        }
        adle adleVar = (adle) obj;
        return Objects.equals(this.a, adleVar.a) && Objects.equals(this.b, adleVar.b) && Objects.equals(this.c, adleVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("addresses", this.a);
        xxgVarAo.b("loadBalancingPolicyConfig", this.c);
        xxgVarAo.b("attributes", this.b);
        return xxgVarAo.toString();
    }
}
