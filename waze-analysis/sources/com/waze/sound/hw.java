package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hw {

    /* renamed from: a, reason: collision with root package name */
    public static final hw f40204a;

    /* renamed from: b, reason: collision with root package name */
    public static final hw f40205b;

    /* renamed from: c, reason: collision with root package name */
    public static final hw f40206c;

    /* renamed from: d, reason: collision with root package name */
    public static final hw f40207d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ hw[] f40208e;

    static {
        hw hwVar = new hw("VOICE_INSTRUCTIONS_SOUND_UNSPECIFIED", 0);
        f40204a = hwVar;
        hw hwVar2 = new hw("SOUND_ON", 1);
        f40205b = hwVar2;
        hw hwVar3 = new hw("SOUND_OFF", 2);
        f40206c = hwVar3;
        hw hwVar4 = new hw("ALERTS_ONLY", 3);
        f40207d = hwVar4;
        hw[] hwVarArr = {hwVar, hwVar2, hwVar3, hwVar4};
        f40208e = hwVarArr;
        h.d.b.a(hwVarArr);
    }

    public static hw[] values() {
        return (hw[]) f40208e.clone();
    }
}
