package com.waze.main_screen.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f27676a;

    /* renamed from: b, reason: collision with root package name */
    public static final ae f27677b;

    /* renamed from: c, reason: collision with root package name */
    public static final ae f27678c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ae[] f27679d;

    static {
        ae aeVar = new ae("NONE", 0);
        f27676a = aeVar;
        ae aeVar2 = new ae("TIMER", 1);
        f27677b = aeVar2;
        ae aeVar3 = new ae("ROAMING_TIMEOUT", 2);
        f27678c = aeVar3;
        ae[] aeVarArr = {aeVar, aeVar2, aeVar3};
        f27679d = aeVarArr;
        h.d.b.a(aeVarArr);
    }

    public static ae[] values() {
        return (ae[]) f27679d.clone();
    }
}
