package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class aaav {
    public final double[] a;
    public final List b;

    public aaav(double[] dArr, List list) {
        this.a = dArr;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaav)) {
            return false;
        }
        aaav aaavVar = (aaav) obj;
        return Arrays.equals(this.a, aaavVar.a) && a.C(this.b, aaavVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("coords", Arrays.toString(this.a));
        zsaVarA.b("lineEndIndices", this.b);
        return zsaVarA.toString();
    }
}
