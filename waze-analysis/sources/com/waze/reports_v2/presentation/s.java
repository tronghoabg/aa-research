package com.waze.reports_v2.presentation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f35069a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f35070b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ s[] f35071c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f35072d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35073e;

    static {
        s sVar = new s("CONVERSATIONAL", 0, "CONVERSATIONAL");
        f35069a = sVar;
        s sVar2 = new s("MANUAL", 1, "MANUAL");
        f35070b = sVar2;
        s[] sVarArr = {sVar, sVar2};
        f35071c = sVarArr;
        f35072d = h.d.b.a(sVarArr);
    }

    private s(String str, int i2, String str2) {
        this.f35073e = str2;
    }

    public static h.d.a b() {
        return f35072d;
    }

    public static s[] values() {
        return (s[]) f35071c.clone();
    }

    public final String a() {
        return this.f35073e;
    }
}
