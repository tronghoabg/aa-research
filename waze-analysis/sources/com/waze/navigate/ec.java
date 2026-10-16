package com.waze.navigate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    public static final ec f31300a;

    /* renamed from: b, reason: collision with root package name */
    public static final ec f31301b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ec[] f31302c;

    static {
        ec ecVar = new ec("Online", 0);
        f31300a = ecVar;
        ec ecVar2 = new ec("Offline", 1);
        f31301b = ecVar2;
        ec[] ecVarArr = {ecVar, ecVar2};
        f31302c = ecVarArr;
        h.d.b.a(ecVarArr);
    }

    public static ec[] values() {
        return (ec[]) f31302c.clone();
    }
}
