package D4;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f2322c = {"_data"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f2323d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2324a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f2325b;

    public /* synthetic */ a(ContentResolver contentResolver, int i5) {
        this.f2324a = i5;
        this.f2325b = contentResolver;
    }

    @Override // D4.c
    public final Cursor a(Uri uri) {
        switch (this.f2324a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f2325b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f2322c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f2325b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f2323d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
