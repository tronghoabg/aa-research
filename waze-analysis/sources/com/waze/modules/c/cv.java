package com.waze.modules.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    public static final cv f30013a;

    /* renamed from: b, reason: collision with root package name */
    public static final cv f30014b;

    /* renamed from: c, reason: collision with root package name */
    public static final cv f30015c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cv[] f30016d;

    static {
        cv cvVar = new cv("Unspecified", 0);
        f30013a = cvVar;
        cv cvVar2 = new cv("Closures", 1);
        f30014b = cvVar2;
        cv cvVar3 = new cv("Events", 2);
        f30015c = cvVar3;
        cv[] cvVarArr = {cvVar, cvVar2, cvVar3};
        f30016d = cvVarArr;
        h.d.b.a(cvVarArr);
    }

    public static cv[] values() {
        return (cv[]) f30016d.clone();
    }
}
