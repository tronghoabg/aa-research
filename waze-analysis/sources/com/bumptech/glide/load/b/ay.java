package com.bumptech.glide.load.b;

import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ay implements ae {

    /* renamed from: b, reason: collision with root package name */
    private static final ay f3244b = new ay(1, null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3245a;

    public ay(int i2) {
        this.f3245a = i2;
    }

    public static ay a() {
        return f3244b;
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        int i2 = this.f3245a;
        return i2 != 0 ? i2 != 1 ? new s(alVar.a(t.class, InputStream.class), 5) : at.c() : new az(alVar.a(t.class, InputStream.class));
    }

    @Deprecated
    public ay(int i2, byte[] bArr) {
        this.f3245a = i2;
    }
}
