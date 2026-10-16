package com.waze.google_assistant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    public static final am f24104a;

    /* renamed from: b, reason: collision with root package name */
    public static final am f24105b;

    /* renamed from: c, reason: collision with root package name */
    public static final am f24106c;

    /* renamed from: d, reason: collision with root package name */
    public static final am f24107d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ am[] f24108e;

    static {
        am amVar = new am("CONFIRM", 0);
        f24104a = amVar;
        am amVar2 = new am("BACK", 1);
        f24105b = amVar2;
        am amVar3 = new am("DECLINED", 2);
        f24106c = amVar3;
        am amVar4 = new am("TAP_BG", 3);
        f24107d = amVar4;
        f24108e = new am[]{amVar, amVar2, amVar3, amVar4};
    }

    public static am[] values() {
        return (am[]) f24108e.clone();
    }
}
