package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ka implements com.google.v.ei {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f11676f;

    /* renamed from: e, reason: collision with root package name */
    static final com.google.v.ei f11675e = new ka(4);

    /* renamed from: d, reason: collision with root package name */
    static final com.google.v.ei f11674d = new ka(3);

    /* renamed from: c, reason: collision with root package name */
    static final com.google.v.ei f11673c = new ka(2);

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f11672b = new ka(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f11671a = new ka(0);

    private ka(int i2) {
        this.f11676f = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f11676f;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? kl.a(i2) != null : kf.a(i2) != null : ke.a(i2) != null : jz.a(i2) != null : kb.a(i2) != null;
    }
}
