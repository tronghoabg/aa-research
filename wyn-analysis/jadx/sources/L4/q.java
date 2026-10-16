package L4;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q implements B4.c {
    @Override // B4.c
    public final int a(InputStream inputStream, F4.f fVar) {
        int iE = new B1.h(inputStream).e();
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // B4.c
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // B4.c
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
