package com.bytedance.sdk.component.lw.oa.yo.uef.oa;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.lw.bs;

/* loaded from: classes.dex */
public class uef implements bs {
    private com.bytedance.sdk.component.lw.oa.yo.uef.yo<String, Bitmap> moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25033oa;
    private long uef = 4194304;
    private int yo;

    public uef(int i5, int i10) {
        this.f25033oa = i10;
        this.yo = i5;
        this.moa = new com.bytedance.sdk.component.lw.oa.yo.uef.yo<>(i10);
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public boolean oa(String str) {
        return this.moa.uef((com.bytedance.sdk.component.lw.oa.yo.uef.yo<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public boolean uef(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iUef = uef(bitmap);
                if (iUef <= this.uef && iUef != 0) {
                    this.moa.uef(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public Bitmap uef(String str) {
        try {
            return this.moa.uef((com.bytedance.sdk.component.lw.oa.yo.uef.yo<String, Bitmap>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int uef(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
