package com.waze.an.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f14749a;

    /* renamed from: b, reason: collision with root package name */
    public static final ae f14750b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ae[] f14751c;

    static {
        ae aeVar = new ae("ALWAYS", 0);
        f14749a = aeVar;
        ae aeVar2 = new ae("WHEN_MAP_NOT_CENTERED", 1);
        f14750b = aeVar2;
        ae[] aeVarArr = {aeVar, aeVar2};
        f14751c = aeVarArr;
        h.d.b.a(aeVarArr);
    }

    public static ae[] values() {
        return (ae[]) f14751c.clone();
    }
}
