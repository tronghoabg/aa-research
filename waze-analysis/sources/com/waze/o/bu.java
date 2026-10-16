package com.waze.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    public static final bu f32778a;

    /* renamed from: b, reason: collision with root package name */
    public static final bu f32779b;

    /* renamed from: c, reason: collision with root package name */
    public static final bu f32780c;

    /* renamed from: d, reason: collision with root package name */
    public static final bu f32781d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bu[] f32782e;

    static {
        bu buVar = new bu("NEW_USER", 0);
        f32778a = buVar;
        bu buVar2 = new bu("REROUTE", 1);
        f32779b = buVar2;
        bu buVar3 = new bu("USER_INITIATED", 2);
        f32780c = buVar3;
        bu buVar4 = new bu("TRIGGER_NOT_SET", 3);
        f32781d = buVar4;
        f32782e = new bu[]{buVar, buVar2, buVar3, buVar4};
    }

    public static bu[] values() {
        return (bu[]) f32782e.clone();
    }
}
