package com.waze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cb {

    /* renamed from: a, reason: collision with root package name */
    public static final cb f22055a;

    /* renamed from: b, reason: collision with root package name */
    public static final cb f22056b;

    /* renamed from: c, reason: collision with root package name */
    public static final cb f22057c;

    /* renamed from: d, reason: collision with root package name */
    public static final cb f22058d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cb[] f22059e;

    static {
        cb cbVar = new cb("AwaitingOsSplashToFinish", 0);
        f22055a = cbVar;
        cb cbVar2 = new cb("Preparing", 1);
        f22056b = cbVar2;
        cb cbVar3 = new cb("Running", 2);
        f22057c = cbVar3;
        cb cbVar4 = new cb("Done", 3);
        f22058d = cbVar4;
        cb[] cbVarArr = {cbVar, cbVar2, cbVar3, cbVar4};
        f22059e = cbVarArr;
        h.d.b.a(cbVarArr);
    }

    public static cb[] values() {
        return (cb[]) f22059e.clone();
    }
}
