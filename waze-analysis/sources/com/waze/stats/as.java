package com.waze.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    public static final as f40544a;

    /* renamed from: b, reason: collision with root package name */
    public static final as f40545b;

    /* renamed from: c, reason: collision with root package name */
    public static final as f40546c;

    /* renamed from: d, reason: collision with root package name */
    public static final as f40547d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ as[] f40548e;

    static {
        as asVar = new as("AUTHENTICATED", 0);
        f40544a = asVar;
        as asVar2 = new as("UNAUTHENTICATED", 1);
        f40545b = asVar2;
        as asVar3 = new as("AD_EVENT_AUTHENTICATED", 2);
        f40546c = asVar3;
        as asVar4 = new as("METRICS", 3);
        f40547d = asVar4;
        as[] asVarArr = {asVar, asVar2, asVar3, asVar4};
        f40548e = asVarArr;
        h.d.b.a(asVarArr);
    }

    public static as[] values() {
        return (as[]) f40548e.clone();
    }
}
