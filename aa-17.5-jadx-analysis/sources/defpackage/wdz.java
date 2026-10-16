package defpackage;

import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class wdz extends ebj {
    public final wee a;
    private final String b;
    private final ygr c;
    private final Duration d;
    private final wdy e;

    public wdz(wee weeVar, String str, ygr ygrVar, Duration duration, wdy wdyVar) {
        this.a = weeVar;
        this.b = str;
        this.c = ygrVar;
        this.d = duration;
        this.e = wdyVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wdz) {
            wdz wdzVar = (wdz) obj;
            if (Objects.equals(this.a, wdzVar.a) && Objects.equals(this.b, wdzVar.b) && Objects.equals(this.c, wdzVar.c) && Objects.equals(this.d, wdzVar.d) && Objects.equals(this.e, wdzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, this.d, this.e};
        String[] strArrSplit = "sanitizationResult;className;originalExtras;sanitizationTime;intentSource".split(";");
        StringBuilder sb = new StringBuilder("wdz[");
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
