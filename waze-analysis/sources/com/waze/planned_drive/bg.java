package com.waze.planned_drive;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    public static final bg f33240a;

    /* renamed from: b, reason: collision with root package name */
    public static final bg f33241b;

    /* renamed from: c, reason: collision with root package name */
    public static final bg f33242c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ bg[] f33243d;

    static {
        bg bgVar = new bg("NOT_SHOWN", 0);
        f33240a = bgVar;
        bg bgVar2 = new bg("OFF", 1);
        f33241b = bgVar2;
        bg bgVar3 = new bg("ON", 2);
        f33242c = bgVar3;
        bg[] bgVarArr = {bgVar, bgVar2, bgVar3};
        f33243d = bgVarArr;
        h.d.b.a(bgVarArr);
    }

    public static bg[] values() {
        return (bg[]) f33243d.clone();
    }
}
