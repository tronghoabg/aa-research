package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvn extends defpackage.hvr {
    @Override // defpackage.hvf
    public final java.lang.Class a() {
        return android.os.ParcelFileDescriptor.class;
    }

    @Override // defpackage.hvr
    protected final /* bridge */ /* synthetic */ java.lang.Object f(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException {
        android.content.res.AssetFileDescriptor assetFileDescriptorH = h(uri);
        if (assetFileDescriptorH != null) {
            return assetFileDescriptorH.getParcelFileDescriptor();
        }
        throw new java.io.FileNotFoundException("FileDescriptor is null for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    @Override // defpackage.hvr
    protected final /* synthetic */ void g(java.lang.Object obj) throws java.io.IOException {
        ((android.os.ParcelFileDescriptor) obj).close();
    }
}
