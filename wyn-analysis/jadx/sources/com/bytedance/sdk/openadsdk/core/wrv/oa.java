package com.bytedance.sdk.openadsdk.core.wrv;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class oa {
    private static com.bytedance.sdk.openadsdk.core.wrv.uef uef;

    public static class uef {
        private static final oa uef = new oa();
    }

    public long ivm() {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        if (uefVar != null) {
            return uefVar.ivm();
        }
        return 0L;
    }

    public String lw() {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        return uefVar != null ? uefVar.lw() : "";
    }

    public String moa() {
        String strMoa;
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        return (uefVar == null || (strMoa = uefVar.moa()) == null) ? "" : strMoa;
    }

    public void oa(String str) {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar;
        if (TextUtils.isEmpty(str) || (uefVar = uef) == null) {
            return;
        }
        uefVar.oa(str);
    }

    public void uef(String str) {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar;
        if (TextUtils.isEmpty(str) || (uefVar = uef) == null) {
            return;
        }
        uefVar.uef(str);
    }

    public int xs() {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        if (uefVar != null) {
            return uefVar.xs();
        }
        return 1;
    }

    public boolean yo() {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        if (uefVar == null) {
            return false;
        }
        return uefVar.oa();
    }

    private oa() {
        uef = new com.bytedance.sdk.openadsdk.core.wrv.uef();
    }

    public static oa oa() {
        return uef.uef;
    }

    public void uef(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        if (uefVar != null) {
            uefVar.uef(map);
        }
    }

    public void uef() {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        if (uefVar != null) {
            uefVar.yo();
        }
    }

    public void uef(String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        if (uefVar != null) {
            uefVar.uef(str, map);
        }
    }

    public Map<String, String> uef(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        if (uefVar != null) {
            return uefVar.uef(str, bArr);
        }
        return new HashMap();
    }

    public void uef(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.wrv.uef uefVar = uef;
        if (uefVar != null) {
            uefVar.uef(motionEvent);
        }
    }
}
