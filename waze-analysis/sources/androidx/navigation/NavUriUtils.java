package androidx.navigation;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavUriUtils {
    public static final NavUriUtils INSTANCE = new NavUriUtils();

    private NavUriUtils() {
    }

    public static /* synthetic */ String encode$default(NavUriUtils navUriUtils, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return navUriUtils.encode(str, str2);
    }

    public final String decode(String str) {
        x.f(str, CmcdData.STREAMING_FORMAT_SS);
        String strDecode = Uri.decode(str);
        x.e(strDecode, "decode(...)");
        return strDecode;
    }

    public final String encode(String str, String str2) {
        x.f(str, CmcdData.STREAMING_FORMAT_SS);
        String strEncode = Uri.encode(str, str2);
        x.e(strEncode, "encode(...)");
        return strEncode;
    }

    public final Uri parse(String str) {
        x.f(str, "uriString");
        Uri uri = Uri.parse(str);
        x.e(uri, "parse(...)");
        return uri;
    }
}
