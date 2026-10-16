package Ra;

import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f10570a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f10571b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f10572c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i5, int i10, int i11, int i12) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i5 / f10572c);
            jSONObject.put("y", i10 / f10572c);
            jSONObject.put("width", i11 / f10572c);
            jSONObject.put("height", i12 / f10572c);
            return jSONObject;
        } catch (JSONException e7) {
            Log.e("OMIDLIB", "Error with creating viewStateObject", e7);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e7) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + "]", e7);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject) throws JSONException {
        float f10;
        float f11;
        if (f10570a != null) {
            Point point = new Point(0, 0);
            f10570a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f10572c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5 A[EDGE_INSN: B:63:0x00e5->B:65:0x00ea BREAK  A[LOOP:1: B:59:0x00d1->B:64:0x00e7]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(org.json.JSONObject r8, org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.b.e(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
