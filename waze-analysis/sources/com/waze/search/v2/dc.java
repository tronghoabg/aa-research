package com.waze.search.v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public static final dc f36337a;

    /* renamed from: b, reason: collision with root package name */
    public static final dc f36338b;

    /* renamed from: c, reason: collision with root package name */
    public static final dc f36339c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ dc[] f36340d;

    static {
        dc dcVar = new dc("NeverDone", 0);
        f36337a = dcVar;
        dc dcVar2 = new dc("Ongoing", 1);
        f36338b = dcVar2;
        dc dcVar3 = new dc("Complete", 2);
        f36339c = dcVar3;
        dc[] dcVarArr = {dcVar, dcVar2, dcVar3};
        f36340d = dcVarArr;
        h.d.b.a(dcVarArr);
    }

    public static dc[] values() {
        return (dc[]) f36340d.clone();
    }
}
