package Va;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class E extends Mb {

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f13293h = {'t', 128, 127, 'v', 133, 131, 132, '>', '{', 'z', 'g'};

    /* renamed from: i, reason: collision with root package name */
    public static int f13294i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f13295j = 1;

    /* renamed from: g, reason: collision with root package name */
    public final String f13296g;

    public E(W w2) {
        t(127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0087\u0086\u0082\u0085\u0081\u0084\u0083\u0083\u0082\u0081").intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0087").intern());
        sb2.append(UUID.randomUUID().toString().replace(t((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 127, "\u0088").intern(), ""));
        this.f13296g = sb2.toString();
        this.f13539b = w2;
    }

    public static String t(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13293h;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 17);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final String u(String str) {
        JSONObject jSONObjectOptJSONObject = e().optJSONObject(t(126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0087\u0086\u0082\u0085\u0081\u0084\u0083\u0083\u0082\u0081").intern());
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            f13294i = (f13295j + 123) % 128;
        }
        f13295j = (f13294i + 9) % 128;
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject2 != null) {
            int i5 = f13295j + 21;
            f13294i = i5 % 128;
            return jSONObjectOptJSONObject2.optString(t(i5 % 2 != 0 ? 23 >> (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)) : (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0083\u0082\u008a\u0087\u0086\u0084\u008b\u0086\u0082\u0085\u0081\u0084\u0083\u0083\u0082\u0081").intern());
        }
        int i10 = f13295j + 77;
        f13294i = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final boolean x() {
        f13294i = (f13295j + 115) % 128;
        boolean zHas = e().has(t(128 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0087\u0086\u0082\u0085\u0081\u0084\u0083\u0083\u0082\u0081").intern());
        int i5 = f13294i + 45;
        f13295j = i5 % 128;
        if (i5 % 2 != 0) {
            return zHas;
        }
        throw null;
    }
}
