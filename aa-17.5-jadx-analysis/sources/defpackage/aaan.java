package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaan {
    public final long a;
    public final long b;

    public aaan(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aaan)) {
            return false;
        }
        aaan aaanVar = (aaan) obj;
        if (a.C(Long.valueOf(this.a), Long.valueOf(aaanVar.a))) {
            if (a.C(Long.valueOf(this.b), Long.valueOf(aaanVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }
}
