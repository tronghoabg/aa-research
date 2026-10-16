package com.waze.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class du {

    /* renamed from: a, reason: collision with root package name */
    public static final du f37086a;

    /* renamed from: b, reason: collision with root package name */
    public static final du f37087b;

    /* renamed from: c, reason: collision with root package name */
    public static final du f37088c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ du[] f37089d;

    static {
        du duVar = new du("EMPTY", 0);
        f37086a = duVar;
        du duVar2 = new du("UNVERIFIED", 1);
        f37087b = duVar2;
        du duVar3 = new du("VERIFIED", 2);
        f37088c = duVar3;
        du[] duVarArr = {duVar, duVar2, duVar3};
        f37089d = duVarArr;
        h.d.b.a(duVarArr);
    }

    public static du[] values() {
        return (du[]) f37089d.clone();
    }
}
