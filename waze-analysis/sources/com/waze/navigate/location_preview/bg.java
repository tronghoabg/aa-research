package com.waze.navigate.location_preview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    public static final bg f31635a;

    /* renamed from: b, reason: collision with root package name */
    public static final bg f31636b;

    /* renamed from: c, reason: collision with root package name */
    public static final bg f31637c;

    /* renamed from: d, reason: collision with root package name */
    public static final bg f31638d;

    /* renamed from: e, reason: collision with root package name */
    public static final bg f31639e;

    /* renamed from: f, reason: collision with root package name */
    public static final bg f31640f;

    /* renamed from: g, reason: collision with root package name */
    public static final bg f31641g;

    /* renamed from: h, reason: collision with root package name */
    public static final bg f31642h;

    /* renamed from: i, reason: collision with root package name */
    public static final bg f31643i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ bg[] f31644j;

    static {
        bg bgVar = new bg("VENUE_OPENING_STATUS_UNSPECIFIED", 0);
        f31635a = bgVar;
        bg bgVar2 = new bg("VENUE_OPENING_SOON", 1);
        f31636b = bgVar2;
        bg bgVar3 = new bg("VENUE_OPEN_NOW", 2);
        f31637c = bgVar3;
        bg bgVar4 = new bg("VENUE_OPEN_24_HOURS", 3);
        f31638d = bgVar4;
        bg bgVar5 = new bg("VENUE_CLOSED", 4);
        f31639e = bgVar5;
        bg bgVar6 = new bg("VENUE_CLOSES_SOON", 5);
        f31640f = bgVar6;
        bg bgVar7 = new bg("VENUE_TEMPORARILY_CLOSED", 6);
        f31641g = bgVar7;
        bg bgVar8 = new bg("VENUE_PERMANENTLY_CLOSED", 7);
        f31642h = bgVar8;
        bg bgVar9 = new bg("UNKNOWN", 8);
        f31643i = bgVar9;
        bg[] bgVarArr = {bgVar, bgVar2, bgVar3, bgVar4, bgVar5, bgVar6, bgVar7, bgVar8, bgVar9};
        f31644j = bgVarArr;
        h.d.b.a(bgVarArr);
    }

    public static bg[] values() {
        return (bg[]) f31644j.clone();
    }
}
