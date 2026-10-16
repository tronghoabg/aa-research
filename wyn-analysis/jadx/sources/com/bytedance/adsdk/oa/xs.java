package com.bytedance.adsdk.oa;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class xs {

    /* renamed from: ab, reason: collision with root package name */
    private yo f24600ab;
    private LongSparseArray<com.bytedance.adsdk.oa.yo.yo.lw> bcc;
    private float cq;
    private List<com.bytedance.adsdk.oa.yo.yo.lw> cz;
    private float dj;
    private boolean dz;
    private List<com.bytedance.adsdk.oa.yo.ivm> ivm;
    private Map<String, com.bytedance.adsdk.oa.yo.yo> lw;
    private Map<String, zjm> moa;
    private oa oib;
    private uef sy;
    private float wrv;
    private SparseArray<com.bytedance.adsdk.oa.yo.moa> xs;
    private Map<String, List<com.bytedance.adsdk.oa.yo.yo.lw>> yo;
    private Rect zjm;
    private final sy uef = new sy();

    /* renamed from: oa, reason: collision with root package name */
    private final HashSet<String> f24601oa = new HashSet<>();
    private int wk = 0;
    private String bs = "";

    public static class oa {

        /* renamed from: oa, reason: collision with root package name */
        public int[][] f24602oa;
        public String uef;
        public JSONArray yo;
    }

    public static class uef {
        public String ivm;
        public int lw;
        public int moa;

        /* renamed from: oa, reason: collision with root package name */
        public Map<String, Object> f24605oa;
        public int uef;
        public JSONArray xs;
        public Map<String, Object> yo;
    }

    public static class yo {
        public String ivm;
        public int[] lw;
        public String moa;

        /* renamed from: oa, reason: collision with root package name */
        public String f24607oa;
        public int uef;
        public JSONArray xs;
        public String yo;
    }

    public Map<String, zjm> ab() {
        return this.moa;
    }

    public yo bcc() {
        return this.f24600ab;
    }

    public float bs() {
        return this.wrv - this.dj;
    }

    public List<com.bytedance.adsdk.oa.yo.yo.lw> cq() {
        return this.cz;
    }

    public String cz() {
        return this.bs;
    }

    public uef dj() {
        return this.sy;
    }

    public SparseArray<com.bytedance.adsdk.oa.yo.moa> dz() {
        return this.xs;
    }

    public float ivm() {
        return this.dj;
    }

    public float lw() {
        return (long) ((bs() / this.cq) * 1000.0f);
    }

    public Rect moa() {
        return this.zjm;
    }

    public int oa() {
        return this.wk;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.oa.yo.yo.lw> it = this.cz.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().uef("\t"));
        }
        return sb2.toString();
    }

    public void uef(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.oa.yo.yo.lw> list, LongSparseArray<com.bytedance.adsdk.oa.yo.yo.lw> longSparseArray, Map<String, List<com.bytedance.adsdk.oa.yo.yo.lw>> map, Map<String, zjm> map2, SparseArray<com.bytedance.adsdk.oa.yo.moa> sparseArray, Map<String, com.bytedance.adsdk.oa.yo.yo> map3, List<com.bytedance.adsdk.oa.yo.ivm> list2, yo yoVar, String str, uef uefVar, oa oaVar) {
        this.zjm = rect;
        this.dj = f10;
        this.wrv = f11;
        this.cq = f12;
        this.cz = list;
        this.bcc = longSparseArray;
        this.yo = map;
        this.moa = map2;
        this.xs = sparseArray;
        this.lw = map3;
        this.ivm = list2;
        this.f24600ab = yoVar;
        this.bs = str;
        this.sy = uefVar;
        this.oib = oaVar;
    }

    public Map<String, com.bytedance.adsdk.oa.yo.yo> wk() {
        return this.lw;
    }

    public float wrv() {
        return this.cq;
    }

    public float xs() {
        return this.wrv;
    }

    public sy yo() {
        return this.uef;
    }

    public oa zjm() {
        return this.oib;
    }

    public void oa(boolean z2) {
        this.uef.uef(z2);
    }

    public com.bytedance.adsdk.oa.yo.ivm yo(String str) {
        int size = this.ivm.size();
        for (int i5 = 0; i5 < size; i5++) {
            com.bytedance.adsdk.oa.yo.ivm ivmVar = this.ivm.get(i5);
            if (ivmVar.uef(str)) {
                return ivmVar;
            }
        }
        return null;
    }

    public List<com.bytedance.adsdk.oa.yo.yo.lw> oa(String str) {
        return this.yo.get(str);
    }

    public void uef(String str) {
        this.f24601oa.add(str);
    }

    public void uef(boolean z2) {
        this.dz = z2;
    }

    public void uef(int i5) {
        this.wk += i5;
    }

    public boolean uef() {
        return this.dz;
    }

    public com.bytedance.adsdk.oa.yo.yo.lw uef(long j8) {
        return this.bcc.get(j8);
    }

    public float uef(float f10) {
        return com.bytedance.adsdk.oa.ivm.lw.uef(this.dj, this.wrv, f10);
    }
}
