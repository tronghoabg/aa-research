package com.waze.ui.alerter;

import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f41940a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f41941b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f41942c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f41943d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f41944e;

    static {
        a aVar = new a("NONE", 0);
        f41940a = aVar;
        a aVar2 = new a("TOP", 1);
        f41941b = aVar2;
        a aVar3 = new a("FIRST_BUTTON", 2);
        f41942c = aVar3;
        a aVar4 = new a("SECOND_BUTTON", 3);
        f41943d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f41944e = aVarArr;
        b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f41944e.clone();
    }
}
