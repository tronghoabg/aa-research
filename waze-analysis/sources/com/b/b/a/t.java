package com.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2610a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f2611b;

    t(Object obj, int i2) {
        this.f2611b = i2;
        this.f2610a = obj;
    }

    @Override // com.b.b.a.s
    public final Object a() {
        if (this.f2611b != 0) {
            return null;
        }
        return this.f2610a;
    }

    @Override // com.b.b.a.s
    public final Throwable b() {
        if (this.f2611b != 0) {
            return (Throwable) this.f2610a;
        }
        return null;
    }

    @Override // com.b.b.a.s
    public final boolean c() {
        return this.f2611b == 0;
    }
}
