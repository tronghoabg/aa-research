package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zro {
    public final Object a;
    public final Object b;

    public zro(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zro)) {
            return false;
        }
        zro zroVar = (zro) obj;
        return a.C(this.a, zroVar.a) && a.C(this.b, zroVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        return "NullSafePair(" + String.valueOf(this.a) + "," + String.valueOf(obj) + ")";
    }
}
