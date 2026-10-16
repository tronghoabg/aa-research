package G5;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class I extends y {

    /* renamed from: i, reason: collision with root package name */
    public static final int f4312i = Float.floatToIntBits(Float.NaN);

    @Override // G5.y
    public final C0530k a(C0530k c0530k) throws C0531l {
        int i5 = c0530k.f4424c;
        if (i5 == 536870912 || i5 == 805306368 || i5 == 4) {
            return i5 != 4 ? new C0530k(c0530k.f4422a, c0530k.f4423b, 4) : C0530k.f4421e;
        }
        throw new C0531l(c0530k);
    }

    @Override // G5.InterfaceC0532m
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        int i10 = this.f4485b.f4424c;
        int i11 = f4312i;
        if (i10 == 536870912) {
            byteBufferJ = j((i5 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(iPosition) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i11) {
                    iFloatToIntBits = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                byteBufferJ.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i10 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i5);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(iPosition) & ForkServer.ERROR) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition + 3) & ForkServer.ERROR) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i11) {
                    iFloatToIntBits2 = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                byteBufferJ.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }
}
