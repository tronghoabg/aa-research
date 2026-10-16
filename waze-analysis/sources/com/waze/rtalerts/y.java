package com.waze.rtalerts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f35166a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f35167b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f35168c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ y[] f35169d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35170e;

    static {
        y yVar = new y("RT_ALERTS_USE_CASE_DEFAULT", 0, "DEFAULT");
        f35166a = yVar;
        y yVar2 = new y("RT_ALERTS_USE_CASE_HANDS_FREE", 1, "HANDS_FREE");
        f35167b = yVar2;
        y yVar3 = new y("RT_ALERTS_USE_CASE_CONVERSATION", 2, "CONVERSATION");
        f35168c = yVar3;
        y[] yVarArr = {yVar, yVar2, yVar3};
        f35169d = yVarArr;
        h.d.b.a(yVarArr);
    }

    private y(String str, int i2, String str2) {
        this.f35170e = str2;
    }

    public static y[] values() {
        return (y[]) f35169d.clone();
    }

    public final String a() {
        return this.f35170e;
    }
}
