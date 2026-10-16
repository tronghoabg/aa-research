package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hum implements defpackage.hur {
    final /* synthetic */ com.bumptech.glide.load.data.ParcelFileDescriptorRewinder a;
    final /* synthetic */ defpackage.hxu b;

    public hum(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, defpackage.hxu hxuVar) {
        this.a = parcelFileDescriptorRewinder;
        this.b = hxuVar;
    }

    @Override // defpackage.hur
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) throws java.lang.Throwable {
        defpackage.iby ibyVar;
        try {
            ibyVar = new defpackage.iby(new java.io.FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                com.bumptech.glide.load.ImageHeaderParser.ImageType imageTypeA = imageHeaderParser.a(ibyVar);
                ibyVar.b();
                this.a.a();
                return imageTypeA;
            } catch (java.lang.Throwable th) {
                th = th;
                if (ibyVar != null) {
                    ibyVar.b();
                }
                this.a.a();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            ibyVar = null;
        }
    }
}
