package com.waze.map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    public static final cv f28707a;

    /* renamed from: b, reason: collision with root package name */
    public static final cv f28708b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ cv[] f28709c;

    static {
        cv cvVar = new cv("GenericCanvas", 0);
        f28707a = cvVar;
        cv cvVar2 = new cv("WazeMap", 1);
        f28708b = cvVar2;
        cv[] cvVarArr = {cvVar, cvVar2};
        f28709c = cvVarArr;
        h.d.b.a(cvVarArr);
    }

    public static cv[] values() {
        return (cv[]) f28709c.clone();
    }
}
