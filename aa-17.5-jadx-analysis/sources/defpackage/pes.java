package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pes extends ebj implements pet {
    public final ozz a;

    public pes(ozz ozzVar) {
        this.a = ozzVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pes) && Objects.equals(this.a, ((pes) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "connectedConnection".split(";");
        StringBuilder sb = new StringBuilder("pes[");
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
}
