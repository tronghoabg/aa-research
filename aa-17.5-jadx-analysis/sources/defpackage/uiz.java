package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class uiz implements Serializable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public uiz(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uiz) {
            uiz uizVar = (uiz) obj;
            if (this.a == uizVar.a && this.b == uizVar.b && this.c == uizVar.c && this.d == uizVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "}";
    }

    public uiz() {
        throw null;
    }
}
