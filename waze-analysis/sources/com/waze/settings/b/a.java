package com.waze.settings.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36812a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f36813b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f36814c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f36815d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f36816e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f36817f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f36818g;

    /* renamed from: h, reason: collision with root package name */
    private final String f36819h;

    /* renamed from: i, reason: collision with root package name */
    private final String f36820i;

    static {
        a aVar = new a("GAS", 0, "gas_settings", "settings_main.driving_preferences.gas_stations");
        f36812a = aVar;
        a aVar2 = new a("SOUND", 1, "sound_settings", "settings_main.voice");
        f36813b = aVar2;
        a aVar3 = new a("MAP", 2, "advanced_map_settings", "settings_main.map_display");
        f36814c = aVar3;
        a aVar4 = new a("SPEEDOMETER", 3, "speedometer_settings", "settings_main.map_display.on_the_map.speedometer");
        f36815d = aVar4;
        a aVar5 = new a("PERSONALIZED_NAVIGATION", 4, "personalized_navigation_settings", "settings_main.general.personalization.personalized_navigation_settings");
        f36816e = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f36817f = aVarArr;
        f36818g = h.d.b.a(aVarArr);
    }

    /* synthetic */ a(String str, int i2, String str2, String str3) {
        this.f36819h = str2;
        this.f36820i = str3;
    }

    public static h.d.a c() {
        return f36818g;
    }

    public static a[] values() {
        return (a[]) f36817f.clone();
    }

    public final String a() {
        return this.f36819h;
    }

    public final String b() {
        return this.f36820i;
    }
}
