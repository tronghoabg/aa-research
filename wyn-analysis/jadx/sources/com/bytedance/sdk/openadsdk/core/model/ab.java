package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ab implements com.bytedance.sdk.component.adexpress.yo {

    /* renamed from: ab, reason: collision with root package name */
    public String f25656ab;
    public int bcc;
    public int bs;
    public JSONObject cq;
    public JSONObject cz;
    public final boolean dj;
    public boolean dz;
    public final long ivm;
    public final long lw;
    public final float moa;

    /* renamed from: oa, reason: collision with root package name */
    public final float f25657oa;
    public final float uef;
    public int wk;
    public int wrv;
    public final String xs;
    public final float yo;
    public SparseArray<yo.uef> zjm;

    public static class uef {

        /* renamed from: ab, reason: collision with root package name */
        private int f25658ab;
        private int bcc;
        private boolean bs;
        private JSONObject cq;
        private String cz;
        private JSONObject dj;
        private float ivm;
        private float lw;
        private float moa;

        /* renamed from: oa, reason: collision with root package name */
        private long f25659oa;
        private String wk;
        private int wrv;
        private float xs;
        private long yo;
        private int zjm;
        private boolean dz = false;
        protected SparseArray<yo.uef> uef = new SparseArray<>();

        public uef moa(float f10) {
            this.xs = f10;
            return this;
        }

        public uef oa(int i5) {
            this.zjm = i5;
            return this;
        }

        public uef uef(int i5) {
            this.wrv = i5;
            return this;
        }

        public uef yo(int i5) {
            this.bcc = i5;
            return this;
        }

        public uef moa(int i5) {
            this.f25658ab = i5;
            return this;
        }

        public uef oa(long j8) {
            this.yo = j8;
            return this;
        }

        public uef uef(JSONObject jSONObject) {
            this.dj = jSONObject;
            return this;
        }

        public uef yo(float f10) {
            this.ivm = f10;
            return this;
        }

        public uef oa(float f10) {
            this.lw = f10;
            return this;
        }

        public uef uef(boolean z2) {
            this.bs = z2;
            return this;
        }

        public uef oa(JSONObject jSONObject) {
            this.cq = jSONObject;
            return this;
        }

        public uef uef(long j8) {
            this.f25659oa = j8;
            return this;
        }

        public uef oa(boolean z2) {
            this.dz = z2;
            return this;
        }

        public uef uef(float f10) {
            this.moa = f10;
            return this;
        }

        public uef oa(String str) {
            this.wk = str;
            return this;
        }

        public uef uef(String str) {
            this.cz = str;
            return this;
        }

        public uef uef(SparseArray<yo.uef> sparseArray) {
            this.uef = sparseArray;
            return this;
        }

        public ab uef() {
            return new ab(this);
        }
    }

    private ab(uef uefVar) {
        this.dz = false;
        this.uef = uefVar.xs;
        this.f25657oa = uefVar.ivm;
        this.yo = uefVar.lw;
        this.moa = uefVar.moa;
        this.lw = uefVar.yo;
        this.ivm = uefVar.f25659oa;
        this.xs = uefVar.cz;
        this.zjm = uefVar.uef;
        this.dj = uefVar.bs;
        this.bcc = uefVar.zjm;
        this.cz = uefVar.dj;
        this.wrv = uefVar.wrv;
        this.cq = uefVar.cq;
        this.dz = uefVar.dz;
        this.wk = uefVar.bcc;
        this.f25656ab = uefVar.wk;
        this.bs = uefVar.f25658ab;
    }
}
