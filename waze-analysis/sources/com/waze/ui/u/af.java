package com.waze.ui.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public static final af f43426a;

    /* renamed from: b, reason: collision with root package name */
    public static final af f43427b;

    /* renamed from: c, reason: collision with root package name */
    public static final af f43428c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ af[] f43429d;

    static {
        af afVar = new af("Regular", 0);
        f43426a = afVar;
        af afVar2 = new af("Light", 1);
        f43427b = afVar2;
        af afVar3 = new af("Heavy", 2);
        f43428c = afVar3;
        af[] afVarArr = {afVar, afVar2, afVar3};
        f43429d = afVarArr;
        h.d.b.a(afVarArr);
    }

    public static af[] values() {
        return (af[]) f43429d.clone();
    }
}
