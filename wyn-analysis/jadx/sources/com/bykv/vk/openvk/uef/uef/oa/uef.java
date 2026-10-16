package com.bykv.vk.openvk.uef.uef.oa;

import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.bykv.vk.openvk.uef.uef.uef.uef.oa;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef {
    private static int bcc = 8192;
    private static boolean ivm = false;
    private static oa lw = null;
    public static int moa = 10;

    /* renamed from: oa, reason: collision with root package name */
    public static int f24494oa = 10;
    public static int uef = 50;
    private static int xs = 1;
    public static int yo = 10;

    public static int ivm() {
        return xs;
    }

    public static int lw() {
        return moa;
    }

    public static int moa() {
        return yo;
    }

    public static boolean oa(String str) {
        return ivm && str != null && str.endsWith(".mp4");
    }

    public static void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            uef = jSONObject.optInt("splash", 50);
            f24494oa = jSONObject.optInt("reward", 10);
            yo = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            moa = iOptInt;
            if (uef < 0) {
                uef = 50;
            }
            if (f24494oa < 0) {
                f24494oa = 10;
            }
            if (yo < 0) {
                yo = 10;
            }
            if (iOptInt < 0) {
                moa = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static int xs() {
        return bcc;
    }

    public static int yo() {
        return f24494oa;
    }

    public static int oa() {
        return uef;
    }

    public static void uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ivm = jSONObject.optInt("check_moov", 0) == 1;
            xs = jSONObject.optInt("new_media_source", 1);
            bcc = jSONObject.optInt("read_buffer_size_k", 8) * Segment.SHARE_MINIMUM;
        } catch (JSONException unused) {
        }
    }

    public static void uef(oa oaVar) {
        lw = oaVar;
    }

    public static void uef() {
        oa oaVar = lw;
        if (oaVar != null) {
            oaVar.moa();
        }
    }
}
