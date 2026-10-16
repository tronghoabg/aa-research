package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbo {
    public final int a;
    public int b;
    private final int c;

    public akbo(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i > i2) {
            throw new java.lang.IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.c = i;
        this.a = i2;
        this.b = i;
    }

    public final void a(int i) {
        int i2 = this.c;
        if (i < i2) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bn(i2, i, "pos: ", " < lowerBound: "));
        }
        int i3 = this.a;
        if (i > i3) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bn(i3, i, "pos: ", " > upperBound: "));
        }
        this.b = i;
    }

    public final boolean b() {
        return this.b >= this.a;
    }

    public final java.lang.String toString() {
        return "[" + java.lang.Integer.toString(this.c) + '>' + java.lang.Integer.toString(this.b) + '>' + java.lang.Integer.toString(this.a) + ']';
    }
}
