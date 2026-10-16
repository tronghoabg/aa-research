package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class xwv implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;
    private final xww b;

    public xwv(xww xwwVar, Object obj) {
        this.b = xwwVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xwv)) {
            return false;
        }
        xwv xwvVar = (xwv) obj;
        xww xwwVar = this.b;
        if (xwwVar.equals(xwvVar.b)) {
            return xwwVar.d(this.a, xwvVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.c(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return this.b.toString() + ".wrap(" + String.valueOf(obj) + ")";
    }
}
