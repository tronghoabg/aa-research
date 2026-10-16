package com.waze.bg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public static final ai f16324a;

    /* renamed from: b, reason: collision with root package name */
    public static final ai f16325b;

    /* renamed from: c, reason: collision with root package name */
    public static final ai f16326c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ai[] f16327d;

    static {
        ai aiVar = new ai("ALERT_REPORTING_INFO", 0);
        f16324a = aiVar;
        ai aiVar2 = new ai("CRASH_PRONE_INFO", 1);
        f16325b = aiVar2;
        ai aiVar3 = new ai("ADDITIONALINFO_NOT_SET", 2);
        f16326c = aiVar3;
        f16327d = new ai[]{aiVar, aiVar2, aiVar3};
    }

    public static ai[] values() {
        return (ai[]) f16327d.clone();
    }
}
