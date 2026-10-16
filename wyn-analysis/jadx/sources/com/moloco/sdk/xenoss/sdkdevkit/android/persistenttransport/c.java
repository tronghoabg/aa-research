package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import Jd.C0672f;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f32436a;

    public c(e delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.f32436a = delegate;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str) {
        this.f32436a.a(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str, byte[] bArr, C0672f contentType, String str2) {
        AbstractC3340k.e(contentType, "contentType");
        this.f32436a.a(str, bArr, contentType, null);
    }
}
