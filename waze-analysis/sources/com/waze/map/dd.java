package com.waze.map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    public static final dd f28745a;

    /* renamed from: b, reason: collision with root package name */
    public static final dd f28746b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ dd[] f28747c;

    static {
        dd ddVar = new dd("Regular", 0);
        f28745a = ddVar;
        dd ddVar2 = new dd("Editors", 1);
        f28746b = ddVar2;
        dd[] ddVarArr = {ddVar, ddVar2};
        f28747c = ddVarArr;
        h.d.b.a(ddVarArr);
    }

    public static dd[] values() {
        return (dd[]) f28747c.clone();
    }
}
