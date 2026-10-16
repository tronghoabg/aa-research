package androidx.media3.common.util;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.common.MediaMetadata;
import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface BitmapLoader {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.common.util.BitmapLoader$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static bm $default$loadBitmapFromMetadata(BitmapLoader bitmapLoader, MediaMetadata mediaMetadata) {
            byte[] bArr = mediaMetadata.artworkData;
            if (bArr != null) {
                return bitmapLoader.decodeBitmap(bArr);
            }
            Uri uri = mediaMetadata.artworkUri;
            if (uri == null) {
                return null;
            }
            return bitmapLoader.loadBitmap(uri);
        }
    }

    bm<Bitmap> decodeBitmap(byte[] bArr);

    bm<Bitmap> loadBitmap(Uri uri);

    bm<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata);

    boolean supportsMimeType(String str);
}
