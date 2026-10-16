package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oib implements com.bytedance.adsdk.uef.oa.oa.oa {

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.adsdk.uef.oa.oa.uef f24663oa;
    private com.bytedance.adsdk.uef.oa.oa.uef uef;
    private com.bytedance.adsdk.uef.oa.oa.uef yo;

    @Override // com.bytedance.adsdk.uef.oa.oa.oa
    public void oa(com.bytedance.adsdk.uef.oa.oa.uef uefVar) {
        this.f24663oa = uefVar;
    }

    public String toString() {
        return oa();
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        Object objUef = this.uef.uef(map);
        if (objUef == null) {
            return null;
        }
        return ((Boolean) objUef).booleanValue() ? this.f24663oa.uef(map) : this.yo.uef(map);
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.oa
    public void yo(com.bytedance.adsdk.uef.oa.oa.uef uefVar) {
        this.yo = uefVar;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public String oa() {
        return this.uef.oa() + "?" + this.f24663oa.oa() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + this.yo.oa();
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public com.bytedance.adsdk.uef.oa.moa.lw uef() {
        return com.bytedance.adsdk.uef.oa.moa.ivm.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.oa
    public void uef(com.bytedance.adsdk.uef.oa.oa.uef uefVar) {
        this.uef = uefVar;
    }
}
