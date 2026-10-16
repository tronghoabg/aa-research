package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f40411a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f40412b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ o[] f40413c;

    static {
        o oVar = new o("START_AT_DISTANCE", 0);
        f40411a = oVar;
        o oVar2 = new o("FINISH_BY_DISTANCE", 1);
        f40412b = oVar2;
        o[] oVarArr = {oVar, oVar2};
        f40413c = oVarArr;
        h.d.b.a(oVarArr);
    }

    public static o[] values() {
        return (o[]) f40413c.clone();
    }
}
