package com.waze.modules.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f30033a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f30034b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f30035c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f30036d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f30037e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f30038f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ d[] f30039g;

    static {
        d dVar = new d("Unspecified", 0);
        f30033a = dVar;
        d dVar2 = new d("UnreachableDestinationLong", 1);
        f30034b = dVar2;
        d dVar3 = new d("UnavailablePreferredRoute", 2);
        f30035c = dVar3;
        d dVar4 = new d("UnavailableNaturalRoute", 3);
        f30036d = dVar4;
        d dVar5 = new d("LongerDriveTime", 4);
        f30037e = dVar5;
        d dVar6 = new d("UnreachableDestinationShort", 5);
        f30038f = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        f30039g = dVarArr;
        h.d.b.a(dVarArr);
    }

    public static d[] values() {
        return (d[]) f30039g.clone();
    }
}
