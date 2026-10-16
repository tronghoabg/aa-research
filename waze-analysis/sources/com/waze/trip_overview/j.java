package com.waze.trip_overview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f41480a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f41481b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ j[] f41482c;

    static {
        j jVar = new j("START_NAVIGATION", 0);
        f41480a = jVar;
        j jVar2 = new j("SAVED_PLANNED_DRIVE", 1);
        f41481b = jVar2;
        j[] jVarArr = {jVar, jVar2};
        f41482c = jVarArr;
        h.d.b.a(jVarArr);
    }

    public static j a(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f41482c.clone();
    }
}
