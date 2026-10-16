package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icf implements defpackage.icg {
    private final /* synthetic */ int a;

    public icf(int i) {
        this.a = i;
    }

    @Override // defpackage.icg
    public final /* synthetic */ void a(android.media.MediaExtractor mediaExtractor, java.lang.Object obj) throws java.io.IOException {
        int i = this.a;
        if (i == 0) {
            mediaExtractor.setDataSource(new defpackage.ice((java.nio.ByteBuffer) obj));
        } else if (i != 1) {
            mediaExtractor.setDataSource(((android.os.ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            android.content.res.AssetFileDescriptor assetFileDescriptor = (android.content.res.AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @Override // defpackage.icg
    public final /* synthetic */ void b(android.media.MediaMetadataRetriever mediaMetadataRetriever, java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            mediaMetadataRetriever.setDataSource(new defpackage.ice((java.nio.ByteBuffer) obj));
        } else if (i != 1) {
            mediaMetadataRetriever.setDataSource(((android.os.ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            android.content.res.AssetFileDescriptor assetFileDescriptor = (android.content.res.AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }
}
