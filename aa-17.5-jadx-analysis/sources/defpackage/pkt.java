package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pkt {
    public final long a;
    public final int b;
    private final int c;

    public pkt(int i, int i2, long j) {
        this.b = i;
        this.c = i2;
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkt)) {
            return false;
        }
        pkt pktVar = (pkt) obj;
        return this.c == pktVar.c && this.a == pktVar.a && this.b == pktVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
