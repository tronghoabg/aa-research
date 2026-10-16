package com.bytedance.sdk.openadsdk.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.dz.uef.oa;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public int f25721oa;
        public String uef;

        public uef(String str, int i5) {
            this.uef = str;
            this.f25721oa = i5;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.bcc bcc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.bcc bccVar = new com.bytedance.sdk.openadsdk.core.model.bcc();
        if (jSONObject == null) {
            bccVar.yo(0);
            bccVar.moa(0);
            bccVar.oa(new ArrayList());
            bccVar.lw(0);
            bccVar.uef(new ArrayList());
            bccVar.oa(0);
            bccVar.uef(0);
            return bccVar;
        }
        bccVar.yo(jSONObject.optInt("interceptor_x", 0));
        bccVar.moa(jSONObject.optInt("interceptor_y", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i5)));
            }
        }
        bccVar.oa(arrayList);
        bccVar.lw(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i10));
            }
        }
        bccVar.uef(arrayList2);
        bccVar.oa(jSONObject.optInt("boc_index", 0));
        bccVar.uef(jSONObject.optInt("is_act", 0));
        return bccVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.dz cz(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.dz dzVar = new com.bytedance.sdk.openadsdk.core.model.dz();
        dzVar.uef(jSONObject.optInt("if_send_click", 0));
        return dzVar;
    }

    private static Map<String, Object> dj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }

    private static com.bytedance.sdk.openadsdk.core.model.tpx ivm(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tpx tpxVar = new com.bytedance.sdk.openadsdk.core.model.tpx();
        if (jSONObject == null) {
            tpxVar.uef(10L);
            tpxVar.oa(20L);
            tpxVar.yo(10L);
            tpxVar.moa(20L);
            tpxVar.uef("");
            return tpxVar;
        }
        tpxVar.uef(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        tpxVar.oa(jSONObject.optLong("straight_lp_showtime", 20L));
        tpxVar.yo(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        tpxVar.moa(jSONObject.optLong("straight_agg_showtime", 20L));
        tpxVar.uef(jSONObject.optString("loading_text", ""));
        return tpxVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.ivm lw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.ivm ivmVar = new com.bytedance.sdk.openadsdk.core.model.ivm();
        ivmVar.oa(jSONObject.optString("app_name"));
        ivmVar.yo(jSONObject.optString("package_name"));
        ivmVar.uef(jSONObject.optString("download_url"));
        ivmVar.uef(jSONObject.optDouble("score", -1.0d));
        ivmVar.uef(jSONObject.optInt("comment_num", -1));
        ivmVar.oa(jSONObject.optInt("app_size", 0));
        ivmVar.moa(jSONObject.optString("app_category"));
        return ivmVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.xs moa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j8 = jOptLong >= 0 ? jOptLong : 0L;
        int iOptInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.xs xsVar = new com.bytedance.sdk.openadsdk.core.model.xs();
        xsVar.oa(iOptInt);
        xsVar.yo(iOptInt2);
        xsVar.uef(j8);
        xsVar.uef(iOptInt3);
        return xsVar;
    }

    public static FilterWord oa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString(MediationMetaData.KEY_NAME));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    FilterWord filterWordOa = oa(jSONArrayOptJSONArray.optJSONObject(i5));
                    if (filterWordOa != null && filterWordOa.isValid()) {
                        filterWord.addOption(filterWordOa);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean uef(int i5) {
        return i5 == 2 || i5 == 3 || i5 == 8;
    }

    private static com.bytedance.sdk.openadsdk.core.model.oib xs(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.oib oibVar = new com.bytedance.sdk.openadsdk.core.model.oib();
        if (jSONObject == null) {
            oibVar.moa(5);
            oibVar.lw(30);
            oibVar.ivm(70);
            oibVar.xs(1);
            oibVar.bcc(com.bytedance.sdk.openadsdk.core.model.oib.uef);
            oibVar.yo(0);
            oibVar.oa(0);
            oibVar.uef(3);
            return oibVar;
        }
        oibVar.moa(jSONObject.optInt("ceiling_time", 5));
        oibVar.lw(jSONObject.optInt("ceiling_ratio", 30));
        oibVar.ivm(jSONObject.optInt("expand_ratio", 70));
        oibVar.xs(jSONObject.optInt("back_type", 1));
        oibVar.bcc(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.oib.uef));
        oibVar.yo(jSONObject.optInt("pre_render_status", 0));
        oibVar.oa(jSONObject.optInt("pre_render_use_gecko", 0));
        oibVar.uef(jSONObject.optInt("pre_render_add_type", 3));
        return oibVar;
    }

    private static com.bytedance.sdk.openadsdk.core.cq.bcc.uef yo(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.cq.bcc.uef uefVar = new com.bytedance.sdk.openadsdk.core.cq.bcc.uef();
        uefVar.uef(jSONObject.optString("id"));
        uefVar.oa(jSONObject.optString("md5"));
        uefVar.yo(jSONObject.optString("url"));
        return uefVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.cq zjm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.cq cqVar = new com.bytedance.sdk.openadsdk.core.model.cq();
        cqVar.uef(jSONObject.optString("deeplink_url"));
        cqVar.oa(jSONObject.optString("fallback_url"));
        cqVar.uef(jSONObject.optInt("fallback_type"));
        return cqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.util.Pair<com.bytedance.sdk.openadsdk.core.model.uef, java.util.ArrayList<java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static Pair<com.bytedance.sdk.openadsdk.core.model.uef, ArrayList<Integer>> uef(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ue ueVar) {
        ?? r17;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar3 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.uef uefVar = new com.bytedance.sdk.openadsdk.core.model.uef();
            uefVar.uef(jSONObject.optString("request_id"));
            uefVar.uef(jSONObject.optInt("ret"));
            uefVar.oa(jSONObject.optInt("multi_ad_style", 0));
            uefVar.oa(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String strOptString = jSONObject.optString("gdid_encrypted");
            uefVar.uef(com.bytedance.sdk.openadsdk.core.model.orq.uef(jSONObject.optJSONObject("loop_config")));
            String strOptString2 = jSONObject.optString("auction_price");
            if (uefVar.moa() != 0) {
                return null;
            }
            uefVar.uef(com.bytedance.sdk.openadsdk.core.model.rt.uef(jSONObject.optString("multi_ad_config")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                jSONArrayOptJSONArray.length();
                int i5 = 0;
                ArrayList arrayList2 = uefVar.cz() ? new ArrayList() : null;
                while (i5 < jSONArrayOptJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.gzw gzwVarUef = uef(jSONArrayOptJSONArray.optJSONObject(i5), adSlot, ueVar, uefVar, i5);
                    ?? r92 = arrayList2;
                    if (!uefVar.cz()) {
                        r92 = gzwVar3;
                    }
                    int iUef = uef(gzwVarUef);
                    if (iUef != 200) {
                        if (gzwVarUef != null) {
                            com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVarUef, com.bytedance.sdk.openadsdk.utils.gb.yo(gzwVarUef.epe()), iUef);
                        } else {
                            com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar3, "", iUef);
                        }
                        arrayList.add(Integer.valueOf(iUef));
                        if (r92 == 0 || gzwVarUef == null) {
                            gzwVar2 = gzwVar3;
                        } else {
                            gzwVar = gzwVar3;
                            try {
                                r92.add(new uef(gzwVarUef.au(), iUef));
                                gzwVar2 = gzwVar;
                            } catch (Throwable th) {
                                th = th;
                                r17 = gzwVar;
                                com.bytedance.sdk.component.utils.dhk.yo("TTAD.AdInfoFactory", th.getMessage());
                                return r17;
                            }
                        }
                        if (gzwVarUef != null && (gzwVarUef.wxf() == 39 || gzwVarUef.wxf() == 41)) {
                            uefVar.oa(0);
                        }
                        jSONArrayOptJSONArray.remove(i5);
                        i5--;
                    } else {
                        gzwVar2 = gzwVar3;
                        gzwVarUef.dz(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            gzwVarUef.cz(strOptString);
                        }
                        uefVar.uef(gzwVarUef);
                    }
                    i5++;
                    gzwVar3 = gzwVar2;
                    arrayList2 = r92;
                }
                gzwVar = gzwVar3;
                List<com.bytedance.sdk.openadsdk.core.model.gzw> listLw = uefVar.lw();
                uef(listLw, uefVar);
                if (listLw != null) {
                    if (uefVar.cz() && listLw.size() == 1) {
                        uefVar.oa(0);
                        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar4 = listLw.get(0);
                        if (gzwVar4 != null) {
                            gzwVar4.dj(false);
                        }
                    }
                    int size = listLw.size();
                    jSONObject.put("creatives", jSONArrayOptJSONArray);
                    for (int i10 = 0; i10 < size; i10++) {
                        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar5 = listLw.get(i10);
                        if (gzwVar5 != null) {
                            if (i10 > 0) {
                                gzwVar5.pmc();
                            }
                            gzwVar5.lz(jSONObject.toString());
                        }
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    uef((ArrayList<uef>) arrayList2);
                }
            } else {
                gzwVar = null;
            }
            return new Pair<>(uefVar, arrayList);
        } catch (Throwable th2) {
            th = th2;
            r17 = gzwVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int yo(com.bytedance.sdk.openadsdk.core.model.gzw r5) {
        /*
            int r0 = r5.epe()
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.gb.yo(r0)
            int r1 = r5.orw()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L1e
            com.bytedance.sdk.openadsdk.core.model.cq r1 = r5.agr()
            int r1 = uef(r1)
            if (r1 == r2) goto L1f
            com.bytedance.sdk.openadsdk.moa.yo.yo(r5, r0, r1)
            return r1
        L1e:
            r1 = r2
        L1f:
            int r3 = r5.ykf()
            r4 = 2
            if (r3 == r4) goto L3f
            r4 = 3
            if (r3 == r4) goto L3f
            r4 = 4
            if (r3 == r4) goto L31
            r4 = 8
            if (r3 == r4) goto L3f
            goto L46
        L31:
            com.bytedance.sdk.openadsdk.core.model.ivm r1 = r5.no()
            int r1 = uef(r1)
            if (r1 == r2) goto L3e
            com.bytedance.sdk.openadsdk.moa.yo.yo(r5, r0, r1)
        L3e:
            return r1
        L3f:
            int r5 = oa(r5, r0)
            if (r5 == r2) goto L46
            return r5
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.oa.yo(com.bytedance.sdk.openadsdk.core.model.gzw):int");
    }

    private static boolean moa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        return (gzwVar.ebe() || gzwVar.tv()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int oa(com.bytedance.sdk.openadsdk.core.model.gzw r7) {
        /*
            int r0 = r7.epe()
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.gb.yo(r0)
            int r1 = r7.orw()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L1c
            com.bytedance.sdk.openadsdk.core.model.cq r1 = r7.agr()
            int r1 = uef(r1)
            com.bytedance.sdk.openadsdk.moa.yo.yo(r7, r0, r1)
            goto L1d
        L1c:
            r1 = r2
        L1d:
            int r3 = r7.ykf()
            r4 = 2
            r5 = 417(0x1a1, float:5.84E-43)
            r6 = 407(0x197, float:5.7E-43)
            if (r3 == r4) goto L77
            r4 = 3
            if (r3 == r4) goto L77
            r4 = 4
            if (r3 == r4) goto L33
            r4 = 8
            if (r3 == r4) goto L77
            goto L7e
        L33:
            com.bytedance.sdk.openadsdk.core.model.ivm r3 = r7.no()
            if (r3 != 0) goto L3e
            com.bytedance.sdk.openadsdk.moa.yo.yo(r7, r0, r6)
            r1 = r6
            goto L7e
        L3e:
            java.lang.String r4 = r3.yo()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L57
            java.lang.String r4 = r3.uef()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L57
            com.bytedance.sdk.openadsdk.moa.yo.yo(r7, r0, r5)
            r1 = r5
            goto L7e
        L57:
            java.lang.String r4 = r3.yo()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L67
            r1 = 416(0x1a0, float:5.83E-43)
            com.bytedance.sdk.openadsdk.moa.yo.yo(r7, r0, r1)
            goto L7e
        L67:
            java.lang.String r3 = r3.uef()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L7e
            r1 = 408(0x198, float:5.72E-43)
            com.bytedance.sdk.openadsdk.moa.yo.yo(r7, r0, r1)
            goto L7e
        L77:
            int r3 = oa(r7, r0)
            if (r3 == r2) goto L7e
            r1 = r3
        L7e:
            if (r1 == r5) goto L8d
            if (r1 == r6) goto L8d
            r3 = 406(0x196, float:5.69E-43)
            if (r1 != r3) goto L87
            goto L8d
        L87:
            if (r1 == r2) goto L8c
            com.bytedance.sdk.openadsdk.moa.yo.oa(r7, r0, r1)
        L8c:
            return r2
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.oa.oa(com.bytedance.sdk.openadsdk.core.model.gzw):int");
    }

    private static int oa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str) {
        if (moa(gzwVar)) {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.oa.2
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("web_ad_target_url");
                }
            });
            String strCc = gzwVar.cc();
            if (TextUtils.isEmpty(strCc)) {
                com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.oa.3
                    @Override // com.bytedance.sdk.openadsdk.sy.moa
                    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                        return AbstractC1593a.f("web_ad_target_url");
                    }
                });
                return TTAdConstant.LANDING_PAGE_TYPE_CODE;
            }
            com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.oa.4
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("web_ad_target_url");
                }
            });
            if (!uef(strCc)) {
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, TTAdConstant.TARGET_URL_NOT_CONTAINS_TTCLID_CODE, strCc);
            }
        }
        return 200;
    }

    private static void uef(List<com.bytedance.sdk.openadsdk.core.model.gzw> list, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = list.get(0);
        if (!uefVar.cz() || gzwVar == null || !gzwVar.hs() || com.bytedance.sdk.openadsdk.utils.gb.fz() == 0) {
            return;
        }
        uefVar.oa(0);
        gzwVar.dj(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x06d4 A[PHI: r0
  0x06d4: PHI (r0v88 int) = (r0v87 int), (r0v137 int) binds: [B:174:0x06c0, B:179:0x06d1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.openadsdk.core.model.gzw uef(org.json.JSONObject r17, com.bytedance.sdk.openadsdk.AdSlot r18, com.bytedance.sdk.openadsdk.core.model.ue r19, com.bytedance.sdk.openadsdk.core.model.uef r20, int r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.oa.uef(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.ue, com.bytedance.sdk.openadsdk.core.model.uef, int):com.bytedance.sdk.openadsdk.core.model.gzw");
    }

    private static void uef(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("iv_skip_time", -1);
            int iOptInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (iOptInt != -1) {
                gzwVar.vyg(iOptInt);
            }
            if (iOptInt2 != -1) {
                gzwVar.wxf(iOptInt2);
            }
        }
    }

    private static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.dz.uef, oa.uef> uef(String str, int i5, int i10) {
        int iYo;
        int iLw;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i10 == 1 || i10 == 5) {
            iYo = 0;
            iLw = 0;
        } else {
            iYo = com.bytedance.sdk.openadsdk.utils.af.yo(sy.uef());
            iLw = com.bytedance.sdk.openadsdk.utils.af.lw(sy.uef());
            if (i5 == 2) {
                iLw = iYo;
                iYo = iLw;
            }
        }
        com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw(sy.uef(), iYo, iLw);
        return new Pair<>(lwVar.uef(str, (File) null, new ArrayList()), lwVar.ivm);
    }

    private static void uef(com.bytedance.sdk.openadsdk.core.dz.uef uefVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        uefVar.uef(gzwVar);
        if (!uef(gzwVar.ykf())) {
            gzwVar.ku(2);
        }
        gzwVar.wk(1);
        gzwVar.uef(uefVar);
        if (!TextUtils.isEmpty(uefVar.moa())) {
            gzwVar.dhk(uefVar.moa());
        }
        if (!TextUtils.isEmpty(uefVar.lw())) {
            gzwVar.tpx(uefVar.lw());
        }
        gzwVar.sy(uefVar.ivm());
        gzwVar.uef((com.bytedance.sdk.openadsdk.core.model.ivm) null);
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
        if (oaVarNj == null) {
            oaVarNj = new com.bykv.vk.openvk.uef.uef.uef.yo.oa();
        }
        oaVarNj.yo(uefVar.xs());
        oaVarNj.uef(uefVar.bcc());
        oaVarNj.ivm((String) null);
        oaVarNj.oa((String) null);
        oaVarNj.moa((String) null);
        gzwVar.uef(oaVarNj);
        if (uefVar.oa() != null && !TextUtils.isEmpty(uefVar.oa().moa())) {
            com.bytedance.sdk.openadsdk.core.model.sy syVar = new com.bytedance.sdk.openadsdk.core.model.sy();
            syVar.uef(uefVar.oa().moa());
            syVar.uef(uefVar.oa().uef());
            syVar.oa(uefVar.oa().oa());
            gzwVar.uef(syVar);
            return;
        }
        if (gzwVar.ifk() == null) {
            com.bytedance.sdk.openadsdk.core.model.sy syVar2 = new com.bytedance.sdk.openadsdk.core.model.sy();
            syVar2.uef("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            syVar2.uef(98);
            syVar2.oa(98);
            gzwVar.uef(syVar2);
        }
    }

    public static AdSlot uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("mCodeId", "");
        int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float fOptDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float fOptDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
        int iOptInt3 = jSONObject.optInt("mAdCount", 6);
        boolean zOptBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String strOptString2 = jSONObject.optString("mRewardName", "");
        int iOptInt4 = jSONObject.optInt("mRewardAmount", 0);
        String strOptString3 = jSONObject.optString("mMediaExtra", "");
        String strOptString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int iOptInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean zOptBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean zOptBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String strOptString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt, iOptInt2).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt3).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt4).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt5).setIsAutoPlay(zOptBoolean2).isExpressAd(zOptBoolean3).withBid(strOptString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static com.bykv.vk.openvk.uef.uef.uef.yo.oa uef(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, boolean z2) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar = new com.bykv.vk.openvk.uef.uef.uef.yo.oa();
        oaVar.oa(jSONObject.optInt("cover_height"));
        oaVar.yo(jSONObject.optInt("cover_width"));
        oaVar.uef(jSONObject.optString("resolution"));
        oaVar.uef(jSONObject.optLong("size"));
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        oaVar.uef(dOptDouble);
        int i5 = 1;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && gzwVar.ggp() != 1 && com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVar)) {
            i5 = iOptInt2;
        }
        oaVar.zjm(i5);
        oaVar.oa(jSONObject.optString("cover_url"));
        oaVar.yo(jSONObject.optString("video_url"));
        oaVar.moa(jSONObject.optString("endcard"));
        oaVar.lw(jSONObject.optString("playable_download_url"));
        oaVar.ivm(jSONObject.optString("file_hash"));
        oaVar.bcc(jSONObject.optInt("if_playable_loading_show", 0));
        oaVar.cz(jSONObject.optInt("remove_loading_page_type", 0));
        oaVar.uef(jSONObject.optInt("fallback_endcard_judge", 0));
        oaVar.lw(jSONObject.optInt("video_preload_size", 307200));
        oaVar.ivm(jSONObject.optInt("reward_video_cached_type", 0));
        oaVar.xs(jSONObject.optInt("execute_cached_type", 0));
        if (z2) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        oaVar.moa(iOptInt);
        return oaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int uef(com.bytedance.sdk.openadsdk.core.model.gzw r5) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r5 != 0) goto Lb
            java.lang.String r5 = ""
            com.bytedance.sdk.openadsdk.moa.yo.yo(r1, r5, r0)
            return r0
        Lb:
            int r2 = r5.epe()
            java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.gb.yo(r2)
            java.lang.String r3 = r5.iou()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lbd
            java.lang.String r3 = r5.iou()
            int r3 = r3.length()
            r4 = 1
            if (r3 > r4) goto L2a
            goto Lbd
        L2a:
            boolean r3 = r5.tv()
            if (r3 == 0) goto L64
            int r3 = r5.epe()
            if (r3 >= 0) goto L47
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.cl()
            if (r3 == 0) goto L44
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.cl()
            r3.getDurationSlotType()
            goto L47
        L44:
            r5.dqw()
        L47:
            boolean r3 = r5.ib()
            if (r3 == 0) goto L4f
            java.lang.String r2 = "fullscreen_interstitial_ad"
        L4f:
            java.lang.String r3 = r5.wze()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L5f
            java.lang.String r3 = "load_html_fail"
            com.bytedance.sdk.openadsdk.moa.yo.oa(r5, r2, r3, r1)
            return r0
        L5f:
            java.lang.String r0 = "load_html_success"
            com.bytedance.sdk.openadsdk.moa.yo.oa(r5, r2, r0, r1)
        L64:
            int r0 = r5.orw()
            if (r0 != 0) goto La9
            int r0 = r5.hw()
            r1 = 2
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L9b
            r1 = 3
            if (r0 == r1) goto L9b
            r1 = 4
            if (r0 == r1) goto L9b
            r1 = 5
            if (r0 == r1) goto L89
            r1 = 15
            if (r0 == r1) goto L89
            r1 = 16
            if (r0 == r1) goto L9b
            r1 = 50
            if (r0 == r1) goto L89
            goto La9
        L89:
            com.bykv.vk.openvk.uef.uef.uef.yo.oa r0 = r5.nj()
            boolean r1 = r5.ebe()
            int r0 = uef(r0, r1)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.moa.yo.yo(r5, r2, r0)
            return r0
        L9b:
            java.util.List r0 = r5.lpy()
            int r0 = uef(r0)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.moa.yo.yo(r5, r2, r0)
            return r0
        La9:
            com.bytedance.sdk.openadsdk.core.settings.dj r0 = com.bytedance.sdk.openadsdk.core.settings.dj.oa()
            boolean r0 = r0.gzw()
            if (r0 == 0) goto Lb8
            int r5 = yo(r5)
            return r5
        Lb8:
            int r5 = oa(r5)
            return r5
        Lbd:
            r0 = 402(0x192, float:5.63E-43)
            com.bytedance.sdk.openadsdk.moa.yo.yo(r5, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.oa.uef(com.bytedance.sdk.openadsdk.core.model.gzw):int");
    }

    private static int uef(com.bytedance.sdk.openadsdk.core.model.cq cqVar) {
        if (cqVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(cqVar.uef())) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (TextUtils.isEmpty(cqVar.oa())) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        if (cqVar.yo() == 1 || cqVar.yo() == 2) {
            return 200;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }

    private static int uef(com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar, boolean z2) {
        if (oaVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(oaVar.dj())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z2 || !TextUtils.isEmpty(oaVar.zjm())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int uef(com.bytedance.sdk.openadsdk.core.model.ivm ivmVar) {
        if (ivmVar == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(ivmVar.uef())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        if (TextUtils.isEmpty(ivmVar.yo())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int uef(List<com.bytedance.sdk.openadsdk.core.model.sy> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.sy syVar : list) {
            if (syVar == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(syVar.uef())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void uef(final ArrayList<uef> arrayList) {
        com.bytedance.sdk.openadsdk.ab.moa.uef("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.oa.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    uef uefVar = (uef) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cid", uefVar.uef);
                    jSONObject2.put("error_msg", uefVar.f25721oa);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("multiple_ads_parsing_error").oa(jSONObject.toString());
            }
        });
    }

    public static boolean uef(String str) {
        if (str == null) {
            return false;
        }
        try {
            return !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("ttclid"));
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }
}
