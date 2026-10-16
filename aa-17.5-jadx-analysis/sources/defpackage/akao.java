package defpackage;

/* loaded from: classes2.dex */
public final class akao {
    public final int a;
    public int b;
    private final int c;

    public akao(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.c = i;
        this.a = i2;
        this.b = i;
    }

    public final void a(int i) {
        int i2 = this.c;
        if (i < i2) {
            throw new IndexOutOfBoundsException(a.bo(i2, i, "pos: ", " < lowerBound: "));
        }
        int i3 = this.a;
        if (i > i3) {
            throw new IndexOutOfBoundsException(a.bo(i3, i, "pos: ", " > upperBound: "));
        }
        this.b = i;
    }

    public final boolean b() {
        return this.b >= this.a;
    }

    public final String toString() {
        return "[" + Integer.toString(this.c) + '>' + Integer.toString(this.b) + '>' + Integer.toString(this.a) + ']';
    }
}
