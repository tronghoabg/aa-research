package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f44723a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f44724b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f44725c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f44726d;

    static {
        b bVar = new b("WAZE_ONBOARDING", 0);
        f44723a = bVar;
        b bVar2 = new b("SETTINGS", 1);
        f44724b = bVar2;
        b bVar3 = new b("EXISTING_USER", 2);
        f44725c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f44726d = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f44726d.clone();
    }
}
