package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class OptionalLong {
    public static final j$.util.OptionalLong c = new j$.util.OptionalLong();
    public final boolean a;
    public final long b;

    public OptionalLong() {
        this.a = false;
        this.b = 0L;
    }

    public static j$.util.OptionalLong empty() {
        return c;
    }

    public static j$.util.OptionalLong of(long j) {
        return new j$.util.OptionalLong(j);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.util.OptionalLong)) {
            return false;
        }
        j$.util.OptionalLong optionalLong = (j$.util.OptionalLong) obj;
        boolean z = optionalLong.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == optionalLong.b;
        }
        return z2 == z;
    }

    public long getAsLong() {
        if (this.a) {
            return this.b;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public boolean isPresent() {
        return this.a;
    }

    public final java.lang.String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }

    public OptionalLong(long j) {
        this.a = true;
        this.b = j;
    }
}
