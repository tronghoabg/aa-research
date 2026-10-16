package com.bytedance.sdk.component.oa.uef;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class cz {

    /* renamed from: oa, reason: collision with root package name */
    private String f25056oa;
    private String uef;

    private cz(String str) {
        this.uef = str;
    }

    public static cz uef(String str) {
        return new cz(str);
    }

    public String uef() {
        return this.uef;
    }

    public Charset uef(Charset charset) {
        try {
            String str = this.f25056oa;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
