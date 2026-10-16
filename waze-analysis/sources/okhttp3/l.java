package okhttp3;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        h.g.b.x.f(str, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        h.g.b.x.f(str2, "b");
        int iMin = Math.min(str.length(), str2.length());
        for (int i2 = 4; i2 < iMin; i2++) {
            char cCharAt = str.charAt(i2);
            char cCharAt2 = str2.charAt(i2);
            if (cCharAt != cCharAt2) {
                return h.g.b.x.a(cCharAt, cCharAt2) >= 0 ? 1 : -1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length >= length2 ? 1 : -1;
        }
        return 0;
    }
}
