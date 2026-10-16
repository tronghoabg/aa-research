package com.bytedance.sdk.component.ivm.uef.moa.uef;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef implements com.bytedance.sdk.component.ivm.uef.moa.uef {
    private String bcc;
    private byte cz;
    private int dj;
    private long ivm;
    private long lw;
    private byte moa;

    /* renamed from: oa, reason: collision with root package name */
    private oa f24992oa;
    protected JSONObject uef;
    private long xs;
    private byte yo;
    private String zjm;

    public uef(String str, JSONObject jSONObject) {
        this.bcc = str;
        this.uef = jSONObject;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public long bcc() {
        return this.ivm;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public int cz() {
        return this.dj;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public synchronized JSONObject ivm() {
        oa oaVar;
        try {
            if (this.uef == null && (oaVar = this.f24992oa) != null) {
                this.uef = oaVar.uef(zjm());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public byte lw() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public byte moa() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public byte oa() {
        return this.cz;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public oa uef() {
        return this.f24992oa;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public long xs() {
        return this.lw;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public String yo() {
        return this.bcc;
    }

    public String zjm() {
        return this.zjm;
    }

    public void oa(byte b5) {
        this.yo = b5;
    }

    public void uef(byte b5) {
        this.cz = b5;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public void yo(long j8) {
        this.xs = j8;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public void oa(long j8) {
        this.ivm = j8;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef
    public void uef(long j8) {
        this.lw = j8;
    }

    public void yo(byte b5) {
        this.moa = b5;
    }

    public uef(String str, oa oaVar) {
        this.bcc = str;
        this.f24992oa = oaVar;
    }

    public void uef(int i5) {
        this.dj = i5;
    }

    private uef() {
    }
}
