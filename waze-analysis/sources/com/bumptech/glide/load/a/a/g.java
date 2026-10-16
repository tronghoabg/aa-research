package com.bumptech.glide.load.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f2947a;

    public g(int i2) {
        this.f2947a = i2;
    }

    @Override // com.bumptech.glide.load.a.a.a
    public final /* synthetic */ int a(Object obj) {
        return this.f2947a != 0 ? ((byte[]) obj).length : ((int[]) obj).length;
    }

    @Override // com.bumptech.glide.load.a.a.a
    public final int b() {
        return this.f2947a != 0 ? 1 : 4;
    }

    @Override // com.bumptech.glide.load.a.a.a
    public final /* synthetic */ Object c(int i2) {
        return this.f2947a != 0 ? new byte[i2] : new int[i2];
    }

    @Override // com.bumptech.glide.load.a.a.a
    public final String d() {
        return this.f2947a != 0 ? "ByteArrayPool" : "IntegerArrayPool";
    }
}
