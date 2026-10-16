package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ibm implements com.bumptech.glide.load.ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType a(java.io.InputStream inputStream) {
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType b(java.nio.ByteBuffer byteBuffer) {
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(java.io.InputStream inputStream, defpackage.hxu hxuVar) throws java.io.IOException {
        int iB = new defpackage.enl(inputStream).b();
        if (iB == 0) {
            return -1;
        }
        return iB;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(java.nio.ByteBuffer byteBuffer, defpackage.hxu hxuVar) throws java.io.IOException {
        int i = defpackage.ift.a;
        return c(new defpackage.ifs(byteBuffer), hxuVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean e(java.io.InputStream inputStream, defpackage.hxu hxuVar) throws java.io.IOException {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean f(java.nio.ByteBuffer byteBuffer, defpackage.hxu hxuVar) throws java.io.IOException {
        return false;
    }
}
