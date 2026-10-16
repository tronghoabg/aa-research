package U8;

import com.unity3d.services.ads.adunit.AdUnitActivity;

/* renamed from: U8.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0889s implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0889s f12676a = new C0889s();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12677b = h9.d.c("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12678c = h9.d.c("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12679d = h9.d.c("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12680e = h9.d.c(AdUnitActivity.EXTRA_ORIENTATION);

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f12681f = h9.d.c("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f12682g = h9.d.c("diskUsed");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        C0863d0 c0863d0 = (C0863d0) ((G0) obj);
        fVar.add(f12677b, c0863d0.f12550a);
        fVar.add(f12678c, c0863d0.f12551b);
        fVar.add(f12679d, c0863d0.f12552c);
        fVar.add(f12680e, c0863d0.f12553d);
        fVar.add(f12681f, c0863d0.f12554e);
        fVar.add(f12682g, c0863d0.f12555f);
    }
}
