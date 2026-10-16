package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class ocn extends ebj implements ocq {
    private final yzz a;

    public ocn(yzz yzzVar) {
        this.a = yzzVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ocn) && Objects.equals(this.a, ((ocn) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "telemetryContext".split(";");
        StringBuilder sb = new StringBuilder("ocn[");
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

    @Override // defpackage.ocq
    public final void a() {
    }
}
