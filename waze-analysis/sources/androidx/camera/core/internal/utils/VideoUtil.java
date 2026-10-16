package androidx.camera.core.internal.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    private VideoUtil() {
    }

    public static String getAbsolutePathFromUri(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        Cursor cursorQuery = null;
        try {
            try {
                uri2 = uri;
                try {
                    cursorQuery = contentResolver.query(uri2, new String[]{"_data"}, null, null, null);
                    Preconditions.checkNotNull(cursorQuery);
                    Cursor cursor = cursorQuery;
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                    cursorQuery.moveToFirst();
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    cursorQuery.close();
                    return string;
                } catch (RuntimeException e2) {
                    e = e2;
                    Logger.e(TAG, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), e.toString()));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return "";
                }
            } finally {
            }
        } catch (RuntimeException e3) {
            e = e3;
            uri2 = uri;
        }
    }
}
