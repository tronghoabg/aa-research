package defpackage;

/* loaded from: classes2.dex */
public final class eor {
    public final int a;
    public final int b;

    public eor(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eor eorVar = (eor) obj;
        return this.b == eorVar.b && this.a == eorVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}
