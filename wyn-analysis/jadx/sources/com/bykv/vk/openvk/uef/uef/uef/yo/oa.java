package com.bykv.vk.openvk.uef.uef.uef.yo;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa {
    private String bcc;
    private int cq;
    private String cz;
    private double dj;
    private String ivm;
    private String lw;
    private double moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24519oa;
    private int uef;
    private int wrv;
    private String xs;
    private long yo;
    private String zjm;
    private float dz = -1.0f;
    private int wk = 0;

    /* renamed from: ab, reason: collision with root package name */
    private int f24518ab = 0;
    private int bs = 0;
    private int sy = 0;
    private int oib = 307200;
    private int dhk = 1;

    public int ab() {
        return this.bs;
    }

    public float bcc() {
        return this.dz;
    }

    public int bs() {
        return this.sy;
    }

    public String cq() {
        return this.cz;
    }

    public String cz() {
        return this.lw;
    }

    public int dhk() {
        return this.f24518ab;
    }

    public String dj() {
        return this.xs;
    }

    public String dz() {
        if (TextUtils.isEmpty(this.zjm)) {
            this.zjm = com.bykv.vk.openvk.uef.uef.uef.xs.oa.uef(this.xs);
        }
        return this.zjm;
    }

    public double ivm() {
        return this.moa;
    }

    public long lw() {
        return this.yo;
    }

    public int moa() {
        return this.cq;
    }

    public int oa() {
        return this.uef;
    }

    public int oib() {
        return this.wk;
    }

    public int orq() {
        return this.dhk;
    }

    public JSONObject sy() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", oa());
            jSONObject.put("cover_url", zjm());
            jSONObject.put("cover_width", yo());
            jSONObject.put("endcard", wrv());
            jSONObject.put("file_hash", dz());
            jSONObject.put("resolution", cz());
            jSONObject.put("size", lw());
            jSONObject.put("video_duration", ivm());
            jSONObject.put("video_url", dj());
            jSONObject.put("playable_download_url", cq());
            jSONObject.put("if_playable_loading_show", oib());
            jSONObject.put("remove_loading_page_type", dhk());
            jSONObject.put("fallback_endcard_judge", uef());
            jSONObject.put("video_preload_size", wk());
            jSONObject.put("reward_video_cached_type", ab());
            jSONObject.put("execute_cached_type", bs());
            jSONObject.put("endcard_render", moa());
            jSONObject.put("replay_time", orq());
            jSONObject.put("play_speed_ratio", bcc());
            if (xs() > 0.0d) {
                jSONObject.put("start", xs());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean tpx() {
        return this.bs == 0;
    }

    public int uef() {
        return this.wrv;
    }

    public int wk() {
        if (this.oib < 0) {
            this.oib = 307200;
        }
        long j8 = this.oib;
        long j10 = this.yo;
        if (j8 > j10) {
            this.oib = (int) j10;
        }
        return this.oib;
    }

    public String wrv() {
        return this.bcc;
    }

    public double xs() {
        return this.dj;
    }

    public int yo() {
        return this.f24519oa;
    }

    public String zjm() {
        return this.ivm;
    }

    public void bcc(int i5) {
        this.wk = i5;
    }

    public void cz(int i5) {
        this.f24518ab = i5;
    }

    public void ivm(String str) {
        this.zjm = str;
    }

    public void lw(String str) {
        this.cz = str;
    }

    public void moa(int i5) {
        this.cq = i5;
    }

    public void oa(int i5) {
        this.uef = i5;
    }

    public void uef(int i5) {
        this.wrv = i5;
    }

    public void xs(int i5) {
        this.sy = i5;
    }

    public void yo(int i5) {
        this.f24519oa = i5;
    }

    public void zjm(int i5) {
        this.dhk = Math.min(4, Math.max(1, i5));
    }

    public void ivm(int i5) {
        this.bs = i5;
    }

    public void lw(int i5) {
        this.oib = i5;
    }

    public void moa(String str) {
        this.bcc = str;
    }

    public void oa(String str) {
        this.ivm = str;
    }

    public void uef(long j8) {
        this.yo = j8;
    }

    public void yo(String str) {
        this.xs = str;
    }

    public void uef(double d3) {
        this.moa = d3;
    }

    public void uef(String str) {
        this.lw = str;
    }
}
