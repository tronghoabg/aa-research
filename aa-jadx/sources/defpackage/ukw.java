package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ukw {
    public int a;
    private byte b;
    private int c;

    public ukw(long j) {
        this.a = (int) ((-256) & j);
        this.b = (byte) (255 & j);
        this.c = (int) (j >> 32);
    }

    public final long a() {
        return ((long) ((this.a & (-256)) | (this.b & 255))) | (((long) this.c) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ukw) && a() == ((defpackage.ukw) obj).a();
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Long.valueOf(a()));
    }

    public ukw() {
        this(0L);
    }
}
