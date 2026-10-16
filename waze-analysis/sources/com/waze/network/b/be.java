package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class be extends bf {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f32012a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(byte[] bArr, String str) {
        super((byte[]) null);
        h.g.b.x.f(bArr, "data");
        h.g.b.x.f(str, "rtServerId");
        this.f32012a = bArr;
        this.f32013b = str;
    }

    public final String a() {
        return this.f32013b;
    }

    public final byte[] b() {
        return this.f32012a;
    }
}
