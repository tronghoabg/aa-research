package defpackage;

/* loaded from: classes.dex */
public final class yz {
    public Object[] a;
    public int b;
    public int c;
    public int d;

    public yz() {
        int i = 10;
        if (Integer.bitCount(10) != 1) {
            int iHighestOneBit = Integer.highestOneBit(9);
            i = iHighestOneBit + iHighestOneBit;
        }
        this.d = i - 1;
        this.a = new Object[i];
    }

    public final int a() {
        return this.d & (this.c - this.b);
    }
}
