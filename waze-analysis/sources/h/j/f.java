package h.j;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f48136a = new e(null);

    /* renamed from: b, reason: collision with root package name */
    private static final f f48137b = h.e.c.f48070a.b();

    public float a() {
        throw null;
    }

    public abstract int b(int i2);

    public int bI(int i2, int i3) {
        int iB;
        int iC;
        if (i3 <= i2) {
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i3);
            x.f(numValueOf, TypedValues.TransitionType.S_FROM);
            x.f(numValueOf2, "until");
            throw new IllegalArgumentException("Random range is empty: [" + numValueOf + ", " + numValueOf2 + ").");
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            if (i4 != Integer.MIN_VALUE) {
                while (true) {
                    int iC2 = c();
                    if (i2 <= iC2 && iC2 < i3) {
                        return iC2;
                    }
                }
            } else {
                i4 = Integer.MIN_VALUE;
            }
        }
        if (((-i4) & i4) != i4) {
            do {
                iC = c() >>> 1;
                iB = iC % i4;
            } while ((iC - iB) + (i4 - 1) < 0);
        } else {
            iB = b(31 - Integer.numberOfLeadingZeros(i4));
        }
        return i2 + iB;
    }

    public int c() {
        throw null;
    }

    public int d(int i2) {
        throw null;
    }

    public long e() {
        throw null;
    }

    public long g() {
        long jE;
        long j2;
        do {
            jE = e() >>> 1;
            j2 = jE % 50;
        } while ((jE - j2) + 49 < 0);
        return j2 + 50;
    }
}
