package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static int f14546b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14547c = 1;

    /* renamed from: a, reason: collision with root package name */
    public C1194x f14548a;

    public r(C1194x c1194x) {
        this.f14548a = c1194x;
    }

    public static String b(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 9032285313147363625L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static JSONObject c(ISAdQualitySegment iSAdQualitySegment) throws JSONException {
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                jSONObject.put(b(ExpandableListView.getPackedPositionGroup(0L) + 17291, "慚⋅\ue651ꯥ").intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                int i5 = f14546b + 71;
                f14547c = i5 % 128;
                jSONObject.put(i5 % 2 == 0 ? b(KeyEvent.normalizeMetaState(1) + 15194, "慚㣑퉼涇").intern() : b(22937 - KeyEvent.normalizeMetaState(0), "慚㣑퉼涇").intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                int i10 = f14546b + 79;
                f14547c = i10 % 128;
                jSONObject.put(i10 % 2 == 0 ? b(Color.alpha(0) + 12159, "慚‗\ue3feꕌ").intern() : b(16729 - Color.alpha(0), "慚‗\ue3feꕌ").intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                jSONObject.put(b(62219 - KeyEvent.normalizeMetaState(0), "慚鉎蝉롤").intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                jSONObject.put(b(ImageFormat.getBitsPerPixel(0) + 45944, "慚툮ަ笵").intern(), iSAdQualitySegment.getIsPaying().get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                jSONObject.put(b((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 52080, "慚ꨱ\uf7aå䲙").intern(), iSAdQualitySegment.getInAppPurchasesTotal());
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                f14546b = (f14547c + 45) % 128;
                jSONObject.put(b(ImageFormat.getBitsPerPixel(0) + 63930, "慚飥鈸豦").intern(), iSAdQualitySegment.getUserCreationDate());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void a(ISAdQualitySegment iSAdQualitySegment) {
        int i5 = f14546b + 119;
        f14547c = i5 % 128;
        int i10 = i5 % 2;
        C1194x c1194x = this.f14548a;
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        c1194x.x(b(i10 == 0 ? (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)) + 31425 : 674 - (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)), "慚揭搟暕毞汩溈猣瑄目笗").intern(), c(iSAdQualitySegment));
    }
}
