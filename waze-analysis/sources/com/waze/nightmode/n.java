package com.waze.nightmode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f32480a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f32481b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f32482c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ n[] f32483d;

    static {
        n nVar = new n("NIGHT", 0);
        f32480a = nVar;
        n nVar2 = new n("DAY", 1);
        f32481b = nVar2;
        n nVar3 = new n("DAYTIME", 2);
        f32482c = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        f32483d = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f32483d.clone();
    }
}
