package com.waze.map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    public static final bi f28398a;

    /* renamed from: b, reason: collision with root package name */
    public static final bi f28399b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ bi[] f28400c;

    static {
        bi biVar = new bi("Small", 0);
        f28398a = biVar;
        bi biVar2 = new bi("Large", 1);
        f28399b = biVar2;
        bi[] biVarArr = {biVar, biVar2};
        f28400c = biVarArr;
        h.d.b.a(biVarArr);
    }

    public static bi[] values() {
        return (bi[]) f28400c.clone();
    }
}
