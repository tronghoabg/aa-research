package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bu extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31689a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.d.k f31690b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f31691c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(boolean z, com.waze.av.d.k kVar, Integer num, boolean z2) {
        super(null, null);
        h.g.b.x.f(kVar, "venue");
        this.f31689a = z;
        this.f31690b = kVar;
        this.f31691c = num;
        this.f31692d = z2;
    }

    public final com.waze.av.d.k a() {
        return this.f31690b;
    }

    public final Integer b() {
        return this.f31691c;
    }

    public final boolean c() {
        return this.f31689a;
    }

    public final boolean d() {
        return this.f31692d;
    }
}
