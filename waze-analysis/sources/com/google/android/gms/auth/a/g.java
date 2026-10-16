package com.google.android.gms.auth.a;

import com.google.android.gms.common.api.internal.av;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f4430a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4431b;

    /* renamed from: c, reason: collision with root package name */
    private String f4432c = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

    public final h a() {
        return new h(this.f4430a, this.f4431b, this.f4432c);
    }

    public final void b(byte[] bArr) {
        this.f4430a = bArr;
    }

    public final void c(String str) {
        av.l(str, "key cannot be null or empty");
        this.f4432c = str;
    }

    public final void d() {
        this.f4431b = true;
    }
}
