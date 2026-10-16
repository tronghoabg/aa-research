package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvv implements defpackage.hvx {
    private static final java.lang.String[] a = {"_data"};
    private final android.content.ContentResolver b;

    public hvv(android.content.ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.hvx
    public final android.database.Cursor a(android.net.Uri uri) {
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        return this.b.query(android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new java.lang.String[]{lastPathSegment}, null);
    }
}
