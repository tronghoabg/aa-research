package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wrv {

    /* renamed from: ab, reason: collision with root package name */
    private final String f25714ab;
    private final long bcc;
    private final JSONObject bs;
    private final SparseArray<yo.uef> cq;
    private final int cz;
    private final int dj;
    private final int dz;
    private final float ivm;
    private final float lw;
    private final float moa;

    /* renamed from: oa, reason: collision with root package name */
    private final int[] f25715oa;
    private final int[] uef;
    private final JSONObject wk;
    private final int wrv;
    private final long xs;
    private final float yo;
    private final int zjm;

    public static class uef {

        /* renamed from: ab, reason: collision with root package name */
        private int f25716ab;
        private float bcc;
        private String bs;
        private int cq;
        private float cz;
        private JSONObject dhk;
        private int[] dj;
        private int dz;
        private float ivm;
        private long lw;
        private long moa;

        /* renamed from: oa, reason: collision with root package name */
        int f25717oa;
        private JSONObject oib;
        private int sy;
        float uef;
        private SparseArray<yo.uef> wk;
        private int wrv;
        private float xs;
        float yo;
        private int[] zjm;

        public uef ivm(float f10) {
            this.cz = f10;
            return this;
        }

        public uef lw(float f10) {
            this.bcc = f10;
            return this;
        }

        public uef moa(float f10) {
            this.xs = f10;
            return this;
        }

        public uef oa(JSONObject jSONObject) {
            this.dhk = jSONObject;
            return this;
        }

        public uef uef(int i5) {
            this.sy = i5;
            return this;
        }

        public uef yo(int i5) {
            this.f25717oa = i5;
            return this;
        }

        public uef ivm(int i5) {
            this.dz = i5;
            return this;
        }

        public uef lw(int i5) {
            this.cq = i5;
            return this;
        }

        public uef moa(int i5) {
            this.wrv = i5;
            return this;
        }

        public uef oa(int i5) {
            this.f25716ab = i5;
            return this;
        }

        public uef uef(JSONObject jSONObject) {
            this.oib = jSONObject;
            return this;
        }

        public uef yo(float f10) {
            this.ivm = f10;
            return this;
        }

        public uef oa(float f10) {
            this.yo = f10;
            return this;
        }

        public uef uef(SparseArray<yo.uef> sparseArray) {
            this.wk = sparseArray;
            return this;
        }

        public uef oa(long j8) {
            this.lw = j8;
            return this;
        }

        public uef uef(float f10) {
            this.uef = f10;
            return this;
        }

        public uef oa(int[] iArr) {
            this.dj = iArr;
            return this;
        }

        public uef uef(long j8) {
            this.moa = j8;
            return this;
        }

        public uef uef(int[] iArr) {
            this.zjm = iArr;
            return this;
        }

        public uef uef(String str) {
            this.bs = str;
            return this;
        }

        public wrv uef() {
            return new wrv(this);
        }
    }

    public JSONObject uef() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.bs;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.bs.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.uef;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.uef[1]));
            }
            int[] iArr2 = this.f25715oa;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.f25715oa[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.yo)).putOpt("down_y", Float.toString(this.moa)).putOpt("up_x", Float.toString(this.lw)).putOpt("up_y", Float.toString(this.ivm)).putOpt("down_time", Long.valueOf(this.xs)).putOpt("up_time", Long.valueOf(this.bcc)).putOpt("toolType", Integer.valueOf(this.cz)).putOpt("deviceId", Integer.valueOf(this.zjm)).putOpt("source", Integer.valueOf(this.dj)).putOpt("ft", uef(this.cq, this.wrv)).putOpt("click_area_type", this.f25714ab);
            int i5 = this.dz;
            if (i5 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i5));
            }
            JSONObject jSONObject3 = this.wk;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private wrv(uef uefVar) {
        this.uef = uefVar.zjm;
        this.f25715oa = uefVar.dj;
        this.yo = uefVar.cz;
        this.moa = uefVar.bcc;
        this.lw = uefVar.xs;
        this.ivm = uefVar.ivm;
        this.xs = uefVar.lw;
        this.bcc = uefVar.moa;
        this.cz = uefVar.wrv;
        this.zjm = uefVar.cq;
        this.dj = uefVar.dz;
        this.wrv = uefVar.f25716ab;
        this.cq = uefVar.wk;
        this.f25714ab = uefVar.bs;
        this.dz = uefVar.sy;
        this.wk = uefVar.oib;
        this.bs = uefVar.dhk;
    }

    public static JSONObject uef(SparseArray<yo.uef> sparseArray, int i5) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    yo.uef uefVarValueAt = sparseArray.valueAt(i10);
                    if (uefVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(uefVarValueAt.yo)).putOpt("mr", Double.valueOf(uefVarValueAt.f25837oa)).putOpt("phase", Integer.valueOf(uefVarValueAt.uef)).putOpt("ts", Long.valueOf(uefVarValueAt.moa));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i5)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
