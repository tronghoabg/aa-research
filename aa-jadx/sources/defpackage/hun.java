package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hun implements defpackage.huq {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public hun(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, defpackage.hxu hxuVar, int i) {
        this.c = i;
        this.b = parcelFileDescriptorRewinder;
        this.a = hxuVar;
    }

    @Override // defpackage.huq
    public final int a(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.lang.Throwable {
        defpackage.iby ibyVar;
        int i = this.c;
        if (i == 0) {
            try {
                return imageHeaderParser.c((java.io.InputStream) this.a, (defpackage.hxu) this.b);
            } finally {
                ((java.io.InputStream) this.a).reset();
            }
        }
        if (i == 1) {
            try {
                return imageHeaderParser.d((java.nio.ByteBuffer) this.a, (defpackage.hxu) this.b);
            } finally {
                defpackage.ift.b((java.nio.ByteBuffer) this.a);
            }
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(((com.bumptech.glide.load.data.ParcelFileDescriptorRewinder) this.b).a().getFileDescriptor());
            java.lang.Object obj = this.a;
            ibyVar = new defpackage.iby(fileInputStream, (defpackage.hxu) obj);
            try {
                int iC = imageHeaderParser.c(ibyVar, (defpackage.hxu) obj);
                ibyVar.b();
                ((com.bumptech.glide.load.data.ParcelFileDescriptorRewinder) this.b).a();
                return iC;
            } catch (java.lang.Throwable th) {
                th = th;
                if (ibyVar != null) {
                    ibyVar.b();
                }
                ((com.bumptech.glide.load.data.ParcelFileDescriptorRewinder) this.b).a();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            ibyVar = null;
        }
    }

    public hun(java.lang.Object obj, defpackage.hxu hxuVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = hxuVar;
    }
}
