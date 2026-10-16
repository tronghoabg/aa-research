package com.bytedance.sdk.openadsdk.dhk.uef;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.moa;

/* loaded from: classes3.dex */
public class oa {
    private Bitmap lw;
    private Bitmap moa;

    /* renamed from: oa, reason: collision with root package name */
    private Drawable f25886oa;
    int uef;
    private byte[] yo;

    public oa(Drawable drawable, int i5) {
        this.yo = null;
        this.moa = null;
        this.lw = null;
        this.f25886oa = drawable;
        this.uef = i5;
    }

    public boolean lw() {
        if (this.moa != null || this.f25886oa != null) {
            return true;
        }
        byte[] bArr = this.yo;
        return bArr != null && bArr.length > 0;
    }

    public Drawable moa() {
        return this.f25886oa;
    }

    public Bitmap oa() {
        return this.lw;
    }

    public Bitmap uef() {
        return this.moa;
    }

    public byte[] yo() {
        try {
            if (this.yo == null) {
                this.yo = moa.uef(this.moa);
            }
        } catch (OutOfMemoryError e7) {
            dhk.yo("GifRequestResult", e7.getMessage());
        }
        return this.yo;
    }

    public oa(byte[] bArr, int i5) {
        this.f25886oa = null;
        this.moa = null;
        this.lw = null;
        this.yo = bArr;
        this.uef = i5;
    }

    public oa(Bitmap bitmap, Bitmap bitmap2, int i5) {
        this.f25886oa = null;
        this.yo = null;
        this.lw = bitmap2;
        this.moa = bitmap;
        this.uef = i5;
    }
}
