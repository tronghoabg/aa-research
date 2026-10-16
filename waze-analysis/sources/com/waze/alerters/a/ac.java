package com.waze.alerters.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final ac f14148a;

    /* renamed from: b, reason: collision with root package name */
    public static final ac f14149b;

    /* renamed from: c, reason: collision with root package name */
    public static final ac f14150c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ac[] f14151d;

    static {
        ac acVar = new ac("BeforeZone", 0);
        f14148a = acVar;
        ac acVar2 = new ac("InZone", 1);
        f14149b = acVar2;
        ac acVar3 = new ac("LeftZone", 2);
        f14150c = acVar3;
        ac[] acVarArr = {acVar, acVar2, acVar3};
        f14151d = acVarArr;
        h.d.b.a(acVarArr);
    }

    public static ac[] values() {
        return (ac[]) f14151d.clone();
    }
}
