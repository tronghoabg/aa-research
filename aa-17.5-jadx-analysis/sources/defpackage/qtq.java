package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public final class qtq {
    public final Deque a;
    public final SparseArray b = new SparseArray();
    public final int c;
    private final int d;

    public qtq(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.a = new ArrayDeque(i);
    }

    public static int a(int i) {
        if (i == 17) {
            return 66;
        }
        if (i == 33) {
            return 130;
        }
        if (i == 66) {
            return 17;
        }
        if (i == 130) {
            return 33;
        }
        throw new IllegalArgumentException(a.bp(i, "Unsupported direction: "));
    }

    public final void b() {
        this.b.clear();
    }

    public final boolean c(long j) {
        int i = this.d;
        if (i >= 0) {
            return i != 0 && SystemClock.elapsedRealtime() - j <= ((long) i);
        }
        return true;
    }

    public final boolean d(long j, View view, View view2) {
        return (!c(j) || view == null || view2 == null) ? false : true;
    }
}
