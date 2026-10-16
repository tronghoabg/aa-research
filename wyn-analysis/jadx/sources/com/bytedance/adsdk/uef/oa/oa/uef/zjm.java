package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zjm implements com.bytedance.adsdk.uef.oa.oa.uef {
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f24664oa;
    private com.bytedance.adsdk.uef.oa.oa.uef[] uef;
    private com.bytedance.adsdk.uef.oa.uef.uef yo;

    public zjm(String str) {
        this.f24664oa = str;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public String oa() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24664oa);
        sb2.append("(");
        com.bytedance.adsdk.uef.oa.oa.uef[] uefVarArr = this.uef;
        if (uefVarArr != null && uefVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                com.bytedance.adsdk.uef.oa.oa.uef[] uefVarArr2 = this.uef;
                if (i5 >= uefVarArr2.length) {
                    break;
                }
                sb2.append(uefVarArr2[i5].oa());
                sb2.append(",");
                i5++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void uef(com.bytedance.adsdk.uef.oa.oa.uef[] uefVarArr) {
        this.uef = uefVarArr;
    }

    public boolean yo() {
        return this.moa;
    }

    public void uef(boolean z2) {
        this.moa = z2;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        com.bytedance.adsdk.uef.oa.uef.uef uefVar = new com.bytedance.adsdk.uef.oa.uef.uef();
        this.yo = uefVar;
        uefVar.uef(this.f24664oa);
        Object[] objArr = new Object[this.uef.length];
        int i5 = 0;
        while (true) {
            com.bytedance.adsdk.uef.oa.oa.uef[] uefVarArr = this.uef;
            if (i5 < uefVarArr.length) {
                com.bytedance.adsdk.uef.oa.oa.uef uefVar2 = uefVarArr[i5];
                if (uefVar2 != null) {
                    objArr[i5] = uefVar2.uef(map);
                }
                i5++;
            } else {
                this.yo.uef(objArr);
                return com.bytedance.adsdk.uef.bs.uef(this.f24664oa).uef(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public com.bytedance.adsdk.uef.oa.moa.lw uef() {
        return com.bytedance.adsdk.uef.oa.moa.oa.METHOD;
    }
}
