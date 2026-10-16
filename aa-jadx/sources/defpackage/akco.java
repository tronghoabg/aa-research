package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akco implements defpackage.akcq {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public akco(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.akcq
    public final java.nio.channels.FileChannel a() throws java.io.IOException {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            return j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new java.io.FileInputStream((java.io.File) obj).getChannel());
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) obj;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new java.lang.IllegalArgumentException("Not a file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
    }
}
