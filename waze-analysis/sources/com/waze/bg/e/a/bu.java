package com.waze.bg.e.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    public static final bu f16631a;

    /* renamed from: b, reason: collision with root package name */
    public static final bu f16632b;

    /* renamed from: c, reason: collision with root package name */
    public static final bu f16633c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ bu[] f16634d;

    static {
        bu buVar = new bu("SILENT_REROUTE", 0);
        f16631a = buVar;
        bu buVar2 = new bu("PROMPT_REROUTE", 1);
        f16632b = buVar2;
        bu buVar3 = new bu("REROUTEVISIBILITY_NOT_SET", 2);
        f16633c = buVar3;
        f16634d = new bu[]{buVar, buVar2, buVar3};
    }

    public static bu[] values() {
        return (bu[]) f16634d.clone();
    }
}
