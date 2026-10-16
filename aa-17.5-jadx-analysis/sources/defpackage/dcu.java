package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class dcu {
    private final Resources.Theme a;
    private final int b;

    public dcu(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcu)) {
            return false;
        }
        dcu dcuVar = (dcu) obj;
        return affa.f(this.a, dcuVar.a) && this.b == dcuVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ")";
    }
}
