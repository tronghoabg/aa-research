package androidx.media3.exoplayer.drm;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ClearKeyUtil {
    private static final String TAG = "ClearKeyUtil";

    private ClearKeyUtil() {
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        return bArr;
    }

    public static byte[] adjustResponseData(byte[] bArr) {
        return bArr;
    }

    private static String base64ToBase64Url(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String base64UrlToBase64(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
