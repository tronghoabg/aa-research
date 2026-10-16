package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxx implements java.lang.Comparable, java.io.Serializable {
    public static final defpackage.uxx a = new defpackage.uxx(-1);
    public static final defpackage.uxx b = a(new long[0]);
    private final long c;

    private uxx(long j) {
        this.c = j;
    }

    public static defpackage.uxx a(long... jArr) {
        long j = 0;
        for (int i = 0; i < jArr.length; i = 1) {
            j |= 1 << ((int) jArr[0]);
        }
        return new defpackage.uxx(j);
    }

    public final boolean b(long j) {
        return ((1 << ((int) j)) & this.c) != 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Long.compare(this.c ^ Long.MIN_VALUE, ((defpackage.uxx) obj).c ^ Long.MIN_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.uxx) && ((defpackage.uxx) obj).c == this.c;
    }

    public final int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
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
