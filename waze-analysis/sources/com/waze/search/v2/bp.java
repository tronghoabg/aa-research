package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f36190a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36191b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(String str, boolean z, boolean z2) {
        super(null);
        h.g.b.x.f(str, "amenity");
        this.f36190a = str;
        this.f36191b = z;
        this.f36192c = z2;
    }

    public final String a() {
        return this.f36190a;
    }

    public final boolean b() {
        return this.f36191b;
    }

    public final boolean c() {
        return this.f36192c;
    }
}
