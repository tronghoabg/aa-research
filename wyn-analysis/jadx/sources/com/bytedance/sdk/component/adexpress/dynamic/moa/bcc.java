package com.bytedance.sdk.component.adexpress.dynamic.moa;

import N0.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bcc {
    private float bcc;
    private String cq;
    private lw cz;
    private bcc dj;
    private boolean dz;
    private float ivm;
    private float lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24849oa;
    private String uef;
    private List<List<bcc>> wrv;
    private float xs;
    private float yo;
    private List<bcc> zjm;
    private Map<String, String> wk = new HashMap();

    /* renamed from: ab, reason: collision with root package name */
    private Map<Integer, String> f24848ab = new HashMap();

    public float ab() {
        ivm ivmVarLw = this.cz.lw();
        return (ivmVarLw.wrv() * 2.0f) + ivmVarLw.dz() + ivmVarLw.bs() + dz();
    }

    public float bcc() {
        return this.ivm;
    }

    public List<List<bcc>> bs() {
        return this.wrv;
    }

    public int cq() {
        ivm ivmVarLw = this.cz.lw();
        return ivmVarLw.etd() + ivmVarLw.dor();
    }

    public float cz() {
        return this.xs;
    }

    public Map<String, String> dhk() {
        return this.wk;
    }

    public List<bcc> dj() {
        return this.zjm;
    }

    public int dz() {
        ivm ivmVarLw = this.cz.lw();
        return ivmVarLw.au() + ivmVarLw.cop();
    }

    public boolean gsd() {
        return this.cz.lw().ne() < 0 || this.cz.lw().dh() < 0 || this.cz.lw().vj() < 0 || this.cz.lw().ix() < 0;
    }

    public String gzw() {
        return this.cz.lw().gzw();
    }

    public float ivm() {
        return this.f24849oa;
    }

    public float lw() {
        return this.lw;
    }

    public float moa() {
        return this.moa;
    }

    public Map<Integer, String> oa() {
        return this.f24848ab;
    }

    public boolean oib() {
        return this.dz;
    }

    public boolean orq() {
        return TextUtils.equals(this.cz.lw().pz(), "flex");
    }

    public boolean sy() {
        List<bcc> list = this.zjm;
        return list == null || list.size() <= 0;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.uef + "', x=" + this.f24849oa + ", y=" + this.yo + ", width=" + this.ivm + ", height=" + this.xs + ", remainWidth=" + this.bcc + ", rootBrick=" + this.cz + ", childrenBrickUnits=" + this.zjm + '}';
    }

    public void tpx() {
        List<List<bcc>> list = this.wrv;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<bcc> list2 : this.wrv) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.wrv = arrayList;
    }

    public String uef() {
        return this.cq;
    }

    public float wk() {
        ivm ivmVarLw = this.cz.lw();
        return (ivmVarLw.wrv() * 2.0f) + ivmVarLw.ab() + ivmVarLw.wk() + cq();
    }

    public bcc wrv() {
        return this.dj;
    }

    public float xs() {
        return this.yo;
    }

    public String yo() {
        return this.uef;
    }

    public lw zjm() {
        return this.cz;
    }

    public void ivm(float f10) {
        this.xs = f10;
    }

    public void lw(float f10) {
        this.ivm = f10;
    }

    public void moa(float f10) {
        this.yo = f10;
    }

    public void oa(String str) {
        this.uef = str;
    }

    public void uef(String str) {
        this.cq = str;
    }

    public void xs(float f10) {
        this.bcc = f10;
    }

    public void yo(float f10) {
        this.f24849oa = f10;
    }

    public void oa(float f10) {
        this.lw = f10;
    }

    public void uef(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                    this.f24848ab.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void yo(String str) {
        this.cz.lw().ivm(str);
    }

    public void oa(List<List<bcc>> list) {
        this.wrv = list;
    }

    public void uef(float f10) {
        this.moa = f10;
    }

    public void uef(lw lwVar) {
        this.cz = lwVar;
    }

    public void uef(List<bcc> list) {
        this.zjm = list;
    }

    public void uef(bcc bccVar) {
        this.dj = bccVar;
    }

    public void uef(boolean z2) {
        this.dz = z2;
    }

    public void uef(String str, String str2) {
        this.wk.put(str, str2);
    }

    public String uef(int i5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.cz.oa());
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(this.uef);
        if (this.cz.lw() != null) {
            sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(this.cz.lw().nj());
        }
        return a.d(i5, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, sb2);
    }
}
