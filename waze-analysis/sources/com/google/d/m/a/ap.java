package com.google.d.m.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ap {

    /* renamed from: a, reason: collision with root package name */
    public static final ap f7998a;

    /* renamed from: b, reason: collision with root package name */
    public static final ap f7999b;

    /* renamed from: c, reason: collision with root package name */
    public static final ap f8000c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ap[] f8001d;

    static {
        ap apVar = new ap("NOT_RUN", 0);
        f7998a = apVar;
        ap apVar2 = new ap("CANCELLED", 1);
        f7999b = apVar2;
        ap apVar3 = new ap("STARTED", 2);
        f8000c = apVar3;
        f8001d = new ap[]{apVar, apVar2, apVar3};
    }

    public static ap[] values() {
        return (ap[]) f8001d.clone();
    }
}
