package com.waze.planned_drive;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    public static final bi f33253a;

    /* renamed from: b, reason: collision with root package name */
    public static final bi f33254b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ bi[] f33255c;

    static {
        bi biVar = new bi("HAS_PLANNED_DRIVES", 0);
        f33253a = biVar;
        bi biVar2 = new bi("NO_ACTIVE_PLANNED_DRIVES", 1);
        f33254b = biVar2;
        bi[] biVarArr = {biVar, biVar2};
        f33255c = biVarArr;
        h.d.b.a(biVarArr);
    }

    public static bi[] values() {
        return (bi[]) f33255c.clone();
    }
}
