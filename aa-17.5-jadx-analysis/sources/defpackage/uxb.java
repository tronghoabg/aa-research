package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class uxb implements Comparable, Serializable {
    public static final uxb a = new uxb(-1);
    public static final uxb b = a(new long[0]);
    private final long c;

    private uxb(long j) {
        this.c = j;
    }

    public static uxb a(long... jArr) {
        long j = 0;
        for (int i = 0; i < jArr.length; i = 1) {
            j |= 1 << ((int) jArr[0]);
        }
        return new uxb(j);
    }

    public final boolean b(long j) {
        return ((1 << ((int) j)) & this.c) != 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.c ^ Long.MIN_VALUE, ((uxb) obj).c ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uxb) && ((uxb) obj).c == this.c;
    }

    public final int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (long j = 0; j <= 63; j++) {
            if (b(j)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(j);
                z = false;
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
