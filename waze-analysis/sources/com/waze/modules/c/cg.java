package com.waze.modules.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cg {

    /* renamed from: a, reason: collision with root package name */
    public static final cg f29948a;

    /* renamed from: b, reason: collision with root package name */
    public static final cg f29949b;

    /* renamed from: c, reason: collision with root package name */
    public static final cg f29950c;

    /* renamed from: d, reason: collision with root package name */
    public static final cg f29951d;

    /* renamed from: e, reason: collision with root package name */
    public static final cg f29952e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cg[] f29953f;

    /* renamed from: g, reason: collision with root package name */
    private final String f29954g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f29955h;

    static {
        cg cgVar = new cg("TRIP_OVERVIEW", 0, "-10", true);
        f29948a = cgVar;
        cg cgVar2 = new cg("ALTERNATE_ROUTES", 1, "-11", false);
        f29949b = cgVar2;
        cg cgVar3 = new cg("ADDRESS_PREVIEW_ETA", 2, "-10", true);
        f29950c = cgVar3;
        cg cgVar4 = new cg("CRISIS_RESPONSE_ETA", 3, "-10", true);
        f29951d = cgVar4;
        cg cgVar5 = new cg("PARKING_ETA", 4, "-10", true);
        f29952e = cgVar5;
        cg[] cgVarArr = {cgVar, cgVar2, cgVar3, cgVar4, cgVar5};
        f29953f = cgVarArr;
        h.d.b.a(cgVarArr);
    }

    private cg(String str, int i2, String str2, boolean z) {
        this.f29954g = str2;
        this.f29955h = z;
    }

    public static cg[] values() {
        return (cg[]) f29953f.clone();
    }

    public final String a() {
        return this.f29954g;
    }

    public final boolean b() {
        return this.f29955h;
    }
}
