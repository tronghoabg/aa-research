package com.bytedance.sdk.openadsdk.core.dz;

import com.bytedance.sdk.openadsdk.core.dz.oa.yo;
import com.bytedance.sdk.openadsdk.core.dz.yo.uef;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes3.dex */
public class yo {
    protected String bcc;
    protected List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> ivm;
    protected String lw;
    protected uef.oa moa;

    /* renamed from: oa, reason: collision with root package name */
    protected int f25600oa;
    protected int uef;
    private gzw wrv;
    protected List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> xs;
    protected uef.EnumC0097uef yo;
    private String zjm;
    private final AtomicBoolean dj = new AtomicBoolean(false);
    protected String cz = "endcard_click";

    /* renamed from: com.bytedance.sdk.openadsdk.core.dz.yo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[uef.oa.values().length];
            uef = iArr;
            try {
                iArr[uef.oa.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[uef.oa.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[uef.oa.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public yo(int i5, int i10, uef.EnumC0097uef enumC0097uef, uef.oa oaVar, String str, List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list, List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list2, String str2) {
        this.ivm = new ArrayList();
        this.xs = new ArrayList();
        this.uef = i5;
        this.f25600oa = i10;
        this.yo = enumC0097uef;
        this.moa = oaVar;
        this.lw = str;
        this.ivm = list;
        this.xs = list2;
        this.bcc = str2;
    }

    public String lw() {
        return this.lw;
    }

    public String moa() {
        if (this.moa == uef.oa.STATIC_RESOURCE && this.yo == uef.EnumC0097uef.IMAGE) {
            return this.lw;
        }
        return null;
    }

    public int oa() {
        return this.f25600oa;
    }

    public int uef() {
        return this.uef;
    }

    public String yo() {
        int i5 = AnonymousClass1.uef[this.moa.ordinal()];
        if (i5 == 1) {
            uef.EnumC0097uef enumC0097uef = this.yo;
            if (enumC0097uef == uef.EnumC0097uef.IMAGE) {
                return b.c(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.lw, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0097uef == uef.EnumC0097uef.JAVASCRIPT) {
                return b.c(new StringBuilder("<script src=\""), this.lw, "\"></script>");
            }
            return null;
        }
        if (i5 == 2) {
            return this.lw;
        }
        if (i5 != 3) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb2.append(this.uef);
        sb2.append("\" height=\"");
        sb2.append(this.f25600oa);
        sb2.append("\" src=\"");
        return b.c(sb2, this.lw, "\"></iframe>");
    }

    public void oa(long j8) {
        if (this.dj.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.dz.oa.yo.oa((gzw) null, this.xs, (com.bytedance.sdk.openadsdk.core.dz.uef.uef) null, j8, this.zjm, (String) null);
        }
    }

    public void uef(long j8) {
        com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(null, this.ivm, null, j8, this.zjm, new yo.oa(this.cz, this.wrv), null);
    }

    public static float uef(int i5, int i10, int i11, int i12, uef.oa oaVar, uef.EnumC0097uef enumC0097uef) {
        if (i10 == 0 || i12 == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = i5;
        float f11 = i11;
        return uef(oaVar, enumC0097uef) / ((Math.abs((f10 - f11) / f10) + Math.abs((f10 / i10) - (f11 / i12))) + 1.0f);
    }

    public static yo oa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", uef.EnumC0097uef.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", uef.oa.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
            arrayList.add(new yo.uef(jSONArrayOptJSONArray.optString(i5)).uef());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
            arrayList2.add(new yo.uef(jSONArrayOptJSONArray2.optString(i10)).uef());
        }
        return new yo(iOptInt, iOptInt2, uef.EnumC0097uef.valueOf(strOptString), uef.oa.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float uef(uef.oa oaVar, uef.EnumC0097uef enumC0097uef) {
        int i5 = AnonymousClass1.uef[oaVar.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return 1.2f;
            }
            if (i5 != 3) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return 1.0f;
        }
        if (uef.EnumC0097uef.JAVASCRIPT.equals(enumC0097uef)) {
            return 1.0f;
        }
        if (uef.EnumC0097uef.IMAGE.equals(enumC0097uef)) {
            return 0.8f;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void uef(String str) {
        this.zjm = str;
    }

    public void uef(gzw gzwVar) {
        this.wrv = gzwVar;
    }
}
