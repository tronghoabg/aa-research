package com.waze.bl.b.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f16972a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f16973b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f16974c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f16975d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ s[] f16976e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f16977f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16978g;

    static {
        s sVar = new s("ANY_ATTEMPT", 0, "ANY_ATTEMPT");
        f16972a = sVar;
        s sVar2 = new s("ANY_SUCCESSFUL_REPORT", 1, "ANY_SUCCESSFUL_REPORT");
        f16973b = sVar2;
        s sVar3 = new s("ANY_SUCCESSFUL_SIMPLE_REPORT", 2, "ANY_SUCCESSFUL_SIMPLE_REPORT");
        f16974c = sVar3;
        s sVar4 = new s("ANY_SUCCESSFUL_ADVANCED_REPORT", 3, "ANY_SUCCESSFUL_ADVANCED_REPORT");
        f16975d = sVar4;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        f16976e = sVarArr;
        f16977f = h.d.b.a(sVarArr);
    }

    private s(String str, int i2, String str2) {
        this.f16978g = str2;
    }

    public static h.d.a b() {
        return f16977f;
    }

    public static s[] values() {
        return (s[]) f16976e.clone();
    }

    public final String a() {
        return this.f16978g;
    }
}
