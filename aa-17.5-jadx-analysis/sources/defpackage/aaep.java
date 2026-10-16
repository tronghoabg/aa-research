package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaep {
    public static final aaep a = new aaep(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public aaep(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaep)) {
            return false;
        }
        aaep aaepVar = (aaep) obj;
        return this.b == aaepVar.b && this.c == aaepVar.c && this.d == aaepVar.d && this.e == aaepVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.e("left", this.b);
        zsaVarA.e("top", this.c);
        zsaVarA.e("right", this.d);
        zsaVarA.e("bottom", this.e);
        return zsaVarA.toString();
    }
}
