package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hul implements defpackage.hur {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public hul(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hur
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.io.IOException {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            try {
                return imageHeaderParser.a((java.io.InputStream) obj);
            } finally {
                ((java.io.InputStream) this.a).reset();
            }
        }
        try {
            return imageHeaderParser.b((java.nio.ByteBuffer) obj);
        } finally {
            defpackage.ift.b((java.nio.ByteBuffer) this.a);
        }
    }
}
