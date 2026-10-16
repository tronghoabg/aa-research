package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ibd implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, hxl hxlVar) throws IOException {
        int iB = new enf(inputStream).b();
        if (iB == 0) {
            return -1;
        }
        return iB;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, hxl hxlVar) throws IOException {
        int i = ifl.a;
        return c(new ifk(byteBuffer), hxlVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean e(InputStream inputStream, hxl hxlVar) throws IOException {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean f(ByteBuffer byteBuffer, hxl hxlVar) throws IOException {
        return false;
    }
}
