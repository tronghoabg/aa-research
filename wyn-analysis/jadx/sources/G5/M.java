package G5;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class M extends y {
    @Override // G5.y
    public final C0530k a(C0530k c0530k) throws C0531l {
        int i5 = c0530k.f4424c;
        if (i5 == 3 || i5 == 2 || i5 == 268435456 || i5 == 536870912 || i5 == 805306368 || i5 == 4) {
            return i5 != 2 ? new C0530k(c0530k.f4422a, c0530k.f4423b, 2) : C0530k.f4421e;
        }
        throw new C0531l(c0530k);
    }

    @Override // G5.InterfaceC0532m
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        int i10 = this.f4485b.f4424c;
        if (i10 == 3) {
            i5 *= 2;
        } else if (i10 == 4) {
            i5 /= 2;
        } else if (i10 != 268435456) {
            if (i10 != 536870912) {
                if (i10 != 805306368) {
                    throw new IllegalStateException();
                }
                i5 /= 2;
            } else {
                i5 /= 3;
                i5 *= 2;
            }
        }
        ByteBuffer byteBufferJ = j(i5);
        int i11 = this.f4485b.f4424c;
        if (i11 == 3) {
            while (iPosition < iLimit) {
                byteBufferJ.put((byte) 0);
                byteBufferJ.put((byte) ((byteBuffer.get(iPosition) & ForkServer.ERROR) - 128));
                iPosition++;
            }
        } else if (i11 == 4) {
            while (iPosition < iLimit) {
                short sG = (short) (u6.v.g(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferJ.put((byte) (sG & 255));
                byteBufferJ.put((byte) ((sG >> 8) & 255));
                iPosition += 4;
            }
        } else if (i11 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i11 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                byteBufferJ.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }
}
