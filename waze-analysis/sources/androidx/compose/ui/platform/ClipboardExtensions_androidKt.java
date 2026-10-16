package androidx.compose.ui.platform;

import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ClipboardExtensions_androidKt {
    public static final Uri firstUriOrNull(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            Uri uri = clipEntry.getClipData().getItemAt(i2).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}
