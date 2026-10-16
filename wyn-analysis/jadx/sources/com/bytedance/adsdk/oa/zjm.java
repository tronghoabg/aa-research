package com.bytedance.adsdk.oa;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class zjm {
    private final String bcc;
    private final int[][] cz;
    private Bitmap dj;
    private final String ivm;
    private final String lw;
    private final String moa;

    /* renamed from: oa, reason: collision with root package name */
    private final int f24654oa;
    private final int uef;
    private final List<uef> xs;
    private final String yo;
    private final JSONArray zjm;

    public static class uef {
        public int ivm;
        public int lw;
        public String moa;

        /* renamed from: oa, reason: collision with root package name */
        public int f24655oa;
        public int uef;
        public String xs;
        public String yo;
    }

    public zjm(int i5, int i10, String str, String str2, String str3, String str4, List<uef> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.uef = i5;
        this.f24654oa = i10;
        this.yo = str;
        this.moa = str2;
        this.lw = str3;
        this.ivm = str4;
        this.xs = list;
        this.bcc = str5;
        this.cz = iArr;
        this.zjm = jSONArray;
    }

    public String bcc() {
        return this.yo;
    }

    public String cz() {
        return this.moa;
    }

    public Bitmap dj() {
        return this.dj;
    }

    public int[][] ivm() {
        return this.cz;
    }

    public String lw() {
        return this.bcc;
    }

    public String moa() {
        return this.ivm;
    }

    public int oa() {
        return this.f24654oa;
    }

    public int uef() {
        return this.uef;
    }

    public JSONArray xs() {
        return this.zjm;
    }

    public List<uef> yo() {
        return this.xs;
    }

    public String zjm() {
        return this.lw;
    }

    public void uef(Bitmap bitmap) {
        this.dj = bitmap;
    }
}
