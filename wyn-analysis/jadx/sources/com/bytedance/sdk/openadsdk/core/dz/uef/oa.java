package com.bytedance.sdk.openadsdk.core.dz.uef;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.core.dz.oa.yo;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class oa {
    public uef ivm;
    public int lw;
    protected double moa;

    /* renamed from: oa, reason: collision with root package name */
    protected final Context f25595oa;
    public int uef;
    protected int yo;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public int f25596oa;
        public int uef;
        public boolean yo;
    }

    public oa(Context context, int i5, int i10) {
        this.yo = 0;
        this.moa = 0.0d;
        if (i10 > 0 && i5 > 0) {
            this.moa = i5 / i10;
        }
        float fBcc = af.bcc(context);
        if (fBcc != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i5 > 0) {
            this.yo = (int) (i5 / fBcc);
        }
        this.f25595oa = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.dz.uef uef(String str, File file, List<yo> list);

    public void uef(Exception exc, int i5) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i5);
            moa.uef().uef("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public String uef(String str, List<yo> list) throws JSONException {
        int i5 = this.uef;
        String strMoa = null;
        if (i5 >= 5) {
            return null;
        }
        this.uef = i5 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
            oaVarYo.yo(str);
            com.bytedance.sdk.component.xs.oa oaVarLw = oaVarYo.lw();
            strMoa = oaVarLw.moa();
            oaVarLw.uef();
            return strMoa;
        } catch (Exception e7) {
            uef(e7, 0);
            if (!list.isEmpty()) {
                yo.oa((gzw) null, list, com.bytedance.sdk.openadsdk.core.dz.uef.uef.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strMoa;
        }
    }
}
