package com.bytedance.adsdk.ugeno.moa.oa;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class uef {
    public static final HashSet<String> uef = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected String bcc;
    protected Map<String, Object> ivm;
    protected String lw;
    protected String moa;

    /* renamed from: oa, reason: collision with root package name */
    protected ivm.uef f24742oa;
    protected String xs;
    protected com.bytedance.adsdk.ugeno.oa.yo yo;

    /* renamed from: com.bytedance.adsdk.ugeno.moa.oa.uef$uef, reason: collision with other inner class name */
    public static class C0042uef {
        public static uef uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
            if (uefVar == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.moa.oa oaVarUef = com.bytedance.adsdk.ugeno.moa.moa.uef(uefVar.oa());
            if (oaVarUef == null && (TextUtils.isEmpty(uefVar.uef()) || !TextUtils.equals(uefVar.uef(), "global"))) {
                oaVarUef = com.bytedance.adsdk.ugeno.moa.moa.uef(uefVar.lw());
            }
            if (oaVarUef == null) {
                return new yo(yoVar, str, uefVar);
            }
            uef uefVarUef = oaVarUef.uef(yoVar, str, uefVar);
            return uefVarUef == null ? new yo(yoVar, str, uefVar) : uefVarUef;
        }
    }

    public uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
        this.yo = yoVar;
        this.f24742oa = uefVar;
        this.xs = str;
        lw();
    }

    private void lw() {
        ivm.uef uefVar = this.f24742oa;
        if (uefVar == null) {
            return;
        }
        this.moa = uefVar.uef();
        this.lw = this.f24742oa.oa();
        Map<String, Object> mapYo = this.f24742oa.yo();
        this.ivm = mapYo;
        if (mapYo == null || mapYo.isEmpty() || !this.ivm.containsKey("emitCustomEvent") || !(this.ivm.get("emitCustomEvent") instanceof String)) {
            return;
        }
        this.bcc = (String) this.ivm.get("emitCustomEvent");
    }

    public boolean moa() {
        return !TextUtils.isEmpty(this.bcc);
    }

    public void oa() {
        yo();
    }

    public abstract void uef();

    public void yo() {
        if (moa()) {
            ivm.uef uefVar = new ivm.uef();
            uefVar.uef("custom");
            uefVar.oa("emit");
            HashMap map = new HashMap();
            map.put(MediationMetaData.KEY_NAME, this.bcc);
            uefVar.uef(map);
            new oa(this.yo, this.lw, uefVar).uef();
        }
    }
}
