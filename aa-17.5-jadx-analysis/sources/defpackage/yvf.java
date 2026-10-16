package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public class yvf extends yvc {
    protected yvf(yvb yvbVar, double d) {
        super(yvbVar, d);
    }

    public final double c() {
        return a(this.a, this.b, yvd.c);
    }

    @Override // defpackage.yvc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvf) && this.a == b((yvf) obj);
    }

    @Override // defpackage.yvc
    public final int hashCode() {
        return Objects.hash(Double.valueOf(c()));
    }

    @Override // defpackage.yvc
    public final String toString() {
        return c() + "C";
    }
}
