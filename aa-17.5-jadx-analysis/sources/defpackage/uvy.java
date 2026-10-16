package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class uvy implements Serializable {
    public final int a;
    public final int b;

    public uvy(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a() {
        return this.a > 0 && this.b > 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uvy) {
            uvy uvyVar = (uvy) obj;
            if (this.a == uvyVar.a && this.b == uvyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public uvy() {
        throw null;
    }
}
