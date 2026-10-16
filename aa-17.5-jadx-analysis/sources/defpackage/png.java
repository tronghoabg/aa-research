package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
final class png {
    final acds a;
    final boolean b;
    final boolean c;
    final int d;

    public png(acds acdsVar, boolean z, boolean z2, int i) {
        this.a = acdsVar;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof png)) {
            return false;
        }
        png pngVar = (png) obj;
        return this.a == pngVar.a && this.b == pngVar.b && this.c == pngVar.c && this.d == pngVar.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d));
    }
}
