package com.waze.search;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f36000a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f36001b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ s[] f36002c;

    static {
        s sVar = new s("START_NAVIGATION", 0);
        f36000a = sVar;
        s sVar2 = new s("SAVED_PLANNED_DRIVE", 1);
        f36001b = sVar2;
        s[] sVarArr = {sVar, sVar2};
        f36002c = sVarArr;
        h.d.b.a(sVarArr);
    }

    public static s a(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f36002c.clone();
    }
}
