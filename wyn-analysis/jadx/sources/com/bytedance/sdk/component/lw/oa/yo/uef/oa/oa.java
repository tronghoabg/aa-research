package com.bytedance.sdk.component.lw.oa.yo.uef.oa;

import com.bytedance.sdk.component.lw.sy;

/* loaded from: classes.dex */
public class oa implements sy {
    private com.bytedance.sdk.component.lw.oa.yo.uef.yo<String, byte[]> moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25032oa;
    private long uef = 1048576;
    private int yo;

    public oa(int i5, int i10) {
        this.yo = i5;
        this.f25032oa = i10;
        this.moa = new com.bytedance.sdk.component.lw.oa.yo.uef.yo<>(i10);
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public boolean oa(String str) {
        return this.moa.uef((com.bytedance.sdk.component.lw.oa.yo.uef.yo<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public boolean uef(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.uef) {
                    return false;
                }
                this.moa.uef(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public byte[] uef(String str) {
        try {
            return this.moa.uef((com.bytedance.sdk.component.lw.oa.yo.uef.yo<String, byte[]>) str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
