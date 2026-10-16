package com.bytedance.sdk.component.lw.oa.yo.uef.oa;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.lw.bs;

/* loaded from: classes.dex */
public class yo implements bs {

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.component.lw.oa.yo.uef.uef f25034oa;
    private final bs uef;

    public yo(bs bsVar) {
        this(bsVar, null);
    }

    public yo(bs bsVar, com.bytedance.sdk.component.lw.oa.yo.uef.uef uefVar) {
        this.uef = bsVar;
        this.f25034oa = uefVar;
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public boolean oa(String str) {
        return this.uef.oa(str);
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public boolean uef(String str, Bitmap bitmap) {
        return this.uef.uef(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public Bitmap uef(String str) {
        return this.uef.uef(str);
    }
}
