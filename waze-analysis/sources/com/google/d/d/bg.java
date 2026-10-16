package com.google.d.d;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class bg<E> {
    bg() {
    }

    static int e(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i3 <= i2) {
            return i2;
        }
        int i4 = i2 + (i2 >> 1) + 1;
        if (i4 < i3) {
            int iHighestOneBit = Integer.highestOneBit(i3 - 1);
            i4 = iHighestOneBit + iHighestOneBit;
        }
        if (i4 < 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    public abstract void b(Object obj);

    public void d(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
