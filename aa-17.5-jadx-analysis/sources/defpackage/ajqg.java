package defpackage;

import java.io.Serializable;
import java.security.Principal;

/* loaded from: classes2.dex */
public final class ajqg implements Principal, Serializable {
    private static final long serialVersionUID = -2266305184969850467L;
    public final String a;

    public ajqg(String str) {
        ahgm.e(str, "User name");
        this.a = str;
    }

    @Override // java.security.Principal
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajqg) && a.ao(this.a, ((ajqg) obj).a);
    }

    @Override // java.security.Principal
    public final String getName() {
        return this.a;
    }

    @Override // java.security.Principal
    public final int hashCode() {
        return ahku.c(17, this.a);
    }

    @Override // java.security.Principal
    public final String toString() {
        return "[principal: " + this.a + "]";
    }
}
