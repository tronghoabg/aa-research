package com.waze.main_screen.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    public static final am f26115a;

    /* renamed from: b, reason: collision with root package name */
    public static final am f26116b;

    /* renamed from: c, reason: collision with root package name */
    public static final am f26117c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ am[] f26118d;

    static {
        am amVar = new am("FULL", 0);
        f26115a = amVar;
        am amVar2 = new am("COMPASS_ONLY", 1);
        f26116b = amVar2;
        am amVar3 = new am("HIDDEN", 2);
        f26117c = amVar3;
        am[] amVarArr = {amVar, amVar2, amVar3};
        f26118d = amVarArr;
        h.d.b.a(amVarArr);
    }

    public static am[] values() {
        return (am[]) f26118d.clone();
    }
}
