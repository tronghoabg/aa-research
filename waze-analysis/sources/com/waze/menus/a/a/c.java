package com.waze.menus.a.a;

import com.waze.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f29656a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f29657b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f29658c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f29659d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f29660e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ c[] f29661f;

    /* renamed from: g, reason: collision with root package name */
    private final int f29662g;

    static {
        c cVar = new c("CalendarSettings", 0, R.string.DESTINATION_MENU_DISCLAIMER_CALENDAR_SETTINGS);
        f29656a = cVar;
        c cVar2 = new c("PlannedDriveSettings", 1, R.string.DESTINATION_MENU_DISCLAIMER_PLANNED_SETTINGS);
        f29657b = cVar2;
        c cVar3 = new c("AdsLearnMore", 2, R.string.DESTINATION_MENU_DISCLAIMER_AD_LEARN);
        f29658c = cVar3;
        c cVar4 = new c("SuggestionSettings", 3, R.string.DESTINATION_MENU_DISCLAIMER_SUGGESTION_SETTINGS);
        f29659d = cVar4;
        c cVar5 = new c("NavigationHistory", 4, R.string.DESTINATION_MENU_DISCLAIMER_NAV_HISTORY);
        f29660e = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f29661f = cVarArr;
        h.d.b.a(cVarArr);
    }

    private c(String str, int i2, int i3) {
        this.f29662g = i3;
    }

    public static c[] values() {
        return (c[]) f29661f.clone();
    }

    public final int a() {
        return this.f29662g;
    }
}
