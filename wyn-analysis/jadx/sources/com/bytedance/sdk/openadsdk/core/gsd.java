package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class gsd implements gzw<com.bytedance.sdk.openadsdk.moa.uef> {
    private final Context uef;

    public static class oa {

        /* renamed from: oa, reason: collision with root package name */
        public final boolean f25626oa;
        public final int uef;
        public final com.bytedance.sdk.openadsdk.core.model.lz yo;

        private oa(int i5, boolean z2, com.bytedance.sdk.openadsdk.core.model.lz lzVar) {
            this.uef = i5;
            this.f25626oa = z2;
            this.yo = lzVar;
        }

        public static oa uef(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY);
            com.bytedance.sdk.openadsdk.core.model.lz lzVar = new com.bytedance.sdk.openadsdk.core.model.lz();
            if (jSONObjectOptJSONObject != null) {
                try {
                    lzVar.uef(jSONObjectOptJSONObject.optInt("reason"));
                    lzVar.oa(jSONObjectOptJSONObject.optInt("corp_type"));
                    lzVar.yo(jSONObjectOptJSONObject.optInt("reward_amount"));
                    lzVar.uef(jSONObjectOptJSONObject.optString("reward_name"));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", th.getMessage());
                }
            }
            return new oa(iOptInt, zOptBoolean, lzVar);
        }
    }

    public static class uef {
        public final com.bytedance.sdk.openadsdk.core.model.uef bcc;
        final String cz;
        final int ivm;
        final String lw;
        final int moa;

        /* renamed from: oa, reason: collision with root package name */
        final long f25627oa;
        final int uef;
        final String xs;
        final long yo;
        final ArrayList<Integer> zjm;

        private uef(String str, int i5, int i10, String str2, int i11, String str3, com.bytedance.sdk.openadsdk.core.model.uef uefVar, long j8, long j10, ArrayList<Integer> arrayList) {
            this.uef = i5;
            this.moa = i10;
            this.lw = str2;
            this.xs = str3;
            this.bcc = uefVar;
            this.cz = str;
            this.ivm = i11;
            this.f25627oa = j8;
            this.yo = j10;
            this.zjm = arrayList;
        }

        public static uef uef(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ue ueVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString("desc");
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.uef, ArrayList<Integer>> pairUef = com.bytedance.sdk.openadsdk.core.oa.uef(jSONObject, adSlot, ueVar);
            return pairUef == null ? new uef(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new uef(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.uef) pairUef.first, jOptLong, jOptLong2, (ArrayList) pairUef.second);
        }
    }

    public gsd(Context context) {
        this.uef = context;
    }

    private boolean ivm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    private Map<String, String> lw(JSONObject jSONObject) {
        HashMap mapL = AbstractC1593a.l("Content-Type", "application/json; charset=utf-8");
        if (yo(jSONObject)) {
            mapL.put(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
        }
        return mapL;
    }

    private boolean moa(String str) {
        if (com.bytedance.sdk.openadsdk.core.cz.oa.uef()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.cz.oa.uef(str)) {
            return false;
        }
        String strOa = com.bytedance.sdk.openadsdk.core.cz.oa.oa();
        if (!TextUtils.isEmpty(strOa)) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(strOa, System.currentTimeMillis());
        }
        return true;
    }

    @DungeonFlag
    private JSONObject oa(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ue ueVar, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = uef(PangleEncryptConstant.CryptDataScene.GET_ADS, uef(adSlot, ueVar, i5));
            if (jSONObject == null) {
                return jSONObject;
            }
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("oversea_version_type", 1);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("body data exception", th);
            return jSONObject;
        }
    }

    @DungeonFlag
    private void xs(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.gb.ivm());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.gb.xs());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.gb.bcc());
        } catch (Exception unused) {
        }
    }

    private boolean yo(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    public static JSONArray yo(String str) throws JSONException {
        try {
            Set<com.bytedance.sdk.openadsdk.core.cq.uef.uef> setUef = com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef(str);
            if (setUef != null && setUef.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.cq.uef.uef uefVar : setUef) {
                    if (uefVar != null && !TextUtils.isEmpty(uefVar.lw())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = uefVar.uef().split(Constants.USER_ID_SEPARATOR);
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", uefVar.oa());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.uef("NetApiImpl", "getUgenParentTplIds: ", e7);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public JSONObject uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ue ueVar, int i5) throws JSONException {
        int i10;
        int i11;
        String strConcat;
        int i12;
        JSONObject jSONObject = new JSONObject();
        String strLw = (ueVar == null || TextUtils.isEmpty(ueVar.uef)) ? com.bytedance.sdk.openadsdk.utils.gb.lw() : ueVar.uef;
        if (i5 == 7) {
            if (ueVar != null && (i12 = ueVar.f25711oa) > 0) {
                jSONObject.put("req_type", i12);
            }
        } else if (i5 == 8) {
            if (ueVar != null && (i11 = ueVar.yo) > 0) {
                jSONObject.put("req_type", i11);
            }
        } else if (i5 == 3 && ueVar != null && (i10 = ueVar.moa) > 0) {
            jSONObject.put("req_type", i10);
        }
        try {
            String strZjm = sy.moa().zjm();
            String strCp = sy.moa().cp();
            if (strZjm != null && strCp != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", strZjm);
                jSONObject2.put("param", strCp);
                jSONObject.put("abtest", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        jSONObject.put("request_id", strLw);
        com.bytedance.sdk.openadsdk.utils.gb.uef(jSONObject);
        jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.zjm.cq.yo());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.zjm.cq.moa());
        jSONObject.put("source_type", "app");
        String strUef = cq.uef(this.uef);
        if (!TextUtils.isEmpty(strUef)) {
            try {
                jSONObject.put("did", Long.parseLong(strUef));
            } catch (Throwable unused2) {
            }
        }
        jSONObject.put("app", oa());
        jSONObject.put("device", DeviceUtils.uef(this.uef, true));
        jSONObject.put("user", uef(adSlot));
        jSONObject.put("ua", com.bytedance.sdk.openadsdk.utils.gb.moa());
        jSONObject.put("channel", "main");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(uef(adSlot, i5, ueVar));
        jSONObject.put("adslots", jSONArray);
        uef(jSONObject, ueVar);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("ts", jCurrentTimeMillis);
        if (adSlot != null && adSlot.getCodeId() != null && strLw != null) {
            strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strLw);
        } else {
            strConcat = "";
        }
        jSONObject.put("req_sign", com.bytedance.sdk.component.utils.lw.uef(strConcat));
        if (com.bytedance.sdk.openadsdk.core.wrv.yo.lw() != 0) {
            jSONObject.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.wrv.yo.lw()));
        }
        jSONObject.put("adx_id", zjm.oa().orq());
        com.bytedance.sdk.openadsdk.ivm.oa.uef().uef(jSONObject);
        return jSONObject;
    }

    private void moa(JSONObject jSONObject) throws JSONException {
        byte[] bArr;
        Object obj;
        if (zjm.oa().ab()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", "reportETEvent error", e7.getMessage());
            }
            com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
            moaVarOa.yo(com.bytedance.sdk.openadsdk.utils.gb.orq());
            Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(lw(jSONObject.toString()));
            if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                bArr = (byte[]) obj;
                gr.oa(true);
            } else {
                int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                gr.oa(false);
                gr.uef(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                bArr = null;
            }
            if (bArr != null) {
                moaVarOa.oa(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                moaVarOa.oa("x-pgli18n", "4");
                moaVarOa.uef("application/octet-stream;tt-data=a", bArr);
            }
            if (bArr == null) {
                JSONObject jSONObjectUef = com.bytedance.sdk.component.utils.uef.uef(jSONObject);
                if (yo(jSONObjectUef)) {
                    jSONObject = jSONObjectUef;
                }
                uef(lw(jSONObject), moaVarOa);
                moaVarOa.uef(jSONObject.toString(), sy.moa().bs());
            }
            moaVarOa.uef(7);
            moaVarOa.oa("et_applog");
            moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.gsd.2
                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                    if (oaVar == null || !oaVar.ivm()) {
                        return;
                    }
                    oaVar.moa();
                }

                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ue ueVar, final int i5, final gzw.uef uefVar) {
        com.bytedance.sdk.openadsdk.core.model.uef uefVar2;
        if (!com.bytedance.sdk.openadsdk.core.dj.oa.uef().ivm()) {
            uefVar.uef(40060, cz.uef(40060));
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().moa()) {
            uefVar.uef(10007, cz.uef(10007));
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.dj.oa.uef().cz()) {
            uefVar.uef(10008, cz.uef(10008));
            return;
        }
        boolean zYo = com.bytedance.sdk.openadsdk.gzw.lw.yo();
        final com.bytedance.sdk.openadsdk.core.model.yo yoVar = new com.bytedance.sdk.openadsdk.core.model.yo();
        yoVar.uef(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.xs.uef()) {
            if (uefVar != null) {
                uefVar.uef(1000, "Ad request is temporarily paused, Please contact your AM");
                yoVar.uef(1000);
                com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
                return;
            }
            return;
        }
        if (!sy.moa().uqx()) {
            if (uefVar != null) {
                uefVar.uef(-16, cz.uef(-16));
                yoVar.uef(1001);
                com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
                return;
            }
            return;
        }
        if (uefVar == null) {
            return;
        }
        if (moa(adSlot.getCodeId())) {
            uefVar.uef(-8, cz.uef(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !ueVar.ivm) {
            yoVar.oa(2);
            yoVar.uef(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.wk.yo()) {
                com.bykv.vk.openvk.uef.uef.uef.xs.oa.uef(adSlot.getBidAdm());
            }
            if (sy.moa().nkh() && dxx.uef().moa() == 1) {
                com.bytedance.sdk.openadsdk.utils.gb.uef("Pangle_Debug_Mode", adSlot.getBidAdm(), this.uef);
            }
            try {
                JSONObject jSONObjectUef = uef(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectUef == null) {
                    yoVar.yo(12);
                    uef(uefVar, yoVar);
                    return;
                }
                uef uefVarUef = uef.uef(jSONObjectUef, adSlot, ueVar);
                yoVar.uef(uefVarUef.zjm);
                cq.uef(uefVarUef.cz);
                int i10 = uefVarUef.moa;
                if (i10 != 20000) {
                    uefVar.uef(i10, uefVarUef.lw);
                    yoVar.uef(uefVarUef.moa);
                    yoVar.yo(9);
                    com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.uef uefVar3 = uefVarUef.bcc;
                if (uefVar3 == null) {
                    yoVar.yo(13);
                    uef(uefVar, yoVar);
                    return;
                }
                if (uefVar3.lw() != null && !uefVarUef.bcc.lw().isEmpty()) {
                    com.bytedance.sdk.openadsdk.ab.moa.uef(uefVarUef.bcc.lw().get(0));
                }
                uef(uefVarUef.bcc);
                if (uef(uefVarUef.bcc, uefVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.dz.yo.moa.uef(uefVarUef.bcc);
                uefVar.uef(uefVarUef.bcc, yoVar);
                Map<String, com.bytedance.sdk.openadsdk.core.model.gzw> mapUef = com.bytedance.sdk.openadsdk.core.model.uef.uef(uefVarUef.bcc);
                if (mapUef != null) {
                    com.bytedance.sdk.openadsdk.xs.oa.uef().uef(mapUef);
                }
                uef(uefVarUef.bcc, i5);
                com.bytedance.sdk.openadsdk.core.lw.uef.uef().uef(uefVarUef.bcc);
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.uef("NetApiImpl", "get ad error: ", th);
                yoVar.yo(14);
                yoVar.oa(th.getMessage());
                uef(uefVar, yoVar);
                return;
            }
        }
        if (ueVar != null && !TextUtils.isEmpty(ueVar.wrv)) {
            try {
                JSONObject jSONObjectUef2 = uef(new JSONObject(ueVar.wrv));
                if (jSONObjectUef2 != null) {
                    uef uefVarUef2 = uef.uef(jSONObjectUef2, adSlot, ueVar);
                    tpx tpxVar = ueVar.cq;
                    if (tpxVar != null && (uefVar2 = uefVarUef2.bcc) != null && tpxVar.uef(uefVar2)) {
                        com.bytedance.sdk.openadsdk.core.dz.yo.moa.uef(uefVar2);
                        uefVar.uef(uefVar2, yoVar);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectOa = oa(adSlot, ueVar, i5);
        if (jSONObjectOa == null) {
            uefVar.uef(-9, cz.uef(-9));
            yoVar.uef(-9);
            com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
            return;
        }
        if (sy.moa().nkh() && dxx.uef().moa() == 1) {
            com.bytedance.sdk.openadsdk.utils.gb.uef("Pangle_Debug_Mode", jSONObjectOa.toString(), this.uef);
        }
        String strUef = com.bytedance.sdk.openadsdk.utils.gb.uef("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
        List<String> listUef = null;
        try {
            moaVarOa.yo(com.bytedance.sdk.openadsdk.cz.moa.uef(moaVarOa, strUef));
            if (com.bytedance.sdk.openadsdk.utils.oa.oa()) {
                listUef = com.bytedance.sdk.openadsdk.utils.gb.uef("/api/ad/union/sdk/get_ads/", true);
                if (!listUef.isEmpty()) {
                    moaVarOa.uef(listUef);
                    moaVarOa.uef(60L, TimeUnit.SECONDS);
                }
            }
        } catch (Exception unused2) {
        }
        moaVarOa.uef(jSONObjectOa.toString(), sy.moa().bs());
        Map<String, String> mapUef2 = com.bytedance.sdk.openadsdk.core.wrv.yo.uef(strUef, jSONObjectOa.toString());
        if (mapUef2 != null && mapUef2.size() > 0) {
            for (String str : mapUef2.keySet()) {
                try {
                    moaVarOa.oa(str, mapUef2.get(str));
                } catch (Exception e7) {
                    com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e7.getMessage());
                }
            }
        }
        try {
            moaVarOa.oa("User-Agent", com.bytedance.sdk.openadsdk.utils.gb.moa());
            uef(moaVarOa, jSONObjectOa);
        } catch (Exception unused3) {
        }
        final com.bytedance.sdk.openadsdk.utils.pu puVarOa = com.bytedance.sdk.openadsdk.utils.pu.oa();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z2 = zjm.oa().wk() && requestExtraMap != null;
        if (z2) {
            requestExtraMap.put("pgad_start", puVarOa);
        }
        moaVarOa.uef(10);
        moaVarOa.oa("get_ad");
        if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.11
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("get_ad");
                    uefVarF.yo(adSlot.getCodeId());
                    uefVarF.moa(com.bytedance.sdk.openadsdk.utils.gb.yo(adSlot.getDurationSlotType()));
                    return uefVarF;
                }
            });
        } else {
            moaVarOa.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.12
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("get_ad");
                    uefVarF.yo(adSlot.getCodeId());
                    uefVarF.moa(com.bytedance.sdk.openadsdk.utils.gb.yo(adSlot.getDurationSlotType()));
                    return uefVarF;
                }
            });
        }
        if (com.bytedance.sdk.component.utils.wk.yo()) {
            Thread.currentThread().getName();
        }
        if (!zYo) {
            final boolean z10 = z2;
            final List<String> list = listUef;
            moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.oa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.13
                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar2, com.bytedance.sdk.component.xs.oa oaVar) {
                    gsd.this.uef(yoVar2, oaVar, z10, requestExtraMap, puVarOa, adSlot, yoVar, uefVar, ueVar, i5, list);
                }

                @Override // com.bytedance.sdk.component.xs.uef.oa
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar2, IOException iOException, com.bytedance.sdk.component.xs.oa oaVar) {
                    gsd.this.uef(moaVarOa, iOException, oaVar, adSlot, z10, requestExtraMap, uefVar, yoVar, list);
                    if (yoVar2 != null) {
                        com.bytedance.sdk.openadsdk.utils.gzw.uef(yoVar2.ivm());
                    }
                }
            });
        } else {
            List<String> list2 = listUef;
            try {
                com.bytedance.sdk.component.xs.oa oaVarLw = moaVarOa.lw();
                com.bytedance.sdk.component.xs.oa oaVar = oaVarLw == null ? new com.bytedance.sdk.component.xs.oa(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L) : oaVarLw;
                if (oaVar.ivm()) {
                    boolean z11 = z2;
                    try {
                        uef(moaVarOa, oaVar, z11, requestExtraMap, puVarOa, adSlot, yoVar, uefVar, ueVar, i5, list2);
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z11;
                        requestExtraMap = requestExtraMap;
                        yoVar = yoVar;
                        list2 = list2;
                        uef(moaVarOa, new IOException(th.getMessage()), new com.bytedance.sdk.component.xs.oa(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z2, requestExtraMap, uefVar, yoVar, list2);
                        com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(false);
                    }
                } else {
                    uef(moaVarOa, new IOException(oaVar.oa()), oaVar, adSlot, z2, requestExtraMap, uefVar, yoVar, list2);
                    com.bytedance.sdk.openadsdk.utils.gzw.uef(moaVarOa.ivm());
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(false);
    }

    private byte[] lw(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (IOException e7) {
                        e = e7;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e10) {
                com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e10.toString());
            }
            try {
                gZIPOutputStream.write(str.getBytes("utf-8"));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e11) {
                    com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e11.toString());
                }
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                e = e12;
                gZIPOutputStream2 = gZIPOutputStream;
                com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e13) {
                        com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e13.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e14) {
                        com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e14.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e15) {
                        com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e15.toString());
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }

    private void uef(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.ue ueVar) throws JSONException {
        JSONArray jSONArray;
        if (ueVar == null || (jSONArray = ueVar.lw) == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public void uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ue ueVar, int i5, tpx tpxVar) {
        if (!ueVar.ivm && TextUtils.isEmpty(adSlot.getBidAdm())) {
            if (!uef(ueVar) && tpxVar != null) {
                String strUef = tpxVar.uef();
                if (!TextUtils.isEmpty(strUef)) {
                    ueVar.wrv = strUef;
                    ueVar.cq = tpxVar;
                }
            }
            uef(adSlot, ueVar, i5, (gzw.uef) tpxVar);
            return;
        }
        uef(adSlot, ueVar, i5, (gzw.uef) tpxVar);
    }

    private boolean uef(com.bytedance.sdk.openadsdk.core.model.ue ueVar) {
        if (ueVar != null) {
            return ueVar.f25711oa == 2 || ueVar.yo == 2 || ueVar.moa == 2;
        }
        return false;
    }

    public void uef(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ue ueVar, final int i5, gzw.uef uefVar) {
        if (ueVar != null && (ueVar.f25711oa == 2 || ueVar.yo == 2 || ueVar.moa == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.oa.uef uefVar2 = new com.bytedance.sdk.openadsdk.core.oa.uef(uefVar, adSlot, (adSlot.isPreload() || ueVar == null || ueVar.ivm) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            wk.oa().post(new com.bytedance.sdk.component.bcc.oa.yo("getAd") { // from class: com.bytedance.sdk.openadsdk.core.gsd.1
                @Override // java.lang.Runnable
                public void run() {
                    gsd.this.oa(adSlot, ueVar, i5, uefVar2);
                }
            });
        } else {
            oa(adSlot, ueVar, i5, uefVar2);
        }
    }

    private void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVarXs;
        if (uefVar == null || (gzwVarXs = uefVar.xs()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.dj.ku(gzwVarXs.jx());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.component.xs.oa.moa moaVar, IOException iOException, com.bytedance.sdk.component.xs.oa oaVar, final AdSlot adSlot, boolean z2, Map<String, Object> map, gzw.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar, List<String> list) {
        String message;
        int iUef;
        if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
            com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.14
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("get_ad");
                    uefVarF.yo(adSlot.getCodeId());
                    uefVarF.moa(com.bytedance.sdk.openadsdk.utils.gb.yo(adSlot.getDurationSlotType()));
                    uefVarF.uef(BuildConfig.VERSION_NAME);
                    return uefVarF;
                }
            });
        }
        if (oaVar != null) {
            message = oaVar.oa();
        } else if (iOException != null) {
            message = iOException.getMessage();
        } else {
            message = "";
        }
        String str = message;
        com.bytedance.sdk.openadsdk.utils.pu puVarOa = com.bytedance.sdk.openadsdk.utils.pu.oa();
        if (z2) {
            map.put("pgad_end", Long.valueOf(puVarOa.uef));
        }
        if (sy.moa().nkh() && dxx.uef().moa() == 1) {
            com.bytedance.sdk.openadsdk.utils.gb.uef("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.uef);
        }
        if (oaVar != null) {
            iUef = oaVar.uef();
        } else {
            iUef = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? Sdk.SDKError.Reason.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE : 602;
        }
        int i5 = iUef;
        if (uefVar != null) {
            uefVar.uef(i5, str);
        }
        yoVar.uef(i5);
        yoVar.yo(10);
        yoVar.oa(str);
        com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
        com.bytedance.sdk.openadsdk.ab.uef.lw.uef("get_ad", moaVar.ivm(), i5, str, moaVar.yo(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar, boolean z2, Map<String, Object> map, com.bytedance.sdk.openadsdk.utils.pu puVar, final AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.yo yoVar2, gzw.uef uefVar, com.bytedance.sdk.openadsdk.core.model.ue ueVar, int i5, List<String> list) {
        JSONObject jSONObject;
        com.bytedance.sdk.openadsdk.core.model.fz fzVar;
        com.bytedance.sdk.openadsdk.core.model.yo yoVar3 = yoVar2;
        gzw.uef uefVar2 = uefVar;
        if (z2) {
            map.put("pgad_end", puVar);
        }
        if (oaVar == null) {
            return;
        }
        if (oaVar.ivm()) {
            if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.15
                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                        com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("get_ad");
                        uefVarF.yo(adSlot.getCodeId());
                        uefVarF.moa(com.bytedance.sdk.openadsdk.utils.gb.yo(adSlot.getDurationSlotType()));
                        uefVarF.uef(BuildConfig.VERSION_NAME);
                        return uefVarF;
                    }
                });
            }
            try {
                com.bytedance.sdk.openadsdk.utils.pu puVarOa = com.bytedance.sdk.openadsdk.utils.pu.oa();
                String strMoa = oaVar.moa();
                yoVar3.uef(strMoa);
                JSONObject jSONObject2 = new JSONObject(strMoa);
                if (sy.moa().nkh() && dxx.uef().moa() == 1) {
                    com.bytedance.sdk.openadsdk.utils.gb.uef("Pangle_Debug_Mode", jSONObject2.toString(), this.uef);
                }
                JSONObject jSONObjectUef = uef(jSONObject2);
                if (jSONObjectUef == null) {
                    yoVar3.yo(12);
                    uef(uefVar2, yoVar3);
                    return;
                }
                uef uefVarUef = uef.uef(jSONObjectUef, adSlot, ueVar);
                yoVar3.uef(uefVarUef.zjm);
                cq.uef(uefVarUef.cz);
                int i10 = uefVarUef.moa;
                if (i10 != 20000) {
                    yoVar3.uef(i10);
                    if (!sy.moa().gb() && uefVarUef.moa == 40029) {
                        uefVar2.uef(-100, cz.uef(-100));
                    } else {
                        uefVar2.uef(uefVarUef.moa, uefVarUef.lw);
                    }
                    yoVar3.yo(9);
                    com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar3);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.uef uefVar3 = uefVarUef.bcc;
                if (uefVar3 == null) {
                    yoVar3.yo(13);
                    uef(uefVar2, yoVar3);
                    return;
                }
                if (uef(uefVar3, uefVar2)) {
                    return;
                }
                uefVarUef.bcc.yo(strMoa);
                com.bytedance.sdk.openadsdk.utils.pu puVarOa2 = com.bytedance.sdk.openadsdk.utils.pu.oa();
                if (ueVar != null && (fzVar = ueVar.dj) != null) {
                    fzVar.uef(puVar, puVarOa, uefVarUef.uef, puVarOa2);
                }
                Object[] objArr = com.bytedance.sdk.openadsdk.gzw.lw.moa() && i5 == 1;
                if (objArr != false) {
                    try {
                        if (uefVarUef.bcc.lw() != null && !uefVarUef.bcc.lw().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = uefVarUef.bcc.lw().get(0);
                            String strYo = com.bytedance.sdk.openadsdk.utils.gb.yo(i5);
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            long jUef = 0;
                            if (ueVar != null) {
                                try {
                                    com.bytedance.sdk.openadsdk.utils.pu puVar2 = ueVar.zjm;
                                    jSONObject = jSONObject3;
                                    if (puVar2.uef > 0) {
                                        jUef = puVarOa2.uef(puVar2);
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                jSONObject = jSONObject3;
                            }
                            if (gzwVar != null) {
                                boolean zUu = gzwVar.uu();
                                jSONObject4.put("is_new_engine", zUu ? 1 : 0);
                                jSONObject4.put("webview_cache_size", zUu ? com.bytedance.sdk.component.adexpress.lw.lw.uef().moa() : com.bytedance.sdk.component.adexpress.lw.lw.uef().yo());
                            }
                            JSONObject jSONObject5 = jSONObject;
                            uef(oaVar.xs(), ueVar, puVar, puVarOa, uefVarUef.uef, puVarOa2, gzwVar, strYo, jSONObject4, true);
                            jSONObject5.put("duration", jUef);
                            jSONObject5.put("extra_data", jSONObject4);
                            jSONObject5.put("tag", strYo);
                            jSONObject5.put("callback_start", puVarOa2.uef());
                            uefVarUef.bcc.uef(jSONObject5);
                        }
                    } catch (Throwable th) {
                        th = th;
                        yoVar3 = yoVar2;
                        uefVar2 = uefVar;
                        com.bytedance.sdk.component.utils.dhk.uef("NetApiImpl", "get ad error: ", th);
                        yoVar3.oa(th.getMessage());
                        yoVar3.yo(14);
                        uef(uefVar2, yoVar3);
                        com.bytedance.sdk.openadsdk.ab.uef.lw.uef("get_ad", yoVar.ivm(), -9, th.getMessage(), yoVar.yo(), list);
                        ApmHelper.reportCustomError("", "parse_error", th);
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.core.dz.yo.moa.uef(uefVarUef.bcc);
                uefVar.uef(uefVarUef.bcc, yoVar2);
                uef(uefVarUef.bcc, i5);
                com.bytedance.sdk.openadsdk.core.lw.uef.uef().uef(uefVarUef.bcc);
                Map<String, com.bytedance.sdk.openadsdk.core.model.gzw> mapUef = com.bytedance.sdk.openadsdk.core.model.uef.uef(uefVarUef.bcc);
                if (mapUef != null) {
                    com.bytedance.sdk.openadsdk.xs.oa.uef().uef(mapUef);
                }
                if (uefVarUef.bcc.lw() == null || uefVarUef.bcc.lw().isEmpty() || objArr == true) {
                    return;
                }
                uef(oaVar.xs(), ueVar, puVar, puVarOa, uefVarUef.uef, puVarOa2, uefVarUef.bcc.lw().get(0), com.bytedance.sdk.openadsdk.utils.gb.yo(i5));
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.16
                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                        com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("get_ad");
                        uefVarF.yo(adSlot.getCodeId());
                        uefVarF.moa(com.bytedance.sdk.openadsdk.utils.gb.yo(adSlot.getDurationSlotType()));
                        uefVarF.uef(BuildConfig.VERSION_NAME);
                        return uefVarF;
                    }
                });
            }
            int iUef = oaVar.uef();
            String strOa = oaVar.oa();
            uefVar2.uef(iUef, strOa);
            yoVar3.uef(iUef);
            yoVar3.yo(11);
            yoVar3.oa(strOa);
            com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar3);
            com.bytedance.sdk.openadsdk.ab.uef.lw.uef("get_ad", yoVar.ivm(), iUef, strOa, yoVar.yo(), list);
        }
    }

    @DungeonFlag
    private JSONObject oa(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put("gaid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", uef(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.uef.uef(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    @DungeonFlag
    private JSONObject oa() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", zjm.oa().moa());
            jSONObject.put(MediationMetaData.KEY_NAME, zjm.oa().bcc());
            xs(jSONObject);
            Context contextUef = sy.uef();
            String packageResourcePath = "";
            if (contextUef != null) {
                try {
                    packageResourcePath = contextUef.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
            }
            jSONObject.put("package_install_path", packageResourcePath);
            int i5 = 0;
            jSONObject.put("is_paid_app", false);
            jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.yo.cz());
            jSONObject.put("app_running_time", (System.currentTimeMillis() - wk.uef()) / 1000);
            jSONObject.put("fmwname", DeviceUtils.zjm());
            jSONObject.put("is_init", wk.lw() ? 1 : 0);
            if (contextUef != null) {
                int rotation = ((WindowManager) contextUef.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    i5 = 1;
                } else if (rotation == 1) {
                    i5 = 3;
                } else if (rotation == 2) {
                    i5 = 2;
                } else if (rotation == 3) {
                    i5 = 4;
                }
                jSONObject.put("orientation_support", new JSONArray().put(i5));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static String oa(AdSlot adSlot) {
        String strWrv = zjm.oa().wrv();
        if (adSlot == null) {
            if (TextUtils.isEmpty(strWrv)) {
                return "";
            }
        } else {
            String userData = adSlot.getUserData();
            if (TextUtils.isEmpty(strWrv)) {
                return userData;
            }
            if (!TextUtils.isEmpty(userData)) {
                HashSet hashSet = new HashSet();
                try {
                    JSONArray jSONArray = new JSONArray(userData);
                    int length = jSONArray.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        if (jSONObject != null) {
                            hashSet.add(jSONObject.optString(MediationMetaData.KEY_NAME, null));
                        }
                    }
                    try {
                        JSONArray jSONArray2 = new JSONArray(strWrv);
                        int length2 = jSONArray2.length();
                        for (int i10 = 0; i10 < length2; i10++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i10);
                            if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString(MediationMetaData.KEY_NAME, null))) {
                                jSONArray.put(jSONObject2);
                            }
                        }
                        return jSONArray.toString();
                    } catch (Throwable unused) {
                        return userData;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return strWrv;
    }

    private boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, gzw.uef uefVar2) {
        if (uefVar == null) {
            uefVar2.uef(40053, cz.uef(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.gzw> listLw = uefVar.lw();
        if (listLw.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar : listLw) {
            if (TextUtils.isEmpty(gzwVar.ys().oa()) || TextUtils.isEmpty(gzwVar.ys().yo())) {
                uefVar2.uef(40053, cz.uef(40053));
                com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, com.bytedance.sdk.openadsdk.utils.gb.uef(gzwVar), "material_error", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.gsd.17
                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject uef() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", gzwVar.ys().ivm());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    private void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, int i5) {
        List<com.bytedance.sdk.openadsdk.core.model.sy> listLpy;
        List<com.bytedance.sdk.openadsdk.core.model.gzw> listLw = uefVar.lw();
        if (listLw != null && listLw.size() != 0) {
            for (int i10 = 0; i10 < listLw.size(); i10++) {
                com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = listLw.get(i10);
                if (gzwVar != null && gzwVar.dv() == null) {
                    uef("", 0, 0, gzwVar.ifk(), gzwVar);
                    if (i5 == 3) {
                        uef("", 0, 0, gzwVar.ej(), gzwVar);
                    }
                    if (gzwVar.nj() != null) {
                        uef(gzwVar.nj().zjm(), gzwVar.nj().yo(), gzwVar.nj().oa(), (com.bytedance.sdk.openadsdk.core.model.sy) null, gzwVar);
                    }
                    if ((i5 != 1 || gzwVar.nj() == null) && (listLpy = gzwVar.lpy()) != null && listLpy.size() > 0) {
                        for (int i11 = 0; i11 < listLpy.size(); i11++) {
                            uef(gzwVar, listLpy.get(i11));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public com.bytedance.sdk.openadsdk.moa.lw oa(JSONObject jSONObject) {
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        List<String> listUef;
        String strOa = "error unknown";
        if (!com.bytedance.sdk.openadsdk.core.settings.xs.uef() || com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
        int iUef = 0;
        try {
            JSONObject jSONObjectUef = uef(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            moaVarOa.uef(jSONObjectUef.toString(), sy.moa().bs());
            moaVarOa.yo(com.bytedance.sdk.openadsdk.utils.gb.moa("/api/ad/union/sdk/stats/batch/"));
            if (com.bytedance.sdk.openadsdk.utils.oa.oa() && (listUef = com.bytedance.sdk.openadsdk.utils.gb.uef("/api/ad/union/sdk/stats/batch/", false)) != null && !listUef.isEmpty()) {
                moaVarOa.uef(listUef);
                moaVarOa.uef(60L, TimeUnit.SECONDS);
            }
            uef(moaVarOa, jSONObjectUef);
            moaVarOa.oa("User-Agent", com.bytedance.sdk.openadsdk.utils.gb.moa());
            if (com.bytedance.sdk.openadsdk.core.settings.dj.oa().fzf()) {
                moaVarOa.oa("_disable_retry", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            com.bytedance.sdk.component.xs.oa oaVarLw = moaVarOa.lw();
            try {
            } catch (Throwable unused) {
                i5 = 0;
                z2 = false;
            }
            if (oaVarLw == null) {
                return new com.bytedance.sdk.openadsdk.moa.lw(false, 0, "error unknown", false);
            }
            if (!oaVarLw.ivm() || TextUtils.isEmpty(oaVarLw.moa())) {
                z11 = false;
                z2 = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(oaVarLw.moa());
                int iOptInt = jSONObject2.optInt("code", -1);
                strOa = jSONObject2.optString(JsonStorageKeyNames.DATA_KEY, "");
                z2 = true;
                boolean z12 = iOptInt == 20000;
                z11 = z12;
                if (iOptInt != 60005) {
                    z2 = false;
                    z11 = z12;
                }
            }
            try {
                iUef = oaVarLw.uef();
                z10 = z11;
                if (!oaVarLw.ivm()) {
                    strOa = oaVarLw.oa();
                    com.bytedance.sdk.openadsdk.utils.gzw.uef(moaVarOa.ivm());
                    z10 = z11;
                }
            } catch (Throwable unused2) {
                i5 = iUef;
                iUef = z11 ? 1 : 0;
                z10 = iUef;
                iUef = i5;
                return new com.bytedance.sdk.openadsdk.moa.lw(z10, iUef, strOa, z2);
            }
            return new com.bytedance.sdk.openadsdk.moa.lw(z10, iUef, strOa, z2);
        } catch (Throwable unused3) {
            return new com.bytedance.sdk.openadsdk.moa.lw(false, 0, "error unknown", false);
        }
    }

    private void uef(String str, int i5, int i10, com.bytedance.sdk.openadsdk.core.model.sy syVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.zjm.moa.uef(str).uef(i5).oa(i10).lw(com.bytedance.sdk.openadsdk.utils.af.lw(sy.uef())).moa(com.bytedance.sdk.openadsdk.utils.af.yo(sy.uef())).yo(1).uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, str, null), 4);
        } else {
            if (syVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.zjm.moa.uef(syVar).yo(1).uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, syVar.uef(), null), 4);
        }
    }

    private void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, com.bytedance.sdk.openadsdk.core.model.sy syVar) {
        if (syVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zjm.moa.uef(syVar).yo(1).uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, syVar.uef(), new com.bytedance.sdk.component.lw.ab() { // from class: com.bytedance.sdk.openadsdk.core.gsd.18
            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(int i5, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(com.bytedance.sdk.component.lw.dj djVar) {
            }
        }), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(com.bytedance.sdk.component.oa.uef.zjm r13, com.bytedance.sdk.openadsdk.core.model.ue r14, com.bytedance.sdk.openadsdk.utils.pu r15, com.bytedance.sdk.openadsdk.utils.pu r16, int r17, com.bytedance.sdk.openadsdk.utils.pu r18, com.bytedance.sdk.openadsdk.core.model.gzw r19, java.lang.String r20) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.settings.dj r0 = com.bytedance.sdk.openadsdk.core.sy.moa()
            boolean r0 = r0.wxf()
            if (r0 != 0) goto Lb
            goto L44
        Lb:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r2 = 0
            if (r14 == 0) goto L24
            com.bytedance.sdk.openadsdk.utils.pu r0 = r14.zjm     // Catch: java.lang.Exception -> L44
            long r4 = r0.uef     // Catch: java.lang.Exception -> L44
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L24
            r5 = r18
            long r2 = r5.uef(r0)     // Catch: java.lang.Exception -> L44
        L22:
            r10 = r2
            goto L27
        L24:
            r5 = r18
            goto L22
        L27:
            r9 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            uef(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "load_ad_time"
            r13 = r19
            r14 = r20
            r15 = r0
            r18 = r8
            r16 = r10
            com.bytedance.sdk.openadsdk.moa.yo.uef(r13, r14, r15, r16, r18)     // Catch: java.lang.Exception -> L44
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.gsd.uef(com.bytedance.sdk.component.oa.uef.zjm, com.bytedance.sdk.openadsdk.core.model.ue, com.bytedance.sdk.openadsdk.utils.pu, com.bytedance.sdk.openadsdk.utils.pu, int, com.bytedance.sdk.openadsdk.utils.pu, com.bytedance.sdk.openadsdk.core.model.gzw, java.lang.String):void");
    }

    private static void uef(com.bytedance.sdk.component.oa.uef.zjm zjmVar, com.bytedance.sdk.openadsdk.core.model.ue ueVar, com.bytedance.sdk.openadsdk.utils.pu puVar, com.bytedance.sdk.openadsdk.utils.pu puVar2, int i5, com.bytedance.sdk.openadsdk.utils.pu puVar3, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, JSONObject jSONObject, boolean z2) throws JSONException {
        if (ueVar != null) {
            com.bytedance.sdk.openadsdk.utils.pu puVar4 = ueVar.zjm;
            if (puVar4.uef > 0) {
                jSONObject.put("client_start_time", puVar.uef(puVar4));
            }
        }
        jSONObject.put("network_time", puVar2.uef(puVar));
        jSONObject.put("sever_time", i5);
        jSONObject.put("client_end_time", puVar3.uef(puVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", gzwVar.ku() ? 1 : 0);
        }
        if (gzwVar != null) {
            jSONObject.put("render_control_type", gzwVar.ggp());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.lw.lw.uef().yo());
        jSONObject.put("sync_barrier_open", z2 ? 1 : 0);
        long j8 = zjmVar.f25078oa;
        if (j8 > 0) {
            jSONObject.put("enqueue_2_run_ts", zjmVar.yo - j8);
            jSONObject.put("run_2_connect_end_ts", zjmVar.lw - zjmVar.f25078oa);
            jSONObject.put("connect_end_2_response_end_ts", zjmVar.ivm - zjmVar.lw);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - zjmVar.ivm);
        }
    }

    public static JSONArray oa(String str) throws JSONException {
        try {
            Set<String> setOa = com.bytedance.sdk.component.adexpress.uef.oa.oa.oa(str);
            if (setOa != null && setOa.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setOa.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.uef.yo.oa oaVarUef = com.bytedance.sdk.component.adexpress.uef.oa.oa.uef(it.next());
                    if (oaVarUef != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", oaVarUef.oa());
                        jSONObject.put("md5", oaVarUef.yo());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.uef("NetApiImpl", "getParentTplIds: ", e7);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.moa.lw uef(JSONObject jSONObject, String str, List<String> list) {
        String str2;
        boolean z2;
        int i5;
        Object obj;
        try {
            byte[] bArr = null;
            if (com.bytedance.sdk.openadsdk.core.settings.xs.uef() && !com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
                com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
                moaVarOa.yo(str);
                if (com.bytedance.sdk.openadsdk.utils.oa.oa() && list != null && !list.isEmpty()) {
                    moaVarOa.uef(list);
                    moaVarOa.uef(60L, TimeUnit.SECONDS);
                }
                if (com.bytedance.sdk.openadsdk.core.settings.dj.oa().bx()) {
                    moaVarOa.oa("_disable_retry", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                }
                Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(lw(jSONObject.toString()));
                if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                    bArr = (byte[]) obj;
                    gr.oa(true);
                } else {
                    int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                    gr.oa(false);
                    gr.uef(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                }
                if (bArr != null) {
                    moaVarOa.oa(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                    moaVarOa.oa("x-pgli18n", "4");
                    moaVarOa.uef("application/octet-stream;tt-data=a", bArr);
                }
                if (bArr == null) {
                    try {
                        JSONObject jSONObjectUef = com.bytedance.sdk.component.utils.uef.uef(jSONObject);
                        if (!yo(jSONObjectUef)) {
                            jSONObjectUef = jSONObject;
                        }
                        uef(lw(jSONObjectUef), moaVarOa);
                        moaVarOa.uef(jSONObjectUef.toString(), sy.moa().bs());
                    } catch (OutOfMemoryError e7) {
                        com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e7.toString());
                        return new com.bytedance.sdk.openadsdk.moa.lw(false, -2, "encrypt_error", false);
                    }
                }
                com.bytedance.sdk.component.xs.oa oaVarLw = moaVarOa.lw();
                boolean zIvm = (oaVarLw == null || !oaVarLw.ivm() || TextUtils.isEmpty(oaVarLw.moa())) ? false : ivm(new JSONObject(oaVarLw.moa()));
                String strOa = "error unknown";
                int iUef = oaVarLw != null ? oaVarLw.uef() : 0;
                if (!zIvm && iUef == 200) {
                    str2 = "server say not success";
                    z2 = true;
                } else {
                    if (oaVarLw != null && oaVarLw.oa() != null) {
                        strOa = oaVarLw.oa();
                    }
                    str2 = strOa;
                    z2 = false;
                }
                if (oaVarLw == null) {
                    com.bytedance.sdk.openadsdk.ab.uef.lw.uef("applog", str, -1, "response is null", moaVarOa.yo(), list);
                } else {
                    if (!oaVarLw.ivm()) {
                        i5 = iUef;
                        com.bytedance.sdk.openadsdk.ab.uef.lw.uef("applog", str, i5, oaVarLw.oa(), moaVarOa.yo(), list);
                    }
                    moa(jSONObject);
                    return new com.bytedance.sdk.openadsdk.moa.lw(zIvm, i5, str2, z2);
                }
                i5 = iUef;
                moa(jSONObject);
                return new com.bytedance.sdk.openadsdk.moa.lw(zIvm, i5, str2, z2);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.moa.lw(false, 509, "service_busy", false);
        }
    }

    private void uef(Map<String, String> map, com.bytedance.sdk.component.xs.oa.moa moaVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    moaVar.oa(entry.getKey(), entry.getValue());
                } catch (Exception e7) {
                    com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", "ADD header exceptopn", e7.getMessage());
                }
            }
        }
        try {
            moaVar.oa("User-Agent", com.bytedance.sdk.openadsdk.utils.gb.moa());
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", "ADD header exceptopn", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public void uef(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) throws JSONException {
        final List<String> listUef;
        if (!com.bytedance.sdk.openadsdk.core.settings.xs.uef() || com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            return;
        }
        JSONObject jSONObjectOa = oa(str, list, jSONObject, str2, str3);
        if (jSONObjectOa == null) {
            return;
        }
        com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
        final String strMoa = com.bytedance.sdk.openadsdk.utils.gb.moa("/api/ad/union/dislike_event/");
        JSONObject jSONObjectUef = uef(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectOa);
        String string = jSONObjectUef != null ? jSONObjectUef.toString() : null;
        uef(moaVarOa, jSONObjectUef);
        moaVarOa.yo(strMoa);
        if (com.bytedance.sdk.openadsdk.utils.oa.oa()) {
            listUef = com.bytedance.sdk.openadsdk.utils.gb.uef("/api/ad/union/dislike_event/", false);
            if (!listUef.isEmpty()) {
                moaVarOa.uef(listUef);
                moaVarOa.uef(60L, TimeUnit.SECONDS);
            }
        } else {
            listUef = null;
        }
        moaVarOa.lw(string);
        moaVarOa.uef(7);
        moaVarOa.oa("dislike");
        if (com.bytedance.sdk.openadsdk.utils.oa.uef()) {
            moaVarOa.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.3
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("dislike");
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.4
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("dislike");
                }
            });
        }
        moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.gsd.5
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                boolean zUef = com.bytedance.sdk.openadsdk.utils.oa.uef();
                if (oaVar == null) {
                    com.bytedance.sdk.openadsdk.ab.uef.lw.uef("dislike", strMoa, -1, "response is null", yoVar.yo(), listUef);
                    if (zUef) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.5.3
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            return AbstractC1593a.f("dislike");
                        }
                    });
                    return;
                }
                if (oaVar.ivm()) {
                    if (zUef) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.5.1
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            return AbstractC1593a.f("dislike");
                        }
                    });
                } else {
                    if (!zUef) {
                        com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.5.2
                            @Override // com.bytedance.sdk.openadsdk.sy.moa
                            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                return AbstractC1593a.f("dislike");
                            }
                        });
                    }
                    com.bytedance.sdk.openadsdk.ab.uef.lw.uef("dislike", strMoa, oaVar.uef(), oaVar.oa(), yoVar.yo(), listUef);
                }
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                com.bytedance.sdk.openadsdk.ab.uef.lw.uef("dislike", strMoa, -1, iOException != null ? iOException.getMessage() : "null", yoVar.yo(), listUef);
                com.bytedance.sdk.openadsdk.utils.gzw.uef(yoVar.ivm());
                if (com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.5.4
                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                        return AbstractC1593a.f("dislike");
                    }
                });
            }
        });
        try {
            String strOptString = new JSONObject(str).optString("cid", "");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("dislike", strOptString, (String) null, (String) null);
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo(e7.getMessage(), new Object[0]);
        }
    }

    public static JSONObject uef(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new rt(cryptDataScene));
        gr.uef(jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    private JSONArray uef(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private void uef(gzw.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
        uefVar.uef(-1, cz.uef(-1));
        yoVar.uef(-1);
        com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(gzw.oa oaVar) {
        oaVar.uef(-1, cz.uef(-1));
    }

    public static JSONObject uef(AdSlot adSlot) throws JSONException {
        pz pzVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", sy.moa().rj());
            jSONObject.put("lmt", DeviceUtils.yo());
            if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().dj()) {
                jSONObject.put("pa_consent", zjm.oa().zjm());
            }
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.dj.oa.uef().bcc());
            jSONObject.put("tcstring", com.bytedance.sdk.openadsdk.core.settings.dj.oa(sy.uef()));
            jSONObject.put("tcf_gdpr", com.bytedance.sdk.openadsdk.core.settings.dj.uef(sy.uef()));
            if (adSlot != null && pz.uef.containsKey(Integer.valueOf(adSlot.getCodeId())) && (pzVar = pz.uef.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", pzVar.oa());
                jSONObject.put("lastbundle", pzVar.yo());
                jSONObject.put("lastclick", pzVar.moa());
                jSONObject.put("lastskip", pzVar.lw());
            }
            uef(jSONObject, JsonStorageKeyNames.DATA_KEY, oa(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void uef(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject uef(AdSlot adSlot, int i5, com.bytedance.sdk.openadsdk.core.model.ue ueVar) throws JSONException {
        Object obj;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i5);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (ueVar != null) {
                jSONObject.put("render_method", ueVar.cz);
                int i10 = ueVar.cz;
                if (i10 == 1) {
                    uef(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i10 == 2) {
                    uef(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                uef(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", oa(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", yo(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", yo(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i5));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i5 == 1 || i5 == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (ueVar != null && (obj2 = ueVar.xs) != null) {
                jSONObject.put("session_params", obj2);
            }
            if (ueVar != null && (obj = ueVar.bcc) != null) {
                jSONObject.put("common_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i5 == 7 || i5 == 8) {
                adCount = 1;
            }
            if (ueVar != null && ueVar.lw != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i5 == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject3.put("type", adSlot.getBannerType());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void uef(JSONObject jSONObject, String str, int i5, int i10) throws JSONException {
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i5);
            jSONObject2.put("height", i10);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void uef(JSONObject jSONObject, String str, float f10, float f11) throws JSONException {
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f10);
            jSONObject2.put("height", (int) f11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public void uef(JSONObject jSONObject, final gzw.oa oaVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.xs.uef() || com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            if (oaVar != null) {
                oaVar.uef(1000, "Ad request is temporarily paused, Please contact your AM");
                return;
            }
            return;
        }
        if (jSONObject == null || oaVar == null) {
            return;
        }
        JSONObject jSONObjectUef = uef(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
        final List<String> listUef = null;
        try {
            moaVarOa.yo(com.bytedance.sdk.openadsdk.cz.moa.uef(moaVarOa, com.bytedance.sdk.openadsdk.utils.gb.moa("/api/ad/union/sdk/reward_video/reward/")));
            if (com.bytedance.sdk.openadsdk.utils.oa.oa()) {
                listUef = com.bytedance.sdk.openadsdk.utils.gb.uef("/api/ad/union/sdk/reward_video/reward/", false);
                if (!listUef.isEmpty()) {
                    moaVarOa.uef(listUef);
                    moaVarOa.uef(60L, TimeUnit.SECONDS);
                }
            }
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e7.getMessage());
        }
        uef(moaVarOa, jSONObjectUef);
        moaVarOa.lw(jSONObjectUef != null ? jSONObjectUef.toString() : "");
        moaVarOa.uef(10);
        moaVarOa.oa("reward");
        if (com.bytedance.sdk.openadsdk.utils.oa.uef()) {
            moaVarOa.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.6
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("reward");
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.7
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("reward");
                }
            });
        }
        moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.gsd.8
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar2) {
                oa oaVarUef;
                int i5;
                if (oaVar2 == null) {
                    if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                        com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.8.3
                            @Override // com.bytedance.sdk.openadsdk.sy.moa
                            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                return AbstractC1593a.f("reward");
                            }
                        });
                    }
                    com.bytedance.sdk.openadsdk.ab.uef.lw.uef("reward", yoVar.ivm(), -1, "response is null", yoVar.yo(), listUef);
                    gsd.this.uef(oaVar);
                    return;
                }
                if (!oaVar2.ivm() || TextUtils.isEmpty(oaVar2.moa())) {
                    String strUef = cz.uef(-2);
                    int iUef = oaVar2.uef();
                    if (!oaVar2.ivm() && !TextUtils.isEmpty(oaVar2.oa())) {
                        strUef = oaVar2.oa();
                    }
                    String str = strUef;
                    oaVar.uef(iUef, str);
                    if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                        com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.8.2
                            @Override // com.bytedance.sdk.openadsdk.sy.moa
                            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                return AbstractC1593a.f("reward");
                            }
                        });
                    }
                    if (oaVar2.ivm()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.ab.uef.lw.uef("reward", yoVar.ivm(), iUef, str, yoVar.yo(), listUef);
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(oaVar2.moa());
                    String strUef2 = gsd.uef(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                    if (!TextUtils.isEmpty(strUef2)) {
                        try {
                            jSONObject2 = new JSONObject(strUef2);
                        } catch (Throwable unused) {
                        }
                    }
                    oaVarUef = oa.uef(jSONObject2);
                    i5 = oaVarUef.uef;
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", e10.getMessage());
                    gsd.this.uef(oaVar);
                }
                if (i5 != 20000) {
                    oaVar.uef(i5, cz.uef(i5));
                    return;
                }
                if (oaVarUef.yo == null) {
                    gsd.this.uef(oaVar);
                    return;
                }
                oaVar.uef(oaVarUef);
                if (com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.8.1
                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                        return AbstractC1593a.f("reward");
                    }
                });
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                String message;
                if (iOException != null) {
                    message = iOException.getMessage();
                } else {
                    message = "";
                }
                String str = message;
                oaVar.uef(-2, str);
                if (yoVar != null) {
                    String strIvm = yoVar.ivm();
                    com.bytedance.sdk.openadsdk.utils.gzw.uef(strIvm);
                    com.bytedance.sdk.openadsdk.ab.uef.lw.uef("reward", strIvm, -1, str, yoVar.yo(), listUef);
                }
                if (com.bytedance.sdk.openadsdk.utils.oa.uef()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.gsd.8.4
                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                        return AbstractC1593a.f("reward");
                    }
                });
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public JSONObject uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strUef = uef(iOptInt, strOptString);
            if (TextUtils.isEmpty(strUef)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strUef);
            try {
                jSONObject2.put("auction_price", strOptString2);
                return jSONObject2;
            } catch (Throwable unused) {
                return jSONObject2;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    public static String uef(int i5, String str) {
        Object obj;
        if (i5 == 3) {
            return com.bytedance.sdk.component.utils.uef.yo(str);
        }
        if (i5 == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                gr.uef(true);
                return str2;
            }
            gr.uef(false);
            gr.uef(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    private void uef(com.bytedance.sdk.component.xs.oa.moa moaVar, JSONObject jSONObject) {
        try {
            if (yo(jSONObject) && jSONObject.optInt("cypher") == 4) {
                moaVar.oa("x-pgli18n", "4");
                moaVar.oa("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public com.bytedance.sdk.component.adexpress.uef.yo.uef uef() {
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarUef = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.xs.uef() || com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tpl_fetch_model", "date", 0L);
        String strCop = sy.moa().cop();
        String strOa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= sy.moa().km() && jCurrentTimeMillis >= 0 && TextUtils.equals(strCop, strOa)) {
            String strOa2 = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(strOa2)) {
                    return com.bytedance.sdk.component.adexpress.uef.yo.uef.lw(strOa2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
            String strUef = com.bytedance.sdk.openadsdk.cz.moa.uef(oaVarYo, strCop);
            oaVarYo.yo(strUef);
            com.bytedance.sdk.component.xs.oa oaVarLw = oaVarYo.lw();
            if (oaVarLw == null || !oaVarLw.ivm()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(oaVarLw.moa());
            jSONObject.put("template_fetch_url", strUef);
            uefVarUef = com.bytedance.sdk.component.adexpress.uef.yo.uef.uef(jSONObject);
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tpl_fetch_model", "model", jSONObject.toString());
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tpl_fetch_model", "last_url", strCop);
            return uefVarUef;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("NetApiImpl", th.getMessage());
            return uefVarUef;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public void uef(String str) {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            return;
        }
        com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
        oaVarYo.yo(str);
        oaVarYo.oa("upload_bidding");
        oaVarYo.uef(7);
        oaVarYo.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.gsd.9
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                oaVar.moa();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw
    public void uef(JSONObject jSONObject, String str) {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            return;
        }
        com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
        moaVarOa.yo(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        moaVarOa.oa("cypher", (String) pairGenerateRequestHeader.first);
        moaVarOa.oa("transfer-param", (String) pairGenerateRequestHeader.second);
        moaVarOa.oa("x-pangle-target-idc", sy.moa().jp());
        moaVarOa.uef(jSONObject);
        moaVarOa.uef(5);
        moaVarOa.oa("apm_pv");
        moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.gsd.10
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                oaVar.moa();
            }
        });
    }
}
