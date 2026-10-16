package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class dtu {
    public final dts a;
    public final String b;
    public final int c;

    public dtu(dts dtsVar, CharSequence charSequence, int i) {
        this.a = dtsVar;
        charSequence.getClass();
        this.b = dsx.d(charSequence);
        ebe.j(!roc.Y(r1), "Metric label is required");
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtu)) {
            return false;
        }
        dtu dtuVar = (dtu) obj;
        if (this == dtuVar) {
            return true;
        }
        return Objects.equals(this.a, dtuVar.a) && Objects.equals(this.b, dtuVar.b) && this.c == dtuVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        return "Metric{mValue=" + this.a + ", mLabel=" + this.b + ", mSemanticStyle=" + this.c + "}";
    }
}
