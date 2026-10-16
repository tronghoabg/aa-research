package W1;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class y extends O1.e {

    /* renamed from: i, reason: collision with root package name */
    public static final int f15132i = Float.floatToIntBits(Float.NaN);

    public static void k(int i5, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i5 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f15132i) {
            iFloatToIntBits = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // O1.d
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        int i10 = this.f8807b.f8804c;
        if (i10 == 21) {
            byteBufferJ = j((i5 / 3) * 4);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else if (i10 == 22) {
            byteBufferJ = j(i5);
            while (iPosition < iLimit) {
                k((byteBuffer.get(iPosition) & ForkServer.ERROR) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition + 3) & ForkServer.ERROR) << 24), byteBufferJ);
                iPosition += 4;
            }
        } else if (i10 == 1342177280) {
            byteBufferJ = j((i5 / 3) * 4);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition) & ForkServer.ERROR) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i10 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i5);
            while (iPosition < iLimit) {
                k((byteBuffer.get(iPosition + 3) & ForkServer.ERROR) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition) & ForkServer.ERROR) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // O1.e
    public final O1.b f(O1.b bVar) throws O1.c {
        int i5 = bVar.f8804c;
        if (i5 == 21 || i5 == 1342177280 || i5 == 22 || i5 == 1610612736 || i5 == 4) {
            return i5 != 4 ? new O1.b(bVar.f8802a, bVar.f8803b, 4) : O1.b.f8801e;
        }
        throw new O1.c(bVar);
    }
}
