package com.waze.planned_drive;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public static final ca f33294a;

    /* renamed from: b, reason: collision with root package name */
    public static final ca f33295b;

    /* renamed from: c, reason: collision with root package name */
    public static final ca f33296c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ca[] f33297d;

    static {
        ca caVar = new ca("CONFIRM", 0);
        f33294a = caVar;
        ca caVar2 = new ca("CANCEL", 1);
        f33295b = caVar2;
        ca caVar3 = new ca("BACK", 2);
        f33296c = caVar3;
        ca[] caVarArr = {caVar, caVar2, caVar3};
        f33297d = caVarArr;
        h.d.b.a(caVarArr);
    }

    public static ca[] values() {
        return (ca[]) f33297d.clone();
    }
}
