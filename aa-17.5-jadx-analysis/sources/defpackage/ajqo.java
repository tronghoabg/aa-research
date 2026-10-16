package defpackage;

import java.io.Serializable;
import java.security.Principal;

/* loaded from: classes2.dex */
public final class ajqo implements Serializable, ajqj {
    private static final long serialVersionUID = 243343858802739403L;
    private final ajqg a;
    private final String b;

    @Deprecated
    public ajqo(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf >= 0) {
            this.a = new ajqg(str.substring(0, iIndexOf));
            this.b = str.substring(iIndexOf + 1);
        } else {
            this.a = new ajqg(str);
            this.b = null;
        }
    }

    @Override // defpackage.ajqj
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ajqj
    public final Principal b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajqo) && a.ao(this.a, ((ajqo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
