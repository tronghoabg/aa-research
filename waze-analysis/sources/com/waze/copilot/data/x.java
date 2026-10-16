package com.waze.copilot.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f23076a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f23077b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f23078c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f23079d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f23080e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ x[] f23081f;

    static {
        x xVar = new x("SUCCESS", 0);
        f23076a = xVar;
        x xVar2 = new x("SERVER_ERROR", 1);
        f23077b = xVar2;
        x xVar3 = new x("STATUS_UNSPECIFIED", 2);
        f23078c = xVar3;
        x xVar4 = new x("UNAVAILABLE", 3);
        f23079d = xVar4;
        x xVar5 = new x("NOT_FOUND", 4);
        f23080e = xVar5;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5};
        f23081f = xVarArr;
        h.d.b.a(xVarArr);
    }

    public static x[] values() {
        return (x[]) f23081f.clone();
    }
}
