package defpackage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
final class adpe {
    static final int a;
    private static final Queue b;

    static {
        int iMax = Math.max(16384, 8192);
        a = iMax;
        b = new LinkedBlockingQueue(131072 / iMax);
    }

    static void a(byte[] bArr) {
        if (bArr.length == a) {
            b.offer(bArr);
        }
    }

    static byte[] b() {
        return c(a);
    }

    static byte[] c(int i) {
        byte[] bArr;
        return (i != a || (bArr = (byte[]) b.poll()) == null) ? new byte[i] : bArr;
    }
}
