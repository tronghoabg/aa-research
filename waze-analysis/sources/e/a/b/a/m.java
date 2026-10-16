package e.a.b.a;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    static final int f46417a;

    /* renamed from: b, reason: collision with root package name */
    private static final Queue f46418b;

    static {
        int iMax = Math.max(16384, 8192);
        f46417a = iMax;
        f46418b = new LinkedBlockingQueue(131072 / iMax);
    }

    static void a(byte[] bArr) {
        if (bArr.length == f46417a) {
            f46418b.offer(bArr);
        }
    }

    static byte[] b() {
        return c(f46417a);
    }

    static byte[] c(int i2) {
        byte[] bArr;
        return (i2 != f46417a || (bArr = (byte[]) f46418b.poll()) == null) ? new byte[i2] : bArr;
    }
}
