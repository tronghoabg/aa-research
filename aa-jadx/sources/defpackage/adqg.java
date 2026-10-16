package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adqg {
    static final int a = 16384;
    private static final java.util.Queue b = new java.util.concurrent.LinkedBlockingQueue(8);

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
