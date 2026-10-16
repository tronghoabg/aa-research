package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class ukb {
    public int a;
    private byte b;
    private int c;

    public ukb(long j) {
        this.a = (int) ((-256) & j);
        this.b = (byte) (255 & j);
        this.c = (int) (j >> 32);
    }

    public final long a() {
        return (this.a & (-256)) | (this.b & 255) | (this.c << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukb) && a() == ((ukb) obj).a();
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(a()));
    }

    public ukb() {
        this(0L);
    }
}
