package com.waze.bg.e.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static final ad f16609a;

    /* renamed from: b, reason: collision with root package name */
    public static final ad f16610b;

    /* renamed from: c, reason: collision with root package name */
    public static final ad f16611c;

    /* renamed from: d, reason: collision with root package name */
    public static final ad f16612d;

    /* renamed from: e, reason: collision with root package name */
    public static final ad f16613e;

    /* renamed from: f, reason: collision with root package name */
    public static final ad f16614f;

    /* renamed from: g, reason: collision with root package name */
    public static final ad f16615g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ ad[] f16616h;

    static {
        ad adVar = new ad("WRONG_TURN", 0);
        f16609a = adVar;
        ad adVar2 = new ad("SETTINGS_CHANGED", 1);
        f16610b = adVar2;
        ad adVar3 = new ad("CLOSURE", 2);
        f16611c = adVar3;
        ad adVar4 = new ad("ADD_WAYPOINT", 3);
        f16612d = adVar4;
        ad adVar5 = new ad("REROUTE_WHEN_NOT_NAVIGATING", 4);
        f16613e = adVar5;
        ad adVar6 = new ad("LEGACY_REROUTE_SUGGESTION", 5);
        f16614f = adVar6;
        ad adVar7 = new ad("FLOW_NOT_SET", 6);
        f16615g = adVar7;
        f16616h = new ad[]{adVar, adVar2, adVar3, adVar4, adVar5, adVar6, adVar7};
    }

    public static ad[] values() {
        return (ad[]) f16616h.clone();
    }
}
