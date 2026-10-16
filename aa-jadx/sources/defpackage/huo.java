package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class huo implements defpackage.hup {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public huo(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, defpackage.hxu hxuVar, int i) {
        this.c = i;
        this.b = parcelFileDescriptorRewinder;
        this.a = hxuVar;
    }

    @Override // defpackage.hup
    public final boolean a(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.lang.Throwable {
        defpackage.iby ibyVar;
        int i = this.c;
        if (i == 0) {
            try {
                return imageHeaderParser.e((java.io.InputStream) this.a, (defpackage.hxu) this.b);
            } finally {
                ((java.io.InputStream) this.a).reset();
            }
        }
        if (i == 1) {
            try {
                return imageHeaderParser.f((java.nio.ByteBuffer) this.a, (defpackage.hxu) this.b);
            } finally {
                defpackage.ift.b((java.nio.ByteBuffer) this.a);
            }
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(((com.bumptech.glide.load.data.ParcelFileDescriptorRewinder) this.b).a().getFileDescriptor());
            java.lang.Object obj = this.a;
            ibyVar = new defpackage.iby(fileInputStream, (defpackage.hxu) obj);
            try {
                boolean zE = imageHeaderParser.e(ibyVar, (defpackage.hxu) obj);
                ibyVar.b();
                ((com.bumptech.glide.load.data.ParcelFileDescriptorRewinder) this.b).a();
                return zE;
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

    public huo(java.lang.Object obj, defpackage.hxu hxuVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = hxuVar;
    }
}
