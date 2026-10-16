package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f4317a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f4318b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f4319c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e[] f4320d;

    static {
        e eVar = new e("NETWORK_UNMETERED", 0);
        f4317a = eVar;
        e eVar2 = new e("DEVICE_IDLE", 1);
        f4318b = eVar2;
        e eVar3 = new e("DEVICE_CHARGING", 2);
        f4319c = eVar3;
        f4320d = new e[]{eVar, eVar2, eVar3};
    }

    public static e[] values() {
        return (e[]) f4320d.clone();
    }
}
