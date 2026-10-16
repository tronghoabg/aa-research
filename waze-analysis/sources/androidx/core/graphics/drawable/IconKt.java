package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class IconKt {
    public static final Icon toAdaptiveIcon(Bitmap bitmap) {
        x.f(bitmap, "<this>");
        Icon iconCreateWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        x.e(iconCreateWithAdaptiveBitmap, "createWithAdaptiveBitmap(...)");
        return iconCreateWithAdaptiveBitmap;
    }

    public static final Icon toIcon(byte[] bArr) {
        x.f(bArr, "<this>");
        Icon iconCreateWithData = Icon.createWithData(bArr, 0, bArr.length);
        x.e(iconCreateWithData, "createWithData(...)");
        return iconCreateWithData;
    }

    public static final Icon toIcon(Uri uri) {
        x.f(uri, "<this>");
        Icon iconCreateWithContentUri = Icon.createWithContentUri(uri);
        x.e(iconCreateWithContentUri, "createWithContentUri(...)");
        return iconCreateWithContentUri;
    }

    public static final Icon toIcon(Bitmap bitmap) {
        x.f(bitmap, "<this>");
        Icon iconCreateWithBitmap = Icon.createWithBitmap(bitmap);
        x.e(iconCreateWithBitmap, "createWithBitmap(...)");
        return iconCreateWithBitmap;
    }
}
