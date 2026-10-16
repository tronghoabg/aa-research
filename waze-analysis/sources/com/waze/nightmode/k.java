package com.waze.nightmode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f32473a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f32474b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f32475c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f32476d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ k[] f32477e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32478f;

    static {
        k kVar = new k("DAY", 0, "day");
        f32473a = kVar;
        k kVar2 = new k("NIGHT", 1, "night");
        f32474b = kVar2;
        k kVar3 = new k("DEVICE", 2, "device");
        f32475c = kVar3;
        k kVar4 = new k("DAYTIME", 3, "");
        f32476d = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f32477e = kVarArr;
        h.d.b.a(kVarArr);
    }

    private k(String str, int i2, String str2) {
        this.f32478f = str2;
    }

    public static k[] values() {
        return (k[]) f32477e.clone();
    }

    public final String a() {
        return this.f32478f;
    }
}
