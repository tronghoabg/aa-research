package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class yvb implements Serializable {
    public final int a;
    public final int b;
    public final int c;
    private final int d = 1;

    public yvb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvb)) {
            return false;
        }
        yvb yvbVar = (yvb) obj;
        if (this.a != yvbVar.a || this.b != yvbVar.b || this.c != yvbVar.c) {
            return false;
        }
        int i = yvbVar.d;
        return true;
    }

    public final int hashCode() {
        return ((((((this.a + 403) * 31) + this.b) * 31) + this.c) * 31) + 1;
    }
}
