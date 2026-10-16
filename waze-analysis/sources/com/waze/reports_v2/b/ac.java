package com.waze.reports_v2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final ac f34014a;

    /* renamed from: b, reason: collision with root package name */
    public static final ac f34015b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ac[] f34016c;

    static {
        ac acVar = new ac("MALE", 0);
        f34014a = acVar;
        ac acVar2 = new ac("FEMALE", 1);
        f34015b = acVar2;
        ac[] acVarArr = {acVar, acVar2};
        f34016c = acVarArr;
        h.d.b.a(acVarArr);
    }

    public static ac[] values() {
        return (ac[]) f34016c.clone();
    }
}
