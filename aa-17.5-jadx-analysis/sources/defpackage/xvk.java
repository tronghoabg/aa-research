package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class xvk implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b = null;
    private final List c = new ArrayList();

    public xvk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xvk)) {
            return false;
        }
        xvk xvkVar = (xvk) obj;
        if (Objects.equals(this.a, xvkVar.a)) {
            Long l = xvkVar.b;
            if (Objects.equals(null, null) && Objects.equals(this.c, xvkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null, this.c);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("tokenValue", this.a);
        xxgVarAo.b("expirationTimeMillis", null);
        xxgVarAo.b("scopes", this.c);
        return xxgVarAo.toString();
    }
}
