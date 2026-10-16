package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwc {
    public static final defpackage.rwc a = new defpackage.rwc();
    private final java.util.List b = new java.util.ArrayList(10);
    private final java.util.List c = new java.util.ArrayList(20);
    private final java.util.List d = new java.util.ArrayList(120);

    private rwc() {
        for (int i = 0; i < 5; i++) {
            this.b.add(java.nio.ByteBuffer.allocateDirect(262144));
        }
        for (int i2 = 0; i2 < 10; i2++) {
            this.c.add(java.nio.ByteBuffer.allocateDirect(16384));
        }
        for (int i3 = 0; i3 < 60; i3++) {
            this.d.add(java.nio.ByteBuffer.allocateDirect(512));
        }
    }

    private final java.util.List c(int i) {
        if (i <= 512) {
            return this.d;
        }
        return i <= 16384 ? this.c : this.b;
    }

    public final java.nio.ByteBuffer a(int i) {
        java.nio.ByteBuffer byteBufferAllocateDirect;
        java.util.List listC = c(i);
        synchronized (listC) {
            byteBufferAllocateDirect = null;
            if (!listC.isEmpty()) {
                int size = listC.size();
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) listC.remove(size - 1);
                if (byteBuffer.capacity() >= i) {
                    byteBufferAllocateDirect = byteBuffer;
                } else {
                    for (int i2 = size - 2; i2 >= 0; i2--) {
                        if (((java.nio.ByteBuffer) listC.get(i2)).capacity() >= i) {
                            byteBufferAllocateDirect = (java.nio.ByteBuffer) listC.get(i2);
                            listC.set(i2, byteBuffer);
                            break;
                        }
                    }
                    if (byteBufferAllocateDirect == null) {
                        listC.add(byteBuffer);
                    }
                }
            }
            if (byteBufferAllocateDirect == null) {
                byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(i);
            }
        }
        byteBufferAllocateDirect.limit(i);
        return byteBufferAllocateDirect;
    }

    public final void b(java.nio.ByteBuffer byteBuffer) {
        int i;
        int iCapacity = byteBuffer.capacity();
        byteBuffer.rewind();
        java.util.List listC = c(iCapacity);
        if (iCapacity <= 512) {
            i = 120;
        } else {
            i = iCapacity <= 16384 ? 20 : 10;
        }
        synchronized (listC) {
            if (listC.size() < i) {
                listC.add(byteBuffer);
            } else {
                listC.set(java.lang.Math.abs(java.lang.System.identityHashCode(byteBuffer)) % i, byteBuffer);
            }
        }
    }
}
