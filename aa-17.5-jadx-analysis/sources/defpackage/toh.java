package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class toh implements Serializable {
    public final int a;
    public final int b;
    public final int c;

    public toh(too tooVar) {
        this.a = tooVar.a;
        this.b = tooVar.b;
        this.c = tooVar.c;
    }

    public final too a() {
        return new too(this.a, this.b, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof toh) {
            toh tohVar = (toh) obj;
            if (this.a == tohVar.a && this.b == tohVar.b && this.c == tohVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ImmutablePoint{(" + this.a + "," + this.b + "," + this.c + ")}";
    }

    public toh(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public toh(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = 0;
    }
}
