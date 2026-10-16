package com.waze.navigate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ei {

    /* renamed from: a, reason: collision with root package name */
    public static final ei f31310a;

    /* renamed from: b, reason: collision with root package name */
    public static final ei f31311b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ei[] f31312c;

    static {
        ei eiVar = new ei("NotNavigating", 0);
        f31310a = eiVar;
        ei eiVar2 = new ei("Navigating", 1);
        f31311b = eiVar2;
        ei[] eiVarArr = {eiVar, eiVar2};
        f31312c = eiVarArr;
        h.d.b.a(eiVarArr);
    }

    public static ei[] values() {
        return (ei[]) f31312c.clone();
    }
}
