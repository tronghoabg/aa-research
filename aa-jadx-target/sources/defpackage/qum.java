package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qum {
    public final java.util.Deque a;
    public final android.util.SparseArray b = new android.util.SparseArray();
    public final int c;
    private final int d;

    public qum(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.a = new java.util.ArrayDeque(i);
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
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Unsupported direction: "));
    }

    public final void b() {
        this.b.clear();
    }

    public final boolean c(long j) {
        int i = this.d;
        if (i >= 0) {
            return i != 0 && android.os.SystemClock.elapsedRealtime() - j <= ((long) i);
        }
        return true;
    }

    public final boolean d(long j, android.view.View view, android.view.View view2) {
        return (!c(j) || view == null || view2 == null) ? false : true;
    }
}
