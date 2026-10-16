package com.bytedance.adsdk.ugeno.uef;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes.dex */
public class yo {
    private String bcc;
    private int cz = 1;
    private uef ivm;
    private long lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f24772oa;
    private Map<String, TreeMap<Float, String>> uef;
    private String xs;
    private int yo;
    private JSONObject zjm;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public String f24773oa;
        public String uef;
    }

    public String bcc() {
        return this.xs;
    }

    public String cz() {
        return this.bcc;
    }

    public long ivm() {
        return this.lw;
    }

    public String lw() {
        return this.moa;
    }

    public int moa() {
        return this.yo;
    }

    public Map<String, TreeMap<Float, String>> oa() {
        return this.uef;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb2.append(this.uef);
        sb2.append(", mDuration=");
        sb2.append(this.f24772oa);
        sb2.append(", mPlayCount=");
        sb2.append(this.yo);
        sb2.append(", mPlayDirection=");
        sb2.append(this.moa);
        sb2.append(", mDelay=");
        sb2.append(this.lw);
        sb2.append(", mName=");
        sb2.append(this.bcc);
        sb2.append(", mPlayState=");
        sb2.append(this.cz);
        sb2.append(", mTransformOrigin='");
        sb2.append(this.ivm);
        sb2.append("', mTimingFunction='");
        return b.c(sb2, this.xs, "'}");
    }

    public JSONObject uef() {
        return this.zjm;
    }

    public uef xs() {
        return this.ivm;
    }

    public long yo() {
        return this.f24772oa;
    }

    public int zjm() {
        return this.cz;
    }

    public void oa(long j8) {
        this.lw = j8;
    }

    public void uef(JSONObject jSONObject) {
        this.zjm = jSONObject;
    }

    public void yo(String str) {
        this.bcc = str;
    }

    public void oa(String str) {
        this.xs = str;
    }

    public void uef(Map<String, TreeMap<Float, String>> map) {
        this.uef = map;
    }

    public void oa(int i5) {
        this.cz = i5;
    }

    public void uef(long j8) {
        this.f24772oa = j8;
    }

    public void uef(int i5) {
        this.yo = i5;
    }

    public void uef(String str) {
        this.moa = str;
    }

    public void uef(uef uefVar) {
        this.ivm = uefVar;
    }
}
