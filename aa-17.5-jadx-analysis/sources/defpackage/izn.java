package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* loaded from: classes.dex */
public final class izn extends ebj {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final Optional d;

    public izn(boolean z, boolean z2, int i, Optional optional) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = optional;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof izn) {
            izn iznVar = (izn) obj;
            if (this.a == iznVar.a && this.b == iznVar.b && this.c == iznVar.c && Objects.equals(this.d, iznVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((a.f(this.a) * 31) + a.f(this.b)) * 31) + this.c) * 31) + Objects.hashCode(this.d);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d};
        String[] strArrSplit = "isEncrypted;isMediaPayload;callbackId;maxUnackedDuration".split(";");
        StringBuilder sb = new StringBuilder("izn[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public izn(boolean z, boolean z2, int i) {
        this(z, z2, i, Optional.empty());
    }
}
