package com.bytedance.sdk.openadsdk.core.wrv;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
class uef {

    /* renamed from: oa, reason: collision with root package name */
    private volatile boolean f25817oa;
    private PglSSManager uef;
    private volatile boolean yo = true;
    private volatile boolean moa = false;

    public uef() {
        uef();
    }

    private boolean bcc() {
        if (!this.f25817oa && this.yo) {
            uef();
        }
        return this.f25817oa;
    }

    private void cz() {
        if (this.uef == null) {
            this.uef = PglSSManager.getInstance();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private Class zjm() {
        try {
            this.yo = true;
            return PglSSManager.class;
        } catch (Throwable unused) {
            this.yo = false;
            return PglSSManager.class;
        }
    }

    public long ivm() {
        if (!bcc()) {
            return 0L;
        }
        cz();
        PglSSManager pglSSManager = this.uef;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public String lw() {
        if (!bcc()) {
            return "";
        }
        cz();
        PglSSManager pglSSManager = this.uef;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public String moa() {
        String strOa = com.bytedance.sdk.openadsdk.core.yo.uef().oa("sec_token", "");
        if (bcc()) {
            cz();
            PglSSManager pglSSManager = this.uef;
            if (pglSSManager != null) {
                String token = pglSSManager.getToken();
                if (!TextUtils.isEmpty(token) && !TextUtils.equals(strOa, token)) {
                    com.bytedance.sdk.openadsdk.core.yo.uef().uef("sec_token", token);
                }
                return token;
            }
        }
        return strOa;
    }

    public boolean oa() {
        return this.f25817oa;
    }

    public int xs() {
        if (this.yo) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public void yo() {
        if (bcc()) {
            cz();
            if (this.uef != null) {
                wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wrv.uef.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, sy.moa().orq());
                            uef.this.uef.setCustomInfo(map);
                        } catch (Throwable th) {
                            dhk.yo("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void oa(String str) {
        if (bcc()) {
            cz();
            PglSSManager pglSSManager = this.uef;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public synchronized void uef() {
        Context contextUef;
        String strMoa;
        Set<String> setNj;
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            return;
        }
        if (!this.f25817oa) {
            try {
                contextUef = sy.uef();
                strMoa = zjm.oa().moa();
                if (TextUtils.isEmpty(strMoa)) {
                    strMoa = zjm.uef("app_id", Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                zjm();
                this.f25817oa = false;
            }
            if (TextUtils.isEmpty(strMoa)) {
                return;
            }
            String strUef = cq.uef(contextUef);
            String strOa = com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa();
            PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strMoa).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
            String strOa2 = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(strOa2)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOa2);
            }
            Set<String> setAje = dj.oa().aje();
            if (setAje != null && !setAje.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setAje);
            }
            String strSy = gb.sy();
            if (!TextUtils.isEmpty(strSy)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strSy);
            }
            if (!com.bytedance.sdk.openadsdk.utils.oa.oa() || (setNj = dj.oa().nj()) == null || setNj.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            } else {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, setNj);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, dj.oa().jp());
            String strUef2 = lw.uef(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
            if (!TextUtils.isEmpty(strUef2)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strUef2);
            }
            pglSSConfigBuild.setCustomInfo(map);
            pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.wrv.uef.1
                @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                public void reportSoftDecData(final String str, final String str2) {
                    moa.uef(str, false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.wrv.uef.1.1
                        @Override // com.bytedance.sdk.openadsdk.ab.oa
                        public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                            return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef(str).oa(str2);
                        }
                    });
                }
            });
            PglSSManager.init(contextUef, pglSSConfigBuild, null, null, strUef, strOa);
            cz();
            this.f25817oa = true;
            try {
                if (this.yo) {
                    yo(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                dhk.yo("mssdk", th.getMessage());
            }
        }
    }

    private void yo(final String str) {
        if (this.moa || TextUtils.isEmpty(str)) {
            return;
        }
        sy.lw().uef(new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.wrv.uef.4
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("secsdk_init_error").oa(str);
            }
        }, false);
        this.moa = true;
    }

    public void uef(String str) {
        if (bcc()) {
            cz();
            PglSSManager pglSSManager = this.uef;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void uef(final Map<String, Object> map) {
        if (bcc()) {
            cz();
            if (this.uef != null) {
                wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wrv.uef.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            uef.this.uef.setCustomInfo(map);
                        } catch (Throwable th) {
                            dhk.yo("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void uef(String str, Map<String, Object> map) {
        if (bcc()) {
            cz();
            PglSSManager pglSSManager = this.uef;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void uef(MotionEvent motionEvent) {
        if (oa()) {
            cz();
            PglSSManager pglSSManager = this.uef;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> uef(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!bcc() || (featureHash = this.uef.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
