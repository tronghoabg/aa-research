package com.waze.m;

import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25477a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f25478b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f25479c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f25480d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f25481e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f25482f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f25483g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ a[] f25484h;

    static {
        a aVar = new a("REGULAR", 0);
        f25477a = aVar;
        a aVar2 = new a("ALPHA", 1);
        f25478b = aVar2;
        a aVar3 = new a("BETA", 2);
        f25479c = aVar3;
        a aVar4 = new a("DEV", 3);
        f25480d = aVar4;
        a aVar5 = new a("PREBETA", 4);
        f25481e = aVar5;
        a aVar6 = new a("DOGFOOD", 5);
        f25482f = aVar6;
        a aVar7 = new a("FISHFOOD", 6);
        f25483g = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f25484h = aVarArr;
        b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f25484h.clone();
    }
}
