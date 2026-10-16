package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class OptionalInt {
    public static final j$.util.OptionalInt c = new j$.util.OptionalInt();
    public final boolean a;
    public final int b;

    public OptionalInt() {
        this.a = false;
        this.b = 0;
    }

    public static j$.util.OptionalInt empty() {
        return c;
    }

    public static j$.util.OptionalInt of(int i) {
        return new j$.util.OptionalInt(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.util.OptionalInt)) {
            return false;
        }
        j$.util.OptionalInt optionalInt = (j$.util.OptionalInt) obj;
        boolean z = optionalInt.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == optionalInt.b;
        }
        return z2 == z;
    }

    public int getAsInt() {
        if (this.a) {
            return this.b;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public void ifPresent(java.util.function.IntConsumer intConsumer) {
        if (this.a) {
            intConsumer.accept(this.b);
        }
    }

    public boolean isPresent() {
        return this.a;
    }

    public int orElse(int i) {
        return this.a ? this.b : i;
    }

    public j$.util.stream.IntStream stream() {
        if (!this.a) {
            j$.util.u0 u0Var = j$.util.Spliterators.b;
            return new j$.util.stream.s(u0Var, j$.util.stream.u3.l(u0Var), false);
        }
        j$.util.stream.q4 q4Var = new j$.util.stream.q4();
        q4Var.b = this.b;
        q4Var.a = -2;
        return new j$.util.stream.s(q4Var, j$.util.stream.u3.l(q4Var), false);
    }

    public final java.lang.String toString() {
        if (!this.a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.b + "]";
    }

    public OptionalInt(int i) {
        this.a = true;
        this.b = i;
    }
}
