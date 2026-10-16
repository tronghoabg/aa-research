package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xvp implements Serializable {
    public final xvk a;
    public final Map b;

    private xvp(xvk xvkVar, Map map) {
        this.a = xvkVar;
        this.b = map;
    }

    public static xvp a(xvk xvkVar, Map map) {
        yfu yfuVar = new yfu(4);
        yfuVar.e("Authorization", yfq.q("Bearer ".concat(String.valueOf(xvkVar.a))));
        yfuVar.h(map);
        return new xvp(xvkVar, yfuVar.d(true));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xvp)) {
            return false;
        }
        xvp xvpVar = (xvp) obj;
        return Objects.equals(this.b, xvpVar.b) && Objects.equals(this.a, xvpVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
