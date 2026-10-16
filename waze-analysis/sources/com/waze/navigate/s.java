package com.waze.navigate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f31803a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f31804b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f31805c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f31806d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f31807e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ s[] f31808f;

    static {
        s sVar = new s("Unknown", 0);
        f31803a = sVar;
        s sVar2 = new s("Open", 1);
        f31804b = sVar2;
        s sVar3 = new s("Close", 2);
        f31805c = sVar3;
        s sVar4 = new s("Closing", 3);
        f31806d = sVar4;
        s sVar5 = new s("OpenAlways", 4);
        f31807e = sVar5;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5};
        f31808f = sVarArr;
        h.d.b.a(sVarArr);
    }

    public static s[] values() {
        return (s[]) f31808f.clone();
    }
}
