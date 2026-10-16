package com.waze.navigate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cn {

    /* renamed from: a, reason: collision with root package name */
    public static final cn f31172a;

    /* renamed from: b, reason: collision with root package name */
    public static final cn f31173b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ cn[] f31174c;

    static {
        cn cnVar = new cn("START_NAVIGATION", 0);
        f31172a = cnVar;
        cn cnVar2 = new cn("SAVED_PLANNED_DRIVE", 1);
        f31173b = cnVar2;
        cn[] cnVarArr = {cnVar, cnVar2};
        f31174c = cnVarArr;
        h.d.b.a(cnVarArr);
    }

    public static cn[] values() {
        return (cn[]) f31174c.clone();
    }
}
