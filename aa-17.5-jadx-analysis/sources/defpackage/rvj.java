package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class rvj {
    public static final rvj a = new rvj();
    private final List b = new ArrayList(10);
    private final List c = new ArrayList(20);
    private final List d = new ArrayList(120);

    private rvj() {
        for (int i = 0; i < 5; i++) {
            this.b.add(ByteBuffer.allocateDirect(262144));
        }
        for (int i2 = 0; i2 < 10; i2++) {
            this.c.add(ByteBuffer.allocateDirect(16384));
        }
        for (int i3 = 0; i3 < 60; i3++) {
            this.d.add(ByteBuffer.allocateDirect(sk.AUDIO_CONTENT_BUFFER_SIZE));
        }
    }

    private final List c(int i) {
        return i <= 512 ? this.d : i <= 16384 ? this.c : this.b;
    }

    public final ByteBuffer a(int i) {
        ByteBuffer byteBufferAllocateDirect;
        List listC = c(i);
        synchronized (listC) {
            byteBufferAllocateDirect = null;
            if (!listC.isEmpty()) {
                int size = listC.size();
                ByteBuffer byteBuffer = (ByteBuffer) listC.remove(size - 1);
                if (byteBuffer.capacity() >= i) {
                    byteBufferAllocateDirect = byteBuffer;
                } else {
                    int i2 = size - 2;
                    while (true) {
                        if (i2 < 0) {
                            break;
                        }
                        if (((ByteBuffer) listC.get(i2)).capacity() >= i) {
                            byteBufferAllocateDirect = (ByteBuffer) listC.get(i2);
                            listC.set(i2, byteBuffer);
                            break;
                        }
                        i2--;
                    }
                    if (byteBufferAllocateDirect == null) {
                        listC.add(byteBuffer);
                    }
                }
            }
            if (byteBufferAllocateDirect == null) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
            }
        }
        byteBufferAllocateDirect.limit(i);
        return byteBufferAllocateDirect;
    }

    public final void b(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        byteBuffer.rewind();
        List listC = c(iCapacity);
        int i = iCapacity <= 512 ? 120 : iCapacity <= 16384 ? 20 : 10;
        synchronized (listC) {
            if (listC.size() < i) {
                listC.add(byteBuffer);
            } else {
                listC.set(Math.abs(System.identityHashCode(byteBuffer)) % i, byteBuffer);
            }
        }
    }
}
